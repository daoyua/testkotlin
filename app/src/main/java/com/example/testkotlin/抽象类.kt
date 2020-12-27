package com.example.testkotlin

abstract class 抽象类 {//默认不可复写
    abstract fun absMethod()
    open fun hahah(){//加了open关键字，可以复写的

    }
    fun hahaha(){//不可复写

    }

}