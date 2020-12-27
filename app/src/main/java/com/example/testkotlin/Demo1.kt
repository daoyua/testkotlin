package com.example.testkotlin

class Demo1 {

}

operator fun String.minus(right:Any?):String{
    return this.replaceFirst(right.toString(),"")
}
operator fun String.times(right:Int):String{
    return (1..right).joinToString(""){this}
}
operator fun String.div(right:Any?):Int{
    val right=right.toString()
    return this.windowed(right.length,1){
        it==right
    }.count{it}
}
fun main() {
    val value="HelloWorld"
    println(value-"World")
    val start="*"
    println("*" *20)

    println(value/3)
    println(value/"|")
    println(value/"o")
}