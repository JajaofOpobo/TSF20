package android.support.p002v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: android.support.v4.content.FileProvider */
/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {

    /* renamed from: a */
    private static final String[] f409a = {"_display_name", "_size"};

    /* renamed from: b */
    private static final File f410b = new File("/");

    /* renamed from: c */
    private static HashMap<String, InterfaceC0142a> f411c = new HashMap<>();

    /* renamed from: d */
    private InterfaceC0142a f412d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.content.FileProvider$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0142a {
        /* renamed from: a */
        File mo13405a(Uri uri);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        this.f412d = m13411a(context, providerInfo.authority);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File mo13405a = this.f412d.mo13405a(uri);
        if (strArr == null) {
            strArr = f409a;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int length = strArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            String str3 = strArr[i2];
            if ("_display_name".equals(str3)) {
                strArr3[i3] = "_display_name";
                i = i3 + 1;
                objArr[i3] = mo13405a.getName();
            } else if ("_size".equals(str3)) {
                strArr3[i3] = "_size";
                i = i3 + 1;
                objArr[i3] = Long.valueOf(mo13405a.length());
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
        }
        String[] m13407a = m13407a(strArr3, i3);
        Object[] m13408a = m13408a(objArr, i3);
        MatrixCursor matrixCursor = new MatrixCursor(m13407a, 1);
        matrixCursor.addRow(m13408a);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        File mo13405a = this.f412d.mo13405a(uri);
        int lastIndexOf = mo13405a.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(mo13405a.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.f412d.mo13405a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return ParcelFileDescriptor.open(this.f412d.mo13405a(uri), m13409a(str));
    }

    /* renamed from: a */
    private static InterfaceC0142a m13411a(Context context, String str) {
        InterfaceC0142a interfaceC0142a;
        synchronized (f411c) {
            interfaceC0142a = f411c.get(str);
            if (interfaceC0142a == null) {
                try {
                    try {
                        interfaceC0142a = m13406b(context, str);
                        f411c.put(str, interfaceC0142a);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return interfaceC0142a;
    }

    /* renamed from: b */
    private static InterfaceC0142a m13406b(Context context, String str) {
        File m13410a;
        C0143b c0143b = new C0143b(str);
        XmlResourceParser loadXmlMetaData = context.getPackageManager().resolveContentProvider(str, ItemInfo.APP_INTENT).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (loadXmlMetaData == null) {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        while (true) {
            int next = loadXmlMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = loadXmlMetaData.getName();
                    String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        m13410a = m13410a(f410b, attributeValue2);
                    } else if ("files-path".equals(name)) {
                        m13410a = m13410a(context.getFilesDir(), attributeValue2);
                    } else if ("cache-path".equals(name)) {
                        m13410a = m13410a(context.getCacheDir(), attributeValue2);
                    } else {
                        m13410a = "external-path".equals(name) ? m13410a(Environment.getExternalStorageDirectory(), attributeValue2) : null;
                    }
                    if (m13410a != null) {
                        c0143b.m13404a(attributeValue, m13410a);
                    }
                }
            } else {
                return c0143b;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v4.content.FileProvider$b */
    /* loaded from: classes.dex */
    public static class C0143b implements InterfaceC0142a {

        /* renamed from: a */
        private final String f413a;

        /* renamed from: b */
        private final HashMap<String, File> f414b = new HashMap<>();

        public C0143b(String str) {
            this.f413a = str;
        }

        /* renamed from: a */
        public void m13404a(String str, File file) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.f414b.put(str, file.getCanonicalFile());
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e);
            }
        }

        @Override // android.support.p002v4.content.FileProvider.InterfaceC0142a
        /* renamed from: a */
        public File mo13405a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f414b.get(decode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, decode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                if (!canonicalFile.getPath().startsWith(file.getPath())) {
                    throw new SecurityException("Resolved path jumped beyond configured root");
                }
                return canonicalFile;
            } catch (IOException e) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }
    }

    /* renamed from: a */
    private static int m13409a(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    /* renamed from: a */
    private static File m13410a(File file, String... strArr) {
        int length = strArr.length;
        int i = 0;
        File file2 = file;
        while (i < length) {
            String str = strArr[i];
            i++;
            file2 = str != null ? new File(file2, str) : file2;
        }
        return file2;
    }

    /* renamed from: a */
    private static String[] m13407a(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    /* renamed from: a */
    private static Object[] m13408a(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }
}
