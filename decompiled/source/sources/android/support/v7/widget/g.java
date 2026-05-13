package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public final class g {
    private static g b;
    private WeakHashMap<Context, SparseArray<ColorStateList>> j;
    private android.support.v4.d.a<String, c> k;
    private SparseArray<String> l;
    private final Object m = new Object();
    private final WeakHashMap<Context, android.support.v4.d.e<WeakReference<Drawable.ConstantState>>> n = new WeakHashMap<>(0);
    private TypedValue o;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final b c = new b(6);
    private static final int[] d = {a.e.abc_textfield_search_default_mtrl_alpha, a.e.abc_textfield_default_mtrl_alpha, a.e.abc_ab_share_pack_mtrl_alpha};
    private static final int[] e = {a.e.abc_ic_ab_back_mtrl_am_alpha, a.e.abc_ic_go_search_api_mtrl_alpha, a.e.abc_ic_search_api_mtrl_alpha, a.e.abc_ic_commit_search_api_mtrl_alpha, a.e.abc_ic_clear_mtrl_alpha, a.e.abc_ic_menu_share_mtrl_alpha, a.e.abc_ic_menu_copy_mtrl_am_alpha, a.e.abc_ic_menu_cut_mtrl_alpha, a.e.abc_ic_menu_selectall_mtrl_alpha, a.e.abc_ic_menu_paste_mtrl_am_alpha, a.e.abc_ic_menu_moreoverflow_mtrl_alpha, a.e.abc_ic_voice_search_api_mtrl_alpha};
    private static final int[] f = {a.e.abc_textfield_activated_mtrl_alpha, a.e.abc_textfield_search_activated_mtrl_alpha, a.e.abc_cab_background_top_mtrl_alpha, a.e.abc_text_cursor_material};
    private static final int[] g = {a.e.abc_popup_background_mtrl_mult, a.e.abc_cab_background_internal_bg, a.e.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] h = {a.e.abc_edit_text_material, a.e.abc_tab_indicator_material, a.e.abc_textfield_search_material, a.e.abc_spinner_mtrl_am_alpha, a.e.abc_spinner_textfield_background_material, a.e.abc_ratingbar_full_material, a.e.abc_switch_track_mtrl_alpha, a.e.abc_switch_thumb_material, a.e.abc_btn_default_mtrl_shape, a.e.abc_btn_borderless_material};
    private static final int[] i = {a.e.abc_btn_check_material, a.e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    public static g a() {
        if (b == null) {
            b = new g();
            a(b);
        }
        return b;
    }

    private static void a(g gVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            gVar.a("vector", new d());
            if (i2 >= 11) {
                gVar.a("animated-vector", new a());
            }
        }
    }

    public Drawable a(Context context, int i2) {
        return a(context, i2, false);
    }

    public Drawable a(Context context, int i2, boolean z) {
        Drawable d2 = d(context, i2);
        if (d2 == null) {
            d2 = c(context, i2);
        }
        if (d2 == null) {
            d2 = android.support.v4.content.a.a(context, i2);
        }
        if (d2 != null) {
            d2 = a(context, i2, z, d2);
        }
        if (d2 != null) {
            o.b(d2);
        }
        return d2;
    }

    private static long a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable c(Context context, int i2) {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        context.getResources().getValue(i2, typedValue, true);
        long a2 = a(typedValue);
        Drawable a3 = a(context, a2);
        if (a3 == null) {
            if (i2 == a.e.abc_cab_background_top_material) {
                a3 = new LayerDrawable(new Drawable[]{a(context, a.e.abc_cab_background_internal_bg), a(context, a.e.abc_cab_background_top_mtrl_alpha)});
            }
            if (a3 != null) {
                a3.setChangingConfigurations(typedValue.changingConfigurations);
                a(context, a2, a3);
            }
        }
        return a3;
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList b2 = b(context, i2);
        if (b2 != null) {
            if (o.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f2 = android.support.v4.a.a.a.f(drawable);
            android.support.v4.a.a.a.a(f2, b2);
            PorterDuff.Mode a2 = a(i2);
            if (a2 != null) {
                android.support.v4.a.a.a.a(f2, a2);
                return f2;
            }
            return f2;
        } else if (i2 == a.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(16908288), v.a(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(16908303), v.a(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(16908301), v.a(context, a.C0012a.colorControlActivated), a);
            return drawable;
        } else if (i2 == a.e.abc_ratingbar_indicator_material || i2 == a.e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(16908288), v.c(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable2.findDrawableByLayerId(16908303), v.a(context, a.C0012a.colorControlActivated), a);
            a(layerDrawable2.findDrawableByLayerId(16908301), v.a(context, a.C0012a.colorControlActivated), a);
            return drawable;
        } else if (!a(context, i2, drawable) && z) {
            return null;
        } else {
            return drawable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.drawable.Drawable d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            r1 = 0
            r8 = 2
            r7 = 1
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r0 = r9.k
            if (r0 == 0) goto Lbf
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r0 = r9.k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbf
            android.util.SparseArray<java.lang.String> r0 = r9.l
            if (r0 == 0) goto L2f
            android.util.SparseArray<java.lang.String> r0 = r9.l
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2d
            if (r0 == 0) goto L36
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r2 = r9.k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L36
        L2d:
            r0 = r1
        L2e:
            return r0
        L2f:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.l = r0
        L36:
            android.util.TypedValue r0 = r9.o
            if (r0 != 0) goto L41
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.o = r0
        L41:
            android.util.TypedValue r2 = r9.o
            android.content.res.Resources r0 = r10.getResources()
            r0.getValue(r11, r2, r7)
            long r4 = a(r2)
            android.graphics.drawable.Drawable r1 = r9.a(r10, r4)
            if (r1 == 0) goto L56
            r0 = r1
            goto L2e
        L56:
            java.lang.CharSequence r3 = r2.string
            if (r3 == 0) goto L8a
            java.lang.CharSequence r3 = r2.string
            java.lang.String r3 = r3.toString()
            java.lang.String r6 = ".xml"
            boolean r3 = r3.endsWith(r6)
            if (r3 == 0) goto L8a
            android.content.res.XmlResourceParser r3 = r0.getXml(r11)     // Catch: java.lang.Exception -> L82
            android.util.AttributeSet r6 = android.util.Xml.asAttributeSet(r3)     // Catch: java.lang.Exception -> L82
        L70:
            int r0 = r3.next()     // Catch: java.lang.Exception -> L82
            if (r0 == r8) goto L78
            if (r0 != r7) goto L70
        L78:
            if (r0 == r8) goto L95
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch: java.lang.Exception -> L82
            java.lang.String r2 = "No start tag found"
            r0.<init>(r2)     // Catch: java.lang.Exception -> L82
            throw r0     // Catch: java.lang.Exception -> L82
        L82:
            r0 = move-exception
            java.lang.String r2 = "AppCompatDrawableManager"
            java.lang.String r3 = "Exception while inflating drawable"
            android.util.Log.e(r2, r3, r0)
        L8a:
            r0 = r1
        L8b:
            if (r0 != 0) goto L2e
            android.util.SparseArray<java.lang.String> r1 = r9.l
            java.lang.String r2 = "appcompat_skip_skip"
            r1.append(r11, r2)
            goto L2e
        L95:
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Exception -> L82
            android.util.SparseArray<java.lang.String> r7 = r9.l     // Catch: java.lang.Exception -> L82
            r7.append(r11, r0)     // Catch: java.lang.Exception -> L82
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r7 = r9.k     // Catch: java.lang.Exception -> L82
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L82
            android.support.v7.widget.g$c r0 = (android.support.v7.widget.g.c) r0     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto Lb0
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch: java.lang.Exception -> L82
            android.graphics.drawable.Drawable r1 = r0.a(r10, r3, r6, r7)     // Catch: java.lang.Exception -> L82
        Lb0:
            if (r1 == 0) goto Lbd
            int r0 = r2.changingConfigurations     // Catch: java.lang.Exception -> L82
            r1.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> L82
            boolean r0 = r9.a(r10, r4, r1)     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto Lbd
        Lbd:
            r0 = r1
            goto L8b
        Lbf:
            r0 = r1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.g.d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private Drawable a(Context context, long j) {
        synchronized (this.m) {
            android.support.v4.d.e<WeakReference<Drawable.ConstantState>> eVar = this.n.get(context);
            if (eVar == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> a2 = eVar.a(j);
            if (a2 != null) {
                Drawable.ConstantState constantState = a2.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                eVar.b(j);
            }
            return null;
        }
    }

    private boolean a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.m) {
                android.support.v4.d.e<WeakReference<Drawable.ConstantState>> eVar = this.n.get(context);
                if (eVar == null) {
                    eVar = new android.support.v4.d.e<>();
                    this.n.put(context, eVar);
                }
                eVar.b(j, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    public final Drawable a(Context context, ac acVar, int i2) {
        Drawable d2 = d(context, i2);
        if (d2 == null) {
            d2 = acVar.a(i2);
        }
        if (d2 != null) {
            return a(context, i2, false, d2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Context context, int i2, Drawable drawable) {
        int i3;
        int i4;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = a;
        if (a(d, i2)) {
            i4 = a.C0012a.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(f, i2)) {
            i4 = a.C0012a.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (a(g, i2)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i4 = 16842801;
            i3 = -1;
        } else if (i2 == a.e.abc_list_divider_mtrl_alpha) {
            i4 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else {
            i3 = -1;
            i4 = 0;
            mode = mode2;
            z = false;
        }
        if (z) {
            if (o.c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(a(v.a(context, i4), mode));
            if (i3 != -1) {
                drawable.setAlpha(i3);
                return true;
            }
            return true;
        }
        return false;
    }

    private void a(String str, c cVar) {
        if (this.k == null) {
            this.k = new android.support.v4.d.a<>();
        }
        this.k.put(str, cVar);
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    final PorterDuff.Mode a(int i2) {
        if (i2 != a.e.abc_switch_thumb_material) {
            return null;
        }
        return PorterDuff.Mode.MULTIPLY;
    }

    public final ColorStateList b(Context context, int i2) {
        ColorStateList e2 = e(context, i2);
        if (e2 == null) {
            if (i2 == a.e.abc_edit_text_material) {
                e2 = e(context);
            } else if (i2 == a.e.abc_switch_track_mtrl_alpha) {
                e2 = c(context);
            } else if (i2 == a.e.abc_switch_thumb_material) {
                e2 = d(context);
            } else if (i2 == a.e.abc_btn_default_mtrl_shape) {
                e2 = f(context);
            } else if (i2 == a.e.abc_btn_borderless_material) {
                e2 = g(context);
            } else if (i2 == a.e.abc_btn_colored_material) {
                e2 = h(context);
            } else if (i2 == a.e.abc_spinner_mtrl_am_alpha || i2 == a.e.abc_spinner_textfield_background_material) {
                e2 = i(context);
            } else if (a(e, i2)) {
                e2 = v.b(context, a.C0012a.colorControlNormal);
            } else if (a(h, i2)) {
                e2 = a(context);
            } else if (a(i, i2)) {
                e2 = b(context);
            } else if (i2 == a.e.abc_seekbar_thumb_material) {
                e2 = j(context);
            }
            if (e2 != null) {
                a(context, i2, e2);
            }
        }
        return e2;
    }

    private ColorStateList e(Context context, int i2) {
        SparseArray<ColorStateList> sparseArray;
        if (this.j != null && (sparseArray = this.j.get(context)) != null) {
            return sparseArray.get(i2);
        }
        return null;
    }

    private void a(Context context, int i2, ColorStateList colorStateList) {
        if (this.j == null) {
            this.j = new WeakHashMap<>();
        }
        SparseArray<ColorStateList> sparseArray = this.j.get(context);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.j.put(context, sparseArray);
        }
        sparseArray.append(i2, colorStateList);
    }

    private ColorStateList a(Context context) {
        int a2 = v.a(context, a.C0012a.colorControlNormal);
        int a3 = v.a(context, a.C0012a.colorControlActivated);
        return new ColorStateList(new int[][]{v.a, v.b, v.c, v.d, v.e, v.f, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), a3, a3, a3, a3, a3, a2});
    }

    private ColorStateList b(Context context) {
        return new ColorStateList(new int[][]{v.a, v.e, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlActivated), v.a(context, a.C0012a.colorControlNormal)});
    }

    private ColorStateList c(Context context) {
        return new ColorStateList(new int[][]{v.a, v.e, v.h}, new int[]{v.a(context, 16842800, 0.1f), v.a(context, a.C0012a.colorControlActivated, 0.3f), v.a(context, 16842800, 0.3f)});
    }

    private ColorStateList d(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList b2 = v.b(context, a.C0012a.colorSwitchThumbNormal);
        if (b2 != null && b2.isStateful()) {
            iArr[0] = v.a;
            iArr2[0] = b2.getColorForState(iArr[0], 0);
            iArr[1] = v.e;
            iArr2[1] = v.a(context, a.C0012a.colorControlActivated);
            iArr[2] = v.h;
            iArr2[2] = b2.getDefaultColor();
        } else {
            iArr[0] = v.a;
            iArr2[0] = v.c(context, a.C0012a.colorSwitchThumbNormal);
            iArr[1] = v.e;
            iArr2[1] = v.a(context, a.C0012a.colorControlActivated);
            iArr[2] = v.h;
            iArr2[2] = v.a(context, a.C0012a.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    private ColorStateList e(Context context) {
        return new ColorStateList(new int[][]{v.a, v.g, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlActivated)});
    }

    private ColorStateList f(Context context) {
        return f(context, v.a(context, a.C0012a.colorButtonNormal));
    }

    private ColorStateList g(Context context) {
        return f(context, 0);
    }

    private ColorStateList h(Context context) {
        return f(context, v.a(context, a.C0012a.colorAccent));
    }

    private ColorStateList f(Context context, int i2) {
        int a2 = v.a(context, a.C0012a.colorControlHighlight);
        return new ColorStateList(new int[][]{v.a, v.d, v.b, v.h}, new int[]{v.c(context, a.C0012a.colorButtonNormal), android.support.v4.a.a.a(a2, i2), android.support.v4.a.a.a(a2, i2), i2});
    }

    private ColorStateList i(Context context) {
        return new ColorStateList(new int[][]{v.a, v.g, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlActivated)});
    }

    private ColorStateList j(Context context) {
        return new ColorStateList(new int[][]{v.a, v.h}, new int[]{v.c(context, a.C0012a.colorControlActivated), v.a(context, a.C0012a.colorControlActivated)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends android.support.v4.d.f<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(i);
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return a((b) Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return a((b) Integer.valueOf(b(i, mode)), (Integer) porterDuffColorFilter);
        }

        private static int b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    public static void a(Drawable drawable, y yVar, int[] iArr) {
        if (o.c(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (yVar.d || yVar.c) {
            drawable.setColorFilter(a(yVar.d ? yVar.a : null, yVar.c ? yVar.b : a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    private static PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return a(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static PorterDuffColorFilter a(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2 = c.a(i2, mode);
        if (a2 == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            c.a(i2, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return a2;
    }

    private static void a(Drawable drawable, int i2, PorterDuff.Mode mode) {
        if (o.c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = a;
        }
        drawable.setColorFilter(a(i2, mode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements c {
        private d() {
        }

        @Override // android.support.v7.widget.g.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.a.a.f.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements c {
        private a() {
        }

        @Override // android.support.v7.widget.g.c
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return android.support.a.a.b.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }
}
