package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.view.InterfaceC0303af;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.widget.ListPopupWindow;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
/* renamed from: android.support.v7.widget.AppCompatSpinner */
/* loaded from: classes.dex */
public class AppCompatSpinner extends Spinner implements InterfaceC0303af {

    /* renamed from: a */
    private static final boolean f1777a;

    /* renamed from: b */
    private static final boolean f1778b;

    /* renamed from: c */
    private static final int[] f1779c;

    /* renamed from: d */
    private C0742g f1780d;

    /* renamed from: e */
    private C0740e f1781e;

    /* renamed from: f */
    private Context f1782f;

    /* renamed from: g */
    private ListPopupWindow.AbstractView$OnTouchListenerC0688b f1783g;

    /* renamed from: h */
    private SpinnerAdapter f1784h;

    /* renamed from: i */
    private boolean f1785i;

    /* renamed from: j */
    private C0679b f1786j;

    /* renamed from: k */
    private int f1787k;

    /* renamed from: l */
    private final Rect f1788l;

    static {
        f1777a = Build.VERSION.SDK_INT >= 23;
        f1778b = Build.VERSION.SDK_INT >= 16;
        f1779c = new int[]{16843505};
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.spinnerStyle);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AppCompatSpinner(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12, android.content.res.Resources.Theme r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v7.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        if (this.f1786j != null) {
            return this.f1782f;
        }
        if (f1777a) {
            return super.getPopupContext();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        if (this.f1786j != null) {
            this.f1786j.m11510a(drawable);
        } else if (f1778b) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C0144a.m13403a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        if (this.f1786j != null) {
            return this.f1786j.m11495d();
        }
        if (f1778b) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        if (this.f1786j != null) {
            this.f1786j.m11497c(i);
        } else if (f1778b) {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        if (this.f1786j != null) {
            return this.f1786j.m11488g();
        }
        if (f1778b) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        if (this.f1786j != null) {
            this.f1786j.m11501b(i);
        } else if (f1778b) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        if (this.f1786j != null) {
            return this.f1786j.m11490f();
        }
        if (f1778b) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f1786j != null) {
            this.f1787k = i;
        } else if (f1778b) {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f1786j != null) {
            return this.f1787k;
        }
        if (f1778b) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1785i) {
            this.f1784h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1786j != null) {
            this.f1786j.mo11505a(new C0678a(spinnerAdapter, (this.f1782f == null ? getContext() : this.f1782f).getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f1786j != null && this.f1786j.m11482k()) {
            this.f1786j.m11484i();
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1783g == null || !this.f1783g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1786j != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m11548a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        if (this.f1786j != null) {
            if (!this.f1786j.m11482k()) {
                this.f1786j.mo11498c();
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        if (this.f1786j != null) {
            this.f1786j.m11542a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        return this.f1786j != null ? this.f1786j.m11545a() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f1781e != null) {
            this.f1781e.m11232a(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f1781e != null) {
            this.f1781e.m11229a(drawable);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f1781e != null) {
            this.f1781e.m11231a(colorStateList);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public ColorStateList getSupportBackgroundTintList() {
        if (this.f1781e != null) {
            return this.f1781e.m11233a();
        }
        return null;
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f1781e != null) {
            this.f1781e.m11230a(mode);
        }
    }

    @Override // android.support.p002v4.view.InterfaceC0303af
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (this.f1781e != null) {
            return this.f1781e.m11227b();
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1781e != null) {
            this.f1781e.m11224c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m11548a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        View view;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        int max2 = Math.max(0, max - (15 - (min - max)));
        View view2 = null;
        int i = 0;
        int i2 = 0;
        while (max2 < min) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
            } else {
                itemViewType = i2;
                view = view2;
            }
            view2 = spinnerAdapter.getView(max2, view, this);
            if (view2.getLayoutParams() == null) {
                view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view2.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view2.getMeasuredWidth());
            max2++;
            i2 = itemViewType;
        }
        if (drawable != null) {
            drawable.getPadding(this.f1788l);
            return this.f1788l.left + this.f1788l.right + i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatSpinner$a */
    /* loaded from: classes.dex */
    public static class C0678a implements ListAdapter, SpinnerAdapter {

        /* renamed from: a */
        private SpinnerAdapter f1791a;

        /* renamed from: b */
        private ListAdapter f1792b;

        public C0678a(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1791a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1792b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (AppCompatSpinner.f1777a && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof InterfaceC0771w) {
                    InterfaceC0771w interfaceC0771w = (InterfaceC0771w) spinnerAdapter;
                    if (interfaceC0771w.m11065a() == null) {
                        interfaceC0771w.m11064a(theme);
                    }
                }
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.f1791a == null) {
                return 0;
            }
            return this.f1791a.getCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (this.f1791a == null) {
                return null;
            }
            return this.f1791a.getItem(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (this.f1791a == null) {
                return -1L;
            }
            return this.f1791a.getItemId(i);
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            if (this.f1791a == null) {
                return null;
            }
            return this.f1791a.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            return this.f1791a != null && this.f1791a.hasStableIds();
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1791a != null) {
                this.f1791a.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.f1791a != null) {
                this.f1791a.unregisterDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1792b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1792b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.AppCompatSpinner$b */
    /* loaded from: classes.dex */
    public class C0679b extends ListPopupWindow {

        /* renamed from: c */
        private CharSequence f1794c;

        /* renamed from: d */
        private ListAdapter f1795d;

        /* renamed from: e */
        private final Rect f1796e;

        public C0679b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1796e = new Rect();
            m11508a(AppCompatSpinner.this);
            m11503a(true);
            m11511a(0);
            m11506a(new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.1
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    AppCompatSpinner.this.setSelection(i2);
                    if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                        AppCompatSpinner.this.performItemClick(view, i2, C0679b.this.f1795d.getItemId(i2));
                    }
                    C0679b.this.m11484i();
                }
            });
        }

        @Override // android.support.p013v7.widget.ListPopupWindow
        /* renamed from: a */
        public void mo11505a(ListAdapter listAdapter) {
            super.mo11505a(listAdapter);
            this.f1795d = listAdapter;
        }

        /* renamed from: a */
        public CharSequence m11545a() {
            return this.f1794c;
        }

        /* renamed from: a */
        public void m11542a(CharSequence charSequence) {
            this.f1794c = charSequence;
        }

        /* renamed from: b */
        void m11541b() {
            int i;
            int i2;
            Drawable d = m11495d();
            if (d != null) {
                d.getPadding(AppCompatSpinner.this.f1788l);
                i = C0730ad.m11259a(AppCompatSpinner.this) ? AppCompatSpinner.this.f1788l.right : -AppCompatSpinner.this.f1788l.left;
            } else {
                Rect rect = AppCompatSpinner.this.f1788l;
                AppCompatSpinner.this.f1788l.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            if (AppCompatSpinner.this.f1787k == -2) {
                int m11548a = AppCompatSpinner.this.m11548a((SpinnerAdapter) this.f1795d, m11495d());
                int i3 = (AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels - AppCompatSpinner.this.f1788l.left) - AppCompatSpinner.this.f1788l.right;
                if (m11548a <= i3) {
                    i3 = m11548a;
                }
                m11489f(Math.max(i3, (width - paddingLeft) - paddingRight));
            } else if (AppCompatSpinner.this.f1787k != -1) {
                m11489f(AppCompatSpinner.this.f1787k);
            } else {
                m11489f((width - paddingLeft) - paddingRight);
            }
            if (C0730ad.m11259a(AppCompatSpinner.this)) {
                i2 = ((width - paddingRight) - m11486h()) + i;
            } else {
                i2 = i + paddingLeft;
            }
            m11501b(i2);
        }

        @Override // android.support.p013v7.widget.ListPopupWindow
        /* renamed from: c */
        public void mo11498c() {
            ViewTreeObserver viewTreeObserver;
            boolean k = m11482k();
            m11541b();
            m11487g(2);
            super.mo11498c();
            m11480m().setChoiceMode(1);
            m11485h(AppCompatSpinner.this.getSelectedItemPosition());
            if (!k && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.2
                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                    public void onGlobalLayout() {
                        if (!C0679b.this.m11539b(AppCompatSpinner.this)) {
                            C0679b.this.m11484i();
                            return;
                        }
                        C0679b.this.m11541b();
                        C0679b.super.mo11498c();
                    }
                };
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
                m11504a(new PopupWindow.OnDismissListener() { // from class: android.support.v7.widget.AppCompatSpinner.b.3
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public void onDismiss() {
                        ViewTreeObserver viewTreeObserver2 = AppCompatSpinner.this.getViewTreeObserver();
                        if (viewTreeObserver2 != null) {
                            viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                        }
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public boolean m11539b(View view) {
            return C0309ai.m12882y(view) && view.getGlobalVisibleRect(this.f1796e);
        }
    }
}
