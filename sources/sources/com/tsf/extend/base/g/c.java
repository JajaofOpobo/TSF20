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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends d {
    private j.a f;

    public c(Context context, Intent intent, j.a aVar) {
        super(context, intent, null, null);
        this.f = aVar;
    }

    @Override // com.tsf.extend.base.g.d
    protected void a() {
        super.a();
        String stringExtra = this.a.getStringExtra("WEB_URL");
        String stringExtra2 = this.a.getStringExtra("android.intent.extra.TEXT");
        Intent intent = this.a;
        StringBuilder sbAppend = new StringBuilder().append(stringExtra2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("android.intent.extra.TEXT", sbAppend.append(stringExtra).toString());
    }

    @Override // com.tsf.extend.base.g.d
    public boolean a(Context context) {
        return a(context, true);
    }

    public boolean a(Context context, boolean z) {
        this.e = context;
        if (!c()) {
            return b();
        }
        am amVar = new am(context, z);
        amVar.a(new am.a() { // from class: com.tsf.extend.base.g.c.1
            @Override // com.tsf.extend.theme.am.a
            public void a(AdapterView<?> adapterView, View view, int i, long j) {
                d bVar;
                an anVar = (an) adapterView.getAdapter().getItem(i);
                c.this.a.setPackage(anVar.e());
                ResolveInfo resolveInfoA = anVar.a();
                if (resolveInfoA != null) {
                    if (c.this.f != null) {
                        c.this.f.a(new ComponentName(resolveInfoA.activityInfo.packageName, resolveInfoA.activityInfo.name).flattenToShortString());
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
                    bVar = new a(c.this.e, c.this.a);
                } else if (anVar.d() != al.a[1]) {
                    bVar = null;
                } else {
                    bVar = new b(c.this.e, c.this.a);
                }
                if (bVar != null) {
                    bVar.a(c.this.e);
                }
                if (c.this.f != null) {
                    c.this.f.a(bVar.c);
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
}
