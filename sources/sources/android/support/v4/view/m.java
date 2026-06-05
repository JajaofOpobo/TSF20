package android.support.v4.view;

import android.support.v4.view.l;
import android.view.LayoutInflater;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class m {
    static void a(LayoutInflater layoutInflater, n nVar) {
        layoutInflater.setFactory2(nVar != null ? new l.a(nVar) : null);
    }
}
