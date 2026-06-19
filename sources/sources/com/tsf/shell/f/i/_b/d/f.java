package com.tsf.shell.f.i._b.d;

import com.tsf.b;
import com.tsf.shell.f.e._d.a.c;
import com.tsf.shell.utils.HapticFeedbackManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class f extends com.tsf.shell.f.e._d.a.d {
    public f() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.menu_add, WorkspaceShortcutItem.d.widget_folder_add_button) { // from class: com.tsf.shell.f.i._b.d.f.1
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.n.a(WorkspaceShortcutItem.k);
                }
            }

            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public boolean b() {
                return (WorkspaceShortcutItem.k == null || WorkspaceShortcutItem.k.aC()) ? false : true;
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.menu_multiple_choice, WorkspaceShortcutItem.d.widget_folder_multi_choice) { // from class: com.tsf.shell.f.i._b.d.f.2
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.k.aE().d();
                }
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_rename, WorkspaceShortcutItem.d.widget_folder_rename) { // from class: com.tsf.shell.f.i._b.d.f.3
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.l.a(WorkspaceShortcutItem.k);
                }
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_preferences, WorkspaceShortcutItem.d.widget_folder_preferences) { // from class: com.tsf.shell.f.i._b.d.f.4
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                w.b();
                WorkspaceShortcutItem.l.a();
            }
        });
        c.C0092c c0092c = new c.C0092c(WorkspaceShortcutItem.i.text_sort, WorkspaceShortcutItem.d.widget_folder_sort);
        c0092c.a(l());
        arrayList.add(c0092c);
        a(arrayList);
    }

    private ArrayList<c.C0092c> l() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_sort_alphabetical, WorkspaceShortcutItem.d.widget_folder_sort_name) { // from class: com.tsf.shell.f.i._b.d.f.5
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.k.b(0);
                }
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_sort_latest_installed, WorkspaceShortcutItem.d.widget_folder_sort_time_earliest) { // from class: com.tsf.shell.f.i._b.d.f.6
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.k.b(2);
                }
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_sort_earliest_installed, WorkspaceShortcutItem.d.widget_folder_sort_time_latest) { // from class: com.tsf.shell.f.i._b.d.f.7
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.k.b(1);
                }
            }
        });
        arrayList.add(new c.C0092c(WorkspaceShortcutItem.i.text_sort_most_used, WorkspaceShortcutItem.d.widget_folder_sort_frequency) { // from class: com.tsf.shell.f.i._b.d.f.8
            @Override // com.tsf.shell.f.e._d.a.c.C0092c
            public void a() {
                if (WorkspaceShortcutItem.k != null) {
                    w.b();
                    WorkspaceShortcutItem.k.b(3);
                }
            }
        });
        return arrayList;
    }
}
