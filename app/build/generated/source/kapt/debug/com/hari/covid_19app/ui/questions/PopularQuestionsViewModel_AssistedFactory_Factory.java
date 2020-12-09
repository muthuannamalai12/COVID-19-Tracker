package com.hari.covid_19app.ui.questions;

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
public final class PopularQuestionsViewModel_AssistedFactory_Factory implements Factory<PopularQuestionsViewModel_AssistedFactory> {
  private final Provider<CovidRepository> covidRepositoryProvider;

  public PopularQuestionsViewModel_AssistedFactory_Factory(
      Provider<CovidRepository> covidRepositoryProvider) {
    this.covidRepositoryProvider = covidRepositoryProvider;
  }

  @Override
  public PopularQuestionsViewModel_AssistedFactory get() {
    return newInstance(covidRepositoryProvider);
  }

  public static PopularQuestionsViewModel_AssistedFactory_Factory create(
      Provider<CovidRepository> covidRepositoryProvider) {
    return new PopularQuestionsViewModel_AssistedFactory_Factory(covidRepositoryProvider);
  }

  public static PopularQuestionsViewModel_AssistedFactory newInstance(
      Provider<CovidRepository> covidRepository) {
    return new PopularQuestionsViewModel_AssistedFactory(covidRepository);
  }
}
