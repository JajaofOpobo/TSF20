package com.tsf.shell.manager.p187r.p193c;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.manager.p166a.C3377f;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4180p;
import com.tsf.shell.utils.C4181q;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.tsf.shell.manager.r.c.a */
/* loaded from: classes.dex */
public class C3695a {

    /* renamed from: a */
    private static PackageManager f12188a;

    /* renamed from: b */
    private static float[] f12189b = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    /* renamed from: a */
    public static Bitmap m1690a(LauncherShortcut3DInfo launcherShortcut3DInfo, C3560a c3560a, C3377f c3377f) {
        boolean z;
        Bitmap iconFilterBitmap;
        boolean z2;
        float[] fArr;
        Bitmap bitmap;
        String str;
        Bitmap defaultIconUponBitmap;
        if (f12188a == null) {
            f12188a = C0853a.m10856d().getPackageManager();
        }
        float defaultIconScale = ThemeManager.mix.icon.getDefaultIconScale();
        Bitmap m2022a = c3560a.m2022a();
        Canvas canvas = new Canvas(m2022a);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (launcherShortcut3DInfo == null || launcherShortcut3DInfo.iconType == 0) {
            z = false;
            iconFilterBitmap = ThemeManager.mix.icon.getIconFilterBitmap(c3377f.f11169b.toString(), c3560a);
        } else {
            z = true;
            iconFilterBitmap = launcherShortcut3DInfo.getIcon(false, c3560a);
        }
        if (iconFilterBitmap != null) {
            z2 = true;
            c3560a.m2015a(canvas, iconFilterBitmap, true);
        } else {
            Bitmap defaultIconBackBitmap = ThemeManager.mix.icon.getDefaultIconBackBitmap(c3560a);
            if (defaultIconBackBitmap != null) {
                c3560a.m2015a(canvas, defaultIconBackBitmap, false);
            } else {
                defaultIconScale = 1.0f;
            }
            try {
                Bitmap m2695g = c3377f.m2695g();
                if (!ThemeManager.mix.icon.polyEffectEnable()) {
                    fArr = null;
                } else {
                    float[] polyEffectParam = ThemeManager.mix.icon.getPolyEffectParam();
                    float[] fArr2 = f12189b;
                    fArr2[0] = (c3560a.f11750H * polyEffectParam[0]) + c3560a.f11746D;
                    fArr2[1] = (c3560a.f11751I * polyEffectParam[1]) + c3560a.f11747E;
                    fArr2[2] = (c3560a.f11750H * polyEffectParam[2]) + c3560a.f11746D;
                    fArr2[3] = (c3560a.f11751I * polyEffectParam[3]) + c3560a.f11747E;
                    fArr2[4] = (c3560a.f11750H * polyEffectParam[4]) + c3560a.f11746D;
                    fArr2[5] = (c3560a.f11751I * polyEffectParam[5]) + c3560a.f11747E;
                    fArr2[6] = (c3560a.f11750H * polyEffectParam[6]) + c3560a.f11746D;
                    fArr2[7] = (polyEffectParam[7] * c3560a.f11751I) + c3560a.f11747E;
                    fArr = fArr2;
                }
                if (m2695g != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m2695g, (int) (c3560a.f11750H * defaultIconScale), (int) (defaultIconScale * c3560a.f11751I), true);
                    if (createScaledBitmap != m2695g) {
                        m2695g.recycle();
                        bitmap = createScaledBitmap;
                    } else {
                        Bitmap copy = m2695g.copy(Bitmap.Config.ARGB_8888, true);
                        m2695g.recycle();
                        bitmap = copy;
                    }
                    Paint paint = null;
                    if (ThemeManager.mix.icon.isColorize()) {
                        paint = new Paint();
                        paint.setColorFilter(C4180p.m653a(ThemeManager.mix.icon.colorize()));
                    }
                    if (fArr != null) {
                        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                        C4181q.m640a(canvas, bitmap, fArr, paint);
                        bitmap.recycle();
                    } else {
                        Bitmap defaultIconMaskBitmap = ThemeManager.mix.icon.getDefaultIconMaskBitmap(c3560a);
                        Canvas canvas2 = new Canvas(bitmap);
                        if (defaultIconMaskBitmap != null) {
                            C4181q.m641a(canvas2, defaultIconMaskBitmap, (bitmap.getWidth() - defaultIconMaskBitmap.getWidth()) / 2, (bitmap.getHeight() - defaultIconMaskBitmap.getHeight()) / 2);
                        }
                        c3560a.m2016a(canvas, bitmap, paint);
                    }
                }
                z2 = z;
            } catch (Exception e) {
                e.printStackTrace();
                z2 = z;
            }
        }
        if (!z2 && (defaultIconUponBitmap = ThemeManager.mix.icon.getDefaultIconUponBitmap(c3560a)) != null) {
            c3560a.m2015a(canvas, defaultIconUponBitmap, false);
        }
        if (launcherShortcut3DInfo != null && launcherShortcut3DInfo.titleType == 1) {
            str = launcherShortcut3DInfo.title;
        } else {
            str = c3377f.f11172e == null ? "" : c3377f.f11172e.toString();
        }
        Bitmap m2011a = c3560a.m2011a(str);
        if (m2011a != null) {
            c3560a.m2009b(canvas, m2011a, true);
        }
        if (c3377f.m2694h() != 0) {
            C3561a c3561a = new C3561a();
            c3561a.m1989h(36);
            c3561a.m1988i(-1);
            c3561a.m1993d(true);
            Bitmap m1998b = c3561a.m1998b(Integer.toString(c3377f.m2694h()));
            Bitmap bitmap2 = ThemeManager.mix.unreadCount.getTheme().getBitmap(ThemeShellDescription.UNREAD_COUNT_BG, C3489a.f11531r, C3489a.f11531r);
            int width = m1998b.getWidth();
            if (width + (28.0f * C0892a.f2566b) > bitmap2.getWidth()) {
                bitmap2 = C4181q.m634e(bitmap2, bitmap2.getWidth() / 2, width + ((int) (28.0f * C0892a.f2566b)));
            }
            new Canvas(bitmap2).drawBitmap(m1998b, ((bitmap2.getWidth() - m1998b.getWidth()) / 2) - 1, ((bitmap2.getHeight() - m1998b.getHeight()) / 2) - 4, (Paint) null);
            m1998b.recycle();
            canvas.drawBitmap(bitmap2, (c3560a.f11764V - bitmap2.getWidth()) - 1, 1.0f, (Paint) null);
            bitmap2.recycle();
        }
        AbstractC3208b.m3171a(m2022a);
        return m2022a;
    }

    /* renamed from: a */
    public static Bitmap m1692a(ResolveInfo resolveInfo, C3560a c3560a) {
        Bitmap m1694a;
        if (resolveInfo == null) {
            m1694a = m1695a();
        } else {
            m1694a = m1694a(resolveInfo.activityInfo);
        }
        return C4181q.m635d(m1694a, c3560a.f11750H, c3560a.f11751I);
    }

    /* renamed from: a */
    public static Bitmap m1693a(ResolveInfo resolveInfo) {
        return resolveInfo == null ? m1695a() : m1694a(resolveInfo.activityInfo);
    }

    /* renamed from: a */
    public static Bitmap m1694a(ActivityInfo activityInfo) {
        Resources resources;
        int iconResource;
        try {
            resources = f12188a.getResourcesForApplication(activityInfo.applicationInfo);
        } catch (Exception e) {
            resources = null;
        }
        if (resources != null && (iconResource = activityInfo.getIconResource()) != 0) {
            return m1691a(resources, iconResource);
        }
        return m1695a();
    }

    /* renamed from: a */
    public static Bitmap m1695a() {
        return m1691a(Home.m6177b().getResources(), C1306b.C1310d.sym_def_app_icon);
    }

    /* renamed from: a */
    public static Bitmap m1691a(Resources resources, int i) {
        Bitmap bitmap = null;
        try {
            InputStream openRawResource = resources.openRawResource(i);
            try {
                bitmap = BitmapFactory.decodeStream(openRawResource);
            } catch (Exception e) {
            }
            try {
                openRawResource.close();
            } catch (IOException e2) {
            }
        } catch (Exception e3) {
        }
        return bitmap != null ? bitmap : m1695a();
    }
}
