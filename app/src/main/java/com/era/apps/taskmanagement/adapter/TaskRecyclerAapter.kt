package com.era.apps.taskmanagement.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.era.apps.taskmanagement.R
import com.era.apps.taskmanagement.model.TaskRecyclerModel

class TaskRecyclerAapter(val taskList: ArrayList<TaskRecyclerModel>): RecyclerView.Adapter<TaskRecyclerAapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.task_recycler_itemview, parent, false)
        return ViewHolder(v);
    }


    override fun getItemCount(): Int {
        return taskList.size
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.txtTaskName?.text = taskList[position].taskName
        holder?.txtTaskDescription?.text = taskList[position].taskDescription
        holder?.txtTaskPriority.text= taskList[position].taskPriority
        holder?.txtStartDate.text= taskList[position].startDate
        holder?.txtEndDate.text= taskList[position].endDate
        holder?.txtTaskStatus.text= taskList[position].taskStatus
        holder?.txtTaskCreateDate.text= taskList[position].taskCreateDate
        holder?.btnEdit



    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtTaskName = itemView.findViewById<TextView>(R.id.tvTaskName)
        val txtTaskDescription = itemView.findViewById<TextView>(R.id.tvTaskDescription)
        val txtTaskPriority = itemView.findViewById<TextView>(R.id.tvTaskPriority)
        val txtStartDate = itemView.findViewById<TextView>(R.id.tvStartDate)
        val txtEndDate = itemView.findViewById<TextView>(R.id.tvEndDate)
        val txtTaskStatus = itemView.findViewById<TextView>(R.id.tvTaskStatus)
        val txtTaskCreateDate = itemView.findViewById<TextView>(R.id.tvTaskCreateDate)
        val btnEdit = itemView.findViewById<Button>(R.id.btnEdit)



    }
}