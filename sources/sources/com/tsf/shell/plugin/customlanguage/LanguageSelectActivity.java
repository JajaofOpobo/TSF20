package com.tsf.shell.plugin.customlanguage;

import android.R;
import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.Locale;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LanguageSelectActivity extends ListActivity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setListAdapter(new ArrayAdapter(this, R.layout.simple_list_item_1, Locale.getISOLanguages()));
    }
}
