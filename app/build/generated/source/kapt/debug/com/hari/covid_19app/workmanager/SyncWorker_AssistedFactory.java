package com.hari.covid_19app.workmanager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.work.WorkerParameters;
import com.hari.covid_19app.repository.CovidRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class SyncWorker_AssistedFactory implements WorkerAssistedFactory<SyncWorker> {
  private final Provider<CovidRepository> covidRepository;

  @Inject
  SyncWorker_AssistedFactory(Provider<CovidRepository> covidRepository) {
    this.covidRepository = covidRepository;
  }

  @Override
  @NonNull
  public SyncWorker create(@NonNull Context arg0, @NonNull WorkerParameters arg1) {
    return new SyncWorker(arg0, arg1, covidRepository.get());
  }
}
