package com.hari.covid_19app.di.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideGsonFactory implements Factory<Gson> {
  private final AppModule module;

  public AppModule_ProvideGsonFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return provideGson(module);
  }

  public static AppModule_ProvideGsonFactory create(AppModule module) {
    return new AppModule_ProvideGsonFactory(module);
  }

  public static Gson provideGson(AppModule instance) {
    return Preconditions.checkNotNull(instance.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
