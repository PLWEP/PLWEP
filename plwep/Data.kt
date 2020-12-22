package com.example.plwep

object Data {
    private  val Names = arrayOf("Daspro", "Daskom", "PTI", "PAI", "Fisika", "Kalkulus", "B.Inggris","Statistika dan Probabilitas","Web Programming","Jaringan Komputer","Rekayasa Perangkat Lunak Lanjut","Sistem Basis Data","Struktur Data","PKN","Matematika Diskrit","Komputer Grafik","Data Mining")

    private val Details = arrayOf("Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -","Pengajar : -")

    private  val images = intArrayOf(
        R.drawable.daspro,
        R.drawable.pti,
        R.drawable.pti,
        R.drawable.pai,
        R.drawable.fisika,
        R.drawable.kalkulus,
        R.drawable.binggris,
        R.drawable.kalkulus,
        R.drawable.daskom,
        R.drawable.pti,
        R.drawable.software,
        R.drawable.data,
        R.drawable.data,
        R.drawable.pkn,
        R.drawable.kalkulus,
        R.drawable.corel,
        R.drawable.data
    )


    val listData: ArrayList<Language>
        get(){
            val list = arrayListOf<Language>()
            for (position in Names.indices){
                val data = Language()
                data.name = Names[position]
                data.detail = Details[position]
                data.photo = images[position]
                list.add(data)

            }
            return list
        }

}