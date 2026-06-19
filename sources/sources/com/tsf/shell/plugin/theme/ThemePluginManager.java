package com.tsf.shell.plugin.theme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemePluginManager {
    com.tsf.shell.plugin.theme.ThemePluginParser a;
    private final ThemeElementPicker b;

    /* JADX INFO: renamed from: com.tsf.shell.plugin.theme.ThemePluginManager$b, reason: collision with other inner class name */
    private class DialogInterfaceOnClickListenerC0154b implements DialogInterface.OnClickListener {
        public DialogInterfaceOnClickListenerC0154b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            b.this.b.a(b.this.a.getItem(i));
        }
    }

    public b(ThemeElementPicker themeElementPicker) {
        this.b = themeElementPicker;
    }

    public void a(ArrayList<c> arrayList, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.b);
        builder.setTitle(str);
        this.a = new com.tsf.shell.plugin.theme.ThemePluginParser(this.b, 0, arrayList);
        builder.setAdapter(this.a, new DialogInterfaceOnClickListenerC0154b());
        builder.setOnCancelListener(new ThemePluginParser());
        builder.create().show();
    }

    private class a implements DialogInterface.OnCancelListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            b.this.b.finish();
        }
    }
}
