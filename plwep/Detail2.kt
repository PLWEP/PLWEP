package com.example.plwep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detail2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail2)

        val Search = findViewById<SearchView>(R.id.search2)
        val listView = findViewById<ListView>(R.id.list2)
        val Materi = arrayOf("Pengenalan Teknologi Informasi","Internet dan WWW","Piranti Lunak Aplikasi","Pengenalan Komponen Komputer","Perangkat Input","Perangkat Output","Pengnalan Sistem Operasi dan Program Utiliti","Pengenalan Media Penyimpanan","Sistem Informasi","Keamanan Sistem Informasi","Etika dan Dampak Sosial Teknologi Informasi")
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