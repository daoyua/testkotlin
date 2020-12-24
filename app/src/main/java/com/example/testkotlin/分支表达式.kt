package com.example.testkotlin

class 分支表达式 {
    val a: Int = 0
    var c: Int = 0

    val b: Int
        get() {
            TODO()
        }

    fun haha() {
        var d: Any=""
        when (a) {
            0 -> c = 5
            1 -> c = 100
            else -> c = 20
        }
        when  {
            d is String -> d = 5
            d == 1 -> d = 100
            else -> d = 20
        }
       c= when  {
            d is String -> 5
            d == 1 -> 100
            else ->  20
        }
    }
}

fun main(args: Array<String>) {
    val t:Int=128
    val t2:Int=128
    println(t===t2)

    val t3:Int?=128
    val t4:Int?=128
    println(t3===t4)

    val t5:Int?=127
    val t6:Int?=127
    println(t5===t6)
    //结果是true,false,true,因为int？是引用数据类型，缓存范围-128-127，超出就会new
}

