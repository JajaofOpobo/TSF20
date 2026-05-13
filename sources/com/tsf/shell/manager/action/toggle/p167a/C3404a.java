package com.tsf.shell.manager.action.toggle.p167a;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import com.tsf.shell.manager.action.toggle.C3414b;
/* renamed from: com.tsf.shell.manager.action.toggle.a.a */
/* loaded from: classes.dex */
public class C3404a extends C3414b {

    /* renamed from: c */
    private BluetoothAdapter f11279c;

    public C3404a(int i) {
        super(i);
        try {
            this.f11279c = BluetoothAdapter.getDefaultAdapter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        mo2601d();
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: d */
    public void mo2601d() {
        mo2607a((Intent) null);
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: c */
    public void mo2602c() {
        if (this.f11279c != null) {
            switch (this.f11279c.getState()) {
                case 10:
                    this.f11279c.enable();
                    return;
                case 11:
                case 13:
                default:
                    return;
                case 12:
                    this.f11279c.disable();
                    return;
            }
        }
    }

    @Override // com.tsf.shell.manager.action.toggle.C3414b
    /* renamed from: a */
    public void mo2607a(Intent intent) {
        if (this.f11279c != null) {
            switch (this.f11279c.getState()) {
                case 10:
                    m2604b(0);
                    return;
                case 11:
                    m2604b(1);
                    return;
                case 12:
                    m2604b(2);
                    return;
                case 13:
                    m2604b(1);
                    return;
                default:
                    m2604b(0);
                    return;
            }
        }
    }
}
