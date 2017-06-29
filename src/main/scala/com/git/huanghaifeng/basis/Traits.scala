//package com.git.huanghaifeng.basis
///**
// * @describe
// * Trait 为重用代码的一个基本单位
// * @author HHF
// * @email huanghaifengdyx@163.com
// * @date 2016年5月21日 
// */
//
//object Traits {
//    trait ForEachAble[A] {
//        def iterator: java.util.Iterator[A]
//        def foreach(f: A => Unit) = {
//            val iter = iterator
//            while (iter.hasNext)
//              f(iter.next)
//        }
//    }
//
//    trait JsonAble {
//        def toJson() = scala.util.parsing.json.JSONFormat.defaultFormatter(this)
//    }
//
//    def main(args:Array[String]){
//        val list = new java.util.ArrayList[Int]() with ForEachAble[Int] 
//        list.add(1) 
//        list.add(2)   
//        println("For each: "); 
//        list.foreach(x => println(x))
//        
//        val list1 = new java.util.ArrayList[Int]() with JsonAble 
//        list1.add(1) 
//        list1.add(2)   
//        println("For each: "); 
//        println("Json: " + list1.toJson())
//    }
//}