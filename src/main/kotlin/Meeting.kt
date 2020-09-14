package com.rsk

import java.lang.IllegalArgumentException

class Meeting {
    internal val logger = Logger()

    var meetingName : String =""
    fun addParticipants(participant: Participant){
        if(verifyParticipant(participant)){
            println("Succesfully Added")
        }
        println("Added ${participant.participantName}")
    }


    private fun verifyParticipant(participant: Participant) : Boolean{
        println("Try to verify")
        return true
    }

    protected fun verifyMeeting(){

    }


}
class Participant{
    var name  : Name = Name()
    var email = ""

    val participantName
    get() = name.name
    val cannonicalEmail
        get() = email.toUpperCase()
}

class Name {
    var name : String  = ""
    set(value) {
        if(value.isNullOrBlank()) throw  IllegalArgumentException()
        field = value
    }
}