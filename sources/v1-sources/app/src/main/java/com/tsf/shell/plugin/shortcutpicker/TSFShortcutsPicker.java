package com.tsf.shell.plugin.shortcutpicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class TSFShortcutsPicker extends Activity implements AdapterView.OnItemClickListener {
    private c a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.shortcut_picker);
        String stringExtra = getIntent().getStringExtra("android.intent.extra.TITLE");
        ((TextView) findViewById(R.id.textView1)).setText(stringExtra == null ? "" : stringExtra);
        if (this.a == null) {
            this.a = new c(this);
        }
        ListView listView = (ListView) findViewById(R.id.listView1);
        listView.setAdapter((ListAdapter) this.a);
        listView.setOnItemClickListener(this);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Intent intent = new Intent();
        intent.putExtra("id", ((com.tsf.shell.e.c) this.a.a.get(i)).c);
        setResult(-1, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }
}
