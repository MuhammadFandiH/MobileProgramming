package com.example.utsmobileprogramming

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val context = this

        btnView.setOnClickListener{
            val intent = Intent(context,ViewActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnInput.setOnClickListener{
            val intent = Intent(context,InputActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnLogout.setOnClickListener{
            val intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
