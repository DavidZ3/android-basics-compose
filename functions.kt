// This to learn about functions in kt :D

fun main() {
    greeting1()
    greeting2()
    println(addQuotes("This function adds double-quotes around a str and returns it."))

    val weight: Double = calWeightFromMass(mass=100.0, gravityAccel=9.81)
    println("If your mass is 100kg then you'll weigh ${weight}N on Earth's sea-level.")

    println("Doubling the base10 number 5 gives " + doubleNumber(5) + ".")
}

// Functions can have no return values declared for Unit (Null/None/Void)
fun greeting1() {
    println("This function takes in no args and prints this meessage.")
}

fun greeting2(): Unit {
    println("This function has a jexplicirtly declared return type of Unit (None).")
}

fun addQuotes(str: String): String {
    return "\"$str\""
}

fun calWeightFromMass(mass: Double, gravityAccel: Double): Double {
    return mass*gravityAccel
}

// Kt also allows for default args
fun doubleNumber(number: Int, base10: Boolean = true): Int {
    if(base10) {
        return 2*number
    }else {
        return number shl 1
    }
}
