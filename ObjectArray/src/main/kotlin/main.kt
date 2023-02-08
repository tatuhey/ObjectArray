/*
    Name        : Raihan Khalil Abdillah
    ID          : 30065695
    AT1 - Portofolio 1, Activity 7 Task A
    Custom-made objects
*/

fun main(args: Array<String>) {
    val a: Array<Names> = arrayOf(
        Names("Alex", 19, "Thornlie"),
        Names("Britney", 20, "Maddington"),
        Names("Charlie", 21, "Armadale")
    )


    for (i in a)
        i.displayDetails()
}