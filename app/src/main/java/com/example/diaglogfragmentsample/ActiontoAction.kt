package com.example.diaglogfragmentsample

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


private  const val ARG_PARAM1 = "number"
class ActiontoAction : Fragment() {

private var param1:Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.v("Number", param1.toString())

        return inflater.inflate(R.layout.fragment_actionto_action, container, false)
    }


    }
