package com.descord.chattingserver

import com.descord.chattingserver.data.domain.UserServerJoin
import com.descord.chattingserver.data.mapper.UserServerJoinMapper
import io.r2dbc.spi.Row
import io.r2dbc.spi.RowMetadata
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.util.function.BiFunction

class ChattingServerApplicationTests {

    @Test
    fun contextLoads() {
        val temp : BiFunction<Row, RowMetadata, UserServerJoin> = UserServerJoinMapper()
        val temp2 : (UserServerJoinMapper, Row, RowMetadata) -> UserServerJoin = UserServerJoinMapper::apply
    }

}
