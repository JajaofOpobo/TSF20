package com.tsf.shell.manager.b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.tsf.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class BackupDataAdapter extends ArrayAdapter<BackupEntry> {
    int a;
    private final ArrayList<BackupEntry> b;
    private final Context c;

    public BackupDataAdapter(Context context, int i, ArrayList<BackupEntry> arrayList) {
        super(context, i, arrayList);
        this.a = 0;
        this.b = arrayList;
        this.c = context;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        return this.b.size();
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        BackupEntry backupEntry;
        if (view == null) {
            view = ((LayoutInflater) this.c.getSystemService("layout_inflater")).inflate(b.g.preference_backup_data_item, (ViewGroup) null);
        }
        if (i < getCount() && (cVar = this.b.get(i)) != null) {
            TextView textView = (TextView) view.findViewById(b.e.title);
            TextView textView2 = (TextView) view.findViewById(b.e.time);
            textView.setText(cVar.a);
            textView2.setText(cVar.b);
        }
        return view;
    }
}
