package com.era.apps.taskmanagement.utils

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import com.era.apps.taskmanagement.R

class AlertMessage {

    companion object {

        fun showMessage(c: Context, title:String,
                        message:String) {
            val aBuilder = AlertDialog.Builder(c)
            aBuilder.setTitle(title)
            aBuilder.setIcon(R.mipmap.ic_launcher)
            aBuilder.setMessage(message)
            aBuilder.setPositiveButton("Ok", object: DialogInterface.OnClickListener {
                override fun onClick(dialog:DialogInterface, which:Int) {
                    dialog.dismiss()
                }
            })
            aBuilder.show()
        }
    }
}