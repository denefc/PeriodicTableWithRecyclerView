package com.cevik.periodictablewithrecyclerview.data.model

import androidx.annotation.ColorRes

data class ElementModel(
    val index :Int,
    val symbol:String,
    val name:String,
    @ColorRes val color:Int,
    @ColorRes val textColor:Int,
    //val isEmptyItem:Boolean

):PeriodicTableModel()
