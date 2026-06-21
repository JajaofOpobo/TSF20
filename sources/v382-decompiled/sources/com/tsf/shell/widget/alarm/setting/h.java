package com.tsf.shell.widget.alarm.setting;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
class h implements AdapterView.OnItemClickListener {
    final /* synthetic */ SettingActivity a;

    h(SettingActivity settingActivity) {
        this.a = settingActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            this.a.a((com.tsf.shell.widget.alarm.d.a) null);
        } else {
            this.a.a((com.tsf.shell.widget.alarm.d.a) view.getTag());
        }
        this.a.a(false);
    }
}
