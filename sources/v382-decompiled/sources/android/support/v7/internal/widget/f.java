package android.support.v7.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class f {
    static final boolean a;
    static final PorterDuff.Mode b;
    private static final String c;
    private static final g d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private final Context j;
    private final Resources k;
    private ColorStateList n;
    private final SparseArray m = new SparseArray();
    private final TypedValue l = new TypedValue();

    static {
        a = Build.VERSION.SDK_INT < 21;
        c = f.class.getSimpleName();
        b = PorterDuff.Mode.SRC_IN;
        d = new g(6);
        e = new int[]{android.support.v7.a.e.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.a.e.abc_ic_go_search_api_mtrl_alpha, android.support.v7.a.e.abc_ic_search_api_mtrl_alpha, android.support.v7.a.e.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.a.e.abc_ic_clear_mtrl_alpha, android.support.v7.a.e.abc_ic_menu_share_mtrl_alpha, android.support.v7.a.e.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.a.e.abc_ic_menu_cut_mtrl_alpha, android.support.v7.a.e.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.a.e.abc_ic_menu_paste_mtrl_am_alpha, android.support.v7.a.e.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.a.e.abc_ic_voice_search_api_mtrl_alpha, android.support.v7.a.e.abc_textfield_search_default_mtrl_alpha, android.support.v7.a.e.abc_textfield_default_mtrl_alpha, android.support.v7.a.e.abc_ab_share_pack_mtrl_alpha};
        f = new int[]{android.support.v7.a.e.abc_textfield_activated_mtrl_alpha, android.support.v7.a.e.abc_textfield_search_activated_mtrl_alpha, android.support.v7.a.e.abc_cab_background_top_mtrl_alpha, android.support.v7.a.e.abc_text_cursor_mtrl_alpha};
        g = new int[]{android.support.v7.a.e.abc_popup_background_mtrl_mult, android.support.v7.a.e.abc_cab_background_internal_bg, android.support.v7.a.e.abc_menu_hardkey_panel_mtrl_mult};
        h = new int[]{android.support.v7.a.e.abc_edit_text_material, android.support.v7.a.e.abc_tab_indicator_material, android.support.v7.a.e.abc_textfield_search_material, android.support.v7.a.e.abc_spinner_mtrl_am_alpha, android.support.v7.a.e.abc_btn_check_material, android.support.v7.a.e.abc_btn_radio_material, android.support.v7.a.e.abc_spinner_textfield_background_material, android.support.v7.a.e.abc_ratingbar_full_material, android.support.v7.a.e.abc_switch_track_mtrl_alpha, android.support.v7.a.e.abc_switch_thumb_material, android.support.v7.a.e.abc_btn_default_mtrl_shape, android.support.v7.a.e.abc_btn_borderless_material};
        i = new int[]{android.support.v7.a.e.abc_cab_background_top_material};
    }

    public static Drawable a(Context context, int i2) {
        f fVar;
        if (b(i2)) {
            if (context instanceof e) {
                fVar = ((e) context).a();
            } else {
                fVar = new f(context);
            }
            return fVar.a(i2);
        }
        return android.support.v4.a.a.a(context, i2);
    }

    public f(Context context) {
        this.j = context;
        this.k = new h(context.getResources(), this);
    }

    Resources a() {
        return this.k;
    }

    public Drawable a(int i2) {
        Drawable a2 = android.support.v4.a.a.a(this.j, i2);
        if (a2 != null) {
            Drawable mutate = a2.mutate();
            if (a(h, i2)) {
                ColorStateList c2 = c(i2);
                PorterDuff.Mode mode = b;
                if (i2 == android.support.v7.a.e.abc_switch_thumb_material) {
                    mode = PorterDuff.Mode.MULTIPLY;
                }
                if (c2 != null) {
                    Drawable c3 = android.support.v4.b.a.a.c(mutate);
                    android.support.v4.b.a.a.a(c3, c2);
                    android.support.v4.b.a.a.a(c3, mode);
                    return c3;
                }
                return mutate;
            }
            if (a(i, i2)) {
                return this.k.getDrawable(i2);
            }
            a(i2, mutate);
            return mutate;
        }
        return a2;
    }

    void a(int i2, Drawable drawable) {
        int i3;
        int i4;
        PorterDuff.Mode mode;
        boolean z;
        if (a(e, i2)) {
            i3 = -1;
            mode = null;
            z = true;
            i4 = android.support.v7.a.b.colorControlNormal;
        } else if (a(f, i2)) {
            i3 = -1;
            mode = null;
            z = true;
            i4 = android.support.v7.a.b.colorControlActivated;
        } else if (a(g, i2)) {
            z = true;
            i4 = 16842801;
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = -1;
        } else if (i2 == android.support.v7.a.e.abc_list_divider_mtrl_alpha) {
            mode = null;
            z = true;
            i4 = 16842800;
            i3 = Math.round(40.8f);
        } else {
            i3 = -1;
            i4 = 0;
            mode = null;
            z = false;
        }
        if (z) {
            if (mode == null) {
                mode = b;
            }
            a(drawable, d.a(this.j, i4), mode);
            if (i3 != -1) {
                drawable.setAlpha(i3);
            }
        }
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(int i2) {
        return a(g, i2) || a(e, i2) || a(f, i2) || a(h, i2) || a(i, i2);
    }

    private ColorStateList c(int i2) {
        ColorStateList colorStateList = (ColorStateList) this.m.get(i2);
        if (colorStateList == null) {
            if (i2 == android.support.v7.a.e.abc_edit_text_material) {
                colorStateList = e();
            } else if (i2 == android.support.v7.a.e.abc_switch_track_mtrl_alpha) {
                colorStateList = c();
            } else if (i2 == android.support.v7.a.e.abc_switch_thumb_material) {
                colorStateList = d();
            } else if (i2 == android.support.v7.a.e.abc_btn_default_mtrl_shape || i2 == android.support.v7.a.e.abc_btn_borderless_material) {
                colorStateList = f();
            } else if (i2 == android.support.v7.a.e.abc_spinner_mtrl_am_alpha || i2 == android.support.v7.a.e.abc_spinner_textfield_background_material) {
                colorStateList = g();
            } else {
                colorStateList = b();
            }
            this.m.append(i2, colorStateList);
        }
        return colorStateList;
    }

    private ColorStateList b() {
        if (this.n == null) {
            int a2 = d.a(this.j, android.support.v7.a.b.colorControlNormal);
            int a3 = d.a(this.j, android.support.v7.a.b.colorControlActivated);
            this.n = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_focused}, new int[]{R.attr.state_activated}, new int[]{R.attr.state_pressed}, new int[]{R.attr.state_checked}, new int[]{R.attr.state_selected}, new int[0]}, new int[]{d.c(this.j, android.support.v7.a.b.colorControlNormal), a3, a3, a3, a3, a3, a2});
        }
        return this.n;
    }

    private ColorStateList c() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_checked}, new int[0]}, new int[]{d.a(this.j, R.attr.colorForeground, 0.1f), d.a(this.j, android.support.v7.a.b.colorControlActivated, 0.3f), d.a(this.j, R.attr.colorForeground, 0.3f)});
    }

    private ColorStateList d() {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList b2 = d.b(this.j, android.support.v7.a.b.colorSwitchThumbNormal);
        if (b2 != null && b2.isStateful()) {
            iArr[0] = new int[]{-16842910};
            iArr2[0] = b2.getColorForState(iArr[0], 0);
            iArr[1] = new int[]{R.attr.state_checked};
            iArr2[1] = d.a(this.j, android.support.v7.a.b.colorControlActivated);
            iArr[2] = new int[0];
            iArr2[2] = b2.getDefaultColor();
        } else {
            iArr[0] = new int[]{-16842910};
            iArr2[0] = d.c(this.j, android.support.v7.a.b.colorSwitchThumbNormal);
            iArr[1] = new int[]{R.attr.state_checked};
            iArr2[1] = d.a(this.j, android.support.v7.a.b.colorControlActivated);
            iArr[2] = new int[0];
            iArr2[2] = d.a(this.j, android.support.v7.a.b.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    private ColorStateList e() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{d.c(this.j, android.support.v7.a.b.colorControlNormal), d.a(this.j, android.support.v7.a.b.colorControlNormal), d.a(this.j, android.support.v7.a.b.colorControlActivated)});
    }

    private ColorStateList f() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]}, new int[]{d.c(this.j, android.support.v7.a.b.colorButtonNormal), d.a(this.j, android.support.v7.a.b.colorControlHighlight), d.a(this.j, android.support.v7.a.b.colorControlHighlight), d.a(this.j, android.support.v7.a.b.colorButtonNormal)});
    }

    private ColorStateList g() {
        return new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{-16842919, -16842908}, new int[0]}, new int[]{d.c(this.j, android.support.v7.a.b.colorControlNormal), d.a(this.j, android.support.v7.a.b.colorControlNormal), d.a(this.j, android.support.v7.a.b.colorControlActivated)});
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2 = d.a(i2, mode);
        if (a2 == null) {
            a2 = new PorterDuffColorFilter(i2, mode);
            d.a(i2, mode, a2);
        }
        drawable.setColorFilter(a2);
    }
}
