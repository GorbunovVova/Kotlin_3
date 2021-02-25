fun main(args: Array<String>) {

//    Напишите функцию, принимающую на вход имена сотрудников и возвращающую их количество.
//    Используйте для этого vararg, из предыдущей темы.

    println(getEmployeesCount("Вася", "Вова", "Саша", "Ваня", "Борис"))

}

fun getEmployeesCount(vararg employees: String): Int {

    var count = 0
    for (employee in employees) count++
    return count

}
