package com.example.diaglogfragmentsample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.diaglogfragmentsample.databinding.FragmentMessageBinding


class MessageFragment : Fragment() {
    private lateinit var fragmentMessageBinding: FragmentMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button: Button = view.findViewById(R.id.button)
        button.setOnClickListener{
          /*  val number = 24
            val bundle = bundleOf("number" to number)*/ //Burası değer ataması yapmak için kullanulıyor
            val mynumber = 19
            val action = MessageFragmentDirections.actionMessageFragmentToActiontoAction(mynumber)

         // findNavController().navigate(R.id.action_messageFragment_to_nav_start)
            findNavController().navigate(R.id.action_messageFragment_to_loginActivity2) // if you want to go login activitiy you can open this code
           //findNavController().navigate(R.id.action_messageFragment_to_dialogFrament2) // if you want to activate dialog fragment you can open this code
          //  findNavController().navigate(R.id.myaction, bundle) //this action created with activity code in the nav_graph code side -- bundle ekleyerek içerideki data transferini gerçekleştiriyor.
           // findNavController().navigate(R.id.actiontoAction)

        }
    }

}