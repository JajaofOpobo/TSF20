package android.support.p002v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;
/* renamed from: android.support.v4.app.FragmentTabHost */
/* loaded from: classes.dex */
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: a */
    private final ArrayList<C0061a> f202a;

    /* renamed from: b */
    private Context f203b;

    /* renamed from: c */
    private AbstractC0094o f204c;

    /* renamed from: d */
    private int f205d;

    /* renamed from: e */
    private TabHost.OnTabChangeListener f206e;

    /* renamed from: f */
    private C0061a f207f;

    /* renamed from: g */
    private boolean f208g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.FragmentTabHost$a */
    /* loaded from: classes.dex */
    public static final class C0061a {

        /* renamed from: a */
        private final String f210a;

        /* renamed from: b */
        private final Class<?> f211b;

        /* renamed from: c */
        private final Bundle f212c;

        /* renamed from: d */
        private Fragment f213d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.app.FragmentTabHost$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v4.app.FragmentTabHost.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        String f209a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f209a = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f209a);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f209a + "}";
        }
    }

    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f202a = new ArrayList<>();
        m13709a(context, attributeSet);
    }

    /* renamed from: a */
    private void m13709a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.f205d = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Override // android.widget.TabHost
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f206e = onTabChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        AbstractC0106s abstractC0106s = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f202a.size()) {
                break;
            }
            C0061a c0061a = this.f202a.get(i2);
            c0061a.f213d = this.f204c.mo13542a(c0061a.f210a);
            if (c0061a.f213d != null && !c0061a.f213d.m13737n()) {
                if (c0061a.f210a.equals(currentTabTag)) {
                    this.f207f = c0061a;
                } else {
                    if (abstractC0106s == null) {
                        abstractC0106s = this.f204c.mo13569a();
                    }
                    abstractC0106s.mo13492b(c0061a.f213d);
                }
            }
            i = i2 + 1;
        }
        this.f208g = true;
        AbstractC0106s m13708a = m13708a(currentTabTag, abstractC0106s);
        if (m13708a != null) {
            m13708a.mo13498a();
            this.f204c.mo13540b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f208g = false;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f209a = getCurrentTabTag();
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
        setCurrentTabByTag(savedState.f209a);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public void onTabChanged(String str) {
        AbstractC0106s m13708a;
        if (this.f208g && (m13708a = m13708a(str, (AbstractC0106s) null)) != null) {
            m13708a.mo13498a();
        }
        if (this.f206e != null) {
            this.f206e.onTabChanged(str);
        }
    }

    /* renamed from: a */
    private AbstractC0106s m13708a(String str, AbstractC0106s abstractC0106s) {
        C0061a c0061a = null;
        int i = 0;
        while (i < this.f202a.size()) {
            C0061a c0061a2 = this.f202a.get(i);
            if (!c0061a2.f210a.equals(str)) {
                c0061a2 = c0061a;
            }
            i++;
            c0061a = c0061a2;
        }
        if (c0061a == null) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        if (this.f207f != c0061a) {
            if (abstractC0106s == null) {
                abstractC0106s = this.f204c.mo13569a();
            }
            if (this.f207f != null && this.f207f.f213d != null) {
                abstractC0106s.mo13492b(this.f207f.f213d);
            }
            if (c0061a != null) {
                if (c0061a.f213d == null) {
                    c0061a.f213d = Fragment.m13775a(this.f203b, c0061a.f211b.getName(), c0061a.f212c);
                    abstractC0106s.mo13496a(this.f205d, c0061a.f213d, c0061a.f210a);
                } else {
                    abstractC0106s.mo13491c(c0061a.f213d);
                }
            }
            this.f207f = c0061a;
        }
        return abstractC0106s;
    }
}
