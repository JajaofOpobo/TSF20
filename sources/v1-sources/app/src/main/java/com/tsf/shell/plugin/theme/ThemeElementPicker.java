package com.tsf.shell.plugin.theme;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ThemeElementPicker extends Activity {
    private Intent a = null;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("");
        com.censivn.C3DEngine.a.a((Context) this);
        requestWindowFeature(1);
        this.a = getIntent();
        ArrayList parcelableArrayListExtra = this.a.getParcelableArrayListExtra("data");
        String stringExtra = this.a.getStringExtra("title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        new b(this).a(parcelableArrayListExtra, stringExtra);
    }

    public final void a(ThemeElementSubItem themeElementSubItem) {
        this.a.putExtra("packagename", themeElementSubItem.c);
        setResult(-1, this.a);
        finish();
    }
}
