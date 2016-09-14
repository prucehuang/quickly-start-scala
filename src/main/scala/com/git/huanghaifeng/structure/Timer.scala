package com.git.huanghaifeng.structure

import java.text.SimpleDateFormat

/**
 * @author dell
 */
object Timer {
    def oncePerSecond(callback:() => Unit){
        while(true){
            callback()
            Thread sleep 1000
        }
    }
    
    def timeFiles(){
        println("time files like an arrow . ")
    }
  
    val HOUR_SECONDE = 60 * 60
  
    def getCurrTimeIndex(): String = {
        import java.text.SimpleDateFormat
        val dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
        val currDateTime = System.currentTimeMillis()
        val timeMin = dateFormat.format(currDateTime).toLong
        println(timeMin)
        (timeMin / 10 * 10).toString
    }
  
    //时间向前推或向后推 amountHour 后的时间段
    def getPreTimeIndex(currTimeIndex: String, timeHour: Int): String = {
        val dateFormat = new SimpleDateFormat("yyyyMMddHHmm")
        val date = dateFormat.parse(currTimeIndex)
        val outDateStamp = (date.getTime / 1000) - timeHour * HOUR_SECONDE
        dateFormat.format(outDateStamp * 1000)
    }
  
    def getTimeIndexFormat(currTimeIndex: String, format: String = "yyyy-MM-ddT HH:mm:00Z"): String = {
        val dateFormat = new SimpleDateFormat(format)
        val date = dateFormat.parse(currTimeIndex)
        date.toString
    }
  
    def main(args:Array[String]){
//        oncePerSecond(timeFiles)
        println(getCurrTimeIndex)
        println()
    }
}