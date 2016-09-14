package com.git.huanghaifeng.basis
/**
 * @describe
 * 定义一个类，并创建对象
 * 定义类、方法、变量、私有变量
 * @author HHF
 * @email huanghaifengdyx@163.com
 * @date 2016年5月21日 
 */
object Class {
    def main(args:Array[String]){    
        val obama: Persion = new Persion("Barack", "Obama")
        
        println("Persion: " + obama)
        println("firstName: " + obama.firstName)
        println("lastName: " + obama.lastName)
        obama.age_=(51)
        //可以简化为obama.age = 53，居然是内部定义好的
        obama.setAge(52)
        
        println("age: " + obama.age)
    }
}

class Persion(val firstName: String, val lastName: String) {
    private var _age = 0
    def age = _age
    def age_=(newAge: Int) = _age = newAge
    def setAge(newAge: Int) = _age = newAge
    def fullName() = firstName + " " + lastName
    override def toString() = fullName()
}
