fun main(args: Array<String>) {

    fun forceChocke() {
        println("You have failed me for the last time Admiral..")
    }

    forceChocke()

    fun makeAnEntrance(line: String) {
        println(line)
    }

    makeAnEntrance("I find your lack of faith disturbing...")

    fun calculateNumberGoodGuys(rebels: Int, ewoks: Int): Int {
        val goodGuys = rebels + ewoks
        return goodGuys
    }

    val rebels = calculateNumberGoodGuys(5, 7)

    println("Darth Vader faced off against $rebels rebel scum")
    println("Darth Vader faced off against ${calculateNumberGoodGuys(5,7)} rebel scum")

    fun vaderIsFeeling(mood: String = "angry"){
        println(mood)
    }

    vaderIsFeeling()
    vaderIsFeeling("meh")
}


