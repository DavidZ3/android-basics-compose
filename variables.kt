// This file is used to learn the different variable types
// Avaliable to kotlin

fun main() {
    var integer1 : Int = 1
    println("The value of integer1 is $integer1.")
    /*
    Note: If you don't provide an initial value when you declare a variable, you must specify the type.
    In this line of code, no initial value is provided, so you must specify the data type:
    val count: Int
    In this line of code, an assigned value is provided, so you can omit the data type:
    val count = 2
     */

    // Both are valid but just declaring a variable without a type is not
    val count1: Int
    val count2 = 2
    // Testing if kotlin allows read-access to unintialised variables (clearly doesn't)
    // println("Printing count1 $count1")
    count1 = count2
    println("Printing count1 $count1.")
    println("Printing count2 $count2.")

    // kt also has in-string variable maths similar to f-stringsw
    var fStringInt1 : Int = 2
    var fStringInt2 : Int = 3

    println("Adding the variables fStringInt1 and fStringInt2 gives ${fStringInt1 + fStringInt2}.")

    // There's also the variable type val which is immutable
    val cantChangeThisInt : Int = 4
    // cantChangeThisInt = 3 would be illegal
    println("Val-Type Int is: ${cantChangeThisInt}.")


    // There are many ways to increement
    var count : Int = 0
    count = count + 1
    count += count
    count++
    println("Count is: ${count}.")

    // There are also doubles
    val accurateDouble : Double = 1.0/2 + 1.0/3 + 1.0/6
    println("The value of accurateDouble is $accurateDouble.")
    println("Thus $accurateDouble = 1. Q.E.D.")

    // Also strings
    val coolString1 : String = "My name is "
    val coolString2 : String = "David"

    // We can cat strings using +
    val catString : String = coolString1 + coolString2
    println(catString)

    // Like other languages \ can be used to escape stuff
    println("Using an escape on quotes gives \"$catString\".")

    // We also have bools
    val bool : Boolean = true
    print(bool)


}