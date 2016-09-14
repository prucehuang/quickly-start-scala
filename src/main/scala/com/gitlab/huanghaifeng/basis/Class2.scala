package com.gitlab.huanghaifeng.basis
/**
 * @describe
 * 将对象作为参数传递，并要求该对象必须要有指定方法
 * @author HHF
 * @email huanghaifengdyx@163.com
 * @date 2016年5月21日 
 */
object Class2 {
    def main(args:Array[String]){    
        val conn: Connection = new Connection()
        withClose(conn, conn => println("do something with Connection"))
    }

    def withClose(closeAble: { def close(): Unit }, 
        op: { def close(): Unit } => Unit) {
        try {
            op(closeAble)
        } finally {
            closeAble.close()
        }
    }
}
class Connection {
    def close() = println("close Connection")
    def close1() = println("close Connection")
}
