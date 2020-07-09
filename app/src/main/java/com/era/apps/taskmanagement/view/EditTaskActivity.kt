package com.era.apps.taskmanagement.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.widget.AppCompatButton
import com.era.apps.taskmanagement.R
import com.era.apps.taskmanagement.adapter.TaskCustomSpinnerAdapter
import com.era.apps.taskmanagement.model.SpinnerDataModel
import kotlinx.android.synthetic.main.activity_add_task.*

class EditTaskActivity : AppCompatActivity() {
    private var context: Context? = null
    private var etEditTaskName: EditText? = null
    private var etEditTaskDescription: EditText? = null
    private var etEditStartDate: EditText? = null
    private var etEditEndDate: EditText? = null
    private var etEditTaskCreateDate: EditText? = null
    private var btnEditTask: AppCompatButton? = null

    var spinnerdata: SpinnerDataModel = SpinnerDataModel("Select Task Priority","1")
    var spinnerdata1: SpinnerDataModel = SpinnerDataModel("High","2")
    var spinnerdata2: SpinnerDataModel = SpinnerDataModel("Medium","3")
    var spinnerdata3: SpinnerDataModel = SpinnerDataModel("Low","4")

    val listItemsTxt = arrayOf(spinnerdata,spinnerdata1,spinnerdata2,spinnerdata3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task)
        context = this
        initit()

    }
    private fun initit(){
        etEditTaskName = findViewById(R.id.etEditTaskName)as EditText
        etEditTaskDescription = findViewById(R.id.etEditTaskDescription)as EditText
        etEditStartDate = findViewById(R.id.etEditStartDate)as EditText
        etEditEndDate = findViewById(R.id.etEditEndDate)as EditText
        etEditTaskCreateDate = findViewById(R.id.etEditTaskCreateDate)as EditText
        btnEditTask = findViewById(R.id.btnEditTask)as AppCompatButton

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
