package com.example.testkotlin

class TT (var x:String,var j:String):抽象类(),TestInterface{//class TT (var x:String,var j:String):抽象类(),TestInterface{//

    fun soutsss(vararg name:String){
        println(name.contentToString())
    }

    fun login(name:String,password:String){
        println("name:$name,password:$password")
    }
    fun login1(l:(TT,String,String)->Unit,name:String,password: String){
        l.invoke(TT(name,password),name,password)

    }

    override fun absMethod() {
        TODO("Not yet implemented")
    }

    override fun call(haha: Int) {
        TODO("Not yet implemented")
    }
}

fun main(args: Array<String>) {
       val x= TT("ff","ff")
    x.zhege()
    val ss:String="sfse"
    ss.haha()
    val k=TT::login
                x.login1(k,"www","fseef")
    var nullable:String ?="hello"
    nullable=null
//    val length:Int? =nullable?.length//安全访问
    val length:Int=nullable?.length ?:0//安全访问 ?.可为空，就不放为后面的成员了， ?:为空的值为
//    val length =nullable!!.length//强转为非空
//    平台类型   调用除了kotlin的其他语言的函数返回的类型是平台类型 val title! =object.method()
}