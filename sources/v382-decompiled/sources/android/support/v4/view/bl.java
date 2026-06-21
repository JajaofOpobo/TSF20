package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
class bl extends a {
    final /* synthetic */ ViewPager b;

    bl(ViewPager viewPager) {
        this.b = viewPager;
    }

    @Override // android.support.v4.view.a
    public void d(View view, AccessibilityEvent accessibilityEvent) {
        ad adVar;
        ad adVar2;
        int i;
        int i2;
        super.d(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        android.support.v4.view.a.u a = android.support.v4.view.a.u.a();
        a.a(b());
        if (accessibilityEvent.getEventType() == 4096) {
            adVar = this.b.h;
            if (adVar != null) {
                adVar2 = this.b.h;
                a.a(adVar2.b());
                i = this.b.i;
                a.b(i);
                i2 = this.b.i;
                a.c(i2);
            }
        }
    }

    @Override // android.support.v4.view.a
    public void a(View view, android.support.v4.view.a.a aVar) {
        super.a(view, aVar);
        aVar.a(ViewPager.class.getName());
        aVar.a(b());
        if (this.b.canScrollHorizontally(1)) {
            aVar.a(4096);
        }
        if (this.b.canScrollHorizontally(-1)) {
            aVar.a(ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES);
        }
    }

    @Override // android.support.v4.view.a
    public boolean a(View view, int i, Bundle bundle) {
        int i2;
        int i3;
        if (super.a(view, i, bundle)) {
            return true;
        }
        switch (i) {
            case 4096:
                if (!this.b.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = this.b;
                i3 = this.b.i;
                viewPager.setCurrentItem(i3 + 1);
                return true;
            case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                if (!this.b.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager2 = this.b;
                i2 = this.b.i;
                viewPager2.setCurrentItem(i2 - 1);
                return true;
            default:
                return false;
        }
    }

    private boolean b() {
        ad adVar;
        ad adVar2;
        adVar = this.b.h;
        if (adVar != null) {
            adVar2 = this.b.h;
            if (adVar2.b() > 1) {
                return true;
            }
        }
        return false;
    }
}
