package com.digitalturbine.dtproductlist.ext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"BASE_URL_REQUEST_ADS", "", "DEVELOPER_LAST_NAME", "REQUEST_AUTHORIZATION", "REQUEST_GET_ADS", "TOTAL_CAMPAIGNS_PER_REQUEST", "app_debug"})
public final class APIContractKt {
    
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
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL_REQUEST_ADS = "http://ads.appia.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_GET_ADS = "/getAds";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_AUTHORIZATION = "/authorization";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOTAL_CAMPAIGNS_PER_REQUEST = "10";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DEVELOPER_LAST_NAME = "melnichenko";
}