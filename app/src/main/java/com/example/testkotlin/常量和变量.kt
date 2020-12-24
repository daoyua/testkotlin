package com.example.testkotlin

class 常量和变量 {
    val b:Int
        get(){
        return (Math.random()*100).toInt()
    }
//    static final int b=3     const val b =3
}

//在局部变量中，kotlin和java的常量等价
//final int b=3     val b=3
//但是在顶级变量中
//class x{
//    val b:Int
//        get(){
//            return:(Math.random().toInt)
//        }
//}
//就是变量了



