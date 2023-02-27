package com.example.mysimplecalculator

class Subtraction: Operation {

    override fun operator(operand1: Int, operand2: Int): Int {

        val sum: Int = operand1 - operand2
        return sum

    }
}