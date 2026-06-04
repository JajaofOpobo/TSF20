package com.tsf.shell.workspace3D;

/* loaded from: classes.dex */
final class aq implements Runnable {
    final /* synthetic */ ap a;

    aq(ap apVar) {
        this.a = apVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tsf.shell.services.a aVar;
        com.tsf.shell.services.a aVar2;
        com.tsf.shell.services.a aVar3;
        int i;
        int i2;
        int i3;
        try {
            ap apVar = this.a;
            aVar = this.a.f;
            apVar.a = aVar.a.a();
            ap apVar2 = this.a;
            aVar2 = this.a.f;
            apVar2.b = aVar2.a.b();
            ap apVar3 = this.a;
            aVar3 = this.a.f;
            apVar3.c = aVar3.a.d();
            ap apVar4 = this.a;
            i = this.a.a;
            apVar4.a(i);
            ap apVar5 = this.a;
            i2 = this.a.b;
            apVar5.b(i2);
            ap apVar6 = this.a;
            i3 = this.a.c;
            apVar6.d(i3);
            this.a.e = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
