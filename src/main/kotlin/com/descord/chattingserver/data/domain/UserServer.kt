package com.descord.chattingserver.data.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import reactor.core.publisher.Flux

@Table("user_server")
class UserServer(
    @Id @Column("id") val id: Long?,
    @Column("name") val name: String,
) {
}