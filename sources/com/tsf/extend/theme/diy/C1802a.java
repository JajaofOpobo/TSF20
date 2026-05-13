package com.tsf.extend.theme.diy;

import android.content.Context;
import com.tsf.extend.theme.AbstractC1700aq;
import java.io.File;
/* renamed from: com.tsf.extend.theme.diy.a */
/* loaded from: classes.dex */
public class C1802a extends AbstractC1700aq {
    @Override // com.tsf.extend.theme.C1848k
    /* renamed from: a */
    public int mo7323a() {
        return 2;
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: b */
    protected String mo7434b() {
        return "res/drawable-xhdpi";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: c_ */
    protected String mo7433c_() {
        return "res/hd_preview";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: d */
    public String mo7432d() {
        return "DIY_";
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: a */
    public File mo7436a(Context context) {
        File g = m7753g(context);
        if (g == null) {
            return null;
        }
        File file = new File(g, "res/raw");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "wallpaper_background.png");
    }

    @Override // com.tsf.extend.theme.AbstractC1700aq
    /* renamed from: a */
    public String mo7435a(String str) {
        return m7764I() + "/res/drawable-xhdpi/" + str;
    }
}
