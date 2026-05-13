package com.tsf.shell.plugin.theme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.ArrayList;
/* renamed from: com.tsf.shell.plugin.theme.b */
/* loaded from: classes.dex */
public class C3832b {

    /* renamed from: a */
    C3831a f12574a;

    /* renamed from: b */
    private final ThemeElementPicker f12575b;

    /* renamed from: com.tsf.shell.plugin.theme.b$b */
    /* loaded from: classes.dex */
    private class DialogInterface$OnClickListenerC3834b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC3834b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C3832b.this.f12575b.m1348a(C3832b.this.f12574a.getItem(i));
        }
    }

    public C3832b(ThemeElementPicker themeElementPicker) {
        this.f12575b = themeElementPicker;
    }

    /* renamed from: a */
    public void m1346a(ArrayList<C3835c> arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f12575b);
        builder.setTitle(str);
        this.f12574a = new C3831a(this.f12575b, 0, arrayList);
        builder.setAdapter(this.f12574a, new DialogInterface$OnClickListenerC3834b());
        builder.setOnCancelListener(new DialogInterface$OnCancelListenerC3833a());
        builder.create().show();
    }

    /* renamed from: com.tsf.shell.plugin.theme.b$a */
    /* loaded from: classes.dex */
    private class DialogInterface$OnCancelListenerC3833a implements DialogInterface.OnCancelListener {
        public DialogInterface$OnCancelListenerC3833a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            C3832b.this.f12575b.finish();
        }
    }
}
