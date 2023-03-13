
<br>
<h1 align="center">
    TRABAJO DE RECUPERACION<br>
    <br>
    Desarrollo de un login 
</h1>
<br>

<p align="center"><b>Elaborado por:</b> Miguel Eduardo Cuenca Chamba</p>
<br>

<!-- TABLA DE CONTENIDO -->
<details>
    <summary><b>Tabla de contenido</b></summary>
    <br>
  <ol>
      <li>
      <a href="#Descripcion">Descripcion</a>
    </li>
    <li>
      <a href="#descarga-e-instalación-del-trabajo">Descarga e instalación del trabajo</a>
    </li>
    <li>
      <a href="#perfiles-de-usuario">Perfiles de usuario</a>
      <ul>
        <li><a href="#funcionalidades-del-usuario-administrador">Funcionalidades del usuario administrador</a></li>
        <li><a href="#funcionalidades-del-usuario-cliente">Funcionalidades del usuario cliente</a></li>
        <li><a href="#funcionalidades-del-usuario-cocinero">Funcionalidades del usuario cocinero</a></li>
      </ul>
    </li>
    <li>
      <a href="#acceso-al-componente-backend">Acceso al componente backend</a>
    </li>
    <li>
        <a href="#video-explicativo-del-funcionamiento">Video explicativo del funcionamiento</a>
     </li>
  </ol>
</details>

<br>

# Descripcion

En el desarrollo de aplicaciones móviles, uno de los aspectos más importantes es la autenticación de usuarios mediante un sistema de login. Existen diversas herramientas y tecnologías para desarrollar esta funcionalidad, entre las cuales destacan Flutter, Xamarin, Android Nativo e Ionic. A continuación, se realizará una comparación entre estas cuatro opciones en el desarrollo de un login.
<br>

# Descarga e instalación del trabajo

 1. Para la instalación del trabajo debemos descargar el archivo .zip, desde el repositorio.

 2. Una ves descargado el proyecto, los descoprimimos y desde la carpeta del proyecto vamos a tener 4 carpetas con su respectivo login.

 3. De acuerdo a las herramientas podemos usar Visual Estduio Code, Android Studio o Visual estudio para xamarin.

    ```
    npm install
    ```

  4. Para ejecutar el proyecto de manera local se debe ejecutar el siguiente comando:

     ```
     npm run dev
     ```
   5. Bien echo, ahora tienes el proyecto ejecutandose y funcionando correctamente. Se nos presentara una imagen como la siguiente:

        <br>
        <p align="center">
            <a>
                <img src="https://i.ibb.co/YQQJjTj/Whats-App-Image-2023-03-06-at-02-10-15.jpg" alt="Logo" width="700" height="200">
            </a>
         </p>
        <br>
        
   5. Para poder entrar a la documentacion es necesario agregar ```/docs```:

        <br>
        <p align="center">
            <a>
                <img src="https://i.ibb.co/X3wQ12T/Whats-App-Image-2023-03-06-at-02-17-42.jpg" width="700" height="500">
            </a>
         </p>
        <br>
        

      

# Perfiles de usuario

Los perfiles de usuario que maneja el sistema son: 

<br>
<p align="center">
    <a>
        <img src="https://scontent.fuio10-1.fna.fbcdn.net/v/t1.15752-9/331631871_1003418617711629_5092243518265142120_n.png?_nc_cat=107&ccb=1-7&_nc_sid=ae9488&_nc_eui2=AeGeUg3FFKU-nliCq0uJ-Q_2Jc29PPqJjB8lzb08-omMH2IA2XHv3Aa9HZf4RUv4aSD13p1BjiKLYKEiMtFIT6fD&_nc_ohc=JdL1_Yo86nkAX_-JRYM&_nc_ht=scontent.fuio10-1.fna&oh=03_AdTK1cESetSjUj1dvdQzAAzJY23QGsn_bFAq9JyHVTrDiQ&oe=641CCBE4" alt="Logo" width="700"         height="400">
    </a>
 </p>
<br>

### Funcionalidades del usuario ADMINISTRADOR

Como parte de las funcionalidades a las que puede acceder el usuario superadministrador se tienen:
<br>
<ul>
    <li>Iniciar sesión en el sistema.</li>
    <li>Modificar su perfil</li>
    <li>Generar usuarios cocineros.</li>
    <li>Gestionar el menú de los almuerzos.</li>
    <li>Visualizar el pedido y la factura pagada.</li>
    <li>Crear al perfil cocinero.</li>
