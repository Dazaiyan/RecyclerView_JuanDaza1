package com.example.recyclerview.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview.Informacion
import com.example.recyclerview.R

class InformacionViewHolder(view: View): RecyclerView.ViewHolder(view) {

    val nombre1 =  view.findViewById<TextView>(R.id.Nombree)
    val cara1 =  view.findViewById<TextView>(R.id.Caraas)
    val color1 =  view.findViewById<TextView>(R.id.tvcarrera)
    val imagen = view.findViewById<ImageView>(R.id.Imagenn)

    fun render(infoModel: Informacion){
        nombre1.text = infoModel.nombre
        cara1.text = infoModel.caras.toString()
        color1.text = infoModel.colores.toString()
        Glide.with(imagen.context).load(infoModel.imagen).into(imagen)


    }
}