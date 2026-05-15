package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class t extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator j = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private b d;
    private LinearLayoutCompat e;
    private Spinner f;
    private boolean g;
    private int h;
    private int i;

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.e.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.b = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.b = View.MeasureSpec.getSize(i) / 2;
            }
            this.b = Math.min(this.b, this.c);
        } else {
            this.b = -1;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
        if (!z && this.g) {
            this.e.measure(0, iMakeMeasureSpec);
            if (this.e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                b();
            } else {
                c();
            }
        } else {
            c();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z && measuredWidth != measuredWidth2) {
            setTabSelected(this.i);
        }
    }

    private boolean a() {
        return this.f != null && this.f.getParent() == this;
    }

    public void setAllowCollapse(boolean z) {
        this.g = z;
    }

    private void b() {
        if (!a()) {
            if (this.f == null) {
                this.f = d();
            }
            removeView(this.e);
            addView(this.f, new ViewGroup.LayoutParams(-2, -1));
            if (this.f.getAdapter() == null) {
                this.f.setAdapter((SpinnerAdapter) new a());
            }
            if (this.a != null) {
                removeCallbacks(this.a);
                this.a = null;
            }
            this.f.setSelection(this.i);
        }
    }

    private boolean c() {
        if (a()) {
            removeView(this.f);
            addView(this.e, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f.getSelectedItemPosition());
        }
        return false;
    }

    public void setTabSelected(int i) {
        this.i = i;
        int childCount = this.e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        if (this.f != null && i >= 0) {
            this.f.setSelection(i);
        }
    }

    public void setContentHeight(int i) {
        this.h = i;
        requestLayout();
    }

    private Spinner d() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, a.C0012a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        android.support.v7.view.a aVarA = android.support.v7.view.a.a(getContext());
        setContentHeight(aVarA.e());
        this.c = aVarA.g();
    }

    public void a(int i) {
        final View childAt = this.e.getChildAt(i);
        if (this.a != null) {
            removeCallbacks(this.a);
        }
        this.a = new Runnable() { // from class: android.support.v7.widget.t.1
            @Override // java.lang.Runnable
            public void run() {
                t.this.smoothScrollTo(childAt.getLeft() - ((t.this.getWidth() - childAt.getWidth()) / 2), 0);
                t.this.a = null;
            }
        };
        post(this.a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c a(ActionBar.b bVar, boolean z) {
        c cVar = new c(getContext(), bVar, z);
        if (z) {
            cVar.setBackgroundDrawable(null);
            cVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.h));
        } else {
            cVar.setFocusable(true);
            if (this.d == null) {
                this.d = new b();
            }
            cVar.setOnClickListener(this.d);
        }
        return cVar;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j2) {
        ((c) view).b().d();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    private class c extends LinearLayoutCompat implements View.OnLongClickListener {
        private final int[] b;
        private ActionBar.b c;
        private TextView d;
        private ImageView e;
        private View f;

        public c(Context context, ActionBar.b bVar, boolean z) {
            super(context, null, a.C0012a.actionBarTabStyle);
            this.b = new int[]{R.attr.background};
            this.c = bVar;
            aa aaVarA = aa.a(context, null, this.b, a.C0012a.actionBarTabStyle, 0);
            if (aaVarA.f(0)) {
                setBackgroundDrawable(aaVarA.a(0));
            }
            aaVarA.a();
            if (z) {
                setGravity(8388627);
            }
            a();
        }

        public void a(ActionBar.b bVar) {
            this.c = bVar;
            a();
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(ActionBar.b.class.getName());
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(ActionBar.b.class.getName());
            }
        }

        @Override // android.support.v7.widget.LinearLayoutCompat, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (t.this.b > 0 && getMeasuredWidth() > t.this.b) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(t.this.b, 1073741824), i2);
            }
        }

        public void a() {
            ActionBar.b bVar = this.c;
            View viewC = bVar.c();
            if (viewC != null) {
                ViewParent parent = viewC.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewC);
                    }
                    addView(viewC);
                }
                this.f = viewC;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable(null);
                    return;
                }
                return;
            }
            if (this.f != null) {
                removeView(this.f);
                this.f = null;
            }
            Drawable drawableA = bVar.a();
            CharSequence charSequenceB = bVar.b();
            if (drawableA != null) {
                if (this.e == null) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams.h = 16;
                    imageView.setLayoutParams(layoutParams);
                    addView(imageView, 0);
                    this.e = imageView;
                }
                this.e.setImageDrawable(drawableA);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            boolean z = !TextUtils.isEmpty(charSequenceB);
            if (z) {
                if (this.d == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, a.C0012a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(-2, -2);
                    layoutParams2.h = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.d = appCompatTextView;
                }
                this.d.setText(charSequenceB);
                this.d.setVisibility(0);
            } else if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setText((CharSequence) null);
            }
            if (this.e != null) {
                this.e.setContentDescription(bVar.e());
            }
            if (!z && !TextUtils.isEmpty(bVar.e())) {
                setOnLongClickListener(this);
            } else {
                setOnLongClickListener(null);
                setLongClickable(false);
            }
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast toastMakeText = Toast.makeText(context, this.c.e(), 0);
            toastMakeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            toastMakeText.show();
            return true;
        }

        public ActionBar.b b() {
            return this.c;
        }
    }

    private class a extends BaseAdapter {
        private a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return t.this.e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((c) t.this.e.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return t.this.a((ActionBar.b) getItem(i), true);
            }
            ((c) view).a((ActionBar.b) getItem(i));
            return view;
        }
    }

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((c) view).b().d();
            int childCount = t.this.e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = t.this.e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }
}
