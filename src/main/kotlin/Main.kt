fun main() {
    var temperature = 1
    while (temperature != 0){
        print("Enter today's temperature between 92 and 104: ")
        temperature = readln().toInt()
        if (temperature < 95.5)
            println("Temperature is Low")
        else if  (temperature < 97.5)
            println("Temperature is Cool")
        else
            println("Temperature is High")
    }
}