package com.example.noon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(100)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var btn2 =findViewById<Button>(R.id.bt2)
        var btn1 =findViewById<Button>(R.id.bt1)
        btn2.setOnClickListener() {
            var ii = Intent(applicationContext, SignupActivity::class.java)

            startActivity(ii)
        }
        var nam1:String=""
        var nam2:String=""

        var emi=findViewById<TextView>(R.id.emi)
        var pass=findViewById<TextView>(R.id.passw)

        if (intent !=null) {
            var emil = intent.getStringExtra("Email")
            var pas = intent.getStringExtra("password")

//            var name3=   intent.getStringExtra("name1")
//            var name4=   intent.getStringExtra("name2")


            emi.text = emil
            pass.text = pas

        }

        btn1.setOnClickListener() {
            var ihom= Intent(applicationContext, Home::class.java)

//
//            if (intent !=null){
//                var name1=   intent.getStringExtra("name1")
//                var name2=   intent.getStringExtra("name2")
//
//                ihom.putExtra("name1",name1)
//                ihom.putExtra("name2",name2)
//
//            }
            startActivity(ihom)
        }

    }}