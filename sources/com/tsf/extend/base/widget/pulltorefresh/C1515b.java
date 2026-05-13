package com.tsf.extend.base.widget.pulltorefresh;

import android.graphics.drawable.Drawable;
import com.tsf.extend.base.widget.pulltorefresh.p081a.AbstractC1511d;
import java.util.HashSet;
import java.util.Iterator;
/* renamed from: com.tsf.extend.base.widget.pulltorefresh.b */
/* loaded from: classes.dex */
public class C1515b implements InterfaceC1505a {

    /* renamed from: a */
    private final HashSet<AbstractC1511d> f4771a = new HashSet<>();

    /* renamed from: a */
    public void m8346a(AbstractC1511d abstractC1511d) {
        if (abstractC1511d != null) {
            this.f4771a.add(abstractC1511d);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setLastUpdatedLabel(CharSequence charSequence) {
        Iterator<AbstractC1511d> it = this.f4771a.iterator();
        while (it.hasNext()) {
            it.next().setLastUpdatedLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setLoadingDrawable(Drawable drawable) {
        Iterator<AbstractC1511d> it = this.f4771a.iterator();
        while (it.hasNext()) {
            it.next().setLoadingDrawable(drawable);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setRefreshingLabel(CharSequence charSequence) {
        Iterator<AbstractC1511d> it = this.f4771a.iterator();
        while (it.hasNext()) {
            it.next().setRefreshingLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setPullLabel(CharSequence charSequence) {
        Iterator<AbstractC1511d> it = this.f4771a.iterator();
        while (it.hasNext()) {
            it.next().setPullLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.InterfaceC1505a
    public void setReleaseLabel(CharSequence charSequence) {
        Iterator<AbstractC1511d> it = this.f4771a.iterator();
        while (it.hasNext()) {
            it.next().setReleaseLabel(charSequence);
        }
    }
}
