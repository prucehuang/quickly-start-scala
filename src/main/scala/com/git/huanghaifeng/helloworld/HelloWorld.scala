package com.git.huanghaifeng.helloworld

object HelloWorld {
//    def main(args: Array[String]){
//        println("haha, hello, I'am coming")
//    }
  
    def main(args: Array[String]) {
  
        val x = HelloWorld(5)
        println(x)
  
        x match
        {
           case HelloWorld(num) => println(x + " 是 " + num + " 的两倍！")
           //unapply 被调用
           case _ => println("无法计算")
        }
  
     }
     def apply(x: Int) = x*2
     def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}

