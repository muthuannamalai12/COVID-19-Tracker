package com.hari.covid_19app.databinding;
import com.hari.covid_19app.R;
import com.hari.covid_19app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemGlobalUpdateCardBindingImpl extends ItemGlobalUpdateCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.title_coronavirus_global, 6);
        sViewsWithIds.put(R.id.title_total_cases, 7);
        sViewsWithIds.put(R.id.title_deaths, 8);
        sViewsWithIds.put(R.id.title_recovered, 9);
        sViewsWithIds.put(R.id.text_new_recovered, 10);
        sViewsWithIds.put(R.id.text_last_update, 11);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemGlobalUpdateCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ItemGlobalUpdateCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textDeaths.setTag(null);
        this.textNewDeaths.setTag(null);
        this.textRecovered.setTag(null);
        this.textTotalCases.setTag(null);
        this.textTotalNewCases.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.globalState == variableId) {
            setGlobalState((com.hari.covid_19app.db.entity.GlobalState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGlobalState(@Nullable com.hari.covid_19app.db.entity.GlobalState GlobalState) {
        this.mGlobalState = GlobalState;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.globalState);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Integer globalStateTotalCases = null;
        java.lang.Integer globalStateTotalNewCasesToday = null;
        int androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalRecovered = 0;
        java.lang.String globalStateTotalNewCasesTodayToString = null;
        java.lang.String globalStateTotalNewDeathsTodayToString = null;
        java.lang.Integer globalStateTotalNewDeathsToday = null;
        int androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalCases = 0;
        com.hari.covid_19app.db.entity.GlobalState globalState = mGlobalState;
        int androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalDeaths = 0;
        java.lang.Integer globalStateTotalDeaths = null;
        java.lang.Integer globalStateTotalRecovered = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (globalState != null) {
                    // read globalState.totalCases
                    globalStateTotalCases = globalState.getTotalCases();
                    // read globalState.totalNewCasesToday
                    globalStateTotalNewCasesToday = globalState.getTotalNewCasesToday();
                    // read globalState.totalNewDeathsToday
                    globalStateTotalNewDeathsToday = globalState.getTotalNewDeathsToday();
                    // read globalState.totalDeaths
                    globalStateTotalDeaths = globalState.getTotalDeaths();
                    // read globalState.totalRecovered
                    globalStateTotalRecovered = globalState.getTotalRecovered();
                }


                // read androidx.databinding.ViewDataBinding.safeUnbox(globalState.totalCases)
                androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalCases = androidx.databinding.ViewDataBinding.safeUnbox(globalStateTotalCases);
                // read androidx.databinding.ViewDataBinding.safeUnbox(globalState.totalDeaths)
                androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalDeaths = androidx.databinding.ViewDataBinding.safeUnbox(globalStateTotalDeaths);
                // read androidx.databinding.ViewDataBinding.safeUnbox(globalState.totalRecovered)
                androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalRecovered = androidx.databinding.ViewDataBinding.safeUnbox(globalStateTotalRecovered);
                if (globalStateTotalNewCasesToday != null) {
                    // read globalState.totalNewCasesToday.toString()
                    globalStateTotalNewCasesTodayToString = globalStateTotalNewCasesToday.toString();
                }
                if (globalStateTotalNewDeathsToday != null) {
                    // read globalState.totalNewDeathsToday.toString()
                    globalStateTotalNewDeathsTodayToString = globalStateTotalNewDeathsToday.toString();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textDeaths, androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalDeaths);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setDelta(this.textNewDeaths, globalStateTotalNewDeathsTodayToString);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textRecovered, androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalRecovered);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textTotalCases, androidxDatabindingViewDataBindingSafeUnboxGlobalStateTotalCases);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setDelta(this.textTotalNewCases, globalStateTotalNewCasesTodayToString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): globalState
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}