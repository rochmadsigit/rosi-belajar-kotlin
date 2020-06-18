package com.dicoding.kotlin

fun main(){
    val text = "Hello Kotlin"
    val result = text.run {
        val from = this
        val to = this.replace("Kotlin","Putri Chandra")
        "replace text from $from to $to"
    }
    println("result: $result")
    println("Initial commit to Git/GitHub, Basic Structure and simple Clases.")



}