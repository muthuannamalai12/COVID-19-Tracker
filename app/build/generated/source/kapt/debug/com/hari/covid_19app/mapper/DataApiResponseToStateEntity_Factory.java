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
public final class DataApiResponseToStateEntity_Factory implements Factory<DataApiResponseToStateEntity> {
  @Override
  public DataApiResponseToStateEntity get() {
    return newInstance();
  }

  public static DataApiResponseToStateEntity_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DataApiResponseToStateEntity newInstance() {
    return new DataApiResponseToStateEntity();
  }

  private static final class InstanceHolder {
    private static final DataApiResponseToStateEntity_Factory INSTANCE = new DataApiResponseToStateEntity_Factory();
  }
}
