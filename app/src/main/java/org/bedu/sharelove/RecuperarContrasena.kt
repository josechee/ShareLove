package org.bedu.sharelove

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button





class RecuperarContrasena : AppCompatActivity() {

    private lateinit var btnRecuperar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contrasena)
    }
}