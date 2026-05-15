package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ai;
import android.support.v7.a.a;
import android.support.v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ActivityChooserView extends ViewGroup {
    android.support.v4.view.d a;
    private final a b;
    private final b c;
    private final LinearLayoutCompat d;
    private final Drawable e;
    private final FrameLayout f;
    private final ImageView g;
    private final FrameLayout h;
    private final ImageView i;
    private final int j;
    private final DataSetObserver k;
    private final ViewTreeObserver.OnGlobalLayoutListener l;
    private ListPopupWindow m;
    private PopupWindow.OnDismissListener n;
    private boolean o;
    private int p;
    private boolean q;
    private int r;

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.b.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.b.notifyDataSetInvalidated();
            }
        };
        this.l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ActivityChooserView.this.c()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().i();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().c();
                    if (ActivityChooserView.this.a != null) {
                        ActivityChooserView.this.a.a(true);
                    }
                }
            }
        };
        this.p = 4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.ActivityChooserView, i, 0);
        this.p = typedArrayObtainStyledAttributes.getInt(a.k.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(a.k.ActivityChooserView_expandActivityOverflowButtonDrawable);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.h.abc_activity_chooser_view, (ViewGroup) this, true);
        this.c = new b();
        this.d = (LinearLayoutCompat) findViewById(a.f.activity_chooser_view_content);
        this.e = this.d.getBackground();
        this.h = (FrameLayout) findViewById(a.f.default_activity_button);
        this.h.setOnClickListener(this.c);
        this.h.setOnLongClickListener(this.c);
        this.i = (ImageView) this.h.findViewById(a.f.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(a.f.expand_activities_button);
        frameLayout.setOnClickListener(this.c);
        frameLayout.setOnTouchListener(new ListPopupWindow.b(frameLayout) { // from class: android.support.v7.widget.ActivityChooserView.3
            @Override // android.support.v7.widget.ListPopupWindow.b
            public ListPopupWindow a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // android.support.v7.widget.ListPopupWindow.b
            protected boolean b() {
                ActivityChooserView.this.a();
                return true;
            }

            @Override // android.support.v7.widget.ListPopupWindow.b
            protected boolean c() {
                ActivityChooserView.this.b();
                return true;
            }
        });
        this.f = frameLayout;
        this.g = (ImageView) frameLayout.findViewById(a.f.image);
        this.g.setImageDrawable(drawable);
        this.b = new a();
        this.b.registerDataSetObserver(new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.4
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.d();
            }
        });
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.d.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(d dVar) {
        this.b.a(dVar);
        if (c()) {
            b();
            a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.g.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.g.setContentDescription(getContext().getString(i));
    }

    public void setProvider(android.support.v4.view.d dVar) {
        this.a = dVar;
    }

    public boolean a() {
        if (c() || !this.q) {
            return false;
        }
        this.o = false;
        a(this.p);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        if (this.b.e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.l);
        boolean z = this.h.getVisibility() == 0;
        int iC = this.b.c();
        int i2 = z ? 1 : 0;
        if (i != Integer.MAX_VALUE && iC > i2 + i) {
            this.b.a(true);
            this.b.a(i - 1);
        } else {
            this.b.a(false);
            this.b.a(i);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.k()) {
            if (this.o || !z) {
                this.b.a(true, z);
            } else {
                this.b.a(false, false);
            }
            listPopupWindow.f(Math.min(this.b.a(), this.j));
            listPopupWindow.c();
            if (this.a != null) {
                this.a.a(true);
            }
            listPopupWindow.m().setContentDescription(getContext().getString(a.i.abc_activitychooserview_choose_application));
        }
    }

    public boolean b() {
        if (c()) {
            getListPopupWindow().i();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.l);
                return true;
            }
            return true;
        }
        return true;
    }

    public boolean c() {
        return getListPopupWindow().k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVarE = this.b.e();
        if (dVarE != null) {
            dVarE.registerObserver(this.k);
        }
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d dVarE = this.b.e();
        if (dVarE != null) {
            dVarE.unregisterObserver(this.k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.l);
        }
        if (c()) {
            b();
        }
        this.q = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat = this.d;
        if (this.h.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(linearLayoutCompat, i, i2);
        setMeasuredDimension(linearLayoutCompat.getMeasuredWidth(), linearLayoutCompat.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.d.layout(0, 0, i3 - i, i4 - i2);
        if (!c()) {
            b();
        }
    }

    public d getDataModel() {
        return this.b.e();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.n = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.p = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.r = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListPopupWindow getListPopupWindow() {
        if (this.m == null) {
            this.m = new ListPopupWindow(getContext());
            this.m.a(this.b);
            this.m.a(this);
            this.m.a(true);
            this.m.a((AdapterView.OnItemClickListener) this.c);
            this.m.a((PopupWindow.OnDismissListener) this.c);
        }
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.b.getCount() > 0) {
            this.f.setEnabled(true);
        } else {
            this.f.setEnabled(false);
        }
        int iC = this.b.c();
        int iD = this.b.d();
        if (iC == 1 || (iC > 1 && iD > 0)) {
            this.h.setVisibility(0);
            ResolveInfo resolveInfoB = this.b.b();
            PackageManager packageManager = getContext().getPackageManager();
            this.i.setImageDrawable(resolveInfoB.loadIcon(packageManager));
            if (this.r != 0) {
                this.h.setContentDescription(getContext().getString(this.r, resolveInfoB.loadLabel(packageManager)));
            }
        } else {
            this.h.setVisibility(8);
        }
        if (this.h.getVisibility() == 0) {
            this.d.setBackgroundDrawable(this.e);
        } else {
            this.d.setBackgroundDrawable(null);
        }
    }

    private class b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        private b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.b();
                    if (!ActivityChooserView.this.o) {
                        if (!ActivityChooserView.this.b.f()) {
                            i++;
                        }
                        Intent intentB = ActivityChooserView.this.b.e().b(i);
                        if (intentB != null) {
                            intentB.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(intentB);
                            return;
                        }
                        return;
                    }
                    if (i > 0) {
                        ActivityChooserView.this.b.e().c(i);
                        return;
                    }
                    return;
                case 1:
                    ActivityChooserView.this.a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != ActivityChooserView.this.h) {
                if (view == ActivityChooserView.this.f) {
                    ActivityChooserView.this.o = false;
                    ActivityChooserView.this.a(ActivityChooserView.this.p);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.b();
            Intent intentB = ActivityChooserView.this.b.e().b(ActivityChooserView.this.b.e().a(ActivityChooserView.this.b.b()));
            if (intentB != null) {
                intentB.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(intentB);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.h) {
                if (ActivityChooserView.this.b.getCount() > 0) {
                    ActivityChooserView.this.o = true;
                    ActivityChooserView.this.a(ActivityChooserView.this.p);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            a();
            if (ActivityChooserView.this.a != null) {
                ActivityChooserView.this.a.a(false);
            }
        }

        private void a() {
            if (ActivityChooserView.this.n != null) {
                ActivityChooserView.this.n.onDismiss();
            }
        }
    }

    private class a extends BaseAdapter {
        private d b;
        private int c;
        private boolean d;
        private boolean e;
        private boolean f;

        private a() {
            this.c = 4;
        }

        public void a(d dVar) {
            d dVarE = ActivityChooserView.this.b.e();
            if (dVarE != null && ActivityChooserView.this.isShown()) {
                dVarE.unregisterObserver(ActivityChooserView.this.k);
            }
            this.b = dVar;
            if (dVar != null && ActivityChooserView.this.isShown()) {
                dVar.registerObserver(ActivityChooserView.this.k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f && i == getCount() + (-1)) ? 1 : 0;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int iA = this.b.a();
            if (!this.d && this.b.b() != null) {
                iA--;
            }
            int iMin = Math.min(iA, this.c);
            if (this.f) {
                return iMin + 1;
            }
            return iMin;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.d && this.b.b() != null) {
                        i++;
                    }
                    return this.b.a(i);
                case 1:
                    return null;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            switch (getItemViewType(i)) {
                case 0:
                    if (view == null || view.getId() != a.f.list_item) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.h.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ImageView imageView = (ImageView) view.findViewById(a.f.icon);
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    imageView.setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(a.f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.d && i == 0 && this.e) {
                        ai.b(view, true);
                        return view;
                    }
                    ai.b(view, false);
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        View viewInflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.h.abc_activity_chooser_view_list_item, viewGroup, false);
                        viewInflate.setId(1);
                        ((TextView) viewInflate.findViewById(a.f.title)).setText(ActivityChooserView.this.getContext().getString(a.i.abc_activity_chooser_view_see_all));
                        return viewInflate;
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        public int a() {
            int i = this.c;
            this.c = Integer.MAX_VALUE;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int iMax = 0;
            for (int i2 = 0; i2 < count; i2++) {
                view = getView(i2, view, null);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(iMax, view.getMeasuredWidth());
            }
            this.c = i;
            return iMax;
        }

        public void a(int i) {
            if (this.c != i) {
                this.c = i;
                notifyDataSetChanged();
            }
        }

        public ResolveInfo b() {
            return this.b.b();
        }

        public void a(boolean z) {
            if (this.f != z) {
                this.f = z;
                notifyDataSetChanged();
            }
        }

        public int c() {
            return this.b.a();
        }

        public int d() {
            return this.b.c();
        }

        public d e() {
            return this.b;
        }

        public void a(boolean z, boolean z2) {
            if (this.d != z || this.e != z2) {
                this.d = z;
                this.e = z2;
                notifyDataSetChanged();
            }
        }

        public boolean f() {
            return this.d;
        }
    }

    public static class InnerLayout extends LinearLayoutCompat {
        private static final int[] a = {R.attr.background};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            aa aaVarA = aa.a(context, attributeSet, a);
            setBackgroundDrawable(aaVarA.a(0));
            aaVarA.a();
        }
    }
}
