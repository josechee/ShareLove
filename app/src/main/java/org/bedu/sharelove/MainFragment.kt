package org.bedu.sharelove

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.fragment_minuta.*
import kotlinx.android.synthetic.main.fragment_minuta.view.*


class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_minuta, container, false)
        // seteando el appbar como action bar
        //val appBar = view.findViewById<Toolbar>(R.id.app_bar)
        (activity as AppCompatActivity).setSupportActionBar(view.app_bar)
        // Inflate the layout for this fragment

        // Setup Drawer
        val drawerLayout = view.findViewById<DrawerLayout>(R.id.drawer_layout)
        val drawerToggle = ActionBarDrawerToggle(activity,drawerLayout,view.app_bar,R.string.open_drawer,R.string.close_drawer)

        setUpRecyclerView(view)

        return view
    }

//

    //asignamos las acciones para cada opción del AppBar


    private fun getProducts(): MutableList<Product>{
        var products:MutableList<Product> = ArrayList()

        products.add(Product("Hamburgues", "Disponible el 20 de noviembre", "2",4.6f,R.drawable.hamburguesa))
        products.add(Product("Manzanas", "10ma Generación", "12",4.4f,R.drawable.manzanas))
        products.add(Product("Platillo de Brochetas", "Disponible Prime", "1",3.8f,R.drawable.brochetas))
        products.add(Product("Coctel de Frutas", "Noise Cancelling", "5",4.8f,R.drawable.coctel))
        products.add(Product("Verduras y Frutas", "Noise Cancelling", "5",4.8f,R.drawable.verduras))
        products.add(Product("Platillo de Queso", "Noise Cancelling", "2",4.8f,R.drawable.sincronizadas))
        products.add(Product("Hot Dog", "Noise Cancelling", "3",4.8f,R.drawable.hotdog))
        products.add(Product("Legumbres", "Noise Cancelling", "4",4.8f,R.drawable.legumbres))
        products.add(Product("Sueter", "Noise Cancelling", "1",4.8f,R.drawable.sueter))
        products.add(Product("Atuendo", "Noise Cancelling", "1",4.8f,R.drawable.atuendo))
        products.add(Product("Ropa Deportiva", "Noise Cancelling", "2",4.8f,R.drawable.deportiva))

        return products
    }

    @SuppressLint("UseRequireInsteadOfGet")
    private fun setUpRecyclerView(view: View){
        val recyclerProducts = view.recyclerProducts
        recyclerProducts.setHasFixedSize(true)
        recyclerProducts.layoutManager = GridLayoutManager(
            activity,
            1,
            GridLayoutManager.VERTICAL,
            false
        )


        val largePadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing)
        val smallPadding = resources.getDimensionPixelSize(R.dimen.product_grid_spacing_small)
        recyclerProducts.addItemDecoration(GridDecoration(largePadding, smallPadding))

        //seteando el Adapter
        recyclerProducts.adapter = RecyclerAdapter( activity!!, getProducts(),clickListener = {

        })
    }

}