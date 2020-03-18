package com.example.server

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.RenderScript
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import java.net.CacheResponse

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this

        BtnBio.setOnClickListener{
            val intent = Intent(context,NamaMasjid::class.java)
            startActivity(intent)
            finish()
        }

        BtnJadwal.setOnClickListener{
            val intent = Intent(context,JadwalSholat::class.java)
            startActivity(intent)
            finish()
        }

        btnMaq.setOnClickListener{
            val intent = Intent(context,MarqueeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnPeng.setOnClickListener{
            val intent = Intent(context,PengumumanActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnSS.setOnClickListener{
            val intent = Intent(context,SlideShowActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnTl.setOnClickListener{
            val intent = Intent(context,TaglineActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}
