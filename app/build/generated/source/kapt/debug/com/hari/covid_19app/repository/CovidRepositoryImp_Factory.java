package com.hari.covid_19app.repository;

import com.hari.covid_19app.api.CovidApiService;
import com.hari.covid_19app.api.VirusTrackerApi;
import com.hari.covid_19app.db.CovidDatabase;
import com.hari.covid_19app.firebaseDatabase.FirebaseDatabase;
import com.hari.covid_19app.mapper.DataApiResponseToStateEntity;
import com.hari.covid_19app.mapper.GlobalStateResponseToGlobalState;
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
public final class CovidRepositoryImp_Factory implements Factory<CovidRepositoryImp> {
  private final Provider<CovidApiService> covidApiServiceProvider;

  private final Provider<VirusTrackerApi> virusTrackerApiProvider;

  private final Provider<CovidDatabase> covidDatabaseProvider;

  private final Provider<FirebaseDatabase> firebaseDatabaseProvider;

  private final Provider<DataApiResponseToStateEntity> dataApiResponseToStateEntityProvider;

  private final Provider<GlobalStateResponseToGlobalState> globalStateResponseToGlobalStateProvider;

  public CovidRepositoryImp_Factory(Provider<CovidApiService> covidApiServiceProvider,
      Provider<VirusTrackerApi> virusTrackerApiProvider,
      Provider<CovidDatabase> covidDatabaseProvider,
      Provider<FirebaseDatabase> firebaseDatabaseProvider,
      Provider<DataApiResponseToStateEntity> dataApiResponseToStateEntityProvider,
      Provider<GlobalStateResponseToGlobalState> globalStateResponseToGlobalStateProvider) {
    this.covidApiServiceProvider = covidApiServiceProvider;
    this.virusTrackerApiProvider = virusTrackerApiProvider;
    this.covidDatabaseProvider = covidDatabaseProvider;
    this.firebaseDatabaseProvider = firebaseDatabaseProvider;
    this.dataApiResponseToStateEntityProvider = dataApiResponseToStateEntityProvider;
    this.globalStateResponseToGlobalStateProvider = globalStateResponseToGlobalStateProvider;
  }

  @Override
  public CovidRepositoryImp get() {
    return newInstance(covidApiServiceProvider.get(), virusTrackerApiProvider.get(), covidDatabaseProvider.get(), firebaseDatabaseProvider.get(), dataApiResponseToStateEntityProvider.get(), globalStateResponseToGlobalStateProvider.get());
  }

  public static CovidRepositoryImp_Factory create(Provider<CovidApiService> covidApiServiceProvider,
      Provider<VirusTrackerApi> virusTrackerApiProvider,
      Provider<CovidDatabase> covidDatabaseProvider,
      Provider<FirebaseDatabase> firebaseDatabaseProvider,
      Provider<DataApiResponseToStateEntity> dataApiResponseToStateEntityProvider,
      Provider<GlobalStateResponseToGlobalState> globalStateResponseToGlobalStateProvider) {
    return new CovidRepositoryImp_Factory(covidApiServiceProvider, virusTrackerApiProvider, covidDatabaseProvider, firebaseDatabaseProvider, dataApiResponseToStateEntityProvider, globalStateResponseToGlobalStateProvider);
  }

  public static CovidRepositoryImp newInstance(CovidApiService covidApiService,
      VirusTrackerApi virusTrackerApi, CovidDatabase covidDatabase,
      FirebaseDatabase firebaseDatabase, DataApiResponseToStateEntity dataApiResponseToStateEntity,
      GlobalStateResponseToGlobalState globalStateResponseToGlobalState) {
    return new CovidRepositoryImp(covidApiService, virusTrackerApi, covidDatabase, firebaseDatabase, dataApiResponseToStateEntity, globalStateResponseToGlobalState);
  }
}
