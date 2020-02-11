package com.example.prayerlist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

private const val ADD_PRAYER_ACTIVITY_REQUEST_CODE = 0

class MainActivity : AppCompatActivity() {

    var prayers:ArrayList<Prayer> = arrayListOf()
    var adapter:ArrayAdapter<Prayer>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listView:ListView = findViewById(R.id.list_test)
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_checked, prayers)
        listView.adapter = adapter
    }

    fun addPrayerRequest(view:View) {
        val intent = Intent(this, AddPrayerRequest::class.java)
        startActivityForResult(intent, ADD_PRAYER_ACTIVITY_REQUEST_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            ADD_PRAYER_ACTIVITY_REQUEST_CODE -> {
                if (resultCode == Activity.RESULT_OK) {
                    prayers.add(data!!.extras.getParcelable("prayer"))
                    adapter!!.notifyDataSetChanged()
                }
            }
        }
    }
}
