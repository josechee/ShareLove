package org.bedu.sharelove

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var boton2: Button
    private lateinit var boton3: TextView
    private lateinit var inputCorreo: TextView
    private lateinit var inputPass: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputCorreo = findViewById(R.id.txtCorreo)
        inputPass = findViewById(R.id.txtPassword)

        boton = findViewById(R.id.btnCrearCuenta)
        boton.setOnClickListener {

            startActivity(Intent(this, CrearCuenta::class.java))
        }
        boton2 = findViewById(R.id.btnCrearC)
        boton2.setOnClickListener {
            registrar()
        }
        boton3 = findViewById(R.id.btnRecuperarPass)
        boton3.setOnClickListener {
            startActivity(Intent(this, RecuperarContrasena::class.java))
        }
    }

    private fun registrar() {
        val correo: String = inputCorreo.getText().toString()
        val pass: String = inputPass.getText().toString()

        when {
            correo.length == 0 && pass.length == 0 -> {
                Toast.makeText(this,"Los campos no pueden estar vacios", Toast.LENGTH_LONG).show()
            }
            pass.length == 0 -> {
                Toast.makeText(this,"Debes ingresar una contraseña", Toast.LENGTH_LONG).show()
            }
            correo.length == 0 -> {
                Toast.makeText(this,"Debes ingresar un correo", Toast.LENGTH_LONG).show()
            }
            correo != "usuario@gmail.com" || pass != "1234" -> {
                Toast.makeText(this, "Los datos no son validos", Toast.LENGTH_LONG).show()
            }
            correo == "usuario@gmail.com" && pass == "1234" -> {
                Toast.makeText(this,"Hola de nuevo!!", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, VistaPrincipal::class.java))

            }
        }

    }


}
