package com.digitalturbine.dtproductlist.data.ads;

import java.lang.System;

@androidx.room.Entity(tableName = "adsData")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0002\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0003\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0018\u001a\u00020\u000f\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u000f\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0003\u0010\u001f\u001a\u00020\u0003\u00a2\u0006\u0002\u0010 J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u000fH\u00c6\u0003J\t\u0010`\u001a\u00020\u000fH\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010g\u001a\u00020\u0003H\u00c6\u0003J\t\u0010h\u001a\u00020\u0003H\u00c6\u0003J\t\u0010i\u001a\u00020\u000fH\u00c6\u0003J\t\u0010j\u001a\u00020\u000fH\u00c6\u0003J\t\u0010k\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010n\u001a\u00020\u001eH\u00c6\u0003J\t\u0010o\u001a\u00020\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\t\u0010q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010s\u001a\u00020\u0003H\u00c6\u0003J\t\u0010t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010u\u001a\u00020\u0003H\u00c6\u0003J\t\u0010v\u001a\u00020\u0003H\u00c6\u0003J\u009b\u0002\u0010w\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\u00032\b\b\u0003\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u00032\b\b\u0003\u0010\u000b\u001a\u00020\u00032\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\u00032\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0003\u0010\u0010\u001a\u00020\u000f2\b\b\u0003\u0010\u0011\u001a\u00020\u00032\b\b\u0003\u0010\u0012\u001a\u00020\u00032\b\b\u0003\u0010\u0013\u001a\u00020\u00032\b\b\u0003\u0010\u0014\u001a\u00020\u00032\b\b\u0003\u0010\u0015\u001a\u00020\u00032\b\b\u0003\u0010\u0016\u001a\u00020\u00032\b\b\u0003\u0010\u0017\u001a\u00020\u00032\b\b\u0003\u0010\u0018\u001a\u00020\u000f2\b\b\u0003\u0010\u0019\u001a\u00020\u000f2\b\b\u0003\u0010\u001a\u001a\u00020\u00032\n\b\u0003\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u001d\u001a\u00020\u001e2\b\b\u0003\u0010\u001f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010x\u001a\u00020\u000f2\b\u0010y\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010z\u001a\u00020{H\u00d6\u0001J\t\u0010|\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\"\"\u0004\b&\u0010$R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\"\"\u0004\b(\u0010$R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\"\"\u0004\b*\u0010$R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\"\"\u0004\b.\u0010$R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\"\"\u0004\b0\u0010$R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\"\"\u0004\b2\u0010$R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\"\"\u0004\b4\u0010$R\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\"\"\u0004\b6\u0010$R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\"\"\u0004\b:\u0010$R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u001a\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\"\"\u0004\bD\u0010$R\u001e\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010@\"\u0004\bE\u0010BR \u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010$R\u001e\u0010\u0017\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\"\"\u0004\bI\u0010$R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010$R\u001e\u0010\u001f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010$R\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\"\"\u0004\bO\u0010$R\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010\"\"\u0004\bQ\u0010$R\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\"\"\u0004\bS\u0010$R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010\"\"\u0004\bU\u0010$R\u001e\u0010\u0016\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u0010\"\"\u0004\bW\u0010$R\u001e\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010@\"\u0004\bY\u0010BR\u001e\u0010\u0018\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010@\"\u0004\b[\u0010B\u00a8\u0006}"}, d2 = {"Lcom/digitalturbine/dtproductlist/data/ads/AdData;", "", "appPackageId", "", "avgRatingImgURL", "bidRate", "billingTypeId", "callToAction", "campaignDisplayOrder", "campaignId", "campaignTypeId", "categoryName", "clickProxyURL", "creativeId", "homeScreen", "", "isRandomPick", "numberOfRatings", "productDescription", "productId", "productName", "productThumbnail", "rating", "numberOfDownloads", "tstiEligible", "stiEnabled", "impressionTrackingURL", "minOSVersion", "appPrivacyPolicyUrl", "externalMetadata", "Lcom/digitalturbine/dtproductlist/data/ads/ExternalMeta;", "postInstallActions", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/digitalturbine/dtproductlist/data/ads/ExternalMeta;Ljava/lang/String;)V", "getAppPackageId", "()Ljava/lang/String;", "setAppPackageId", "(Ljava/lang/String;)V", "getAppPrivacyPolicyUrl", "setAppPrivacyPolicyUrl", "getAvgRatingImgURL", "setAvgRatingImgURL", "getBidRate", "setBidRate", "getBillingTypeId", "setBillingTypeId", "getCallToAction", "setCallToAction", "getCampaignDisplayOrder", "setCampaignDisplayOrder", "getCampaignId", "setCampaignId", "getCampaignTypeId", "setCampaignTypeId", "getCategoryName", "setCategoryName", "getClickProxyURL", "setClickProxyURL", "getCreativeId", "setCreativeId", "getExternalMetadata", "()Lcom/digitalturbine/dtproductlist/data/ads/ExternalMeta;", "setExternalMetadata", "(Lcom/digitalturbine/dtproductlist/data/ads/ExternalMeta;)V", "getHomeScreen", "()Z", "setHomeScreen", "(Z)V", "getImpressionTrackingURL", "setImpressionTrackingURL", "setRandomPick", "getMinOSVersion", "setMinOSVersion", "getNumberOfDownloads", "setNumberOfDownloads", "getNumberOfRatings", "setNumberOfRatings", "getPostInstallActions", "setPostInstallActions", "getProductDescription", "setProductDescription", "getProductId", "setProductId", "getProductName", "setProductName", "getProductThumbnail", "setProductThumbnail", "getRating", "setRating", "getStiEnabled", "setStiEnabled", "getTstiEligible", "setTstiEligible", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"})
@com.tickaroo.tikxml.annotation.Xml(name = "ad")
public final class AdData {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String appPackageId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "averageRatingImageURL")
    private java.lang.String avgRatingImgURL;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "bidRate")
    private java.lang.String bidRate;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "billingTypeId")
    private java.lang.String billingTypeId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "callToAction")
    private java.lang.String callToAction;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "campaignDisplayOrder")
    private java.lang.String campaignDisplayOrder;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "campaignId")
    private java.lang.String campaignId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "campaignTypeId")
    private java.lang.String campaignTypeId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "categoryName")
    private java.lang.String categoryName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "clickProxyURL")
    private java.lang.String clickProxyURL;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "creativeId")
    private java.lang.String creativeId;
    @androidx.room.ColumnInfo(name = "homeScreen")
    private boolean homeScreen;
    @androidx.room.ColumnInfo(name = "isRandomPick")
    private boolean isRandomPick;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "numberOfRatings")
    private java.lang.String numberOfRatings;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productDescription")
    private java.lang.String productDescription;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productId")
    private java.lang.String productId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productName")
    private java.lang.String productName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "productThumbnail")
    private java.lang.String productThumbnail;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "rating")
    private java.lang.String rating;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "numberOfDownloads")
    private java.lang.String numberOfDownloads;
    @androidx.room.ColumnInfo(name = "tstiEligible")
    private boolean tstiEligible;
    @androidx.room.ColumnInfo(name = "stiEnabled")
    private boolean stiEnabled;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "impressionTrackingURL")
    private java.lang.String impressionTrackingURL;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "minOSVersion")
    private java.lang.String minOSVersion;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "appPrivacyPolicyUrl")
    private java.lang.String appPrivacyPolicyUrl;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private com.digitalturbine.dtproductlist.data.ads.ExternalMeta externalMetadata;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "postInstallActions")
    private java.lang.String postInstallActions;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppPackageId() {
        return null;
    }
    
    public final void setAppPackageId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvgRatingImgURL() {
        return null;
    }
    
    public final void setAvgRatingImgURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBidRate() {
        return null;
    }
    
    public final void setBidRate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBillingTypeId() {
        return null;
    }
    
    public final void setBillingTypeId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCallToAction() {
        return null;
    }
    
    public final void setCallToAction(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCampaignDisplayOrder() {
        return null;
    }
    
    public final void setCampaignDisplayOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCampaignId() {
        return null;
    }
    
    public final void setCampaignId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCampaignTypeId() {
        return null;
    }
    
    public final void setCampaignTypeId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCategoryName() {
        return null;
    }
    
    public final void setCategoryName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClickProxyURL() {
        return null;
    }
    
    public final void setClickProxyURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreativeId() {
        return null;
    }
    
    public final void setCreativeId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getHomeScreen() {
        return false;
    }
    
    public final void setHomeScreen(boolean p0) {
    }
    
    public final boolean isRandomPick() {
        return false;
    }
    
    public final void setRandomPick(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberOfRatings() {
        return null;
    }
    
    public final void setNumberOfRatings(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductDescription() {
        return null;
    }
    
    public final void setProductDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductId() {
        return null;
    }
    
    public final void setProductId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductName() {
        return null;
    }
    
    public final void setProductName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProductThumbnail() {
        return null;
    }
    
    public final void setProductThumbnail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRating() {
        return null;
    }
    
    public final void setRating(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNumberOfDownloads() {
        return null;
    }
    
    public final void setNumberOfDownloads(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getTstiEligible() {
        return false;
    }
    
    public final void setTstiEligible(boolean p0) {
    }
    
    public final boolean getStiEnabled() {
        return false;
    }
    
    public final void setStiEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImpressionTrackingURL() {
        return null;
    }
    
    public final void setImpressionTrackingURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMinOSVersion() {
        return null;
    }
    
    public final void setMinOSVersion(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppPrivacyPolicyUrl() {
        return null;
    }
    
    public final void setAppPrivacyPolicyUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.data.ads.ExternalMeta getExternalMetadata() {
        return null;
    }
    
    public final void setExternalMetadata(@org.jetbrains.annotations.NotNull()
    com.digitalturbine.dtproductlist.data.ads.ExternalMeta p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPostInstallActions() {
        return null;
    }
    
    public final void setPostInstallActions(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public AdData(@org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "appId")
    java.lang.String appPackageId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "averageRatingImageURL")
    java.lang.String avgRatingImgURL, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "bidRate")
    java.lang.String bidRate, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "billingTypeId")
    java.lang.String billingTypeId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "callToAction")
    java.lang.String callToAction, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignDisplayOrder")
    java.lang.String campaignDisplayOrder, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignId")
    java.lang.String campaignId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignTypeId")
    java.lang.String campaignTypeId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "categoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "clickProxyURL")
    java.lang.String clickProxyURL, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "creativeId")
    java.lang.String creativeId, @com.tickaroo.tikxml.annotation.PropertyElement(name = "homeScreen")
    boolean homeScreen, @com.tickaroo.tikxml.annotation.PropertyElement(name = "isRandomPick")
    boolean isRandomPick, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "numberOfRatings")
    java.lang.String numberOfRatings, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productDescription")
    java.lang.String productDescription, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productId")
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productName")
    java.lang.String productName, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productThumbnail")
    java.lang.String productThumbnail, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "rating")
    java.lang.String rating, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "numberOfDownloads")
    java.lang.String numberOfDownloads, @com.tickaroo.tikxml.annotation.PropertyElement(name = "tstiEligible")
    boolean tstiEligible, @com.tickaroo.tikxml.annotation.PropertyElement(name = "stiEnabled")
    boolean stiEnabled, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "impressionTrackingURL")
    java.lang.String impressionTrackingURL, @org.jetbrains.annotations.Nullable()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "minOSVersion")
    java.lang.String minOSVersion, @org.jetbrains.annotations.Nullable()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "appPrivacyPolicyUrl")
    java.lang.String appPrivacyPolicyUrl, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.Element(name = "externalMetadata")
    com.digitalturbine.dtproductlist.data.ads.ExternalMeta externalMetadata, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "postInstallActions")
    java.lang.String postInstallActions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    public final boolean component12() {
        return false;
    }
    
    public final boolean component13() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    public final boolean component21() {
        return false;
    }
    
    public final boolean component22() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.data.ads.ExternalMeta component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.digitalturbine.dtproductlist.data.ads.AdData copy(@org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "appId")
    java.lang.String appPackageId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "averageRatingImageURL")
    java.lang.String avgRatingImgURL, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "bidRate")
    java.lang.String bidRate, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "billingTypeId")
    java.lang.String billingTypeId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "callToAction")
    java.lang.String callToAction, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignDisplayOrder")
    java.lang.String campaignDisplayOrder, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignId")
    java.lang.String campaignId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "campaignTypeId")
    java.lang.String campaignTypeId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "categoryName")
    java.lang.String categoryName, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "clickProxyURL")
    java.lang.String clickProxyURL, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "creativeId")
    java.lang.String creativeId, @com.tickaroo.tikxml.annotation.PropertyElement(name = "homeScreen")
    boolean homeScreen, @com.tickaroo.tikxml.annotation.PropertyElement(name = "isRandomPick")
    boolean isRandomPick, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "numberOfRatings")
    java.lang.String numberOfRatings, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productDescription")
    java.lang.String productDescription, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productId")
    java.lang.String productId, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productName")
    java.lang.String productName, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "productThumbnail")
    java.lang.String productThumbnail, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "rating")
    java.lang.String rating, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "numberOfDownloads")
    java.lang.String numberOfDownloads, @com.tickaroo.tikxml.annotation.PropertyElement(name = "tstiEligible")
    boolean tstiEligible, @com.tickaroo.tikxml.annotation.PropertyElement(name = "stiEnabled")
    boolean stiEnabled, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "impressionTrackingURL")
    java.lang.String impressionTrackingURL, @org.jetbrains.annotations.Nullable()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "minOSVersion")
    java.lang.String minOSVersion, @org.jetbrains.annotations.Nullable()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "appPrivacyPolicyUrl")
    java.lang.String appPrivacyPolicyUrl, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.Element(name = "externalMetadata")
    com.digitalturbine.dtproductlist.data.ads.ExternalMeta externalMetadata, @org.jetbrains.annotations.NotNull()
    @com.tickaroo.tikxml.annotation.PropertyElement(name = "postInstallActions")
    java.lang.String postInstallActions) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}