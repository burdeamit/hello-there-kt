package gradleExample;

class kotlinApp {
    public fun getGreeting(): String {
        return "Hello There!"
    }

}

fun main() {
    val app = kotlinApp()
    println(app.getGreeting())
}


