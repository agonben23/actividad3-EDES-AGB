fun main() {
    println("¿Cuantas columnas quiere que tenga el primer vector?")
    val nColV1 = readLine()!!.toInt()
    println("¿Cuantas columnas quiere que tenga el segundo vector?")
    val nColV2 = readLine()!!.toInt()
    val v1 = cargarArray(nColV1)
    val v2 = cargarArray(nColV2)
    val matriz = crearMatriz(v1,v2)
    imprimirMatriz(matriz)
}
fun cargarArray(columnas : Int): ArrayList<Int>{
    val vector = arrayListOf<Int>()
    var i = 0
    do {
        vector.add(2*i + columnas)
        i++
    }while (i != columnas)
    return vector
}
fun crearMatriz(v1: ArrayList<Int>,v2: ArrayList<Int>): ArrayList<ArrayList<Int>> {
    return arrayListOf(v1,v2)
}
fun imprimirMatriz(matriz : ArrayList<ArrayList<Int>>){
    matriz.forEach {
        it.forEach { print("$it - ") }
        print("\n")
    }
}