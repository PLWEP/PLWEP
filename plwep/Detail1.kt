package com.example.plwep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detail1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail1)

        val Search = findViewById<SearchView>(R.id.search1)
        val listView = findViewById<ListView>(R.id.list1)
        val Materi = arrayOf("Merakit PC","Penulisan Ilmiah Ms word","Mailing List Ms Word","Ms Excel","Power Point","Ms Access","Coder.org","Pengenalan HTML","Web Design HTML","CSS","JavaScript","PHP")
        val adp : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,Materi)
        listView.adapter = adp

        Search.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query : String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                adp.filter.filter(newText)
                return false
            }
        })
    }
}