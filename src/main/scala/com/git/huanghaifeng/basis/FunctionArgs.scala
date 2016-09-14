package com.git.huanghaifeng.basis
/**
 * @describe
 * 根据微妙的函数定义区别本质的区分传进来参数是函数，还是值
 * msg:String                     参数是一个值
 * msg: => String                 参数是一个函数，函数无需参数，并带一个返回值
 * msg:(String) => String         参数是一个函数，函数需要一个参数，并带一个返回值
 * msg:(String, String) => String 参数是一个函数，函数需要两个参数，并带一个返回值
 * @author HHF
 * @date 2016年5月20日
 */
object FunctionArgs {
    
    def main(args:Array[String]){
        val MSG = "programing is running"        
        log(MSG)
        
        def f(msg:String) = { "this is a arg function, "+msg }
        log1(f, "hah")
        
        def f1 = { "this is a no arg function" }
        log2(f1)
    }
    
    val logEnable = true
    def log(msg: String) = {
        if (logEnable){
            println(msg)
        }
    }
    def log1(msg:(String) => String, info:String) = {
        if (logEnable){
            println(msg(info))
        }
    }
    def log2(msg: => String) = {
        if (logEnable){
            println(msg)
        }
    }
}