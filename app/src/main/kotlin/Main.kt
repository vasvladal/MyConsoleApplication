fun main() {
    println("Hello from MyConsoleApplication!")

    // A tiny example to make debugging worthwhile:
    // set a breakpoint on the next line and step through it.
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
    println("Sum of $numbers = $sum")

    print("Enter your name: ")
    val name = readLine() ?: "stranger"
    println("Nice to meet you, $name!")
}