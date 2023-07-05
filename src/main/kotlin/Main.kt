
fun fizzBuzz(r:IntProgression) {
    for (i in r) {
        when (i) {
            in 3..3 -> {
                println("Fizz")
            }
            in 5 ..5 -> {
                println("Buzz")
            }
            else -> {
                println("$i")
            }
        }
    }
}

fun main(){
    fizzBuzz(1..10)
}