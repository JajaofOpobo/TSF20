package com.tsf.shell.action;

import android.os.Bundle;
import android.support.v4.app.w;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class g extends w {
    int X;

    static g b(int i) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        gVar.a(bundle);
        return gVar;
    }

    @Override // android.support.v4.app.Fragment
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.X = c() != null ? c().getInt("num") : 1;
    }

    @Override // android.support.v4.app.w, android.support.v4.app.Fragment
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_pager_list, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public final void c(Bundle bundle) {
        super.c(bundle);
        a(j.a(this.X));
    }

    @Override // android.support.v4.app.w
    public final void a(int i) {
        j.a(this.X, i);
    }
}
