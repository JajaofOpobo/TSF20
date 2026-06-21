package com.tsf.shell.theme.inside;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.censivn.C3DEngine.a;
import com.tsf.shell.R;
import com.tsf.shell.theme.inside.element.ThemeElementCacher;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.utils.p;
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
        rootFolder = p.c(cacheDir, THEME_ROOT_FOLDER);
        boolean z = !p.b(cacheDir, THEME_IMAGE_FOLDER);
        imagesFolder = p.c(cacheDir, THEME_IMAGE_FOLDER);
        contactFolder = p.c(cacheDir, THEME_CONTACT_FOLDER);
        iconCacheFolder = p.c(cacheDir, THEME_ICON_CACHE_FOLDER);
        descriptionElementFile = p.a(cacheDir, THEME_FILE_DESCRIPTION_ELEMENT);
        descriptionFolderFile = p.a(cacheDir, THEME_FILE_DESCRIPTION_FOLDER);
        descriptionClockFile = p.a(cacheDir, THEME_FILE_DESCRIPTION_CLOCK);
        if (!descriptionElementFile.exists()) {
            p.a(this.mContext.getResources().openRawResource(R.raw.theme_element), descriptionElementFile);
        }
        if (!descriptionFolderFile.exists()) {
            p.a(this.mContext.getResources().openRawResource(R.raw.theme_folder), descriptionFolderFile);
        }
        if (!descriptionClockFile.exists()) {
            p.a(this.mContext.getResources().openRawResource(R.raw.theme_clock), descriptionClockFile);
        }
        if (z) {
            ThemeElementCacher.cacheThemeImage(a.d(), ThemeElementType.PARSER_CONFIG_ALL);
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
        File a = p.a(iconCacheFolder, String.valueOf(str) + ".png");
        Log.w("ddddddd", "ddddddd cacheIconCacheFile:" + bitmap + "   " + a);
        p.b(bitmap, a);
    }

    public static Bitmap getIconCacheFile(String str) {
        return getBitmap(iconCacheFolder, String.valueOf(str) + ".png");
    }

    public static void cacheImageFile(InputStream inputStream, String str) {
        if (!imagesFolder.exists()) {
            imagesFolder.mkdirs();
        }
        p.a(inputStream, p.a(imagesFolder, String.valueOf(str) + ".png"));
    }

    public static void cacheXmlFile(InputStream inputStream, String str) {
        if (!rootFolder.exists()) {
            rootFolder.mkdirs();
        }
        p.a(inputStream, p.a(rootFolder, String.valueOf(str) + ".xml"));
    }

    public static void cacheContactFile(Bitmap bitmap, String str) {
        if (!contactFolder.exists()) {
            contactFolder.mkdirs();
        }
        p.a(bitmap, p.a(contactFolder, String.valueOf(str) + ".png"));
    }

    public void reset() {
        ThemeConfigManager.reset();
        resetImageFolder();
        p.a(this.mContext.getResources().openRawResource(R.raw.theme_element), descriptionElementFile);
        p.a(this.mContext.getResources().openRawResource(R.raw.theme_folder), descriptionFolderFile);
        p.a(this.mContext.getResources().openRawResource(R.raw.theme_clock), descriptionClockFile);
    }

    private static void resetImageFolder() {
        p.a(imagesFolder);
    }

    public static void resetIconCacheFolder() {
        p.a(iconCacheFolder);
    }

    private static void resetContactFolder() {
        p.b(contactFolder);
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
            return this.mContext.getResources().openRawResource(R.raw.theme_element);
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
            return this.mContext.getResources().openRawResource(R.raw.theme_folder);
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
        File a = p.a(file, str);
        if (a.exists()) {
            try {
                fileInputStream = new FileInputStream(a);
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

    public static Bitmap getIconBitmap(String str, com.tsf.shell.manager.o.a aVar) {
        Bitmap createScaledBitmap;
        Bitmap imageBitmap = getImageBitmap(str);
        if (imageBitmap == null) {
            return null;
        }
        if (imageBitmap.getWidth() == aVar.H && imageBitmap.getHeight() == aVar.I) {
            createScaledBitmap = imageBitmap.copy(Bitmap.Config.ARGB_8888, false);
        } else {
            createScaledBitmap = Bitmap.createScaledBitmap(imageBitmap, aVar.H, aVar.I, true);
        }
        if (imageBitmap != createScaledBitmap) {
            imageBitmap.recycle();
            return createScaledBitmap;
        }
        return createScaledBitmap;
    }
}
