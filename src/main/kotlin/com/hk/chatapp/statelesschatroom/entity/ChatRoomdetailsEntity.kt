package com.hk.chatapp.statelesschatroom.entity

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class ChatRoomdetailsEntity(
    @Id
    val roomId: String
)
