package com.git.huanghaifeng.basis
/**
 * @describe
 * 柯里化的细节过程
 * @author HHF
 * @email huanghaifengdyx@163.com
 * @date 2016年5月21日 
 */
object Currying {
    def main(args:Array[String]){
        add(1,2)
        println(add1(1,2))
        println(add2(1)(2))
        println(add3(1,2){3})
    }
    /**
     * 无返回值，纯接收参数处理
     */
    def add(a:Int, b:Int){
        println(a+b)
    }
    /**
     * 接收参数处理，并默认最后一行为返回值
     */
    def add1(a:Int, b:Int) = {
        a*b
        a+b
    }
    /**
     * 上一个函数柯里化的前身
     */
    def add2(a:Int)(b:Int) = {
        a+b
    }
    /**
     * 函数体内还可以接收参数，，，
     */
    def add3(a:Int, b:Int) = {(c:Int) => {
        a+b+c
    }}
}