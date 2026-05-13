package com.tsf.shell.manager.r.c;

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
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.p;
import com.tsf.shell.utils.q;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class a {
    private static PackageManager a;
    private static float[] b = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};

    public static Bitmap a(LauncherShortcut3DInfo launcherShortcut3DInfo, com.tsf.shell.manager.o.a aVar, com.tsf.shell.manager.a.f fVar) {
        boolean z;
        Bitmap iconFilterBitmap;
        boolean z2;
        float[] fArr;
        Bitmap bitmap;
        String str;
        Bitmap defaultIconUponBitmap;
        if (a == null) {
            a = com.censivn.C3DEngine.a.d().getPackageManager();
        }
        float defaultIconScale = ThemeManager.mix.icon.getDefaultIconScale();
        Bitmap a2 = aVar.a();
        Canvas canvas = new Canvas(a2);
        canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (launcherShortcut3DInfo == null || launcherShortcut3DInfo.iconType == 0) {
            z = false;
            iconFilterBitmap = ThemeManager.mix.icon.getIconFilterBitmap(fVar.b.toString(), aVar);
        } else {
            z = true;
            iconFilterBitmap = launcherShortcut3DInfo.getIcon(false, aVar);
        }
        if (iconFilterBitmap != null) {
            z2 = true;
            aVar.a(canvas, iconFilterBitmap, true);
        } else {
            Bitmap defaultIconBackBitmap = ThemeManager.mix.icon.getDefaultIconBackBitmap(aVar);
            if (defaultIconBackBitmap != null) {
                aVar.a(canvas, defaultIconBackBitmap, false);
            } else {
                defaultIconScale = 1.0f;
            }
            try {
                Bitmap g = fVar.g();
                if (!ThemeManager.mix.icon.polyEffectEnable()) {
                    fArr = null;
                } else {
                    float[] polyEffectParam = ThemeManager.mix.icon.getPolyEffectParam();
                    float[] fArr2 = b;
                    fArr2[0] = (aVar.H * polyEffectParam[0]) + aVar.D;
                    fArr2[1] = (aVar.I * polyEffectParam[1]) + aVar.E;
                    fArr2[2] = (aVar.H * polyEffectParam[2]) + aVar.D;
                    fArr2[3] = (aVar.I * polyEffectParam[3]) + aVar.E;
                    fArr2[4] = (aVar.H * polyEffectParam[4]) + aVar.D;
                    fArr2[5] = (aVar.I * polyEffectParam[5]) + aVar.E;
                    fArr2[6] = (aVar.H * polyEffectParam[6]) + aVar.D;
                    fArr2[7] = (polyEffectParam[7] * aVar.I) + aVar.E;
                    fArr = fArr2;
                }
                if (g != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(g, (int) (aVar.H * defaultIconScale), (int) (defaultIconScale * aVar.I), true);
                    if (createScaledBitmap != g) {
                        g.recycle();
                        bitmap = createScaledBitmap;
                    } else {
                        Bitmap copy = g.copy(Bitmap.Config.ARGB_8888, true);
                        g.recycle();
                        bitmap = copy;
                    }
                    Paint paint = null;
                    if (ThemeManager.mix.icon.isColorize()) {
                        paint = new Paint();
                        paint.setColorFilter(p.a(ThemeManager.mix.icon.colorize()));
                    }
                    if (fArr != null) {
                        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
                        q.a(canvas, bitmap, fArr, paint);
                        bitmap.recycle();
                    } else {
                        Bitmap defaultIconMaskBitmap = ThemeManager.mix.icon.getDefaultIconMaskBitmap(aVar);
                        Canvas canvas2 = new Canvas(bitmap);
                        if (defaultIconMaskBitmap != null) {
                            q.a(canvas2, defaultIconMaskBitmap, (bitmap.getWidth() - defaultIconMaskBitmap.getWidth()) / 2, (bitmap.getHeight() - defaultIconMaskBitmap.getHeight()) / 2);
                        }
                        aVar.a(canvas, bitmap, paint);
                    }
                }
                z2 = z;
            } catch (Exception e) {
                e.printStackTrace();
                z2 = z;
            }
        }
        if (!z2 && (defaultIconUponBitmap = ThemeManager.mix.icon.getDefaultIconUponBitmap(aVar)) != null) {
            aVar.a(canvas, defaultIconUponBitmap, false);
        }
        if (launcherShortcut3DInfo != null && launcherShortcut3DInfo.titleType == 1) {
            str = launcherShortcut3DInfo.title;
        } else {
            str = fVar.e == null ? "" : fVar.e.toString();
        }
        Bitmap a3 = aVar.a(str);
        if (a3 != null) {
            aVar.b(canvas, a3, true);
        }
        if (fVar.h() != 0) {
            com.tsf.shell.manager.o.a.a aVar2 = new com.tsf.shell.manager.o.a.a();
            aVar2.h(36);
            aVar2.i(-1);
            aVar2.d(true);
            Bitmap b2 = aVar2.b(Integer.toString(fVar.h()));
            Bitmap bitmap2 = ThemeManager.mix.unreadCount.getTheme().getBitmap(ThemeShellDescription.UNREAD_COUNT_BG, com.tsf.shell.manager.g.a.r, com.tsf.shell.manager.g.a.r);
            int width = b2.getWidth();
            if (width + (28.0f * com.censivn.C3DEngine.b.b.a.b) > bitmap2.getWidth()) {
                bitmap2 = q.e(bitmap2, bitmap2.getWidth() / 2, width + ((int) (28.0f * com.censivn.C3DEngine.b.b.a.b)));
            }
            new Canvas(bitmap2).drawBitmap(b2, ((bitmap2.getWidth() - b2.getWidth()) / 2) - 1, ((bitmap2.getHeight() - b2.getHeight()) / 2) - 4, (Paint) null);
            b2.recycle();
            canvas.drawBitmap(bitmap2, (aVar.V - bitmap2.getWidth()) - 1, 1.0f, (Paint) null);
            bitmap2.recycle();
        }
        com.tsf.shell.f.i.b.e.b.a(a2);
        return a2;
    }

    public static Bitmap a(ResolveInfo resolveInfo, com.tsf.shell.manager.o.a aVar) {
        Bitmap a2;
        if (resolveInfo == null) {
            a2 = a();
        } else {
            a2 = a(resolveInfo.activityInfo);
        }
        return q.d(a2, aVar.H, aVar.I);
    }

    public static Bitmap a(ResolveInfo resolveInfo) {
        return resolveInfo == null ? a() : a(resolveInfo.activityInfo);
    }

    public static Bitmap a(ActivityInfo activityInfo) {
        Resources resources;
        int iconResource;
        try {
            resources = a.getResourcesForApplication(activityInfo.applicationInfo);
        } catch (Exception e) {
            resources = null;
        }
        if (resources != null && (iconResource = activityInfo.getIconResource()) != 0) {
            return a(resources, iconResource);
        }
        return a();
    }

    public static Bitmap a() {
        return a(Home.b().getResources(), b.d.sym_def_app_icon);
    }

    public static Bitmap a(Resources resources, int i) {
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
        return bitmap != null ? bitmap : a();
    }
}
