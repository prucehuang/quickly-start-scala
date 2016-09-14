//package com.gitlab.huanghaifeng.basis
//
//import scala.reflect.io.File
//import java.util.Scanner
///**
// * @describe
// * 读取指定文件中的内容，自定义输出格式
// * @author HHF
// * @date 2016年5月20日
// */
//object scanerFile {
//    def withScanner(f: File, op: Scanner => Unit) = {
//        val scanner = new Scanner(f.bufferedReader)
//        try {
//            op(scanner)
//        } finally {
//            scanner.close()
//        }
//    }
//
//    def main(args:Array[String]){
//        withScanner(File("D:\\Inveno\\test_data\\word.txt"),
//            scanner => {
//                var num:Int = 1;
//                while(scanner.hasNext()){
//                    println(num + " is " + scanner.next())
//                    num += 1
//                }
//            }
//        )
//    }
//}