package com.digitalturbine.dtproductlist.data.ads

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml


@Xml
data class AdsRoot(
    @Element
    val ads: MutableList<AdData> = mutableListOf(),
    @PropertyElement
    val responseTime: String = "",
    @PropertyElement
    val totalCampaignsRequested: String = "",
    @PropertyElement
    val version: String = ""

)