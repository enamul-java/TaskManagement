package com.era.apps.taskmanagement.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.era.apps.taskmanagement.R

class LoginActivity : AppCompatActivity() {
   private var context: Context? =null
   private var editTextLoginPhone: EditText? = null
   private var editTextLoginPassword: EditText? = null
   private var buttonLogin: AppCompatButton? = null
   private var textViewRegister: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        context=this
        initit()

    }
    private fun initit(){
        editTextLoginPhone = findViewById(R.id.etLoginPhone) as EditText
        editTextLoginPassword = findViewById(R.id.etLoginPassword) as EditText
        buttonLogin = findViewById(R.id.btnLogin) as AppCompatButton
        textViewRegister = findViewById(R.id.tvRegister) as TextView
        buttonLogin!!.setOnClickListener(View.OnClickListener {
            val phone = editTextLoginPhone!!.getText().toString().trim { it <= ' ' }
            val password = editTextLoginPassword!!.getText().toString().trim { it <= ' ' }
            startActivity(Intent(this, DashboardActivity::class.java))

        })
        textViewRegister!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        })
    }
}
