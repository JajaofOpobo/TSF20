package com.tsf.shell.manager.d;

import com.tsf.shell.e.e.g;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class a {
    private ArrayList a = new ArrayList();

    public void a(g gVar) {
        if (gVar != null) {
            if (this.a.contains(gVar)) {
                com.tsf.shell.a.a.a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.a.add(0, gVar);
                return;
            }
        }
        com.tsf.shell.a.a.a("HitTargetManager", "addHitTarget error ,target is null");
    }

    public void b(g gVar) {
        if (gVar != null) {
            if (this.a.contains(gVar)) {
                com.tsf.shell.a.a.a("HitTargetManager", "addHitTarget error ,target is exist");
                return;
            } else {
                this.a.add(gVar);
                return;
            }
        }
        com.tsf.shell.a.a.a("HitTargetManager", "addHitTarget error ,target is null");
    }

    public void c(g gVar) {
        if (this.a.contains(gVar)) {
            this.a.remove(gVar);
        } else {
            com.tsf.shell.a.a.a("HitTargetManager", "removeHitTarget error ,target is not exist");
        }
    }

    public ArrayList a() {
        return this.a;
    }
}
