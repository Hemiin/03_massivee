package Base

fun main() {
    println("Введите слова: ")
    val input = readLine()
    if (input.isNullOrBlank()) {
        println("Ввод пустой")
        return
    }

    val words = input.split(" ").map { it.trim() }
    val groupedWords = groupWord(words)

    println("Результат: ")
    for (i in groupedWords){
        println(i)
    }
}

fun groupWord(words: List<String>): List<List<String>> {
    val groups = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        val key = word.toCharArray().sorted().joinToString("")

        if (!groups.containsKey(key)) {
            groups[key] = mutableListOf()
        }
        groups[key]?.add(word)
    }

    return groups.values.toList()
}