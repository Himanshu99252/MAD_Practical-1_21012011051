
fun main(){
    println("Enter Value 1:")
    var a= readLine()!!.toFloat()
    println("Enter Value 2:")
    var b= readLine()!!.toFloat()
    println("Enter Value 3:")
    var c= readLine()!!.toFloat()
    add(a,b,c)
    sub(a,b,c)
    mul(a,b,c)
    div(a,b)
}

fun add(a:Float, b:Float,c:Float)
{
    var ans=a+b+c
    println("Addition of $a, $b and $c is:$ans")
}

fun sub(a:Float, b:Float,c:Float)
{
    var ans=a-b-c
    println("Substraction of $a, $b and $c is:$ans")
}

fun mul(a:Float, b:Float,c:Float)
{
    var ans=a*b*c
    println("Multiplication of $a, $b and $c is:$ans")
}

fun div(a:Float, b:Float)
{
    var ans=a/b
    println("Division of $a and $b is:$ans")
}