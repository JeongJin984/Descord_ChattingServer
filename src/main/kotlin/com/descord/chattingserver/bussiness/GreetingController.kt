package com.descord.chattingserver.bussiness

import com.descord.chattingserver.data.domain.UserServer
import com.descord.chattingserver.data.domain.UserServerJoin
import com.descord.chattingserver.data.domain.enum.UserLevel
import com.descord.chattingserver.data.mapper.UserServerJoinMapper
import com.descord.chattingserver.data.repository.UserServerRepository
import io.r2dbc.spi.ConnectionFactory
import io.r2dbc.spi.Row
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.concurrent.Flow.Subscriber

@RestController
class GreetingController(
    val userServerRepository: UserServerRepository,
    val connectionFactory: ConnectionFactory
) {

    @GetMapping("/")
    suspend fun test(): UserServer {
        return userServerRepository.findById(1L)
    }

    @GetMapping("/t")
    fun test2(): Flux<UserServerJoin> {
        val databaseClient: DatabaseClient = DatabaseClient.create(connectionFactory)
        val userServerJoinMapper = UserServerJoinMapper()

        return databaseClient
            .sql("select * from user_server_join sj inner join user_server us on sj.server_id = us.id where sj.user_id=:userId")
            .bind("userId", 1)
            .map(userServerJoinMapper::apply)
            .all()
    }
}
