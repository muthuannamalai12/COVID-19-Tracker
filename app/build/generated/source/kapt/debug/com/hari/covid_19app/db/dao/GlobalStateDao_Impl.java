package com.hari.covid_19app.db.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.hari.covid_19app.db.entity.GlobalState;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class GlobalStateDao_Impl extends GlobalStateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GlobalState> __insertionAdapterOfGlobalState;

  private final EntityDeletionOrUpdateAdapter<GlobalState> __deletionAdapterOfGlobalState;

  private final EntityDeletionOrUpdateAdapter<GlobalState> __updateAdapterOfGlobalState;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public GlobalStateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGlobalState = new EntityInsertionAdapter<GlobalState>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `global_state` (`id`,`total_active_cases`,`total_affected_countries`,`total_cases`,`total_deaths`,`total_new_cases_today`,`total_new_deaths_today`,`total_recovered`,`total_serious_cases`,`total_unresolved`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GlobalState value) {
        stmt.bindLong(1, value.getId());
        if (value.getTotalActiveCases() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTotalActiveCases());
        }
        if (value.getTotalAffectedCountries() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTotalAffectedCountries());
        }
        if (value.getTotalCases() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTotalCases());
        }
        if (value.getTotalDeaths() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTotalDeaths());
        }
        if (value.getTotalNewCasesToday() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTotalNewCasesToday());
        }
        if (value.getTotalNewDeathsToday() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTotalNewDeathsToday());
        }
        if (value.getTotalRecovered() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getTotalRecovered());
        }
        if (value.getTotalSeriousCases() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getTotalSeriousCases());
        }
        if (value.getTotalUnresolved() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getTotalUnresolved());
        }
      }
    };
    this.__deletionAdapterOfGlobalState = new EntityDeletionOrUpdateAdapter<GlobalState>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `global_state` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GlobalState value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfGlobalState = new EntityDeletionOrUpdateAdapter<GlobalState>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `global_state` SET `id` = ?,`total_active_cases` = ?,`total_affected_countries` = ?,`total_cases` = ?,`total_deaths` = ?,`total_new_cases_today` = ?,`total_new_deaths_today` = ?,`total_recovered` = ?,`total_serious_cases` = ?,`total_unresolved` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GlobalState value) {
        stmt.bindLong(1, value.getId());
        if (value.getTotalActiveCases() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, value.getTotalActiveCases());
        }
        if (value.getTotalAffectedCountries() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindLong(3, value.getTotalAffectedCountries());
        }
        if (value.getTotalCases() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getTotalCases());
        }
        if (value.getTotalDeaths() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getTotalDeaths());
        }
        if (value.getTotalNewCasesToday() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getTotalNewCasesToday());
        }
        if (value.getTotalNewDeathsToday() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, value.getTotalNewDeathsToday());
        }
        if (value.getTotalRecovered() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindLong(8, value.getTotalRecovered());
        }
        if (value.getTotalSeriousCases() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindLong(9, value.getTotalSeriousCases());
        }
        if (value.getTotalUnresolved() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getTotalUnresolved());
        }
        stmt.bindLong(11, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from global_state";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final GlobalState t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGlobalState.insert(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<? extends GlobalState> t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGlobalState.insert(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final GlobalState t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGlobalState.handle(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final GlobalState t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfGlobalState.handle(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Flow<GlobalState> getGlobalState() {
    final String _sql = "select * from global_state limit 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"global_state"}, new Callable<GlobalState>() {
      @Override
      public GlobalState call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfTotalActiveCases = CursorUtil.getColumnIndexOrThrow(_cursor, "total_active_cases");
          final int _cursorIndexOfTotalAffectedCountries = CursorUtil.getColumnIndexOrThrow(_cursor, "total_affected_countries");
          final int _cursorIndexOfTotalCases = CursorUtil.getColumnIndexOrThrow(_cursor, "total_cases");
          final int _cursorIndexOfTotalDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "total_deaths");
          final int _cursorIndexOfTotalNewCasesToday = CursorUtil.getColumnIndexOrThrow(_cursor, "total_new_cases_today");
          final int _cursorIndexOfTotalNewDeathsToday = CursorUtil.getColumnIndexOrThrow(_cursor, "total_new_deaths_today");
          final int _cursorIndexOfTotalRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "total_recovered");
          final int _cursorIndexOfTotalSeriousCases = CursorUtil.getColumnIndexOrThrow(_cursor, "total_serious_cases");
          final int _cursorIndexOfTotalUnresolved = CursorUtil.getColumnIndexOrThrow(_cursor, "total_unresolved");
          final GlobalState _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final Integer _tmpTotalActiveCases;
            if (_cursor.isNull(_cursorIndexOfTotalActiveCases)) {
              _tmpTotalActiveCases = null;
            } else {
              _tmpTotalActiveCases = _cursor.getInt(_cursorIndexOfTotalActiveCases);
            }
            final Integer _tmpTotalAffectedCountries;
            if (_cursor.isNull(_cursorIndexOfTotalAffectedCountries)) {
              _tmpTotalAffectedCountries = null;
            } else {
              _tmpTotalAffectedCountries = _cursor.getInt(_cursorIndexOfTotalAffectedCountries);
            }
            final Integer _tmpTotalCases;
            if (_cursor.isNull(_cursorIndexOfTotalCases)) {
              _tmpTotalCases = null;
            } else {
              _tmpTotalCases = _cursor.getInt(_cursorIndexOfTotalCases);
            }
            final Integer _tmpTotalDeaths;
            if (_cursor.isNull(_cursorIndexOfTotalDeaths)) {
              _tmpTotalDeaths = null;
            } else {
              _tmpTotalDeaths = _cursor.getInt(_cursorIndexOfTotalDeaths);
            }
            final Integer _tmpTotalNewCasesToday;
            if (_cursor.isNull(_cursorIndexOfTotalNewCasesToday)) {
              _tmpTotalNewCasesToday = null;
            } else {
              _tmpTotalNewCasesToday = _cursor.getInt(_cursorIndexOfTotalNewCasesToday);
            }
            final Integer _tmpTotalNewDeathsToday;
            if (_cursor.isNull(_cursorIndexOfTotalNewDeathsToday)) {
              _tmpTotalNewDeathsToday = null;
            } else {
              _tmpTotalNewDeathsToday = _cursor.getInt(_cursorIndexOfTotalNewDeathsToday);
            }
            final Integer _tmpTotalRecovered;
            if (_cursor.isNull(_cursorIndexOfTotalRecovered)) {
              _tmpTotalRecovered = null;
            } else {
              _tmpTotalRecovered = _cursor.getInt(_cursorIndexOfTotalRecovered);
            }
            final Integer _tmpTotalSeriousCases;
            if (_cursor.isNull(_cursorIndexOfTotalSeriousCases)) {
              _tmpTotalSeriousCases = null;
            } else {
              _tmpTotalSeriousCases = _cursor.getInt(_cursorIndexOfTotalSeriousCases);
            }
            final Integer _tmpTotalUnresolved;
            if (_cursor.isNull(_cursorIndexOfTotalUnresolved)) {
              _tmpTotalUnresolved = null;
            } else {
              _tmpTotalUnresolved = _cursor.getInt(_cursorIndexOfTotalUnresolved);
            }
            _result = new GlobalState(_tmpId,_tmpTotalActiveCases,_tmpTotalAffectedCountries,_tmpTotalCases,_tmpTotalDeaths,_tmpTotalNewCasesToday,_tmpTotalNewDeathsToday,_tmpTotalRecovered,_tmpTotalSeriousCases,_tmpTotalUnresolved);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
