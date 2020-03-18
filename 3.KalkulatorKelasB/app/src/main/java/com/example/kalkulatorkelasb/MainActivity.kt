package com.example.kalkulatorkelasb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        jumlah.setOnClickListener(){
            penjumlahan()
        }
        kurang.setOnClickListener(){
            pengurangan()
        }
        kali.setOnClickListener(){
            perkalian()
        }
        bagi.setOnClickListener(){
            pembagian()
        }
    }

    fun penjumlahan(){
        var bilangan1:String=bil1.text.toString()
        var bilangan2:String=bil2.text.toString()

        var a:Int=bilangan1.toInt()
        var b:Int=bilangan2.toInt()

        var c = a + b

        hasil.setText(c.toString())
    }
    fun pengurangan(){
        var bilangan1:String=bil1.text.toString()
        var bilangan2:String=bil2.text.toString()

        var a:Int=bilangan1.toInt()
        var b:Int=bilangan2.toInt()

        var c = a - b
        hasil.setText(c.toString())
    }
    fun perkalian(){
        var bilangan1:String=bil1.text.toString()
        var bilangan2:String=bil2.text.toString()

        var a:Int=bilangan1.toInt()
        var b:Int=bilangan2.toInt()

        var c = a * b
        hasil.setText(c.toString())
    }
    fun pembagian(){
        var bilangan1:String=bil1.text.toString()
        var bilangan2:String=bil2.text.toString()

        var a:Int=bilangan1.toInt()
        var b:Int=bilangan2.toInt()

        var c = a / b
        hasil.setText(c.toString())
    }
}
