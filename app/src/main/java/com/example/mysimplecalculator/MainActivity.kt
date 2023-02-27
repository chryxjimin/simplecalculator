package com.example.mysimplecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val operand1 = findViewById<EditText>(R.id.operand1)
        val operand2 = findViewById<EditText>(R.id.operand2)
        val operator = findViewById<EditText>(R.id.operator)


          calculate.setOnClickListener {
              Toast.makeText(this@MainActivity, "Button clicked", Toast.LENGTH_SHORT).show()
              val addition = Addition()
              val subtraction = Subtraction()
              val division = Division()
              val multiplication = Multiplication()
              val input1 = Integer.parseInt(operand1.getText().toString())
              val input2 = Integer.parseInt(operand2.getText().toString())
              when (operator.text.toString()) {
                  "+" -> total.setText(addition.operator(input1, input2).toString())
                  "-" -> total.setText(subtraction.operator(input1, input2).toString())
                  "*" -> total.setText(multiplication.operator(input1, input2).toString())
                  "/" -> total.setText(division.operator(input1, input2).toString())
              }
          }
    }
}


