package com.flurry.sdk;

import java.util.Timer;
import java.util.TimerTask;
/* renamed from: com.flurry.sdk.dm */
/* loaded from: classes.dex */
class C1207dm {

    /* renamed from: a */
    private Timer f3880a;

    /* renamed from: b */
    private C1208a f3881b;

    /* renamed from: c */
    private InterfaceC1209b f3882c;

    /* renamed from: com.flurry.sdk.dm$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1209b {
        /* renamed from: q */
        void mo9403q();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.flurry.sdk.dm$a */
    /* loaded from: classes.dex */
    public class C1208a extends TimerTask {

        /* renamed from: b */
        private InterfaceC1209b f3884b;

        C1208a(InterfaceC1209b interfaceC1209b) {
            this.f3884b = interfaceC1209b;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C1207dm.this.m9406a();
            if (this.f3884b != null) {
                this.f3884b.mo9403q();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1207dm(InterfaceC1209b interfaceC1209b) {
        this.f3882c = interfaceC1209b;
    }

    /* renamed from: a */
    public synchronized void m9405a(long j) {
        if (m9404b()) {
            m9406a();
        }
        this.f3880a = new Timer("FlurrySessionTimer");
        this.f3881b = new C1208a(this.f3882c);
        this.f3880a.schedule(this.f3881b, j);
    }

    /* renamed from: a */
    public synchronized void m9406a() {
        if (this.f3880a != null) {
            this.f3880a.cancel();
            this.f3880a = null;
        }
        this.f3881b = null;
    }

    /* renamed from: b */
    public boolean m9404b() {
        return this.f3880a != null;
    }
}
