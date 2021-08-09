package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.ImageButton

class Menu : AppCompatActivity() {

    private lateinit var botonArticulo: ImageButton
    private lateinit var botonComida: ImageButton


    private lateinit var boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        botonArticulo = findViewById(R.id.imgButtonVerArticulos)
        botonComida = findViewById(R.id.imgButtonVerComida)

        botonArticulo.setOnClickListener {

            startActivity(Intent(this, Articulos::class.java))
        }

        botonComida.setOnClickListener {

            startActivity(Intent(this, Comida::class.java))
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menuaction, menu)
        return super.onCreateOptionsMenu(menu)
    }

}