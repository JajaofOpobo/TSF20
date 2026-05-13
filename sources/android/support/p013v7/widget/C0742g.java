package android.support.p013v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.support.p000a.p001a.C0001b;
import android.support.p000a.p001a.C0011f;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.p003a.C0020a;
import android.support.p002v4.p003a.p004a.C0021a;
import android.support.p002v4.p009d.C0160a;
import android.support.p002v4.p009d.C0165e;
import android.support.p002v4.p009d.C0166f;
import android.support.p013v7.p014a.C0535a;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: android.support.v7.widget.g */
/* loaded from: classes.dex */
public final class C0742g {

    /* renamed from: b */
    private static C0742g f2136b;

    /* renamed from: j */
    private WeakHashMap<Context, SparseArray<ColorStateList>> f2144j;

    /* renamed from: k */
    private C0160a<String, InterfaceC0746c> f2145k;

    /* renamed from: l */
    private SparseArray<String> f2146l;

    /* renamed from: m */
    private final Object f2147m = new Object();

    /* renamed from: n */
    private final WeakHashMap<Context, C0165e<WeakReference<Drawable.ConstantState>>> f2148n = new WeakHashMap<>(0);

    /* renamed from: o */
    private TypedValue f2149o;

    /* renamed from: a */
    private static final PorterDuff.Mode f2135a = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static final C0745b f2137c = new C0745b(6);

    /* renamed from: d */
    private static final int[] f2138d = {C0535a.C0540e.abc_textfield_search_default_mtrl_alpha, C0535a.C0540e.abc_textfield_default_mtrl_alpha, C0535a.C0540e.abc_ab_share_pack_mtrl_alpha};

    /* renamed from: e */
    private static final int[] f2139e = {C0535a.C0540e.abc_ic_ab_back_mtrl_am_alpha, C0535a.C0540e.abc_ic_go_search_api_mtrl_alpha, C0535a.C0540e.abc_ic_search_api_mtrl_alpha, C0535a.C0540e.abc_ic_commit_search_api_mtrl_alpha, C0535a.C0540e.abc_ic_clear_mtrl_alpha, C0535a.C0540e.abc_ic_menu_share_mtrl_alpha, C0535a.C0540e.abc_ic_menu_copy_mtrl_am_alpha, C0535a.C0540e.abc_ic_menu_cut_mtrl_alpha, C0535a.C0540e.abc_ic_menu_selectall_mtrl_alpha, C0535a.C0540e.abc_ic_menu_paste_mtrl_am_alpha, C0535a.C0540e.abc_ic_menu_moreoverflow_mtrl_alpha, C0535a.C0540e.abc_ic_voice_search_api_mtrl_alpha};

    /* renamed from: f */
    private static final int[] f2140f = {C0535a.C0540e.abc_textfield_activated_mtrl_alpha, C0535a.C0540e.abc_textfield_search_activated_mtrl_alpha, C0535a.C0540e.abc_cab_background_top_mtrl_alpha, C0535a.C0540e.abc_text_cursor_material};

    /* renamed from: g */
    private static final int[] f2141g = {C0535a.C0540e.abc_popup_background_mtrl_mult, C0535a.C0540e.abc_cab_background_internal_bg, C0535a.C0540e.abc_menu_hardkey_panel_mtrl_mult};

    /* renamed from: h */
    private static final int[] f2142h = {C0535a.C0540e.abc_edit_text_material, C0535a.C0540e.abc_tab_indicator_material, C0535a.C0540e.abc_textfield_search_material, C0535a.C0540e.abc_spinner_mtrl_am_alpha, C0535a.C0540e.abc_spinner_textfield_background_material, C0535a.C0540e.abc_ratingbar_full_material, C0535a.C0540e.abc_switch_track_mtrl_alpha, C0535a.C0540e.abc_switch_thumb_material, C0535a.C0540e.abc_btn_default_mtrl_shape, C0535a.C0540e.abc_btn_borderless_material};

