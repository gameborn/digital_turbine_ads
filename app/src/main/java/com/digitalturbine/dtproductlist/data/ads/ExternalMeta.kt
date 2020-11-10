package com.digitalturbine.dtproductlist.data.ads

import com.tickaroo.tikxml.annotation.Attribute
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "externalMetadata")
data class ExternalMeta (
    @Attribute(name = "xmlns:xsi")
    val external1: String = "",
    @Attribute(name = "xsi:nil")
    val external2: Boolean = false
)
