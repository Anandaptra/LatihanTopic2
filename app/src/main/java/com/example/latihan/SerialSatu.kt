package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan.databinding.ActivitySerialSatuBinding

class SerialSatu : AppCompatActivity() {
    lateinit var binding: ActivitySerialSatuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerialSatuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etSimpan.setOnClickListener {
            val nama = binding.etText.editableText.toString()
            val email = binding.etEmail.editableText.toString()
            val phone = binding.etPhone.editableText.toString()
            val address = binding.etAddress.editableText.toString()
            val age = binding.etAge.editableText.toString()

            val data= Data(nama, email, phone, address, age)
            val move = Intent(this, SerialDua::class.java)
            move.putExtra("DataSaya", data)
            startActivity(move)
        }
    }
}