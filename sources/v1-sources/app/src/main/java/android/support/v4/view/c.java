package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class c implements j {
    final /* synthetic */ a a;
    final /* synthetic */ b b;

    c(b bVar, a aVar) {
        this.b = bVar;
        this.a = aVar;
    }

    @Override // android.support.v4.view.j
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        return a.b(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void a(View view, Object obj) {
        this.a.a(view, new android.support.v4.view.a.a(obj));
    }

    @Override // android.support.v4.view.j
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        a.c(view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        return a.a(viewGroup, view, accessibilityEvent);
    }

    @Override // android.support.v4.view.j
    public final void a(View view, int i) {
        a aVar = this.a;
        a.a(view, i);
    }

    @Override // android.support.v4.view.j
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        a aVar = this.a;
        a.a(view, accessibilityEvent);
    }
}
