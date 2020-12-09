package com.hari.covid_19app.di.module;

import com.hari.covid_19app.db.CacheDatabase;
import com.hari.covid_19app.db.dao.StateDao;
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
public final class AppModule_ProvideStateDaoFactory implements Factory<StateDao> {
  private final AppModule module;

  private final Provider<CacheDatabase> databaseProvider;

  public AppModule_ProvideStateDaoFactory(AppModule module,
      Provider<CacheDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public StateDao get() {
    return provideStateDao(module, databaseProvider.get());
  }

  public static AppModule_ProvideStateDaoFactory create(AppModule module,
      Provider<CacheDatabase> databaseProvider) {
    return new AppModule_ProvideStateDaoFactory(module, databaseProvider);
  }

  public static StateDao provideStateDao(AppModule instance, CacheDatabase database) {
    return Preconditions.checkNotNull(instance.provideStateDao(database), "Cannot return null from a non-@Nullable @Provides method");
  }
}
