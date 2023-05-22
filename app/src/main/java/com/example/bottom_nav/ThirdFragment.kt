package com.example.bottom_nav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.random.Random
import android.util.Log;
import android.widget.ProgressBar
import android.widget.TextView


class ThirdFragment : Fragment() {

    var display_message: String? = ""
    private var progr: Int = 0
    lateinit var progress_b: ProgressBar
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var btn: Button = view.findViewById<Button>(R.id.btn1)
        progress_b = view.findViewById(R.id.progress_bar)
        var text_viewp: TextView = view.findViewById<TextView>(R.id.text_view_progress)
        var message: TextView = view.findViewById(R.id.data_pass)

        //modifico il testo
        val data = arguments?.getString("messaggio")

        //quando clicco il bottone genero numero random e cambio il testo e la percentuale
        btn.setOnClickListener {
            //genero numero random
            val numeri = 1..100
            progr = numeri.random()
            //stampo il numero
            Log.i("random", "Il numero uscito è $progr")

            //modifico valori

            //progress_b.progress = progr
            text_viewp.text =  "$display_message/100"


        }


    }
    companion object{
        fun newInstance(data:String): ThirdFragment {
            val fragment = ThirdFragment()
            val args = Bundle().apply { putString("messaggio", data) }
            fragment.arguments = args
            return fragment
        }
    }







}