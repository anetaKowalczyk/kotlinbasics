package com.george

import org.junit.Before
import org.junit.Test
import kotlin.test.assertEquals

class BowlingGameTest {


    lateinit var underTest: BowlingGame

    @Before
    fun setUp() {
        underTest = BowlingGame(frames = 10, pins = 0, score = 0)
    }

    @Test
    fun zeroKnockedDownPins_shouldReturn_zero() {
        val expectedValue = 0
        val actualValue = underTest.roll(0)

        assertEquals(expectedValue, actualValue, "Doesn't return 0 pins")
    }

    @Test
    fun oneKnockedDownPins_shouldReturn_one() {
        val expectedValue = 1
        val actualValue = underTest.roll(1)

        assertEquals(expectedValue, actualValue, "Doesn't return 1 pins")
    }

    @Test
    fun twoKnockedDownPins_inTwoTries_shouldReturn_two() {
        val expectedValue = 2
        val actualValue = underTest.roll(1) + underTest.roll(1)

        assertEquals(expectedValue, actualValue, "Doesn't return 2 pins")
    }

    @Test
    fun tenKnockedDownPins_inTwoTries_shouldReturn_ten() {
        val expectedValue = 10
        val actualValue = underTest.roll(5) + underTest.roll(5)

        assertEquals(expectedValue, actualValue, "Doesn't return 5 pins")
    }

//    TODO
    @Test
    fun tenKnockedDownPins_inTwoTries_shouldReturn_ten0() {

        underTest.roll(5)
        underTest.roll(5)

//        assertEquals(10, underTest.getScore(), "Doesn't return 5 pins")
    }

    @Test
    fun shouldGetOneMoreFrame_whenSpare() {
//        val expectedValue = 10
//        val actualValue = underTest.roll(5) + underTest.roll(5)
//
//        assertEquals(expectedValue, actualValue, "Doesn't return 5 pins")
    }


}