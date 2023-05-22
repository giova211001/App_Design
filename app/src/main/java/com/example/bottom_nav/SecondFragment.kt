package com.example.bottom_nav

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Chronometer
import android.widget.Toast
import kotlin.properties.Delegates


class SecondFragment : Fragment() {

    lateinit var chrono: Chronometer
    var pauseOffset: Long = 0

    var running: Boolean = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chrono = view.findViewById(R.id.tempo)
        val btn_start: Button = view.findViewById<Button>(R.id.start_chrono)
        val btn_pause: Button = view.findViewById(R.id.pause_chrono)
        val btn_reset: Button = view.findViewById(R.id.reset_chrono)

        btn_start.setOnClickListener{
            if(!running)
            {
                //chrono.base = System.currentTimeMillis() - pauseOffset
                chrono.start()
            }

        }

        btn_pause.setOnClickListener {
            Toast.makeText(context, "This button doesn't work", Toast.LENGTH_LONG)
        }

        btn_reset.setOnClickListener {
            chrono.stop()
            //TODO aggiungere passaggio a fragment che mostra i dati relativi alla corsa/tracciamento appena svolto
        }



    }




}