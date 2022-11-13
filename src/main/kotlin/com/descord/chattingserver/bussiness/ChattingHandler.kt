package com.descord.chattingserver.bussiness

import com.descord.chattingserver.ChattingServerApplication
import com.descord.chattingserver.data.domain.UserServer
import com.descord.chattingserver.data.domain.UserServerJoin
import com.descord.chattingserver.data.mapper.UserServerJoinMapper
import com.descord.chattingserver.data.repository.UserServerRepository
import io.r2dbc.spi.ConnectionFactory
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.r2dbc.core.DatabaseClient
import org.springframework.stereotype.Controller
import org.springframework.transaction.annotation.Transactional
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Controller
class ChattingHandler(
    val userServerRepository: UserServerRepository,
    val connectionFactory: ConnectionFactory
) {
    private val LOGGER: Logger = LoggerFactory.getLogger(ChattingServerApplication::class.java)

    @MessageMapping("userServer.joined")
    fun getJoinedServer(@Payload userId: Long): Flux<UserServer> {
        val databaseClient: DatabaseClient = DatabaseClient.create(connectionFactory)

        return databaseClient
            .sql("select * from user_server_join sj inner join user_server us on sj.server_id = us.id where sj.user_id=:userId")
            .bind("userId", userId)
            .map { row -> UserServer(
                    row["server_id"].toString().toLong(),
                    row["name"].toString()
                )
            }
            .all()
    }

    @MessageMapping("join.info")
    @Transactional
    fun getIncludingChannels(@Payload serverId: Long): Flux<UserServerJoin> {
        val databaseClient: DatabaseClient = DatabaseClient.create(connectionFactory)
        val userServerJoinMapper: UserServerJoinMapper = UserServerJoinMapper()

        return databaseClient
            .sql("select * from user_server_join sj " +
                    "inner join user_server us on sj.server_id = us.id " +
                    "where sj.server_id=:serverId"
            )
            .bind("serverId", serverId)
            .map(userServerJoinMapper::apply)
            .all()
            .log()
    }

}