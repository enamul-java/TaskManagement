package com.era.apps.taskmanagement.view

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import com.era.apps.taskmanagement.R
import com.era.apps.taskmanagement.adapter.TaskCustomSpinnerAdapter
import com.era.apps.taskmanagement.model.SpinnerDataModel
import kotlinx.android.synthetic.main.activity_add_task.*

class AddTaskActivity : AppCompatActivity() {
    private var context:Context? = null
    private var etTaskName:EditText? = null
    private var etTaskDescription:EditText? = null
    private var etStartDate:EditText? = null
    private var etEndDate:EditText? = null
    private var etTaskCreateDate:EditText? = null
    private var btnAddNewTask:AppCompatButton? = null

    var spinnerdata: SpinnerDataModel = SpinnerDataModel("Select Task Priority","1")
    var spinnerdata1: SpinnerDataModel = SpinnerDataModel("High","2")
    var spinnerdata2: SpinnerDataModel = SpinnerDataModel("Medium","3")
    var spinnerdata3: SpinnerDataModel = SpinnerDataModel("Low","4")

    val listItemsTxt = arrayOf(spinnerdata,spinnerdata1,spinnerdata2,spinnerdata3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
        context = this
        initit()
    }
    private fun initit(){
        etTaskName = findViewById(R.id.etTaskName)as EditText
        etTaskDescription = findViewById(R.id.etTaskDescription)as EditText
        etStartDate = findViewById(R.id.etStartDate)as EditText
        etEndDate = findViewById(R.id.etEndDate)as EditText
        etTaskCreateDate = findViewById(R.id.etTaskCreateDate)as EditText
        btnAddNewTask = findViewById(R.id.btnAddNewTask)as AppCompatButton

        radio_group.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener{
                    group, checkedId ->
                val radio_langange: RadioButton = findViewById(checkedId)
            }
        )

        btnAddNewTask!!.setOnClickListener(View.OnClickListener {
//            val phone = editTextLoginPhone!!.getText().toString().trim { it <= ' ' }
//            val password = editTextLoginPassword!!.getText().toString().trim { it <= ' ' }
            var id: Int = radio_group.checkedRadioButtonId
            if (id!=-1){

                val radio: RadioButton = findViewById(id)
                Toast.makeText(this,"On button click : ${radio.text}", Toast.LENGTH_SHORT).show()
            }else{

            }

        })

        var spinnerAdapter: TaskCustomSpinnerAdapter = TaskCustomSpinnerAdapter(this!!, listItemsTxt)
        spinnerTariffCalculator?.adapter = spinnerAdapter

        spinnerTariffCalculator?.setOnItemSelectedListener(object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {

            }

            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        })
    }
    fun radio_button_click(view: View){
        val radio: RadioButton = findViewById(radio_group.checkedRadioButtonId)
    }
}
