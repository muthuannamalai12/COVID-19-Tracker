package com.hari.covid_19app.db;

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
import com.hari.covid_19app.db.dao.GlobalStateDao;
import com.hari.covid_19app.db.dao.GlobalStateDao_Impl;
import com.hari.covid_19app.db.dao.StateDao;
import com.hari.covid_19app.db.dao.StateDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CacheDatabase_Impl extends CacheDatabase {
  private volatile StateDao _stateDao;

  private volatile GlobalStateDao _globalStateDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `state` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `active` TEXT, `confirmed` TEXT, `deaths` TEXT, `delta_confirmed` TEXT, `delta_deaths` TEXT, `delta_recovered` TEXT, `last_updated_time` TEXT, `migrated_other` TEXT, `recovered` TEXT, `state` TEXT, `state_code` TEXT, `state_notes` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `global_state` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `total_active_cases` INTEGER, `total_affected_countries` INTEGER, `total_cases` INTEGER, `total_deaths` INTEGER, `total_new_cases_today` INTEGER, `total_new_deaths_today` INTEGER, `total_recovered` INTEGER, `total_serious_cases` INTEGER, `total_unresolved` INTEGER)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8f52bb3e75b79dd3fdebad63d219e6c5')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `state`");
        _db.execSQL("DROP TABLE IF EXISTS `global_state`");
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
        final HashMap<String, TableInfo.Column> _columnsState = new HashMap<String, TableInfo.Column>(13);
        _columnsState.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("active", new TableInfo.Column("active", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("confirmed", new TableInfo.Column("confirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("deaths", new TableInfo.Column("deaths", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("delta_confirmed", new TableInfo.Column("delta_confirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("delta_deaths", new TableInfo.Column("delta_deaths", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("delta_recovered", new TableInfo.Column("delta_recovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("last_updated_time", new TableInfo.Column("last_updated_time", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("migrated_other", new TableInfo.Column("migrated_other", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("recovered", new TableInfo.Column("recovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("state_code", new TableInfo.Column("state_code", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsState.put("state_notes", new TableInfo.Column("state_notes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysState = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesState = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoState = new TableInfo("state", _columnsState, _foreignKeysState, _indicesState);
        final TableInfo _existingState = TableInfo.read(_db, "state");
        if (! _infoState.equals(_existingState)) {
          return new RoomOpenHelper.ValidationResult(false, "state(com.hari.covid_19app.db.entity.State).\n"
                  + " Expected:\n" + _infoState + "\n"
                  + " Found:\n" + _existingState);
        }
        final HashMap<String, TableInfo.Column> _columnsGlobalState = new HashMap<String, TableInfo.Column>(10);
        _columnsGlobalState.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_active_cases", new TableInfo.Column("total_active_cases", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_affected_countries", new TableInfo.Column("total_affected_countries", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_cases", new TableInfo.Column("total_cases", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_deaths", new TableInfo.Column("total_deaths", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_new_cases_today", new TableInfo.Column("total_new_cases_today", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_new_deaths_today", new TableInfo.Column("total_new_deaths_today", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_recovered", new TableInfo.Column("total_recovered", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_serious_cases", new TableInfo.Column("total_serious_cases", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsGlobalState.put("total_unresolved", new TableInfo.Column("total_unresolved", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysGlobalState = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesGlobalState = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoGlobalState = new TableInfo("global_state", _columnsGlobalState, _foreignKeysGlobalState, _indicesGlobalState);
        final TableInfo _existingGlobalState = TableInfo.read(_db, "global_state");
        if (! _infoGlobalState.equals(_existingGlobalState)) {
          return new RoomOpenHelper.ValidationResult(false, "global_state(com.hari.covid_19app.db.entity.GlobalState).\n"
                  + " Expected:\n" + _infoGlobalState + "\n"
                  + " Found:\n" + _existingGlobalState);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "8f52bb3e75b79dd3fdebad63d219e6c5", "65cd78b4ae401f1231aa634758583a5e");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "state","global_state");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `state`");
      _db.execSQL("DELETE FROM `global_state`");
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
  public StateDao stateDao() {
    if (_stateDao != null) {
      return _stateDao;
    } else {
      synchronized(this) {
        if(_stateDao == null) {
          _stateDao = new StateDao_Impl(this);
        }
        return _stateDao;
      }
    }
  }

  @Override
  public GlobalStateDao globalStateDao() {
    if (_globalStateDao != null) {
      return _globalStateDao;
    } else {
      synchronized(this) {
        if(_globalStateDao == null) {
          _globalStateDao = new GlobalStateDao_Impl(this);
        }
        return _globalStateDao;
      }
    }
  }
}
