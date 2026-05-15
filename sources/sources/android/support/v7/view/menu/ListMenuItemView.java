package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.support.v7.view.menu.m;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ListMenuItemView extends LinearLayout implements m.a {
    private h a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private Drawable g;
    private int h;
    private Context i;
    private boolean j;
    private int k;
    private Context l;
    private LayoutInflater m;
    private boolean n;

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        this.l = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.MenuView, i, 0);
        this.g = typedArrayObtainStyledAttributes.getDrawable(a.k.MenuView_android_itemBackground);
        this.h = typedArrayObtainStyledAttributes.getResourceId(a.k.MenuView_android_itemTextAppearance, -1);
        this.j = typedArrayObtainStyledAttributes.getBoolean(a.k.MenuView_preserveIconSpacing, false);
        this.i = context;
        typedArrayObtainStyledAttributes.recycle();
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundDrawable(this.g);
        this.d = (TextView) findViewById(a.f.title);
        if (this.h != -1) {
            this.d.setTextAppearance(this.i, this.h);
        }
        this.f = (TextView) findViewById(a.f.shortcut);
    }

    @Override // android.support.v7.view.menu.m.a
    public void a(h hVar, int i) {
        this.a = hVar;
        this.k = i;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.a((m.a) this));
        setCheckable(hVar.isCheckable());
        a(hVar.f(), hVar.d());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
    }

    public void setForceShowIcon(boolean z) {
        this.n = z;
        this.j = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }

    @Override // android.support.v7.view.menu.m.a
    public h getItemData() {
        return this.a;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.c != null || this.e != null) {
            if (this.a.g()) {
                if (this.c == null) {
                    c();
                }
                compoundButton = this.c;
                compoundButton2 = this.e;
            } else {
                if (this.e == null) {
                    d();
                }
                compoundButton = this.e;
                compoundButton2 = this.c;
            }
            if (z) {
                compoundButton.setChecked(this.a.isChecked());
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
            if (this.e != null) {
                this.e.setVisibility(8);
            }
            if (this.c != null) {
                this.c.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.a.g()) {
            if (this.c == null) {
                c();
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                d();
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void a(boolean z, char c) {
        int i = (z && this.a.f()) ? 0 : 8;
        if (i == 0) {
            this.f.setText(this.a.e());
        }
        if (this.f.getVisibility() != i) {
            this.f.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.a.i() || this.n;
        if (z || this.j) {
            if (this.b != null || drawable != null || this.j) {
                if (this.b == null) {
                    b();
                }
                if (drawable != null || this.j) {
                    ImageView imageView = this.b;
                    if (!z) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.b.getVisibility() != 0) {
                        this.b.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.b.setVisibility(8);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.b != null && this.j) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    private void b() {
        this.b = (ImageView) getInflater().inflate(a.h.abc_list_menu_item_icon, (ViewGroup) this, false);
        addView(this.b, 0);
    }

    private void c() {
        this.c = (RadioButton) getInflater().inflate(a.h.abc_list_menu_item_radio, (ViewGroup) this, false);
        addView(this.c);
    }

    private void d() {
        this.e = (CheckBox) getInflater().inflate(a.h.abc_list_menu_item_checkbox, (ViewGroup) this, false);
        addView(this.e);
    }

    @Override // android.support.v7.view.menu.m.a
    public boolean a() {
        return false;
    }

    private LayoutInflater getInflater() {
        if (this.m == null) {
            this.m = LayoutInflater.from(this.l);
        }
        return this.m;
    }
}
