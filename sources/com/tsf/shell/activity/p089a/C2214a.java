package com.tsf.shell.activity.p089a;

import android.content.Intent;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.shell.Home;
/* renamed from: com.tsf.shell.activity.a.a */
/* loaded from: classes.dex */
public class C2214a implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    private int f7262a;

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == this.f7262a) {
            mo738a(i2, intent);
        }
    }

    /* renamed from: a */
    public void mo738a(int i, Intent intent) {
        if (i == -1) {
        }
    }

    /* renamed from: a */
    public void m6078a(Intent intent) {
        this.f7262a = Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) this);
    }
}
