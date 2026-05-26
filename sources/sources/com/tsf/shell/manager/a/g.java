package com.tsf.shell.manager.a;

import android.content.ComponentName;
import android.content.SharedPreferences;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.tsf.shell.ShellActivity;
import com.tsf.shell.manager.a.c;
import com.tsf.shell.utils.h;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {
    private static SharedPreferences e;
    private ArrayList<b> b = new ArrayList<>();
    private ArrayList<com.tsf.shell.f.i.b.e.g> c = new ArrayList<>();
    private ArrayList<com.tsf.shell.f.i.b.e.g> a = new ArrayList<>();
    private a d = new a() { // from class: com.tsf.shell.manager.a.g.1
        @Override // com.tsf.shell.manager.a.g.a, com.tsf.shell.manager.a.c.a
        public void b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
            if (g.this.a.contains(gVar)) {
                g.this.a.remove(gVar);
                g.this.f();
            }
        }
    };

    public static class b {
        public void a(ArrayList<com.tsf.shell.f.i.b.e.g> arrayList) {
        }
    }

    class a implements c.a {
        a() {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a(com.tsf.shell.f.i.b.e.g gVar) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void b(com.tsf.shell.f.i.b.e.g gVar, boolean z) {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void k_() {
        }

        @Override // com.tsf.shell.manager.a.c.a
        public void a() {
        }
    }

    public void a(b bVar) {
        if (!this.b.contains(bVar)) {
            this.b.add(bVar);
        }
    }

    public void a() {
        com.tsf.shell.manager.a.w.a().a(this.d);
        Iterator<Integer> it = h.a(b(), ",", false).iterator();
        while (it.hasNext()) {
            com.tsf.shell.f.i.b.e.g gVarB = b(it.next().intValue());
            if (gVarB != null) {
                if (this.a.size() < 12) {
                    this.a.add(gVarB);
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

    private com.tsf.shell.f.i.b.e.g b(int i) {
        return com.tsf.shell.manager.a.w.a().a(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String str = "";
        for (com.tsf.shell.f.i.b.e.g gVar : this.a) {
            str = gVar.K() != null ? str + gVar.K().id + "," : str;
        }
        a(str);
        Iterator<b> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().a(this.a);
        }
    }

    public void a(LauncherShortcutAppInfo launcherShortcutAppInfo) {
        if (launcherShortcutAppInfo.getWidget() != null && (launcherShortcutAppInfo.getWidget() instanceof com.tsf.shell.f.i.b.e.g)) {
            com.tsf.shell.f.i.b.e.g gVar = (com.tsf.shell.f.i.b.e.g) launcherShortcutAppInfo.getWidget();
            if (!a(gVar)) {
                this.a.add(gVar);
                while (this.a.size() > 12) {
                    this.a.remove(0);
                }
                f();
                return;
            }
            if (this.a.get(this.a.size() - 1) != gVar) {
                this.a.remove(gVar);
                this.a.add(gVar);
                f();
            }
        }
    }

    public ArrayList<com.tsf.shell.f.i.b.e.g> a(int i) {
        this.c.clear();
        int size = this.a.size();
        if (i > size) {
            i = size;
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.c.add(this.a.get((size - i2) - 1));
        }
        return this.c;
    }

    private boolean a(com.tsf.shell.f.i.b.e.g gVar) {
        Iterator<com.tsf.shell.f.i.b.e.g> it = this.a.iterator();
        while (it.hasNext()) {
            if (it.next() == gVar) {
                return true;
            }
        }
        return false;
    }

    public static String b() {
        return d().getString("config", "");
    }

    public static void a(String str) {
        SharedPreferences.Editor editorC = c();
        editorC.putString("config", str);
        editorC.commit();
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
