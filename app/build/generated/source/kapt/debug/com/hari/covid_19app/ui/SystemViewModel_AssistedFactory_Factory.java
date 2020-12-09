package com.hari.covid_19app.ui;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SystemViewModel_AssistedFactory_Factory implements Factory<SystemViewModel_AssistedFactory> {
  @Override
  public SystemViewModel_AssistedFactory get() {
    return newInstance();
  }

  public static SystemViewModel_AssistedFactory_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SystemViewModel_AssistedFactory newInstance() {
    return new SystemViewModel_AssistedFactory();
  }

  private static final class InstanceHolder {
    private static final SystemViewModel_AssistedFactory_Factory INSTANCE = new SystemViewModel_AssistedFactory_Factory();
  }
}
