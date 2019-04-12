package com.elgendy.tutorials

import org.junit.Test
import org.junit.Assert.assertEquals

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun add() {
        assertEquals(calculator.add(1, 5), 6)
    }

    @Test
    fun subtract() {
        assertEquals(calculator.subtract(5, 1), 4)
    }

    @Test
    fun multiply() {
        assertEquals(calculator.multiply(1, 5), 5)
    }

    @Test
    fun divide() {
        assertEquals(calculator.divide(6, 2), 3)
    }

}
