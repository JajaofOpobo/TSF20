package com.tsf.extend.theme;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.SparseArray;
import com.tsf.extend.f;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ThemeCmClubProvider extends ContentProvider {
    private static Map<String, a> a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {
        private int a;
        private String b;
        private int c;
        private String d;

        public a(int i, String str, int i2, String str2) {
            this.a = i;
            this.b = str;
            this.c = i2;
            this.d = str2;
        }
    }

    static {
        a.put("appmanager", new a(f.d.icon_app_manager, "com.ksmobile.launcher.customitem.AppManagerShortcutInfo", 2, "app_manager"));
        a.put("allapps", new a(f.d.widget_all_apps, "com.ksmobile.launcher.customitem.AllAppsShortcutInfo", 2, "widget_all_apps"));
        a.put("archive", new a(f.d.sort_apps, "com.ksmobile.launcher.customitem.SortAppsShortcutInfo", 2, "sort_apps"));
        a.put("browser", new a(f.d.browser, "browser", 0, "browser"));
        a.put("calculator", new a(f.d.calculator, "calculator", 0, "calculator"));
        a.put("calendar", new a(f.d.calendar, "calendar", 0, "calendar"));
        a.put("camera", new a(f.d.camera, "camera", 0, "camera"));
        a.put("cmclub", new a(f.d.cm_club, "com.ksmobile.launcher.customitem.CMClubShortcutInfo", 2, "cm_club"));
        a.put("clock", new a(f.d.clock, "clock", 0, "clock"));
        a.put("contacts", new a(f.d.contact, "contact", 0, "contact"));
        a.put("download", new a(f.d.download, "download", 0, "download"));
        a.put("effect", new a(f.d.effect, "com.ksmobile.launcher.customitem.EffectManagementShortcutInfo", 2, "effect"));
        a.put("filemanager", new a(f.d.filemanager, "filemanager", 0, "filemanager"));
        a.put("flashlight", new a(f.d.flashlight, "flashlight", 0, "flashlight"));
        a.put("flow", new a(f.d.icon_gprs, "com.ksmobile.launcher.customitem.NetManagerShortcutInfo", 2, "gprs"));
        a.put("market", new a(f.d.market, "com.ksmobile.launcher.customitem.MarketShortcutInfo", 2, "market"));
        a.put("music", new a(f.d.music, "music", 0, "music"));
        a.put("mail", new a(f.d.email, "email", 0, "email"));
        a.put("notification", new a(f.d.message_spirit, "com.ksmobile.launcher.customitem.MessageSpiritShortcutInfo", 2, "message_spirit"));
        a.put("phone", new a(f.d.phone, "phone", 0, "phone"));
        a.put("recorder", new a(f.d.record, "record", 0, "record"));
        a.put("recently", new a(f.d.widget_recently, "com.ksmobile.launcher.customitem.RecentlyOpenedShortcutInfo", 2, "widget_recently"));
        a.put("settings", new a(f.d.settings, "settings", 0, "settings"));
        a.put("sms", new a(f.d.message, "message", 0, "message"));
        a.put("themes", new a(f.d.theme, "com.ksmobile.launcher.customitem.ThemeShortcutInfo", 2, "theme"));
        a.put("video", new a(f.d.video, "video", 0, "video"));
        a.put("wallpaper", new a(f.d.wallpaper, "com.ksmobile.launcher.customitem.WallpaperShortcutInfo", 2, "wallpaper"));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    private static byte[] a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static boolean a(String str) {
        for (String str2 : new String[]{"icon_", "mask_"}) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        byte[] bArr = null;
        if ("theme_current_path".equals(str)) {
            String c = ah.a().c();
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "theme_path"});
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (c == null) {
                c = "";
            }
            objArr[1] = c;
            matrixCursor.addRow(objArr);
            return matrixCursor;
        }
        if (a(str)) {
            if ("mask_backgrand".equals(str)) {
                bArr = a(ah.a().j());
            } else if ("icon_backgrand_1".equals(str)) {
                bArr = a(ah.a().i());
            } else if ("icon_folder".equals(str)) {
                bArr = a(ah.a().h());
            } else if ("icon_shade".equals(str)) {
                bArr = a(ah.a().k());
            }
        } else {
            if (ah.a().l()) {
                try {
                    bArr = e(str);
                } catch (Throwable th) {
                }
            } else if (ah.a().n() || ah.a().m()) {
                try {
                    bArr = c(str);
                } catch (Throwable th2) {
                }
            }
            if (bArr == null) {
                bArr = d(str);
            }
        }
        a b = b(str);
        String str3 = b != null ? b.d : str;
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"key", "bitmap", "filename"});
        matrixCursor2.addRow(new Object[]{str, bArr, str3});
        return matrixCursor2;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    private a b(String str) {
        return a.get(str);
    }

    private byte[] c(String str) {
        a b;
        HashMap<String, aa> hashMap;
        Bitmap a2;
        SparseArray<HashMap<String, aa>> e = ah.a().e();
        if (e != null && (b = b(str)) != null && (hashMap = e.get(b.c)) != null && (a2 = ah.a().a(hashMap.get(b.b), 0)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a2.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    private byte[] d(String str) {
        Context b;
        Bitmap decodeResource;
        a b2 = b(str);
        if (b2 == null || (b = com.tsf.extend.h.b()) == null || (decodeResource = BitmapFactory.decodeResource(b.getResources(), b2.a)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] e(String str) {
        return null;
    }
}
