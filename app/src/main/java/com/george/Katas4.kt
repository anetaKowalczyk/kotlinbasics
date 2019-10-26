package com.george

class BowlingGame(var frames: Int = 10, var pins: Int, var score: Int) {


    var pinsInPreviousTry = 0
    var allPinsKnockedDown = 0

    fun roll(pins: Int): Int {
        if (frames != 0) {

            addPinsToAllKnocedDownPins()
            addPinsToPreviousTry()
            addPinsToScore()
            wasItSpare()
            deductFrame()
            return pins

        } else return pins
    }

    fun getScore() {

    }

    fun deductFrame() {
        frames -= 1
    }

    fun addFrame() {
        frames += 1

    }

    fun addPinsToScore() {
        score += pins

    }

    fun addPinsToAllKnocedDownPins() {
        allPinsKnockedDown += pins
    }

    fun addPinsToPreviousTry() {
        pinsInPreviousTry += pins
    }

    fun wasItSpare() {
        var isItStrike = pinsInPreviousTry + pins

        if (isItStrike == 10) {
            addFrame()
        }

    }

    fun strike() {

    }

}