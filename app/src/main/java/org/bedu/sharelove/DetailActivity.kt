package org.bedu.sesion5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.bedu.sharelove.DetailFragment
import org.bedu.sharelove.Product
import org.bedu.sharelove.R

class DetailActivity : AppCompatActivity() {

    companion object {
        val PRODUCT = "PRODUCT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seleccionar)

        val product = intent.getParcelableExtra<Product>(PRODUCT)
        val detailFragment = supportFragmentManager.findFragmentById(R.id.fragmentDetail) as? DetailFragment
        if (product != null) {
            detailFragment?.showProduct(product)
        }

    }
}

