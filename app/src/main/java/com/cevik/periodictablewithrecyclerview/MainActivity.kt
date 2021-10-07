package com.cevik.periodictablewithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cevik.periodictablewithrecyclerview.data.mock.MockDataGenerator
import com.cevik.periodictablewithrecyclerview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //  setContentView(R.layout.activity_main)

        val binding=DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val adapter=ElementListAdapter{elementModel ->
            Toast.makeText(this,elementModel.name,Toast.LENGTH_LONG).show()
        }
        adapter.elementList=MockDataGenerator.generateElementList(126)

        binding.rvElementList.adapter=adapter
        binding.rvElementList.layoutManager=
            GridLayoutManager(this,7,RecyclerView.HORIZONTAL,false)





    }
}