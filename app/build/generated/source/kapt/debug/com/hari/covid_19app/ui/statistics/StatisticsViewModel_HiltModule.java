package com.hari.covid_19app.ui.statistics;

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
    topLevelClass = StatisticsViewModel.class
)
public interface StatisticsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.hari.covid_19app.ui.statistics.StatisticsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(StatisticsViewModel_AssistedFactory factory);
}
