package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.p184a.C3561a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4181q;
/* loaded from: classes.dex */
public class ThemeUnreadCountManager extends ThemeMixElementManager {
    public ThemeUnreadCountManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(C0853a.m10856d(), getTheme().getContext(), i, i2, true);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        C3519a.m2154a();
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return C4181q.m635d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.UNREAD_COUNT_BG, z));
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = null;
        if (bitmap == null) {
            return null;
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * C0892a.f2566b), (int) (bitmap.getHeight() * C0892a.f2566b), true);
            if (bitmap != createScaledBitmap) {
                bitmap.recycle();
            }
            C3561a c3561a = new C3561a();
            c3561a.m1989h(36);
            c3561a.m1988i(-1);
            Bitmap m1998b = c3561a.m1998b(Integer.toString((int) (10.0d + (Math.random() * 200.0d))));
            int width = m1998b.getWidth();
            Bitmap m634e = ((float) width) + (C0892a.f2566b * 28.0f) > ((float) createScaledBitmap.getWidth()) ? C4181q.m634e(createScaledBitmap, createScaledBitmap.getWidth() / 2, width + ((int) (C0892a.f2566b * 28.0f))) : createScaledBitmap;
            int width2 = m634e.getWidth() > m634e.getHeight() ? m634e.getWidth() : m634e.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width2, width2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            float width3 = (width2 - m634e.getWidth()) / 2;
            float height = (width2 - m634e.getHeight()) / 2;
            canvas.drawBitmap(m634e, width3, height, (Paint) null);
            m634e.recycle();
            canvas.drawBitmap(m1998b, width3 + (((m634e.getWidth() - m1998b.getWidth()) / 2) - 1), height + (((m634e.getHeight() - m1998b.getHeight()) / 2) - 4), (Paint) null);
            m1998b.recycle();
            bitmap2 = createBitmap;
            return bitmap2;
        } catch (Exception e) {
            return bitmap2;
        }
    }
}
