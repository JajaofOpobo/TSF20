package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.tsf.shell.plugin.themepicker.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public interface b {
        void a(List<e> list);
    }

    /* loaded from: classes.dex */
    public static class e {
        public String a;
        public String b;
        public String c;
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(List<ResolveInfo> list);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a(List<Integer> list, String str, String str2);
    }

    public static void a(Context context, String str, b bVar) {
        new c(context, str, bVar).c((Object[]) new Void[0]);
    }

    /* loaded from: classes.dex */
    public static class c extends com.tsf.shell.plugin.themepicker.utils.a<Void, Void, List<e>> {
        private String a;
        private b e;
        private Context f;

        public c(Context context, String str, b bVar) {
            this.a = str;
            this.e = bVar;
            this.f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public List<e> a(Void... voidArr) {
            InputStream inputStream;
            if (this.a != null) {
                try {
                    inputStream = k.a(this.a);
                } catch (IOException e) {
                    e.printStackTrace();
                    inputStream = null;
                }
            } else {
                inputStream = this.f.getResources().openRawResource(f.i.onlinetheme);
            }
            if (inputStream == null) {
                return null;
            }
            j jVar = new j();
            try {
                SAXParserFactory.newInstance().newSAXParser().parse(inputStream, jVar);
            } catch (IOException e2) {
                e2.printStackTrace();
            } catch (ParserConfigurationException e3) {
                e3.printStackTrace();
            } catch (SAXException e4) {
                e4.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return jVar.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public void a(List<e> list) {
            this.e.a(list);
        }
    }

    public static g a(Context context, String str, h hVar) {
        g gVar = new g(context, str, hVar);
        gVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
        return gVar;
    }

    /* loaded from: classes.dex */
    public static class g extends com.tsf.shell.plugin.themepicker.utils.a<Void, Void, Void> {
        private String a;
        private h e;
        private Context f;

        public g(Context context, String str, h hVar) {
            this.a = str;
            this.e = hVar;
            this.f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public Void a(Void... voidArr) {
            Context a = k.a(this.f, this.a);
            if (a != null) {
                String d = k.d(a);
                String e = k.e(a);
                this.e.a(k.b(a), d, e);
            }
            return null;
        }
    }

    public static d b(Context context, String str, h hVar) {
        d dVar = new d(context, str, hVar);
        dVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
        return dVar;
    }

    /* loaded from: classes.dex */
    public static class d extends com.tsf.shell.plugin.themepicker.utils.a<Void, Void, Void> {
        private String a;
        private h e;
        private Context f;

        public d(Context context, String str, h hVar) {
            this.a = str;
            this.e = hVar;
            this.f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.a
        public Void a(Void... voidArr) {
            Context a = k.a(this.f, this.a);
            if (a != null) {
                String d = k.d(a);
                String e = k.e(a);
                ArrayList<Integer> c = k.c(a);
                if (c != null) {
                    this.e.a(c, d, e);
                }
            }
            return null;
        }
    }

    public static Context a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            return null;
        }
    }

    public static ArrayList<Integer> a(Context context) {
        ArrayList<Integer> b2 = b(context, "xml");
        if (b2 == null) {
            ArrayList<Integer> g2 = g(context);
            if (g2 == null) {
                return null;
            }
            return g2;
        }
        return b2;
    }

    public static ArrayList<Integer> b(Context context) {
        try {
            int identifier = context.getResources().getIdentifier("wallpaperlist", "array", context.getPackageName());
            if (identifier == 0) {
                identifier = context.getResources().getIdentifier("wallpapers", "array", context.getPackageName());
            }
            String[] stringArray = context.getResources().getStringArray(identifier);
            if (stringArray != null && stringArray.length > 0) {
                ArrayList arrayList = new ArrayList();
                for (String str : stringArray) {
                    arrayList.add(str);
                }
                return a(context, arrayList);
            }
        } catch (Exception e2) {
            com.tsf.shell.plugin.themepicker.e.b(e2.getMessage());
        }
        return null;
    }

    public static ArrayList<Integer> c(Context context) {
        ArrayList<Integer> h2 = h(context);
        if (h2 == null) {
            ArrayList<Integer> i = i(context);
            if (i == null) {
                return null;
            }
            return i;
        }
        return h2;
    }

    private static ArrayList<Integer> b(Context context, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("themecfg", str, context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("preview")) {
                        int attributeCount = xml.getAttributeCount();
                        for (int i = 0; i < attributeCount; i++) {
                            arrayList.add(xml.getAttributeValue(i));
                        }
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() != 4) {
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e2) {
            com.tsf.shell.plugin.themepicker.e.b(e2.getMessage());
            return null;
        }
    }

    private static ArrayList<Integer> a(Context context, List<String> list) {
        if (list == null) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size = list.size();
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        for (int i = 0; i < size; i++) {
            try {
                int identifier = resources.getIdentifier(packageName + ":drawable/" + list.get(i), null, null);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e2) {
                com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            }
        }
        return arrayList;
    }

    private static ArrayList<Integer> g(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("themecfg.xml");
        } catch (IOException e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        com.tsf.shell.plugin.themepicker.h hVar = new com.tsf.shell.plugin.themepicker.h();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, hVar);
        } catch (Exception e3) {
            com.tsf.shell.plugin.themepicker.e.b(e3.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e4) {
            com.tsf.shell.plugin.themepicker.e.b(e4.getMessage());
        }
        return a(context, hVar.a);
    }

    private static ArrayList<Integer> h(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        com.tsf.shell.plugin.themepicker.a aVar = new com.tsf.shell.plugin.themepicker.a();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, aVar);
        } catch (Exception e3) {
            com.tsf.shell.plugin.themepicker.e.a(e3.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e4) {
            com.tsf.shell.plugin.themepicker.e.a(e4.getMessage());
        }
        return a(context, aVar.a);
    }

    private static ArrayList<Integer> i(Context context) {
        com.tsf.shell.plugin.themepicker.e.c("", "getThemeXMLContent use XML folder");
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("drawable", "xml", context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("item")) {
                        arrayList.add(xml.getAttributeValue(0));
                    }
                } else if (xml.getEventType() != 3 && xml.getEventType() == 4) {
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            return null;
        }
    }

    public static String d(Context context) {
        String[] strArr = {"theme_author", "developer_name", "developerName", "authorName"};
        String packageName = context.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            int identifier = context.getResources().getIdentifier(packageName + ":string/" + strArr[i], null, null);
            com.tsf.shell.plugin.themepicker.e.b("author resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                com.tsf.shell.plugin.themepicker.e.b("author:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    public static String e(Context context) {
        String[] strArr = {"authorLink", "developer_link"};
        String packageName = context.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            int identifier = context.getResources().getIdentifier(packageName + ":string/" + strArr[i], null, null);
            com.tsf.shell.plugin.themepicker.e.b("themelink resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                com.tsf.shell.plugin.themepicker.e.b("themeLink:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    public static String f(Context context) {
        String[] strArr = {"theme_description", "theme_info"};
        String packageName = context.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            int identifier = context.getResources().getIdentifier(packageName + ":string/" + strArr[i], null, null);
            if (identifier != 0) {
                return context.getString(identifier);
            }
        }
        return null;
    }

    public static void a(Context context, f fVar) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        a(b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0)), arrayList);
        a(d(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        fVar.a(arrayList);
    }

    public static void b(Context context, f fVar) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        a(c(context, b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0))), arrayList);
        a(c(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        a(c(context, packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0)), arrayList);
        fVar.a(arrayList);
    }

    private static List<ResolveInfo> b(Context context, List<ResolveInfo> list) {
        ResolveInfo resolveInfo;
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        Iterator<ResolveInfo> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                resolveInfo = null;
                break;
            }
            resolveInfo = it.next();
            if (resolveInfo.activityInfo.packageName.equals(packageName)) {
                break;
            }
        }
        if (resolveInfo != null) {
            arrayList.add(resolveInfo);
        }
        arrayList.addAll(list);
        return arrayList;
    }

    private static List<ResolveInfo> c(Context context, List<ResolveInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            Context a2 = a(context, resolveInfo.activityInfo.packageName);
            if (a2 != null) {
                try {
                    if (a2.getResources().getIdentifier("wallpaperlist", "array", a2.getPackageName()) != 0) {
                        arrayList.add(resolveInfo);
                    }
                } catch (Exception e2) {
                    com.tsf.shell.plugin.themepicker.e.b(e2.getMessage());
                }
            }
        }
        return arrayList;
    }

    private static List<ResolveInfo> d(Context context, List<ResolveInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            Context a2 = a(context, resolveInfo.activityInfo.packageName);
            if (a2 != null && !j(a2)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    private static boolean j(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e2) {
            com.tsf.shell.plugin.themepicker.e.a(e2.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return true;
        }
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, new a());
            try {
                inputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            return false;
        } catch (a.C0156a e4) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            return false;
        } catch (Exception e6) {
            try {
                inputStream.close();
                return true;
            } catch (IOException e7) {
                e7.printStackTrace();
                return true;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e8) {
                e8.printStackTrace();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends DefaultHandler {
        a() {
        }

        /* renamed from: com.tsf.shell.plugin.themepicker.k$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0156a extends SAXException {
            C0156a() {
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            throw new C0156a();
        }
    }

    private static void a(List<ResolveInfo> list, ArrayList<ResolveInfo> arrayList) {
        boolean z;
        for (ResolveInfo resolveInfo : list) {
            Iterator<ResolveInfo> it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (resolveInfo.activityInfo.packageName.equals(it.next().activityInfo.packageName)) {
                    z = true;
                    break;
                }
            }
            if (!z) {
                arrayList.add(resolveInfo);
            }
        }
    }

    public static InputStream a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 50000);
        HttpResponse execute = new DefaultHttpClient(basicHttpParams).execute(new HttpGet(str));
        if (execute.getStatusLine().getStatusCode() != 200) {
            throw new IOException();
        }
        HttpEntity entity = execute.getEntity();
        if (entity != null) {
            return entity.getContent();
        }
        throw new IOException();
    }
}
