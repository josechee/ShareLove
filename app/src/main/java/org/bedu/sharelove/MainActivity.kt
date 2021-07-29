package org.bedu.sharelove

<<<<<<< HEAD
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

        boton = findViewById(R.id.crear_cuenta)
        boton.setOnClickListener {

            startActivity(Intent(this, CrearCuenta::class.java))
        }
        boton2 = findViewById(R.id.buttonIniciarSesion)
        boton2.setOnClickListener {

            startActivity(Intent(this, Menu::class.java))
        }
        boton3 = findViewById(R.id.olvidaste_contraseña)
        boton3.setOnClickListener {

            startActivity(Intent(this, RecuperarContrasena::class.java))
        }
    }

}
=======
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
>>>>>>> 31bf92d3b364a1baceba9c72b4f1233e843b39aa
