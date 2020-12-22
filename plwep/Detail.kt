package com.example.plwep

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Detail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val Search = findViewById<SearchView>(R.id.search) as SearchView
        val listView = findViewById<ListView>(R.id.list) as ListView
        val Materi = arrayOf("Pendahuluan Dasar Pemrograman","TipeData, Variabel, Assigment, dan NotasiAlgoritmik","Sekuen dan Ekspresi Pemrograman","Kondisi Tunggal","Kondisi Jamak","Looping","Nested Loop","Fungsi","Procedure","String","List","Array","Manipulasi Array dan List","Evaluasi Program")
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