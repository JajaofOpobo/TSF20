package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.censivn.C3DEngine.C0853a;
import com.tsf.C1306b;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.theme.inside.element.ThemeElementCacher;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.C4179o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ThemeCacheFileManager {
    public static final String FILE_NAME_DESCRIPTION_CLOCK = "theme_clock";
    public static final String FILE_NAME_DESCRIPTION_ELEMENT = "theme_element";
    public static final String FILE_NAME_DESCRIPTION_FOLDER2 = "theme_folder";
    private static final String THEME_CONTACT_FOLDER = "theme/contact";
    private static final String THEME_FILE_DESCRIPTION_CLOCK = "theme/theme_clock.xml";
    private static final String THEME_FILE_DESCRIPTION_ELEMENT = "theme/theme_element.xml";
    private static final String THEME_FILE_DESCRIPTION_FOLDER = "theme/theme_folder.xml";
    private static final String THEME_ICON_CACHE_FOLDER = "theme/icon_cache";
    private static final String THEME_IMAGE_FOLDER = "theme/images";
    private static final String THEME_ROOT_FOLDER = "theme";
    private static File contactFolder;
    private static File descriptionClockFile;
    private static File descriptionElementFile;
    private static File descriptionFolderFile;
    private static File iconCacheFolder;
    private static File imagesFolder;
    private static boolean isInit = false;
    private static File rootFolder;
    private Context mContext;

    public ThemeCacheFileManager(Context context) {
        this.mContext = context;
    }

    public void init() {
        File cacheDir = this.mContext.getCacheDir();
        rootFolder = C4179o.m656c(cacheDir, THEME_ROOT_FOLDER);
        boolean z = !C4179o.m657b(cacheDir, THEME_IMAGE_FOLDER);
        imagesFolder = C4179o.m656c(cacheDir, THEME_IMAGE_FOLDER);
        contactFolder = C4179o.m656c(cacheDir, THEME_CONTACT_FOLDER);
        iconCacheFolder = C4179o.m656c(cacheDir, THEME_ICON_CACHE_FOLDER);
        descriptionElementFile = C4179o.m662a(cacheDir, THEME_FILE_DESCRIPTION_ELEMENT);
        descriptionFolderFile = C4179o.m662a(cacheDir, THEME_FILE_DESCRIPTION_FOLDER);
        descriptionClockFile = C4179o.m662a(cacheDir, THEME_FILE_DESCRIPTION_CLOCK);
        if (!descriptionElementFile.exists()) {
            C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_element), descriptionElementFile);
        }
        if (!descriptionFolderFile.exists()) {
            C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_folder), descriptionFolderFile);
        }
        if (!descriptionClockFile.exists()) {
            C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_clock), descriptionClockFile);
        }
        if (z) {
            ThemeElementCacher.cacheThemeImage(C0853a.m10856d(), ThemeElementType.PARSER_CONFIG_ALL);
        }
        isInit = true;
    }

    public static boolean isInit() {
        return isInit;
    }

    public File getFileDescriptionElement() {
        return descriptionElementFile;
    }

    public static void cacheIconCacheFile(Bitmap bitmap, String str) {
        if (!iconCacheFolder.exists()) {
            iconCacheFolder.mkdirs();
        }
        File m662a = C4179o.m662a(iconCacheFolder, str + ".png");
        Log.w("ddddddd", "ddddddd cacheIconCacheFile:" + bitmap + "   " + m662a);
        C4179o.m659b(bitmap, m662a);
    }

    public static Bitmap getIconCacheFile(String str) {
        return getBitmap(iconCacheFolder, str + ".png");
    }

    public static void cacheImageFile(InputStream inputStream, String str) {
        if (!imagesFolder.exists()) {
            imagesFolder.mkdirs();
        }
        C4179o.m661a(inputStream, C4179o.m662a(imagesFolder, str + ".png"));
    }

    public static void cacheXmlFile(InputStream inputStream, String str) {
        if (!rootFolder.exists()) {
            rootFolder.mkdirs();
        }
        C4179o.m661a(inputStream, C4179o.m662a(rootFolder, str + ".xml"));
    }

    public static void cacheContactFile(Bitmap bitmap, String str) {
        if (!contactFolder.exists()) {
            contactFolder.mkdirs();
        }
        C4179o.m665a(bitmap, C4179o.m662a(contactFolder, str + ".png"));
    }

    public void reset() {
        ThemeConfigManager.reset();
        resetImageFolder();
        C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_element), descriptionElementFile);
        C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_folder), descriptionFolderFile);
        C4179o.m661a(this.mContext.getResources().openRawResource(C1306b.C1314h.theme_clock), descriptionClockFile);
    }

    private static void resetImageFolder() {
        C4179o.m664a(imagesFolder);
    }

    public static void resetIconCacheFolder() {
        C4179o.m664a(iconCacheFolder);
    }

    private static void resetContactFolder() {
        C4179o.m658b(contactFolder);
    }

    public InputStream getCacheElementXMLInputStream() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(descriptionElementFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            return this.mContext.getResources().openRawResource(C1306b.C1314h.theme_element);
        }
        return fileInputStream;
    }

    public InputStream getCacheFolderXMLInputStream() {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(descriptionFolderFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fileInputStream = null;
        }
        if (fileInputStream == null) {
            return this.mContext.getResources().openRawResource(C1306b.C1314h.theme_folder);
        }
        return fileInputStream;
    }

    public static Bitmap getImageBitmap(String str) {
        return getBitmap(imagesFolder, str);
    }

    private static Bitmap getBitmap(File file, String str) {
        FileInputStream fileInputStream;
        Throwable th;
        Bitmap bitmap = null;
        File m662a = C4179o.m662a(file, str);
        if (m662a.exists()) {
            try {
                fileInputStream = new FileInputStream(m662a);
            } catch (Exception e) {
                fileInputStream = null;
            } catch (Throwable th2) {
                fileInputStream = null;
                th = th2;
            }
            try {
                bitmap = BitmapFactory.decodeStream(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                }
            } catch (Exception e3) {
                try {
                    fileInputStream.close();
                } catch (Exception e4) {
                }
                return bitmap;
            } catch (Throwable th3) {
                th = th3;
                try {
                    fileInputStream.close();
                } catch (Exception e5) {
                }
                throw th;
            }
        }
        return bitmap;
    }

    public static Bitmap getIconBitmap(String str, C3560a c3560a) {
        Bitmap createScaledBitmap;
        Bitmap imageBitmap = getImageBitmap(str);
        if (imageBitmap == null) {
            return null;
        }
        if (imageBitmap.getWidth() == c3560a.f11750H && imageBitmap.getHeight() == c3560a.f11751I) {
            createScaledBitmap = imageBitmap.copy(Bitmap.Config.ARGB_8888, false);
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(imageBitmap, c3560a.f11750H, c3560a.f11751I, true);
        }
        if (imageBitmap != createScaledBitmap) {
            imageBitmap.recycle();
            return createScaledBitmap;
        }
        return createScaledBitmap;
    }
}
