package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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

            startActivity(Intent(this, VistaPrincipal::class.java))
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menuaction, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item_contact: MenuItem): Boolean {

        when(item_contact.itemId) {
            R.id.buttonBack -> startActivity(Intent(this, VistaPrincipal::class.java))
            R.id.buttonRopa -> startActivity(Intent(this, Articulos::class.java))
            R.id.buttonFood -> startActivity(Intent(this, Comida::class.java))
            R.id.buttonShearch -> startActivity(Intent(this, VistaPrincipal::class.java))

        }

        return super.onOptionsItemSelected(item_contact)
    }
}