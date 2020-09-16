package com.rsk

import java.lang.IllegalArgumentException
import java.util.regex.Pattern

abstract class PostalCode(val postCode : String) {
    abstract fun verify()

    init {
        verify()
    }
}

class UsZipCode(zipcode : String) : PostalCode(zipcode) {
    override fun verify(){
        val pattern = Pattern.compile("[0-9]{5}(?:-[0-9]{4})?$")
        val matcher = pattern.matcher(postCode)
        if(!matcher.matches()) throw IllegalArgumentException()
    }
}

class UkPostCode(postcode : String) : PostalCode(postcode) {
    override fun verify(){

    }
}







