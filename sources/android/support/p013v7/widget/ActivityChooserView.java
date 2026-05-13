package android.support.p013v7.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.widget.ListPopupWindow;
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
/* renamed from: android.support.v7.widget.ActivityChooserView */
/* loaded from: classes.dex */
public class ActivityChooserView extends ViewGroup {

    /* renamed from: a */
    AbstractC0388d f1713a;

    /* renamed from: b */
    private final C0674a f1714b;

    /* renamed from: c */
    private final View$OnClickListenerC0675b f1715c;

    /* renamed from: d */
    private final LinearLayoutCompat f1716d;

    /* renamed from: e */
    private final Drawable f1717e;

    /* renamed from: f */
    private final FrameLayout f1718f;

    /* renamed from: g */
    private final ImageView f1719g;

    /* renamed from: h */
    private final FrameLayout f1720h;

    /* renamed from: i */
    private final ImageView f1721i;

    /* renamed from: j */
    private final int f1722j;

    /* renamed from: k */
    private final DataSetObserver f1723k;

    /* renamed from: l */
    private final ViewTreeObserver.OnGlobalLayoutListener f1724l;

    /* renamed from: m */
    private ListPopupWindow f1725m;

    /* renamed from: n */
    private PopupWindow.OnDismissListener f1726n;

    /* renamed from: o */
    private boolean f1727o;

    /* renamed from: p */
    private int f1728p;

    /* renamed from: q */
    private boolean f1729q;

    /* renamed from: r */
    private int f1730r;

