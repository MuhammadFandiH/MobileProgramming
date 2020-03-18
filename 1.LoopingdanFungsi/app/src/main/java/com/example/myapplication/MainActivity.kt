package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //fungsi onCreate adalah fungsi pertama ketika apk android dijalankan
        //jika kita membuat coding diluar fungsi onCreate, program tdk akan berjalan

        var jam = 12

        if(jam <=12){
            Log.i("Hasil", "Selamat Pagi")
        }else{
            Log.i("Hasil", "Selamat Petang")
        }


       /*
        nilai = 70
        A = 90 - 100
        AB = 80 - 89
        B = 70 - 79
        BC = 60 - 69
        C = <59
        */
        var nilai = 70

        if (nilai < 60){
            Log.i("Hasil", "Nilai anda C")
        }else if (nilai ==60 && nilai <70){
            Log.i("Hasil", "Nilai anda BC")
        }else if (nilai ==70 && nilai <80){
            Log.i("Hasil", "Nilai anda B")
        }else if (nilai ==80 && nilai <90){
            Log.i("Hasil","Nilai anda AB")
        }else {
            Log.i("Hasil", "Nilai anda A")
        }

        //Looping pakai "for"
        for (x in 0..10){
            Log.i("Hasil", "$x")
        }

        //Looping pakai while
        var i = 1
        while(i <= 5){
            Log.i("Hasil","Line $i")
            i++
        }

        //Looping pakai do whule
        var num = 2
        var j = 1

        do{
            Log.i("Hasil","2*$j = "+ num*j)
            j++
        }while (j < 11)

        //Belajar fungsi, fungsi penjumlahan ambil angka dari fungsi utama dan fungsi utama ambil hasil penjumlahan
        var a = 7
        var b = 5
        penjumlahan(a,b)
    }

    fun penjumlahan(a:Int, b:Int){
        var c:Int
        c = a+b
        Log.i("Hasil","$c")
    }
}


/*
PR DARI DOSEN
di fungsi utama :
a = 5
b = 6
c = 10

di fungsi lain :
d = (a*b-10)/c

 */