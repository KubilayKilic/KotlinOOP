package com.kaan.kotlinoop

open class Fremen(name: String, planet: String, age: Int) {

    //encapsulation

    var name : String? = name
        private set
        get


    private var planet : String? = planet


    var age : Int? = age
        get
        private set

    private val bookName : String = "Dune"

    fun returnBookName(password: String) : String {
        if (password == "Kaan") {
            return bookName
        } else {
            return "Wrong password!"
        }
    }
}