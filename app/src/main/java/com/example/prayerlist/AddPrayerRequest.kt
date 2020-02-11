package com.example.prayerlist

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_add_prayer_request.*

class AddPrayerRequest : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_prayer_request)
    }

    fun addPrayer(view:View) {
        var prayer:Prayer = Prayer(new_prayer_summary.text.toString(), new_prayer_description.text.toString())
        var resultIntent:Intent = Intent()
        resultIntent.putExtra("prayer",prayer)
        setResult(Activity.RESULT_OK, resultIntent);
        finish()
    }
}
