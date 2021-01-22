package com.example.gallery

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)


        val photosList = ArrayList<Photos>()

        photosList.add(Photos(1, "https://eclecticlightdotcom.files.wordpress.com/2019/06/sisleyloingcanal.jpg?w=1200"))
        photosList.add(Photos(2, "https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/5-the-loing-at-saint-mammes-alfred-sisley.jpg"))
        photosList.add(Photos(3, "https://www.reproduction-gallery.com/catalogue/uploads/1440749594_large-image_alfred-sisley-boats-on-the-seine-c1877-large.jpg"))
        photosList.add(Photos(4, "https://cdn11.bigcommerce.com/s-9an1jd5d4x/images/stencil/2048x2048/products/29187/30586/the-seine-at-suresnes-1877_alfred-sisley--impressionism__06713__83214.1567247538.jpg?c=1"))
        photosList.add(Photos(1, "https://eclecticlightdotcom.files.wordpress.com/2019/06/sisleyloingcanal.jpg?w=1200"))
        photosList.add(Photos(2, "https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/5-the-loing-at-saint-mammes-alfred-sisley.jpg"))
        photosList.add(Photos(3, "https://www.reproduction-gallery.com/catalogue/uploads/1440749594_large-image_alfred-sisley-boats-on-the-seine-c1877-large.jpg"))
        photosList.add(Photos(4, "https://cdn11.bigcommerce.com/s-9an1jd5d4x/images/stencil/2048x2048/products/29187/30586/the-seine-at-suresnes-1877_alfred-sisley--impressionism__06713__83214.1567247538.jpg?c=1"))
        photosList.add(Photos(1, "https://eclecticlightdotcom.files.wordpress.com/2019/06/sisleyloingcanal.jpg?w=1200"))
        photosList.add(Photos(2, "https://images.fineartamerica.com/images/artworkimages/mediumlarge/3/5-the-loing-at-saint-mammes-alfred-sisley.jpg"))
        photosList.add(Photos(3, "https://www.reproduction-gallery.com/catalogue/uploads/1440749594_large-image_alfred-sisley-boats-on-the-seine-c1877-large.jpg"))
        photosList.add(Photos(4, "https://cdn11.bigcommerce.com/s-9an1jd5d4x/images/stencil/2048x2048/products/29187/30586/the-seine-at-suresnes-1877_alfred-sisley--impressionism__06713__83214.1567247538.jpg?c=1"))



        val photosAdapter = PhotosAdapter(photosList)

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = photosAdapter


    }
}