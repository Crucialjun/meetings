package com.rsk

import java.nio.file.Paths


fun main() {
    val postCode = UsZipCode("")

    val logger = Loggers.FileLogger(Paths.get("/some/file.log"))
    val meeting = Meeting("Review",
        UkAddress("A House",
            "A street",
            "A Town",
            "A Count",
            UkPostCode("")
        ),
        logger
    )
    val review = PersonalReview("Review Meeting",
        Participant(Name("Alice"),
            ""),
        listOf(),
        Room("Room 1"),
    logger)

    println("Created $review with the name ${review.meetingName} an at $review.location")


    review.closeReview()

    val name = Name("Kevin Jones")
    val participant = Participant(name,"kevin@rocksolidknowledge.com")



    val cannonicalEmail = participant.cannonicalEmail
    meeting.addParticipants(participant)
    //meeting.meetingName = "Review"

    meeting.logger
}