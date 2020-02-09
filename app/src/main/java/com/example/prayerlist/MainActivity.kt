package com.example.prayerlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var values:Array<Int> = arrayOf(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0)

        var listView:ListView = findViewById(R.id.list_test)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_checked, values)
        listView.adapter = adapter
    }
}
