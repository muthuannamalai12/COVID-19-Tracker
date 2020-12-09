package com.hari.covid_19app.ui.statistics;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hari.covid_19app.repository.CovidRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class StatisticsViewModel_AssistedFactory implements ViewModelAssistedFactory<StatisticsViewModel> {
  private final Provider<CovidRepository> covidRepository;

  @Inject
  StatisticsViewModel_AssistedFactory(Provider<CovidRepository> covidRepository) {
    this.covidRepository = covidRepository;
  }

  @Override
  @NonNull
  public StatisticsViewModel create(@NonNull SavedStateHandle arg0) {
    return new StatisticsViewModel(covidRepository.get());
  }
}
