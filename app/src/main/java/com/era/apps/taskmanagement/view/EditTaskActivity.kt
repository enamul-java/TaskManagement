package com.era.apps.taskmanagement.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.era.apps.taskmanagement.R
import com.era.apps.taskmanagement.adapter.TaskCustomSpinnerAdapter
import com.era.apps.taskmanagement.model.SpinnerDataModel
import kotlinx.android.synthetic.main.activity_add_task.*

class EditTaskActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_task)


    }

}
