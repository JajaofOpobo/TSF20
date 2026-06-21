package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes.dex */
public class ac {
    public static void a(Context context, String str, ae aeVar) {
        new af(context, str, aeVar).c((Object[]) new Void[0]);
    }

    public static aj a(Context context, String str, ak akVar) {
        aj ajVar = new aj(context, str, akVar);
        ajVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
        return ajVar;
    }

    public static ag b(Context context, String str, ak akVar) {
        ag agVar = new ag(context, str, akVar);
        agVar.a(com.tsf.shell.plugin.themepicker.utils.a.c, new Void[0]);
        return agVar;
    }

    public static Context a(Context context, String str) {
        try {
            return context.createPackageContext(str, 2);
        } catch (PackageManager.NameNotFoundException e) {
            g.a(e.getMessage());
            return null;
        }
    }

    public static ArrayList a(Context context) {
        ArrayList b = b(context, "xml");
        if (b == null) {
            ArrayList g = g(context);
            if (g == null) {
                return null;
            }
            return g;
        }
        return b;
    }

    public static ArrayList b(Context context) {
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
        } catch (Exception e) {
            g.b(e.getMessage());
        }
        return null;
    }

    public static ArrayList c(Context context) {
        ArrayList h = h(context);
        if (h == null) {
            ArrayList i = i(context);
            if (i == null) {
                return null;
            }
            return i;
        }
        return h;
    }

    private static ArrayList b(Context context, String str) {
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
                } else if (xml.getEventType() != 3) {
                    xml.getEventType();
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e) {
            g.b(e.getMessage());
            return null;
        }
    }

    private static ArrayList a(Context context, List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        for (int i = 0; i < size; i++) {
            try {
                int identifier = resources.getIdentifier(String.valueOf(packageName) + ":drawable/" + ((String) list.get(i)), null, null);
                if (identifier != 0) {
                    arrayList.add(Integer.valueOf(identifier));
                }
            } catch (Exception e) {
                g.a(e.getMessage());
            }
        }
        return arrayList;
    }

    private static ArrayList g(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("themecfg.xml");
        } catch (IOException e) {
            g.a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        y yVar = new y();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, yVar);
        } catch (Exception e2) {
            g.b(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            g.b(e3.getMessage());
        }
        return a(context, yVar.a);
    }

    private static ArrayList h(Context context) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open("drawable.xml");
        } catch (IOException e) {
            g.a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return null;
        }
        com.tsf.shell.plugin.themepicker.a aVar = new com.tsf.shell.plugin.themepicker.a();
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, aVar);
        } catch (Exception e2) {
            g.a(e2.getMessage());
        }
        try {
            inputStream.close();
        } catch (IOException e3) {
            g.a(e3.getMessage());
        }
        return a(context, aVar.a);
    }

    private static ArrayList i(Context context) {
        g.c("", "getThemeXMLContent use XML folder");
        ArrayList arrayList = new ArrayList();
        try {
            XmlResourceParser xml = context.getResources().getXml(context.getResources().getIdentifier("drawable", "xml", context.getPackageName()));
            while (xml.getEventType() != 1) {
                if (xml.getEventType() == 2) {
                    if (xml.getName().equals("item")) {
                        arrayList.add(xml.getAttributeValue(0));
                    }
                } else if (xml.getEventType() != 3) {
                    xml.getEventType();
                }
                xml.next();
            }
            return a(context, arrayList);
        } catch (Exception e) {
            g.a(e.getMessage());
            return null;
        }
    }

    public static String d(Context context) {
        String packageName = context.getPackageName();
        for (String str : new String[]{"theme_author", "developer_name", "developerName", "authorName"}) {
            int identifier = context.getResources().getIdentifier(String.valueOf(packageName) + ":string/" + str, null, null);
            g.b("author resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                g.b("author:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    public static String e(Context context) {
        String packageName = context.getPackageName();
        for (String str : new String[]{"authorLink", "developer_link"}) {
            int identifier = context.getResources().getIdentifier(String.valueOf(packageName) + ":string/" + str, null, null);
            g.b("themelink resource id : " + identifier);
            if (identifier != 0) {
                String string = context.getString(identifier);
                g.b("themeLink:" + string + "   resid:" + identifier);
                return string;
            }
        }
        return null;
    }

    public static String f(Context context) {
        String packageName = context.getPackageName();
        for (String str : new String[]{"theme_description", "theme_info"}) {
            int identifier = context.getResources().getIdentifier(String.valueOf(packageName) + ":string/" + str, null, null);
            if (identifier != 0) {
                return context.getString(identifier);
            }
        }
        return null;
    }

    public static void a(Context context, ai aiVar) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        a(b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0)), arrayList);
        a(d(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        a(packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0), arrayList);
        aiVar.a(arrayList);
    }

    public static void b(Context context, ai aiVar) {
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = new ArrayList();
        a(c(context, b(context, packageManager.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0))), arrayList);
        a(c(context, packageManager.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0)), arrayList);
        a(c(context, packageManager.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0)), arrayList);
        aiVar.a(arrayList);
    }

    private static List b(Context context, List list) {
        ResolveInfo resolveInfo;
        ArrayList arrayList = new ArrayList();
        String packageName = context.getPackageName();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                resolveInfo = null;
                break;
            }
            resolveInfo = (ResolveInfo) it.next();
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

    private static List c(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Context a2 = a(context, resolveInfo.activityInfo.packageName);
            if (a2 != null) {
                try {
                    if (a2.getResources().getIdentifier("wallpaperlist", "array", a2.getPackageName()) != 0) {
                        arrayList.add(resolveInfo);
                    }
                } catch (Exception e) {
                    g.b(e.getMessage());
                }
            }
        }
        return arrayList;
    }

    private static List d(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
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
        } catch (IOException e) {
            g.a(e.getMessage());
            inputStream = null;
        }
        if (inputStream == null) {
            return true;
        }
        try {
            SAXParserFactory.newInstance().newSAXParser().parse(inputStream, new a());
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            return false;
        } catch (ad e3) {
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

    class a extends DefaultHandler {
        a() {
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) {
            throw new ad(this);
        }
    }

    private static void a(List list, ArrayList arrayList) {
        boolean z;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z = false;
                    break;
                }
                if (resolveInfo.activityInfo.packageName.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
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
