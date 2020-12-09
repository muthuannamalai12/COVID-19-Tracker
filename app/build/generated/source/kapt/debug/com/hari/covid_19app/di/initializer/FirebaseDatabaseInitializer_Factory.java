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
public final class FirebaseDatabaseInitializer_Factory implements Factory<FirebaseDatabaseInitializer> {
  @Override
  public FirebaseDatabaseInitializer get() {
    return newInstance();
  }

  public static FirebaseDatabaseInitializer_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseDatabaseInitializer newInstance() {
    return new FirebaseDatabaseInitializer();
  }

  private static final class InstanceHolder {
    private static final FirebaseDatabaseInitializer_Factory INSTANCE = new FirebaseDatabaseInitializer_Factory();
  }
}
