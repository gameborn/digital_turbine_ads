package com.digitalturbine.dtproductlist.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.digitalturbine.dtproductlist.db.dao.AdsDAO;
import com.digitalturbine.dtproductlist.db.dao.AdsDAO_Impl;
import com.digitalturbine.dtproductlist.db.dao.RecipientDataDAO;
import com.digitalturbine.dtproductlist.db.dao.RecipientDataDAO_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MainDatabase_Impl extends MainDatabase {
  private volatile RecipientDataDAO _recipientDataDAO;

  private volatile AdsDAO _adsDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(3) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `recipientData` (`id` TEXT NOT NULL, `password` TEXT NOT NULL, `siteId` TEXT NOT NULL, `deviceId` TEXT NOT NULL, `sessionId` TEXT NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `adsData` (`appPackageId` TEXT NOT NULL, `averageRatingImageURL` TEXT NOT NULL, `bidRate` TEXT NOT NULL, `billingTypeId` TEXT NOT NULL, `callToAction` TEXT NOT NULL, `campaignDisplayOrder` TEXT NOT NULL, `campaignId` TEXT NOT NULL, `campaignTypeId` TEXT NOT NULL, `categoryName` TEXT NOT NULL, `clickProxyURL` TEXT NOT NULL, `creativeId` TEXT NOT NULL, `homeScreen` INTEGER NOT NULL, `isRandomPick` INTEGER NOT NULL, `numberOfRatings` TEXT NOT NULL, `productDescription` TEXT NOT NULL, `productId` TEXT NOT NULL, `productName` TEXT NOT NULL, `productThumbnail` TEXT NOT NULL, `rating` TEXT NOT NULL, `numberOfDownloads` TEXT NOT NULL, `tstiEligible` INTEGER NOT NULL, `stiEnabled` INTEGER NOT NULL, `impressionTrackingURL` TEXT NOT NULL, `minOSVersion` TEXT, `appPrivacyPolicyUrl` TEXT, `postInstallActions` TEXT NOT NULL, `external1` TEXT NOT NULL, `external2` INTEGER NOT NULL, PRIMARY KEY(`appPackageId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'e729767dc4bbf540864e2ff1fe9a38dc')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `recipientData`");
        _db.execSQL("DROP TABLE IF EXISTS `adsData`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsRecipientData = new HashMap<String, TableInfo.Column>(5);
        _columnsRecipientData.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipientData.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipientData.put("siteId", new TableInfo.Column("siteId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipientData.put("deviceId", new TableInfo.Column("deviceId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecipientData.put("sessionId", new TableInfo.Column("sessionId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecipientData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecipientData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecipientData = new TableInfo("recipientData", _columnsRecipientData, _foreignKeysRecipientData, _indicesRecipientData);
        final TableInfo _existingRecipientData = TableInfo.read(_db, "recipientData");
        if (! _infoRecipientData.equals(_existingRecipientData)) {
          return new RoomOpenHelper.ValidationResult(false, "recipientData(com.digitalturbine.dtproductlist.data.auth.RecipientData).\n"
                  + " Expected:\n" + _infoRecipientData + "\n"
                  + " Found:\n" + _existingRecipientData);
        }
        final HashMap<String, TableInfo.Column> _columnsAdsData = new HashMap<String, TableInfo.Column>(28);
        _columnsAdsData.put("appPackageId", new TableInfo.Column("appPackageId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("averageRatingImageURL", new TableInfo.Column("averageRatingImageURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("bidRate", new TableInfo.Column("bidRate", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("billingTypeId", new TableInfo.Column("billingTypeId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("callToAction", new TableInfo.Column("callToAction", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("campaignDisplayOrder", new TableInfo.Column("campaignDisplayOrder", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("campaignId", new TableInfo.Column("campaignId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("campaignTypeId", new TableInfo.Column("campaignTypeId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("categoryName", new TableInfo.Column("categoryName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("clickProxyURL", new TableInfo.Column("clickProxyURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("creativeId", new TableInfo.Column("creativeId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("homeScreen", new TableInfo.Column("homeScreen", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("isRandomPick", new TableInfo.Column("isRandomPick", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("numberOfRatings", new TableInfo.Column("numberOfRatings", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("productDescription", new TableInfo.Column("productDescription", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("productId", new TableInfo.Column("productId", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("productName", new TableInfo.Column("productName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("productThumbnail", new TableInfo.Column("productThumbnail", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("rating", new TableInfo.Column("rating", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("numberOfDownloads", new TableInfo.Column("numberOfDownloads", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("tstiEligible", new TableInfo.Column("tstiEligible", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("stiEnabled", new TableInfo.Column("stiEnabled", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("impressionTrackingURL", new TableInfo.Column("impressionTrackingURL", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("minOSVersion", new TableInfo.Column("minOSVersion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("appPrivacyPolicyUrl", new TableInfo.Column("appPrivacyPolicyUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("postInstallActions", new TableInfo.Column("postInstallActions", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("external1", new TableInfo.Column("external1", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAdsData.put("external2", new TableInfo.Column("external2", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAdsData = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAdsData = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAdsData = new TableInfo("adsData", _columnsAdsData, _foreignKeysAdsData, _indicesAdsData);
        final TableInfo _existingAdsData = TableInfo.read(_db, "adsData");
        if (! _infoAdsData.equals(_existingAdsData)) {
          return new RoomOpenHelper.ValidationResult(false, "adsData(com.digitalturbine.dtproductlist.data.ads.AdData).\n"
                  + " Expected:\n" + _infoAdsData + "\n"
                  + " Found:\n" + _existingAdsData);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "e729767dc4bbf540864e2ff1fe9a38dc", "a6d3e0ddc023cda58b5b7e685fa8a1ec");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "recipientData","adsData");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `recipientData`");
      _db.execSQL("DELETE FROM `adsData`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(RecipientDataDAO.class, RecipientDataDAO_Impl.getRequiredConverters());
    _typeConvertersMap.put(AdsDAO.class, AdsDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public RecipientDataDAO recipientDataDAO() {
    if (_recipientDataDAO != null) {
      return _recipientDataDAO;
    } else {
      synchronized(this) {
        if(_recipientDataDAO == null) {
          _recipientDataDAO = new RecipientDataDAO_Impl(this);
        }
        return _recipientDataDAO;
      }
    }
  }

  @Override
  public AdsDAO adsDAO() {
    if (_adsDAO != null) {
      return _adsDAO;
    } else {
      synchronized(this) {
        if(_adsDAO == null) {
          _adsDAO = new AdsDAO_Impl(this);
        }
        return _adsDAO;
      }
    }
  }
}
