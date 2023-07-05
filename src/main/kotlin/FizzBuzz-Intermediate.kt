
fun fizzBuzzIntermediate(q:IntProgression) {
    val fizz = "Fizz"
    val fizzNo = 3

    val buzz = "Buzz"
    val buzzNo = 5

    val rizz = "Rizz"
    val rizzNo = 7

    val jazz = "Jazz"
    val jazzNo = 11

    val dizz = "Dizz"
    val dizzNo = 120

    for (i in q) {
//        Abomination starts here:
//        Fizz+
        if (i in fizzNo ..i step fizzNo && i in buzzNo..i step buzzNo) {
            println(fizz + buzz)
        }
        else if (i in fizzNo ..i step fizzNo && i in rizzNo..i step rizzNo) {
            println(fizz + rizz)
        }
        else if (i in fizzNo ..i step fizzNo && i in jazzNo..i step jazzNo) {
            println(fizz + jazz)
        }
        else if (i in fizzNo ..i step fizzNo && i in dizzNo..i step dizzNo) {
            println(fizz + dizz)
        }

        //        Buzz+
        if (i in buzzNo ..i step buzzNo && i in rizzNo..i step rizzNo) {
            println(buzz + rizz)
        }
        else if (i in buzzNo ..i step buzzNo && i in jazzNo..i step jazzNo) {
            println(buzz + jazz)
        }
        else if (i in fizzNo ..i step fizzNo && i in dizzNo..i step dizzNo) {
            println(buzz + dizz)
        }

        //        Rizz+
        else if (i in rizzNo ..i step rizzNo && i in jazzNo..i step jazzNo) {
            println(rizz + jazz)
        }
        else if (i in rizzNo ..i step rizzNo && i in dizzNo..i step dizzNo) {
            println(rizz + dizz)
        }

        //        Jazz+
        else if (i in jazzNo ..i step jazzNo && i in dizzNo..i step dizzNo) {
            println(jazz + dizz)
        }

//        Abomination ends here?
        else if (i in fizzNo..i step fizzNo) {
            println(fizz)
        }
        else if (i in buzzNo ..i step buzzNo){
            println(buzz)
        }
        else if (i in rizzNo ..i step rizzNo){
            println(rizz)
        }
        else if (i in jazzNo ..i step jazzNo){
            println(jazz)
        }
        else if (i in dizzNo ..i step dizzNo){
            println(dizz)
        }
        else {
            println("$i")
        }
    }
}

fun main(){
    fizzBuzzIntermediate(1..100)
}