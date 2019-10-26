package com.george

import org.junit.Test

import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.mockito.Mock
import org.mockito.runners.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class GreeterTest {

    @Mock
    lateinit var dateTime: DateTime

    lateinit var underTest: Greeter

    @Before
    fun setUp() {
        underTest = Greeter(dateTime)
    }


    @Test
    fun shouldSendGoodMorning_whenDateTimeReturns6() {
        given(dateTime.getLocalHour()).willReturn(6)

        val expectedValue = "Good morning Aneta"

        val actualResult = underTest.greet("Aneta")

        assert(expectedValue == actualResult)
    }

    @Test
    fun shouldSendGoodEvening_whenDateTimeReturns19() {
        given(dateTime.getLocalHour()).willReturn(19)

        val expectedValue = "Good evening Aneta"

        val actualResult = underTest.greet("Aneta")

        assert(expectedValue == actualResult)
    }

    @Test
    fun shouldSendGoodNight_whenDateTimeReturns1(){
        given(dateTime.getLocalHour()).willReturn(1)

        val expectedValue = "Good night Aneta"

        val actualResult = underTest.greet("Aneta")

        assert(expectedValue == actualResult)

    }

    @Test
    fun shouldSendGoodNightAndTrimBack_whenDateTimeReturns23() {
        given(dateTime.getLocalHour()).willReturn(23)

        val expectedValue = "Good night Aneta"

        val actualResult = underTest.greet("Aneta ")

        assert(expectedValue == actualResult)

    }

    @Test
    fun shouldSendHelloAndTrimFront_whenDateTimeReturns15() {
        given(dateTime.getLocalHour()).willReturn(15)

        val expectedValue = "Hello Aneta"

        val actualResult = underTest.greet(" Aneta")

        assert(expectedValue == actualResult)

    }

    @Test
    fun shouldSendHelloAndNotTrimTheMiddle_whenDateTimeReturns14() {
        given(dateTime.getLocalHour()).willReturn(14)

        val expectedValue = "Hello Ane ta"

        val actualResult = underTest.greet("Ane ta")

        assert(expectedValue == actualResult)

    }

    @Test
    fun shouldSendHelloAndCapitalise_whenDateTimeReturns13() {
        given(dateTime.getLocalHour()).willReturn(13)

        val expectedValue = "Hello Aneta"

        val actualResult = underTest.greet("aneta")

        assert(expectedValue == actualResult)
    }


}