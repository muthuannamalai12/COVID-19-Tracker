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
import com.hari.covid_19app.db.entity.State;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class StateDao_Impl extends StateDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<State> __insertionAdapterOfState;

  private final EntityDeletionOrUpdateAdapter<State> __deletionAdapterOfState;

  private final EntityDeletionOrUpdateAdapter<State> __updateAdapterOfState;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public StateDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfState = new EntityInsertionAdapter<State>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `state` (`id`,`active`,`confirmed`,`deaths`,`delta_confirmed`,`delta_deaths`,`delta_recovered`,`last_updated_time`,`migrated_other`,`recovered`,`state`,`state_code`,`state_notes`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, State value) {
        stmt.bindLong(1, value.getId());
        if (value.getActive() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getActive());
        }
        if (value.getConfirmed() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfirmed());
        }
        if (value.getDeaths() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeaths());
        }
        if (value.getDeltaConfirmed() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDeltaConfirmed());
        }
        if (value.getDeltaDeaths() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDeltaDeaths());
        }
        if (value.getDeltaRecovered() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDeltaRecovered());
        }
        if (value.getLastUpdatedTime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLastUpdatedTime());
        }
        if (value.getMigratedOther() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMigratedOther());
        }
        if (value.getRecovered() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getRecovered());
        }
        if (value.getState() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getState());
        }
        if (value.getStateCode() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStateCode());
        }
        if (value.getStateNotes() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStateNotes());
        }
      }
    };
    this.__deletionAdapterOfState = new EntityDeletionOrUpdateAdapter<State>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `state` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, State value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfState = new EntityDeletionOrUpdateAdapter<State>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `state` SET `id` = ?,`active` = ?,`confirmed` = ?,`deaths` = ?,`delta_confirmed` = ?,`delta_deaths` = ?,`delta_recovered` = ?,`last_updated_time` = ?,`migrated_other` = ?,`recovered` = ?,`state` = ?,`state_code` = ?,`state_notes` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, State value) {
        stmt.bindLong(1, value.getId());
        if (value.getActive() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getActive());
        }
        if (value.getConfirmed() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfirmed());
        }
        if (value.getDeaths() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeaths());
        }
        if (value.getDeltaConfirmed() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDeltaConfirmed());
        }
        if (value.getDeltaDeaths() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDeltaDeaths());
        }
        if (value.getDeltaRecovered() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDeltaRecovered());
        }
        if (value.getLastUpdatedTime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLastUpdatedTime());
        }
        if (value.getMigratedOther() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMigratedOther());
        }
        if (value.getRecovered() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getRecovered());
        }
        if (value.getState() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getState());
        }
        if (value.getStateCode() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStateCode());
        }
        if (value.getStateNotes() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStateNotes());
        }
        stmt.bindLong(14, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from state";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final State t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfState.insert(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object insert(final List<? extends State> t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfState.insert(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final State t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfState.handle(t);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final State t, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfState.handle(t);
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
  public Flow<State> getTotalCaseInIndia() {
    final String _sql = "select * from state where state_code='TT'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"state"}, new Callable<State>() {
      @Override
      public State call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
          final int _cursorIndexOfDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "deaths");
          final int _cursorIndexOfDeltaConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_confirmed");
          final int _cursorIndexOfDeltaDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_deaths");
          final int _cursorIndexOfDeltaRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_recovered");
          final int _cursorIndexOfLastUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated_time");
          final int _cursorIndexOfMigratedOther = CursorUtil.getColumnIndexOrThrow(_cursor, "migrated_other");
          final int _cursorIndexOfRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "recovered");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfStateNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "state_notes");
          final State _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpActive;
            _tmpActive = _cursor.getString(_cursorIndexOfActive);
            final String _tmpConfirmed;
            _tmpConfirmed = _cursor.getString(_cursorIndexOfConfirmed);
            final String _tmpDeaths;
            _tmpDeaths = _cursor.getString(_cursorIndexOfDeaths);
            final String _tmpDeltaConfirmed;
            _tmpDeltaConfirmed = _cursor.getString(_cursorIndexOfDeltaConfirmed);
            final String _tmpDeltaDeaths;
            _tmpDeltaDeaths = _cursor.getString(_cursorIndexOfDeltaDeaths);
            final String _tmpDeltaRecovered;
            _tmpDeltaRecovered = _cursor.getString(_cursorIndexOfDeltaRecovered);
            final String _tmpLastUpdatedTime;
            _tmpLastUpdatedTime = _cursor.getString(_cursorIndexOfLastUpdatedTime);
            final String _tmpMigratedOther;
            _tmpMigratedOther = _cursor.getString(_cursorIndexOfMigratedOther);
            final String _tmpRecovered;
            _tmpRecovered = _cursor.getString(_cursorIndexOfRecovered);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final String _tmpStateCode;
            _tmpStateCode = _cursor.getString(_cursorIndexOfStateCode);
            final String _tmpStateNotes;
            _tmpStateNotes = _cursor.getString(_cursorIndexOfStateNotes);
            _result = new State(_tmpId,_tmpActive,_tmpConfirmed,_tmpDeaths,_tmpDeltaConfirmed,_tmpDeltaDeaths,_tmpDeltaRecovered,_tmpLastUpdatedTime,_tmpMigratedOther,_tmpRecovered,_tmpState,_tmpStateCode,_tmpStateNotes);
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

  @Override
  public Flow<List<State>> getAllStates() {
    final String _sql = "select * from state";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"state"}, new Callable<List<State>>() {
      @Override
      public List<State> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
          final int _cursorIndexOfDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "deaths");
          final int _cursorIndexOfDeltaConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_confirmed");
          final int _cursorIndexOfDeltaDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_deaths");
          final int _cursorIndexOfDeltaRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "delta_recovered");
          final int _cursorIndexOfLastUpdatedTime = CursorUtil.getColumnIndexOrThrow(_cursor, "last_updated_time");
          final int _cursorIndexOfMigratedOther = CursorUtil.getColumnIndexOrThrow(_cursor, "migrated_other");
          final int _cursorIndexOfRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "recovered");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "state_code");
          final int _cursorIndexOfStateNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "state_notes");
          final List<State> _result = new ArrayList<State>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final State _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpActive;
            _tmpActive = _cursor.getString(_cursorIndexOfActive);
            final String _tmpConfirmed;
            _tmpConfirmed = _cursor.getString(_cursorIndexOfConfirmed);
            final String _tmpDeaths;
            _tmpDeaths = _cursor.getString(_cursorIndexOfDeaths);
            final String _tmpDeltaConfirmed;
            _tmpDeltaConfirmed = _cursor.getString(_cursorIndexOfDeltaConfirmed);
            final String _tmpDeltaDeaths;
            _tmpDeltaDeaths = _cursor.getString(_cursorIndexOfDeltaDeaths);
            final String _tmpDeltaRecovered;
            _tmpDeltaRecovered = _cursor.getString(_cursorIndexOfDeltaRecovered);
            final String _tmpLastUpdatedTime;
            _tmpLastUpdatedTime = _cursor.getString(_cursorIndexOfLastUpdatedTime);
            final String _tmpMigratedOther;
            _tmpMigratedOther = _cursor.getString(_cursorIndexOfMigratedOther);
            final String _tmpRecovered;
            _tmpRecovered = _cursor.getString(_cursorIndexOfRecovered);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final String _tmpStateCode;
            _tmpStateCode = _cursor.getString(_cursorIndexOfStateCode);
            final String _tmpStateNotes;
            _tmpStateNotes = _cursor.getString(_cursorIndexOfStateNotes);
            _item = new State(_tmpId,_tmpActive,_tmpConfirmed,_tmpDeaths,_tmpDeltaConfirmed,_tmpDeltaDeaths,_tmpDeltaRecovered,_tmpLastUpdatedTime,_tmpMigratedOther,_tmpRecovered,_tmpState,_tmpStateCode,_tmpStateNotes);
            _result.add(_item);
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
