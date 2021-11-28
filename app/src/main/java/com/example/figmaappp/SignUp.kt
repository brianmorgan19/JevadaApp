package com.example.figmaappp

import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.strictmode.SqliteObjectLeakedViolation
import android.provider.ContactsContract.DisplayNameSources.EMAIL
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        btn_signup.setOnClickListener {
            AddUser()
        }

    }


    private fun AddUser(){


        val email = id_email.text.toString().trim()
        val password = id_password.text.toString().trim()
        val confirm =  id_confirm.text.toString().trim()
        val dataBaseHandler = DataBaseHandler(this)

        if(email.isNotEmpty() && password.isNotEmpty() && confirm.isNotEmpty()) {
            if(confirm == password){
                val status = dataBaseHandler.AddUser(DataBaseModel(0, email, password))
                if(status > -1){
                    val intent = Intent(this, signIn::class.java)
                    startActivity(intent)
                }
            }
            else{
                Toast.makeText(this, "Passwords should be the same", Toast.LENGTH_SHORT).show()
            }

        }
        else{
            Toast.makeText(this, "Email or password should contain info!", Toast.LENGTH_SHORT).show()
        }

    }

}