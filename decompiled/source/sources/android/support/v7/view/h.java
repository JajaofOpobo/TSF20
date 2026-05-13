package android.support.v7.view;

import android.support.v4.view.bb;
import android.support.v4.view.bf;
import android.support.v4.view.bg;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {
    private Interpolator c;
    private bf d;
    private boolean e;
    private long b = -1;
    private final bg f = new bg() { // from class: android.support.v7.view.h.1
        private boolean b = false;
        private int c = 0;

        @Override // android.support.v4.view.bg, android.support.v4.view.bf
        public void a(View view) {
            if (!this.b) {
                this.b = true;
                if (h.this.d != null) {
                    h.this.d.a(null);
                }
            }
        }

        void a() {
            this.c = 0;
            this.b = false;
            h.this.c();
        }

        @Override // android.support.v4.view.bg, android.support.v4.view.bf
        public void b(View view) {
            int i = this.c + 1;
            this.c = i;
            if (i == h.this.a.size()) {
                if (h.this.d != null) {
                    h.this.d.b(null);
                }
                a();
            }
        }
    };
    private final ArrayList<bb> a = new ArrayList<>();

    public h a(bb bbVar) {
        if (!this.e) {
            this.a.add(bbVar);
        }
        return this;
    }

    public h a(bb bbVar, bb bbVar2) {
        this.a.add(bbVar);
        bbVar2.b(bbVar.a());
        this.a.add(bbVar2);
        return this;
    }

    public void a() {
        if (!this.e) {
            Iterator<bb> it = this.a.iterator();
            while (it.hasNext()) {
                bb next = it.next();
                if (this.b >= 0) {
                    next.a(this.b);
                }
                if (this.c != null) {
                    next.a(this.c);
                }
                if (this.d != null) {
                    next.a(this.f);
                }
                next.c();
            }
            this.e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.e = false;
    }

    public void b() {
        if (this.e) {
            Iterator<bb> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.e = false;
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.b = j;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h a(bf bfVar) {
        if (!this.e) {
            this.d = bfVar;
        }
        return this;
    }
}
