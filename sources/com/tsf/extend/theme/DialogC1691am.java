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
import com.tsf.extend.C1318a;
import com.tsf.extend.C1522c;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1420ab;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* renamed from: com.tsf.extend.theme.am */
/* loaded from: classes.dex */
public class DialogC1691am extends Dialog {

    /* renamed from: a */
    private Context f5448a;

    /* renamed from: b */
    private int f5449b;

    /* renamed from: c */
    private GridView f5450c;

    /* renamed from: d */
    private InterfaceC1694a f5451d;

    /* renamed from: com.tsf.extend.theme.am$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1694a {
        /* renamed from: a */
        void mo7791a();

        /* renamed from: a */
        void mo7790a(AdapterView<?> adapterView, View view, int i, long j);
    }

    public DialogC1691am(Context context, boolean z) {
        super(context, C1536f.C1544h.theme_share_dialog);
        this.f5448a = context;
        this.f5449b = context.getResources().getConfiguration().orientation;
        setContentView(C1536f.C1542f.theme_diy_share_dialog);
        ((ViewGroup) findViewById(C1536f.C1541e.share_dialog)).addView(new View(getContext()) { // from class: com.tsf.extend.theme.am.1
            @Override // android.view.View
            protected void onConfigurationChanged(Configuration configuration) {
                super.onConfigurationChanged(configuration);
                if (configuration.orientation != DialogC1691am.this.f5449b) {
                    DialogC1691am.this.dismiss();
                }
            }
        });
        ((TextView) findViewById(C1536f.C1541e.title)).setTypeface(C1420ab.m8700a(context.getAssets(), "fonts/OpenSans-Light-bold.ttf"));
        m7795a(z);
    }

    /* renamed from: a */
    void m7795a(boolean z) {
        this.f5450c = (GridView) findViewById(C1536f.C1541e.share_grid_view);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = getContext().getResources().getDisplayMetrics().widthPixels;
        int i2 = getContext().getResources().getDisplayMetrics().heightPixels;
        int i3 = (int) (i - ((20.0f * f) + 0.5d));
        getWindow().getDecorView().measure(0, 0);
        m7793b(z);
        int measuredHeight = getWindow().getDecorView().getMeasuredHeight() + 0 + m7798a(this.f5450c, i3, i2);
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

    /* renamed from: a */
    private int m7798a(GridView gridView, int i, int i2) {
        gridView.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(i2, 1073741824));
        ViewGroup.LayoutParams layoutParams = gridView.getLayoutParams();
        layoutParams.height = m7799a(gridView);
        gridView.setLayoutParams(layoutParams);
        return layoutParams.height;
    }

    /* renamed from: a */
    private int m7799a(GridView gridView) {
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

    /* renamed from: b */
    public void m7793b(boolean z) {
        this.f5450c.setAdapter((ListAdapter) m7792c(z));
    }

    /* renamed from: a */
    public void m7797a(InterfaceC1694a interfaceC1694a) {
        this.f5451d = interfaceC1694a;
        if (this.f5450c != null) {
            this.f5450c.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.tsf.extend.theme.am.2
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                    DialogC1691am.this.f5451d.mo7790a(adapterView, view, i, j);
                    DialogC1691am.this.dismiss();
                }
            });
        }
    }

    /* renamed from: c */
    private C1688al m7792c(boolean z) {
        ArrayList arrayList = new ArrayList();
        List<ResolveInfo> m7800a = m7800a(this.f5448a, "text/plain");
        Map<String, C1318a> m8335a = C1522c.m8335a(this.f5448a);
        int i = 0;
        for (int i2 = 0; i2 < m7800a.size(); i2++) {
            ResolveInfo resolveInfo = m7800a.get(i2);
            C1695an c1695an = new C1695an(this.f5448a, resolveInfo);
            String str = resolveInfo.activityInfo.packageName;
            C1318a c1318a = m8335a.get(str);
            if (!z || (!str.contains("com.google.android.apps.plus") && !str.contains("com.facebook.katana"))) {
                if (c1318a != null && C1318a.m9026e(c1318a.m9040a())) {
                    arrayList.add(i, c1695an);
                    i++;
                } else {
                    arrayList.add(c1695an);
                }
            }
        }
        return new C1688al(this.f5448a, arrayList, z);
    }

    /* renamed from: a */
    private List<ResolveInfo> m7800a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.SEND", (Uri) null);
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setType(str.toString());
        return context.getPackageManager().queryIntentActivities(intent, 0);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        this.f5451d.mo7791a();
    }
}
