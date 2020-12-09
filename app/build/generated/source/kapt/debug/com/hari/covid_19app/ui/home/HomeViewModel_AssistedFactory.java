package com.hari.covid_19app.ui.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hari.covid_19app.repository.CovidRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<CovidRepository> covidRepository;

  @Inject
  HomeViewModel_AssistedFactory(Provider<CovidRepository> covidRepository) {
    this.covidRepository = covidRepository;
  }

  @Override
  @NonNull
  public HomeViewModel create(@NonNull SavedStateHandle arg0) {
    return new HomeViewModel(covidRepository.get());
  }
}
