import kotlin.random.Random

fun main() {
    var number:Int = 0
    var count:Int = 0
    for(i in 1..2000){
        number = Random.nextInt(20,45)
        if (number> 38)
            count++
    }
    println("The number was greater than 38 " + count + " times")
}
