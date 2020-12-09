package com.hari.covid_19app.workmanager;

import com.hari.covid_19app.repository.CovidRepository;
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
public final class SyncWorker_AssistedFactory_Factory implements Factory<SyncWorker_AssistedFactory> {
  private final Provider<CovidRepository> covidRepositoryProvider;

  public SyncWorker_AssistedFactory_Factory(Provider<CovidRepository> covidRepositoryProvider) {
    this.covidRepositoryProvider = covidRepositoryProvider;
  }

  @Override
  public SyncWorker_AssistedFactory get() {
    return newInstance(covidRepositoryProvider);
  }

  public static SyncWorker_AssistedFactory_Factory create(
      Provider<CovidRepository> covidRepositoryProvider) {
    return new SyncWorker_AssistedFactory_Factory(covidRepositoryProvider);
  }

  public static SyncWorker_AssistedFactory newInstance(Provider<CovidRepository> covidRepository) {
    return new SyncWorker_AssistedFactory(covidRepository);
  }
}
