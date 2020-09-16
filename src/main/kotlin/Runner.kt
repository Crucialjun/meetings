package com.rsk




fun main() {
    val postCode = UsZipCode("")
    val meeting = Meeting("Review",
        UkAddress("A House",
            "A street",
            "A Town",
            "A Count",
            "A postalcode")
    )
    val review = PersonalReview("Review Meeting",
        Participant(Name("Alice"),
            ""),
        listOf(),
        Room("Room 1"))

    println("Created $review with the name ${review.meetingName} an at $review.location")


    review.closeReview()

    val name = Name("Kevin Jones")
    val participant = Participant(name,"kevin@rocksolidknowledge.com")



    val cannonicalEmail = participant.cannonicalEmail
    meeting.addParticipants(participant)
    //meeting.meetingName = "Review"

    meeting.logger
}