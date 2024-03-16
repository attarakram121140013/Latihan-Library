package com.example.latihan5pam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private val auth: FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    private val database: DatabaseReference by lazy { FirebaseDatabase.getInstance().reference }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val retrofit = Retrofit.Builder()
            .baseUrl("http://if.itera.ac.id/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.callFactory()
    }
}
