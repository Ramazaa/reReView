package com.example.rereview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclearView: RecyclerView
    private lateinit var newArrayList : ArrayList<Foods>
    lateinit var imageId : Array<Int>
    lateinit var heaidng : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.chicken_pizza,
            R.drawable.beef_chicken,
            R.drawable.normal_pizza,
            R.drawable.sweet_chicken,
            R.drawable.minni_pizza,
            R.drawable.extra_chicken
        )
        heaidng = arrayOf(
            "chicken_pizza",
            "beef_chicken",
            "normal_pizza",
            "sweet_chicken",
            "minni_pizza",
            "extra_chicken",
        )

        newRecyclearView = findViewById(R.id.recycleView)
        newRecyclearView.layoutManager = LinearLayoutManager(this)
        newRecyclearView.setHasFixedSize(true)
        newArrayList = arrayListOf<Foods>()

        getUserData()

    }

    private fun getUserData() {
        for(i in imageId.indices){
            val foods =Foods(imageId[i],heaidng[i])
            newArrayList.add(foods)
        }
        newRecyclearView.adapter =MyAdapter(newArrayList)
    }
}