package com.example.prayerlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    //private lateinit var prayers:Array<Prayer>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var prayers:Array<Prayer> = arrayOf()

        var listView:ListView = findViewById(R.id.list_test)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_checked, prayers)
        listView.adapter = adapter
    }

    fun addPrayerRequest(view:View) {
        val intent = Intent(this, AddPrayerRequest::class.java)
        startActivity(intent)
    }
}
