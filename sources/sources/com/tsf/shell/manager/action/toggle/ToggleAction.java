package com.tsf.shell.manager.action.toggle;

import android.content.Intent;
import com.tsf.shell.f.i.b.e.DrawerItemLaunchAction;
import com.tsf.shell.f.i.b.e.DrawerItemSettingsAction;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ToggleAction {
    public int a;
    private boolean d = false;
    private j c = new j(this);
    public ArrayList<i> b = new ArrayList<>();

    public ToggleAction(int i) {
        this.a = 0;
        this.a = i;
    }

    public j a() {
        this.d = true;
        this.c.aW();
        return this.c;
    }

    public void b() {
        this.d = false;
        if (this.b.isEmpty()) {
            this.c.aX();
        }
    }

    public void c() {
    }

    public void d() {
    }

    public void a(Intent intent) {
    }

    public void a(int i) {
        this.c.b(i);
    }

    public void b(int i) {
        this.c.c(i);
    }

    public void a(i iVar) {
        if (!this.b.contains(iVar)) {
            this.b.add(iVar);
            if (this.b.size() == 1) {
                ToggleAction();
            }
            iVar.a(this.c);
        }
    }

    public void b(i iVar) {
        this.b.remove(iVar);
        iVar.aW();
        if (this.b.isEmpty() && !this.d) {
            ToggleAction();
        }
    }

    public void e() {
        this.c.aX();
        ToggleAction();
    }

    public void f() {
        this.c.aW();
    }

    public void g() {
    }
}
