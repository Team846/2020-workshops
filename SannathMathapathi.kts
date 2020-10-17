/*
Print out your name onto the console.
e.g. your program should print "Andy Min".
 */
fun level1() {
    // Your code here
    println("Sannath Mathapathi")
}

/*
Print out how many letters your name has.
DON'T hardcode a number and just print "8" for example.
You should set your name as a variable, and then print out how many letters
that variable has.
 */
fun level2() {
    // Your code here
    val name = "Sannath Mathapathi"
    println(name.length)

}

/*
Prompt the user to enter their some text, and then print out only the UPPERCASE
letters.
e.g. Entering "tHis iS a rANdoM meSSagE" should print out "HSANMSSE"
 */
fun level3() {
    // Your code here
    val input = readLine()!!

    for (character in input) {
        if (character.isUpperCase()){
            print(character)
        }
    }
}



level3()