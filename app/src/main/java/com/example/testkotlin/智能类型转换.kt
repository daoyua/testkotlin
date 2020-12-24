package com.example.testkotlin

class 智能类型转换 :TestInterface{
    val name:String = "sffes"
    override fun call(haha: Int) {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
    val value:TestInterface = 智能类型转换();
    if (value is 智能类型转换){
        println(value.name)
        println((value as 智能类型转换).name )
        println((value as? 智能类型转换)?.name )//失败为null
    }
}