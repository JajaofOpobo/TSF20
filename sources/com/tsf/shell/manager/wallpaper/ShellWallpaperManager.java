package com.tsf.shell.manager.wallpaper;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.tsf.shell.Home;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p168b.C3430e;
import com.tsf.shell.p096f.p118e.p120b.C2471b;
import com.tsf.shell.p096f.p131f.C2932g;
import com.tsf.shell.plugin.themepicker.C3897k;
import com.tsf.shell.utils.C4181q;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class ShellWallpaperManager extends BroadcastReceiver {

    /* renamed from: g */
    private WallpaperManager f12295g;

    /* renamed from: h */
    private int f12296h;

    /* renamed from: i */
    private int f12297i;

    /* renamed from: j */
    private int f12298j;

    /* renamed from: l */
    private float f12300l;

    /* renamed from: m */
    private float f12301m;

    /* renamed from: o */
    private C3770e f12303o;

    /* renamed from: d */
    private static float f12291d = 0.0f;

    /* renamed from: e */
    private static int f12292e = 0;

    /* renamed from: a */
    public static int f12289a = 0;

    /* renamed from: b */
    public static int f12290b = 1;

    /* renamed from: k */
    private boolean f12299k = true;

    /* renamed from: n */
    private Object f12302n = new Object();

    /* renamed from: c */
    public boolean f12293c = true;

    /* renamed from: p */
    private ArrayList<InterfaceC3748a> f12304p = new ArrayList<>();

    /* renamed from: f */
    private C3749b f12294f = new C3749b();

    /* renamed from: com.tsf.shell.manager.wallpaper.ShellWallpaperManager$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3748a {
        /* renamed from: f */
        void mo1569f();
    }

    @SuppressLint({"ServiceCast"})
    public ShellWallpaperManager(Context context) {
        this.f12295g = (WallpaperManager) context.getSystemService("wallpaper");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.WALLPAPER_CHANGED");
        C0853a.m10856d().registerReceiver(this, intentFilter);
        m1585d(3);
    }

    /* renamed from: a */
    public C3770e m1616a() {
        return this.f12303o;
    }

    /* renamed from: a */
    public void m1606a(InterfaceC3748a interfaceC3748a) {
        synchronized (this.f12302n) {
            if (!this.f12304p.contains(interfaceC3748a)) {
                this.f12304p.add(interfaceC3748a);
            }
        }
    }

    /* renamed from: b */
    public void m1593b(InterfaceC3748a interfaceC3748a) {
        synchronized (this.f12302n) {
            this.f12304p.remove(interfaceC3748a);
        }
    }

    /* renamed from: b */
    public void m1599b() {
        this.f12303o = new C3770e();
        m1570m();
        if (C3430e.m2516ai()) {
        }
    }

    /* renamed from: c */
    public WallpaperManager m1591c() {
        return this.f12295g;
    }

    /* renamed from: d */
    private static void m1585d(int i) {
        if (i < 2) {
            i = 2;
        } else if (i > 5) {
            i = 5;
        }
        f12292e = i;
        f12291d = 0.05f + ((i / 5.0f) * 0.15f);
    }

    /* renamed from: m */
    private void m1570m() {
        this.f12297i = C0892a.f2555F;
    }

    /* renamed from: d */
    public void m1586d() {
        m1613a(C3430e.m2547Y());
    }

    /* renamed from: a */
    public void m1613a(int i) {
        if (i == f12289a) {
            C2932g m4031n = C3359a.f11094h.m4031n();
            if (m4031n != null && m4031n.m4183r() > 0) {
                m1614a(m1588c(m4031n), true);
                return;
            } else {
                m1614a(0.0f, true);
                return;
            }
        }
        m1614a(0.5f, true);
    }

    /* renamed from: b */
    private float m1594b(C2932g c2932g) {
        return (c2932g.m4183r() - 1) / (C3359a.f11094h.m4035l() - 2);
    }

    /* renamed from: c */
    private float m1588c(C2932g c2932g) {
        return ((c2932g.m4183r() - 1) - c2932g.f9541g) / (C3359a.f11094h.m4035l() - 2);
    }

    /* renamed from: a */
    public static void m1600a(String str) {
        Context context = null;
        try {
            context = C0853a.m10856d().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e) {
        }
        if (context != null) {
            m1609a(context);
        }
    }

    /* renamed from: a */
    public static void m1609a(Context context) {
        ArrayList<Integer> m1230b = C3897k.m1230b(context);
        if (m1230b != null && m1230b.size() > 0 && m1230b.get(0).intValue() != 0) {
            try {
                WallpaperManager.getInstance(context).setResource(m1230b.get(0).intValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (C3359a.f11092f != null) {
                C3359a.f11092f.m1583e();
            }
        }
    }

    /* renamed from: a */
    public void m1607a(C2932g c2932g, boolean z, boolean z2) {
        float m4035l;
        if (c2932g.m4183r() > 0) {
            int m4183r = c2932g.m4183r() - 1;
            float f = z ? 0.0f : c2932g.f9541g;
            if (C3359a.f11094h.m4035l() == 2) {
                m4035l = 0.5f;
            } else {
                m4035l = (m4183r - f) / (C3359a.f11094h.m4035l() - 2);
            }
            if (z2) {
                m1615a(m4035l);
            } else {
                m1597b(m4035l, false);
            }
        }
    }

    /* renamed from: e */
    public boolean m1583e() {
        if (m1581f() == C3430e.m2516ai()) {
            return false;
        }
        Home.m6177b().m6186a(100);
        return true;
    }

    @SuppressLint({"ServiceCast"})
    /* renamed from: a */
    public static boolean m1611a(Activity activity) {
        return ((WallpaperManager) activity.getSystemService("wallpaper")).getWallpaperInfo() != null;
    }

    /* renamed from: f */
    public boolean m1581f() {
        return m1610a(this.f12295g);
    }

    @SuppressLint({"ServiceCast"})
    /* renamed from: a */
    public static boolean m1610a(WallpaperManager wallpaperManager) {
        if (C0853a.m10856d() == null) {
            return false;
        }
        return (wallpaperManager == null ? (WallpaperManager) C0853a.m10856d().getSystemService("wallpaper") : wallpaperManager).getWallpaperInfo() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static BitmapDrawable m1589c(WallpaperManager wallpaperManager) {
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        if (wallpaperInfo != null) {
            wallpaperInfo.getComponent();
            return null;
        }
        try {
            Drawable drawable = wallpaperManager.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                return (BitmapDrawable) drawable;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: g */
    public C0980j m1579g() {
        return this.f12294f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m1597b(float f, boolean z) {
        if (C3430e.m2547Y() == f12289a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.f12300l = f;
            this.f12301m = f;
            if (C3430e.m2516ai()) {
                this.f12295g.setWallpaperOffsets(Home.m6177b().m6164l().getWindowToken(), f, 0.5f);
            } else if (this.f12297i >= this.f12296h) {
                PositionNumber3d position = this.f12294f.position();
                this.f12298j = 0;
                position.f2526x = 0;
            } else {
                float f2 = (this.f12296h - this.f12297i) / 2.0f;
                PositionNumber3d position2 = this.f12294f.position();
                int i = (int) (f2 - ((f2 * 2.0f) * f));
                this.f12298j = i;
                position2.f2526x = i;
            }
        }
    }

    /* renamed from: b */
    private float m1598b(float f) {
        if (this.f12297i >= this.f12296h) {
            return 0.0f;
        }
        float f2 = (this.f12296h - this.f12297i) / 2.0f;
        return (int) (f2 - ((f2 * 2.0f) * f));
    }

    /* renamed from: a */
    public void m1615a(float f) {
        m1614a(f, false);
    }

    /* renamed from: a */
    public void m1614a(float f, boolean z) {
        if (C3430e.m2547Y() == f12289a || z) {
            if (f < 0.0f) {
                f = 0.0f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            this.f12300l = f;
            if (C3430e.m2516ai()) {
                this.f12294f.setAnimationObjectState(true);
                this.f12299k = false;
                this.f12294f.invalidate();
            } else if (this.f12297i >= this.f12296h) {
                this.f12294f.position().f2526x = 0.0f;
                this.f12294f.setAnimationObjectState(false);
            } else {
                float f2 = (this.f12296h - this.f12297i) / 2.0f;
                this.f12299k = false;
                this.f12298j = (int) (f2 - ((f2 * 2.0f) * f));
                this.f12294f.setAnimationObjectState(true);
                this.f12294f.invalidate();
            }
        }
    }

    /* renamed from: h */
    public void m1577h() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.WALLPAPER_CHANGED".equals(intent.getAction())) {
            this.f12293c = true;
        }
    }

    /* renamed from: i */
    public boolean m1575i() {
        return this.f12294f.m1568a() != null;
    }

    /* renamed from: a */
    public void m1608a(C2932g c2932g) {
        if (m1575i()) {
            float m1594b = c2932g.m4181t() == -1 ? 0.0f : m1594b(c2932g);
            float f = this.f12294f.position().f2526x;
            boolean visible = this.f12294f.visible();
            this.f12294f.visible(true);
            if (C3430e.m2547Y() == f12289a) {
                this.f12294f.position().f2526x = c2932g.m4181t() == -1 ? this.f12298j : m1598b(m1594b);
            } else {
                this.f12294f.position().f2526x = 0.0f;
            }
            this.f12294f.drawQuietly();
            this.f12294f.position().f2526x = f;
            this.f12294f.visible(Boolean.valueOf(visible));
        }
    }

    /* renamed from: b */
    public void m1596b(int i) {
        this.f12294f.m1566b(i);
    }

    /* renamed from: j */
    public int m1573j() {
        return C3430e.m2546Z();
    }

    /* renamed from: c */
    public void m1590c(int i) {
        this.f12294f.m1565c(i);
    }

    /* renamed from: k */
    public void m1572k() {
        synchronized (this.f12302n) {
            Iterator<InterfaceC3748a> it = this.f12304p.iterator();
            while (it.hasNext()) {
                it.next().mo1569f();
            }
        }
    }

    /* renamed from: a */
    public void m1612a(int i, int i2, int i3, int i4) {
        m1570m();
        m1597b(this.f12300l, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.manager.wallpaper.ShellWallpaperManager$b */
    /* loaded from: classes.dex */
    public class C3749b extends C0981k {

        /* renamed from: d */
        private TextureElement f12306d;

        /* renamed from: e */
        private Bitmap f12307e;

        /* renamed from: f */
        private float f12308f;

        /* renamed from: g */
        private Color4 f12309g;

        /* renamed from: h */
        private C2471b f12310h;

        /* renamed from: i */
        private int f12311i;

        /* renamed from: j */
        private int f12312j;

        /* renamed from: a */
        public TextureElement m1568a() {
            return this.f12306d;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void alpha(float f) {
            this.f12308f = 255.0f - f;
            this.f12309g.set(255, (int) this.f12308f, (int) this.f12308f, (int) this.f12308f);
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public float alpha() {
            return 255.0f - this.f12308f;
        }

        public C3749b() {
            super(0.0f, 0.0f, 1, 1);
            this.f12308f = 255.0f;
            this.f12309g = new Color4();
            this.f12311i = 100;
            this.f12312j = 100;
            setDefaultColor(this.f12309g);
            this.f12310h = new C2471b();
            m1564d();
        }

        /* renamed from: a */
        public int m1567a(int i) {
            return (int) ((i / 2) * C0892a.f2567c);
        }

        /* renamed from: d */
        public void m1564d() {
            int m1567a = m1567a(C3430e.m2546Z());
            this.f12312j = m1567a;
            this.f12311i = m1567a;
        }

        /* renamed from: b */
        public void m1566b(int i) {
            this.f12312j = m1567a(i);
        }

        /* renamed from: c */
        public void m1565c(int i) {
            this.f12312j = m1567a(i);
            C3430e.m2449k(i);
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            if (ShellWallpaperManager.this.f12293c) {
                m1563e();
                ShellWallpaperManager.this.f12293c = false;
            }
            if (this.f12307e != null) {
                m1561g();
            }
            if (this.f12312j != this.f12311i) {
                this.f12311i = this.f12312j;
                m1562f();
            }
            if (C3430e.m2516ai()) {
                if (!ShellWallpaperManager.this.f12299k) {
                    ShellWallpaperManager.this.f12301m += (ShellWallpaperManager.this.f12300l - ShellWallpaperManager.this.f12301m) * ShellWallpaperManager.f12291d;
                    if (Math.abs(ShellWallpaperManager.this.f12300l - ShellWallpaperManager.this.f12301m) <= 0.002f) {
                        ShellWallpaperManager.this.f12301m = ShellWallpaperManager.this.f12300l;
                        ShellWallpaperManager.this.f12299k = true;
                        ShellWallpaperManager.this.f12294f.setAnimationObjectState(false);
                    }
                    ShellWallpaperManager.this.f12295g.setWallpaperOffsets(Home.m6177b().m6164l().getWindowToken(), ShellWallpaperManager.this.f12301m, 0.5f);
                }
            } else if (ShellWallpaperManager.this.f12297i < ShellWallpaperManager.this.f12296h && !ShellWallpaperManager.this.f12299k) {
                ShellWallpaperManager.this.f12294f.position().f2526x += (ShellWallpaperManager.this.f12298j - ShellWallpaperManager.this.f12294f.position().f2526x) * ShellWallpaperManager.f12291d;
                if (Math.abs(ShellWallpaperManager.this.f12294f.position().f2526x - ShellWallpaperManager.this.f12298j) <= 0.2f) {
                    ShellWallpaperManager.this.f12294f.position().f2526x = ShellWallpaperManager.this.f12298j;
                    ShellWallpaperManager.this.f12299k = true;
                    ShellWallpaperManager.this.f12294f.setAnimationObjectState(false);
                }
            }
        }

        /* renamed from: e */
        private void m1563e() {
            synchronized (ShellWallpaperManager.this.f12302n) {
                System.currentTimeMillis();
                if (this.f12307e != null) {
                    this.f12307e.recycle();
                }
                BitmapDrawable m1589c = ShellWallpaperManager.m1589c(ShellWallpaperManager.this.f12295g);
                System.currentTimeMillis();
                if (m1589c != null) {
                    Bitmap bitmap = m1589c.getBitmap();
                    System.currentTimeMillis();
                    if (!bitmap.isRecycled()) {
                        this.f12307e = C4181q.m637b(bitmap, C0892a.f2561L, C0892a.f2562M);
                        this.f12307e = C4181q.m645a(this.f12307e);
                        System.currentTimeMillis();
                        if (C0853a.m10855e() != null) {
                            C0853a.m10855e().m10760j();
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        private void m1562f() {
            if (this.f12306d.f2529id != 0) {
                if (this.f12311i == 0) {
                    this.f12310h.m5502a();
                    textures().removeAll();
                    textures().addElement(this.f12306d);
                    return;
                }
                this.f12310h.m5501a(this.f12306d, this.f12311i);
                textures().removeAll();
                textures().addElement(this.f12310h.f8118a);
            }
        }

        /* renamed from: g */
        private void m1561g() {
            synchronized (ShellWallpaperManager.this.f12302n) {
                System.currentTimeMillis();
                int width = this.f12307e.getWidth();
                int height = this.f12307e.getHeight();
                if (this.f12307e != null && !this.f12307e.isRecycled()) {
                    if (this.f12306d == null) {
                        this.f12306d = C0853a.m10853g().m10544a(this.f12307e, false);
                    } else {
                        C0853a.m10853g().m10543a(this.f12306d);
                        this.f12306d = C0853a.m10853g().m10544a(this.f12307e, false);
                    }
                    System.currentTimeMillis();
                    mo10368a(width);
                    mo5215b(height);
                    ShellWallpaperManager.this.f12296h = width;
                    this.f12307e.recycle();
                    m1562f();
                    ShellWallpaperManager.this.m1597b(ShellWallpaperManager.this.f12300l, false);
                    C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.manager.wallpaper.ShellWallpaperManager.b.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ShellWallpaperManager.this.m1572k();
                        }
                    });
                }
                this.f12307e = null;
            }
        }
    }
}
