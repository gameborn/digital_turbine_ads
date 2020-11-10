package com.digitalturbine.dtproductlist.db.dao;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.digitalturbine.dtproductlist.data.auth.RecipientData;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class RecipientDataDAO_Impl implements RecipientDataDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecipientData> __insertionAdapterOfRecipientData;

  public RecipientDataDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecipientData = new EntityInsertionAdapter<RecipientData>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `recipientData` (`id`,`password`,`siteId`,`deviceId`,`sessionId`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecipientData value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPassword());
        }
        if (value.getSiteId() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSiteId());
        }
        if (value.getDeviceId() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeviceId());
        }
        if (value.getSessionId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSessionId());
        }
      }
    };
  }

  @Override
  public void insertData(final RecipientData data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRecipientData.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public RecipientData load(final String id) {
    final String _sql = "SELECT * FROM recipientData WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
      final int _cursorIndexOfSiteId = CursorUtil.getColumnIndexOrThrow(_cursor, "siteId");
      final int _cursorIndexOfDeviceId = CursorUtil.getColumnIndexOrThrow(_cursor, "deviceId");
      final int _cursorIndexOfSessionId = CursorUtil.getColumnIndexOrThrow(_cursor, "sessionId");
      final RecipientData _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpPassword;
        _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
        final String _tmpSiteId;
        _tmpSiteId = _cursor.getString(_cursorIndexOfSiteId);
        final String _tmpDeviceId;
        _tmpDeviceId = _cursor.getString(_cursorIndexOfDeviceId);
        final String _tmpSessionId;
        _tmpSessionId = _cursor.getString(_cursorIndexOfSessionId);
        _result = new RecipientData(_tmpId,_tmpPassword,_tmpSiteId,_tmpDeviceId,_tmpSessionId);
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
