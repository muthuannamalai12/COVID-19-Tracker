package com.hari.covid_19app.ui.preventions;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.hari.covid_19app.repository.CovidRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class PreventionsViewModel_AssistedFactory implements ViewModelAssistedFactory<PreventionsViewModel> {
  private final Provider<CovidRepository> covidRepository;

  @Inject
  PreventionsViewModel_AssistedFactory(Provider<CovidRepository> covidRepository) {
    this.covidRepository = covidRepository;
  }

  @Override
  @NonNull
  public PreventionsViewModel create(@NonNull SavedStateHandle arg0) {
    return new PreventionsViewModel(covidRepository.get());
  }
}
