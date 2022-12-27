package com.group.libraryapp.calculator

fun main() {
    CalculatorTest().addTest()
}

class CalculatorTest {
    fun addTest() {
        val calculator = Calculator(5)
        calculator.add(3)

        if (calculator.number != 8) {
            throw IllegalArgumentException()
        }
    }
}