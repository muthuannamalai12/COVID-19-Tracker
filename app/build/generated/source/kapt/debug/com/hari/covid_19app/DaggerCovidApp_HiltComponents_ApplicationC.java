package com.hari.covid_19app;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.ListenableWorker;
import com.hari.covid_19app.api.CovidApiService;
import com.hari.covid_19app.api.VirusTrackerApi;
import com.hari.covid_19app.db.CacheDatabase;
import com.hari.covid_19app.db.RoomDatabase;
import com.hari.covid_19app.db.dao.GlobalStateDao;
import com.hari.covid_19app.db.dao.StateDao;
import com.hari.covid_19app.di.appinitializer.AppInitializer;
import com.hari.covid_19app.di.initializer.AppInitializers;
import com.hari.covid_19app.di.initializer.FirebaseDatabaseInitializer;
import com.hari.covid_19app.di.initializer.ThemeInitializer;
import com.hari.covid_19app.di.module.AppModule;
import com.hari.covid_19app.di.module.AppModule_CacheDatabaseFactory;
import com.hari.covid_19app.di.module.AppModule_ProvideCovidApiServiceFactory;
import com.hari.covid_19app.di.module.AppModule_ProvideGlobalStateDaoFactory;
import com.hari.covid_19app.di.module.AppModule_ProvideGsonFactory;
import com.hari.covid_19app.di.module.AppModule_ProvideStateDaoFactory;
import com.hari.covid_19app.di.module.AppModule_ProvideVirusTrackerApiServiceFactory;
import com.hari.covid_19app.di.module.AppModule_ProvidesOkHttpClientFactory;
import com.hari.covid_19app.firebaseDatabase.FirebaseDatabaseImp;
import com.hari.covid_19app.mapper.DataApiResponseToStateEntity;
import com.hari.covid_19app.mapper.GlobalStateResponseToGlobalState;
import com.hari.covid_19app.repository.CovidRepositoryImp;
import com.hari.covid_19app.ui.MainActivity;
import com.hari.covid_19app.ui.MainActivity_MembersInjector;
import com.hari.covid_19app.ui.SystemViewModel_AssistedFactory;
import com.hari.covid_19app.ui.SystemViewModel_AssistedFactory_Factory;
import com.hari.covid_19app.ui.home.HomeFragment;
import com.hari.covid_19app.ui.home.HomeViewModel_AssistedFactory;
import com.hari.covid_19app.ui.home.HomeViewModel_AssistedFactory_Factory;
import com.hari.covid_19app.ui.preventions.PreventionsFragment;
import com.hari.covid_19app.ui.preventions.PreventionsViewModel_AssistedFactory;
import com.hari.covid_19app.ui.preventions.PreventionsViewModel_AssistedFactory_Factory;
import com.hari.covid_19app.ui.questions.PopularQuestionFragment;
import com.hari.covid_19app.ui.questions.PopularQuestionsViewModel_AssistedFactory;
import com.hari.covid_19app.ui.questions.PopularQuestionsViewModel_AssistedFactory_Factory;
import com.hari.covid_19app.ui.splash.SplashActivity;
import com.hari.covid_19app.ui.statistics.StatisticsFragment;
import com.hari.covid_19app.ui.statistics.StatisticsViewModel_AssistedFactory;
import com.hari.covid_19app.ui.statistics.StatisticsViewModel_AssistedFactory_Factory;
import com.hari.covid_19app.ui.symptons.SymptomsFragment;
import com.hari.covid_19app.workmanager.SyncWork;
import com.hari.covid_19app.workmanager.SyncWorker_AssistedFactory;
import com.hari.covid_19app.workmanager.SyncWorker_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import dagger.internal.SetBuilder;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerCovidApp_HiltComponents_ApplicationC extends CovidApp_HiltComponents.ApplicationC {
  private final AppModule appModule;

  private final ApplicationContextModule applicationContextModule;

  private volatile Object cacheDatabase = new MemoizedSentinel();

  private volatile Object firebaseDatabaseImp = new MemoizedSentinel();

  private volatile Object covidRepositoryImp = new MemoizedSentinel();

  private volatile Provider<CovidRepositoryImp> covidRepositoryImpProvider;

  private volatile Provider<SyncWorker_AssistedFactory> syncWorker_AssistedFactoryProvider;

  private DaggerCovidApp_HiltComponents_ApplicationC(AppModule appModuleParam,
      ApplicationContextModule applicationContextModuleParam) {
    this.appModule = appModuleParam;
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private CovidApiService getCovidApiService() {
    return AppModule_ProvideCovidApiServiceFactory.provideCovidApiService(appModule, AppModule_ProvideGsonFactory.provideGson(appModule), AppModule_ProvidesOkHttpClientFactory.providesOkHttpClient(appModule));
  }

  private VirusTrackerApi getVirusTrackerApi() {
    return AppModule_ProvideVirusTrackerApiServiceFactory.provideVirusTrackerApiService(appModule, AppModule_ProvideGsonFactory.provideGson(appModule), AppModule_ProvidesOkHttpClientFactory.providesOkHttpClient(appModule));
  }

  private CacheDatabase getCacheDatabase() {
    Object local = cacheDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = cacheDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_CacheDatabaseFactory.cacheDatabase(appModule, ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          cacheDatabase = DoubleCheck.reentrantCheck(cacheDatabase, local);
        }
      }
    }
    return (CacheDatabase) local;
  }

  private StateDao getStateDao() {
    return AppModule_ProvideStateDaoFactory.provideStateDao(appModule, getCacheDatabase());
  }

  private GlobalStateDao getGlobalStateDao() {
    return AppModule_ProvideGlobalStateDaoFactory.provideGlobalStateDao(appModule, getCacheDatabase());
  }

  private RoomDatabase getRoomDatabase() {
    return new RoomDatabase(getCacheDatabase(), getStateDao(), getGlobalStateDao());
  }

  private FirebaseDatabaseImp getFirebaseDatabaseImp() {
    Object local = firebaseDatabaseImp;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = firebaseDatabaseImp;
        if (local instanceof MemoizedSentinel) {
          local = new FirebaseDatabaseImp();
          firebaseDatabaseImp = DoubleCheck.reentrantCheck(firebaseDatabaseImp, local);
        }
      }
    }
    return (FirebaseDatabaseImp) local;
  }

  private CovidRepositoryImp getCovidRepositoryImp() {
    Object local = covidRepositoryImp;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = covidRepositoryImp;
        if (local instanceof MemoizedSentinel) {
          local = new CovidRepositoryImp(getCovidApiService(), getVirusTrackerApi(), getRoomDatabase(), getFirebaseDatabaseImp(), new DataApiResponseToStateEntity(), new GlobalStateResponseToGlobalState());
          covidRepositoryImp = DoubleCheck.reentrantCheck(covidRepositoryImp, local);
        }
      }
    }
    return (CovidRepositoryImp) local;
  }

  private Provider<CovidRepositoryImp> getCovidRepositoryImpProvider() {
    Object local = covidRepositoryImpProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      covidRepositoryImpProvider = (Provider<CovidRepositoryImp>) local;
    }
    return (Provider<CovidRepositoryImp>) local;
  }

  private SyncWorker_AssistedFactory getSyncWorker_AssistedFactory() {
    return SyncWorker_AssistedFactory_Factory.newInstance((Provider) getCovidRepositoryImpProvider());
  }

  private Provider<SyncWorker_AssistedFactory> getSyncWorker_AssistedFactoryProvider() {
    Object local = syncWorker_AssistedFactoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      syncWorker_AssistedFactoryProvider = (Provider<SyncWorker_AssistedFactory>) local;
    }
    return (Provider<SyncWorker_AssistedFactory>) local;
  }

  private Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> getMapOfStringAndProviderOfWorkerAssistedFactoryOf(
      ) {
    return Collections.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>singletonMap("com.hari.covid_19app.workmanager.SyncWorker", (Provider) getSyncWorker_AssistedFactoryProvider());
  }

  private HiltWorkerFactory getHiltWorkerFactory() {
    return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(getMapOfStringAndProviderOfWorkerAssistedFactoryOf());
  }

  private Set<AppInitializer> getSetOfAppInitializer() {
    return SetBuilder.<AppInitializer>newSetBuilder(2).add(new ThemeInitializer()).add(new FirebaseDatabaseInitializer()).build();
  }

  private AppInitializers getAppInitializers() {
    return new AppInitializers(getSetOfAppInitializer());
  }

  @Override
  public void injectCovidApp(CovidApp covidApp) {
    injectCovidApp2(covidApp);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  private CovidApp injectCovidApp2(CovidApp instance) {
    CovidApp_MembersInjector.injectWorkerFactory(instance, getHiltWorkerFactory());
    CovidApp_MembersInjector.injectInitializers(instance, getAppInitializers());
    return instance;
  }

  public static final class Builder {
    private AppModule appModule;

    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public CovidApp_HiltComponents.ApplicationC build() {
      if (appModule == null) {
        this.appModule = new AppModule();
      }
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerCovidApp_HiltComponents_ApplicationC(appModule, applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements CovidApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public CovidApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends CovidApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements CovidApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public CovidApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends CovidApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private volatile Provider<PopularQuestionsViewModel_AssistedFactory> popularQuestionsViewModel_AssistedFactoryProvider;

      private volatile Provider<PreventionsViewModel_AssistedFactory> preventionsViewModel_AssistedFactoryProvider;

      private volatile Provider<StatisticsViewModel_AssistedFactory> statisticsViewModel_AssistedFactoryProvider;

      private volatile Provider<SystemViewModel_AssistedFactory> systemViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private SyncWork getSyncWork() {
        return new SyncWork(ApplicationContextModule_ProvideContextFactory.provideContext(DaggerCovidApp_HiltComponents_ApplicationC.this.applicationContextModule));
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance((Provider) DaggerCovidApp_HiltComponents_ApplicationC.this.getCovidRepositoryImpProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private PopularQuestionsViewModel_AssistedFactory getPopularQuestionsViewModel_AssistedFactory(
          ) {
        return PopularQuestionsViewModel_AssistedFactory_Factory.newInstance((Provider) DaggerCovidApp_HiltComponents_ApplicationC.this.getCovidRepositoryImpProvider());
      }

      private Provider<PopularQuestionsViewModel_AssistedFactory> getPopularQuestionsViewModel_AssistedFactoryProvider(
          ) {
        Object local = popularQuestionsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          popularQuestionsViewModel_AssistedFactoryProvider = (Provider<PopularQuestionsViewModel_AssistedFactory>) local;
        }
        return (Provider<PopularQuestionsViewModel_AssistedFactory>) local;
      }

      private PreventionsViewModel_AssistedFactory getPreventionsViewModel_AssistedFactory() {
        return PreventionsViewModel_AssistedFactory_Factory.newInstance((Provider) DaggerCovidApp_HiltComponents_ApplicationC.this.getCovidRepositoryImpProvider());
      }

      private Provider<PreventionsViewModel_AssistedFactory> getPreventionsViewModel_AssistedFactoryProvider(
          ) {
        Object local = preventionsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          preventionsViewModel_AssistedFactoryProvider = (Provider<PreventionsViewModel_AssistedFactory>) local;
        }
        return (Provider<PreventionsViewModel_AssistedFactory>) local;
      }

      private StatisticsViewModel_AssistedFactory getStatisticsViewModel_AssistedFactory() {
        return StatisticsViewModel_AssistedFactory_Factory.newInstance((Provider) DaggerCovidApp_HiltComponents_ApplicationC.this.getCovidRepositoryImpProvider());
      }

      private Provider<StatisticsViewModel_AssistedFactory> getStatisticsViewModel_AssistedFactoryProvider(
          ) {
        Object local = statisticsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          statisticsViewModel_AssistedFactoryProvider = (Provider<StatisticsViewModel_AssistedFactory>) local;
        }
        return (Provider<StatisticsViewModel_AssistedFactory>) local;
      }

      private Provider<SystemViewModel_AssistedFactory> getSystemViewModel_AssistedFactoryProvider(
          ) {
        Object local = systemViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          systemViewModel_AssistedFactoryProvider = (Provider<SystemViewModel_AssistedFactory>) local;
        }
        return (Provider<SystemViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(5).put("com.hari.covid_19app.ui.home.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider()).put("com.hari.covid_19app.ui.questions.PopularQuestionsViewModel", (Provider) getPopularQuestionsViewModel_AssistedFactoryProvider()).put("com.hari.covid_19app.ui.preventions.PreventionsViewModel", (Provider) getPreventionsViewModel_AssistedFactoryProvider()).put("com.hari.covid_19app.ui.statistics.StatisticsViewModel", (Provider) getStatisticsViewModel_AssistedFactoryProvider()).put("com.hari.covid_19app.ui.SystemViewModel", (Provider) getSystemViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCovidApp_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);
      }

      @Override
      public void injectSplashActivity(SplashActivity splashActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectSyncWork(instance, getSyncWork());
        return instance;
      }

      private final class FragmentCBuilder implements CovidApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public CovidApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends CovidApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerCovidApp_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public void injectPreventionsFragment(PreventionsFragment preventionsFragment) {
        }

        @Override
        public void injectPopularQuestionFragment(PopularQuestionFragment popularQuestionFragment) {
        }

        @Override
        public void injectStatisticsFragment(StatisticsFragment statisticsFragment) {
        }

        @Override
        public void injectSymptomsFragment(SymptomsFragment symptomsFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements CovidApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public CovidApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends CovidApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements CovidApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public CovidApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends CovidApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.hari.covid_19app.ui.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            case 1: // com.hari.covid_19app.ui.questions.PopularQuestionsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPopularQuestionsViewModel_AssistedFactory();

            case 2: // com.hari.covid_19app.ui.preventions.PreventionsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getPreventionsViewModel_AssistedFactory();

            case 3: // com.hari.covid_19app.ui.statistics.StatisticsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getStatisticsViewModel_AssistedFactory();

            case 4: // com.hari.covid_19app.ui.SystemViewModel_AssistedFactory 
            return (T) SystemViewModel_AssistedFactory_Factory.newInstance();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements CovidApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public CovidApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends CovidApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.hari.covid_19app.workmanager.SyncWorker_AssistedFactory 
        return (T) DaggerCovidApp_HiltComponents_ApplicationC.this.getSyncWorker_AssistedFactory();

        case 1: // com.hari.covid_19app.repository.CovidRepositoryImp 
        return (T) DaggerCovidApp_HiltComponents_ApplicationC.this.getCovidRepositoryImp();

        default: throw new AssertionError(id);
      }
    }
  }
}
