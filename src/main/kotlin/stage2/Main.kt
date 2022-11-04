package stage2


fun main() {
    println("Enter the number of people:")
    val noOfPeople = readln().toInt()

    println("Enter all people:")
    val people = Array(noOfPeople) { readln() }

    println("Enter the number of search queries:")
    val noOfQueries = readln().toInt()

    repeat (noOfQueries) {
        println("Enter data to search people:")
        val query = readln()

        val matches = people.filter { it.contains(query, ignoreCase = true) }
        if (matches.isEmpty()) {
            println("No matching people found.")
        } else {
            matches.forEach { println(it) }
        }
    }
}
