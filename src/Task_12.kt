fun main(args: Array<String>) {

//    Напишите функцию, которая получает в параметры какой-либо год,
//    проверяет високосный ли это год и возвращает результат проверки.

    println(isLeapYear(2000))
    println(isLeapYear(2001))
    println(isLeapYear(1))
    println(isLeapYear(444))
}

fun isLeapYear(year: Int): String {
    if (year % 4 == 0) return "Високосный"
    return "Не високосный"
}