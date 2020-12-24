package com.example.testkotlin

class 属性引用 {

}

fun main(args: Array<String>) {
    val kk=TT::x
    val tt=TT("zz","yy")
    val name=tt::x
    kk.set(tt,"dsf")
    name.set("fsfes")
}