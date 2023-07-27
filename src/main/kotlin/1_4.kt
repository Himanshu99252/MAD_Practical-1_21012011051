fun main() {
    println("Enter a Number: ");
    val n1 = Integer.valueOf(readLine())
    if (n1 % 2 == 0)
        println("$n1 is an Even Number")
    else
        println("$n1 is an Odd Number")
}