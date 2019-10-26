package com.george

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class PrimeFactorsTest {

    lateinit var underTest: PrimeFactors

    @Before
    fun setUp() {
        underTest = PrimeFactors()
    }

    @Test
    fun oneShould_ReturnEmptyArray() {
        val expectedValue: List<Int> = emptyList()
        val actualValue = underTest.generate(1)

        assertEquals(expectedValue, actualValue, "PrimeFactors are not returning emptyList")
    }

    @Test
    fun twoShould_Return2inArray() {
        val expectedValue: List<Int> = listOf(2)
        val actualValue = underTest.generate(2)

        assertEquals(expectedValue, actualValue, "PrimeFactors are not returning arrayList with 2")
    }

    @Test
    fun threeShould_Return3inArray() {
        val expectedValue: List<Int> = listOf(3)
        val actualValue = underTest.generate(3)

        assertEquals(expectedValue, actualValue, "PrimeFactors are not returning arrayList with 3")
    }

    @Test
    fun fourShould_Return2and2inArray() {
        val expectedValue: List<Int> = listOf(2, 2)
        val actualValue = underTest.generate(4)

        assertEquals(
            expectedValue,
            actualValue,
            "PrimeFactors are not returning arrayList with 2, 2"
        )
    }

    @Test
    fun fiveShould_Return5inArray() {
        val expectedValue: List<Int> = listOf(5)
        val actualValue = underTest.generate(5)

        assertEquals(expectedValue, actualValue, "PrimeFactors are not returning arrayList with 5")
    }

    @Test
    fun oneIsPrime() {
        val expectedValue: Boolean = true
        val actualValue = underTest.isPrimeNumber(1)

        assertEquals(expectedValue, actualValue, "1 is a prime number")
    }

    @Test
    fun twoIsPrime() {
        val expectedValue: Boolean = true
        val actualValue = underTest.isPrimeNumber(2)

        assertEquals(expectedValue, actualValue, "2 is a prime number")
    }

    @Test
    fun threeIsPrime() {
        val expectedValue: Boolean = true
        val actualValue = underTest.isPrimeNumber(3)

        assertEquals(expectedValue, actualValue, "3 is a prime number")
    }

    @Test
    fun fourIsNotPrime() {
        val expectedValue: Boolean = false
        val actualValue = underTest.isPrimeNumber(4)

        assertEquals(expectedValue, actualValue, "4 is not a prime number")
    }

    @Test
    fun fiveIsPrime() {
        val expectedValue: Boolean = true
        val actualValue = underTest.isPrimeNumber(5)

        assertEquals(expectedValue, actualValue, "5 is a prime number")
    }

    @Test
    fun sixIsNotPrime() {
        val expectedValue: Boolean = false
        val actualValue = underTest.isPrimeNumber(6)

        assertEquals(expectedValue, actualValue, "5 is not a prime number")
    }

    @Test
    fun eightIsNotPrime() {
        val expectedValue: Boolean = false
        val actualValue = underTest.isPrimeNumber(8)

        assertEquals(expectedValue, actualValue, "8 is not a prime number")
    }

    @Test
    fun eightShould_Return2and2and2inArray() {
        val expectedValue: List<Int> = listOf(2, 2, 2)
        val actualValue = underTest.generate(8)

        assertEquals(
            expectedValue,
            actualValue,
            "PrimeFactors are not returning arrayList with 2, 2, 2"
        )
    }

    @Test
    fun nineShould_Return3and3inArray() {
        val expectedValue: List<Int> = listOf(3, 3)
        val actualValue = underTest.generate(9)

        assertEquals(
            expectedValue,
            actualValue,
            "PrimeFactors are not returning arrayList with 3"
        )
    }
}

