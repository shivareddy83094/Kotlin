

fun main() {
    var a = 40
    println(a)
    var `try` = 20
    println(`try`)

    // Val cannot be reassigned
//    val b = 3
//    print(b)
//    b=a+b
//    print(b)

    //var a = 40
    var b : String
    println(a)

    var message = "hello"
    println(message)

    val a1=10
    val b1=20
    var result="sum of $a1 and $b1 is ${a1+b1}"
    println(result)

    val letter:Char='A'
    println("$letter")
    print('\n')
    println('\$')
    println('\\')

    val x:String="""reddy
        |  reddy
        |      reddy
        |          reddy
    """.trimMargin()
    var y:String="""shiva
        |shiva
        |shiva
        |shiva
        |shiva
    """.trimMargin()
    println(y)
    println(x)
    var z="""    ram
        |ram    ram
        |   ram
    """.trimMargin()
    println(z)

    //Arrays

    val numbers = arrayOf(1,2,3,4,5)
    val words:Array<String> = arrayOf("kotlin","python","java")
    val squares =Array(5){i -> i*i}

    val firstnum =numbers[0]
    val secondword = words[1]

    println("first number : $firstnum")
    println("second word : $secondword")

    //modifying array
    numbers[0] = 10
    words[1]="C language"

    println("modified value: $firstnum")
    println("modified 2nd  word : $secondword")

    //println(numbers) //gives address
    for (num in numbers){
        println(num)
    }


//Multi Dimensional array

    val matrix: Array<Array<Int>> = arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6))

    println("Element at row 0, column 1 : ${matrix[0][1]} ")

    val x1: Int = 100
    val y1: Long = x1.toLong()
    println(y1)

    var k = "hello"
    var l: String = k as String
    println("unsafe casting : $l")

    //val c : Int = k as Int
    //println("unsafe casting : $c")

    var e = 10
    var f = 6
    // Arithmetic Operators
    println("Addition : $e + $f = ${e + f}")
    println("Subtraction : $e - $f = ${e - f}")
    println("Multiplication : $e * $f = ${e * f}")
    println("Division : $e / $f = ${e / f}")
    println("Modulous : $e % $f = ${e % f}")

    //Relational Operators

    println("greater is $e : ${e > f}")
    println("lesser is $f : ${f < e}")
    println("GTE :${e >= f}")
    println("LTE :${e <= f}")
    println("Equal to :${e == f}")
    println("not Equal to :${e != f}")

//    Assignment Operators

    e += f
    println("e+=f is:$e")
    e -= f
    println("e-=f is:$e")
    e *= f
    println("e*=f is:$e")
    e /= f
    println("e/=f is:$e")
    e %= f
    println("e%=f is:$e")

    //Logical Operators
    println(e)
    println("Logical + is :${+e}")
    println("Logical - is :${-e}")
    println("Logical ++ is :${++e}")
    println("Logical -- is :${--e}")

    val temp = 25
    if (temp > 20) {
        println("Its a warm day")
    } else
        println("cool day")

    val age = 18
    if (age >= 18) {
        println("Major")
    } else {
        println("Minor")
    }

    val marks = 73
    if (marks >= 90) {
        println("A grade")
    } else if (marks >= 85) {
        println("B grade")
    } else if (marks >= 70) {
        println("C grade")
    } else {
        println("D grade")
    }

    // Construct a calculator by using if ,else for all arithmetic opertors

    val i = 6
    val j = 3
    val oper = "+"
    if (oper == "+") {
        println(i + j)
    } else if (oper == "-") {
        println(i - j)
    } else if (oper == "*") {
        println(i * j)
    } else if (oper == "/") {
        if (j != 0) {
            println(i / j)
        } else
            println("Error Division by zero")

    } else if (oper == "%") {
        println(i % j)
    }

    if (age < 13) {
        println("Child")
    } else if (age >= 13 && age <= 19) { // or (age in 13..19) specifies age 13 to 19
        println("Teenage")
    } else if (age in 20..64) {
        println("adult")
    } else {
        println("senior")
    }

    // When

    val dayofweek = 5

    val dayname = when (dayofweek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thrusday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println(dayname)

    val number = 8

    when {
        number % 2 == 0 -> println("$number is even")
        number % 2 != 0 -> println("$number is odd")
        else -> println("unexpeted number")

    }

    //For loop

    for (i in 1..5) {
        print(i)
    }
    println()

    for (i in 1 until 5) {
        print(i)
    }

    println()

    for (i in 5 downTo 1) {
        print(i)
    }
    println()
    for (i in 5 downTo 1 step 2) {
        print(i)
    }

    println()

    val fruits = listOf("Apple", "Banana", "Cherry")

    for (i in fruits) {
        println(i)
    }

    for (i in fruits.indices) {
        println("index is $i : ${fruits[i]}")
    }

    //While loop
    var m = 5
    while (m > 0) {
        print(m)
        m--
    }

    println()

    //do While

    var n = 5
    do {
        print(n)
        n--
    } while (n > 5)

    println()

    var n1=0
    do {
        print(n1)
        n1 ++
    } while (n1 <= 5)

    println()

    fun demo()
    {
        println("hello world")
    }

    demo()
    println("hiii")

    fun sum(a1:Int = 10,b1:Int =20){
        val c=a1+b1
        println(c)
    }
    sum(20,50)
    sum(a1,b1)
    //sum() // error will raise a,b not given

    //Return

    fun add(a2:Int,b2:Int):Int{
        val x =a2+b2
        return x
    }
    val ans = add(a2=10,b2=30)
    println(ans)

    //creta a function to convert temperature from celsius to fahrenheit

    fun temp(cel: Int,f :Int){
        var f1 = (9/5)*cel + 32
        var cel1 = (5/9)*f - 32
        println("$cel celsius to $f1 farenheit")
        println("$f farenheit to $cel1 celsius")

    }
    temp(30,70)

    // readLine() for input

    //Recusive Function
    



}
