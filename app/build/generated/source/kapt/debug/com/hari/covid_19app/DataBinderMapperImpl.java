package com.hari.covid_19app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.hari.covid_19app.databinding.ActivityMainBindingImpl;
import com.hari.covid_19app.databinding.AppBarMainBindingImpl;
import com.hari.covid_19app.databinding.FragmentHomeBindingImpl;
import com.hari.covid_19app.databinding.FragmentPopularQuestionsBindingImpl;
import com.hari.covid_19app.databinding.FragmentPreventionsBindingImpl;
import com.hari.covid_19app.databinding.FragmentStatisticsBindingImpl;
import com.hari.covid_19app.databinding.FragmentSymptomsBindingImpl;
import com.hari.covid_19app.databinding.ItemBigImageLeftSideBindingImpl;
import com.hari.covid_19app.databinding.ItemBigImageRightSideBindingImpl;
import com.hari.covid_19app.databinding.ItemGlobalUpdateCardBindingImpl;
import com.hari.covid_19app.databinding.ItemHeaderBindingImpl;
import com.hari.covid_19app.databinding.ItemHealthStatusCardBindingImpl;
import com.hari.covid_19app.databinding.ItemIndiaUpdateCardBindingImpl;
import com.hari.covid_19app.databinding.ItemNewsUpdatesBindingImpl;
import com.hari.covid_19app.databinding.ItemPopularQuestionCardBindingImpl;
import com.hari.covid_19app.databinding.ItemPreventionsImageBindingImpl;
import com.hari.covid_19app.databinding.ItemStateUtStatusBindingImpl;
import com.hari.covid_19app.databinding.ItemStatisticsCardBindingImpl;
import com.hari.covid_19app.databinding.ItemStatusHeaderBindingImpl;
import com.hari.covid_19app.databinding.ItemSymptomCardBindingImpl;
import com.hari.covid_19app.databinding.ItemSymptomsImageBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_APPBARMAIN = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTPOPULARQUESTIONS = 4;

  private static final int LAYOUT_FRAGMENTPREVENTIONS = 5;

  private static final int LAYOUT_FRAGMENTSTATISTICS = 6;

  private static final int LAYOUT_FRAGMENTSYMPTOMS = 7;

  private static final int LAYOUT_ITEMBIGIMAGELEFTSIDE = 8;

  private static final int LAYOUT_ITEMBIGIMAGERIGHTSIDE = 9;

  private static final int LAYOUT_ITEMGLOBALUPDATECARD = 10;

  private static final int LAYOUT_ITEMHEADER = 11;

  private static final int LAYOUT_ITEMHEALTHSTATUSCARD = 12;

  private static final int LAYOUT_ITEMINDIAUPDATECARD = 13;

  private static final int LAYOUT_ITEMNEWSUPDATES = 14;

  private static final int LAYOUT_ITEMPOPULARQUESTIONCARD = 15;

  private static final int LAYOUT_ITEMPREVENTIONSIMAGE = 16;

  private static final int LAYOUT_ITEMSTATEUTSTATUS = 17;

  private static final int LAYOUT_ITEMSTATISTICSCARD = 18;

  private static final int LAYOUT_ITEMSTATUSHEADER = 19;

  private static final int LAYOUT_ITEMSYMPTOMCARD = 20;

  private static final int LAYOUT_ITEMSYMPTOMSIMAGE = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.fragment_popular_questions, LAYOUT_FRAGMENTPOPULARQUESTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.fragment_preventions, LAYOUT_FRAGMENTPREVENTIONS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.fragment_statistics, LAYOUT_FRAGMENTSTATISTICS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.fragment_symptoms, LAYOUT_FRAGMENTSYMPTOMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_big_image_left_side, LAYOUT_ITEMBIGIMAGELEFTSIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_big_image_right_side, LAYOUT_ITEMBIGIMAGERIGHTSIDE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_global_update_card, LAYOUT_ITEMGLOBALUPDATECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_header, LAYOUT_ITEMHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_health_status_card, LAYOUT_ITEMHEALTHSTATUSCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_india_update_card, LAYOUT_ITEMINDIAUPDATECARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_news_updates, LAYOUT_ITEMNEWSUPDATES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_popular_question_card, LAYOUT_ITEMPOPULARQUESTIONCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_preventions_image, LAYOUT_ITEMPREVENTIONSIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_state_ut_status, LAYOUT_ITEMSTATEUTSTATUS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_statistics_card, LAYOUT_ITEMSTATISTICSCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_status_header, LAYOUT_ITEMSTATUSHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_symptom_card, LAYOUT_ITEMSYMPTOMCARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.hari.covid_19app.R.layout.item_symptoms_image, LAYOUT_ITEMSYMPTOMSIMAGE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPOPULARQUESTIONS: {
          if ("layout/fragment_popular_questions_0".equals(tag)) {
            return new FragmentPopularQuestionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_popular_questions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPREVENTIONS: {
          if ("layout/fragment_preventions_0".equals(tag)) {
            return new FragmentPreventionsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_preventions is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSTATISTICS: {
          if ("layout/fragment_statistics_0".equals(tag)) {
            return new FragmentStatisticsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_statistics is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSYMPTOMS: {
          if ("layout/fragment_symptoms_0".equals(tag)) {
            return new FragmentSymptomsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_symptoms is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBIGIMAGELEFTSIDE: {
          if ("layout/item_big_image_left_side_0".equals(tag)) {
            return new ItemBigImageLeftSideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_big_image_left_side is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMBIGIMAGERIGHTSIDE: {
          if ("layout/item_big_image_right_side_0".equals(tag)) {
            return new ItemBigImageRightSideBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_big_image_right_side is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGLOBALUPDATECARD: {
          if ("layout/item_global_update_card_0".equals(tag)) {
            return new ItemGlobalUpdateCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_global_update_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHEADER: {
          if ("layout/item_header_0".equals(tag)) {
            return new ItemHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHEALTHSTATUSCARD: {
          if ("layout/item_health_status_card_0".equals(tag)) {
            return new ItemHealthStatusCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_health_status_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMINDIAUPDATECARD: {
          if ("layout/item_india_update_card_0".equals(tag)) {
            return new ItemIndiaUpdateCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_india_update_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNEWSUPDATES: {
          if ("layout/item_news_updates_0".equals(tag)) {
            return new ItemNewsUpdatesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_news_updates is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPOPULARQUESTIONCARD: {
          if ("layout/item_popular_question_card_0".equals(tag)) {
            return new ItemPopularQuestionCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_popular_question_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMPREVENTIONSIMAGE: {
          if ("layout/item_preventions_image_0".equals(tag)) {
            return new ItemPreventionsImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_preventions_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATEUTSTATUS: {
          if ("layout/item_state_ut_status_0".equals(tag)) {
            return new ItemStateUtStatusBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_state_ut_status is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATISTICSCARD: {
          if ("layout/item_statistics_card_0".equals(tag)) {
            return new ItemStatisticsCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_statistics_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSTATUSHEADER: {
          if ("layout/item_status_header_0".equals(tag)) {
            return new ItemStatusHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_status_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSYMPTOMCARD: {
          if ("layout/item_symptom_card_0".equals(tag)) {
            return new ItemSymptomCardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_symptom_card is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSYMPTOMSIMAGE: {
          if ("layout/item_symptoms_image_0".equals(tag)) {
            return new ItemSymptomsImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_symptoms_image is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "globalState");
      sKeys.put(2, "prevention");
      sKeys.put(3, "question");
      sKeys.put(4, "state");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/activity_main_0", com.hari.covid_19app.R.layout.activity_main);
      sKeys.put("layout/app_bar_main_0", com.hari.covid_19app.R.layout.app_bar_main);
      sKeys.put("layout/fragment_home_0", com.hari.covid_19app.R.layout.fragment_home);
      sKeys.put("layout/fragment_popular_questions_0", com.hari.covid_19app.R.layout.fragment_popular_questions);
      sKeys.put("layout/fragment_preventions_0", com.hari.covid_19app.R.layout.fragment_preventions);
      sKeys.put("layout/fragment_statistics_0", com.hari.covid_19app.R.layout.fragment_statistics);
      sKeys.put("layout/fragment_symptoms_0", com.hari.covid_19app.R.layout.fragment_symptoms);
      sKeys.put("layout/item_big_image_left_side_0", com.hari.covid_19app.R.layout.item_big_image_left_side);
      sKeys.put("layout/item_big_image_right_side_0", com.hari.covid_19app.R.layout.item_big_image_right_side);
      sKeys.put("layout/item_global_update_card_0", com.hari.covid_19app.R.layout.item_global_update_card);
      sKeys.put("layout/item_header_0", com.hari.covid_19app.R.layout.item_header);
      sKeys.put("layout/item_health_status_card_0", com.hari.covid_19app.R.layout.item_health_status_card);
      sKeys.put("layout/item_india_update_card_0", com.hari.covid_19app.R.layout.item_india_update_card);
      sKeys.put("layout/item_news_updates_0", com.hari.covid_19app.R.layout.item_news_updates);
      sKeys.put("layout/item_popular_question_card_0", com.hari.covid_19app.R.layout.item_popular_question_card);
      sKeys.put("layout/item_preventions_image_0", com.hari.covid_19app.R.layout.item_preventions_image);
      sKeys.put("layout/item_state_ut_status_0", com.hari.covid_19app.R.layout.item_state_ut_status);
      sKeys.put("layout/item_statistics_card_0", com.hari.covid_19app.R.layout.item_statistics_card);
      sKeys.put("layout/item_status_header_0", com.hari.covid_19app.R.layout.item_status_header);
      sKeys.put("layout/item_symptom_card_0", com.hari.covid_19app.R.layout.item_symptom_card);
      sKeys.put("layout/item_symptoms_image_0", com.hari.covid_19app.R.layout.item_symptoms_image);
    }
  }
}
