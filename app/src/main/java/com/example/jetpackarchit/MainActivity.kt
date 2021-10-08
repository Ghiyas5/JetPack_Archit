package com.example.jetpackarchit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewOutlineProvider
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.jetpackarchit.databinding.ActivityMainBinding
import com.example.jetpackarchit.imagedownload.ImageDownloadActivity
import com.example.jetpackarchit.viewModel.MainViewModel
import com.example.jetpackarchit.viewModel.MainViewModelFactory


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        // if we use view model class with blank constructor then use
       // mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // if we use view model class with argument constructor then use this for initialization
        mainViewModel = ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        binding.mainViewModel = mainViewModel
        // use for live data observe  but through binding direct xml call this observe
       // no need this finction  so to send context or lifecycleOwner to xml  use  binding.lifecycleOwner = this
//        mainViewModel.qut.observe(this, Observer {
//            binding.increment.text = it
//        })
        binding.lifecycleOwner = this

        binding.nextBtn.setOnClickListener{
            val intent = Intent(this, ImageDownloadActivity::class.java)
            startActivity(intent)
        }

    }

//    private fun setText() {
//       binding.increment.text = mainViewModel.count.toString()
//    }

       // call viewmodel fun through binding in xml so no need this button click code
//    fun increment_no(view: View) {
//        mainViewModel.increment()
//        setText()
//    }
}