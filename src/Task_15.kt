fun main(args: Array<String>) {

//    Создайте переменную, которая содержит лямбда выражение для вывода в консоль данных массива типа String.

    val printStringArray = { strings: Array<String> -> for (string in strings) println(string) }

    val countries = arrayOf("Russia", "Germany", "France")

    printStringArray(countries)

}
