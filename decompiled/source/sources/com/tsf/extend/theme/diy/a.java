package com.tsf.extend.theme.diy;

import android.content.Context;
import com.tsf.extend.theme.aq;
import java.io.File;
/* loaded from: classes.dex */
public class a extends aq {
    @Override // com.tsf.extend.theme.k
    public int a() {
        return 2;
    }

    @Override // com.tsf.extend.theme.aq
    protected String b() {
        return "res/drawable-xhdpi";
    }

    @Override // com.tsf.extend.theme.aq
    protected String c_() {
        return "res/hd_preview";
    }

    @Override // com.tsf.extend.theme.aq
    public String d() {
        return "DIY_";
    }

    @Override // com.tsf.extend.theme.aq
    public File a(Context context) {
        File g = g(context);
        if (g == null) {
            return null;
        }
        File file = new File(g, "res/raw");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, "wallpaper_background.png");
    }

    @Override // com.tsf.extend.theme.aq
    public String a(String str) {
        return I() + "/res/drawable-xhdpi/" + str;
    }
}
