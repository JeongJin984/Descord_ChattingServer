package com.descord.chattingserver.data.mapper

import com.descord.chattingserver.data.domain.UserServer
import com.descord.chattingserver.data.domain.UserServerJoin
import com.descord.chattingserver.data.domain.enum.UserLevel
import io.r2dbc.spi.Row
import io.r2dbc.spi.RowMetadata
import java.util.function.BiFunction

class UserServerJoinMapper : BiFunction<Row, RowMetadata, UserServerJoin> {
    override fun apply(row: Row, u: RowMetadata): UserServerJoin {
        row["server_id"] ?. let {
            return UserServerJoin(
                row["id"].toString().toLong(),
                row["user_id"].toString().toLong(),
                UserLevel.valueOf(row["user_level"].toString().uppercase()),
                UserServer(
                    row["server_id"].toString().toLong(),
                    row["name"].toString()
                )
            )
        } ?: run {
            return UserServerJoin(
                row["id"].toString().toLong(),
                row["user_id"].toString().toLong(),
                UserLevel.valueOf(row["user_level"].toString().uppercase()),
                null
            )
        }
    }
}