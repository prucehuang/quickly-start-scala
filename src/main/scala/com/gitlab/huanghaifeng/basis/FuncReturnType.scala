package com.gitlab.huanghaifeng.basis

/**
 * @author dell
 */
object FuncReturnType {
   //写法一，始终待返回值
   def add(x:Int,y:Int):Int={
     x+y
   }
    
   def returnUnit():Unit={
     println("another way to return void")
   }
    
   //写法二，省略非Unit返回值；如果没有写返回值，则根据等号后面的东西进行类型推演
   def test(x:Int)={
      x
   }
    
   //写法三，省略等号，返回Unit
   def returnVoid(){
     println("return void")
   }
    
   //写法四：省略花括号，如果函数仅包含一条语句，那么连花括号都可以选择不写
   def max2(x: Int, y: Int) = if (x > y) x else y 
    
   def greet() = println("Hello, world!") 
   
   def main(args:Array[String]):Unit ={
      println(add(1,2))
      println(test(1))
   }
}