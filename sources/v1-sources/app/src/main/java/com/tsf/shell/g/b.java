package com.tsf.shell.g;

import android.content.ComponentName;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.h.a.x;
import com.tsf.shell.workspace3D.k.ah;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b {
    public static ArrayList a;
    public static ArrayList b;
    public static ArrayList c;
    public static ArrayList d;
    public static ArrayList e;
    public static ArrayList f;
    public static ArrayList g;
    public static ArrayList h;
    public static ArrayList i;
    public static ArrayList j;
    public static ArrayList k;
    public static ArrayList l;
    public static ArrayList m;
    public static ArrayList n;
    public static ArrayList o;

    public static boolean a(String str) {
        return a(str, a);
    }

    public static boolean b(String str) {
        return a(str, b);
    }

    public static boolean c(String str) {
        return a(str, m);
    }

    public static ArrayList a(int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = o.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            ah a2 = a((ArrayList) it.next());
            if (a2 != null) {
                arrayList.add(a2);
                int i4 = i3 + 1;
                if (i4 >= i2) {
                    break;
                }
                i3 = i4;
            }
        }
        return arrayList;
    }

    public static String a(ComponentName componentName) {
        return String.valueOf(componentName.getPackageName()) + "/" + componentName.getClassName();
    }

    public static ah a(ArrayList arrayList) {
        x p = bf.j().p();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ah c2 = p.c((String) arrayList.get(i2));
            if (c2 != null) {
                return c2;
            }
        }
        return null;
    }

    private static boolean a(String str, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }
}
