package com.tsf.shell.widget.alarm;

/* loaded from: classes.dex */
class g extends Thread {
    final /* synthetic */ e a;

    g(e eVar) {
        this.a = eVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        com.tsf.shell.widget.alarm.service.g gVar;
        gVar = this.a.g;
        gVar.a(new com.tsf.shell.widget.alarm.service.h() { // from class: com.tsf.shell.widget.alarm.g.1
            @Override // com.tsf.shell.widget.alarm.service.h
            public void a(com.tsf.shell.widget.alarm.service.d dVar) {
                m mVar;
                com.tsf.shell.widget.alarm.c.a aVar;
                int i;
                m mVar2;
                com.tsf.shell.widget.alarm.AlarmUtils.b bVar;
                boolean z;
                String str;
                com.tsf.shell.widget.alarm.AlarmUtils.b bVar2;
                com.tsf.shell.widget.alarm.c.j jVar;
                mVar = g.this.a.t;
                int c = mVar.c();
                aVar = g.this.a.x;
                boolean b = aVar.b();
                if (c == 12) {
                    i = b ? 0 : 12;
                } else {
                    i = b ? c : c + 12;
                }
                mVar2 = g.this.a.u;
                int c2 = mVar2.c();
                u.c("Compass getCurrent " + i + ":" + c2);
                for (int i2 = 0; i2 < 7; i2++) {
                    bVar2 = g.this.a.l;
                    jVar = g.this.a.v;
                    bVar2.a(i2, jVar.a(i2));
                }
                boolean z2 = e.a;
                bVar = g.this.a.l;
                int a = bVar.a();
                z = g.this.a.m;
                str = g.this.a.n;
                dVar.a(1, z2, i, c2, a, z, null, str);
            }
        });
    }
}
