package com.cevik.periodictablewithrecyclerview

import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.cevik.periodictablewithrecyclerview.data.model.ElementModel

class ElementListViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    fun bind(elementModel:ElementModel,position:Int){
      val tvIndex=  itemView.findViewById<TextView>(R.id.tvElementIndex)
      val tvSymbol=  itemView.findViewById<TextView>(R.id.tvElementSymbol)
      val tvName=  itemView.findViewById<TextView>(R.id.tvElementName)

        tvIndex.text=position.toString()
        tvSymbol.text=elementModel.symbol
        tvName.text=elementModel.name

      itemView.findViewById<ConstraintLayout>(R.id.clContainer).
        setBackgroundColor(ContextCompat.getColor(itemView.context,elementModel.color))


        tvIndex.setTextColor(ContextCompat.getColor(itemView.context,elementModel.textColor))
        tvSymbol.setTextColor(ContextCompat.getColor(itemView.context,elementModel.textColor))
        tvName.setTextColor(ContextCompat.getColor(itemView.context,elementModel.textColor))


    }
}