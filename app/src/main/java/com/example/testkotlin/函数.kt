package com.example.testkotlin

//vararg变长参数
fun testmain(vararg name:String):Unit{
    println(name.contentToString())
}
//多返回值
fun testmain1(vararg name:String):Triple<String,Int,Int>{
    println(name.contentToString())
    return Triple(name[0],1,2)
}
//添加默认值，可以不传,一般放最后可以不填或者显示的传值
fun hellow(name:String,password:String="haha"){
    println("name:$name,password:$password")
}
fun main(args: Array<String>) {
    hellow(name="haha")
    //函数的引用
  val test=  ::testmain1
    println(test(arrayOf("zy", "sfesf")))
    val x=::testmain
    x(arrayOf("sfesf","sgsege"))
 val k=TestMain()
    //方法的引用
    val m=k::sethaha
    val xx=TestMain::sethaha
  val y= TT::soutsss;
//    val ss=y("sfsefe","sfes")
    val login=TT::login
        //
}
