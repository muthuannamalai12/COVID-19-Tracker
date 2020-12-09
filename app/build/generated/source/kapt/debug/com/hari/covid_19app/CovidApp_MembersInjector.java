package com.hari.covid_19app;

import androidx.hilt.work.HiltWorkerFactory;
import com.hari.covid_19app.di.initializer.AppInitializers;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class CovidApp_MembersInjector implements MembersInjector<CovidApp> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  private final Provider<AppInitializers> initializersProvider;

  public CovidApp_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider,
      Provider<AppInitializers> initializersProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
    this.initializersProvider = initializersProvider;
  }

  public static MembersInjector<CovidApp> create(Provider<HiltWorkerFactory> workerFactoryProvider,
      Provider<AppInitializers> initializersProvider) {
    return new CovidApp_MembersInjector(workerFactoryProvider, initializersProvider);
  }

  @Override
  public void injectMembers(CovidApp instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
    injectInitializers(instance, initializersProvider.get());
  }

  @InjectedFieldSignature("com.hari.covid_19app.CovidApp.workerFactory")
  public static void injectWorkerFactory(CovidApp instance, HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }

  @InjectedFieldSignature("com.hari.covid_19app.CovidApp.initializers")
  public static void injectInitializers(CovidApp instance, AppInitializers initializers) {
    instance.initializers = initializers;
  }
}
