class Car(
    val type: String,
    val model: String,
    val price: Double,
    val owner: String,
    var milesDrive: Int
) {

    fun getOriginalCarPrice(): Double {
        return price
    }


    fun getCurrentCarPrice(): Double {

        val depreciationPercentage = (milesDrive / 10000) * 10
        return price * (1 - depreciationPercentage / 100)
    }


    fun displayCarInfo() {
        println("Type: $type")
        println("Model: $model")
        println("Price: $price")
        println("Owner: $owner")
        println("Miles Driven: $milesDrive")
    }
}

fun main() {

    val myCar = Car("Sedan", "Toyota Camry", 25000.0, "John Doe", 50000)

    // Accessing properties of the car object
    println("Car Type: ${myCar.type}")
    println("Car Model: ${myCar.model}")
    println("Car Price: ${myCar.price}")
    println("Car Owner: ${myCar.owner}")
    println("Miles Driven: ${myCar.milesDrive}")


    println("Original Car Price: ${myCar.getOriginalCarPrice()}")
    println("Current Car Price: ${myCar.getCurrentCarPrice()}")


    myCar.displayCarInfo()
}
