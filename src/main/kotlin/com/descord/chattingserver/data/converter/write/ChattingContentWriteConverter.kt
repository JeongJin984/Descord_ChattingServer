package com.descord.chattingserver.data.converter.write

import com.descord.chattingserver.data.domain.ChattingChannel
import com.descord.chattingserver.data.domain.ChattingContent
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter
import org.springframework.data.r2dbc.mapping.OutboundRow

@WritingConverter
class ChattingContentWriteConverter : Converter<ChattingContent, OutboundRow> {
    override fun convert(source: ChattingContent): OutboundRow? {
        TODO("Not yet implemented")
    }

}