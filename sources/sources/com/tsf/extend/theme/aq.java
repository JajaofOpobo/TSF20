package com.tsf.extend.theme;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public abstract class aq extends k {
    private boolean a = false;
    private String b = null;

    public abstract File a(Context context);

    public abstract String a(String str);

    protected abstract String b();

    protected abstract String c_();

    public abstract String d();

    public String I() {
        return this.b;
    }

    public void q(String str) {
        this.b = str;
    }

    public JSONObject J() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", h());
            jSONObject.put("dir", I());
            return jSONObject;
        } catch (JSONException e) {
            return null;
        }
    }

    public static aq a(JSONObject jSONObject) {
        aq aVar;
        String strOptString = jSONObject.optString("dir");
        if (strOptString == null) {
            return null;
        }
        if (new File(strOptString).getName().startsWith("CMT_")) {
            aVar = new b();
        } else {
            aVar = new com.tsf.extend.theme.diy.a();
        }
        aVar.a(jSONObject.optLong("id"));
        aVar.q(jSONObject.optString("dir"));
        return aVar;
    }

    @Override // com.tsf.extend.theme.k
    public String c() {
        JSONObject jSONObject;
        String strC = super.c();
        if (strC == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(strC);
            } catch (JSONException e) {
                jSONObject = null;
            }
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("dir", this.b);
            jSONObject.put("isLocalDIY", this.a);
        } catch (JSONException e2) {
        }
        return jSONObject.toString();
    }

    @Override // com.tsf.extend.theme.k
    public void a_(String str) {
        super.a_(str);
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.b = jSONObject.optString("dir", null);
                this.a = jSONObject.optBoolean("isLocalDIY", false);
            } catch (JSONException e) {
            }
        }
    }

    public static String r(String str) {
        if (str == null || !str.startsWith("DIY://")) {
            return null;
        }
        return str.substring(str.lastIndexOf("/") + 1, str.length()) + "_" + com.tsf.extend.base.j.d.b();
    }

    public File b(Context context) {
        File fileG = g(context);
        if (fileG == null) {
            return null;
        }
        File file = new File(fileG, c_());
        if (!file.exists()) {
            file.mkdirs();
            return file;
        }
        return file;
    }

    public File c(Context context) {
        File fileG = g(context);
        if (fileG == null) {
            return null;
        }
        File file = new File(fileG, b());
        if (!file.exists()) {
            file.mkdirs();
            return file;
        }
        return file;
    }

    public File d(Context context) {
        return new File(c(context), "launcher_preview" + System.currentTimeMillis() + ".png");
    }

    public File[] e(Context context) {
        return b(context).listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.aq.1
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("launcher_preview");
            }
        });
    }

    public File[] f(Context context) {
        return c(context).listFiles(new FilenameFilter() { // from class: com.tsf.extend.theme.aq.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.startsWith("launcher_preview");
            }
        });
    }

    public File g(Context context) {
        if (!TextUtils.isEmpty(I())) {
            File file = new File(I());
            if (!file.exists()) {
                file.mkdirs();
                return file;
            }
            return file;
        }
        File fileB = com.tsf.extend.theme.diy.e.b(context);
        if (fileB == null) {
            return null;
        }
        File file2 = new File(fileB, d() + UUID.randomUUID().toString());
        if (!file2.exists()) {
            file2.mkdirs();
        }
        q(file2.getAbsolutePath());
        return file2;
    }

    public File a(Context context, int i) {
        return new File(b(context), "launcher_preview" + i + ".png");
    }

    public void f(boolean z) {
        this.a = z;
    }

    public boolean K() {
        return this.a;
    }
}
