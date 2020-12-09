package com.hari.covid_19app.di.initializer;

import com.hari.covid_19app.di.appinitializer.AppInitializer;
import dagger.internal.Factory;
import java.util.Set;
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
public final class AppInitializers_Factory implements Factory<AppInitializers> {
  private final Provider<Set<AppInitializer>> initializersProvider;

  public AppInitializers_Factory(Provider<Set<AppInitializer>> initializersProvider) {
    this.initializersProvider = initializersProvider;
  }

  @Override
  public AppInitializers get() {
    return newInstance(initializersProvider.get());
  }

  public static AppInitializers_Factory create(Provider<Set<AppInitializer>> initializersProvider) {
    return new AppInitializers_Factory(initializersProvider);
  }

  public static AppInitializers newInstance(Set<AppInitializer> initializers) {
    return new AppInitializers(initializers);
  }
}
