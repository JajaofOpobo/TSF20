package android.support.p002v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
/* renamed from: android.support.v4.view.k */
/* loaded from: classes.dex */
class C0408k {

    /* renamed from: android.support.v4.view.k$a */
    /* loaded from: classes.dex */
    static class LayoutInflater$FactoryC0409a implements LayoutInflater.Factory {

        /* renamed from: a */
        final InterfaceC0413n f792a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public LayoutInflater$FactoryC0409a(InterfaceC0413n interfaceC0413n) {
            this.f792a = interfaceC0413n;
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f792a.mo12090a(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f792a + "}";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12628a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
        layoutInflater.setFactory(interfaceC0413n != null ? new LayoutInflater$FactoryC0409a(interfaceC0413n) : null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static InterfaceC0413n m12629a(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater$FactoryC0409a) {
            return ((LayoutInflater$FactoryC0409a) factory).f792a;
        }
        return null;
    }
}
