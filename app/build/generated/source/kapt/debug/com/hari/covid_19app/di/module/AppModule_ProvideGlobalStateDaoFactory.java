package com.hari.covid_19app.di.module;

import com.hari.covid_19app.db.CacheDatabase;
import com.hari.covid_19app.db.dao.GlobalStateDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideGlobalStateDaoFactory implements Factory<GlobalStateDao> {
  private final AppModule module;

  private final Provider<CacheDatabase> databaseProvider;

  public AppModule_ProvideGlobalStateDaoFactory(AppModule module,
      Provider<CacheDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GlobalStateDao get() {
    return provideGlobalStateDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideGlobalStateDaoFactory create(AppModule module,
      Provider<CacheDatabase> databaseProvider) {
    return new AppModule_ProvideGlobalStateDaoFactory(module, databaseProvider);
  }

  public static GlobalStateDao provideGlobalStateDao(AppModule instance, CacheDatabase database) {
    return Preconditions.checkNotNull(instance.provideGlobalStateDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
