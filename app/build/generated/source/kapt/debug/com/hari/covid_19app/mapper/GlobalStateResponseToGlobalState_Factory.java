package com.hari.covid_19app.mapper;

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
public final class GlobalStateResponseToGlobalState_Factory implements Factory<GlobalStateResponseToGlobalState> {
  @Override
  public GlobalStateResponseToGlobalState get() {
    return newInstance();
  }

  public static GlobalStateResponseToGlobalState_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static GlobalStateResponseToGlobalState newInstance() {
    return new GlobalStateResponseToGlobalState();
  }

  private static final class InstanceHolder {
    private static final GlobalStateResponseToGlobalState_Factory INSTANCE = new GlobalStateResponseToGlobalState_Factory();
  }
}
