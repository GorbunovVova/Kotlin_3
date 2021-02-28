fun main(args: Array<String>) {

/*    Напишите функцию, которая выводит в консоль информацию сотрудника (ФИО, Возраст, Должность и Семейное положение).
С помощью перезагрузки функции, сделайте варианты, когда известны только:

    - ФИО и Должность

    - ФИО, Возраст и Должность

    - ФИО, Семейное положение и Должность

    - ФИО, Возраст, Семейное положение и Должность*/

    printEmployee("Петров Петр Петрович", "Дворник")

    printEmployee("Никитин Никита Никитович", 22, "Стажер")

    printEmployee("Васькин Василий Васильевич", "Холост", "Программист")

    printEmployee("Иванов Иван Иванович", 33, "Женат", "Директор")


}

fun printEmployee(fullName:String, position:String)
        = println("ФИО: $fullName, Должность: $position")

fun printEmployee(fullName:String, age:Int, position:String)
        = println("ФИО: $fullName, Возраст: $age, Должность: $position")

fun printEmployee(fullName:String, maritalStatus: String, position:String)
        = println("ФИО: $fullName, Семейное положение: $maritalStatus, Должность: $position")

fun printEmployee(fullName:String, age:Int, maritalStatus: String, position:String)
        = println("ФИО: $fullName, Возраст: $age, Семейное положение: $maritalStatus, Должность: $position")



