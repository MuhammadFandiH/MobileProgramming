package com.example.utsmobileprogramming

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.RenderScript
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val context = this

        btnLogin.setOnClickListener{
            val intent = Intent(context,DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}