fun main() {
    // Запрашиваем ввод у пользователя
    println("Введите натуральное число: ")
    val input = readLine()

    // Проверяем, что введено число
    val number = input?.toIntOrNull()

    if (number != null && number > 0) {
        // Преобразуем число в двоичную систему
        val binaryString = number.toString(2)
        println("Двоичное представление числа $number: $binaryString")
    } else {
        println("Пожалуйста, введите корректное натуральное число.")
    }
}