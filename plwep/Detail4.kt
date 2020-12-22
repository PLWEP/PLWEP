package com.example.plwep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detail4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail4)

        val Search = findViewById<SearchView>(R.id.search4)
        val listView = findViewById<ListView>(R.id.list4)
        val Materi = arrayOf("Vektor","Diagram Benda Bebas","Kinematika","Hukum Newton","Gaya Gesek","Gaya Pegas","Usaha dan Energi","Momentum dan Impuls","Momentum dan Energi","Pusat Massa")
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