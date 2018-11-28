package tech.inversa.ejemplorecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class AdaptadorCustom(var context: Context, var items: ArrayList<Platillo>): RecyclerView.Adapter<AdaptadorCustom.ViewHolder>() {
    /*var items: ArrayList<Platillo>? = null

    init {
        this.items = items
    }*/

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): AdaptadorCustom.ViewHolder {
        val vista = LayoutInflater.from(context).inflate(R.layout.template_platillo, parent, false)
        val viewHolder = ViewHolder(vista)

        return viewHolder
    }

    override fun getItemCount(): Int {
        return items?.count()
    }

    override fun onBindViewHolder(holder: AdaptadorCustom.ViewHolder, position: Int) {
        val item = items?.get(position)
        holder.foto?.setImageResource(item.foto)
        holder.nombre?.text = item.nombre
        holder.precio?.text = item.precio.toString()
        holder.rating?.rating = item.rating.toFloat()
    }

    class ViewHolder(vista: View): RecyclerView.ViewHolder(vista) {
        var vista = vista
        var foto: ImageView? = null
        var nombre: TextView? = null
        var precio: TextView? =  null
        var rating: RatingBar? = null

        init {
            foto = vista.findViewById(R.id.ivImagen)
            nombre = vista.findViewById(R.id.tvNombre)
            precio = vista.findViewById(R.id.tvPrecio)
            rating = vista.findViewById(R.id.rbPuntuacion)
        }
    }
}