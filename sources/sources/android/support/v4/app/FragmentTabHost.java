package android.support.v4.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList<a> a;
    private Context b;
    private o c;
    private int d;
    private TabHost.OnTabChangeListener e;
    private a f;
    private boolean g;

    static final class a {
        private final String a;
        private final Class<?> b;
        private final Bundle c;
        private Fragment d;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.app.FragmentTabHost.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        String a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.a + "}";
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList<>();
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.d = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.e = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        s sVarA = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                break;
            }
            a aVar = this.a.get(i2);
            aVar.d = this.c.a(aVar.a);
            if (aVar.d != null && !aVar.d.n()) {
                if (aVar.a.equals(currentTabTag)) {
                    this.f = aVar;
                } else {
                    if (sVarA == null) {
                        sVarA = this.c.a();
                    }
                    sVarA.b(aVar.d);
                }
            }
            i = i2 + 1;
        }
        this.g = true;
        s sVarA2 = a(currentTabTag, sVarA);
        if (sVarA2 != null) {
            sVarA2.a();
            this.c.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        s sVarA;
        if (this.g && (sVarA = a(str, (s) null)) != null) {
            sVarA.a();
        }
        if (this.e != null) {
            this.e.onTabChanged(str);
        }
    }

    private s a(String str, s sVar) {
        a aVar = null;
        int i = 0;
        while (i < this.a.size()) {
            a aVar2 = this.a.get(i);
            if (!aVar2.a.equals(str)) {
                aVar2 = aVar;
            }
            i++;
            aVar = aVar2;
        }
        if (aVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f != aVar) {
            if (sVar == null) {
                sVar = this.c.a();
            }
            if (this.f != null && this.f.d != null) {
                sVar.b(this.f.d);
            }
            if (aVar != null) {
                if (aVar.d == null) {
                    aVar.d = Fragment.a(this.b, aVar.b.getName(), aVar.c);
                    sVar.a(this.d, aVar.d, aVar.a);
                } else {
                    sVar.c(aVar.d);
                }
            }
            this.f = aVar;
        }
        return sVar;
    }
}
