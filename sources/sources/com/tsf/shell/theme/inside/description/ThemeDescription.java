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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
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

    public static Bitmap getPreviewBitmap(Context context, String str, boolean z) throws Throwable {
        InputStream inputStreamOpenRawResource;
        Throwable th;
        Bitmap bitmapDecodeStream = null;
        if (z) {
            return ThemeCacheFileManager.getImageBitmap(str + ".png");
        }
        InputStream inputStream = null;
        if (0 == 0) {
            try {
                int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
                if (identifier == 0) {
                    try {
                        inputStream.close();
                        return null;
                    } catch (Exception e) {
                        return null;
                    }
                }
                inputStreamOpenRawResource = context.getResources().openRawResource(identifier);
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenRawResource);
                    Bitmap bitmapCopy = bitmapDecodeStream.copy(Bitmap.Config.ARGB_8888, true);
                    bitmapDecodeStream.recycle();
                    bitmapDecodeStream = bitmapCopy;
                } catch (Exception e2) {
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Exception e3) {
                    }
                    throw th;
                }
            } catch (Exception e4) {
                inputStreamOpenRawResource = null;
            } catch (Throwable th3) {
                inputStreamOpenRawResource = null;
                th = th3;
            }
            try {
                inputStreamOpenRawResource.close();
                return bitmapDecodeStream;
            } catch (Exception e5) {
                return bitmapDecodeStream;
            }
        }
        inputStreamOpenRawResource = null;
        try {
            inputStreamOpenRawResource.close();
            return bitmapDecodeStream;
        } catch (Exception e6) {
            return bitmapDecodeStream;
        }
    }

    public Bitmap getBitmapFromCache(String str, int i, int i2) {
        Bitmap bitmapD;
        if (i == 0 || i2 == 0 || (bitmapD = q.d(ThemeCacheFileManager.getImageBitmap(str + ".png"), i, i2)) == null) {
            return null;
        }
        Bitmap bitmapCopy = bitmapD.copy(Bitmap.Config.ARGB_8888, true);
        bitmapD.recycle();
        return bitmapCopy;
    }

    public Bitmap getBitmap(String str, int i, int i2) {
        return q.d(getBitmap(str), i, i2);
    }

    public Bitmap getBitmap(String str) throws Throwable {
        Bitmap imageBitmap = ThemeCacheFileManager.getImageBitmap(str + ".png");
        if (imageBitmap == null) {
            ThemeElementCacher.cacheImageFile(this.mContext, str);
            return getBitmap(str);
        }
        Bitmap bitmapCopy = imageBitmap.copy(Bitmap.Config.ARGB_8888, true);
        imageBitmap.recycle();
        return bitmapCopy;
    }
}
