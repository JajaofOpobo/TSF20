package com.tsf.shell.theme.inside.description;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.censivn.C3DEngine.a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.theme.inside.ThemeCacheFileManager;
import com.tsf.shell.theme.inside.element.ThemeElementCacher;
import com.tsf.shell.theme.inside.mix.menu.item.ThemeMixerUtils;
import com.tsf.shell.utils.q;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ThemeDescription {
    public ThemeFolderDescription folder;
    private TextureElement iconTexture;
    private Context mContext;
    public String packagename;
    public int parserStatus = 0;
    public ThemeShellDescription shell;
    public String themeName;
    public int versionCode;
    public String versionName;

    public void parserElement(int i) {
        this.parserStatus |= i;
    }

    public boolean isParserElement(int i) {
        return (this.parserStatus & i) == i;
    }

    public int parserStatus() {
        return this.parserStatus;
    }

    public ThemeDescription(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public TextureElement getIconTexture() {
        if (this.iconTexture == null) {
            this.iconTexture = ThemeMixerUtils.createIconTexture(this.themeName.toString(), this.packagename);
        }
        return this.iconTexture;
    }

    public void relecyIconTexture() {
        if (this.iconTexture != null) {
            a.g().a(this.iconTexture);
            this.iconTexture = null;
        }
    }

    public void destroy() {
        if (this.folder != null) {
            this.folder.destroy();
        }
        relecyIconTexture();
        this.mContext = null;
        this.folder = null;
        this.shell = null;
    }

    public static Bitmap getPreviewBitmap(Context context, String str, boolean z) {
        InputStream inputStream;
        Throwable th;
        Bitmap bitmap = null;
        if (z) {
            return ThemeCacheFileManager.getImageBitmap(str + ".png");
        }
        InputStream inputStream2 = null;
        if (0 == 0) {
            try {
                int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
                if (identifier == 0) {
                    try {
                        inputStream2.close();
                        return null;
                    } catch (Exception e) {
                        return null;
                    }
                }
                inputStream = context.getResources().openRawResource(identifier);
                try {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    bitmap.recycle();
                    bitmap = copy;
                } catch (Exception e2) {
                    try {
                        inputStream.close();
                        return bitmap;
                    } catch (Exception e3) {
                        return bitmap;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (Exception e4) {
                    }
                    throw th;
                }
            } catch (Exception e5) {
                inputStream = null;
            } catch (Throwable th3) {
                inputStream = null;
                th = th3;
            }
        } else {
            inputStream = null;
        }
        try {
            inputStream.close();
            return bitmap;
        } catch (Exception e6) {
            return bitmap;
        }
    }

    public Bitmap getBitmapFromCache(String str, int i, int i2) {
        Bitmap d;
        if (i == 0 || i2 == 0 || (d = q.d(ThemeCacheFileManager.getImageBitmap(str + ".png"), i, i2)) == null) {
            return null;
        }
        Bitmap copy = d.copy(Bitmap.Config.ARGB_8888, true);
        d.recycle();
        return copy;
    }

    public Bitmap getBitmap(String str, int i, int i2) {
        return q.d(getBitmap(str), i, i2);
    }

    public Bitmap getBitmap(String str) {
        Bitmap imageBitmap = ThemeCacheFileManager.getImageBitmap(str + ".png");
        if (imageBitmap == null) {
            ThemeElementCacher.cacheImageFile(this.mContext, str);
            return getBitmap(str);
        }
        Bitmap copy = imageBitmap.copy(Bitmap.Config.ARGB_8888, true);
        imageBitmap.recycle();
        return copy;
    }
}
