package com.descord.chattingserver.data.repository

import com.descord.chattingserver.data.domain.VoiceChannel
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface VoiceChannelRepository : CoroutineCrudRepository<VoiceChannel, Long> {
}