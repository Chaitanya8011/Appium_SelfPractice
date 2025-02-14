package com.example.appiuselfproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class CustomAdapter(
    private val context:Context,
    private val items: List<Item>
) : ArrayAdapter<Item>(context, 0, items) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.listitem, parent, false)
        val textView:TextView
        textView = view.findViewById(R.id.textViewItem)
        textView.text = items[position].name
        return view

    }
}