package com.hari.covid_19app.firebaseDatabase;

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
public final class FirebaseDatabaseImp_Factory implements Factory<FirebaseDatabaseImp> {
  @Override
  public FirebaseDatabaseImp get() {
    return newInstance();
  }

  public static FirebaseDatabaseImp_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseDatabaseImp newInstance() {
    return new FirebaseDatabaseImp();
  }

  private static final class InstanceHolder {
    private static final FirebaseDatabaseImp_Factory INSTANCE = new FirebaseDatabaseImp_Factory();
  }
}
