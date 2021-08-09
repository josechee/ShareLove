package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Comida : AppCompatActivity() {

    private lateinit var botonArticulo: ImageButton
    private lateinit var botonMenuPrincipal: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida)

        botonArticulo = findViewById(R.id.imgButtonArticulo)
        botonMenuPrincipal = findViewById(R.id.buttonComidaMenuPrincipal)

        botonArticulo.setOnClickListener {

            startActivity(Intent(this, Articulos::class.java))
        }

        botonMenuPrincipal.setOnClickListener {

            startActivity(Intent(this, Menu::class.java))
        }

    }
    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menuaction, menu)
        return super.onCreateOptionsMenu(menu)
    }
}