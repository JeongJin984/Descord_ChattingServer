package com.descord.chattingserver.data.converter.read

import com.descord.chattingserver.data.domain.ChattingChannel
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.annotation.Id
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@ReadingConverter
class ChattingChannelReadConverter : Converter<Row, ChattingChannel> {
    override fun convert(source: Row): ChattingChannel? {
        TODO("Not yet implemented")
    }
}