fun main() {
    val nutcases = readLine()!!.toInt()
    for (i in 1..nutcases) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        val c = a + b
        println(c)
    }
}