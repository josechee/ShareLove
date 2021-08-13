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

private var listener : (Product) ->Unit = {}
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

        products.add(Product("Hamburguesa", "Regalo 3 hamburguesas, favor de mandar mensaje para acordar el punto de encuentro", "2",4.6f,R.drawable.hamburguesa))
        products.add(Product("2 kilos de manzanas", "Estan en buenas condiciones, tengo mas kilos por si alguien quiere puede venir por ellas", "12",4.4f,R.drawable.manzanas))
        products.add(Product("Brochetas de res", "Regalo platillo de brochetas, estoy por la colonia centro, favor de mandarme privado entrego de 10am a 12pm", "10",3.8f,R.drawable.brochetas))
        products.add(Product("Regalo fruta picada", "Tenemos mucha fruta picada, nosotros vendemos y se quedo no quiero que se heche a perder, por favor pasen por ella", "5",4.8f,R.drawable.coctel))
        products.add(Product("Despensa de verduras", "Regalo verdura, a mis hijos no les gustan, espero que a alguien mas les puedan servir", "5",4.8f,R.drawable.verduras))
        products.add(Product("Platillo de lasaña", "Regalo platillo de lasaña es para dos personas ", "2",4.8f,R.drawable.sincronizadas))
        products.add(Product("Hot Dog", "Hola tenemos todo lo necesario para que preparen unos hot dogs, pueden pasar por las cosas, estoy cerca de la colonia centro", "3",4.8f,R.drawable.hotdog))
        products.add(Product("Latas de verduras", "regalo latas de verdura y atun, tengo 6 piezas, si quieres puedes pasar por ellas por la tarde, manden mensaje para acordar la hora", "6",4.8f,R.drawable.legumbres))
        products.add(Product("Sueter talla xl", "Regalo sueter, tengo mas ropa en buen estado, que ya no quedo, tambien tengo ropa de bebe", "1",4.8f,R.drawable.sueter))
        products.add(Product("traje de 2 piezas color blanco", "Hola regalo este traje era de mi madre pero ya no le gusta esta en buen estado, pueden pasar por el", "1",4.8f,R.drawable.atuendo))
        products.add(Product("Regalo conunto deportivo", "No me quedo, es talla mediana, esta nuevo pero ya no puedo regresarlo a la tienda, si  te gusta y es de tu talla puedes pasar por el.", "1",4.8f,R.drawable.deportiva))

        return products
    }
 fun setListener(l: (Product) ->Unit){
        listener = l
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