package com.hari.covid_19app.workmanager;

import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.ListenableWorker;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ApplicationComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ApplicationComponent.class)
@OriginatingElement(
    topLevelClass = SyncWorker.class
)
public interface SyncWorker_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.hari.covid_19app.workmanager.SyncWorker")
  WorkerAssistedFactory<? extends ListenableWorker> bind(SyncWorker_AssistedFactory factory);
}
