package com.hari.covid_19app.ui.statistics;

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
public final class StatisticsViewModel_AssistedFactory_Factory implements Factory<StatisticsViewModel_AssistedFactory> {
  private final Provider<CovidRepository> covidRepositoryProvider;

  public StatisticsViewModel_AssistedFactory_Factory(
      Provider<CovidRepository> covidRepositoryProvider) {
    this.covidRepositoryProvider = covidRepositoryProvider;
  }

  @Override
  public StatisticsViewModel_AssistedFactory get() {
    return newInstance(covidRepositoryProvider);
  }

  public static StatisticsViewModel_AssistedFactory_Factory create(
      Provider<CovidRepository> covidRepositoryProvider) {
    return new StatisticsViewModel_AssistedFactory_Factory(covidRepositoryProvider);
  }

  public static StatisticsViewModel_AssistedFactory newInstance(
      Provider<CovidRepository> covidRepository) {
    return new StatisticsViewModel_AssistedFactory(covidRepository);
  }
}
