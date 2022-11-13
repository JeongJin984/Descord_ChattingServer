package com.descord.chattingserver.data.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("chatting_content")
class ChattingContent (
    @Id @Column("id") val id: Long,
    @Column("content") val content: String,
    @Column("attachment") val attachment: String,
    @Column("created_at") val createdAt: LocalDate,
    val chattingChannel: ChattingChannel?
)