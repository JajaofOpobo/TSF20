package com.flurry.android;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class an extends RelativeLayout {
    private static String a = "FlurryAgent";
    private final s b;
    private final Context c;
    private final String d;
    private final ViewGroup e;
    private long f;
    private final ScheduledExecutorService g;
    private final Runnable h;
    private ScheduledFuture i;

    static /* synthetic */ boolean a(an anVar) {
        eb e = anVar.e();
        return e != null && e.d();
    }

    static /* synthetic */ void c(an anVar) {
        String str = "Rotating banner for adSpace: " + anVar.d;
        anVar.b.a(anVar.c, anVar.d, q.BANNER_BOTTOM, anVar.e);
    }

    public an(s sVar, Context context, String str, ViewGroup viewGroup) {
        super(context);
        this.g = Executors.newSingleThreadScheduledExecutor();
        this.h = new ds(this, (byte) 0);
        this.b = sVar;
        this.c = context;
        this.d = str;
        this.e = viewGroup;
    }

    public final ViewGroup a() {
        return this.e;
    }

    public final synchronized void a(long j) {
        if (this.f != j) {
            d();
            this.f = j;
            if (this.i == null && 0 != this.f) {
                String str = "schedule banner rotation for adSpace = " + this.d + " with fixed rate in milliseconds = " + this.f;
                this.i = this.g.scheduleAtFixedRate(new bj(this), this.f, this.f, TimeUnit.MILLISECONDS);
            }
        }
    }

    private synchronized void c() {
        d();
        this.f = 0L;
        removeCallbacks(this.h);
    }

    private void d() {
        if (this.i != null) {
            String str = "cancel banner rotation for adSpace = " + this.d + " with fixed rate in milliseconds = " + this.f;
            this.i.cancel(true);
            this.i = null;
        }
    }

    public final void b() {
        c();
        eb e = e();
        if (e != null) {
            e.b();
        }
    }

    private eb e() {
        if (getChildCount() <= 0) {
            return null;
        }
        try {
            return (eb) getChildAt(0);
        } catch (ClassCastException e) {
            return null;
        }
    }
}
