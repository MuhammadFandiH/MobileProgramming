package com.example.server

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_marquee.*
import org.json.JSONObject

class MarqueeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marquee)

        getdariserver()

        val context = this

        btnBalikMaq.setOnClickListener{
            val intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getdariserver() {
        AndroidNetworking.get("http://172.30.34.146/cobarepo-master/contoh_marquee_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("kotlineResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i : Int in 0 until jsonArray.length()){
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("kotlineTitle", jsonObject.optString("isi_marquee"))

                        txtMarq.setText(jsonObject.optString("ïsi_marquee"))
                    }
                }

                override fun onError(anError: ANError?) {
                    Log.i("err", anError.toString())
                }
            })
    }
}
