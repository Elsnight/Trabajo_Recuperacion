package com.test.loginklotin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.loginklotin.databinding.ActivityPerfilBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPerfilBinding
    lateinit var firebaseAuth: FirebaseAuth
    private lateinit var db: FirebaseFirestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = Firebase.auth
        val user = firebaseAuth.currentUser
        val uid = user!!.uid

        firebaseAuth = FirebaseAuth.getInstance()
        db = FirebaseFirestore.getInstance()



        binding.singout.setOnClickListener {
            db.collection("coord").document(uid).delete()
            firebaseAuth.signOut()
            val intent = Intent(this, SingInActivity::class.java)
            startActivity(intent)
            finish()
        }




    }
}
