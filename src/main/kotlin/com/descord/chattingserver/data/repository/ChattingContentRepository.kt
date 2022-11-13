package com.descord.chattingserver.data.repository

import com.descord.chattingserver.data.domain.ChattingContent
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface ChattingContentRepository : CoroutineCrudRepository<ChattingContent, Long> {
}