package com.hari.covid_19app.databinding;
import com.hari.covid_19app.R;
import com.hari.covid_19app.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemBigImageLeftSideBindingImpl extends ItemBigImageLeftSideBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final com.google.android.material.card.MaterialCardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemBigImageLeftSideBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemBigImageLeftSideBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.description.setTag(null);
        this.imageView.setTag(null);
        this.mboundView0 = (com.google.android.material.card.MaterialCardView) bindings[0];
        this.mboundView0.setTag(null);
        this.titleText.setTag(null);
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
        if (BR.prevention == variableId) {
            setPrevention((com.hari.covid_19app.model.Prevention) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPrevention(@Nullable com.hari.covid_19app.model.Prevention Prevention) {
        this.mPrevention = Prevention;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.prevention);
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
        java.lang.String preventionTitle = null;
        java.lang.String preventionDescription = null;
        java.lang.String preventionImageUrl = null;
        com.hari.covid_19app.model.Prevention prevention = mPrevention;

        if ((dirtyFlags & 0x3L) != 0) {



                if (prevention != null) {
                    // read prevention.title
                    preventionTitle = prevention.getTitle();
                    // read prevention.description
                    preventionDescription = prevention.getDescription();
                    // read prevention.imageUrl
                    preventionImageUrl = prevention.getImageUrl();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.description, preventionDescription);
            com.hari.covid_19app.utils.binding.BindingAdapterKt.loadImage(this.imageView, preventionImageUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleText, preventionTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): prevention
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}