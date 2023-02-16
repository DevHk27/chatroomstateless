package com.hk.chatapp.statelesschatroom.service.impl

import com.hk.chatapp.statelesschatroom.dto.JoinRoomDto
import com.hk.chatapp.statelesschatroom.service.ChatRoomService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ChatRoomServiceImpl: ChatRoomService {
    override fun createRoom(roomPasscode: String): String {
        val roomId = UUID.randomUUID().toString().substring(0,6)
        print(roomPasscode)
        return "Room Created: "+roomId
    }

    override fun joinRoom(joinRoomDto: JoinRoomDto): Boolean {
        println(joinRoomDto)
        return false
    }


}