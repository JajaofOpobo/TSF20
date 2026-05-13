package android.support.p013v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p013v7.p015b.p016a.C0603a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
/* renamed from: android.support.v7.widget.ListViewCompat */
/* loaded from: classes.dex */
public class ListViewCompat extends ListView {

    /* renamed from: g */
    private static final int[] f1891g = {0};

    /* renamed from: a */
    final Rect f1892a;

    /* renamed from: b */
    int f1893b;

    /* renamed from: c */
    int f1894c;

    /* renamed from: d */
    int f1895d;

    /* renamed from: e */
    int f1896e;

    /* renamed from: f */
    protected int f1897f;

    /* renamed from: h */
    private Field f1898h;

    /* renamed from: i */
    private C0696a f1899i;

    public ListViewCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListViewCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1892a = new Rect();
        this.f1893b = 0;
        this.f1894c = 0;
        this.f1895d = 0;
        this.f1896e = 0;
        try {
            this.f1898h = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1898h.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.f1899i = drawable != null ? new C0696a(drawable) : null;
        super.setSelector(this.f1899i);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1893b = rect.left;
        this.f1894c = rect.top;
        this.f1895d = rect.right;
        this.f1896e = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setSelectorEnabled(true);
        m11457b();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        m11458a(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f1897f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: b */
    protected void m11457b() {
        Drawable selector = getSelector();
        if (selector != null && m11455c()) {
            selector.setState(getDrawableState());
        }
    }

    /* renamed from: c */
    protected boolean m11455c() {
        return mo11462a() && isPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11462a() {
        return false;
    }

    /* renamed from: a */
    protected void m11458a(Canvas canvas) {
        Drawable selector;
        if (!this.f1892a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1892a);
            selector.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m11459a(int i, View view, float f, float f2) {
        m11460a(i, view);
        Drawable selector = getSelector();
        if (selector != null && i != -1) {
            C0021a.m13863a(selector, f, f2);
        }
    }

    /* renamed from: a */
    protected void m11460a(int i, View view) {
        Drawable selector = getSelector();
        boolean z = (selector == null || i == -1) ? false : true;
        if (z) {
            selector.setVisible(false, false);
        }
        m11456b(i, view);
        if (z) {
            Rect rect = this.f1892a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            C0021a.m13863a(selector, exactCenterX, exactCenterY);
        }
    }

    /* renamed from: b */
    protected void m11456b(int i, View view) {
        Rect rect = this.f1892a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f1893b;
        rect.top -= this.f1894c;
        rect.right += this.f1895d;
        rect.bottom += this.f1896e;
        try {
            boolean z = this.f1898h.getBoolean(this);
            if (view.isEnabled() != z) {
                this.f1898h.set(this, Boolean.valueOf(!z));
                if (i != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public int m11461a(int i, int i2, int i3, int i4, int i5) {
        View view;
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i6 = listPaddingBottom + listPaddingTop;
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int i7 = 0;
        View view2 = null;
        int i8 = 0;
        int count = adapter.getCount();
        int i9 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i, makeMeasureSpec);
            view2.forceLayout();
            int measuredHeight = (i9 > 0 ? i6 + dividerHeight : i6) + view2.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return (i5 < 0 || i9 <= i5 || i7 <= 0 || measuredHeight == i4) ? i4 : i7;
            }
            if (i5 >= 0 && i9 >= i5) {
                i7 = measuredHeight;
            }
            i9++;
            i6 = measuredHeight;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        if (this.f1899i != null) {
            this.f1899i.m11454a(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.ListViewCompat$a */
    /* loaded from: classes.dex */
    public static class C0696a extends C0603a {

        /* renamed from: a */
        private boolean f1900a;

        public C0696a(Drawable drawable) {
            super(drawable);
            this.f1900a = true;
        }

        /* renamed from: a */
        void m11454a(boolean z) {
            this.f1900a = z;
        }

        @Override // android.support.p013v7.p015b.p016a.C0603a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f1900a) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // android.support.p013v7.p015b.p016a.C0603a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f1900a) {
                super.draw(canvas);
            }
        }

        @Override // android.support.p013v7.p015b.p016a.C0603a, android.graphics.drawable.Drawable
        public void setHotspot(float f, float f2) {
            if (this.f1900a) {
                super.setHotspot(f, f2);
            }
        }

        @Override // android.support.p013v7.p015b.p016a.C0603a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1900a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // android.support.p013v7.p015b.p016a.C0603a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z, boolean z2) {
            if (this.f1900a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }
}
