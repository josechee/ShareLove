package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Articulos : AppCompatActivity() {

    private lateinit var botonComida: ImageButton
    private lateinit var botonMenuPrincipal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_articulos)

        botonComida = findViewById(R.id.imgButtonComidaEnArticulos)
        botonMenuPrincipal = findViewById(R.id.buttonArticuloMenuPrincipal)

        botonComida.setOnClickListener {

            startActivity(Intent(this, Comida::class.java))
        }

        botonMenuPrincipal.setOnClickListener {

            startActivity(Intent(this, Menu::class.java))
        }
    }
}