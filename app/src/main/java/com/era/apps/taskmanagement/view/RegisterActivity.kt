package com.era.apps.taskmanagement.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.era.apps.taskmanagement.R

class RegisterActivity : AppCompatActivity() {
   private var context: Context? =null
   private var editTextRegisterPhone: EditText? = null
   private var editTextRegisterPassword: EditText? = null
   private var buttonRegister: AppCompatButton? = null
   private var textViewLogin: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        context=this
        initit()

    }
    private fun initit(){
        editTextRegisterPhone = findViewById(R.id.etRegisterPhone) as EditText
        editTextRegisterPassword = findViewById(R.id.etRegisterPassword) as EditText
        buttonRegister = findViewById(R.id.btnRegister) as AppCompatButton
        textViewLogin = findViewById(R.id.tvLogin) as TextView
        buttonRegister!!.setOnClickListener(View.OnClickListener {
            val phone = editTextRegisterPhone!!.getText().toString().trim { it <= ' ' }
            val password = editTextRegisterPassword!!.getText().toString().trim { it <= ' ' }
            startActivity(Intent(this, DashboardActivity::class.java))

        })
        textViewLogin!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        })
    }
}
