package org.bedu.sharelove

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import org.bedu.sesion5.DetailActivity
import org.bedu.sharelove.databinding.ActivityMainBinding


class VistaPrincipal : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


////    private lateinit var botonComida: ImageButton
//    private lateinit var appBarConfiguration: AppBarConfiguration
//    private lateinit var binding: ActivityMainBinding
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var botonArticulo: Button



//    private lateinit var boton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_vistaprincipal)

    val toolbar: Toolbar = findViewById(R.id.app_bar)
    val appBar = findViewById<Toolbar>(R.id.app_bar)
    this.setSupportActionBar(appBar)


//    botonArticulo = findViewById(R.id.Vermas)
//    botonArticulo.setOnClickListener {
//        startActivity(Intent(this, DetailActivity::class.java))
//
//
//    }


    setSupportActionBar(toolbar)
    drawer = findViewById(R.id.drawer_layout)
    toggle = ActionBarDrawerToggle(
        this,
        drawer,
        toolbar,
        R.string.navigation_drawer_open,
        R.string.navigation_drawer_close
    )
    drawer.addDrawerListener(toggle)
    setupDrawer(appBar)

    if (savedInstanceState == null) {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, MainFragment())
            .commit()


    }
    supportActionBar?.setDisplayHomeAsUpEnabled(true)
    supportActionBar?.setHomeButtonEnabled(true)

    val navigationView: NavigationView = findViewById(R.id.nav_view)
    navigationView.setNavigationItemSelectedListener(this)

}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return super.onCreateOptionsMenu(menu)


    }
    private fun setupDrawer(toolbar: Toolbar){
        val drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_drawer,R.string.close_drawer)
    }
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        if (toggle.onOptionsItemSelected(item)){
//            return true
//        }
//        return super.onOptionsItemSelected(item)
//    }


    override fun onOptionsItemSelected(item_contact: MenuItem): Boolean {

        when(item_contact.itemId) {
            R.id.shirt -> startActivity(Intent(this, Articulos::class.java))
            R.id.food -> startActivity(Intent(this, Comida::class.java))
            R.id.notificacion -> startActivity(Intent(this, Compartiendo::class.java))

        }

        return super.onOptionsItemSelected(item_contact)
    }

    override fun onNavigationItemSelected(item_contact: MenuItem): Boolean {
        when (item_contact.itemId) {
            R.id.nav_home -> startActivity(Intent(this, Perfil::class.java))
        }
        drawer.closeDrawer(GravityCompat.START)
        return true

    }
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        toggle.syncState()
    }
    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }


}

//    private lateinit var appBarConfiguration: AppBarConfiguration
//    private lateinit var binding: ActivityNavigatDrawerBinding
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        binding = ActivityNavigatDrawerBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        setSupportActionBar(binding.appBarNavigatDrawer.toolbar)
//
//        binding.appBarNavigatDrawer.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
//        val drawerLayout: DrawerLayout = binding.drawerLayout
//        val navView: NavigationView = binding.navView
//        val navController = findNavController(R.id.nav_host_fragment_content_navigat_drawer)
//        // Passing each menu ID as a set of Ids because each
//        // menu should be considered as top level destinations.
//        appBarConfiguration = AppBarConfiguration(
//            setOf(
//                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
//            ), drawerLayout
//        )
//        setupActionBarWithNavController(navController, appBarConfiguration)
//        navView.setupWithNavController(navController)
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.navigat_drawer, menu)
//        return true
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_navigat_drawer)
//        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
//    }
//}





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