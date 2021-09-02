fun main() {
    fun Double.format(digits: Int) = "%.${digits}f".format(this).replace('.',',')

    var valor = readLine()!!.toInt()
    val cedulas = arrayListOf<Double>(100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0)
    var nroCedulas: Int
    println(valor)
    for (cedula in cedulas) {
        nroCedulas = (valor / cedula.toInt())
        println("$nroCedulas nota(s) de R$ ${cedula.format(2)}")
        valor %= cedula.toInt()
    }
}