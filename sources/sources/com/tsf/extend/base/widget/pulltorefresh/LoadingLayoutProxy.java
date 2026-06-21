package com.tsf.extend.base.widget.pulltorefresh;

import android.graphics.drawable.Drawable;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LoadingLayoutProxy implements ILoadingLayout {
    private final HashSet<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> a = new HashSet<>();

    LoadingLayoutProxy() {
    }

    public void a(com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout dVar) {
        if (dVar != null) {
            this.a.add(dVar);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.ILoadingLayout
    public void setLastUpdatedLabel(CharSequence charSequence) {
        Iterator<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().setLastUpdatedLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.ILoadingLayout
    public void setLoadingDrawable(Drawable drawable) {
        Iterator<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().setLoadingDrawable(drawable);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.ILoadingLayout
    public void setRefreshingLabel(CharSequence charSequence) {
        Iterator<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().setRefreshingLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.ILoadingLayout
    public void setPullLabel(CharSequence charSequence) {
        Iterator<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().setPullLabel(charSequence);
        }
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.ILoadingLayout
    public void setReleaseLabel(CharSequence charSequence) {
        Iterator<com.tsf.extend.base.widget.pulltorefresh.a.LoadingLayout> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().setReleaseLabel(charSequence);
        }
    }
}
