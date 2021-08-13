package org.bedu.sharelove

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import org.bedu.sesion5.DetailActivity

class DetailFragment : Fragment() {

    private lateinit var tvProduct: TextView
    private lateinit var tvDescription: TextView
    private lateinit var rbRate: RatingBar
    private lateinit var imgProduct: ImageView
    private lateinit var tvPrice: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        val view = inflater.inflate(R.layout.item_ver_mas, container, false)

        tvProduct = view.findViewById(R.id.tvProduct)
        tvDescription = view.findViewById(R.id.tvDescription)
        rbRate = view.findViewById(R.id.km)
        imgProduct = view.findViewById(R.id.imgProduct)
        tvPrice = view.findViewById(R.id.tvQuantity)



        return view
    }

    fun showProduct(product: Product){
        view?.visibility = View.VISIBLE
        tvProduct.text = product.name
        tvDescription.text = product.description
        rbRate.rating = product.rating
        imgProduct.setImageResource(product.idImage)
        tvPrice.text = product.quantity

    }

}