package com.gitlab.huanghaifeng.basis

/**
 * @author dell
 */
object Helloworld {
  
    def main1(args: Array[String]) = println("Hello world!")
    
    def main(args: Array[String]){
      println("Hello world!")
      
      println(squareVal(10,12))
      println(addone(squareVal, 10))
    }
    
    /**
     * try a function's function define
     */
    def addone(f:(Int,Int)=>Int, arg:Int) = {
        f(arg, arg) + 1
    }
    def squareVal(a:Int, b:Int) = a*b
}