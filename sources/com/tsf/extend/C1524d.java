package com.tsf.extend;

import android.text.TextUtils;
import com.tsf.extend.base.p080j.C1433l;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.d */
/* loaded from: classes.dex */
public class C1524d {

    /* renamed from: a */
    public static final String f4795a = C1318a.f4121c;

    /* renamed from: b */
    public static final String f4796b = C1318a.f4122d;

    /* renamed from: c */
    public static final String f4797c = C1318a.f4128j;

    /* renamed from: d */
    public static final String f4798d = C1318a.f4129k;

    /* renamed from: e */
    public static final String f4799e = C1318a.f4126h;

    /* renamed from: f */
    public static final String f4800f = C1318a.f4127i;

    /* renamed from: g */
    public static final String f4801g = C1318a.f4123e;

    /* renamed from: h */
    public static final String f4802h = C1318a.f4125g;

    /* renamed from: i */
    public static final String f4803i = C1318a.f4124f;

    /* renamed from: j */
    public static final String f4804j = C1318a.f4131m;

    /* renamed from: n */
    private static C1524d f4805n = new C1524d();

    /* renamed from: k */
    MessageDigest f4806k = null;

    /* renamed from: l */
    public final int f4807l = 2000;

    /* renamed from: m */
    public Map<Long, C1525a> f4808m = new HashMap(2000);

    /* renamed from: a */
    public static C1524d m8329a() {
        return f4805n;
    }

    /* renamed from: com.tsf.extend.d$a */
    /* loaded from: classes.dex */
    public class C1525a {

        /* renamed from: a */
        int f4809a;

        /* renamed from: b */
        String f4810b;

        public C1525a(int i, String str) {
            this.f4809a = i;
            this.f4810b = str;
        }
    }

    /* renamed from: a */
    public C1525a m8328a(String str) {
        C1525a c1525a;
        long m8326b = m8326b(str);
        if (m8326b == 0) {
            return null;
        }
        m8325c();
        if (this.f4808m == null || (c1525a = this.f4808m.get(Long.valueOf(m8326b))) == null) {
            return null;
        }
        return c1525a;
    }

    /* renamed from: b */
    public void m8327b() {
        this.f4808m.clear();
    }

    /* renamed from: b */
    public long m8326b(String str) {
        if (this.f4806k == null) {
            try {
                this.f4806k = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return 0L;
            }
        } else {
            this.f4806k.reset();
        }
        try {
            this.f4806k.update(str.getBytes());
            return ByteBuffer.wrap(this.f4806k.digest()).getLong();
        } catch (Exception e2) {
            return 0L;
        }
    }

    /* renamed from: c */
    public void m8325c() {
        if (this.f4808m.isEmpty()) {
            LinkedHashMap<Long, String> m8324d = m8324d();
            int size = m8324d.size();
            Iterator<Map.Entry<Long, String>> it = m8324d.entrySet().iterator();
            while (true) {
                int i = size;
                if (it.hasNext()) {
                    Map.Entry<Long, String> next = it.next();
                    this.f4808m.put(next.getKey(), new C1525a(i, next.getValue()));
                    size = i - 1;
                } else {
                    m8324d.clear();
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private LinkedHashMap<Long, String> m8324d() {
        LinkedHashMap<Long, String> linkedHashMap = new LinkedHashMap<>(2000);
        JSONObject m8646a = C1433l.m8646a(C1547h.m8290b(), "categorylist");
        if (m8646a != null) {
            try {
                JSONArray jSONArray = m8646a.getJSONArray("category");
                if (jSONArray != null) {
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (i2 >= jSONArray.length()) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i2);
                        String string = jSONObject.getString("gptype");
                        if (TextUtils.isEmpty(string)) {
                            string = jSONObject.getString("cmltype");
                        }
                        linkedHashMap.put(Long.valueOf(jSONObject.getLong("name")), string);
                        i = i2 + 1;
                    }
                }
            } catch (Exception e) {
            }
        }
        return linkedHashMap;
    }
}
