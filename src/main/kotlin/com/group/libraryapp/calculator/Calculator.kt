package com.group.libraryapp.calculator

class Calculator(private var _number: Int) {
    val number get() = this._number
    fun add(operand: Int) {
        this._number += operand
    }

    fun minus(operand: Int) {
        this._number -= operand
    }

    fun times(operand: Int) {
        this._number *= operand
    }

    fun divide(operand: Int) {
        if (operand == 0) {
            throw IllegalArgumentException("0으로 나눌 수 없습니다.")
        }

        this._number /= operand
    }
}