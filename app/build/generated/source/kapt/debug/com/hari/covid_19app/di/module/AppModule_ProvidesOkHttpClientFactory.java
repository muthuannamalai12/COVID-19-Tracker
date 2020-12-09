package com.hari.covid_19app.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvidesOkHttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  public AppModule_ProvidesOkHttpClientFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return providesOkHttpClient(module);
  }

  public static AppModule_ProvidesOkHttpClientFactory create(AppModule module) {
    return new AppModule_ProvidesOkHttpClientFactory(module);
  }

  public static OkHttpClient providesOkHttpClient(AppModule instance) {
    return Preconditions.checkNotNull(instance.providesOkHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
