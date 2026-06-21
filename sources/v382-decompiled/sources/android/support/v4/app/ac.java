package android.support.v4.app;

import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ac {
    private static final ai a;

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(aa aaVar, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aaVar.a((ad) it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(ab abVar, ar arVar) {
        if (arVar != null) {
            if (arVar instanceof af) {
                af afVar = (af) arVar;
                bc.a(abVar, afVar.d, afVar.f, afVar.e, afVar.a);
            } else if (arVar instanceof ah) {
                ah ahVar = (ah) arVar;
                bc.a(abVar, ahVar.d, ahVar.f, ahVar.e, ahVar.a);
            } else if (arVar instanceof ae) {
                ae aeVar = (ae) arVar;
                bc.a(abVar, aeVar.d, aeVar.f, aeVar.e, aeVar.a, aeVar.b, aeVar.c);
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new ak();
            return;
        }
        if (Build.VERSION.SDK_INT >= 20) {
            a = new aj();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a = new aq();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            a = new ap();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            a = new ao();
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            a = new an();
        } else if (Build.VERSION.SDK_INT >= 9) {
            a = new am();
        } else {
            a = new al();
        }
    }
}
