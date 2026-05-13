package com.tsf.extend.theme;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.extend.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class am extends Dialog {
    private Context a;
    private int b;
    private GridView c;
    private a d;

    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(AdapterView<?> adapterView, View view, int i, long j);
    }

    public am(Context context, boolean z) {
        super(context, f.h.theme_share_dialog);
        this.a = context;
        this.b = context.getResources().getConfiguration().orientation;
        setContentView(f.C0052f.theme_diy_share_dialog);
        ((ViewGroup) findViewById(f.e.share_dialog)).addView(new View(getContext()) { // from class: com.tsf.extend.theme.am.1
            @Override // android.view.View
            protected void onConfigurationChanged(Configuration configuration) {
                super.onConfigurationChanged(configuration);
                if (configuration.orientation != am.this.b) {
                    am.this.dismiss();
                }
            }
        });
        ((TextView) findViewById(f.e.title)).setTypeface(com.tsf.extend.base.j.ab.a(context.getAssets(), "fonts/OpenSans-Light-bold.ttf"));
        a(z);
    }

    void a(boolean z) {
        this.c = (GridView) findViewById(f.e.share_grid_view);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int i2 = getContext().getResources().getDisplayMetrics().heightPixels;
        int i3 = (int) (i - ((20.0f * f) + 0.5d));
        getWindow().getDecorView().measure(0, 0);
        b(z);
        int measuredHeight = getWindow().getDecorView().getMeasuredHeight() + 0 + a(this.c, i3, i2);
        int i4 = (int) ((i2 - (f * 140.0f)) + 0.5d);
        if (measuredHeight <= i4) {
            i4 = measuredHeight;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.copyFrom(getWindow().getAttributes());
        layoutParams.gravity = 17;
        layoutParams.width = i3;
        layoutParams.height = i4;
        getWindow().setAttributes(layoutParams);
    }

    private int a(GridView gridView, int i, int i2) {
        gridView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        ViewGroup.LayoutParams layoutParams = gridView.getLayoutParams();
        layoutParams.height = a(gridView);
        gridView.setLayoutParams(layoutParams);
        return layoutParams.height;
    }

    private int a(GridView gridView) {
        ListAdapter adapter = gridView.getAdapter();
        int numColumns = Build.VERSION.SDK_INT >= 11 ? gridView.getNumColumns() : 0;
        if (adapter == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2 += numColumns) {
            int i3 = 0;
            for (int i4 = i2; i4 < adapter.getCount() && i4 < i2 + numColumns; i4++) {
                View view = adapter.getView(i4, null, gridView);
                view.measure(0, 0);
                if (i3 < view.getMeasuredHeight()) {
                    i3 = view.getMeasuredHeight();
                }
            }
            i += i3;
        }
        return i;
    }

    public void b(boolean z) {
        this.c.setAdapter((ListAdapter) c(z));
    }

    public void a(a aVar) {
        this.d = aVar;
        if (this.c != null) {
            this.c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.tsf.extend.theme.am.2
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    am.this.d.a(adapterView, view, i, j);
                    am.this.dismiss();
                }
            });
        }
    }

    private al c(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> a2 = a(this.a, "text/plain");
        Map<String, com.tsf.extend.a> a3 = com.tsf.extend.c.a(this.a);
        int i = 0;
        for (int i2 = 0; i2 < a2.size(); i2++) {
            ResolveInfo resolveInfo = a2.get(i2);
            an anVar = new an(this.a, resolveInfo);
            String str = resolveInfo.activityInfo.packageName;
            com.tsf.extend.a aVar = a3.get(str);
            if (!z || (!str.contains("com.google.android.apps.plus") && !str.contains("com.facebook.katana"))) {
                if (aVar != null && com.tsf.extend.a.e(aVar.a())) {
                    arrayList.add(i, anVar);
                    i++;
                } else {
                    arrayList.add(anVar);
                }
            }
        }
        return new al(this.a, arrayList, z);
    }

    private List<ResolveInfo> a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType(str.toString());
        return context.getPackageManager().queryIntentActivities(intent, 0);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.d.a();
    }
}
