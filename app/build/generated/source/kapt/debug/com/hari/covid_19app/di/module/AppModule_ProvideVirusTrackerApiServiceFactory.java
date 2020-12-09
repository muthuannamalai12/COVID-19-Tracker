package com.hari.covid_19app.di.module;

import com.google.gson.Gson;
import com.hari.covid_19app.api.VirusTrackerApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideVirusTrackerApiServiceFactory implements Factory<VirusTrackerApi> {
  private final AppModule module;

  private final Provider<Gson> gsonProvider;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public AppModule_ProvideVirusTrackerApiServiceFactory(AppModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public VirusTrackerApi get() {
    return provideVirusTrackerApiService(module, gsonProvider.get(), okHttpClientProvider.get());
  }

  public static AppModule_ProvideVirusTrackerApiServiceFactory create(AppModule module,
      Provider<Gson> gsonProvider, Provider<OkHttpClient> okHttpClientProvider) {
    return new AppModule_ProvideVirusTrackerApiServiceFactory(module, gsonProvider, okHttpClientProvider);
  }

  public static VirusTrackerApi provideVirusTrackerApiService(AppModule instance, Gson gson,
      OkHttpClient okHttpClient) {
    return Preconditions.checkNotNull(instance.provideVirusTrackerApiService(gson, okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
  }
}
