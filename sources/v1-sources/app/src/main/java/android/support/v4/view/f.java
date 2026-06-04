package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class f implements m {
    final /* synthetic */ a a;
    final /* synthetic */ e b;

    f(e eVar, a aVar) {
        this.b = eVar;
        this.a = aVar;
    }

    @Override // android.support.v4.view.m
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        return a.b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void a(View view, Object obj) {
        this.a.a(view, new android.support.v4.view.a.a(obj));
    }

    @Override // android.support.v4.view.m
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        a.c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        return a.a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final void a(View view, int i) {
        a aVar = this.a;
        a.a(view, i);
    }

    @Override // android.support.v4.view.m
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        a.a(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.m
    public final Object a(View view) {
        a aVar = this.a;
        android.support.v4.view.a.f a = a.a(view);
        if (a != null) {
            return a.a();
        }
        return null;
    }

    @Override // android.support.v4.view.m
    public final boolean a(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }
}
