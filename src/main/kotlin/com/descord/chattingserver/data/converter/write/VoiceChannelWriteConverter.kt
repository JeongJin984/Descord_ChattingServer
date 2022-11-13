package com.descord.chattingserver.data.converter.write

import com.descord.chattingserver.data.domain.ChattingChannel
import com.descord.chattingserver.data.domain.VoiceChannel
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter
import org.springframework.data.r2dbc.mapping.OutboundRow

@WritingConverter
class VoiceChannelWriteConverter : Converter<VoiceChannel, OutboundRow> {
    override fun convert(source: VoiceChannel): OutboundRow? {
        TODO("Not yet implemented")
    }

}