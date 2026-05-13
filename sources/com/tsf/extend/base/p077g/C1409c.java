package com.tsf.extend.base.p077g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import com.tsf.extend.theme.C1688al;
import com.tsf.extend.theme.C1695an;
import com.tsf.extend.theme.C1846j;
import com.tsf.extend.theme.DialogC1691am;
/* renamed from: com.tsf.extend.base.g.c */
/* loaded from: classes.dex */
public class C1409c extends C1411d {

    /* renamed from: f */
    private C1846j.InterfaceC1847a f4379f;

    public C1409c(Context context, Intent intent, C1846j.InterfaceC1847a interfaceC1847a) {
        super(context, intent, null, null);
        this.f4379f = interfaceC1847a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: a */
    public void mo8756a() {
        super.mo8756a();
        String stringExtra = this.f4381a.getStringExtra("WEB_URL");
        String stringExtra2 = this.f4381a.getStringExtra("android.intent.extra.TEXT");
        Intent intent = this.f4381a;
        StringBuilder append = new StringBuilder().append(stringExtra2);
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("android.intent.extra.TEXT", append.append(stringExtra).toString());
    }

    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: a */
    public boolean mo8761a(Context context) {
        return m8763a(context, true);
    }

    /* renamed from: a */
    public boolean m8763a(Context context, boolean z) {
        this.f4385e = context;
        if (m8757c()) {
            DialogC1691am dialogC1691am = new DialogC1691am(context, z);
            dialogC1691am.m7797a(new DialogC1691am.InterfaceC1694a() { // from class: com.tsf.extend.base.g.c.1
                /* JADX WARN: Type inference failed for: r0v0, types: [android.widget.Adapter] */
                @Override // com.tsf.extend.theme.DialogC1691am.InterfaceC1694a
                /* renamed from: a */
                public void mo7790a(AdapterView<?> adapterView, View view, int i, long j) {
                    C1411d c1411d;
                    C1695an c1695an = (C1695an) adapterView.getAdapter().getItem(i);
                    C1409c.this.f4381a.setPackage(c1695an.m7781e());
                    ResolveInfo m7789a = c1695an.m7789a();
                    if (m7789a != null) {
                        if (C1409c.this.f4379f != null) {
                            C1409c.this.f4379f.mo7332a(new ComponentName(m7789a.activityInfo.packageName, m7789a.activityInfo.name).flattenToShortString());
                        }
                        try {
                            C1409c.this.f4385e.startActivity(C1409c.this.f4381a);
                            return;
                        } catch (RuntimeException e) {
                            Log.w("ShareData", "Cannot launch sharing activity:" + e);
                            return;
                        }
                    }
                    if (c1695an.m7782d() == C1688al.f5441a[0]) {
                        c1411d = new C1407a(C1409c.this.f4385e, C1409c.this.f4381a);
                    } else if (c1695an.m7782d() != C1688al.f5441a[1]) {
                        c1411d = null;
                    } else {
                        c1411d = new C1408b(C1409c.this.f4385e, C1409c.this.f4381a);
                    }
                    if (c1411d != null) {
                        c1411d.mo8761a(C1409c.this.f4385e);
                    }
                    if (C1409c.this.f4379f != null) {
                        C1409c.this.f4379f.mo7332a(c1411d.f4383c);
                    }
                }

                @Override // com.tsf.extend.theme.DialogC1691am.InterfaceC1694a
                /* renamed from: a */
                public void mo7791a() {
                    if (C1409c.this.f4379f != null) {
                        C1409c.this.f4379f.mo7333a();
                    }
                }
            });
            try {
                dialogC1691am.show();
            } catch (Exception e) {
            }
            return true;
        }
        return mo8755b();
    }
}
