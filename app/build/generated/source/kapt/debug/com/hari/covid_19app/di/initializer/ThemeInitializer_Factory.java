package com.hari.covid_19app.di.initializer;

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
public final class ThemeInitializer_Factory implements Factory<ThemeInitializer> {
  @Override
  public ThemeInitializer get() {
    return newInstance();
  }

  public static ThemeInitializer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ThemeInitializer newInstance() {
    return new ThemeInitializer();
  }

  private static final class InstanceHolder {
    private static final ThemeInitializer_Factory INSTANCE = new ThemeInitializer_Factory();
  }
}
