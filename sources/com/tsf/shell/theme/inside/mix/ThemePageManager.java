package com.tsf.shell.theme.inside.mix;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.ThemeMixElementManager;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4181q;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemePageManager extends ThemeMixElementManager {
    public ThemePageManager(ThemeManager themeManager, int i, String str) {
        super(themeManager, i, str);
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public void onReloadTheme() {
        C3359a.f11094h.m4051e();
    }

    @Override // com.tsf.shell.theme.inside.ThemeMixElementManager
    public Bitmap getPreviewBitmap(int i, int i2) {
        return createPreviewBitmap(C0853a.m10856d(), getTheme().getContext(), i, i2, true);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, int i, int i2, boolean z) {
        return C4181q.m635d(createPreviewBitmap(context, context2, z), i, i2);
    }

    public static Bitmap createPreviewBitmap(Context context, Context context2, boolean z) {
        return createPreviewBitmap(ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PAGE_PREVIEW_UNSELECT, z), ThemeDescription.getPreviewBitmap(context2, ThemeShellDescription.PAGE_PREVIEW_SELECT, z));
    }

    public static Bitmap createPreviewBitmap(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(82, 82, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Bitmap m609a = C4189x.m609a(C1306b.C1310d.theme_mix_desktop_thumb);
        Bitmap createPreviewBitmap = createPreviewBitmap(bitmap);
        canvas.drawBitmap(createPreviewBitmap, 22.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(m609a, 35.0f, 13.0f, (Paint) null);
        createPreviewBitmap.recycle();
        Bitmap createPreviewBitmap2 = createPreviewBitmap(bitmap2);
        canvas.drawBitmap(createPreviewBitmap2, 0.0f, 0.0f, (Paint) null);
        canvas.drawBitmap(m609a, 13.0f, 13.0f, (Paint) null);
        createPreviewBitmap2.recycle();
        m609a.recycle();
        return createBitmap;
    }

    private static Bitmap createPreviewBitmap(Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 40, 40, true);
        bitmap.recycle();
        Bitmap m643a = C4181q.m643a(createScaledBitmap, 20, 20, 60, 82);
        createScaledBitmap.recycle();
        return m643a;
    }
}
