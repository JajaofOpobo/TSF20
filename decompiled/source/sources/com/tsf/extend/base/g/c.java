package com.tsf.extend.base.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.tsf.extend.theme.al;
import com.tsf.extend.theme.am;
import com.tsf.extend.theme.an;
import com.tsf.extend.theme.j;
/* loaded from: classes.dex */
public class c extends d {
    private j.a f;

    public c(Context context, Intent intent, j.a aVar) {
        super(context, intent, null, null);
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.g.d
    public void a() {
        super.a();
        String stringExtra = this.a.getStringExtra("WEB_URL");
        String stringExtra2 = this.a.getStringExtra("android.intent.extra.TEXT");
        Intent intent = this.a;
        StringBuilder append = new StringBuilder().append(stringExtra2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("android.intent.extra.TEXT", append.append(stringExtra).toString());
    }

    @Override // com.tsf.extend.base.g.d
    public boolean a(Context context) {
        return a(context, true);
    }

    public boolean a(Context context, boolean z) {
        this.e = context;
        if (c()) {
            am amVar = new am(context, z);
            amVar.a(new am.a() { // from class: com.tsf.extend.base.g.c.1
                /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.Adapter] */
                @Override // com.tsf.extend.theme.am.a
                public void a(AdapterView<?> adapterView, View view, int i, long j) {
                    d dVar;
                    an anVar = (an) adapterView.getAdapter().getItem(i);
                    c.this.a.setPackage(anVar.e());
                    ResolveInfo a = anVar.a();
                    if (a != null) {
                        if (c.this.f != null) {
                            c.this.f.a(new ComponentName(a.activityInfo.packageName, a.activityInfo.name).flattenToShortString());
                        }
                        try {
                            c.this.e.startActivity(c.this.a);
                            return;
                        } catch (RuntimeException e) {
                            Log.w("ShareData", "Cannot launch sharing activity:" + e);
                            return;
                        }
                    }
                    if (anVar.d() == al.a[0]) {
                        dVar = new a(c.this.e, c.this.a);
                    } else if (anVar.d() != al.a[1]) {
                        dVar = null;
                    } else {
                        dVar = new b(c.this.e, c.this.a);
                    }
                    if (dVar != null) {
                        dVar.a(c.this.e);
                    }
                    if (c.this.f != null) {
                        c.this.f.a(dVar.c);
                    }
                }

                @Override // com.tsf.extend.theme.am.a
                public void a() {
                    if (c.this.f != null) {
                        c.this.f.a();
                    }
                }
            });
            try {
                amVar.show();
            } catch (Exception e) {
            }
            return true;
        }
        return b();
    }
}