</ul>
<br>

### Funcionalidades del usuario CLIENTE

Las funcionalidades a las que puede acceder el usuario administrador son:
<br>
<ul>
    <li>Registrarse.</li>
    <li>Iniciar sesión en el sistema.</li>
    <li>Modificar su perfil.</li>
    <li>Gestionar pedido.</li>
    <li>Confirmar el pedido y cargar el comprobante de pago.</li>        
    <li>Visualizar el estado del pedido.</li>
</ul>
<br>

### Funcionalidades del usuario COCINERO

Las funcionalidades a las que puede acceder el usuario administrador son:
<br>
<ul>
    <li>Iniciar sesión en el sistema.</li>
    <li>Modificar su perfil.</li>
    <li>Visualizar los pedidos asignados.</li>
    <li>Cambiar el estado de los pedidos.</li>        
</ul>
<br>

# Acceso al componente backend

El acceso al sistema web se lo realiza a través del siguiente enlace.
<br>
<p align="center"><a href="https://app-cafeteriacackend.herokuapp.com/docs/" target="_blank"><strong>Acceso al sistema web »</strong></a></p>
<br>

 # Video explicativo del funcionamiento

En el video a continuación se presenta la explicación a detalle de este componente.
<br>
<p align="center"><a href="https://www.youtube.com/watch?v=Oh3jnjLdypo" target="_blank"><strong>Video explicativo »</strong></a></p>

Flutter
Flutter es un framework de código abierto desarrollado por Google para crear aplicaciones móviles para Android e iOS con un solo código base. Algunas de las ventajas de utilizar Flutter para el desarrollo de un login son:

Rendimiento: Flutter utiliza su propio motor de renderizado, lo que le permite tener un alto rendimiento en la renderización de elementos de la interfaz de usuario.
Personalización: Flutter permite personalizar la apariencia del login utilizando widgets personalizados o creando nuevos widgets desde cero.
Facilidad de implementación: Flutter ofrece una gran cantidad de widgets predefinidos, lo que facilita la implementación de la interfaz de usuario del login.
Hot Reload: Flutter cuenta con la función de Hot Reload, lo que permite realizar cambios en el código y visualizar los resultados en tiempo real.
Xamarin
Xamarin es una plataforma de desarrollo móvil que permite crear aplicaciones nativas para iOS, Android y Windows Phone utilizando el lenguaje de programación C#. Algunas de las ventajas de utilizar Xamarin para el desarrollo de un login son:

Compartición de código: Xamarin permite compartir el código entre las diferentes plataformas, lo que reduce el tiempo y costo de desarrollo.
Acceso nativo a API: Xamarin permite acceder a las API nativas de cada plataforma, lo que permite utilizar todas las funcionalidades del dispositivo en el login.
Visual Studio: Xamarin se integra perfectamente con Visual Studio, lo que permite una mayor productividad en el desarrollo.
Android Nativo
Android Nativo es el desarrollo de aplicaciones móviles para la plataforma Android utilizando el lenguaje de programación Java o Kotlin. Algunas de las ventajas de utilizar Android Nativo para el desarrollo de un login son:

Acceso completo a las API nativas: Android Nativo permite acceder a todas las API nativas de Android, lo que permite utilizar todas las funcionalidades del dispositivo en el login.
Rendimiento: Las aplicaciones desarrolladas en Android Nativo tienen un alto rendimiento debido a que se ejecutan directamente en la plataforma Android.
Gran comunidad de desarrolladores: Existe una gran comunidad de desarrolladores de Android Nativo, lo que facilita la resolución de problemas y la obtención de información.
Ionic
Ionic es un framework de desarrollo de aplicaciones móviles que utiliza tecnologías web como HTML, CSS y JavaScript. Algunas de las ventajas de utilizar Ionic para el desarrollo de un login son:

Multiplataforma: Ionic permite desarrollar aplicaciones para Android e iOS utilizando el mismo código base.
Facilidad de desarrollo: Ionic utiliza tecnologías web, lo que permite a los desarrolladores web crear aplicaciones móviles sin la necesidad de aprender un nuevo lenguaje de programación.
Gran cantidad de plugins: Ionic cuenta con una gran cantidad de plugins que permiten utilizar las funcionalidades del dispositivo en la aplicación.
