package com.descord.chattingserver.data.converter.read

import com.descord.chattingserver.data.domain.UserServerJoin
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class UserServerJoinReadConverter : Converter<Row, UserServerJoin> {
    override fun convert(source: Row): UserServerJoin? {
        TODO("Not yet implemented")
    }
}