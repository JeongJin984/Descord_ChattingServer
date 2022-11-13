package com.descord.chattingserver.data.converter.write

import com.descord.chattingserver.data.domain.UserServer
import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.WritingConverter
import org.springframework.data.r2dbc.mapping.OutboundRow

@WritingConverter
class UserServerJoinWriteConverter : Converter<UserServer, OutboundRow> {
    override fun convert(source: UserServer): OutboundRow? {
        TODO("Not yet implemented")
    }

}