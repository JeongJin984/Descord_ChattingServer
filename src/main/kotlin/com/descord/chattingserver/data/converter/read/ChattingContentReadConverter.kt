package com.descord.chattingserver.data.converter.read

import com.descord.chattingserver.data.domain.ChattingChannel
import com.descord.chattingserver.data.domain.ChattingContent
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.annotation.Id
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@ReadingConverter
class ChattingContentReadConverter : Converter<Row, ChattingContent> {
    override fun convert(source: Row): ChattingContent? {
        TODO("Not yet implemented")
    }
}