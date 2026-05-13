package com.tsf.shell.plugin.classification;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.widget.Toast;
import com.tsf.shell.plugin.themepicker.e;
import com.tsf.shell.plugin.themepicker.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class d {
    public static String a = "http://api.tsfui.com/index.php?type=1&";
    public static String b = "en";

    /* renamed from: com.tsf.shell.plugin.classification.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0151d {
        void a();

        void a(a aVar);
    }

    public static AsyncTask a(Context context, ArrayList<String> arrayList, InterfaceC0151d interfaceC0151d) {
        return new c(context, arrayList, interfaceC0151d).execute(new Void[0]);
    }

    public static int a(int i) {
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

    public static String a(Context context, int i) {
        switch (i) {
            case 2:
                return context.getString(f.j.packageapp_category_game);
            case 11:
                return context.getString(f.j.packageapp_category_tool);
            case 12:
                return context.getString(f.j.packageapp_category_social);
            case 14:
                return context.getString(f.j.packageapp_category_media);
            case 15:
                return context.getString(f.j.packageapp_category_reading);
            case 16:
                return context.getString(f.j.packageapp_category_life);
            case 18:
                return context.getString(f.j.packageapp_category_theme);
            case 102111:
                return context.getString(f.j.packageapp_category_edu);
            case 102230:
                return context.getString(f.j.packageapp_category_shopping);
            case 102231:
                return context.getString(f.j.packageapp_category_travel);
            default:
                return context.getString(f.j.packageapp_category_other);
        }
    }

    /* loaded from: classes.dex */
    public static class a {
        public Map<Integer, b> a = new HashMap();
        public b[] b;

        public a(Context context) {
        }

        public void a() {
            this.b = new b[this.a.size()];
            Iterator<Map.Entry<Integer, b>> it = this.a.entrySet().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (it.hasNext()) {
                    this.b[i2] = it.next().getValue();
                    i = i2 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public String a;
        public ArrayList<String> b = new ArrayList<>();
        public int c;

        public b(String str, int i) {
            this.a = "";
            this.c = 0;
            this.a = str;
            this.c = i;
        }

        public void a() {
            e.b("folder Name:" + this.a + "   type:" + this.c);
            Iterator<String> it = this.b.iterator();
            while (it.hasNext()) {
                e.b("package Name:" + it.next());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        SQLiteDatabase sQLiteDatabase = null;
        e.b("language:" + context.getResources().getConfiguration().locale.getLanguage());
        if (str != null && str.length() != 0) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    e.b("errno:" + jSONObject.getInt("errno"));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    Iterator<String> keys = jSONObject2.keys();
                    sQLiteDatabase = com.tsf.shell.plugin.classification.c.a(context).getWritableDatabase();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        String string = jSONObject3.getString("name");
                        int i = jSONObject3.getInt("cid");
                        int a2 = a(i);
                        if (a2 == 404) {
                            e.b("packagename : " + next + " : " + string + "  cid: " + i);
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(com.tsf.shell.plugin.classification.a.b, next);
                        contentValues.put(com.tsf.shell.plugin.classification.a.a, Integer.valueOf(a2));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.util.ArrayList<java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.classification.d.b(java.util.ArrayList):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a c(Context context, ArrayList<String> arrayList) {
        b bVar;
        SQLiteDatabase readableDatabase = com.tsf.shell.plugin.classification.c.a(context).getReadableDatabase();
        a aVar = new a(context);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Cursor query = readableDatabase.query("application", null, com.tsf.shell.plugin.classification.a.b + "=?", new String[]{next}, null, null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex(com.tsf.shell.plugin.classification.a.a);
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        int a2 = a(query.getInt(columnIndex));
                        if (aVar.a.containsKey(Integer.valueOf(a2))) {
                            bVar = aVar.a.get(Integer.valueOf(a2));
                        } else {
                            bVar = new b(a(context, a2), a2);
                            aVar.a.put(Integer.valueOf(a2), bVar);
                        }
                        bVar.b.add(next);
                    }
                    query.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        readableDatabase.close();
        aVar.a();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList<String> d(Context context, ArrayList<String> arrayList) {
        SQLiteDatabase readableDatabase = com.tsf.shell.plugin.classification.c.a(context).getReadableDatabase();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            Cursor query = readableDatabase.query("application", null, com.tsf.shell.plugin.classification.a.b + "=?", new String[]{next}, null, null, null);
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

    /* loaded from: classes.dex */
    private static class c extends AsyncTask<Void, Void, a> {
        private Context a;
        private InterfaceC0151d b;
        private ArrayList<String> c;

        public c(Context context, ArrayList<String> arrayList, InterfaceC0151d interfaceC0151d) {
            this.a = context;
            this.b = interfaceC0151d;
            this.c = arrayList;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public a doInBackground(Void... voidArr) {
            if (isCancelled()) {
                return null;
            }
            ArrayList d = d.d(this.a, this.c);
            e.b("filterPackage:" + d.size());
            if (isCancelled()) {
                return null;
            }
            if (d.size() > 0) {
                String b = d.b(d);
                if (b != null) {
                    d.b(this.a, b);
                } else {
                    if (this.b != null) {
                        this.b.a();
                    }
                    cancel(true);
                    return null;
                }
            }
            if (isCancelled()) {
                return null;
            }
            return d.c(this.a, this.c);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(a aVar) {
            if (this.b != null && aVar != null) {
                this.b.a(aVar);
            } else {
                Toast.makeText(this.a, f.j.httpError, 1).show();
            }
        }
    }
}
