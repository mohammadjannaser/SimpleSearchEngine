
package stage1

fun main() {
    val line = readln().split(" ")
    val search = readln()
    val index = line.indexOf(search) + 1
    if (index>0) println(index) else println("Not Found")
}