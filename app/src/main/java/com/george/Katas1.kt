package com.george

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDateTime

class Greeter(private val dateTime: DateTime) {

    @RequiresApi(Build.VERSION_CODES.O)
    fun greet(name: String): String {

        val beautifiedName = beautifyName(name)

        return when {
            isMorning() -> "Good morning $beautifiedName"
            isEvening() -> "Good evening $beautifiedName"
            isNight() -> "Good night $beautifiedName"
            else -> "Hello $beautifiedName"
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isMorning() = dateTime.getLocalHour() in 6..12

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isEvening() = dateTime.getLocalHour() in 18..22

    @RequiresApi(Build.VERSION_CODES.O)
    private fun isNight() = dateTime.getLocalHour() in 22..24 || dateTime.getLocalHour() in 1..5


    private fun beautifyName(name: String): String {
        return name.trim().capitalize()
    }


}


class DateTime {

    @RequiresApi(Build.VERSION_CODES.O)
    fun getLocalHour(): Int {
        return LocalDateTime.now().hour
    }


}