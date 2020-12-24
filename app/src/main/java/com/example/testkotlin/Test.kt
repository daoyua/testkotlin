package com.example.testkotlin

import android.util.Size
import kotlin.reflect.KClass

var age:Int=123;
val haha=22
val name2:String="haha"
var name:String="haha"
var name1:String?=null
val float1=1f
val double1= float1.toDouble()
fun main(args: Array<String>) {
    name1=name;
//    name= name1!!;
    prinlen("zy周瑜")
    setClass(TestMain::class.java)
    setClass(MainActivity::class)
    var testMain:TestMain=TestMain()
    var test1=TestMain()
    var h:Int=23
    var h2=23
    println("hello world")
    val d= arrayOf("hello","world")
    d[1]="kotlin"
    println("${d[0]},${d[1]},${d.size}")

    val c1=IntArray(5){it}
    if(1 in c1){
        println("is exit")
    }
    if(1 !in c1){
        println("is exit")
    }
    for (k in 0..10)
        println("num:$k")
    println(c1)
    val aaa=ArrayList<String>()
//    aaa.add()相等 aaa+=
    c1.forEach { println("it:$it") }
    val pair ="hello" to "ajf"
    val pair2=Pair("hello","kjf")
    pair.first;
}

fun prinlen (str: String):String{
    println("haha这个是：$str")
    return "";
}
fun setClass (calss: Class<TestMain>){
    println(calss.simpleName)
}
fun setClass (calss: KClass<MainActivity>){
    println(calss.simpleName)
}