package android.support.p013v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.p002v4.view.C0309ai;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.C0628f;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.support.p013v7.widget.ActionMenuView;
import android.support.p013v7.widget.AppCompatTextView;
import android.support.p013v7.widget.ListPopupWindow;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;
/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements InterfaceC0645m.InterfaceC0646a, ActionMenuView.InterfaceC0666a, View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a */
    private C0632h f1451a;

    /* renamed from: b */
    private CharSequence f1452b;

    /* renamed from: c */
    private Drawable f1453c;

    /* renamed from: d */
    private C0628f.InterfaceC0630b f1454d;

    /* renamed from: e */
    private ListPopupWindow.AbstractView$OnTouchListenerC0688b f1455e;

    /* renamed from: f */
    private AbstractC0621b f1456f;

    /* renamed from: g */
    private boolean f1457g;

    /* renamed from: h */
    private boolean f1458h;

    /* renamed from: i */
    private int f1459i;

    /* renamed from: j */
    private int f1460j;

    /* renamed from: k */
    private int f1461k;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0621b {
        /* renamed from: a */
        public abstract ListPopupWindow mo11602a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f1457g = resources.getBoolean(C0535a.C0537b.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.ActionMenuItemView, i, 0);
        this.f1459i = obtainStyledAttributes.getDimensionPixelSize(C0535a.C0546k.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f1461k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        this.f1460j = -1;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.f1457g = getContext().getResources().getBoolean(C0535a.C0537b.abc_config_allowActionMenuItemTextWithIcon);
        m11810e();
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.f1460j = i;
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    public C0632h getItemData() {
        return this.f1451a;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    /* renamed from: a */
    public void mo11680a(C0632h c0632h, int i) {
        this.f1451a = c0632h;
        setIcon(c0632h.getIcon());
        setTitle(c0632h.m11734a((InterfaceC0645m.InterfaceC0646a) this));
        setId(c0632h.getItemId());
        setVisibility(c0632h.isVisible() ? 0 : 8);
        setEnabled(c0632h.isEnabled());
        if (c0632h.hasSubMenu() && this.f1455e == null) {
            this.f1455e = new C0620a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f1451a.hasSubMenu() && this.f1455e != null && this.f1455e.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f1454d != null) {
            this.f1454d.mo11598a(this.f1451a);
        }
    }

    public void setItemInvoker(C0628f.InterfaceC0630b interfaceC0630b) {
        this.f1454d = interfaceC0630b;
    }

    public void setPopupCallback(AbstractC0621b abstractC0621b) {
        this.f1456f = abstractC0621b;
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    /* renamed from: a */
    public boolean mo11681a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f1458h != z) {
            this.f1458h = z;
            if (this.f1451a != null) {
                this.f1451a.m11718h();
            }
        }
    }

    /* renamed from: e */
    private void m11810e() {
        boolean z = false;
        boolean z2 = !TextUtils.isEmpty(this.f1452b);
        if (this.f1453c == null || (this.f1451a.m11713m() && (this.f1457g || this.f1458h))) {
            z = true;
        }
        setText(z2 & z ? this.f1452b : null);
    }

    public void setIcon(Drawable drawable) {
        this.f1453c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f1461k) {
                float f = this.f1461k / intrinsicWidth;
                intrinsicWidth = this.f1461k;
                intrinsicHeight = (int) (intrinsicHeight * f);
            }
            if (intrinsicHeight > this.f1461k) {
                float f2 = this.f1461k / intrinsicHeight;
                intrinsicHeight = this.f1461k;
                intrinsicWidth = (int) (intrinsicWidth * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m11810e();
    }

    /* renamed from: b */
    public boolean m11813b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.f1452b = charSequence;
        setContentDescription(this.f1452b);
        m11810e();
    }

    @Override // android.support.p013v7.widget.ActionMenuView.InterfaceC0666a
    /* renamed from: c */
    public boolean mo11582c() {
        return m11813b() && this.f1451a.getIcon() == null;
    }

    @Override // android.support.p013v7.widget.ActionMenuView.InterfaceC0666a
    /* renamed from: d */
    public boolean mo11581d() {
        return m11813b();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        if (m11813b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i = iArr[1] + (height / 2);
        int i2 = (width / 2) + iArr[0];
        if (C0309ai.m12904e(view) == 0) {
            i2 = context.getResources().getDisplayMetrics().widthPixels - i2;
        }
        Toast makeText = Toast.makeText(context, this.f1451a.getTitle(), 0);
        if (i < rect.height()) {
            makeText.setGravity(8388661, i2, (iArr[1] + height) - rect.top);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean m11813b = m11813b();
        if (m11813b && this.f1460j >= 0) {
            super.setPadding(this.f1460j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f1459i) : this.f1459i;
        if (mode != 1073741824 && this.f1459i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!m11813b && this.f1453c != null) {
            super.setPadding((getMeasuredWidth() - this.f1453c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    /* loaded from: classes.dex */
    private class C0620a extends ListPopupWindow.AbstractView$OnTouchListenerC0688b {
        public C0620a() {
            super(ActionMenuItemView.this);
        }

        @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
        /* renamed from: a */
        public ListPopupWindow mo11474a() {
            if (ActionMenuItemView.this.f1456f != null) {
                return ActionMenuItemView.this.f1456f.mo11602a();
            }
            return null;
        }

        @Override // android.support.p013v7.widget.ListPopupWindow.AbstractView$OnTouchListenerC0688b
        /* renamed from: b */
        protected boolean mo11469b() {
            ListPopupWindow mo11474a;
            return ActionMenuItemView.this.f1454d != null && ActionMenuItemView.this.f1454d.mo11598a(ActionMenuItemView.this.f1451a) && (mo11474a = mo11474a()) != null && mo11474a.m11482k();
        }
    }
}
