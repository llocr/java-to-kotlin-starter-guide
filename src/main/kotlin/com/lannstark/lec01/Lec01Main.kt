package com.lannstark.lec01

fun main() {
    var number1: Long = 10L // 바뀔 수 있다
    number1 = 5L

    val number2 = 10L // 바뀔 수 없다

    var number3: Long

    val number4: Long
    number4 = 11L

    var number5: Long? = 1_000L

    var person = Person("이희수") // new 사용 안 함!!
}