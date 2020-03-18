package com.example.server

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_jadwal_sholat.*
import org.json.JSONObject

class JadwalSholat : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jadwal_sholat)

        val context = this

        getdariserver()

        btnBalikJadwal.setOnClickListener{
            val intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getdariserver() {
        AndroidNetworking.get("http://172.30.34.146/cobarepo-master/contoh_jadwal_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener {
                override fun onResponse(response: JSONObject) {
                    Log.e("kotlineResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i: Int in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("kotlinTitle", jsonObject.optString("shubuh"))

                        txt1.setText(jsonObject.optString("shubuh"))
                    }

                    val jsonArray1 = response.getJSONArray("result")
                    for (i: Int in 0 until jsonArray1.length()) {
                        val jsonObject = jsonArray1.getJSONObject(i)
                        Log.e("kotlinTitle", jsonObject.optString("dhuhur"))

                        txt2.setText(jsonObject.optString("dhuhur"))
                    }

                    val jsonArray2 = response.getJSONArray("result")
                    for (i: Int in 0 until jsonArray2.length()) {
                        val jsonObject = jsonArray2.getJSONObject(i)
                        Log.e("kotlinTitle", jsonObject.optString("ashar"))

                        txt3.setText(jsonObject.optString("ashar"))
                    }

                    val jsonArray3 = response.getJSONArray("result")
                    for (i: Int in 0 until jsonArray3.length()) {
                        val jsonObject = jsonArray3.getJSONObject(i)
                        Log.e("kotlinTitle", jsonObject.optString("maghrib"))

                        txt4.setText(jsonObject.optString("maghrib"))
                    }

                    val jsonArray4 = response.getJSONArray("result")
                    for (i: Int in 0 until jsonArray4.length()) {
                        val jsonObject = jsonArray4.getJSONObject(i)
                        Log.e("kotlinTitle", jsonObject.optString("isha"))

                        txt5.setText(jsonObject.optString("isha"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("err", anError.toString())
                }
            })
    }
}
