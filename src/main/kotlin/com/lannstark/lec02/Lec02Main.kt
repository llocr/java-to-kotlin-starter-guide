package com.lannstark.lec02

fun main() {
    val str: String? = null
    println(str?.length) // null

    val str2: String? = null
    println(str2?.length ?: 0) // 0

    println(startsWithA5("ABC"))
//    println(startsWithA5(null)) // NPE 남

    val person = Person("공부하는 개발자")
    startsWithA6(person.name)

}

fun startsWithA1(str: String?): Boolean {
//    if (str == null) {
//        throw IllegalArgumentException("null이 들어왔습니다.")
//    }
//
//    return str.startsWith("A")

    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
//    if (str == null) {
//        return null
//    }
//
//    return str.startsWith("A")

    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")

    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA5(str: String?): Boolean {
    return str!!.startsWith("A")    // null 절대 아님
}

fun startsWithA6(str: String): Boolean {
    return str.startsWith("A")
}