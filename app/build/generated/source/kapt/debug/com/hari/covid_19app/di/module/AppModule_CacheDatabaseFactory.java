package com.hari.covid_19app.di.module;

import android.content.Context;
import com.hari.covid_19app.db.CacheDatabase;
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
public final class AppModule_CacheDatabaseFactory implements Factory<CacheDatabase> {
  private final AppModule module;

  private final Provider<Context> contextProvider;

  public AppModule_CacheDatabaseFactory(AppModule module, Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public CacheDatabase get() {
    return cacheDatabase(module, contextProvider.get());
  }

  public static AppModule_CacheDatabaseFactory create(AppModule module,
      Provider<Context> contextProvider) {
    return new AppModule_CacheDatabaseFactory(module, contextProvider);
  }

  public static CacheDatabase cacheDatabase(AppModule instance, Context context) {
    return Preconditions.checkNotNull(instance.cacheDatabase(context), "Cannot return null from a non-@Nullable @Provides method");
  }
}
