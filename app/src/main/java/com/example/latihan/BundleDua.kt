package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan.databinding.ActivityBundleDuaBinding

class BundleDua : AppCompatActivity() {
    lateinit var binding: ActivityBundleDuaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getBundel =intent.extras
        val name = getBundel?.getString("nama")
        val age = getBundel?.getString("age")
//        val hasil : Int = 2023 - age
        binding.etSatu.text ="Halo, $name"
        binding.etDua.text = "Umur Kamu, $age"
    }
}
