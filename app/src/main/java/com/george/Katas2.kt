package com.george

import java.lang.IllegalArgumentException

object StringCalculator {

//    something to refactor as per George
//    private val listOfDelimiters = listOf(",", "\n")
//    var number = 1

    fun add(delimitedString: String): Any {

        when {
            delimitedString == " " -> return 0
            delimitedString.length == 1 -> return delimitedString.toInt()
            delimitedString.length > 1 && !delimitedString.contains("-") -> return calculateSum(delimitedString)
            delimitedString.contains("-") -> return negativesNotAllowedMessage(delimitedString)
            else -> throw Error("No string, no calculation!")
        }
    }

    private fun negativesNotAllowedMessage(delimitedString: String): String {
        val delimiterComma = ","
        val partsOfStringListWithNegatives = delimitedString.split(delimiterComma)
        val mapOfInts = partsOfStringListWithNegatives.map { it.toInt() }
        val filteredMap = mapOfInts.filter { it < 0 }

        throw IllegalArgumentException("negatives not allowed: $filteredMap")
    }

    private fun calculateSum(delimitedString: String): Int {
        val delimiterComma = ","
        val delimitedNewline = "\n"
        val partsOfStringList = delimitedString.split(delimiterComma, delimitedNewline)

        val listOfInts = partsOfStringList.map { it.toInt() }

//        forgot unit test!!!
        val listOfIntsMaxUpTo1000: List<Int> = listOfInts.filter { s -> s < 1000 }

        return listOfIntsMaxUpTo1000.sum()

    }

}






