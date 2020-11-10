package com.digitalturbine.dtproductlist.ext

/**
 * Global constants
 *
 * @author Rustem Melnichenko
 *
 * @param BASE_URL_REQUEST_ADS - base url to request data
 * @param REQUEST_GET_ADS - request to get list of ads
 * @param REQUEST_AUTHORIZATION - request to authorize application
 * @param TOTAL_CAMPAIGNS_PER_REQUEST - default amount of ads per request
 * @param DEVELOPER_LAST_NAME - special parameter
 */

const val BASE_URL_REQUEST_ADS: String = "http://ads.appia.com"
const val REQUEST_GET_ADS: String = "/getAds"
const val REQUEST_AUTHORIZATION: String = "/authorization"

const val TOTAL_CAMPAIGNS_PER_REQUEST = "10"
const val DEVELOPER_LAST_NAME = "melnichenko"