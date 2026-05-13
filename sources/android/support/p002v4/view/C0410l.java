package android.support.p002v4.view;

import android.content.Context;
import android.support.p002v4.view.C0408k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import java.lang.reflect.Field;
/* renamed from: android.support.v4.view.l */
/* loaded from: classes.dex */
class C0410l {

    /* renamed from: a */
    private static Field f793a;

    /* renamed from: b */
    private static boolean f794b;

    /* renamed from: android.support.v4.view.l$a */
    /* loaded from: classes.dex */
    static class LayoutInflater$Factory2C0411a extends C0408k.LayoutInflater$FactoryC0409a implements LayoutInflater.Factory2 {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LayoutInflater$Factory2C0411a(InterfaceC0413n interfaceC0413n) {
            super(interfaceC0413n);
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.f792a.mo12090a(view, str, context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m12627a(LayoutInflater layoutInflater, InterfaceC0413n interfaceC0413n) {
        LayoutInflater$Factory2C0411a layoutInflater$Factory2C0411a = interfaceC0413n != null ? new LayoutInflater$Factory2C0411a(interfaceC0413n) : null;
        layoutInflater.setFactory2(layoutInflater$Factory2C0411a);
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof LayoutInflater.Factory2) {
            m12626a(layoutInflater, (LayoutInflater.Factory2) factory);
        } else {
            m12626a(layoutInflater, layoutInflater$Factory2C0411a);
        }
    }

    /* renamed from: a */
    static void m12626a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f794b) {
            try {
                f793a = LayoutInflater.class.getDeclaredField("mFactory2");
                f793a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f794b = true;
        }
        if (f793a != null) {
            try {
                f793a.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
