package com.example.mysimplecalculator

import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

interface Operation {
    fun operator(operand1: Int, operand2: Int): Int
}