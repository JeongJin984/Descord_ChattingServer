package com.descord.chattingserver.data.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("voice_channel")
class VoiceChannel (
    @Id @Column("id") val id: Long,
    @Column("name") val name: String,
    val userServer: UserServer?
)