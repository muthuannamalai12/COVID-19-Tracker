package com.hari.covid_19app.workmanager;

import android.content.Context;
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
public final class SyncWork_Factory implements Factory<SyncWork> {
  private final Provider<Context> contextProvider;

  public SyncWork_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SyncWork get() {
    return newInstance(contextProvider.get());
  }

  public static SyncWork_Factory create(Provider<Context> contextProvider) {
    return new SyncWork_Factory(contextProvider);
  }

  public static SyncWork newInstance(Context context) {
    return new SyncWork(context);
  }
}
