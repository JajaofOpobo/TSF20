package com.flurry.android;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class w {
    private static w a;
    private HashMap b = new HashMap();

    w() {
    }

    static w a() {
        if (a == null) {
            a = new w();
        }
        return a;
    }

    final void a(v vVar) {
        try {
            if (vVar.b().length() != 0) {
                synchronized (this) {
                    if (this.b.containsKey(vVar.b())) {
                        this.b.remove(vVar.b());
                        if (vVar.e() != -1) {
                            this.b.put(vVar.b(), vVar);
                        }
                    } else {
                        this.b.put(vVar.b(), vVar);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    final v a(String str) {
        try {
            synchronized (this) {
                if (!this.b.containsKey(str)) {
                    return null;
                }
                return (v) this.b.get(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    final List b() {
        ArrayList arrayList;
        try {
            synchronized (this) {
                arrayList = new ArrayList();
                Iterator it = this.b.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((v) it.next()).a());
                }
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    final void b(String str) {
        try {
            synchronized (this) {
                if (this.b.containsKey(str)) {
                    this.b.remove(str);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    final void c() {
        try {
            synchronized (this) {
                for (v vVar : b()) {
                    if (a(vVar.h())) {
                        String str = "expiring adunit freq cap for idHash: " + vVar.b() + " adunit exp: " + vVar.h() + " device epoch" + System.currentTimeMillis();
                        b(vVar.b());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static boolean a(long j) {
        return j <= System.currentTimeMillis();
    }
}
