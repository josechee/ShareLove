package org.bedu.sharelove

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button
    private lateinit var boton2: Button
    private lateinit var boton3: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton = findViewById(R.id.BtnCrearCuenta)
        boton.setOnClickListener {

            startActivity(Intent(this, CrearCuenta::class.java))
        }
        boton2 = findViewById(R.id.buttonIniciarSesion)
        boton2.setOnClickListener {

            startActivity(Intent(this, VistaPrincipal::class.java))
        }
        boton3 = findViewById(R.id.ButtonRecuperarPass)
        boton3.setOnClickListener {

            startActivity(Intent(this, RecuperarContrasena::class.java))
        }
    }

}
