package com.example.plwep

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MatkulFragment () : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_matkul, container, false)

        val recyclerView : RecyclerView = view.findViewById(R.id.rv_language)
        recyclerView.layoutManager = LinearLayoutManager(activity)
        val list : ArrayList<Language> = arrayListOf()
        val listitemAdapter = listAdapter(list)
        recyclerView.adapter = listitemAdapter
        list.addAll(Data.listData)

        return view
    }
}





