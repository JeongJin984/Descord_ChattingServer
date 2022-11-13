package com.descord.chattingserver.data.converter.read

import com.descord.chattingserver.data.domain.UserServer
import com.descord.chattingserver.data.domain.VoiceChannel
import io.r2dbc.spi.Row
import org.springframework.core.convert.converter.Converter
import org.springframework.data.annotation.Id
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@ReadingConverter
class VoiceChannelReadConverter : Converter<Row, VoiceChannel> {
    override fun convert(source: Row): VoiceChannel? {
        TODO("Not yet implemented")
    }
}