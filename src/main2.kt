//practice 03

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    if(age <= 12){
        return 15
    }else if(isMonday && age >= 13 && age <= 60){
        return 25
    }else if (age >= 13 && age <= 60){
        return 30
    } else {
        return 20
    }
}
