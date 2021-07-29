package org.bedu.sharelove

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var boton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     boton = findViewById(R.id.crear_cuenta)
        boton.setOnClickListener( View.OnClickListener() {

            startActivity(Intent(this, CrearCuenta::class.java))
        });
}

}
