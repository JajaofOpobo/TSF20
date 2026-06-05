package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class k {

    static class a implements LayoutInflater.Factory {
        final n a;

        a(n nVar) {
            this.a = nVar;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.a.a(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.a + "}";
        }
    }

    static void a(LayoutInflater layoutInflater, n nVar) {
        layoutInflater.setFactory(nVar != null ? new a(nVar) : null);
    }

    static n a(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).a;
        }
        return null;
    }
}
