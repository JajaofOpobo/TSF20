package com.tsf.shell.plugin.classification;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.tsf.shell.plugin.themepicker.r;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d {
    public static String a = "http://api.tsfui.com/index.php?type=1&";
    public static String b = "en";

    public static AsyncTask a(Context context, ArrayList arrayList, h hVar) {
        return new g(context, arrayList, hVar).execute(new Void[0]);
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
                return context.getString(r.packageapp_category_game);
            case 11:
                return context.getString(r.packageapp_category_tool);
            case 12:
                return context.getString(r.packageapp_category_social);
            case 14:
                return context.getString(r.packageapp_category_media);
            case 15:
                return context.getString(r.packageapp_category_reading);
            case 16:
                return context.getString(r.packageapp_category_life);
            case 18:
                return context.getString(r.packageapp_category_theme);
            case 102111:
                return context.getString(r.packageapp_category_edu);
            case 102230:
                return context.getString(r.packageapp_category_shopping);
            case 102231:
                return context.getString(r.packageapp_category_travel);
            default:
                return context.getString(r.packageapp_category_other);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str) {
        SQLiteDatabase sQLiteDatabase = null;
        com.tsf.shell.plugin.themepicker.g.b("language:" + context.getResources().getConfiguration().locale.getLanguage());
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(str);
                        com.tsf.shell.plugin.themepicker.g.b("errno:" + jSONObject.getInt("errno"));
                        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                        Iterator<String> keys = jSONObject2.keys();
                        sQLiteDatabase = c.a(context).getWritableDatabase();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                            String string = jSONObject3.getString("name");
                            int i = jSONObject3.getInt("cid");
                            int a2 = a(i);
                            if (a2 == 404) {
                                com.tsf.shell.plugin.themepicker.g.b("packagename : " + next + " : " + string + "  cid: " + i);
                            }
                            ContentValues contentValues = new ContentValues();
                            contentValues.put(a.b, next);
                            contentValues.put(a.a, Integer.valueOf(a2));
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
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String b(ArrayList arrayList) {
        InputStream inputStream;
        String str;
        InputStream inputStream2 = null;
        com.tsf.shell.plugin.themepicker.g.b("ClassificationUtils doInBackground  :" + arrayList.size());
        long currentTimeMillis = System.currentTimeMillis();
        DefaultHttpClient defaultHttpClient = new DefaultHttpClient();
        HttpPost httpPost = new HttpPost(a);
        try {
            int size = arrayList.size();
            com.tsf.shell.plugin.themepicker.g.b("max:" + size);
            ArrayList arrayList2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList2.add(new BasicNameValuePair("ks[]", (String) arrayList.get(i)));
            }
            arrayList2.add(new BasicNameValuePair("lang", "en_US"));
            arrayList2.add(new BasicNameValuePair("type", "1"));
            httpPost.setEntity(new UrlEncodedFormEntity(arrayList2));
            com.tsf.shell.plugin.themepicker.g.b("httpclient.execute(httppost) start  ");
            HttpResponse execute = defaultHttpClient.execute(httpPost);
            com.tsf.shell.plugin.themepicker.g.b("response.getEntity() end  ");
            HttpEntity entity = execute.getEntity();
            if (entity != null) {
                inputStream = entity.getContent();
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr, 0, 1024);
                            if (read <= 0) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        str = new String(com.tsf.shell.plugin.a.a.a(new String(byteArrayOutputStream.toByteArray()), "1234567812345678"));
                        com.tsf.shell.plugin.themepicker.g.b("result:" + str);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } else {
                inputStream = null;
                str = null;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            com.tsf.shell.plugin.themepicker.g.b("parse cost:" + (System.currentTimeMillis() - currentTimeMillis));
            return str;
        } catch (Exception e5) {
            e = e5;
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e c(Context context, ArrayList arrayList) {
        f fVar;
        SQLiteDatabase readableDatabase = c.a(context).getReadableDatabase();
        e eVar = new e(context);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Cursor query = readableDatabase.query("application", null, String.valueOf(a.b) + "=?", new String[]{str}, null, null, null);
                if (query != null) {
                    int columnIndex = query.getColumnIndex(a.a);
                    if (query.getCount() != 0) {
                        query.moveToFirst();
                        int a2 = a(query.getInt(columnIndex));
                        if (eVar.a.containsKey(Integer.valueOf(a2))) {
                            fVar = (f) eVar.a.get(Integer.valueOf(a2));
                        } else {
                            fVar = new f(a(context, a2), a2);
                            eVar.a.put(Integer.valueOf(a2), fVar);
                        }
                        fVar.b.add(str);
                    }
                    query.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        readableDatabase.close();
        eVar.a();
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ArrayList d(Context context, ArrayList arrayList) {
        SQLiteDatabase readableDatabase = c.a(context).getReadableDatabase();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Cursor query = readableDatabase.query("application", null, String.valueOf(a.b) + "=?", new String[]{str}, null, null, null);
            if (query != null) {
                if (query.getCount() == 0) {
                    arrayList2.add(str);
                }
                query.close();
            } else {
                arrayList2.add(str);
            }
        }
        readableDatabase.close();
        return arrayList2;
    }
}
