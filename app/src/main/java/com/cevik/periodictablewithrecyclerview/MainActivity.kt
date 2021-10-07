package com.cevik.periodictablewithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.periodictablewithrecyclerview.data.mock.MockDataGenerator
import com.cevik.periodictablewithrecyclerview.data.model.ElementModel
import com.cevik.periodictablewithrecyclerview.data.model.PeriodicTableModel
import com.cevik.periodictablewithrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)

        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val itemClickListener=object:OnItemClickListener{
            override fun onItemClicked(model: PeriodicTableModel) {
                Toast.makeText(this@MainActivity,(model as ElementModel).index.toString(),Toast.LENGTH_LONG).show()
            }
        }
        val adapter=ElementListAdapter(itemClickListener)

        adapter.elementList=MockDataGenerator.generateElementList(126)

        binding.rvElementList.adapter=adapter
        binding.rvElementList.layoutManager=
            GridLayoutManager(this,7,RecyclerView.HORIZONTAL,false)





    }

}


