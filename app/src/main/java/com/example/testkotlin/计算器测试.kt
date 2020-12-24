package com.example.testkotlin

import javax.xml.transform.Source

fun showHelp() {
    println("""Simple Calculator
        |input 3*4
        |Output:12
        |
    """.trimIndent())
}

fun main(vararg args: String) {
    if (args.size < 3) {

        return showHelp()
    }
    val operators = mapOf(
            "+" to ::plus,
            "-" to ::minus,
            "*" to ::times,
            "/" to ::div
    )
    val op = args[1]
     val opFuns = operators[op] ?: return showHelp()
    try {
        println("Input:${args.joinToString(" ")}")
        println("Output:${opFuns(args[0].toInt(), args[2].toInt())}")
    } catch (e: Exception) {
        println("Invalid Arguments")
        showHelp()
    }
}

fun plus(arg0: Int, arg1: Int): Int {
    return arg0 + arg1
}

fun minus(arg0: Int, arg1: Int): Int {
    return arg0 - arg1
}

fun times(arg0: Int, arg1: Int): Int {
    return arg0 * arg1
}

fun div(arg0: Int, arg1: Int): Int {
    return arg0 / arg1
}

