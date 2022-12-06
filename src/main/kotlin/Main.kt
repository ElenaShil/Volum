fun main(args: Array<String>) {

    // Найти объём параллелепипеда

    println("Длина параллелепипеда")
    val side1 = readln().toInt()
    println("Ширина параллелепипеда")
    val side2 = readln().toInt()
    println("Высота параллелепипеда")
    val side3 = readln().toInt()

    val rezult = side1 * side2 * side3

    println("Объём параллелепипеда равен:")
    println(rezult)
}