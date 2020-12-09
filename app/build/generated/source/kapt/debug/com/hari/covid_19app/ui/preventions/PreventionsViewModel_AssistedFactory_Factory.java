package com.hari.covid_19app.ui.preventions;

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
public final class PreventionsViewModel_AssistedFactory_Factory implements Factory<PreventionsViewModel_AssistedFactory> {
  private final Provider<CovidRepository> covidRepositoryProvider;

  public PreventionsViewModel_AssistedFactory_Factory(
      Provider<CovidRepository> covidRepositoryProvider) {
    this.covidRepositoryProvider = covidRepositoryProvider;
  }

  @Override
  public PreventionsViewModel_AssistedFactory get() {
    return newInstance(covidRepositoryProvider);
  }

  public static PreventionsViewModel_AssistedFactory_Factory create(
      Provider<CovidRepository> covidRepositoryProvider) {
    return new PreventionsViewModel_AssistedFactory_Factory(covidRepositoryProvider);
  }

  public static PreventionsViewModel_AssistedFactory newInstance(
      Provider<CovidRepository> covidRepository) {
    return new PreventionsViewModel_AssistedFactory(covidRepository);
  }
}
