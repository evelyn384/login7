package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val USUARIO_REGISTRADO ="Evelyn"
    val PASS_USUARIO ="hola123"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIngresar.setOnClickListener {
            //obteniendo los datos de la vista
            val usuario = editTextUsuario.text.toString()
            val pass = editTextUsuario.text.toString()

            if(!cadenaVacia (usuario) and !cadenaVacia (pass)){
                if (verificarDatos(usuario,pass)){
                    mensaje("Bienvenido")
                }else{
                    mensaje("Datos Incorrectos")
                }
            }else{
                mensaje("Datos Vacios")
            }
        }
    }

    fun verificarDatos(usuario:String, pass:String):Boolean{
        return usuario.equals(USUARIO_REGISTRADO) and pass.equals(PASS_USUARIO)
    }
    /*
    Metodo que nos ayuda a mostar el toasts
     */
    fun mensaje(mensaje:String){
        Toast.makeText(this,mensaje,Toast.LENGTH_LONG).show()
    }
    /*
    Verificar que una cadena este vacia
     */
    fun cadenaVacia(cadenaVerificar:String):Boolean{
        return cadenaVerificar.isEmpty()
    }
    /*
    *Leer usuario
    * leer contraseña
    * verificar que no esten vacios
    * comparar el usuario con un usuario permitido
    * comparar la contraseña con la contraseña del usuario
    * si los datos son correctos damos un mensaje de bienvenida
    * de lo contrario, pediomos nuevamente los datos.
     */
}
