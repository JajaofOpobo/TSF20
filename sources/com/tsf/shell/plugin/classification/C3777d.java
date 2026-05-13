package com.tsf.shell.plugin.classification;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.widget.Toast;
import com.tsf.shell.plugin.themepicker.C3851e;
import com.tsf.shell.plugin.themepicker.C3852f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.shell.plugin.classification.d */
/* loaded from: classes.dex */
public class C3777d {

    /* renamed from: a */
    public static String f12387a = "http://api.tsfui.com/index.php?type=1&";

    /* renamed from: b */
    public static String f12388b = "en";

    /* renamed from: com.tsf.shell.plugin.classification.d$d */
    /* loaded from: classes.dex */
    public interface InterfaceC3781d {
        /* renamed from: a */
        void mo1511a();

        /* renamed from: a */
        void mo1510a(C3778a c3778a);
    }

    /* renamed from: a */
    public static AsyncTask m1522a(Context context, ArrayList<String> arrayList, InterfaceC3781d interfaceC3781d) {
        return new AsyncTaskC3780c(context, arrayList, interfaceC3781d).execute(new Void[0]);
    }

    /* renamed from: a */
    public static int m1526a(int i) {
        switch (i) {
            case 2:
                return 2;
            case 11:
            case 17:
                return 11;
            case 12:
                return 12;
            case 14:
            case 102228:
                return 14;
            case 15:
            case 101962:
                return 15;
            case 16:
            case 102233:
                return 16;
            case 18:
                return 18;
            case 102111:
            case 102232:
                return 102111;
            case 102230:
                return 102230;
            case 102231:
                return 102231;
            default:
                return 404;
        }
    }

    /* renamed from: a */
    public static String m1525a(Context context, int i) {
        switch (i) {
            case 2:
                return context.getString(C3852f.C3862j.packageapp_category_game);
            case 11:
                return context.getString(C3852f.C3862j.packageapp_category_tool);
            case 12:
                return context.getString(C3852f.C3862j.packageapp_category_social);
            case 14:
                return context.getString(C3852f.C3862j.packageapp_category_media);
            case 15:
                return context.getString(C3852f.C3862j.packageapp_category_reading);
            case 16:
                return context.getString(C3852f.C3862j.packageapp_category_life);
            case 18:
                return context.getString(C3852f.C3862j.packageapp_category_theme);
            case 102111:
                return context.getString(C3852f.C3862j.packageapp_category_edu);
            case 102230:
                return context.getString(C3852f.C3862j.packageapp_category_shopping);
            case 102231:
                return context.getString(C3852f.C3862j.packageapp_category_travel);
            default:
                return context.getString(C3852f.C3862j.packageapp_category_other);
        }
    }

    /* renamed from: com.tsf.shell.plugin.classification.d$a */
    /* loaded from: classes.dex */
    public static class C3778a {

        /* renamed from: a */
        public Map<Integer, C3779b> f12389a = new HashMap();

        /* renamed from: b */
        public C3779b[] f12390b;

        public C3778a(Context context) {
        }

