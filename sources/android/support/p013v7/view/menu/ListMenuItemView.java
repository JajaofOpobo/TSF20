package android.support.p013v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.InterfaceC0645m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
/* renamed from: android.support.v7.view.menu.ListMenuItemView */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0645m.InterfaceC0646a {

    /* renamed from: a */
    private C0632h f1466a;

    /* renamed from: b */
    private ImageView f1467b;

    /* renamed from: c */
    private RadioButton f1468c;

    /* renamed from: d */
    private TextView f1469d;

    /* renamed from: e */
    private CheckBox f1470e;

    /* renamed from: f */
    private TextView f1471f;

    /* renamed from: g */
    private Drawable f1472g;

    /* renamed from: h */
    private int f1473h;

    /* renamed from: i */
    private Context f1474i;

    /* renamed from: j */
    private boolean f1475j;

    /* renamed from: k */
    private int f1476k;

    /* renamed from: l */
    private Context f1477l;

    /* renamed from: m */
    private LayoutInflater f1478m;

    /* renamed from: n */
    private boolean f1479n;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.f1477l = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0535a.C0546k.MenuView, i, 0);
        this.f1472g = obtainStyledAttributes.getDrawable(C0535a.C0546k.MenuView_android_itemBackground);
        this.f1473h = obtainStyledAttributes.getResourceId(C0535a.C0546k.MenuView_android_itemTextAppearance, -1);
        this.f1475j = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuView_preserveIconSpacing, false);
        this.f1474i = context;
        obtainStyledAttributes.recycle();
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.f1472g);
        this.f1469d = (TextView) findViewById(C0535a.C0541f.title);
        if (this.f1473h != -1) {
            this.f1469d.setTextAppearance(this.f1474i, this.f1473h);
        }
        this.f1471f = (TextView) findViewById(C0535a.C0541f.shortcut);
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    /* renamed from: a */
    public void mo11680a(C0632h c0632h, int i) {
        this.f1466a = c0632h;
        this.f1476k = i;
        setVisibility(c0632h.isVisible() ? 0 : 8);
        setTitle(c0632h.m11734a((InterfaceC0645m.InterfaceC0646a) this));
        setCheckable(c0632h.isCheckable());
        m11809a(c0632h.m11720f(), c0632h.m11724d());
        setIcon(c0632h.getIcon());
        setEnabled(c0632h.isEnabled());
    }

    public void setForceShowIcon(boolean z) {
        this.f1479n = z;
        this.f1475j = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1469d.setText(charSequence);
            if (this.f1469d.getVisibility() != 0) {
                this.f1469d.setVisibility(0);
            }
        } else if (this.f1469d.getVisibility() != 8) {
            this.f1469d.setVisibility(8);
        }
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    public C0632h getItemData() {
        return this.f1466a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f1468c != null || this.f1470e != null) {
            if (this.f1466a.m11719g()) {
                if (this.f1468c == null) {
                    m11807c();
                }
                compoundButton = this.f1468c;
                compoundButton2 = this.f1470e;
            } else {
                if (this.f1470e == null) {
                    m11806d();
                }
                compoundButton = this.f1470e;
                compoundButton2 = this.f1468c;
            }
            if (z) {
                compoundButton.setChecked(this.f1466a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (this.f1470e != null) {
                this.f1470e.setVisibility(8);
            }
            if (this.f1468c != null) {
                this.f1468c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1466a.m11719g()) {
            if (this.f1468c == null) {
                m11807c();
            }
            compoundButton = this.f1468c;
        } else {
            if (this.f1470e == null) {
                m11806d();
            }
            compoundButton = this.f1470e;
        }
        compoundButton.setChecked(z);
    }

    /* renamed from: a */
    public void m11809a(boolean z, char c) {
        int i = (z && this.f1466a.m11720f()) ? 0 : 8;
        if (i == 0) {
            this.f1471f.setText(this.f1466a.m11722e());
        }
        if (this.f1471f.getVisibility() != i) {
            this.f1471f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1466a.m11717i() || this.f1479n;
        if (z || this.f1475j) {
            if (this.f1467b != null || drawable != null || this.f1475j) {
                if (this.f1467b == null) {
                    m11808b();
                }
                if (drawable != null || this.f1475j) {
                    ImageView imageView = this.f1467b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.f1467b.getVisibility() != 0) {
                        this.f1467b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.f1467b.setVisibility(8);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1467b != null && this.f1475j) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1467b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m11808b() {
        this.f1467b = (ImageView) getInflater().inflate(C0535a.C0543h.abc_list_menu_item_icon, (ViewGroup) this, false);
        addView(this.f1467b, 0);
    }

    /* renamed from: c */
    private void m11807c() {
        this.f1468c = (RadioButton) getInflater().inflate(C0535a.C0543h.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.f1468c);
    }

    /* renamed from: d */
    private void m11806d() {
        this.f1470e = (CheckBox) getInflater().inflate(C0535a.C0543h.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.f1470e);
    }

    @Override // android.support.p013v7.view.menu.InterfaceC0645m.InterfaceC0646a
    /* renamed from: a */
    public boolean mo11681a() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.f1478m == null) {
            this.f1478m = LayoutInflater.from(this.f1477l);
        }
        return this.f1478m;
    }
}
