package com.tsf.extend.theme;

import android.content.Context;
import java.io.File;
/* renamed from: com.tsf.extend.theme.b */
/* loaded from: classes.dex */
public class C1703b extends AbstractC1700aq {

    /* renamed from: a */
    private String f5470a;

    /* renamed from: b */
    private boolean f5471b;

    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: a */
    public int mo7323a() {
        return 3;
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: b */
    protected String mo7434b() {
        return "theme/preview";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: c_ */
    protected String mo7433c_() {
        return "theme/hd_preview";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: d */
    public String mo7432d() {
        return "CMT_";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: a */
    public File mo7436a(Context context) {
        File g = m7753g(context);
        if (g == null) {
            return null;
        }
        File file = new File(g, "theme/wallpaper");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "wallpaper_background.jpg");
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: a */
    public String mo7435a(String str) {
        return m7764I() + "/theme/icons/" + str;
    }

    /* renamed from: e */
    public boolean m7748e() {
        return this.f5471b;
    }

    /* renamed from: a */
    public void m7750a(boolean z) {
        this.f5471b = z;
    }

    /* renamed from: f */
    public String m7747f() {
        return this.f5470a;
    }

    /* renamed from: b */
    public void m7749b(String str) {
        this.f5470a = str;
    }
}
