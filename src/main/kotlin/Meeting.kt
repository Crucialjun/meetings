package com.rsk

import java.nio.file.Paths


open class Meeting(val meetingName: String,open val location : Location ,val logger: Logger) {



    open val locationName = ""

    fun addParticipants(participant: Participant){
        if(verifyParticipant(participant)){
            println("Successfully Added")
        }
        println("Added ${participant.participantName}")
    }


    private fun verifyParticipant(participant: Participant) : Boolean{
        println("Try to verify")
        return true
    }

    protected open fun verifyMeeting(){

    }




}

class PersonalReview(meetingName: String,
                     val employee : Participant,
                     reviewers : List<Participant>,
                     override val location: Room,logger: Logger)
    : Meeting(meetingName,location,logger){

    override val locationName: String
        get() = super.locationName

    fun closeReview(){
        println("Review Ended")
        verifyMeeting()
    }

    override fun verifyMeeting() {
        println("Personal Review Verify Metting")
        super.verifyMeeting()
    }
}


