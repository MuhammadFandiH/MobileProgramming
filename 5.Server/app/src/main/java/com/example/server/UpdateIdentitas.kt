package com.example.server

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONArrayRequestListener
import kotlinx.android.synthetic.main.activity_update_identitas.*
import org.json.JSONArray

class UpdateIdentitas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_identitas)

        btnSimpan.setOnClickListener{

            var data_namamasjid = editText.text.toString()
            var data_alamatmasjid = editText2.text.toString()

            postkerserver(data_namamasjid,data_alamatmasjid)

            val context = this

            val intent= Intent(context,NamaMasjid::class.java)
            startActivity(intent)
            finish()
        }
    }

    fun postkerserver(data1:String,data2:String){
        AndroidNetworking.post("https:/10.35.141.190/cobarepo/proses-identitas.php")
            .addBodyParameter("nama_masjid", data1)
            .addBodyParameter("alamat_masjid", data2)
            .setPriority(Priority.MEDIUM)
            .build()
            .getAsJSONArray(object : JSONArrayRequestListener {
                override fun onResponse(response: JSONArray){
                }

                override fun onError(anError: ANError?) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            })
    }
}
