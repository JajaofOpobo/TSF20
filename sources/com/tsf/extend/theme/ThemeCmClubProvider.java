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
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class ThemeCmClubProvider extends ContentProvider {

    /* renamed from: a */
    private static Map<String, C1597a> f5066a = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.ThemeCmClubProvider$a */
    /* loaded from: classes.dex */
    public static class C1597a {

        /* renamed from: a */
        private int f5067a;

        /* renamed from: b */
        private String f5068b;

        /* renamed from: c */
        private int f5069c;

        /* renamed from: d */
        private String f5070d;

        public C1597a(int i, String str, int i2, String str2) {
            this.f5067a = i;
            this.f5068b = str;
            this.f5069c = i2;
            this.f5070d = str2;
        }
    }

    static {
        f5066a.put("appmanager", new C1597a(C1536f.C1540d.icon_app_manager, "com.ksmobile.launcher.customitem.AppManagerShortcutInfo", 2, "app_manager"));
        f5066a.put("allapps", new C1597a(C1536f.C1540d.widget_all_apps, "com.ksmobile.launcher.customitem.AllAppsShortcutInfo", 2, "widget_all_apps"));
        f5066a.put("archive", new C1597a(C1536f.C1540d.sort_apps, "com.ksmobile.launcher.customitem.SortAppsShortcutInfo", 2, "sort_apps"));
        f5066a.put("browser", new C1597a(C1536f.C1540d.browser, "browser", 0, "browser"));
        f5066a.put("calculator", new C1597a(C1536f.C1540d.calculator, "calculator", 0, "calculator"));
        f5066a.put("calendar", new C1597a(C1536f.C1540d.calendar, "calendar", 0, "calendar"));
        f5066a.put("camera", new C1597a(C1536f.C1540d.camera, "camera", 0, "camera"));
        f5066a.put("cmclub", new C1597a(C1536f.C1540d.cm_club, "com.ksmobile.launcher.customitem.CMClubShortcutInfo", 2, "cm_club"));
        f5066a.put("clock", new C1597a(C1536f.C1540d.clock, "clock", 0, "clock"));
        f5066a.put("contacts", new C1597a(C1536f.C1540d.contact, "contact", 0, "contact"));
        f5066a.put("download", new C1597a(C1536f.C1540d.download, "download", 0, "download"));
        f5066a.put("effect", new C1597a(C1536f.C1540d.effect, "com.ksmobile.launcher.customitem.EffectManagementShortcutInfo", 2, "effect"));
        f5066a.put("filemanager", new C1597a(C1536f.C1540d.filemanager, "filemanager", 0, "filemanager"));
        f5066a.put("flashlight", new C1597a(C1536f.C1540d.flashlight, "flashlight", 0, "flashlight"));
        f5066a.put("flow", new C1597a(C1536f.C1540d.icon_gprs, "com.ksmobile.launcher.customitem.NetManagerShortcutInfo", 2, "gprs"));
        f5066a.put("market", new C1597a(C1536f.C1540d.market, "com.ksmobile.launcher.customitem.MarketShortcutInfo", 2, "market"));
        f5066a.put("music", new C1597a(C1536f.C1540d.music, "music", 0, "music"));
        f5066a.put("mail", new C1597a(C1536f.C1540d.email, "email", 0, "email"));
        f5066a.put("notification", new C1597a(C1536f.C1540d.message_spirit, "com.ksmobile.launcher.customitem.MessageSpiritShortcutInfo", 2, "message_spirit"));
        f5066a.put("phone", new C1597a(C1536f.C1540d.phone, "phone", 0, "phone"));
        f5066a.put("recorder", new C1597a(C1536f.C1540d.record, "record", 0, "record"));
        f5066a.put("recently", new C1597a(C1536f.C1540d.widget_recently, "com.ksmobile.launcher.customitem.RecentlyOpenedShortcutInfo", 2, "widget_recently"));
        f5066a.put("settings", new C1597a(C1536f.C1540d.settings, "settings", 0, "settings"));
        f5066a.put("sms", new C1597a(C1536f.C1540d.message, "message", 0, "message"));
        f5066a.put("themes", new C1597a(C1536f.C1540d.theme, "com.ksmobile.launcher.customitem.ThemeShortcutInfo", 2, "theme"));
        f5066a.put("video", new C1597a(C1536f.C1540d.video, "video", 0, "video"));
        f5066a.put("wallpaper", new C1597a(C1536f.C1540d.wallpaper, "com.ksmobile.launcher.customitem.WallpaperShortcutInfo", 2, "wallpaper"));
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    /* renamed from: a */
    private static byte[] m8131a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: a */
    private static boolean m8130a(String str) {
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
            String m7833c = C1673ah.m7864a().m7833c();
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"key", "theme_path"});
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (m7833c == null) {
                m7833c = "";
            }
            objArr[1] = m7833c;
            matrixCursor.addRow(objArr);
            return matrixCursor;
        }
        if (m8130a(str)) {
            if ("mask_backgrand".equals(str)) {
                bArr = m8131a(C1673ah.m7864a().m7819j());
            } else if ("icon_backgrand_1".equals(str)) {
                bArr = m8131a(C1673ah.m7864a().m7820i());
            } else if ("icon_folder".equals(str)) {
                bArr = m8131a(C1673ah.m7864a().m7822h());
            } else if ("icon_shade".equals(str)) {
                bArr = m8131a(C1673ah.m7864a().m7818k());
            }
        } else {
            if (C1673ah.m7864a().m7817l()) {
                try {
                    bArr = m8126e(str);
                } catch (Throwable th) {
                }
            } else if (C1673ah.m7864a().m7815n() || C1673ah.m7864a().m7816m()) {
                try {
                    bArr = m8128c(str);
                } catch (Throwable th2) {
                }
            }
            if (bArr == null) {
                bArr = m8127d(str);
            }
        }
        C1597a m8129b = m8129b(str);
        String str3 = m8129b != null ? m8129b.f5070d : str;
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

    /* renamed from: b */
    private C1597a m8129b(String str) {
        return f5066a.get(str);
    }

    /* renamed from: c */
    private byte[] m8128c(String str) {
        C1597a m8129b;
        HashMap<String, C1652aa> hashMap;
        Bitmap m7848a;
        SparseArray<HashMap<String, C1652aa>> m7828e = C1673ah.m7864a().m7828e();
        if (m7828e != null && (m8129b = m8129b(str)) != null && (hashMap = m7828e.get(m8129b.f5069c)) != null && (m7848a = C1673ah.m7864a().m7848a(hashMap.get(m8129b.f5068b), 0)) != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m7848a.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        return null;
    }

    /* renamed from: d */
    private byte[] m8127d(String str) {
        Context m8290b;
        Bitmap decodeResource;
        C1597a m8129b = m8129b(str);
        if (m8129b == null || (m8290b = C1547h.m8290b()) == null || (decodeResource = BitmapFactory.decodeResource(m8290b.getResources(), m8129b.f5067a)) == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeResource.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: e */
    private byte[] m8126e(String str) {
        return null;
    }
}
