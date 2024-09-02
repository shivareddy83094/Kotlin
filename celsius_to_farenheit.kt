//creta a function to convert temperature from celsius to fahrenheit

    fun temp(cel: Int,f :Int){
        var f1 = (9/5)*cel + 32
        var cel1 = (5/9)*f - 32
        println("$cel celsius to $f1 farenheit")
        println("$f farenheit to $cel1 celsius")

    }
    temp(30,70)
