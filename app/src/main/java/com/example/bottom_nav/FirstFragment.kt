package com.example.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btn: Button = view.findViewById(R.id.button)
        val text: EditText = view.findViewById<EditText>(R.id.peso)

        btn.setOnClickListener{
            val showPopUp = PopUpFragment()
            showPopUp.show((activity as AppCompatActivity).supportFragmentManager, "showPopUp")
            //val editText: EditText = view.findViewById(R.id.peso)
            //val input = editText.text.toString()
            //val bundle = Bundle()
            //bundle.putString("peso", input)
            //val fragment = SecondFragment()
            //fragment.arguments = bundle
            //parentFragmentManager.beginTransaction().apply {
                //replace(R.id.nav_fragment, showPopUp).commit()
            //}


        }
    }

}