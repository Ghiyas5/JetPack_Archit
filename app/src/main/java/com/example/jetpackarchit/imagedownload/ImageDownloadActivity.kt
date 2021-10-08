package com.example.jetpackarchit.imagedownload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpackarchit.R
import com.example.jetpackarchit.databinding.ActivityImageDownloadBinding

class ImageDownloadActivity : AppCompatActivity() {
    lateinit var activityImageDownloadBinding: ActivityImageDownloadBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_download)
        activityImageDownloadBinding = DataBindingUtil.setContentView(this,R.layout.activity_image_download)
        val post = Post("Kotlin","LeadConcepts","https://picsum.photos/100/100")
        activityImageDownloadBinding.post = post
    }
}