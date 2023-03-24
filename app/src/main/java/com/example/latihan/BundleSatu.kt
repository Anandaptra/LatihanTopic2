package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.example.latihan.databinding.ActivityBundleSatuBinding

class BundleSatu : AppCompatActivity() {
    lateinit var binding: ActivityBundleSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBundleSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etSave.setOnClickListener {
            val name = binding.etNama.editableText.toString()
            val umur = binding.etLahir.editableText.toString()
            val bundle = Bundle()
            val move =Intent(this, BundleDua::class.java)
            bundle.putString("nama", name)
            bundle.putString("age", umur)

            move.putExtras(bundle)
            startActivity(move)
        }
    }
}