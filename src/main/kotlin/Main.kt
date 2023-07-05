
fun fizzBuzz(r:IntProgression) {
    for (i in r) {
        if (i in 3 ..10 step 3 && i in 5..10 step 5) {
            println("FizzBuzz")
        }
        else if (i in 3..i step 3) {
            println("Fizz ($i)")
        }
        else if (i in 5 ..i step 5){
            println("Buzz ($i)")
        }
        else {
            println("$i")
        }
    }
}

fun main(){
    fizzBuzz(1..10)
}