package android.support.v4.app;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    private final ArrayList a;
    private FrameLayout b;
    private Context c;
    private l d;
    private int e;
    private TabHost.OnTabChangeListener f;
    private u g;
    private boolean h;

    class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new t();
        String a;

        /* synthetic */ SavedState(Parcel parcel, byte b) {
            this(parcel);
        }

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
        this.a = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.e = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.b = frameLayout2;
            this.b.setId(this.e);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @Override // android.widget.TabHost
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        String str;
        Fragment fragment;
        Fragment fragment2;
        String str2;
        Fragment fragment3;
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        v vVar = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.a.size()) {
                break;
            }
            u uVar = (u) this.a.get(i2);
            l lVar = this.d;
            str = uVar.a;
            uVar.d = lVar.a(str);
            fragment = uVar.d;
            if (fragment != null) {
                fragment2 = uVar.d;
                if (!fragment2.f()) {
                    str2 = uVar.a;
                    if (str2.equals(currentTabTag)) {
                        this.g = uVar;
                    } else {
                        if (vVar == null) {
                            vVar = this.d.a();
                        }
                        fragment3 = uVar.d;
                        vVar.b(fragment3);
                    }
                }
            }
            i = i2 + 1;
        }
        this.h = true;
        v a = a(currentTabTag, vVar);
        if (a != null) {
            a.a();
            this.d.b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.h = false;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.a);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        v a;
        if (this.h && (a = a(str, null)) != null) {
            a.a();
        }
        if (this.f != null) {
            this.f.onTabChanged(str);
        }
    }

    private v a(String str, v vVar) {
        Fragment fragment;
        Fragment fragment2;
        Class cls;
        Bundle bundle;
        Fragment fragment3;
        String str2;
        Fragment fragment4;
        Fragment fragment5;
        String str3;
        u uVar = null;
        int i = 0;
        while (i < this.a.size()) {
            u uVar2 = (u) this.a.get(i);
            str3 = uVar2.a;
            if (!str3.equals(str)) {
                uVar2 = uVar;
            }
            i++;
            uVar = uVar2;
        }
        if (uVar == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.g != uVar) {
            if (vVar == null) {
                vVar = this.d.a();
            }
            if (this.g != null) {
                fragment4 = this.g.d;
                if (fragment4 != null) {
                    fragment5 = this.g.d;
                    vVar.b(fragment5);
                }
            }
            if (uVar != null) {
                fragment = uVar.d;
                if (fragment != null) {
                    fragment2 = uVar.d;
                    vVar.c(fragment2);
                } else {
                    Context context = this.c;
                    cls = uVar.b;
                    String name = cls.getName();
                    bundle = uVar.c;
                    uVar.d = Fragment.a(context, name, bundle);
                    int i2 = this.e;
                    fragment3 = uVar.d;
                    str2 = uVar.a;
                    vVar.a(i2, fragment3, str2);
                }
            }
            this.g = uVar;
        }
        return vVar;
    }
}
