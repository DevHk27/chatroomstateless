package com.hk.chatapp.statelesschatroom.controller

import com.hk.chatapp.statelesschatroom.dto.JoinRoomDto
import com.hk.chatapp.statelesschatroom.dto.response.SuccessResponseDto
import com.hk.chatapp.statelesschatroom.service.ChatRoomService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ChatRoomController(
    val chatRoomService: ChatRoomService
) {

    @PostMapping("/create")
    fun createRoom(@RequestBody roomPasscode: String): ResponseEntity<SuccessResponseDto> {
        return ResponseEntity(
                SuccessResponseDto(
                    chatRoomService.createRoom(roomPasscode)
                ),
            HttpStatus.CREATED
        )
    }

    @PostMapping("/join")
    fun joinRoom(@RequestBody joinRoomDto: JoinRoomDto): ResponseEntity<Any> {
        return ResponseEntity(
                if (chatRoomService.joinRoom(joinRoomDto)){
                     "Room Joined"
                } else {
                       "Invalid Details"
                },
        HttpStatus.OK
        )
    }
}