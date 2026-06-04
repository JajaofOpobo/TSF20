package com.tsf.shell.workspace3D.j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tsf.shell.R;
import com.tsf.shell.view.SettingLayout;

/* loaded from: classes.dex */
final class c implements Runnable {
    final /* synthetic */ a a;

    c(a aVar) {
        this.a = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        View view2;
        SettingLayout settingLayout;
        a aVar;
        SettingLayout settingLayout2;
        a aVar2;
        this.a.b = new ViewGroup.LayoutParams(-1, -1);
        this.a.e = LayoutInflater.from(com.censivn.C3DEngine.a.c()).inflate(R.layout.setting_layout_main, (ViewGroup) null);
        a aVar3 = this.a;
        view = this.a.e;
        aVar3.f = (SettingLayout) view.findViewById(R.id.settinglayout);
        a aVar4 = this.a;
        view2 = this.a.e;
        aVar4.g = (SettingLayout) view2.findViewById(R.id.settinglayout1);
        settingLayout = this.a.f;
        aVar = this.a.a;
        settingLayout.setValueChangeListener(aVar);
        settingLayout2 = this.a.g;
        aVar2 = this.a.a;
        settingLayout2.setValueChangeListener(aVar2);
    }
}
