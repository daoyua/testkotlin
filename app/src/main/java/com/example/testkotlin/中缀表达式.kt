package com.example.testkotlin

class 中缀表达式 {
}

infix fun String.haha(count: Int): String {
    val index = count % length
    return this.substring(index) + this.substring(0, index)
}

fun main() {
    println("hahahhelloworld".haha(5))
    println("hahahhelloworld" haha (5))//有infix和一个参数可以省略

}