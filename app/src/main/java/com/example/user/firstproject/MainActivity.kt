package com.example.user.firstproject

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var mIsLogin = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(mIsLogin){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_main_container, HomeFragment(), "HomeFragment")
                    .commit()
        }else{
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fl_main_container, LoginFragment(), "LoginFragment")
                    .commit()
        }

//        bt_login.setOnClickListener{
//            if(et_account.text.toString()=="jimmy"&&et_password.text.toString()=="123"){
//                val intent = Intent(this,SecondActivity::class.java)
//                startActivity(intent)
//            } else {
//                Toast.makeText(this, "帳號或密碼錯誤", Toast.LENGTH_SHORT).show()
//            }
//        }
    }


}