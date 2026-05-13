package com.tsf.shell.f.e.i;

import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes.dex */
public class b extends j {
    private static final int a = com.censivn.C3DEngine.b.b.a.b(120.0f);
    private static final int b = com.censivn.C3DEngine.b.b.a.b(32.0f);
    private static final int c = com.censivn.C3DEngine.b.b.a.b(10.0f);
    private static final int d = com.censivn.C3DEngine.b.b.a.b(15.0f);
    private ArrayList<a> e = new ArrayList<>();

    public b() {
        for (int i = 0; i < 5; i++) {
            this.e.add(new a());
        }
        int i2 = 1;
        float f = -a;
        float f2 = -c;
        float f3 = d;
        int i3 = 3;
        float f4 = a;
        float f5 = -c;
        float f6 = -d;
        this.e.get(2).a(0);
        while (i2 > -1) {
            a aVar = this.e.get(i2);
            aVar.a(Math.abs(i2 - 2));
            aVar.position().x = f;
            aVar.position().y = f2;
            aVar.a(f3);
            f -= a;
            i2--;
            f2 -= b;
            f3 = d + f3;
        }
        while (i3 < 5) {
            a aVar2 = this.e.get(i3);
            aVar2.a(Math.abs(i3 - 2));
            aVar2.position().x = f4;
            aVar2.position().y = f5;
            aVar2.a(f6);
            f4 += a;
            i3++;
            f5 -= b;
            f6 -= d;
        }
        Collections.sort(this.e, new Comparator<a>() { // from class: com.tsf.shell.f.e.i.b.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public final int compare(a aVar3, a aVar4) {
                if (aVar3.a() > aVar4.a()) {
                    return -1;
                }
                if (aVar3.a() < aVar4.a()) {
                    return 1;
                }
                return 0;
            }
        });
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            addChild(it.next());
        }
    }

    @Override // com.censivn.C3DEngine.b.f.j
    public void onDrawChildStart() {
        Iterator<i> it = children().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            aVar.a.position().setAllFrom(aVar.position());
            aVar.a.dispatchDraw();
        }
    }

    public void a() {
        a.b();
    }

    public void b() {
        Iterator<a> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void c() {
        b();
        int i = 0;
        Iterator<a> it = this.e.iterator();
        while (true) {
            int i2 = i;
            if (it.hasNext()) {
                it.next().b(i2);
                i = i2 + 170;
            } else {
                return;
            }
        }
    }
}
