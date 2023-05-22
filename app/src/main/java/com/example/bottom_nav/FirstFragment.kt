package com.example.bottom_nav

import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FirstFragment : Fragment() {

    private lateinit var communicator: Communicator

    val tipi = arrayOf("Camminata", "Corsa")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //creo variabili per tutti i campi da cui devo prendere il valore


        val btn: Button = view.findViewById(R.id.button)
        val testo: EditText = view.findViewById<EditText>(R.id.peso)

        //imposto listener sul click del bottone
        btn.setOnClickListener{

            //PASSI DA FARE
            //mostrare una finestra di dialogo che mi dice che ho impostato correttamente le calorie
            //inviare i dati al terzo fragment

            val dialog = MyDialog()
            dialog.show(childFragmentManager, "my dialog")





        }

    }

    fun calculateCaloriesToBurn(gender: String, age: Int, weight: Double, height: Double, activityLevel: String, goal: Int) : Double{

        //calcolo il metabolismo basale
        var bmr: Double
        if(gender.equals("M")){
            bmr = 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age)
        }else {
            bmr = 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age)
        }



        return 1.1
    }

}