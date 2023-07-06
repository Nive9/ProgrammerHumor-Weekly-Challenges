// Run in browser/ Playground
// https://pl.kotl.in/oBPelxTcK

fun fizzBuzzIntermediate(q:IntProgression) {
    for (i in q) {
        val fizz = i in 3..i step 3
        val buzz = i in 5..i step 5
        val rizz = i in 7..i step 7
        val jazz = i in 11..i step 11
        val dizz = 120 % i == 0

        if (!fizz && !buzz && !rizz && !jazz && !dizz) {
            print(i)
        }
        else {
            if(fizz) {
                print("Fizz")
            }
            if(buzz) {
                print("Buzz")
            }
            if(rizz) {
                print("Rizz")
            }
            if(jazz) {
                print("Jazz")
            }
            if(dizz) {
                print("Dizz")
            }
        }
        println("")
    }
}

fun main(){
    fizzBuzzIntermediate(1..100)
}