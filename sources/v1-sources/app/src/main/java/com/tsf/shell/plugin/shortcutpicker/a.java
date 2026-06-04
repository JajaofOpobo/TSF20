package com.tsf.shell.plugin.shortcutpicker;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {
    public ArrayList a;
    private Context b;
    private Drawable[] c;

    public a(Context context) {
        this.b = context;
        a();
    }

    private void a() {
        int i = 0;
        this.a = new ArrayList();
        PackageManager packageManager = this.b.getPackageManager();
        Intent intent = new Intent("android.intent.action.CREATE_SHORTCUT");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        while (true) {
            int i2 = i;
            if (i2 < queryIntentActivities.size()) {
                b bVar = new b(this);
                ActivityInfo activityInfo = queryIntentActivities.get(i2).activityInfo;
                bVar.a = activityInfo.loadIcon(packageManager);
                bVar.b = activityInfo.loadLabel(packageManager).toString();
                String str = activityInfo.applicationInfo.packageName;
                String str2 = activityInfo.name;
                String charSequence = activityInfo.loadLabel(packageManager).toString();
                Intent intent2 = new Intent(intent);
                if (str != null && str2 != null) {
                    intent2.setClassName(str, str2);
                } else {
                    intent2.setAction("android.intent.action.CREATE_SHORTCUT");
                    intent2.putExtra("android.intent.extra.shortcut.NAME", charSequence);
                }
                bVar.c = intent2;
                this.a.add(bVar);
                i = i2 + 1;
            } else {
                this.c = new Drawable[this.a.size()];
                return;
            }
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.b).inflate(R.layout.listitem_icontext, (ViewGroup) null);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView1);
        TextView textView = (TextView) view.findViewById(R.id.textView1);
        Drawable drawable = this.c[i];
        if (drawable == null) {
            drawable = ((b) this.a.get(i)).a;
            this.c[i] = drawable;
        }
        imageView.setImageDrawable(drawable);
        textView.setText(((b) this.a.get(i)).b);
        return view;
    }
}
