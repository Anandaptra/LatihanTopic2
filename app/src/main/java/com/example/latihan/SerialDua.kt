package com.example.latihan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latihan.databinding.ActivitySerialDuaBinding

class SerialDua : AppCompatActivity() {
    lateinit var binding: ActivitySerialDuaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySerialDuaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataSaya = intent.getSerializableExtra("DataSaya") as Data
        val nama = getDataSaya.nama
        val email = getDataSaya.email
        val phone = getDataSaya.phone
        val address = getDataSaya.address
        val age = getDataSaya.age

        binding.dataSatu.text = "Name : $nama"
        binding.dataDua.text = "Email : $email"
        binding.dataTiga.text = "Phone : $phone"
        binding.dataEmpat.text = "addres : $address"
        binding.dataLima.text = "Age : $age"
    }
}