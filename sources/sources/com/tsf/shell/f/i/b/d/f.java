package com.tsf.shell.f.i.b.d;

import com.tsf.b;
import com.tsf.shell.f.e.d.a.c;
import com.tsf.shell.utils.w;
import java.util.ArrayList;

public class f extends com.tsf.shell.f.e.d.a.d {
    public f() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(com.tsf.b.i.menu_add, com.tsf.b.d.widget_folder_add_button) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.n.a(com.tsf.shell.f.i.b.d.b.k);
                }
            }

            @Override
            public boolean b() {
                return (com.tsf.shell.f.i.b.d.b.k == null || com.tsf.shell.f.i.b.d.b.k.aC()) ? false : true;
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.menu_multiple_choice, com.tsf.b.d.widget_folder_multi_choice) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.k.aE().d();
                }
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.text_rename, com.tsf.b.d.widget_folder_rename) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.l.a(com.tsf.shell.f.i.b.d.b.k);
                }
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.text_preferences, com.tsf.b.d.widget_folder_preferences) {
            @Override
            public void a() {
                w.b();
                com.tsf.shell.f.i.b.d.b.l.a();
            }
        });
        c.C0092c c0092c = new c.C0092c(com.tsf.b.i.text_sort, com.tsf.b.d.widget_folder_sort);
        c0092c.a(l());
        arrayList.add(c0092c);
        a(arrayList);
    }

    private ArrayList<c.C0092c> l() {
        ArrayList<c.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new c.C0092c(com.tsf.b.i.text_sort_alphabetical, com.tsf.b.d.widget_folder_sort_name) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.k.b(0);
                }
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.text_sort_latest_installed, com.tsf.b.d.widget_folder_sort_time_earliest) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.k.b(2);
                }
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.text_sort_earliest_installed, com.tsf.b.d.widget_folder_sort_time_latest) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.k.b(1);
                }
            }
        });
        arrayList.add(new c.C0092c(com.tsf.b.i.text_sort_most_used, com.tsf.b.d.widget_folder_sort_frequency) {
            @Override
            public void a() {
                if (com.tsf.shell.f.i.b.d.b.k != null) {
                    w.b();
                    com.tsf.shell.f.i.b.d.b.k.b(3);
                }
            }
        });
        return arrayList;
    }
}
