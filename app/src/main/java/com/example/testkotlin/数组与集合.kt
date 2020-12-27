package com.example.testkotlin

class 数组与集合 {


}

fun main() {
    val a = arrayListOf<String>()
    val b = arrayOf("hello", "afea")
    println(b.contentToString())
    b.forEach { element -> println(element) }
    b.forEach { println(it) }
    if ("hello" in b) {
        println("有")
    }

    val aa=ArrayList<String>()
    val va=aa[3]
    aa+="sffes"
    aa-="sffes"
    val bb=HashMap<String,Any>()
    bb["gaga"]="gegs"
    println(bb["gaga"])

    val pair ="hello" to "kotlin"
    val pair2 =Pair("hello" , "kotlin")
    val first =pair.first
    val (s,y) =pair
}