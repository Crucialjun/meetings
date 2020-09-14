package com.rsk

fun main() {
    val meeting = Meeting()

    println("Created $meeting")

    val participant = Participant()
    val name = Name()
    name.name = "Kevin"
    participant.name = name
    participant.email = "kevin@rocksolidknowledge.com"


    val cannonicalEmail = participant.cannonicalEmail
    meeting.addParticipants(participant)
    meeting.meetingName = "Review"

    meeting.logger
}