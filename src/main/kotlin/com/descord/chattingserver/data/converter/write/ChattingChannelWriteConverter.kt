package com.descord.chattingserver.data.converter.write

import com.descord.chattingserver.data.domain.ChattingChannel
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.WritingConverter
import org.springframework.data.r2dbc.mapping.OutboundRow

@WritingConverter
class ChattingChannelWriteConverter : Converter<ChattingChannel, OutboundRow> {
    override fun convert(source: ChattingChannel): OutboundRow? {
        TODO("Not yet implemented")
    }

}