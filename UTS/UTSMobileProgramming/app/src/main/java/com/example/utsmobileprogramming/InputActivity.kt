package com.example.utsmobileprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_input.*

class InputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        val context = this

        btnBackInput.setOnClickListener{
            val intent = Intent(context,DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
