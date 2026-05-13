package com.tsf.shell.f.i.b.d;

import com.tsf.b;
import com.tsf.shell.f.e.d.a.c;
import com.tsf.shell.utils.w;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class f extends com.tsf.shell.f.e.d.a.d {
    public f() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(b.i.menu_add, b.d.widget_folder_add_button) { // from class: com.tsf.shell.f.i.b.d.f.1
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.n.a(b.k);
                }
            }

            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public boolean b() {
                return (b.k == null || b.k.aC()) ? false : true;
            }
        });
        arrayList.add(new c.C0092c(b.i.menu_multiple_choice, b.d.widget_folder_multi_choice) { // from class: com.tsf.shell.f.i.b.d.f.2
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.aE().d();
                }
            }
        });
        arrayList.add(new c.C0092c(b.i.text_rename, b.d.widget_folder_rename) { // from class: com.tsf.shell.f.i.b.d.f.3
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.l.a(b.k);
                }
            }
        });
        arrayList.add(new c.C0092c(b.i.text_preferences, b.d.widget_folder_preferences) { // from class: com.tsf.shell.f.i.b.d.f.4
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                w.b();
                b.l.a();
            }
        });
        c.C0092c c0092c = new c.C0092c(b.i.text_sort, b.d.widget_folder_sort);
        c0092c.a(l());
        arrayList.add(c0092c);
        a(arrayList);
    }

    private ArrayList<c.C0092c> l() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(b.i.text_sort_alphabetical, b.d.widget_folder_sort_name) { // from class: com.tsf.shell.f.i.b.d.f.5
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(0);
                }
            }
        });
        arrayList.add(new c.C0092c(b.i.text_sort_latest_installed, b.d.widget_folder_sort_time_earliest) { // from class: com.tsf.shell.f.i.b.d.f.6
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(2);
                }
            }
        });
        arrayList.add(new c.C0092c(b.i.text_sort_earliest_installed, b.d.widget_folder_sort_time_latest) { // from class: com.tsf.shell.f.i.b.d.f.7
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(1);
                }
            }
        });
        arrayList.add(new c.C0092c(b.i.text_sort_most_used, b.d.widget_folder_sort_frequency) { // from class: com.tsf.shell.f.i.b.d.f.8
            @Override // com.tsf.shell.f.e.d.a.c.C0092c
            public void a() {
                if (b.k != null) {
                    w.b();
                    b.k.b(3);
                }
            }
        });
        return arrayList;
    }
}
