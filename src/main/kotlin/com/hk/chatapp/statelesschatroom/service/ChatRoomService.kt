package com.hk.chatapp.statelesschatroom.service

import com.hk.chatapp.statelesschatroom.dto.JoinRoomDto


interface ChatRoomService {
    fun createRoom(roomPasscode: String): String
    fun joinRoom(joinRoomDto: JoinRoomDto): Boolean
}