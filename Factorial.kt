fun main(args: Array<String>) {
    val num = 6
    val fact = factorial(num)
    println("Factorial of $num = $fact")
}

fun factorial(num: Int): Long {
    if (num >= 1)
        return num * factorial(num - 1)
    else
        return 1
}
