package com.example.tugasfungsi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* TUGAS DARI DOSEN
            pd fungsi utama :
            a = 5
            b = 6
            c = 10
            pd fungsi lain :
            d = (a*b-10)/c
         */
        //nilai yg diketahui
        var a = 5
        var b = 6
        var c = 10

        //hasil
        rumus(a,b,c)
    }
    //fungsi rumus
    fun rumus(a:Int, b:Int, c:Int){
        var d:Int
        d = (a*b-10) /c
Log.i("Hasil","$d")
    }
}
