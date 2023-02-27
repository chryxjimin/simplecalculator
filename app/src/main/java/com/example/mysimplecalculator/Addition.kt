package com.example.mysimplecalculator

import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Addition: Operation {

        override fun operator(operand1: Int, operand2: Int): Int {

          val sum: Int = operand1 + operand2
            return sum

    }
}