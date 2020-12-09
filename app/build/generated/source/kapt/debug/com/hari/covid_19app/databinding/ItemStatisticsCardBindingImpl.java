package com.hari.covid_19app.databinding;
import com.hari.covid_19app.R;
import com.hari.covid_19app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemStatisticsCardBindingImpl extends ItemStatisticsCardBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_flag, 8);
        sViewsWithIds.put(R.id.title_coronavirus_global, 9);
        sViewsWithIds.put(R.id.title_total_cases, 10);
        sViewsWithIds.put(R.id.title_deaths, 11);
        sViewsWithIds.put(R.id.title_recovered, 12);
        sViewsWithIds.put(R.id.chart, 13);
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemStatisticsCardBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ItemStatisticsCardBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.github.mikephil.charting.charts.PieChart) bindings[13]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[10]
            );
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.textDeaths.setTag(null);
        this.textLastUpdate.setTag(null);
        this.textNewDeaths.setTag(null);
        this.textNewRecovered.setTag(null);
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
        if (BR.state == variableId) {
            setState((com.hari.covid_19app.db.entity.State) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setState(@Nullable com.hari.covid_19app.db.entity.State State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.state);
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
        java.lang.String stateRecovered = null;
        java.lang.String stateDeltaRecovered = null;
        com.hari.covid_19app.db.entity.State state = mState;
        java.lang.String stateDeltaConfirmed = null;
        java.lang.String stateDeltaDeaths = null;
        java.lang.String stateDeaths = null;
        java.lang.String stateConfirmed = null;
        java.lang.String stateLastUpdatedTime = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (state != null) {
                    // read state.recovered
                    stateRecovered = state.getRecovered();
                    // read state.deltaRecovered
                    stateDeltaRecovered = state.getDeltaRecovered();
                    // read state.deltaConfirmed
                    stateDeltaConfirmed = state.getDeltaConfirmed();
                    // read state.deltaDeaths
                    stateDeltaDeaths = state.getDeltaDeaths();
                    // read state.deaths
                    stateDeaths = state.getDeaths();
                    // read state.confirmed
                    stateConfirmed = state.getConfirmed();
                    // read state.lastUpdatedTime
                    stateLastUpdatedTime = state.getLastUpdatedTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textDeaths, stateDeaths);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setLastUpdatedTime(this.textLastUpdate, stateLastUpdatedTime);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setDelta(this.textNewDeaths, stateDeltaDeaths);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setDelta(this.textNewRecovered, stateDeltaRecovered);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textRecovered, stateRecovered);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setCases(this.textTotalCases, stateConfirmed);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.setDelta(this.textTotalNewCases, stateDeltaConfirmed);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): state
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}