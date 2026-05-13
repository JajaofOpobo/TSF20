package com.tsf.shell.plugin.customlanguage;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.Locale;
/* loaded from: classes.dex */
public class LanguageSelectActivity extends ListActivity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setListAdapter(new ArrayAdapter(this, 17367043, Locale.getISOLanguages()));
    }
}
