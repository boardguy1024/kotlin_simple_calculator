package com.example.parkkyungsuk.kotlin_simple_calculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val arrayAdaptor = ArrayAdapter<Int>(this, android.R.layout.simple_spinner_item)
//        arrayAdaptor.add(10)
//        arrayAdaptor.add(20)
//        arrayAdaptor.add(30)

        val arrayAdaptor = ArrayAdapter.createFromResource(this, R.array.number_of_question, android.R.layout.simple_spinner_item)
        spinner.adapter = arrayAdaptor

        button.setOnClickListener {

            val spinnerItem: Int = spinner.selectedItem.toString().toInt()

            val intent = Intent(this@MainActivity, TestActivity::class.java)
            intent.putExtra("spinnerItem", spinnerItem)
            startActivity(intent)

        }
    }
}
