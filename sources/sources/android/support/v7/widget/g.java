package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
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
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    private interface c {
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
        Drawable drawableD = d(context, i2);
        if (drawableD == null) {
            drawableD = c(context, i2);
        }
        if (drawableD == null) {
            drawableD = android.support.v4.content.a.a(context, i2);
        }
        if (drawableD != null) {
            drawableD = a(context, i2, z, drawableD);
        }
        if (drawableD != null) {
            o.b(drawableD);
        }
        return drawableD;
    }

    private static long a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable c(Context context, int i2) {
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        context.getResources().getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA == null) {
            if (i2 == a.e.abc_cab_background_top_material) {
                drawableA = new LayerDrawable(new Drawable[]{a(context, a.e.abc_cab_background_internal_bg), a(context, a.e.abc_cab_background_top_mtrl_alpha)});
            }
            if (drawableA != null) {
                drawableA.setChangingConfigurations(typedValue.changingConfigurations);
                a(context, jA, drawableA);
            }
        }
        return drawableA;
    }

    private Drawable a(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList colorStateListB = b(context, i2);
        if (colorStateListB != null) {
            if (o.c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable drawableF = android.support.v4.a.a.a.f(drawable);
            android.support.v4.a.a.a.a(drawableF, colorStateListB);
            PorterDuff.Mode modeA = a(i2);
            if (modeA != null) {
                android.support.v4.a.a.a.a(drawableF, modeA);
                return drawableF;
            }
            return drawableF;
        }
        if (i2 == a.e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            a(layerDrawable.findDrawableByLayerId(R.id.background), v.a(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), v.a(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable.findDrawableByLayerId(R.id.progress), v.a(context, a.C0012a.colorControlActivated), a);
            return drawable;
        }
        if (i2 == a.e.abc_ratingbar_indicator_material || i2 == a.e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            a(layerDrawable2.findDrawableByLayerId(R.id.background), v.c(context, a.C0012a.colorControlNormal), a);
            a(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), v.a(context, a.C0012a.colorControlActivated), a);
            a(layerDrawable2.findDrawableByLayerId(R.id.progress), v.a(context, a.C0012a.colorControlActivated), a);
            return drawable;
        }
        if (!a(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    private Drawable d(Context context, int i2) {
        Drawable drawable;
        int next;
        if (this.k == null || this.k.isEmpty()) {
            return null;
        }
        if (this.l != null) {
            String str = this.l.get(i2);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.k.get(str) == null)) {
                return null;
            }
        } else {
            this.l = new SparseArray<>();
        }
        if (this.o == null) {
            this.o = new TypedValue();
        }
        TypedValue typedValue = this.o;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long jA = a(typedValue);
        Drawable drawableA = a(context, jA);
        if (drawableA != null) {
            return drawableA;
        }
        if (typedValue.string == null || !typedValue.string.toString().endsWith(".xml")) {
            drawable = drawableA;
        } else {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.l.append(i2, name);
                c cVar = this.k.get(name);
                if (cVar != null) {
                    drawableA = cVar.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableA != null) {
                    drawableA.setChangingConfigurations(typedValue.changingConfigurations);
                    if (a(context, jA, drawableA)) {
                    }
                }
                drawable = drawableA;
            } catch (Exception e2) {
                Log.e("AppCompatDrawableManager", "Exception while inflating drawable", e2);
                drawable = drawableA;
            }
        }
        if (drawable == null) {
            this.l.append(i2, "appcompat_skip_skip");
            return drawable;
        }
        return drawable;
    }

    private Drawable a(Context context, long j) {
        synchronized (this.m) {
            android.support.v4.d.e<WeakReference<Drawable.ConstantState>> eVar = this.n.get(context);
            if (eVar == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> weakReferenceA = eVar.a(j);
            if (weakReferenceA != null) {
                Drawable.ConstantState constantState = weakReferenceA.get();
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
        Drawable drawableD = d(context, i2);
        if (drawableD == null) {
            drawableD = acVar.a(i2);
        }
        if (drawableD != null) {
            return a(context, i2, false, drawableD);
        }
        return null;
    }

    static boolean a(Context context, int i2, Drawable drawable) {
        int iRound;
        int i3;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = a;
        if (a(d, i2)) {
            i3 = a.C0012a.colorControlNormal;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (a(f, i2)) {
            i3 = a.C0012a.colorControlActivated;
            mode = mode2;
            z = true;
            iRound = -1;
        } else if (a(g, i2)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = 16842801;
            iRound = -1;
        } else if (i2 == a.e.abc_list_divider_mtrl_alpha) {
            i3 = R.attr.colorForeground;
            iRound = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else {
            iRound = -1;
            i3 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (o.c(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(a(v.a(context, i3), mode));
        if (iRound == -1) {
            return true;
        }
        drawable.setAlpha(iRound);
        return true;
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
        ColorStateList colorStateListE = e(context, i2);
        if (colorStateListE == null) {
            if (i2 == a.e.abc_edit_text_material) {
                colorStateListE = e(context);
            } else if (i2 == a.e.abc_switch_track_mtrl_alpha) {
                colorStateListE = c(context);
            } else if (i2 == a.e.abc_switch_thumb_material) {
                colorStateListE = d(context);
            } else if (i2 == a.e.abc_btn_default_mtrl_shape) {
                colorStateListE = f(context);
            } else if (i2 == a.e.abc_btn_borderless_material) {
                colorStateListE = g(context);
            } else if (i2 == a.e.abc_btn_colored_material) {
                colorStateListE = h(context);
            } else if (i2 == a.e.abc_spinner_mtrl_am_alpha || i2 == a.e.abc_spinner_textfield_background_material) {
                colorStateListE = i(context);
            } else if (a(e, i2)) {
                colorStateListE = v.b(context, a.C0012a.colorControlNormal);
            } else if (a(h, i2)) {
                colorStateListE = a(context);
            } else if (a(i, i2)) {
                colorStateListE = b(context);
            } else if (i2 == a.e.abc_seekbar_thumb_material) {
                colorStateListE = j(context);
            }
            if (colorStateListE != null) {
                a(context, i2, colorStateListE);
            }
        }
        return colorStateListE;
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
        int iA = v.a(context, a.C0012a.colorControlNormal);
        int iA2 = v.a(context, a.C0012a.colorControlActivated);
        return new ColorStateList(new int[][]{v.a, v.b, v.c, v.d, v.e, v.f, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), iA2, iA2, iA2, iA2, iA2, iA});
    }

    private ColorStateList b(Context context) {
        return new ColorStateList(new int[][]{v.a, v.e, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlActivated), v.a(context, a.C0012a.colorControlNormal)});
    }

    private ColorStateList c(Context context) {
        return new ColorStateList(new int[][]{v.a, v.e, v.h}, new int[]{v.a(context, R.attr.colorForeground, 0.1f), v.a(context, a.C0012a.colorControlActivated, 0.3f), v.a(context, R.attr.colorForeground, 0.3f)});
    }

    private ColorStateList d(Context context) {
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListB = v.b(context, a.C0012a.colorSwitchThumbNormal);
        if (colorStateListB != null && colorStateListB.isStateful()) {
            iArr[0] = v.a;
            iArr2[0] = colorStateListB.getColorForState(iArr[0], 0);
            iArr[1] = v.e;
            iArr2[1] = v.a(context, a.C0012a.colorControlActivated);
            iArr[2] = v.h;
            iArr2[2] = colorStateListB.getDefaultColor();
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
        int iA = v.a(context, a.C0012a.colorControlHighlight);
        return new ColorStateList(new int[][]{v.a, v.d, v.b, v.h}, new int[]{v.c(context, a.C0012a.colorButtonNormal), android.support.v4.a.a.a(iA, i2), android.support.v4.a.a.a(iA, i2), i2});
    }

    private ColorStateList i(Context context) {
        return new ColorStateList(new int[][]{v.a, v.g, v.h}, new int[]{v.c(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlNormal), v.a(context, a.C0012a.colorControlActivated)});
    }

    private ColorStateList j(Context context) {
        return new ColorStateList(new int[][]{v.a, v.h}, new int[]{v.c(context, a.C0012a.colorControlActivated), v.a(context, a.C0012a.colorControlActivated)});
    }

    private static class b extends android.support.v4.d.f<Integer, PorterDuffColorFilter> {
        public b(int i) {
            super(i);
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode) {
            return a(Integer.valueOf(b(i, mode)));
        }

        PorterDuffColorFilter a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return a(Integer.valueOf(b(i, mode)), porterDuffColorFilter);
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
        PorterDuffColorFilter porterDuffColorFilterA = c.a(i2, mode);
        if (porterDuffColorFilterA == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
            c.a(i2, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return porterDuffColorFilterA;
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

    private static class d implements c {
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

    private static class a implements c {
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
