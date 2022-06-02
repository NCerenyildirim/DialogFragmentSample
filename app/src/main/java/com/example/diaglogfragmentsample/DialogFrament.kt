package com.example.diaglogfragmentsample

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DialogFrament : DialogFragment(){

        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
            return activity?.let {
                val builder = AlertDialog.Builder(it)
                builder.setMessage("Calm Down, the cat is coding")
                    .setPositiveButton("OK",
                        DialogInterface.OnClickListener { dialog, id ->

                        })
                    .setNegativeButton("Cancel",
                        DialogInterface.OnClickListener { dialog, id ->

                        })


                builder.create()
            } ?: throw IllegalStateException("Activity Cannot be null")
        }

    }
