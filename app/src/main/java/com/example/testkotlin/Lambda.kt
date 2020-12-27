package com.example.testkotlin

class Lambda {
}
//kotlin的Lambda是匿名函数
//java只是sam语法糖 Single abstract method
val func=fun (){//func就是函数名
    println("hello")
}
val f2:(Int) ->Unit ={
    p:Int ->
    println(p)
}
    val f1={
        p1:Int->
        println(p1)
        "Hello"
    }  //表达式最后一行就为返回值
//函数类型就是传入参数返回什么结果
fun main() {
    println(f1(3))
}