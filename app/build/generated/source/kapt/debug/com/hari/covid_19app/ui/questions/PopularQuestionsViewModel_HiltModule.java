package com.hari.covid_19app.ui.questions;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = PopularQuestionsViewModel.class
)
public interface PopularQuestionsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.hari.covid_19app.ui.questions.PopularQuestionsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(
      PopularQuestionsViewModel_AssistedFactory factory);
}
