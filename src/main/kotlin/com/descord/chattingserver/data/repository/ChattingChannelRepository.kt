package com.descord.chattingserver.data.repository

import com.descord.chattingserver.data.domain.ChattingChannel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ChattingChannelRepository : CoroutineCrudRepository<ChattingChannel, Long> {
}