        /* renamed from: a */
        public void m1515a() {
            this.f12390b = new C3779b[this.f12389a.size()];
            Iterator<Map.Entry<Integer, C3779b>> it = this.f12389a.entrySet().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    this.f12390b[i2] = it.next().getValue();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.tsf.shell.plugin.classification.d$b */
    /* loaded from: classes.dex */
    public static class C3779b {

        /* renamed from: a */
        public String f12391a;

        /* renamed from: b */
        public ArrayList<String> f12392b = new ArrayList<>();

        /* renamed from: c */
        public int f12393c;

        public C3779b(String str, int i) {
            this.f12391a = "";
            this.f12393c = 0;
            this.f12391a = str;
            this.f12393c = i;
        }

        /* renamed from: a */
        public void m1514a() {
            C3851e.m1317b("folder Name:" + this.f12391a + "   type:" + this.f12393c);
            Iterator<String> it = this.f12392b.iterator();
            while (it.hasNext()) {
                C3851e.m1317b("package Name:" + it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m1520b(Context context, String str) {
        SQLiteDatabase sQLiteDatabase = null;
        C3851e.m1317b("language:" + context.getResources().getConfiguration().locale.getLanguage());
        if (str != null && str.length() != 0) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    C3851e.m1317b("errno:" + jSONObject.getInt("errno"));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    Iterator<String> keys = jSONObject2.keys();
                    sQLiteDatabase = C3776c.m1527a(context).getWritableDatabase();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        String string = jSONObject3.getString("name");
                        int i = jSONObject3.getInt("cid");
                        int m1526a = m1526a(i);
                        if (m1526a == 404) {
                            C3851e.m1317b("packagename : " + next + " : " + string + "  cid: " + i);
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(C3774a.f12380b, next);
                        contentValues.put(C3774a.f12379a, Integer.valueOf(m1526a));
                        sQLiteDatabase.insert("application", null, contentValues);
                    }
                    sQLiteDatabase.close();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m1518b(java.util.ArrayList<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.classification.C3777d.m1518b(java.util.ArrayList):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static C3778a m1517c(Context context, ArrayList<String> arrayList) {
        C3779b c3779b;
        SQLiteDatabase readableDatabase = C3776c.m1527a(context).getReadableDatabase();
        C3778a c3778a = new C3778a(context);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Cursor query = readableDatabase.query("application", null, C3774a.f12380b + "=?", new String[]{next}, null, null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex(C3774a.f12379a);
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        int m1526a = m1526a(query.getInt(columnIndex));
                        if (c3778a.f12389a.containsKey(Integer.valueOf(m1526a))) {
                            c3779b = c3778a.f12389a.get(Integer.valueOf(m1526a));
                        } else {
                            c3779b = new C3779b(m1525a(context, m1526a), m1526a);
                            c3778a.f12389a.put(Integer.valueOf(m1526a), c3779b);
                        }
                        c3779b.f12392b.add(next);
                    }
                    query.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        readableDatabase.close();
        c3778a.m1515a();
        return c3778a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static ArrayList<String> m1516d(Context context, ArrayList<String> arrayList) {
        SQLiteDatabase readableDatabase = C3776c.m1527a(context).getReadableDatabase();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Cursor query = readableDatabase.query("application", null, C3774a.f12380b + "=?", new String[]{next}, null, null, null);
            if (query != null) {
                if (query.getCount() == 0) {
                    arrayList2.add(next);
                }
                query.close();
            } else {
                arrayList2.add(next);
            }
        }
        readableDatabase.close();
        return arrayList2;
    }

    /* renamed from: com.tsf.shell.plugin.classification.d$c */
    /* loaded from: classes.dex */
    private static class AsyncTaskC3780c extends AsyncTask<Void, Void, C3778a> {

        /* renamed from: a */
        private Context f12394a;

        /* renamed from: b */
        private InterfaceC3781d f12395b;

        /* renamed from: c */
        private ArrayList<String> f12396c;

        public AsyncTaskC3780c(Context context, ArrayList<String> arrayList, InterfaceC3781d interfaceC3781d) {
            this.f12394a = context;
            this.f12395b = interfaceC3781d;
            this.f12396c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public C3778a doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            ArrayList m1516d = C3777d.m1516d(this.f12394a, this.f12396c);
            C3851e.m1317b("filterPackage:" + m1516d.size());
            if (isCancelled()) {
                return null;
            }
            if (m1516d.size() > 0) {
                String m1518b = C3777d.m1518b(m1516d);
                if (m1518b != null) {
                    C3777d.m1520b(this.f12394a, m1518b);
                } else {
                    if (this.f12395b != null) {
                        this.f12395b.mo1511a();
                    }
                    cancel(true);
                    return null;
                }
            }
            if (isCancelled()) {
                return null;
            }
            return C3777d.m1517c(this.f12394a, this.f12396c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(C3778a c3778a) {
            if (this.f12395b != null && c3778a != null) {
                this.f12395b.mo1510a(c3778a);
            } else {
                Toast.makeText(this.f12394a, C3852f.C3862j.httpError, 1).show();
            }
        }
    }
}
