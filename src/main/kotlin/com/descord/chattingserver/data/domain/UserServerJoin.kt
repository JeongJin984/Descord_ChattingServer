package com.descord.chattingserver.data.domain

import com.descord.chattingserver.data.domain.enum.UserLevel
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("user_server_join")
class UserServerJoin (
    @Id @Column("id") val id: Long,
    @Column("user_id") val userId: Long,
    @Column("user_level") val userLevel: UserLevel,
    val userServer: UserServer?
)