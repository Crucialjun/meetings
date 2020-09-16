package com.rsk

class Participant(val name : Name,val email:String){

    val participantName
        get() = name.name
    val cannonicalEmail
        get() = email.toUpperCase()
}