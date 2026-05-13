package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.tsf.shell.plugin.themepicker.C3852f;
import com.tsf.shell.plugin.themepicker.utils.AbstractC3929a;
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
/* renamed from: com.tsf.shell.plugin.themepicker.k */
/* loaded from: classes.dex */
public class C3897k {

    /* renamed from: com.tsf.shell.plugin.themepicker.k$b */
    /* loaded from: classes.dex */
    public interface InterfaceC3900b {
        /* renamed from: a */
        void mo1165a(List<C3903e> list);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$e */
    /* loaded from: classes.dex */
    public static class C3903e {

        /* renamed from: a */
        public String f12796a;

        /* renamed from: b */
        public String f12797b;

        /* renamed from: c */
        public String f12798c;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3904f {
        /* renamed from: a */
        void mo1003a(List<ResolveInfo> list);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$h */
    /* loaded from: classes.dex */
    public interface InterfaceC3906h {
        /* renamed from: a */
        void mo985a(List<Integer> list, String str, String str2);
    }

    /* renamed from: a */
    public static void m1235a(Context context, String str, InterfaceC3900b interfaceC3900b) {
        new C3901c(context, str, interfaceC3900b).m1141c((Object[]) new Void[0]);
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$c */
    /* loaded from: classes.dex */
    public static class C3901c extends AbstractC3929a<Void, Void, List<C3903e>> {

        /* renamed from: a */
        private String f12790a;

        /* renamed from: e */
        private InterfaceC3900b f12791e;

        /* renamed from: f */
        private Context f12792f;

        public C3901c(Context context, String str, InterfaceC3900b interfaceC3900b) {
            this.f12790a = str;
            this.f12791e = interfaceC3900b;
            this.f12792f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public List<C3903e> mo1015a(Void... voidArr) {
            InputStream inputStream;
            if (this.f12790a != null) {
                try {
                    inputStream = C3897k.m1232a(this.f12790a);
                } catch (IOException e) {
                    e.printStackTrace();
                    inputStream = null;
                }
            } else {
                inputStream = this.f12792f.getResources().openRawResource(C3852f.C3861i.onlinetheme);
            }
            if (inputStream == null) {
                return null;
            }
            C3896j c3896j = new C3896j();
            try {
                SAXParserFactory.newInstance().newSAXParser().parse(inputStream, c3896j);
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
            return c3896j.f12787a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo1020a(List<C3903e> list) {
            this.f12791e.mo1165a(list);
        }
    }

    /* renamed from: a */
    public static C3905g m1234a(Context context, String str, InterfaceC3906h interfaceC3906h) {
        C3905g c3905g = new C3905g(context, str, interfaceC3906h);
        c3905g.m1149a(AbstractC3929a.f12874c, new Void[0]);
        return c3905g;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$g */
    /* loaded from: classes.dex */
    public static class C3905g extends AbstractC3929a<Void, Void, Void> {

        /* renamed from: a */
        private String f12799a;

        /* renamed from: e */
        private InterfaceC3906h f12800e;

        /* renamed from: f */
        private Context f12801f;

        public C3905g(Context context, String str, InterfaceC3906h interfaceC3906h) {
            this.f12799a = str;
            this.f12800e = interfaceC3906h;
            this.f12801f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public Void mo1015a(Void... voidArr) {
            Context m1236a = C3897k.m1236a(this.f12801f, this.f12799a);
            if (m1236a != null) {
                String m1223d = C3897k.m1223d(m1236a);
                String m1221e = C3897k.m1221e(m1236a);
                this.f12800e.mo985a(C3897k.m1230b(m1236a), m1223d, m1221e);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static C3902d m1227b(Context context, String str, InterfaceC3906h interfaceC3906h) {
        C3902d c3902d = new C3902d(context, str, interfaceC3906h);
        c3902d.m1149a(AbstractC3929a.f12874c, new Void[0]);
        return c3902d;
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.k$d */
    /* loaded from: classes.dex */
    public static class C3902d extends AbstractC3929a<Void, Void, Void> {

        /* renamed from: a */
        private String f12793a;

        /* renamed from: e */
        private InterfaceC3906h f12794e;

        /* renamed from: f */
        private Context f12795f;

        public C3902d(Context context, String str, InterfaceC3906h interfaceC3906h) {
            this.f12793a = str;
            this.f12794e = interfaceC3906h;
            this.f12795f = context;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.tsf.shell.plugin.themepicker.utils.AbstractC3929a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public Void mo1015a(Void... voidArr) {
            Context m1236a = C3897k.m1236a(this.f12795f, this.f12793a);
            if (m1236a != null) {
                String m1223d = C3897k.m1223d(m1236a);
                String m1221e = C3897k.m1221e(m1236a);
                ArrayList<Integer> m1225c = C3897k.m1225c(m1236a);
                if (m1225c != null) {
                    this.f12794e.mo985a(m1225c, m1223d, m1221e);
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static Context m1236a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            C3851e.m1319a(e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public static ArrayList<Integer> m1238a(Context context) {
        ArrayList<Integer> m1228b = m1228b(context, "xml");
        if (m1228b == null) {
            ArrayList<Integer> m1219g = m1219g(context);
            if (m1219g == null) {
                return null;
            }
            return m1219g;
        }
        return m1228b;
    }

    /* renamed from: b */
    public static ArrayList<Integer> m1230b(Context context) {
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
                return m1233a(context, arrayList);
            }
        } catch (Exception e) {
            C3851e.m1317b(e.getMessage());
        }
        return null;
    }

    /* renamed from: c */
    public static ArrayList<Integer> m1225c(Context context) {
        ArrayList<Integer> m1218h = m1218h(context);
        if (m1218h == null) {
            ArrayList<Integer> m1217i = m1217i(context);
            if (m1217i == null) {
                return null;
            }
            return m1217i;
        }
        return m1218h;
    }

    /* renamed from: b */
    private static ArrayList<Integer> m1228b(Context context, String str) {
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
            return m1233a(context, arrayList);
        } catch (Exception e) {
            C3851e.m1317b(e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    private static ArrayList<Integer> m1233a(Context context, List<String> list) {
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
            } catch (Exception e) {
                C3851e.m1319a(e.getMessage());
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static ArrayList<Integer> m1219g(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("themecfg.xml");
        } catch (IOException e) {
            C3851e.m1319a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        C3865h c3865h = new C3865h();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, c3865h);
        } catch (Exception e2) {
            C3851e.m1317b(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            C3851e.m1317b(e3.getMessage());
        }
        return m1233a(context, c3865h.f12651a);
    }

    /* renamed from: h */
    private static ArrayList<Integer> m1218h(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            C3851e.m1319a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        C3845a c3845a = new C3845a();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, c3845a);
        } catch (Exception e2) {
            C3851e.m1319a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            C3851e.m1319a(e3.getMessage());
        }
        return m1233a(context, c3845a.f12621a);
    }

    /* renamed from: i */
    private static ArrayList<Integer> m1217i(Context context) {
        C3851e.m1315c("", "getThemeXMLContent use XML folder");
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
            return m1233a(context, arrayList);
        } catch (Exception e) {
            C3851e.m1319a(e.getMessage());
            return null;
        }
    }

    /* renamed from: d */
    public static String m1223d(Context context) {
        String[] strArr = {"theme_author", "developer_name", "developerName", "authorName"};
        String packageName = context.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            int identifier = context.getResources().getIdentifier(packageName + ":string/" + strArr[i], null, null);
            C3851e.m1317b("author resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                C3851e.m1317b("author:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m1221e(Context context) {
        String[] strArr = {"authorLink", "developer_link"};
        String packageName = context.getPackageName();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            int identifier = context.getResources().getIdentifier(packageName + ":string/" + strArr[i], null, null);
            C3851e.m1317b("themelink resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                C3851e.m1317b("themeLink:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static String m1220f(Context context) {
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

    /* renamed from: a */
    public static void m1237a(Context context, InterfaceC3904f interfaceC3904f) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        m1231a(m1226b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0)), arrayList);
        m1231a(m1222d(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        m1231a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        interfaceC3904f.mo1003a(arrayList);
    }

    /* renamed from: b */
    public static void m1229b(Context context, InterfaceC3904f interfaceC3904f) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        m1231a(m1224c(context, m1226b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0))), arrayList);
        m1231a(m1224c(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        m1231a(m1224c(context, packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0)), arrayList);
        interfaceC3904f.mo1003a(arrayList);
    }

    /* renamed from: b */
    private static List<ResolveInfo> m1226b(Context context, List<ResolveInfo> list) {
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

    /* renamed from: c */
    private static List<ResolveInfo> m1224c(Context context, List<ResolveInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            Context m1236a = m1236a(context, resolveInfo.activityInfo.packageName);
            if (m1236a != null) {
                try {
                    if (m1236a.getResources().getIdentifier("wallpaperlist", "array", m1236a.getPackageName()) != 0) {
                        arrayList.add(resolveInfo);
                    }
                } catch (Exception e) {
                    C3851e.m1317b(e.getMessage());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private static List<ResolveInfo> m1222d(Context context, List<ResolveInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : list) {
            Context m1236a = m1236a(context, resolveInfo.activityInfo.packageName);
            if (m1236a != null && !m1216j(m1236a)) {
                arrayList.add(resolveInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    private static boolean m1216j(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            C3851e.m1319a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return true;
        }
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, new C3898a());
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return false;
        } catch (C3898a.C3899a e3) {
            try {
                inputStream.close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            return false;
        } catch (Exception e5) {
            try {
                inputStream.close();
                return true;
            } catch (IOException e6) {
                e6.printStackTrace();
                return true;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e7) {
                e7.printStackTrace();
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.plugin.themepicker.k$a */
    /* loaded from: classes.dex */
    public class C3898a extends DefaultHandler {
        C3898a() {
        }

        /* renamed from: com.tsf.shell.plugin.themepicker.k$a$a */
        /* loaded from: classes.dex */
        class C3899a extends SAXException {
            C3899a() {
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            throw new C3899a();
        }
    }

    /* renamed from: a */
    private static void m1231a(List<ResolveInfo> list, ArrayList<ResolveInfo> arrayList) {
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

    /* renamed from: a */
    public static InputStream m1232a(String str) {
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
