package com.tsf.shell.activity.actionselector;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.app.u;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.tsf.shell.R;
import com.tsf.shell.manager.action.f;

@SuppressLint({"ValidFragment"})
/* loaded from: classes.dex */
class a extends u {
    private int aj;
    final /* synthetic */ ActionSelector i;

    private a(ActionSelector actionSelector) {
        this.i = actionSelector;
    }

    /* synthetic */ a(ActionSelector actionSelector, a aVar) {
        this(actionSelector);
    }

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        this.aj = h() != null ? h().getInt("num") : 1;
    }

    @Override // android.support.v4.app.u, android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_pager_list, viewGroup, false);
    }

    @Override // android.support.v4.app.Fragment
    public void d(Bundle bundle) {
        f fVar;
        super.d(bundle);
        fVar = this.i.s;
        a(fVar.a(this.aj));
    }

    @Override // android.support.v4.app.u
    public void a(ListView listView, View view, int i, long j) {
        f fVar;
        fVar = this.i.s;
        fVar.a(this.aj, i);
    }
}
