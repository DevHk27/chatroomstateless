package com.hk.chatapp.statelesschatroom.repository

import com.hk.chatapp.statelesschatroom.entity.ChatRoomdetailsEntity
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ChatRoomStatelessRepository: MongoRepository<ChatRoomdetailsEntity, String> {
}