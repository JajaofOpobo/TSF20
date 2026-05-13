package android.support.v4.view;

import android.support.v4.view.l;
import android.view.LayoutInflater;
/* loaded from: classes.dex */
class m {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(LayoutInflater layoutInflater, n nVar) {
        layoutInflater.setFactory2(nVar != null ? new l.a(nVar) : null);
    }
}
