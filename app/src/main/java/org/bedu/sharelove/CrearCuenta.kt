package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_crear_cuenta.*


class CrearCuenta : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var boton2: Button

    private lateinit var txtCorreo: TextView
    private lateinit var txtPass: TextView
    private lateinit var txtNombre: TextView
    private lateinit var txtTelefono: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

        txtCorreo = findViewById(R.id.textCorreo)
        txtPass = findViewById(R.id.textPass)
        txtNombre = findViewById(R.id.textNombre)
        txtTelefono = findViewById(R.id.textTelefono)
        boton = findViewById(R.id.btnRegresarInicio)
        boton.setOnClickListener {

            startActivity(Intent(this, MainActivity::class.java))
        }

        boton2 = findViewById(R.id.btnCrearC)
        boton2.setOnClickListener {
            CrearCuenta()
        }
    }

    private fun CrearCuenta() {
        val correo: String = textCorreo.getText().toString()
        val pass: String = textPass.getText().toString()
        val nombre: String = textNombre.getText().toString()
        val telefono: String = textTelefono.getText().toString()

        when {
            correo.length == 0 && pass.length == 0 && nombre.length == 0 && telefono.length == 0-> {
                Toast.makeText(this, "Los campos no pueden estar vacios", Toast.LENGTH_LONG).show()
            }
            pass.length == 0 -> {
                Toast.makeText(this, "Debes ingresar una contraseña", Toast.LENGTH_LONG).show()
            }
            correo.length == 0 -> {
                Toast.makeText(this, "Debes ingresar un correo", Toast.LENGTH_LONG).show()
            }
            nombre.length == 0 -> {
                Toast.makeText(this, "Debes ingresar una nombre", Toast.LENGTH_LONG).show()
            }
            telefono.length == 0 -> {
                Toast.makeText(this, "Debes ingresar un telefono", Toast.LENGTH_LONG).show()
            }
            correo.length != 0 || pass.length != 0 || nombre.length != 0 || telefono.length == 0 -> {
                Toast.makeText(this,"Te enviamos un correo para que puedas acceder", Toast.LENGTH_LONG).show()
                startActivity(Intent(this, MainActivity::class.java))
            }


        }
    }



}