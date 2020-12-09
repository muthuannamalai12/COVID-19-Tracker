package com.hari.covid_19app.ui;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SystemViewModel_AssistedFactory implements ViewModelAssistedFactory<SystemViewModel> {
  @Inject
  SystemViewModel_AssistedFactory() {
  }

  @Override
  @NonNull
  public SystemViewModel create(@NonNull SavedStateHandle arg0) {
    return new SystemViewModel();
  }
}
