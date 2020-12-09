package com.hari.covid_19app.ui.home;

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
public final class HomeViewModel_AssistedFactory_Factory implements Factory<HomeViewModel_AssistedFactory> {
  private final Provider<CovidRepository> covidRepositoryProvider;

  public HomeViewModel_AssistedFactory_Factory(Provider<CovidRepository> covidRepositoryProvider) {
    this.covidRepositoryProvider = covidRepositoryProvider;
  }

  @Override
  public HomeViewModel_AssistedFactory get() {
    return newInstance(covidRepositoryProvider);
  }

  public static HomeViewModel_AssistedFactory_Factory create(
      Provider<CovidRepository> covidRepositoryProvider) {
    return new HomeViewModel_AssistedFactory_Factory(covidRepositoryProvider);
  }

  public static HomeViewModel_AssistedFactory newInstance(
      Provider<CovidRepository> covidRepository) {
    return new HomeViewModel_AssistedFactory(covidRepository);
  }
}
