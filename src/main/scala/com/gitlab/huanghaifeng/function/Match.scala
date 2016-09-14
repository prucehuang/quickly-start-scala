package com.gitlab.huanghaifeng.function
/**
 * @describe
 * 斐波那契数列被实现了
 * @author HHF
 * @email huanghaifengdyx@163.com
 * @date 2016年5月21日 
 */

object Match {
    def fibonacci(in: Any): Int = in match {
        case 0 => 0
        case 1 => 1
        case n: Int if (n > 1) => fibonacci(n - 1) + fibonacci(n - 2)
//        case n: Int => 
        case _ => 0
    }

    def main(args:Array[String]){
        println(fibonacci(5))
        println(fibonacci("3"))
        println(fibonacci(-3))
    }
}