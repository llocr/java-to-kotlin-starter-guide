package com.lannstark.lec03

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4 = number3?.toLong() ?: 0L

    val person = Person("이희수", 26)
    val name = "이희수"
    println("이름 : ${person.name} & ${name} ")

    val str = """
        HELLO
        WORLD
        ${name}
        ${person.age}
    """.trimIndent()

    println(str)

    val str2 = "ABC"
    println(str2[0])
    println(str2[1])
    println(str2[2])
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        val person = obj as Person
//        println(person.age)

        println(obj.age) // 스마트캐스트
    } else if (obj !is Person) {
        println("Not a person")
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}