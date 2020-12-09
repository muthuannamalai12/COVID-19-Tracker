package com.hari.covid_19app.ui.questions;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hari.covid_19app.repository.CovidRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PopularQuestionsViewModel_AssistedFactory implements ViewModelAssistedFactory<PopularQuestionsViewModel> {
  private final Provider<CovidRepository> covidRepository;

  @Inject
  PopularQuestionsViewModel_AssistedFactory(Provider<CovidRepository> covidRepository) {
    this.covidRepository = covidRepository;
  }

  @Override
  @NonNull
  public PopularQuestionsViewModel create(@NonNull SavedStateHandle arg0) {
    return new PopularQuestionsViewModel(covidRepository.get());
  }
}
