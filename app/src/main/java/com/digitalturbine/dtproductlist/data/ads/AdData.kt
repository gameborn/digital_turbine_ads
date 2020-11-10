package com.digitalturbine.dtproductlist.data.ads

import androidx.room.*
import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "ad")
@Entity(tableName = "adsData")
data class AdData(

  @PrimaryKey @PropertyElement(name = "appId") var appPackageId: String = "", //<appId>com.zynga.ozmatch</appId>
  @ColumnInfo(name = "averageRatingImageURL") @PropertyElement(name = "averageRatingImageURL") var avgRatingImgURL: String = "", //https://cdn1.appia.com/cdn/adpub/appwallv1/rated-5-5.png
  @ColumnInfo(name = "bidRate") @PropertyElement(name = "bidRate") var bidRate: String = "", //0.000
  @ColumnInfo(name = "billingTypeId") @PropertyElement(name = "billingTypeId") var billingTypeId: String, //1
  @ColumnInfo(name = "callToAction") @PropertyElement(name = "callToAction") var callToAction: String = "", //Install Now
  @ColumnInfo(name = "campaignDisplayOrder") @PropertyElement(name = "campaignDisplayOrder") var campaignDisplayOrder: String, //1
  @ColumnInfo(name = "campaignId") @PropertyElement(name = "campaignId") var campaignId: String, //2045
  @ColumnInfo(name = "campaignTypeId") @PropertyElement(name = "campaignTypeId") var campaignTypeId: String, //2
  @ColumnInfo(name = "categoryName") @PropertyElement(name = "categoryName") var categoryName: String = "", //Puzzle
  @ColumnInfo(name = "clickProxyURL") @PropertyElement(name = "clickProxyURL") var clickProxyURL: String = "", //URL
  @ColumnInfo(name = "creativeId") @PropertyElement(name = "creativeId") var creativeId: String, //483970
  @ColumnInfo(name = "homeScreen") @PropertyElement(name = "homeScreen") var homeScreen: Boolean, //false
  @ColumnInfo(name = "isRandomPick") @PropertyElement(name = "isRandomPick") var isRandomPick: Boolean, //false
  @ColumnInfo(name = "numberOfRatings") @PropertyElement(name = "numberOfRatings") var numberOfRatings: String = "", //10,000+
  @ColumnInfo(name = "productDescription") @PropertyElement(name = "productDescription") var  productDescription: String = "", //Desc
  @ColumnInfo(name = "productId") @PropertyElement(name = "productId") var productId: String, //1234
  @ColumnInfo(name = "productName") @PropertyElement(name = "productName") var productName: String = "", //Oz Wizard
  @ColumnInfo(name = "productThumbnail") @PropertyElement(name = "productThumbnail") var productThumbnail: String = "", //URL
  @ColumnInfo(name = "rating") @PropertyElement(name = "rating") var rating: String = "", //5.0
  @ColumnInfo(name = "numberOfDownloads") @PropertyElement(name = "numberOfDownloads") var numberOfDownloads: String = "", //10,000+
  @ColumnInfo(name = "tstiEligible") @PropertyElement(name = "tstiEligible") var tstiEligible: Boolean, //false
  @ColumnInfo(name = "stiEnabled") @PropertyElement(name = "stiEnabled") var stiEnabled: Boolean, //false
  @ColumnInfo(name = "impressionTrackingURL") @PropertyElement(name = "impressionTrackingURL") var impressionTrackingURL: String = "", //false
  @ColumnInfo(name = "minOSVersion") @PropertyElement(name = "minOSVersion") var minOSVersion: String? = "", //false
  @ColumnInfo(name = "appPrivacyPolicyUrl") @PropertyElement(name = "appPrivacyPolicyUrl") var appPrivacyPolicyUrl: String? = "", //false

  @Embedded @Element(name = "externalMetadata") var externalMetadata: ExternalMeta = ExternalMeta(), //false

  @ColumnInfo(name = "postInstallActions") @PropertyElement(name = "postInstallActions") var postInstallActions: String = "" //false
)

/*


<externalMetadata xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:nil="true"/>



<rating>5.0</rating>
<numberOfDownloads>10,000+</numberOfDownloads>
<tstiEligible>false</tstiEligible>
<stiEnabled>false</stiEnabled>
<postInstallActions/>
 */
