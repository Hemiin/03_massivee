
fun main() {
    println("Введите слова через запятую. Пример ate,tea,tan")
    println("Ввод:")
    val inpuuut: String = readln()
    val result = Sorteed(inpuuut)

    println("Результат: ")
    for (i in result) {
//        println(i)
    }
}

fun Sorteed(inpuuut: String): List< String>{

    var wwod = inpuuut.split("").map { it.trim() }.filter { it.isNullOrBlank() }
    var charList = StringBuilder()
    val listik = mutableListOf<String>()

    listik.add(charList.toString())
    val yyy = mutableMapOf<String, MutableList<String>>()
    for( i in listik){
        var arr = i.toCharArray()

        println(arr.sorted().toString())
//        yyy.put(arr.toString(), (i))
    }

//    val result = List<String>
//    return result
    return listik
}