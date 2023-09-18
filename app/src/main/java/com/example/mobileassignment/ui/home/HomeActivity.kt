package com.example.mobileassignment.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mobileassignment.R



//import com.example.mobileassignment.ui.account.AccountActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        val userName = intent.getStringExtra("username")
        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener(){
//            val intent = Intent(this, AccountActivity::class.java)
//            intent.putExtra("username", userName)
//            startActivity(intent)
        }
    }
}