package com.digitalturbine.dtproductlist.api

import com.digitalturbine.dtproductlist.data.auth.RecipientData

class ParamsBuilder
{
    class Builder
    {
        var params = mutableMapOf<String, String>()

        fun addRecipient(recipientData: RecipientData) = apply{

            params.apply {
                put(RequestParamNames.ID, recipientData.id)
                put(RequestParamNames.PASSWORD, recipientData.password)
                put(RequestParamNames.DEVICE_ID, recipientData.deviceId)
                put(RequestParamNames.SESSION_ID, recipientData.sessionId)
                put(RequestParamNames.SITE_ID, recipientData.siteId)
            }

        }

        fun addParam(name: String, value: String) = apply { params.put(name, value) }

        fun build() = params
    }
}