package com.example.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlin.coroutines.coroutineContext

class PhotosAdapter(private val photos: List<Photos>)
    : RecyclerView.Adapter<PhotosAdapter.PhotosViewHolder>() {

    class PhotosViewHolder(itemVieW: View): RecyclerView.ViewHolder(itemVieW){
        val imageView: ImageView = itemVieW.findViewById(R.id.imageView2)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.photos_item, parent, false)

        return PhotosViewHolder(view)


    }

    override fun getItemCount(): Int = photos.size

    override fun onBindViewHolder(holder: PhotosViewHolder, position: Int) {
        val p = photos[position]



        val url: String? = p.url

        Glide.with(holder.imageView.context)
                .load(url)
                .centerCrop()
                .into(holder.imageView)

    }
}