package com.example.server

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import kotlinx.android.synthetic.main.activity_nama_masjid.*
import org.json.JSONObject

class NamaMasjid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nama_masjid)

        getdariserver()

        val context = this

        btnBalikNama.setOnClickListener{
            val intent = Intent(context,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun getdariserver() {
        AndroidNetworking.get("http://172.30.34.146/cobarepo-master/contoh_identitas_json.php")
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONObject(object : JSONObjectRequestListener{
                override fun onResponse(response: JSONObject) {
                    Log.e("kotlineResponse", response.toString())

                    val jsonArray = response.getJSONArray("result")
                    for (i:Int in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        Log.e("kotlineTitle", jsonObject.optString("nama_masjid"))

                        txtNama.setText(jsonObject.optString("nama_masjid"))
                    }

                    val jsonArray1 = response.getJSONArray("result")
                    for (i:Int in 0 until jsonArray1.length()) {
                        val jsonObject = jsonArray1.getJSONObject(i)
                        Log.e("kotlineTitle", jsonObject.optString("alamat_masjid"))

                        txtAlamat.setText(jsonObject.optString("alamat_masjid"))
                    }
                }

                override fun onError(anError: ANError) {
                    Log.i("err", anError.toString())
                }
            })


    }
}