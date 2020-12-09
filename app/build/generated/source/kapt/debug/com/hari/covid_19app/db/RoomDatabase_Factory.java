package com.hari.covid_19app.db;

import com.hari.covid_19app.db.dao.GlobalStateDao;
import com.hari.covid_19app.db.dao.StateDao;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RoomDatabase_Factory implements Factory<RoomDatabase> {
  private final Provider<CacheDatabase> cacheDatabaseProvider;

  private final Provider<StateDao> stateDaoProvider;

  private final Provider<GlobalStateDao> globalStateDaoProvider;

  public RoomDatabase_Factory(Provider<CacheDatabase> cacheDatabaseProvider,
      Provider<StateDao> stateDaoProvider, Provider<GlobalStateDao> globalStateDaoProvider) {
    this.cacheDatabaseProvider = cacheDatabaseProvider;
    this.stateDaoProvider = stateDaoProvider;
    this.globalStateDaoProvider = globalStateDaoProvider;
  }

  @Override
  public RoomDatabase get() {
    return newInstance(cacheDatabaseProvider.get(), stateDaoProvider.get(), globalStateDaoProvider.get());
  }

  public static RoomDatabase_Factory create(Provider<CacheDatabase> cacheDatabaseProvider,
      Provider<StateDao> stateDaoProvider, Provider<GlobalStateDao> globalStateDaoProvider) {
    return new RoomDatabase_Factory(cacheDatabaseProvider, stateDaoProvider, globalStateDaoProvider);
  }

  public static RoomDatabase newInstance(CacheDatabase cacheDatabase, StateDao stateDao,
      GlobalStateDao globalStateDao) {
    return new RoomDatabase(cacheDatabase, stateDao, globalStateDao);
  }
}
