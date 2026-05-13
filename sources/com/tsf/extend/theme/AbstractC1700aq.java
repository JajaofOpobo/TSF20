package com.tsf.extend.theme;

import android.content.Context;
import android.text.TextUtils;
import com.tsf.extend.base.p080j.C1423d;
import com.tsf.extend.theme.diy.C1802a;
import com.tsf.extend.theme.diy.C1821e;
import java.io.File;
import java.io.FilenameFilter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.aq */
/* loaded from: classes.dex */
public abstract class AbstractC1700aq extends C1848k {

    /* renamed from: a */
    private boolean f5466a = false;

    /* renamed from: b */
    private String f5467b = null;

    /* renamed from: a */
    public abstract File mo7436a(Context context);

    /* renamed from: a */
    public abstract String mo7435a(String str);

    /* renamed from: b */
    protected abstract String mo7434b();

    /* renamed from: c_ */
    protected abstract String mo7433c_();

    /* renamed from: d */
    public abstract String mo7432d();

    /* renamed from: I */
    public String m7764I() {
        return this.f5467b;
    }

    /* renamed from: q */
    public void m7752q(String str) {
        this.f5467b = str;
    }

    /* renamed from: J */
    public JSONObject m7763J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", m7297h());
            jSONObject.put("dir", m7764I());
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    /* renamed from: a */
    public static AbstractC1700aq m7760a(JSONObject jSONObject) {
        AbstractC1700aq c1802a;
        String optString = jSONObject.optString("dir");
        if (optString == null) {
            return null;
        }
        if (new File(optString).getName().startsWith("CMT_")) {
            c1802a = new C1703b();
        } else {
            c1802a = new C1802a();
        }
        c1802a.m7320a(jSONObject.optLong("id"));
        c1802a.m7752q(jSONObject.optString("dir"));
        return c1802a;
    }

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: c */
    public String mo7313c() {
        JSONObject jSONObject;
        String mo7313c = super.mo7313c();
        if (mo7313c == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(mo7313c);
            } catch (JSONException e) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("dir", this.f5467b);
            jSONObject.put("isLocalDIY", this.f5466a);
        } catch (JSONException e2) {
        }
        return jSONObject.toString();
    }

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: a_ */
    public void mo7317a_(String str) {
        super.mo7317a_(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f5467b = jSONObject.optString("dir", null);
                this.f5466a = jSONObject.optBoolean("isLocalDIY", false);
            } catch (JSONException e) {
            }
        }
    }

    /* renamed from: r */
    public static String m7751r(String str) {
        if (str == null || !str.startsWith("DIY://")) {
            return null;
        }
        return str.substring(str.lastIndexOf("/") + 1, str.length()) + "_" + C1423d.m8688b();
    }

    /* renamed from: b */
    public File m7759b(Context context) {
        File m7753g = m7753g(context);
        if (m7753g == null) {
            return null;
        }
        File file = new File(m7753g, mo7433c_());
        if (!file.exists()) {
            file.mkdirs();
            return file;
        }
        return file;
    }

    /* renamed from: c */
    public File m7758c(Context context) {
        File m7753g = m7753g(context);
        if (m7753g == null) {
            return null;
        }
        File file = new File(m7753g, mo7434b());
        if (!file.exists()) {
            file.mkdirs();
            return file;
        }
        return file;
    }

    /* renamed from: d */
    public File m7757d(Context context) {
        return new File(m7758c(context), "launcher_preview" + System.currentTimeMillis() + ".png");
    }

    /* renamed from: e */
    public File[] m7756e(Context context) {
        return m7759b(context).listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.aq.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("launcher_preview");
            }
        });
    }

    /* renamed from: f */
    public File[] m7755f(Context context) {
        return m7758c(context).listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.aq.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("launcher_preview");
            }
        });
    }

    /* renamed from: g */
    public File m7753g(Context context) {
        if (!TextUtils.isEmpty(m7764I())) {
            File file = new File(m7764I());
            if (!file.exists()) {
                file.mkdirs();
                return file;
            }
            return file;
        }
        File m7387b = C1821e.m7387b(context);
        if (m7387b == null) {
            return null;
        }
        File file2 = new File(m7387b, mo7432d() + UUID.randomUUID().toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        m7752q(file2.getAbsolutePath());
        return file2;
    }

    /* renamed from: a */
    public File m7761a(Context context, int i) {
        return new File(m7759b(context), "launcher_preview" + i + ".png");
    }

    /* renamed from: f */
    public void m7754f(boolean z) {
        this.f5466a = z;
    }

    /* renamed from: K */
    public boolean m7762K() {
        return this.f5466a;
    }
}
