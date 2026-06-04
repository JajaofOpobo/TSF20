package com.tsf.shell.services;

/* loaded from: classes.dex */
final class d implements Runnable {
    final /* synthetic */ c a;
    private final /* synthetic */ String b;

    d(c cVar, String str) {
        this.a = cVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a aVar;
        e eVar;
        a aVar2;
        a aVar3;
        e eVar2;
        a aVar4;
        a aVar5;
        e eVar3;
        a aVar6;
        a aVar7;
        e eVar4;
        a aVar8;
        if (this.b.equals("com.tsf.shell.services.notifier.smsOnChange")) {
            try {
                aVar = this.a.a;
                eVar = aVar.d;
                aVar2 = this.a.a;
                eVar.a(aVar2.a.a());
                return;
            } catch (Exception e) {
                return;
            }
        }
        if (this.b.equals("com.tsf.shell.services.notifier.misscallOnChange")) {
            try {
                aVar3 = this.a.a;
                eVar2 = aVar3.d;
                aVar4 = this.a.a;
                eVar2.b(aVar4.a.b());
                return;
            } catch (Exception e2) {
                return;
            }
        }
        if (this.b.equals("com.tsf.shell.services.notifier.eventOnchange")) {
            try {
                aVar5 = this.a.a;
                eVar3 = aVar5.d;
                aVar6 = this.a.a;
                eVar3.c(aVar6.a.c());
                return;
            } catch (Exception e3) {
                return;
            }
        }
        if (this.b.equals("com.tsf.shell.services.notifier.gmailOnchange")) {
            try {
                aVar7 = this.a.a;
                eVar4 = aVar7.d;
                aVar8 = this.a.a;
                eVar4.d(aVar8.a.d());
            } catch (Exception e4) {
            }
        }
    }
}
