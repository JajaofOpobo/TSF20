package com.tsf.shell.plugin.themepicker;

import android.content.Context;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ag extends com.tsf.shell.plugin.themepicker.utils.a {
    private String a;
    private ak e;
    private Context f;

    public ag(Context context, String str, ak akVar) {
        this.a = str;
        this.e = akVar;
        this.f = context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.shell.plugin.themepicker.utils.a
    public Void a(Void... voidArr) {
        Context a = ac.a(this.f, this.a);
        if (a != null) {
            String d = ac.d(a);
            String e = ac.e(a);
            ArrayList c = ac.c(a);
            if (c != null) {
                this.e.a(c, d, e);
            }
        }
        return null;
    }
}
