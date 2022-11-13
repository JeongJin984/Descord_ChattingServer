package com.descord.chattingserver.data.repository

import com.descord.chattingserver.data.domain.UserServer
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserServerRepository : CoroutineCrudRepository<UserServer, Long> {
    override suspend fun findById(id: Long): UserServer
}