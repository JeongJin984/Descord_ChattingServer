package com.descord.chattingserver.data.repository

import com.descord.chattingserver.data.domain.UserServerJoin
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository

interface UserServerJoinRepository : CoroutineCrudRepository<UserServerJoin, Long> {
    @Query("select * from user_server_join sj inner join user_server us on sj.server_id = us.id where sj.user_id = 1")
    fun getServerJoinedByUserId(userId: Long)
}