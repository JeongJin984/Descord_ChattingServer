package com.descord.chattingserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ChattingServerApplication

fun main(args: Array<String>) {
    runApplication<ChattingServerApplication>(*args)
}