    public ActivityChooserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1723k = new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.1
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.f1714b.notifyDataSetChanged();
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                super.onInvalidated();
                ActivityChooserView.this.f1714b.notifyDataSetInvalidated();
            }
        };
        this.f1724l = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.ActivityChooserView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (ActivityChooserView.this.m11573c()) {
                    if (!ActivityChooserView.this.isShown()) {
                        ActivityChooserView.this.getListPopupWindow().m11484i();
                        return;
                    }
                    ActivityChooserView.this.getListPopupWindow().mo11498c();
                    if (ActivityChooserView.this.f1713a != null) {
                        ActivityChooserView.this.f1713a.m12650a(true);
                    }
                }
            }
        };
        this.f1728p = 4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ActivityChooserView, i, 0);
        this.f1728p = obtainStyledAttributes.getInt(C0535a.C0546k.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(C0535a.C0546k.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(C0535a.C0543h.abc_activity_chooser_view, (ViewGroup) this, true);
        this.f1715c = new View$OnClickListenerC0675b();
        this.f1716d = (LinearLayoutCompat) findViewById(C0535a.C0541f.activity_chooser_view_content);
        this.f1717e = this.f1716d.getBackground();
        this.f1720h = (FrameLayout) findViewById(C0535a.C0541f.default_activity_button);
        this.f1720h.setOnClickListener(this.f1715c);
        this.f1720h.setOnLongClickListener(this.f1715c);
        this.f1721i = (ImageView) this.f1720h.findViewById(C0535a.C0541f.image);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0535a.C0541f.expand_activities_button);
        frameLayout.setOnClickListener(this.f1715c);
        frameLayout.setOnTouchListener(new ListPopupWindow.AbstractView$OnTouchListenerC0688b(frameLayout) { // from class: android.support.v7.widget.ActivityChooserView.3
            @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
            /* renamed from: a */
            public ListPopupWindow mo11474a() {
                return ActivityChooserView.this.getListPopupWindow();
            }

            @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
            /* renamed from: b */
            protected boolean mo11469b() {
                ActivityChooserView.this.m11580a();
                return true;
            }

            @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
            /* renamed from: c */
            protected boolean mo11465c() {
                ActivityChooserView.this.m11575b();
                return true;
            }
        });
        this.f1718f = frameLayout;
        this.f1719g = (ImageView) frameLayout.findViewById(C0535a.C0541f.image);
        this.f1719g.setImageDrawable(drawable);
        this.f1714b = new C0674a();
        this.f1714b.registerDataSetObserver(new DataSetObserver() { // from class: android.support.v7.widget.ActivityChooserView.4
            @Override // android.database.DataSetObserver
            public void onChanged() {
                super.onChanged();
                ActivityChooserView.this.m11571d();
            }
        });
        Resources resources = context.getResources();
        this.f1722j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C0535a.C0539d.abc_config_prefDialogWidth));
    }

    public void setActivityChooserModel(C0733d c0733d) {
        this.f1714b.m11562a(c0733d);
        if (m11573c()) {
            m11575b();
            m11580a();
        }
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.f1719g.setImageDrawable(drawable);
    }

    public void setExpandActivityOverflowButtonContentDescription(int i) {
        this.f1719g.setContentDescription(getContext().getString(i));
    }

    public void setProvider(AbstractC0388d abstractC0388d) {
        this.f1713a = abstractC0388d;
    }

    /* renamed from: a */
    public boolean m11580a() {
        if (m11573c() || !this.f1729q) {
            return false;
        }
        this.f1727o = false;
        m11579a(this.f1728p);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11579a(int i) {
        if (this.f1714b.m11556e() == null) {
            throw new IllegalStateException("No data model. Did you call #setDataModel?");
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f1724l);
        boolean z = this.f1720h.getVisibility() == 0;
        int m11558c = this.f1714b.m11558c();
        int i2 = z ? 1 : 0;
        if (i != Integer.MAX_VALUE && m11558c > i2 + i) {
            this.f1714b.m11561a(true);
            this.f1714b.m11563a(i - 1);
        } else {
            this.f1714b.m11561a(false);
            this.f1714b.m11563a(i);
        }
        ListPopupWindow listPopupWindow = getListPopupWindow();
        if (!listPopupWindow.m11482k()) {
            if (this.f1727o || !z) {
                this.f1714b.m11560a(true, z);
            } else {
                this.f1714b.m11560a(false, false);
            }
            listPopupWindow.m11489f(Math.min(this.f1714b.m11564a(), this.f1722j));
            listPopupWindow.mo11498c();
            if (this.f1713a != null) {
                this.f1713a.m12650a(true);
            }
            listPopupWindow.m11480m().setContentDescription(getContext().getString(C0535a.C0544i.abc_activitychooserview_choose_application));
        }
    }

    /* renamed from: b */
    public boolean m11575b() {
        if (m11573c()) {
            getListPopupWindow().m11484i();
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this.f1724l);
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m11573c() {
        return getListPopupWindow().m11482k();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0733d m11556e = this.f1714b.m11556e();
        if (m11556e != null) {
            m11556e.registerObserver(this.f1723k);
        }
        this.f1729q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0733d m11556e = this.f1714b.m11556e();
        if (m11556e != null) {
            m11556e.unregisterObserver(this.f1723k);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1724l);
        }
        if (m11573c()) {
            m11575b();
        }
        this.f1729q = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat = this.f1716d;
        if (this.f1720h.getVisibility() != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824);
        }
        measureChild(linearLayoutCompat, i, i2);
        setMeasuredDimension(linearLayoutCompat.getMeasuredWidth(), linearLayoutCompat.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f1716d.layout(0, 0, i3 - i, i4 - i2);
        if (!m11573c()) {
            m11575b();
        }
    }

    public C0733d getDataModel() {
        return this.f1714b.m11556e();
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1726n = onDismissListener;
    }

    public void setInitialActivityCount(int i) {
        this.f1728p = i;
    }

    public void setDefaultActionButtonContentDescription(int i) {
        this.f1730r = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ListPopupWindow getListPopupWindow() {
        if (this.f1725m == null) {
            this.f1725m = new ListPopupWindow(getContext());
            this.f1725m.mo11505a(this.f1714b);
            this.f1725m.m11508a(this);
            this.f1725m.m11503a(true);
            this.f1725m.m11506a((AdapterView.OnItemClickListener) this.f1715c);
            this.f1725m.m11504a((PopupWindow.OnDismissListener) this.f1715c);
        }
        return this.f1725m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m11571d() {
        if (this.f1714b.getCount() > 0) {
            this.f1718f.setEnabled(true);
        } else {
            this.f1718f.setEnabled(false);
        }
        int m11558c = this.f1714b.m11558c();
        int m11557d = this.f1714b.m11557d();
        if (m11558c == 1 || (m11558c > 1 && m11557d > 0)) {
            this.f1720h.setVisibility(0);
            ResolveInfo m11559b = this.f1714b.m11559b();
            PackageManager packageManager = getContext().getPackageManager();
            this.f1721i.setImageDrawable(m11559b.loadIcon(packageManager));
            if (this.f1730r != 0) {
                this.f1720h.setContentDescription(getContext().getString(this.f1730r, m11559b.loadLabel(packageManager)));
            }
        } else {
            this.f1720h.setVisibility(8);
        }
        if (this.f1720h.getVisibility() == 0) {
            this.f1716d.setBackgroundDrawable(this.f1717e);
        } else {
            this.f1716d.setBackgroundDrawable(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActivityChooserView$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC0675b implements View.OnClickListener, View.OnLongClickListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
        private View$OnClickListenerC0675b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            switch (((C0674a) adapterView.getAdapter()).getItemViewType(i)) {
                case 0:
                    ActivityChooserView.this.m11575b();
                    if (!ActivityChooserView.this.f1727o) {
                        if (!ActivityChooserView.this.f1714b.m11555f()) {
                            i++;
                        }
                        Intent m11249b = ActivityChooserView.this.f1714b.m11556e().m11249b(i);
                        if (m11249b != null) {
                            m11249b.addFlags(524288);
                            ActivityChooserView.this.getContext().startActivity(m11249b);
                            return;
                        }
                        return;
                    } else if (i > 0) {
                        ActivityChooserView.this.f1714b.m11556e().m11246c(i);
                        return;
                    } else {
                        return;
                    }
                case 1:
                    ActivityChooserView.this.m11579a(Integer.MAX_VALUE);
                    return;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (view != ActivityChooserView.this.f1720h) {
                if (view == ActivityChooserView.this.f1718f) {
                    ActivityChooserView.this.f1727o = false;
                    ActivityChooserView.this.m11579a(ActivityChooserView.this.f1728p);
                    return;
                }
                throw new IllegalArgumentException();
            }
            ActivityChooserView.this.m11575b();
            Intent m11249b = ActivityChooserView.this.f1714b.m11556e().m11249b(ActivityChooserView.this.f1714b.m11556e().m11254a(ActivityChooserView.this.f1714b.m11559b()));
            if (m11249b != null) {
                m11249b.addFlags(524288);
                ActivityChooserView.this.getContext().startActivity(m11249b);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (view == ActivityChooserView.this.f1720h) {
                if (ActivityChooserView.this.f1714b.getCount() > 0) {
                    ActivityChooserView.this.f1727o = true;
                    ActivityChooserView.this.m11579a(ActivityChooserView.this.f1728p);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            m11554a();
            if (ActivityChooserView.this.f1713a != null) {
                ActivityChooserView.this.f1713a.m12650a(false);
            }
        }

        /* renamed from: a */
        private void m11554a() {
            if (ActivityChooserView.this.f1726n != null) {
                ActivityChooserView.this.f1726n.onDismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ActivityChooserView$a */
    /* loaded from: classes.dex */
    public class C0674a extends BaseAdapter {

        /* renamed from: b */
        private C0733d f1737b;

        /* renamed from: c */
        private int f1738c;

        /* renamed from: d */
        private boolean f1739d;

        /* renamed from: e */
        private boolean f1740e;

        /* renamed from: f */
        private boolean f1741f;

        private C0674a() {
            this.f1738c = 4;
        }

        /* renamed from: a */
        public void m11562a(C0733d c0733d) {
            C0733d m11556e = ActivityChooserView.this.f1714b.m11556e();
            if (m11556e != null && ActivityChooserView.this.isShown()) {
                m11556e.unregisterObserver(ActivityChooserView.this.f1723k);
            }
            this.f1737b = c0733d;
            if (c0733d != null && ActivityChooserView.this.isShown()) {
                c0733d.registerObserver(ActivityChooserView.this.f1723k);
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return (this.f1741f && i == getCount() + (-1)) ? 1 : 0;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 3;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int m11256a = this.f1737b.m11256a();
            if (!this.f1739d && this.f1737b.m11250b() != null) {
                m11256a--;
            }
            int min = Math.min(m11256a, this.f1738c);
            if (this.f1741f) {
                return min + 1;
            }
            return min;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            switch (getItemViewType(i)) {
                case 0:
                    if (!this.f1739d && this.f1737b.m11250b() != null) {
                        i++;
                    }
                    return this.f1737b.m11255a(i);
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
                    if (view == null || view.getId() != C0535a.C0541f.list_item) {
                        view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0535a.C0543h.abc_activity_chooser_view_list_item, viewGroup, false);
                    }
                    PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                    ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                    ((ImageView) view.findViewById(C0535a.C0541f.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                    ((TextView) view.findViewById(C0535a.C0541f.title)).setText(resolveInfo.loadLabel(packageManager));
                    if (this.f1739d && i == 0 && this.f1740e) {
                        C0309ai.m12911b(view, true);
                        return view;
                    }
                    C0309ai.m12911b(view, false);
                    return view;
                case 1:
                    if (view == null || view.getId() != 1) {
                        View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(C0535a.C0543h.abc_activity_chooser_view_list_item, viewGroup, false);
                        inflate.setId(1);
                        ((TextView) inflate.findViewById(C0535a.C0541f.title)).setText(ActivityChooserView.this.getContext().getString(C0535a.C0544i.abc_activity_chooser_view_see_all));
                        return inflate;
                    }
                    return view;
                default:
                    throw new IllegalArgumentException();
            }
        }

        /* renamed from: a */
        public int m11564a() {
            int i = this.f1738c;
            this.f1738c = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            View view = null;
            int i2 = 0;
            for (int i3 = 0; i3 < count; i3++) {
                view = getView(i3, view, null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i2 = Math.max(i2, view.getMeasuredWidth());
            }
            this.f1738c = i;
            return i2;
        }

        /* renamed from: a */
        public void m11563a(int i) {
            if (this.f1738c != i) {
                this.f1738c = i;
                notifyDataSetChanged();
            }
        }

        /* renamed from: b */
        public ResolveInfo m11559b() {
            return this.f1737b.m11250b();
        }

        /* renamed from: a */
        public void m11561a(boolean z) {
            if (this.f1741f != z) {
                this.f1741f = z;
                notifyDataSetChanged();
            }
        }

        /* renamed from: c */
        public int m11558c() {
            return this.f1737b.m11256a();
        }

        /* renamed from: d */
        public int m11557d() {
            return this.f1737b.m11247c();
        }

        /* renamed from: e */
        public C0733d m11556e() {
            return this.f1737b;
        }

        /* renamed from: a */
        public void m11560a(boolean z, boolean z2) {
            if (this.f1739d != z || this.f1740e != z2) {
                this.f1739d = z;
                this.f1740e = z2;
                notifyDataSetChanged();
            }
        }

        /* renamed from: f */
        public boolean m11555f() {
            return this.f1739d;
        }
    }

    /* renamed from: android.support.v7.widget.ActivityChooserView$InnerLayout */
    /* loaded from: classes.dex */
    public static class InnerLayout extends LinearLayoutCompat {

        /* renamed from: a */
        private static final int[] f1735a = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C0725aa m11296a = C0725aa.m11296a(context, attributeSet, f1735a);
            setBackgroundDrawable(m11296a.m11300a(0));
            m11296a.m11301a();
        }
    }
}
