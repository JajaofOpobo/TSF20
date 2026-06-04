package com.tsf.shell;

/* loaded from: classes.dex */
final class ac extends Thread {
    final /* synthetic */ Home a;
    private final /* synthetic */ ap b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ac(Home home, String str, ap apVar) {
        super(str);
        this.a = home;
        this.b = apVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Home.b(this.a, this.b);
    }
}
