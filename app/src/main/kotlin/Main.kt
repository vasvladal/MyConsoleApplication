import java.io.PrintStream
import java.nio.charset.StandardCharsets

fun main() {
    System.setOut(PrintStream(System.out, true, StandardCharsets.UTF_8))
    System.setErr(PrintStream(System.err, true, StandardCharsets.UTF_8))

    println("Hello from MyConsoleApplication!")

    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = numbers.sum()
    println("Sum of $numbers = $sum")

    print("Назовите свое имя: ")
    val name = readLine() ?: "stranger"
    println("Nice to meet you, $name!")
}