package org.bedu.sharelove

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_vistaprincipal.view.*
import org.bedu.themes.MainFragment

class VistaPrincipal : AppCompatActivity() {

    private lateinit var botonArticulo: ImageButton
    private lateinit var botonComida: ImageButton


    private lateinit var boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vistaprincipal)
        val appBar = findViewById<Toolbar>(R.id.app_bar)
        this.setSupportActionBar(appBar)

        setupDrawer(appBar)
        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, MainFragment())
                .commit()
        }
//        botonArticulo = findViewById(R.id.imgButtonVerArticulos)
//        botonComida = findViewById(R.id.imgButtonVerComida)

//        botonArticulo.setOnClickListener {
//
//            startActivity(Intent(this, Articulos::class.java))
//        }
//
//        botonComida.setOnClickListener {
//
//            startActivity(Intent(this, Comida::class.java))
//        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)


    }
    private fun setupDrawer(toolbar: Toolbar){
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer)
    }
    override fun onOptionsItemSelected(item_contact: MenuItem): Boolean {
        var msg = ""

        when(item_contact.itemId){
            R.id.shirt -> startActivity(Intent(this, Articulos::class.java))
            R.id.food -> startActivity(Intent(this, Comida::class.java))
            R.id.notificacion -> msg=getString(R.string.drawer_notificacion)
        }

        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show()
        return super.onOptionsItemSelected(item_contact)
    }



}
