package com.example.plwep

import android.content.Intent
import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listAdapter (private val listLanguage: ArrayList<Language>) : RecyclerView.Adapter<listAdapter.ListViewHolder>() {
    // Class utama buat nampilin data di recycle view
    class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img)
    }
    // Class utama buat nampilin data di recycle view
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_list, viewGroup, false)
        return ListViewHolder(view)
    }
    // Class utama buat nampilin data di recycle view
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val language = listLanguage[position]
        val context = holder.itemView.context
        Glide.with(holder.itemView.context)
            .load(language.photo)
            .apply(RequestOptions().override(75, 75))
            .into(holder.imgPhoto)

        holder.tvName.text = language.name
        holder.tvDetail.text = language.detail
        
        // cara biar recycle view bisa dipencet
        holder.itemView.setOnClickListener {
            // buka activity yang berbeda di recycle view
            when (language) {
                listLanguage[0] -> {
                    val intent = Intent(context,Detail::class.java)
                    context.startActivity(intent)
                }

                listLanguage[1] -> {
                    val intent = Intent(context,Detail1::class.java)
                    context.startActivity(intent)
                }

                listLanguage[2] -> {
                    val intent = Intent(context,Detail2::class.java)
                    context.startActivity(intent)
                }

                listLanguage[3] -> {
                    val intent = Intent(context,Detail3::class.java)
                    context.startActivity(intent)
                }

                listLanguage[4] -> {
                    val intent = Intent(context,Detail4::class.java)
                    context.startActivity(intent)
                }

                listLanguage[5] -> {
                    val intent = Intent(context,Detail5::class.java)
                    context.startActivity(intent)
                }

                listLanguage[6] -> {
                    val intent = Intent(context,Detail6::class.java)
                    context.startActivity(intent)
                }

                listLanguage[7] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[8] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[9] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[10] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[11] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[12] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[13] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[14] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[15] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

                listLanguage[16] -> {
                    Toast.makeText(context, "Anda Memilih : " + listLanguage[position], Toast.LENGTH_SHORT).show()
                }

            }
        }
    }

    override fun getItemCount(): Int {
        return listLanguage.size
    }
}


