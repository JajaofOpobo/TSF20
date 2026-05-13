package com.tsf.shell.p096f.p131f;

import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.f.o */
/* loaded from: classes.dex */
public class C2989o {

    /* renamed from: a */
    private ArrayList<C2990a> f9777a = new ArrayList<>();

    /* renamed from: b */
    private C2932g f9778b;

    /* renamed from: com.tsf.shell.f.f.o$a */
    /* loaded from: classes.dex */
    public static class C2990a {
        /* renamed from: a */
        public void mo3846a(C2932g c2932g) {
        }

        /* renamed from: a */
        public void mo3847a() {
        }

        /* renamed from: b */
        public void mo3845b() {
        }
    }

    /* renamed from: a */
    public void m3849a(C2990a c2990a) {
        if (!this.f9777a.contains(c2990a)) {
            this.f9777a.add(c2990a);
        }
    }

    /* renamed from: a */
    public void m3851a() {
        Iterator<C2990a> it = this.f9777a.iterator();
        while (it.hasNext()) {
            it.next().mo3847a();
        }
    }

    /* renamed from: b */
    public void m3848b() {
        Iterator<C2990a> it = this.f9777a.iterator();
        while (it.hasNext()) {
            it.next().mo3845b();
        }
    }

    /* renamed from: a */
    public void m3850a(C2932g c2932g) {
        if (this.f9778b != c2932g) {
            this.f9778b = c2932g;
            Iterator<C2990a> it = this.f9777a.iterator();
            while (it.hasNext()) {
                it.next().mo3846a(c2932g);
            }
        }
    }
}
