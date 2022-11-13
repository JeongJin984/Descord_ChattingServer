package com.descord.chattingserver.data.converter.read

import com.descord.chattingserver.data.domain.UserServer
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter

@ReadingConverter
class UserServerReadConverter : Converter<Row, UserServer> {
    override fun convert(source: Row): UserServer? {
        TODO("Not yet implemented")
    }
}