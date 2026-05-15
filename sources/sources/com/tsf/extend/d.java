package com.tsf.extend;

import android.text.TextUtils;
import com.tsf.extend.base.j.l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d {
    public static final String a = com.tsf.extend.a.c;
    public static final String b = com.tsf.extend.a.d;
    public static final String c = com.tsf.extend.a.j;
    public static final String d = com.tsf.extend.a.k;
    public static final String e = com.tsf.extend.a.h;
    public static final String f = com.tsf.extend.a.i;
    public static final String g = com.tsf.extend.a.e;
    public static final String h = com.tsf.extend.a.g;
    public static final String i = com.tsf.extend.a.f;
    public static final String j = com.tsf.extend.a.m;
    private static d n = new d();
    MessageDigest k = null;
    public final int l = 2000;
    public Map<Long, a> m = new HashMap(2000);

    public static d a() {
        return n;
    }

    public class a {
        int a;
        String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    public a a(String str) throws Throwable {
        a aVar;
        long jB = b(str);
        if (jB == 0) {
            return null;
        }
        c();
        if (this.m == null || (aVar = this.m.get(Long.valueOf(jB))) == null) {
            return null;
        }
        return aVar;
    }

    public void b() {
        this.m.clear();
    }

    public long b(String str) {
        if (this.k == null) {
            try {
                this.k = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e2) {
                e2.printStackTrace();
                return 0L;
            }
        } else {
            this.k.reset();
        }
        try {
            this.k.update(str.getBytes());
            return ByteBuffer.wrap(this.k.digest()).getLong();
        } catch (Exception e3) {
            return 0L;
        }
    }

    public void c() throws Throwable {
        if (this.m.isEmpty()) {
            LinkedHashMap<Long, String> linkedHashMapD = d();
            int size = linkedHashMapD.size();
            Iterator<Map.Entry<Long, String>> it = linkedHashMapD.entrySet().iterator();
            while (true) {
                int i2 = size;
                if (it.hasNext()) {
                    Map.Entry<Long, String> next = it.next();
                    this.m.put(next.getKey(), new a(i2, next.getValue()));
                    size = i2 - 1;
                } else {
                    linkedHashMapD.clear();
                    return;
                }
            }
        }
    }

    private LinkedHashMap<Long, String> d() throws Throwable {
        LinkedHashMap<Long, String> linkedHashMap = new LinkedHashMap<>(2000);
        JSONObject jSONObjectA = l.a(h.b(), "categorylist");
        if (jSONObjectA != null) {
            try {
                JSONArray jSONArray = jSONObjectA.getJSONArray("category");
                if (jSONArray != null) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2;
                        if (i3 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i3);
                        String string = jSONObject.getString("gptype");
                        if (TextUtils.isEmpty(string)) {
                            string = jSONObject.getString("cmltype");
                        }
                        linkedHashMap.put(Long.valueOf(jSONObject.getLong("name")), string);
                        i2 = i3 + 1;
                    }
                }
            } catch (Exception e2) {
            }
        }
        return linkedHashMap;
    }
}
