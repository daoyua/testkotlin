package com.example.testkotlin

class 扩展方法 {
}
interface testtttt{
    fun hello():String
}
fun String.haha() {
    println("haha")
}
fun TT.zhege() {
    println("TT")
}


fun main(args: Array<String>) {
    val d:扩展方法=扩展方法()
    val t=TT("fsef","fse")
    val hhh:String="zzz"
    hhh.haha()
    t.zhege()
}