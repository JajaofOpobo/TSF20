package com.tsf.shell.manager.a;

import android.content.ComponentName;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.ShellActivity;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class j {
    private static SharedPreferences e;
    private ArrayList b = new ArrayList();
    private ArrayList c = new ArrayList();
    private ArrayList a = new ArrayList();
    private k d = new k() { // from class: com.tsf.shell.manager.a.j.1
        @Override // com.tsf.shell.manager.a.k, com.tsf.shell.manager.a.e
        public void b(com.tsf.shell.e.i.b.e.i iVar, boolean z) {
            if (j.this.a.contains(iVar)) {
                j.this.a.remove(iVar);
                j.this.f();
            }
        }
    };

    public void a(l lVar) {
        if (!this.b.contains(lVar)) {
            this.b.add(lVar);
        }
    }

    public void a() {
        com.tsf.shell.manager.a.w.a().a(this.d);
        Iterator it = com.tsf.shell.utils.h.a(b(), ",", false).iterator();
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i b = b(((Integer) it.next()).intValue());
            if (b != null) {
                if (this.a.size() < 12) {
                    this.a.add(b);
                } else {
                    return;
                }
            }
        }
        e();
    }

    private void e() {
        if (this.a.isEmpty()) {
            this.a.add(com.tsf.shell.manager.a.w.a().a(new ComponentName(com.censivn.C3DEngine.a.d().getPackageName(), ShellActivity.class.getName())));
        }
    }

    private com.tsf.shell.e.i.b.e.i b(int i) {
        return com.tsf.shell.manager.a.w.a().a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Iterator it = this.a.iterator();
        String str = "";
        while (it.hasNext()) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) it.next();
            if (iVar.K() != null) {
                str = String.valueOf(str) + iVar.K().id + ",";
            }
        }
        a(str);
        Iterator it2 = this.b.iterator();
        while (it2.hasNext()) {
            ((l) it2.next()).a(this.a);
        }
    }

    public void a(LauncherShortcutAppInfo launcherShortcutAppInfo) {
        if (launcherShortcutAppInfo.getWidget() != null && (launcherShortcutAppInfo.getWidget() instanceof com.tsf.shell.e.i.b.e.i)) {
            com.tsf.shell.e.i.b.e.i iVar = (com.tsf.shell.e.i.b.e.i) launcherShortcutAppInfo.getWidget();
            if (!a(iVar)) {
                this.a.add(iVar);
                while (this.a.size() > 12) {
                    this.a.remove(0);
                }
                f();
                return;
            }
            if (this.a.get(this.a.size() - 1) != iVar) {
                this.a.remove(iVar);
                this.a.add(iVar);
                f();
            }
        }
    }

    public ArrayList a(int i) {
        this.c.clear();
        int size = this.a.size();
        if (i > size) {
            i = size;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add((com.tsf.shell.e.i.b.e.i) this.a.get((size - i2) - 1));
        }
        return this.c;
    }

    private boolean a(com.tsf.shell.e.i.b.e.i iVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((com.tsf.shell.e.i.b.e.i) it.next()) == iVar) {
                return true;
            }
        }
        return false;
    }

    public static String b() {
        return d().getString("config", "");
    }

    public static void a(String str) {
        SharedPreferences.Editor c = c();
        c.putString("config", str);
        c.commit();
    }

    public static SharedPreferences.Editor c() {
        return d().edit();
    }

    public static SharedPreferences d() {
        if (e == null) {
            e = com.censivn.C3DEngine.a.d().getSharedPreferences("recent", 0);
        }
        return e;
    }
}
