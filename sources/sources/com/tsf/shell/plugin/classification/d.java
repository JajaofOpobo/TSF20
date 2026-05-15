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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public static String a = "http://api.tsfui.com/index.php?type=1&";
    public static String b = "en";

    /* JADX INFO: renamed from: com.tsf.shell.plugin.classification.d$d, reason: collision with other inner class name */
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
        SQLiteDatabase writableDatabase = null;
        e.b("language:" + context.getResources().getConfiguration().locale.getLanguage());
        if (str != null && str.length() != 0) {
            try {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    e.b("errno:" + jSONObject.getInt("errno"));
                    JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                    Iterator<String> itKeys = jSONObject2.keys();
                    writableDatabase = com.tsf.shell.plugin.classification.c.a(context).getWritableDatabase();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                        String string = jSONObject3.getString("name");
                        int i = jSONObject3.getInt("cid");
                        int iA = a(i);
                        if (iA == 404) {
                            e.b("packagename : " + next + " : " + string + "  cid: " + i);
                        }
                        ContentValues contentValues = new ContentValues();
                        contentValues.put(com.tsf.shell.plugin.classification.a.b, next);
                        contentValues.put(com.tsf.shell.plugin.classification.a.a, Integer.valueOf(iA));
                        writableDatabase.insert("application", null, contentValues);
                    }
                    writableDatabase.close();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    writableDatabase.close();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(java.util.ArrayList<java.lang.String> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.classification.d.b(java.util.ArrayList):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a c(Context context, ArrayList<String> arrayList) {
        b bVar;
        SQLiteDatabase readableDatabase = com.tsf.shell.plugin.classification.c.a(context).getReadableDatabase();
        a aVar = new a(context);
        for (String str : arrayList) {
            try {
                Cursor cursorQuery = readableDatabase.query("application", null, com.tsf.shell.plugin.classification.a.b + "=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    int columnIndex = cursorQuery.getColumnIndex(com.tsf.shell.plugin.classification.a.a);
                    if (cursorQuery.getCount() != 0) {
                        cursorQuery.moveToFirst();
                        int iA = a(cursorQuery.getInt(columnIndex));
                        if (aVar.a.containsKey(Integer.valueOf(iA))) {
                            bVar = aVar.a.get(Integer.valueOf(iA));
                        } else {
                            bVar = new b(a(context, iA), iA);
                            aVar.a.put(Integer.valueOf(iA), bVar);
                        }
                        bVar.b.add(str);
                    }
                    cursorQuery.close();
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
        for (String str : arrayList) {
            Cursor cursorQuery = readableDatabase.query("application", null, com.tsf.shell.plugin.classification.a.b + "=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                if (cursorQuery.getCount() == 0) {
                    arrayList2.add(str);
                }
                cursorQuery.close();
            } else {
                arrayList2.add(str);
            }
        }
        readableDatabase.close();
        return arrayList2;
    }

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
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a doInBackground(Void... voidArr) throws Throwable {
            if (isCancelled()) {
                return null;
            }
            ArrayList arrayListD = d.d(this.a, this.c);
            e.b("filterPackage:" + arrayListD.size());
            if (isCancelled()) {
                return null;
            }
            if (arrayListD.size() > 0) {
                String strB = d.b(arrayListD);
                if (strB != null) {
                    d.b(this.a, strB);
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
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(a aVar) {
            if (this.b != null && aVar != null) {
                this.b.a(aVar);
            } else {
                Toast.makeText(this.a, f.j.httpError, 1).show();
            }
        }
    }
}
