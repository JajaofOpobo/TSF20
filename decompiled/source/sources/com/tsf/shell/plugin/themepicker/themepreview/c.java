package com.tsf.shell.plugin.themepicker.themepreview;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tsf.shell.plugin.themepicker.f;
import com.tsf.shell.plugin.themepicker.k;
import com.tsf.shell.plugin.themepicker.utils.RecyclingImageView;
import com.tsf.shell.plugin.themepicker.utils.h;
import java.util.List;
/* loaded from: classes.dex */
public class c extends Fragment implements k.f {
    private com.tsf.shell.plugin.themepicker.themepreview.b a;
    private ViewGroup b;
    private b c;
    private final int d = 100;
    private a e;
    private int f;
    private int g;
    private int h;

    @Override // android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onCreate  ");
        this.a = new com.tsf.shell.plugin.themepicker.themepreview.b(i(), (int) TypedValue.applyDimension(1, 160.0f, j().getDisplayMetrics()), (int) TypedValue.applyDimension(1, 284.0f, j().getDisplayMetrics()));
        this.e = new a();
        this.f = (int) TypedValue.applyDimension(1, 50.0f, i().getResources().getDisplayMetrics());
        this.g = j().getDimensionPixelSize(f.d.theme_preview_width_size);
        this.h = j().getDimensionPixelSize(f.d.theme_preview_spacing);
        a();
    }

    @Override // android.support.v4.app.Fragment
    public void q() {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onResume");
        this.a.a(false);
        super.q();
    }

    @Override // android.support.v4.app.Fragment
    public void r() {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onPause");
        super.r();
        this.a.b(false);
        this.a.a(true);
        this.a.h();
    }

    @Override // android.support.v4.app.Fragment
    public void s() {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onPause");
        super.s();
        this.a.i();
        b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            com.tsf.shell.plugin.themepicker.e.b("PackageChangeReceiver ActionCode:" + intent.getAction());
            c.this.M();
        }
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        i().registerReceiver(this.e, intentFilter);
    }

    private void b() {
        i().unregisterReceiver(this.e);
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        com.tsf.shell.plugin.themepicker.e.b("ThemePreviewLocalFragment onCreateView");
        this.b = (ViewGroup) layoutInflater.inflate(f.h.theme_preview_fragment_layout, viewGroup, false);
        M();
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M() {
        k.a(i(), this);
    }

    @Override // android.support.v4.app.Fragment
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 100 && intent.getExtras().getInt("oper") == 1) {
            i().setResult(-1, intent);
            i().finish();
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.k.f
    public void a(List<ResolveInfo> list) {
        final GridView gridView = (GridView) this.b.findViewById(f.C0155f.gridView1);
        this.c = new b(list, i());
        gridView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.tsf.shell.plugin.themepicker.themepreview.c.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            @TargetApi(16)
            public void onGlobalLayout() {
                int floor = (int) Math.floor(gridView.getWidth() / (c.this.g + c.this.h));
                if (floor > 0) {
                    int width = (gridView.getWidth() / floor) - c.this.h;
                    c.this.c.a(floor);
                    c.this.c.b(width);
                    if (h.e()) {
                        gridView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        gridView.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                }
            }
        });
        gridView.setAdapter((ListAdapter) this.c);
        gridView.setOnItemClickListener(this.c);
    }

    /* loaded from: classes.dex */
    private class b extends BaseAdapter implements AdapterView.OnItemClickListener {
        private List<ResolveInfo> b;
        private Context c;
        private PackageManager d;
        private int e = 0;
        private int f = 0;
        private AbsListView.LayoutParams g;

        public b(List<ResolveInfo> list, Context context) {
            this.b = list;
            this.c = context;
            this.d = context.getPackageManager();
        }

        public void a(int i) {
            this.e = i;
        }

        public void b(int i) {
            if (i != this.f) {
                this.f = i;
                this.g = new AbsListView.LayoutParams(-1, this.f);
                notifyDataSetChanged();
            }
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (this.b != null) {
                return this.b.size() + this.e;
            }
            return 0;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            if (i < this.e) {
                return null;
            }
            return this.b.get(i - this.e);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            if (i < this.e) {
                return 0L;
            }
            return i - this.e;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i < this.e ? 1 : 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i < this.e) {
                if (view == null) {
                    view = new View(this.c);
                }
                view.setLayoutParams(new AbsListView.LayoutParams(-1, c.this.f));
            } else {
                if (view == null) {
                    view = LayoutInflater.from(this.c).inflate(f.h.theme_preview_grid_item, (ViewGroup) null);
                }
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
                view.setTag(resolveInfo.activityInfo.packageName);
                c.this.a.a(resolveInfo, (RecyclingImageView) view.findViewById(f.C0155f.imageView1));
                ((TextView) view.findViewById(f.C0155f.textView1)).setText(c.this.b(resolveInfo.loadLabel(this.d).toString()));
            }
            return view;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            ResolveInfo resolveInfo = (ResolveInfo) getItem(i);
            if (resolveInfo != null) {
                Intent intent = new Intent();
                intent.setClass(this.c, ThemePreviewDetilActivity.class);
                intent.putExtra("packagename", resolveInfo.activityInfo.packageName);
                c.this.i().startActivityForResult(intent, 100);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(String str) {
        if (str.length() > 15) {
            return str.substring(0, 15);
        }
        return str;
    }
}
