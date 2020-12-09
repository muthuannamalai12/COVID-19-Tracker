package com.hari.covid_19app.ui;

import com.hari.covid_19app.workmanager.SyncWork;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<SyncWork> syncWorkProvider;

  public MainActivity_MembersInjector(Provider<SyncWork> syncWorkProvider) {
    this.syncWorkProvider = syncWorkProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<SyncWork> syncWorkProvider) {
    return new MainActivity_MembersInjector(syncWorkProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectSyncWork(instance, syncWorkProvider.get());
  }

  @InjectedFieldSignature("com.hari.covid_19app.ui.MainActivity.syncWork")
  public static void injectSyncWork(MainActivity instance, SyncWork syncWork) {
    instance.syncWork = syncWork;
  }
}
