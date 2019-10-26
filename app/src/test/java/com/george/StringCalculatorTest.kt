package com.george

import org.junit.Test
import java.lang.IllegalArgumentException
import kotlin.test.assertEquals

class StringCalculatorTest {

    val underTest = StringCalculator

    @Test
    fun emptyString_returns0() {
        val calculatedValue = 0

        val actualStringUnderTests = underTest.add(" ")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 0")
    }

    @Test
    fun singleNumber1_returns1() {
        val calculatedValue = 1

        val actualStringUnderTests = underTest.add("1")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 1")
    }

    @Test
    fun singleNumber2_returns2() {
        val calculatedValue = 2
        val actualStringUnderTests = underTest.add("2")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 2")
    }

    @Test
    fun twoNumbers1and2_returns3() {
        val calculatedValue = 3
        val actualStringUnderTests = underTest.add("1,2")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 3")
    }

    @Test
    fun twoNumbers10and20_returns30() {
        val calculatedValue = 30
        val actualStringUnderTests = underTest.add("10,20")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 30")
    }

    @Test
    fun twoNumbers1and2NewLineDelimited_returns3() {
        val calculatedValue = 3
        val actualStringUnderTests = underTest.add("1\n2")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 3")
    }

    @Test
    fun threeNumbers1and2and3NewLineDelimited_returns10() {
        val calculatedValue = 10
        val actualStringUnderTests = underTest.add("1\n2,3\n4")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 10")
    }

    @Test(expected = IllegalArgumentException::class)
    fun threeNegativeNumbersMinus1and2andMinus3NewLineDelimited_returnsMinus1AndMinus2WithErrorMessage() {
        underTest.add("-1,2,-3")
    }

    @Test
    fun oneThousandOneIsIgnored() {
        val calculatedValue = 0
        val actualStringUnderTests = underTest.add("1000")

        assertEquals(calculatedValue, actualStringUnderTests, "Calculator doesn't return 10")

    }

}