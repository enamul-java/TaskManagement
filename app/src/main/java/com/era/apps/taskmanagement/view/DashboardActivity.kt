package com.era.apps.taskmanagement.view

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.era.apps.taskmanagement.R
import com.era.apps.taskmanagement.adapter.TaskRecyclerAapter
import com.era.apps.taskmanagement.model.TaskRecyclerModel
import kotlinx.android.synthetic.main.activity_add_task.*
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    private var context: Context? =null
    private var toolbar: Toolbar? = null
    private var drawerLayout: DrawerLayout? = null
    private var recyclerView: RecyclerView? = null
    private var buttonAddTask: AppCompatButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        context = this
        initit()

    }
@SuppressLint("WrongConstant")
private fun initit(){
    buttonAddTask = findViewById(R.id.btnAddTask) as AppCompatButton
    toolbar = findViewById(R.id.toolbar)as Toolbar
    drawerLayout = findViewById(R.id.drawerLayout)as DrawerLayout
    buttonAddTask!!.setOnClickListener(View.OnClickListener {
        startActivity(Intent(this, AddTaskActivity::class.java))
    })

    setSupportActionBar(toolbar)
    supportActionBar?.setDisplayHomeAsUpEnabled(true)

    var drawerToggle = object : ActionBarDrawerToggle(
        this,
        drawerLayout,
        toolbar,
        R.string.drawer_open,
        R.string.drawer_close
    ) {
        override fun onDrawerClosed(view: View) {
            super.onDrawerClosed(view)
            setTitle(R.string.dashboard)
        }

        override fun onDrawerOpened(drawerView: View) {
            super.onDrawerOpened(drawerView)
            setTitle(R.string.dashboard)
        }
    }


    drawerToggle.isDrawerIndicatorEnabled = true
    drawerLayout!!.addDrawerListener(drawerToggle)
    drawerToggle.syncState()

    navigationView.setNavigationItemSelectedListener{
        when (it.itemId){
            R.id.nav_settings -> {
//                    startActivity(Intent(context,Activity::class.java))
//                    drawerLayout!!.closeDrawer(GravityCompat.START)
            }

            R.id.nav_logout -> {
                finish()
            }

        }
        // Close the drawer
        true
    }

    // Recycler View

    recyclerView = findViewById(R.id.recyclerViewTaskView)as RecyclerView
    recyclerView!!.layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
    val tasks = ArrayList<TaskRecyclerModel>()
    tasks.add(TaskRecyclerModel("Paul", "Mr","10000000","A","M-1","19.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Jane", "Miss","100000","B","M-2","12.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("John", "Dr","5200152","C","M-3","13.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","1520000", "D","M-4","12.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","2500000","E","M-5","13.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","300000","F","M-6","14.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","800000","G","M-6","16.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","5200152","C","M-3","13.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Paul", "Mr","10000000","A","M-1","19.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Jane", "Miss","100000","B","M-2","12.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("John", "Dr","5200152","C","M-3","13.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","1520000", "D","M-4","12.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","2500000","E","M-5","13.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","300000","F","M-6","14.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","800000","G","M-6","16.01.2020","hiiso"))
    tasks.add(TaskRecyclerModel("Amy", "Mrs","5200152","C","M-3","13.01.2020","hiiso"))

    var adapter = TaskRecyclerAapter(this,tasks)
    recyclerView!!.adapter = adapter
}

}
