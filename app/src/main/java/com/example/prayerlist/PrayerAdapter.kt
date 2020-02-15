package com.example.prayerlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import org.w3c.dom.Text

class PrayerAdapter(private val context: Context, private val dataSource: ArrayList<Prayer>): BaseAdapter() {
    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return dataSource.size
    }

    override fun getItem(position: Int): Any {
        return dataSource[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.prayer_list_item, parent, false)

        //items
        val summaryTextView = rowView.findViewById(R.id.summary) as TextView
        var descriptionTextView = rowView.findViewById(R.id.description) as TextView
        val prayer = getItem(position) as Prayer
        summaryTextView.text = prayer.summary
        descriptionTextView.text = prayer.description

        return rowView
    }
}