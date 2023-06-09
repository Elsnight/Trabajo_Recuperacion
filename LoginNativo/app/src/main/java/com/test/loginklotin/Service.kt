package com.test.loginklotin

import android.annotation.SuppressLint
import android.app.Service
import android.content.ContentValues
import android.content.Intent
import android.os.Handler
import android.os.IBinder
import android.service.controls.ControlsProviderService.TAG
import android.util.Log
import android.widget.Toast
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Service : Service() {

    private lateinit var fusedLocationClient : FusedLocationProviderClient
    private lateinit var auth: FirebaseAuth
    private lateinit var db: FirebaseFirestore
    private var Errores : Int = 0
    val handler = Handler()


    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        auth = Firebase.auth
        var contador = 0;


        handler.apply {
                    val runeable = object :Runnable
                    {
                        override fun run() {
                            contador ++
                            leerubicacionactual()
                            Log.d(TAG,"Acesso: $contador")
                            postDelayed(this, 5000)
                        }

                    }
                    postDelayed(runeable, 5000)
                }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {

        Toast.makeText(this, "Se cancelo la Geolocalizacion en segundo plano", Toast.LENGTH_SHORT).show()

        handler.removeCallbacksAndMessages(null)

        super.onDestroy()
    }


    private fun leerubicacionactual() {

         getLocations()

    }

    @SuppressLint("MissingPermission")
    private fun getLocations() {

        fusedLocationClient.lastLocation.addOnSuccessListener{
            if(it==null)
            {
                Toast.makeText(this, "No pudimos obtener localizacion", Toast.LENGTH_SHORT).show()

                Errores ++


                if(Errores == 3){
                    Toast.makeText(this, "Active la localizacion todo el tiempo", Toast.LENGTH_SHORT).show()
                    handler.removeCallbacksAndMessages(null)
                }

            }else it.apply {
                val latitud = it.latitude
                val longitud = it.longitude

                almacenardatos(latitud, longitud)



            }

        }
    }

    private fun almacenardatos(latitud: Double, longitud: Double) {
        val user = auth.currentUser
        val uid = user!!.uid
        var nickname: String


        val db = Firebase.firestore

        val  docRef = db.collection("user").document(uid)

        docRef.get().addOnSuccessListener { document ->
            if(document != null)
            {
                nickname = "${document.get("NickName") as String?}"


                db.collection("coord").document(uid).set(
                    hashMapOf(
                        "NickName" to nickname,
                        "Latitud" to latitud,
                        "Longitud" to longitud,
                    )
                ).addOnSuccessListener {
                }
                    .addOnFailureListener {
                        Toast.makeText(
                            this,
                            "Fallo al guardar la informacion",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
            }
        } .addOnFailureListener { exception ->
            Log.w(ContentValues.TAG, "Error al leer la base de datos.", exception)
        }


    }





}