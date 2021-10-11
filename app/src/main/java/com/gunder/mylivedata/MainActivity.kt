package com.gunder.mylivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.gunder.mylivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //    binding
    private lateinit var binding: ActivityMainBinding
    private lateinit var mLiveDataTimerViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mLiveDataTimerViewModel = ViewModelProvider(this)[MainViewModel::class.java]
    }
}