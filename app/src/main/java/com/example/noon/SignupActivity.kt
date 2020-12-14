package com.example.noon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        var btn3 =findViewById<Button>(R.id.bt3)
        var name1=findViewById<TextView>(R.id.name)
        var name2=findViewById<TextView>(R.id.name)


        var Email=findViewById<TextView>(R.id.email)
        var password=findViewById<TextView>(R.id.password)


        btn3.setOnClickListener(){
            var Emails=Email.text.toString()
            var passwordss=password.text.toString()
            var names1=name1.text.toString()
            var names2=name2.text.toString()

//            var names1=name1.text.toString()
//
//            var names2=name2.text.toString()
//            var hom= Intent(applicationContext, Home::class.java)
//
//            hom.putExtra("name1",names1)
//            hom.putExtra("name2",names2)
//            startActivity(hom)

            var ii= Intent(applicationContext, MainActivity::class.java)



            ii.putExtra("Email",Emails)
            ii.putExtra("password",passwordss)

//            ii.putExtra("name1",names1)
//            ii.putExtra("name2",names2)
            startActivity(ii)


    }






    }}