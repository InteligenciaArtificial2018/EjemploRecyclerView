package tech.inversa.ejemplorecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var lista: RecyclerView? = null
    var adaptador: AdaptadorCustom? = null
    var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val platillos = ArrayList<Platillo>()

        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo01))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo02))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo03))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo04))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo05))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo06))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo07))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo08))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo09))
        platillos.add(Platillo("Platillo 1", 250.00, 3.5, R.drawable.platillo10))

        lista = findViewById(R.id.rvLista)
        lista?.setHasFixedSize(true)

        layoutManager = LinearLayoutManager(this)
        lista?.layoutManager = layoutManager

        adaptador = AdaptadorCustom(this, platillos)
        lista?.adapter = adaptador
    }
}
