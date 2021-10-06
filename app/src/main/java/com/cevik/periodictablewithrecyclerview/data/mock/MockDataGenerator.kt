package com.cevik.periodictablewithrecyclerview.data.mock

import com.cevik.periodictablewithrecyclerview.R
import com.cevik.periodictablewithrecyclerview.data.model.ElementModel
import com.cevik.periodictablewithrecyclerview.data.model.EmptyModel
import com.cevik.periodictablewithrecyclerview.data.model.PeriodicTableModel

object MockDataGenerator {

    fun generateElementList(count:Int):List<PeriodicTableModel>{
        var elementList= arrayListOf<PeriodicTableModel>()
        val elementModel=ElementModel(
            index = 1,
            symbol = "H",
            name = "Hydrogen",
            color = R.color.burgundy_dark,
            textColor = R.color.burgundy_light

        )
        val emptyModel=EmptyModel()

        repeat(count){
            when(it){
                7,14,15,16,21,22,23,28,29,30,35,36,37,42,43,44,49,50,51,56,57,58,63,64,65,70,71,72,77,78,79,84,91,98,105,112->{
                    elementList.add(emptyModel)
                }
                else->{
                    elementList.add(elementModel)
                }

            }

        }

        return elementList


    }
}