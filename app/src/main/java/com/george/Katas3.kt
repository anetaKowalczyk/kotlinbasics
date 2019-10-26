package com.george

class PrimeFactors {

    fun generate(number: Int): List<Int> {

        return if (isPrimeNumber(number) && number != 1) {
            listOf(number)
        } else if (number == 1) {
            emptyList()
        } else {
            dividersOfNotPrimeNumbers(number)
        }
    }


    fun isPrimeNumber(number: Int): Boolean {

        for (divider in 2 until number) {
            if (number % divider == 0) {
                return false
            }
        }

        return true
    }

    private fun dividersOfNotPrimeNumbers(number: Int): List<Int> {

        var listOfDividers = mutableListOf<Int>()

        for (divider in 2 until number) {
            listOfDividers.add(divider)

            if (number % divider == 0) {
                return listOfDividers


            }
        }
        return emptyList()
    }


}