    /* renamed from: i */
    private static final int[] f2143i = {C0535a.C0540e.abc_btn_check_material, C0535a.C0540e.abc_btn_radio_material};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0746c {
        /* renamed from: a */
        Drawable mo11179a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: a */
    public static C0742g m11215a() {
        if (f2136b == null) {
            f2136b = new C0742g();
            m11200a(f2136b);
        }
        return f2136b;
    }

    /* renamed from: a */
    private static void m11200a(C0742g c0742g) {
        int i = Build.VERSION.SDK_INT;
        if (i < 23) {
            c0742g.m11198a("vector", new C0747d());
            if (i >= 11) {
                c0742g.m11198a("animated-vector", new C0744a());
            }
        }
    }

    /* renamed from: a */
    public Drawable m11211a(Context context, int i) {
        return m11208a(context, i, false);
    }

    /* renamed from: a */
    public Drawable m11208a(Context context, int i, boolean z) {
        Drawable m11191d = m11191d(context, i);
        if (m11191d == null) {
            m11191d = m11193c(context, i);
        }
        if (m11191d == null) {
            m11191d = C0144a.m13403a(context, i);
        }
        if (m11191d != null) {
            m11191d = m11207a(context, i, z, m11191d);
        }
        if (m11191d != null) {
            C0755o.m11123b(m11191d);
        }
        return m11191d;
    }

    /* renamed from: a */
    private static long m11199a(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: c */
    private Drawable m11193c(Context context, int i) {
        if (this.f2149o == null) {
            this.f2149o = new TypedValue();
        }
        TypedValue typedValue = this.f2149o;
        context.getResources().getValue(i, typedValue, true);
        long m11199a = m11199a(typedValue);
        Drawable m11206a = m11206a(context, m11199a);
        if (m11206a == null) {
            if (i == C0535a.C0540e.abc_cab_background_top_material) {
                m11206a = new LayerDrawable(new Drawable[]{m11211a(context, C0535a.C0540e.abc_cab_background_internal_bg), m11211a(context, C0535a.C0540e.abc_cab_background_top_mtrl_alpha)});
            }
            if (m11206a != null) {
                m11206a.setChangingConfigurations(typedValue.changingConfigurations);
                m11205a(context, m11199a, m11206a);
            }
        }
        return m11206a;
    }

    /* renamed from: a */
    private Drawable m11207a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m11195b = m11195b(context, i);
        if (m11195b != null) {
            if (C0755o.m11122c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m13850f = C0021a.m13850f(drawable);
            C0021a.m13860a(m13850f, m11195b);
            PorterDuff.Mode m11214a = m11214a(i);
            if (m11214a != null) {
                C0021a.m13857a(m13850f, m11214a);
                return m13850f;
            }
            return m13850f;
        } else if (i == C0535a.C0540e.abc_seekbar_track_material) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m11202a(layerDrawable.findDrawableByLayerId(16908288), C0770v.m11069a(context, C0535a.C0536a.colorControlNormal), f2135a);
            m11202a(layerDrawable.findDrawableByLayerId(16908303), C0770v.m11069a(context, C0535a.C0536a.colorControlNormal), f2135a);
            m11202a(layerDrawable.findDrawableByLayerId(16908301), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated), f2135a);
            return drawable;
        } else if (i == C0535a.C0540e.abc_ratingbar_indicator_material || i == C0535a.C0540e.abc_ratingbar_small_material) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m11202a(layerDrawable2.findDrawableByLayerId(16908288), C0770v.m11066c(context, C0535a.C0536a.colorControlNormal), f2135a);
            m11202a(layerDrawable2.findDrawableByLayerId(16908303), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated), f2135a);
            m11202a(layerDrawable2.findDrawableByLayerId(16908301), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated), f2135a);
            return drawable;
        } else if (!m11209a(context, i, drawable) && z) {
            return null;
        } else {
            return drawable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.graphics.drawable.Drawable m11191d(android.content.Context r10, int r11) {
        /*
            r9 = this;
            r1 = 0
            r8 = 2
            r7 = 1
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r0 = r9.f2145k
            if (r0 == 0) goto Lbf
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r0 = r9.f2145k
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lbf
            android.util.SparseArray<java.lang.String> r0 = r9.f2146l
            if (r0 == 0) goto L2f
            android.util.SparseArray<java.lang.String> r0 = r9.f2146l
            java.lang.Object r0 = r0.get(r11)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "appcompat_skip_skip"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2d
            if (r0 == 0) goto L36
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r2 = r9.f2145k
            java.lang.Object r0 = r2.get(r0)
            if (r0 != 0) goto L36
        L2d:
            r0 = r1
        L2e:
            return r0
        L2f:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            r9.f2146l = r0
        L36:
            android.util.TypedValue r0 = r9.f2149o
            if (r0 != 0) goto L41
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r9.f2149o = r0
        L41:
            android.util.TypedValue r2 = r9.f2149o
            android.content.res.Resources r0 = r10.getResources()
            r0.getValue(r11, r2, r7)
            long r4 = m11199a(r2)
            android.graphics.drawable.Drawable r1 = r9.m11206a(r10, r4)
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
            android.util.SparseArray<java.lang.String> r1 = r9.f2146l
            java.lang.String r2 = "appcompat_skip_skip"
            r1.append(r11, r2)
            goto L2e
        L95:
            java.lang.String r0 = r3.getName()     // Catch: java.lang.Exception -> L82
            android.util.SparseArray<java.lang.String> r7 = r9.f2146l     // Catch: java.lang.Exception -> L82
            r7.append(r11, r0)     // Catch: java.lang.Exception -> L82
            android.support.v4.d.a<java.lang.String, android.support.v7.widget.g$c> r7 = r9.f2145k     // Catch: java.lang.Exception -> L82
            java.lang.Object r0 = r7.get(r0)     // Catch: java.lang.Exception -> L82
            android.support.v7.widget.g$c r0 = (android.support.p013v7.widget.C0742g.InterfaceC0746c) r0     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto Lb0
            android.content.res.Resources$Theme r7 = r10.getTheme()     // Catch: java.lang.Exception -> L82
            android.graphics.drawable.Drawable r1 = r0.mo11179a(r10, r3, r6, r7)     // Catch: java.lang.Exception -> L82
        Lb0:
            if (r1 == 0) goto Lbd
            int r0 = r2.changingConfigurations     // Catch: java.lang.Exception -> L82
            r1.setChangingConfigurations(r0)     // Catch: java.lang.Exception -> L82
            boolean r0 = r9.m11205a(r10, r4, r1)     // Catch: java.lang.Exception -> L82
            if (r0 == 0) goto Lbd
        Lbd:
            r0 = r1
            goto L8b
        Lbf:
            r0 = r1
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p013v7.widget.C0742g.m11191d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private Drawable m11206a(Context context, long j) {
        synchronized (this.f2147m) {
            C0165e<WeakReference<Drawable.ConstantState>> c0165e = this.f2148n.get(context);
            if (c0165e == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> m13367a = c0165e.m13367a(j);
            if (m13367a != null) {
                Drawable.ConstantState constantState = m13367a.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                c0165e.m13363b(j);
            }
            return null;
        }
    }

    /* renamed from: a */
    private boolean m11205a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            synchronized (this.f2147m) {
                C0165e<WeakReference<Drawable.ConstantState>> c0165e = this.f2148n.get(context);
                if (c0165e == null) {
                    c0165e = new C0165e<>();
                    this.f2148n.put(context, c0165e);
                }
                c0165e.m13362b(j, new WeakReference<>(constantState));
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Drawable m11204a(Context context, C0729ac c0729ac, int i) {
        Drawable m11191d = m11191d(context, i);
        if (m11191d == null) {
            m11191d = c0729ac.m11261a(i);
        }
        if (m11191d != null) {
            return m11207a(context, i, false, m11191d);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m11209a(Context context, int i, Drawable drawable) {
        int i2;
        int i3;
        PorterDuff.Mode mode;
        boolean z;
        PorterDuff.Mode mode2 = f2135a;
        if (m11197a(f2138d, i)) {
            i3 = C0535a.C0536a.colorControlNormal;
            mode = mode2;
            z = true;
            i2 = -1;
        } else if (m11197a(f2140f, i)) {
            i3 = C0535a.C0536a.colorControlActivated;
            mode = mode2;
            z = true;
            i2 = -1;
        } else if (m11197a(f2141g, i)) {
            z = true;
            mode = PorterDuff.Mode.MULTIPLY;
            i3 = 16842801;
            i2 = -1;
        } else if (i == C0535a.C0540e.abc_list_divider_mtrl_alpha) {
            i3 = 16842800;
            i2 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else {
            i2 = -1;
            i3 = 0;
            mode = mode2;
            z = false;
        }
        if (z) {
            if (C0755o.m11122c(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(m11213a(C0770v.m11069a(context, i3), mode));
            if (i2 != -1) {
                drawable.setAlpha(i2);
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m11198a(String str, InterfaceC0746c interfaceC0746c) {
        if (this.f2145k == null) {
            this.f2145k = new C0160a<>();
        }
        this.f2145k.put(str, interfaceC0746c);
    }

    /* renamed from: a */
    private static boolean m11197a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    final PorterDuff.Mode m11214a(int i) {
        if (i != C0535a.C0540e.abc_switch_thumb_material) {
            return null;
        }
        return PorterDuff.Mode.MULTIPLY;
    }

    /* renamed from: b */
    public final ColorStateList m11195b(Context context, int i) {
        ColorStateList m11189e = m11189e(context, i);
        if (m11189e == null) {
            if (i == C0535a.C0540e.abc_edit_text_material) {
                m11189e = m11190e(context);
            } else if (i == C0535a.C0540e.abc_switch_track_mtrl_alpha) {
                m11189e = m11194c(context);
            } else if (i == C0535a.C0540e.abc_switch_thumb_material) {
                m11189e = m11192d(context);
            } else if (i == C0535a.C0540e.abc_btn_default_mtrl_shape) {
                m11189e = m11188f(context);
            } else if (i == C0535a.C0540e.abc_btn_borderless_material) {
                m11189e = m11186g(context);
            } else if (i == C0535a.C0540e.abc_btn_colored_material) {
                m11189e = m11185h(context);
            } else if (i == C0535a.C0540e.abc_spinner_mtrl_am_alpha || i == C0535a.C0540e.abc_spinner_textfield_background_material) {
                m11189e = m11184i(context);
            } else if (m11197a(f2139e, i)) {
                m11189e = C0770v.m11067b(context, C0535a.C0536a.colorControlNormal);
            } else if (m11197a(f2142h, i)) {
                m11189e = m11212a(context);
            } else if (m11197a(f2143i, i)) {
                m11189e = m11196b(context);
            } else if (i == C0535a.C0540e.abc_seekbar_thumb_material) {
                m11189e = m11183j(context);
            }
            if (m11189e != null) {
                m11210a(context, i, m11189e);
            }
        }
        return m11189e;
    }

    /* renamed from: e */
    private ColorStateList m11189e(Context context, int i) {
        SparseArray<ColorStateList> sparseArray;
        if (this.f2144j != null && (sparseArray = this.f2144j.get(context)) != null) {
            return sparseArray.get(i);
        }
        return null;
    }

    /* renamed from: a */
    private void m11210a(Context context, int i, ColorStateList colorStateList) {
        if (this.f2144j == null) {
            this.f2144j = new WeakHashMap<>();
        }
        SparseArray<ColorStateList> sparseArray = this.f2144j.get(context);
        if (sparseArray == null) {
            sparseArray = new SparseArray<>();
            this.f2144j.put(context, sparseArray);
        }
        sparseArray.append(i, colorStateList);
    }

    /* renamed from: a */
    private ColorStateList m11212a(Context context) {
        int m11069a = C0770v.m11069a(context, C0535a.C0536a.colorControlNormal);
        int m11069a2 = C0770v.m11069a(context, C0535a.C0536a.colorControlActivated);
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2226b, C0770v.f2227c, C0770v.f2228d, C0770v.f2229e, C0770v.f2230f, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorControlNormal), m11069a2, m11069a2, m11069a2, m11069a2, m11069a2, m11069a});
    }

    /* renamed from: b */
    private ColorStateList m11196b(Context context) {
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2229e, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorControlNormal), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated), C0770v.m11069a(context, C0535a.C0536a.colorControlNormal)});
    }

    /* renamed from: c */
    private ColorStateList m11194c(Context context) {
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2229e, C0770v.f2232h}, new int[]{C0770v.m11068a(context, 16842800, 0.1f), C0770v.m11068a(context, C0535a.C0536a.colorControlActivated, 0.3f), C0770v.m11068a(context, 16842800, 0.3f)});
    }

    /* renamed from: d */
    private ColorStateList m11192d(Context context) {
        int[][] iArr = new int[3];
        int[] iArr2 = new int[3];
        ColorStateList m11067b = C0770v.m11067b(context, C0535a.C0536a.colorSwitchThumbNormal);
        if (m11067b != null && m11067b.isStateful()) {
            iArr[0] = C0770v.f2225a;
            iArr2[0] = m11067b.getColorForState(iArr[0], 0);
            iArr[1] = C0770v.f2229e;
            iArr2[1] = C0770v.m11069a(context, C0535a.C0536a.colorControlActivated);
            iArr[2] = C0770v.f2232h;
            iArr2[2] = m11067b.getDefaultColor();
        } else {
            iArr[0] = C0770v.f2225a;
            iArr2[0] = C0770v.m11066c(context, C0535a.C0536a.colorSwitchThumbNormal);
            iArr[1] = C0770v.f2229e;
            iArr2[1] = C0770v.m11069a(context, C0535a.C0536a.colorControlActivated);
            iArr[2] = C0770v.f2232h;
            iArr2[2] = C0770v.m11069a(context, C0535a.C0536a.colorSwitchThumbNormal);
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* renamed from: e */
    private ColorStateList m11190e(Context context) {
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2231g, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorControlNormal), C0770v.m11069a(context, C0535a.C0536a.colorControlNormal), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated)});
    }

    /* renamed from: f */
    private ColorStateList m11188f(Context context) {
        return m11187f(context, C0770v.m11069a(context, C0535a.C0536a.colorButtonNormal));
    }

    /* renamed from: g */
    private ColorStateList m11186g(Context context) {
        return m11187f(context, 0);
    }

    /* renamed from: h */
    private ColorStateList m11185h(Context context) {
        return m11187f(context, C0770v.m11069a(context, C0535a.C0536a.colorAccent));
    }

    /* renamed from: f */
    private ColorStateList m11187f(Context context, int i) {
        int m11069a = C0770v.m11069a(context, C0535a.C0536a.colorControlHighlight);
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2228d, C0770v.f2226b, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorButtonNormal), C0020a.m13868a(m11069a, i), C0020a.m13868a(m11069a, i), i});
    }

    /* renamed from: i */
    private ColorStateList m11184i(Context context) {
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2231g, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorControlNormal), C0770v.m11069a(context, C0535a.C0536a.colorControlNormal), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated)});
    }

    /* renamed from: j */
    private ColorStateList m11183j(Context context) {
        return new ColorStateList(new int[][]{C0770v.f2225a, C0770v.f2232h}, new int[]{C0770v.m11066c(context, C0535a.C0536a.colorControlActivated), C0770v.m11069a(context, C0535a.C0536a.colorControlActivated)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g$b */
    /* loaded from: classes.dex */
    public static class C0745b extends C0166f<Integer, PorterDuffColorFilter> {
        public C0745b(int i) {
            super(i);
        }

        /* renamed from: a */
        PorterDuffColorFilter m11182a(int i, PorterDuff.Mode mode) {
            return m13358a((C0745b) Integer.valueOf(m11180b(i, mode)));
        }

        /* renamed from: a */
        PorterDuffColorFilter m11181a(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m13357a((C0745b) Integer.valueOf(m11180b(i, mode)), (Integer) porterDuffColorFilter);
        }

        /* renamed from: b */
        private static int m11180b(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: a */
    public static void m11201a(Drawable drawable, C0773y c0773y, int[] iArr) {
        if (C0755o.m11122c(drawable) && drawable.mutate() != drawable) {
            Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if (c0773y.f2241d || c0773y.f2240c) {
            drawable.setColorFilter(m11203a(c0773y.f2241d ? c0773y.f2238a : null, c0773y.f2240c ? c0773y.f2239b : f2135a, iArr));
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m11203a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m11213a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static PorterDuffColorFilter m11213a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m11182a = f2137c.m11182a(i, mode);
        if (m11182a == null) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
            f2137c.m11181a(i, mode, porterDuffColorFilter);
            return porterDuffColorFilter;
        }
        return m11182a;
    }

    /* renamed from: a */
    private static void m11202a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0755o.m11122c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f2135a;
        }
        drawable.setColorFilter(m11213a(i, mode));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g$d */
    /* loaded from: classes.dex */
    public static class C0747d implements InterfaceC0746c {
        private C0747d() {
        }

        @Override // android.support.p013v7.widget.C0742g.InterfaceC0746c
        /* renamed from: a */
        public Drawable mo11179a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0011f.m13913a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.g$a */
    /* loaded from: classes.dex */
    public static class C0744a implements InterfaceC0746c {
        private C0744a() {
        }

        @Override // android.support.p013v7.widget.C0742g.InterfaceC0746c
        /* renamed from: a */
        public Drawable mo11179a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0001b.m13939a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }
}
