package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
final class az extends a {
    final /* synthetic */ ViewPager b;

    az(ViewPager viewPager) {
        this.b = viewPager;
    }

    @Override // android.support.v4.view.a
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r1.c() > 1) goto L6;
     */
    @Override // android.support.v4.view.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, android.support.v4.view.a.a aVar) {
        v vVar;
        v vVar2;
        v vVar3;
        int i;
        int i2;
        v vVar4;
        int i3;
        int i4;
        v vVar5;
        v vVar6;
        boolean z = true;
        super.a(view, aVar);
        aVar.a(ViewPager.class.getName());
        vVar = this.b.g;
        if (vVar != null) {
            vVar6 = this.b.g;
        }
        z = false;
        aVar.a(z);
        vVar2 = this.b.g;
        if (vVar2 != null) {
            i3 = this.b.h;
            if (i3 >= 0) {
                i4 = this.b.h;
                vVar5 = this.b.g;
                if (i4 < vVar5.c() - 1) {
                    aVar.a(4096);
                }
            }
        }
        vVar3 = this.b.g;
        if (vVar3 != null) {
            i = this.b.h;
            if (i > 0) {
                i2 = this.b.h;
                vVar4 = this.b.g;
                if (i2 < vVar4.c()) {
                    aVar.a(8192);
                }
            }
        }
    }

    @Override // android.support.v4.view.a
    public final boolean a(View view, int i, Bundle bundle) {
        v vVar;
        int i2;
        int i3;
        v vVar2;
        int i4;
        v vVar3;
        int i5;
        int i6;
        v vVar4;
        int i7;
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                vVar3 = this.b.g;
                if (vVar3 != null) {
                    i5 = this.b.h;
                    if (i5 >= 0) {
                        i6 = this.b.h;
                        vVar4 = this.b.g;
                        if (i6 < vVar4.c() - 1) {
                            ViewPager viewPager = this.b;
                            i7 = this.b.h;
                            viewPager.a(i7 + 1);
                            return true;
                        }
                    }
                }
                return false;
            case 8192:
                vVar = this.b.g;
                if (vVar != null) {
                    i2 = this.b.h;
                    if (i2 > 0) {
                        i3 = this.b.h;
                        vVar2 = this.b.g;
                        if (i3 < vVar2.c()) {
                            ViewPager viewPager2 = this.b;
                            i4 = this.b.h;
                            viewPager2.a(i4 - 1);
                            return true;
                        }
                    }
                }
                return false;
            default:
                return false;
        }
    }
}
