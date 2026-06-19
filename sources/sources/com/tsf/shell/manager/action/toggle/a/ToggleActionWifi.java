package com.tsf.shell.manager.action.toggle.a;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ToggleActionWifi extends com.tsf.shell.manager.action.toggle.ToggleAction {
    private BluetoothAdapter c;

    public ToggleActionWifi(int i) {
        super(i);
        try {
            this.c = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ToggleActionWifi();
    }

    @Override // com.tsf.shell.manager.action.toggle.ToggleAction
    public void d() {
        a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.ToggleAction
    public void c() {
        if (this.c != null) {
            switch (this.c.getState()) {
                case 10:
                    this.c.enable();
                    break;
                case 12:
                    this.c.disable();
                    break;
            }
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.ToggleAction
    public void a(Intent intent) {
        if (this.c != null) {
            switch (this.c.getState()) {
                case 10:
                    b(0);
                    break;
                case 11:
                    b(1);
                    break;
                case 12:
                    b(2);
                    break;
                case 13:
                    b(1);
                    break;
                default:
                    b(0);
                    break;
            }
        }
    }
}
