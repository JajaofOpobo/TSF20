package com.tsf.shell.widget.alarm.setting;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
class i implements AdapterView.OnItemClickListener {
    final /* synthetic */ SettingActivity a;

    i(SettingActivity settingActivity) {
        this.a = settingActivity;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (i) {
            case 1:
                this.a.a(true);
                break;
            case 2:
                this.a.c();
                break;
            case 4:
                this.a.a(view);
                break;
            case 6:
                this.a.d();
                break;
            case 7:
                this.a.a();
                break;
        }
    }
}
