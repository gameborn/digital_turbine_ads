package com.digitalturbine.dtproductlist.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.digitalturbine.dtproductlist.data.ads.AdData;
import com.digitalturbine.dtproductlist.data.ads.ExternalMeta;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AdsDAO_Impl implements AdsDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AdData> __insertionAdapterOfAdData;

  public AdsDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdData = new EntityInsertionAdapter<AdData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `adsData` (`appPackageId`,`averageRatingImageURL`,`bidRate`,`billingTypeId`,`callToAction`,`campaignDisplayOrder`,`campaignId`,`campaignTypeId`,`categoryName`,`clickProxyURL`,`creativeId`,`homeScreen`,`isRandomPick`,`numberOfRatings`,`productDescription`,`productId`,`productName`,`productThumbnail`,`rating`,`numberOfDownloads`,`tstiEligible`,`stiEnabled`,`impressionTrackingURL`,`minOSVersion`,`appPrivacyPolicyUrl`,`postInstallActions`,`external1`,`external2`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdData value) {
        if (value.getAppPackageId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAppPackageId());
        }
        if (value.getAvgRatingImgURL() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getAvgRatingImgURL());
        }
        if (value.getBidRate() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getBidRate());
        }
        if (value.getBillingTypeId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getBillingTypeId());
        }
        if (value.getCallToAction() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getCallToAction());
        }
        if (value.getCampaignDisplayOrder() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCampaignDisplayOrder());
        }
        if (value.getCampaignId() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getCampaignId());
        }
        if (value.getCampaignTypeId() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCampaignTypeId());
        }
        if (value.getCategoryName() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getCategoryName());
        }
        if (value.getClickProxyURL() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getClickProxyURL());
        }
        if (value.getCreativeId() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getCreativeId());
        }
        final int _tmp;
        _tmp = value.getHomeScreen() ? 1 : 0;
        stmt.bindLong(12, _tmp);
        final int _tmp_1;
        _tmp_1 = value.isRandomPick() ? 1 : 0;
        stmt.bindLong(13, _tmp_1);
        if (value.getNumberOfRatings() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getNumberOfRatings());
        }
        if (value.getProductDescription() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getProductDescription());
        }
        if (value.getProductId() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getProductId());
        }
        if (value.getProductName() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getProductName());
        }
        if (value.getProductThumbnail() == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, value.getProductThumbnail());
        }
        if (value.getRating() == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, value.getRating());
        }
        if (value.getNumberOfDownloads() == null) {
          stmt.bindNull(20);
        } else {
          stmt.bindString(20, value.getNumberOfDownloads());
        }
        final int _tmp_2;
        _tmp_2 = value.getTstiEligible() ? 1 : 0;
        stmt.bindLong(21, _tmp_2);
        final int _tmp_3;
        _tmp_3 = value.getStiEnabled() ? 1 : 0;
        stmt.bindLong(22, _tmp_3);
        if (value.getImpressionTrackingURL() == null) {
          stmt.bindNull(23);
        } else {
          stmt.bindString(23, value.getImpressionTrackingURL());
        }
        if (value.getMinOSVersion() == null) {
          stmt.bindNull(24);
        } else {
          stmt.bindString(24, value.getMinOSVersion());
        }
        if (value.getAppPrivacyPolicyUrl() == null) {
          stmt.bindNull(25);
        } else {
          stmt.bindString(25, value.getAppPrivacyPolicyUrl());
        }
        if (value.getPostInstallActions() == null) {
          stmt.bindNull(26);
        } else {
          stmt.bindString(26, value.getPostInstallActions());
        }
        final ExternalMeta _tmpExternalMetadata = value.getExternalMetadata();
        if(_tmpExternalMetadata != null) {
          if (_tmpExternalMetadata.getExternal1() == null) {
            stmt.bindNull(27);
          } else {
            stmt.bindString(27, _tmpExternalMetadata.getExternal1());
          }
          final int _tmp_4;
          _tmp_4 = _tmpExternalMetadata.getExternal2() ? 1 : 0;
          stmt.bindLong(28, _tmp_4);
        } else {
          stmt.bindNull(27);
          stmt.bindNull(28);
        }
      }
    };
  }

  @Override
  public void insertAll(final List<AdData> ads) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAdData.insert(ads);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public AdData load(final String campaignId) {
    final String _sql = "SELECT * FROM adsData WHERE campaignId =?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (campaignId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, campaignId);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAppPackageId = CursorUtil.getColumnIndexOrThrow(_cursor, "appPackageId");
      final int _cursorIndexOfAvgRatingImgURL = CursorUtil.getColumnIndexOrThrow(_cursor, "averageRatingImageURL");
      final int _cursorIndexOfBidRate = CursorUtil.getColumnIndexOrThrow(_cursor, "bidRate");
      final int _cursorIndexOfBillingTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "billingTypeId");
      final int _cursorIndexOfCallToAction = CursorUtil.getColumnIndexOrThrow(_cursor, "callToAction");
      final int _cursorIndexOfCampaignDisplayOrder = CursorUtil.getColumnIndexOrThrow(_cursor, "campaignDisplayOrder");
      final int _cursorIndexOfCampaignId = CursorUtil.getColumnIndexOrThrow(_cursor, "campaignId");
      final int _cursorIndexOfCampaignTypeId = CursorUtil.getColumnIndexOrThrow(_cursor, "campaignTypeId");
      final int _cursorIndexOfCategoryName = CursorUtil.getColumnIndexOrThrow(_cursor, "categoryName");
      final int _cursorIndexOfClickProxyURL = CursorUtil.getColumnIndexOrThrow(_cursor, "clickProxyURL");
      final int _cursorIndexOfCreativeId = CursorUtil.getColumnIndexOrThrow(_cursor, "creativeId");
      final int _cursorIndexOfHomeScreen = CursorUtil.getColumnIndexOrThrow(_cursor, "homeScreen");
      final int _cursorIndexOfIsRandomPick = CursorUtil.getColumnIndexOrThrow(_cursor, "isRandomPick");
      final int _cursorIndexOfNumberOfRatings = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfRatings");
      final int _cursorIndexOfProductDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "productDescription");
      final int _cursorIndexOfProductId = CursorUtil.getColumnIndexOrThrow(_cursor, "productId");
      final int _cursorIndexOfProductName = CursorUtil.getColumnIndexOrThrow(_cursor, "productName");
      final int _cursorIndexOfProductThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "productThumbnail");
      final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
      final int _cursorIndexOfNumberOfDownloads = CursorUtil.getColumnIndexOrThrow(_cursor, "numberOfDownloads");
      final int _cursorIndexOfTstiEligible = CursorUtil.getColumnIndexOrThrow(_cursor, "tstiEligible");
      final int _cursorIndexOfStiEnabled = CursorUtil.getColumnIndexOrThrow(_cursor, "stiEnabled");
      final int _cursorIndexOfImpressionTrackingURL = CursorUtil.getColumnIndexOrThrow(_cursor, "impressionTrackingURL");
      final int _cursorIndexOfMinOSVersion = CursorUtil.getColumnIndexOrThrow(_cursor, "minOSVersion");
      final int _cursorIndexOfAppPrivacyPolicyUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "appPrivacyPolicyUrl");
      final int _cursorIndexOfPostInstallActions = CursorUtil.getColumnIndexOrThrow(_cursor, "postInstallActions");
      final int _cursorIndexOfExternal1 = CursorUtil.getColumnIndexOrThrow(_cursor, "external1");
      final int _cursorIndexOfExternal2 = CursorUtil.getColumnIndexOrThrow(_cursor, "external2");
      final AdData _result;
      if(_cursor.moveToFirst()) {
        final String _tmpAppPackageId;
        _tmpAppPackageId = _cursor.getString(_cursorIndexOfAppPackageId);
        final String _tmpAvgRatingImgURL;
        _tmpAvgRatingImgURL = _cursor.getString(_cursorIndexOfAvgRatingImgURL);
        final String _tmpBidRate;
        _tmpBidRate = _cursor.getString(_cursorIndexOfBidRate);
        final String _tmpBillingTypeId;
        _tmpBillingTypeId = _cursor.getString(_cursorIndexOfBillingTypeId);
        final String _tmpCallToAction;
        _tmpCallToAction = _cursor.getString(_cursorIndexOfCallToAction);
        final String _tmpCampaignDisplayOrder;
        _tmpCampaignDisplayOrder = _cursor.getString(_cursorIndexOfCampaignDisplayOrder);
        final String _tmpCampaignId;
        _tmpCampaignId = _cursor.getString(_cursorIndexOfCampaignId);
        final String _tmpCampaignTypeId;
        _tmpCampaignTypeId = _cursor.getString(_cursorIndexOfCampaignTypeId);
        final String _tmpCategoryName;
        _tmpCategoryName = _cursor.getString(_cursorIndexOfCategoryName);
        final String _tmpClickProxyURL;
        _tmpClickProxyURL = _cursor.getString(_cursorIndexOfClickProxyURL);
        final String _tmpCreativeId;
        _tmpCreativeId = _cursor.getString(_cursorIndexOfCreativeId);
        final boolean _tmpHomeScreen;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfHomeScreen);
        _tmpHomeScreen = _tmp != 0;
        final boolean _tmpIsRandomPick;
        final int _tmp_1;
        _tmp_1 = _cursor.getInt(_cursorIndexOfIsRandomPick);
        _tmpIsRandomPick = _tmp_1 != 0;
        final String _tmpNumberOfRatings;
        _tmpNumberOfRatings = _cursor.getString(_cursorIndexOfNumberOfRatings);
        final String _tmpProductDescription;
        _tmpProductDescription = _cursor.getString(_cursorIndexOfProductDescription);
        final String _tmpProductId;
        _tmpProductId = _cursor.getString(_cursorIndexOfProductId);
        final String _tmpProductName;
        _tmpProductName = _cursor.getString(_cursorIndexOfProductName);
        final String _tmpProductThumbnail;
        _tmpProductThumbnail = _cursor.getString(_cursorIndexOfProductThumbnail);
        final String _tmpRating;
        _tmpRating = _cursor.getString(_cursorIndexOfRating);
        final String _tmpNumberOfDownloads;
        _tmpNumberOfDownloads = _cursor.getString(_cursorIndexOfNumberOfDownloads);
        final boolean _tmpTstiEligible;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfTstiEligible);
        _tmpTstiEligible = _tmp_2 != 0;
        final boolean _tmpStiEnabled;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfStiEnabled);
        _tmpStiEnabled = _tmp_3 != 0;
        final String _tmpImpressionTrackingURL;
        _tmpImpressionTrackingURL = _cursor.getString(_cursorIndexOfImpressionTrackingURL);
        final String _tmpMinOSVersion;
        _tmpMinOSVersion = _cursor.getString(_cursorIndexOfMinOSVersion);
        final String _tmpAppPrivacyPolicyUrl;
        _tmpAppPrivacyPolicyUrl = _cursor.getString(_cursorIndexOfAppPrivacyPolicyUrl);
        final String _tmpPostInstallActions;
        _tmpPostInstallActions = _cursor.getString(_cursorIndexOfPostInstallActions);
        final ExternalMeta _tmpExternalMetadata;
        if (! (_cursor.isNull(_cursorIndexOfExternal1) && _cursor.isNull(_cursorIndexOfExternal2))) {
          final String _tmpExternal1;
          _tmpExternal1 = _cursor.getString(_cursorIndexOfExternal1);
          final boolean _tmpExternal2;
          final int _tmp_4;
          _tmp_4 = _cursor.getInt(_cursorIndexOfExternal2);
          _tmpExternal2 = _tmp_4 != 0;
          _tmpExternalMetadata = new ExternalMeta(_tmpExternal1,_tmpExternal2);
        }  else  {
          _tmpExternalMetadata = null;
        }
        _result = new AdData(_tmpAppPackageId,_tmpAvgRatingImgURL,_tmpBidRate,_tmpBillingTypeId,_tmpCallToAction,_tmpCampaignDisplayOrder,_tmpCampaignId,_tmpCampaignTypeId,_tmpCategoryName,_tmpClickProxyURL,_tmpCreativeId,_tmpHomeScreen,_tmpIsRandomPick,_tmpNumberOfRatings,_tmpProductDescription,_tmpProductId,_tmpProductName,_tmpProductThumbnail,_tmpRating,_tmpNumberOfDownloads,_tmpTstiEligible,_tmpStiEnabled,_tmpImpressionTrackingURL,_tmpMinOSVersion,_tmpAppPrivacyPolicyUrl,_tmpExternalMetadata,_tmpPostInstallActions);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
