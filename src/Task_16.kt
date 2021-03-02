import kotlin.math.sqrt

fun main(args: Array<String>) {

//    Напишите функцию для переменных типа Double, возвращающую корень числа

    fun Double.sqrt(): Double {
        return sqrt(this)
    }

    val doubleVar: Double = 9.0

    println(doubleVar.sqrt())

}