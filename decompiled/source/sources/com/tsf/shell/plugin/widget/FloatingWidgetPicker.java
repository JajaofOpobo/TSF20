package com.tsf.shell.plugin.widget;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.b;
import com.tsf.shell.utils.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class FloatingWidgetPicker extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static int b = 0;
    private b f;
    private a g;
    List<com.tsf.shell.plugin.widget.a> a = new ArrayList();
    public final float c = -99999.0f;
    public final int d = -99999;
    public final String e = "";
    private BootReceiver h = new BootReceiver();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(b.g.plugin_floating_widget_picker_activity_main);
        ListView listView = (ListView) findViewById(b.e.listView1);
        this.f = new b();
        listView.setAdapter((ListAdapter) this.f);
        listView.setOnItemClickListener(this);
        listView.setSelector(new ColorDrawable(0));
        ListView listView2 = (ListView) findViewById(b.e.listView2);
        this.g = new a();
        listView2.setAdapter((ListAdapter) this.g);
        listView2.setOnItemClickListener(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(-15395563));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        listView2.setSelector(stateListDrawable);
        findViewById(b.e.imageView1).setOnClickListener(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        b();
        a();
        if (b >= this.a.size()) {
            b = 0;
        }
        if (this.f != null) {
            this.f.notifyDataSetChanged();
        }
        if (this.g != null) {
            this.g.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.a.clear();
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.widget.floating"), 0);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                try {
                    String str = resolveInfo.activityInfo.packageName;
                    Context createPackageContext = createPackageContext(str, 2);
                    XmlResourceParser xml = createPackageContext.getResources().getXml(createPackageContext.getResources().getIdentifier("floating", "xml", createPackageContext.getPackageName()));
                    FloatingItem floatingItem = null;
                    com.tsf.shell.plugin.widget.a aVar = null;
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2) {
                            String name = xml.getName();
                            if (name.endsWith("type")) {
                                aVar = new com.tsf.shell.plugin.widget.a();
                                aVar.a = createPackageContext;
                                aVar.b = str;
                                aVar.c = xml.getAttributeValue(null, "drawable");
                                aVar.g.a = xml.getAttributeValue(null, "defaultDirection");
                                if (aVar.g.a == null) {
                                    aVar.g.a = "horizontal_right";
                                }
                                aVar.g.b = a(xml.getAttributeValue(null, "defaultSpeedRangeMax"), 4.2f);
                                aVar.g.c = a(xml.getAttributeValue(null, "defaultSpeedRangeMin"), 0.0f);
                                aVar.g.d = xml.getAttributeBooleanValue(null, "defaultOverturn", false);
                                aVar.g.e = a(xml.getAttributeValue(null, "defaultWave"), 0.0f);
                            } else if (name.endsWith("item")) {
                                floatingItem = new FloatingItem();
                                floatingItem.p = Animation.a(aVar.g);
                                floatingItem.a = str;
                                floatingItem.b = xml.getAttributeValue(null, "drawable");
                                if (floatingItem.b == null) {
                                    floatingItem = null;
                                }
                            } else if (name.endsWith("animation")) {
                                Animation animation = floatingItem.p;
                                animation.a = xml.getAttributeValue(null, "direction");
                                if (animation.a == null) {
                                    animation.a = aVar.g.a;
                                }
                                animation.b = a(xml.getAttributeValue(null, "speedRangeMax"), aVar.g.b);
                                animation.c = a(xml.getAttributeValue(null, "speedRangeMin"), aVar.g.c);
                                animation.d = xml.getAttributeBooleanValue(null, "overturn", aVar.g.d);
                                animation.e = a(xml.getAttributeValue(null, "wave"), aVar.g.e);
                            } else if (name.endsWith("TSFsequence")) {
                                TSFsequence tSFsequence = new TSFsequence();
                                tSFsequence.a = xml.getAttributeValue(null, "image");
                                tSFsequence.b = xml.getAttributeIntValue(null, "totalFrame", -99999);
                                tSFsequence.c = xml.getAttributeIntValue(null, "unitCount", -99999);
                                tSFsequence.d = xml.getAttributeIntValue(null, "unitHeight", -99999);
                                tSFsequence.e = xml.getAttributeIntValue(null, "unitWidth", -99999);
                                if (tSFsequence.a == null || tSFsequence.b == -99999 || tSFsequence.c == -99999 || tSFsequence.d == -99999 || tSFsequence.e == -99999) {
                                    floatingItem = null;
                                } else if (floatingItem != null) {
                                    floatingItem.q = tSFsequence;
                                }
                            }
                        } else if (xml.getEventType() == 3) {
                            String name2 = xml.getName();
                            if (name2.endsWith("type")) {
                                if (aVar != null) {
                                    this.a.add(aVar);
                                }
                                aVar = null;
                            } else if (name2.endsWith("item") && floatingItem != null) {
                                aVar.d.add(floatingItem);
                                floatingItem = null;
                            }
                        }
                        xml.next();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        a("com.tsf.shell.widget.floating.demo", "widget_floating_default");
        Collections.sort(this.a, new Comparator<com.tsf.shell.plugin.widget.a>() { // from class: com.tsf.shell.plugin.widget.FloatingWidgetPicker.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(com.tsf.shell.plugin.widget.a aVar2, com.tsf.shell.plugin.widget.a aVar3) {
                return FloatingWidgetPicker.this.a(aVar2) - FloatingWidgetPicker.this.a(aVar3);
            }
        });
        for (com.tsf.shell.plugin.widget.a aVar2 : this.a) {
        }
    }

    private float a(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return f;
        }
    }

    private void a(String str, String str2) {
        if (a(str)) {
            this.a.add(com.tsf.shell.plugin.widget.a.a(this, str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(com.tsf.shell.plugin.widget.a aVar) {
        if (aVar.e) {
            return 10;
        }
        if (aVar.b.equals("com.tsf.shell.plugin.test")) {
            return 0;
        }
        return 5;
    }

    private boolean a(String str) {
        try {
            getPackageManager().getPackageInfo(str, 64);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return FloatingWidgetPicker.this.a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            if (view == null) {
                view = LayoutInflater.from(context).inflate(b.g.plugin_floating_widget_picker_cover_list_item, (ViewGroup) null);
            }
            ((ImageView) view.findViewById(b.e.imageView1)).setImageBitmap(FloatingWidgetPicker.this.a.get(i).a());
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (FloatingWidgetPicker.this.a.size() == 0) {
                return 0;
            }
            return FloatingWidgetPicker.this.a.get(FloatingWidgetPicker.b).d.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            Context context = viewGroup.getContext();
            if (view == null) {
                view = LayoutInflater.from(context).inflate(b.g.plugin_floating_widget_picker_content_list_item, (ViewGroup) null);
            }
            ((ImageView) view.findViewById(b.e.imageView1)).setImageBitmap(FloatingWidgetPicker.this.a.get(FloatingWidgetPicker.b).a(i));
            return view;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int id = adapterView.getId();
        if (id == b.e.listView1) {
            a(i);
        } else if (id == b.e.listView2) {
            b(i);
        }
    }

    private void a(int i) {
        if (this.a.get(i).e) {
            k.a(this, this.a.get(i).f);
            return;
        }
        b = i;
        this.g.notifyDataSetChanged();
    }

    private void b(int i) {
        Intent intent = new Intent();
        FloatingItem floatingItem = this.a.get(b).d.get(i);
        if (floatingItem.q != null) {
            floatingItem.b = floatingItem.q.a;
        }
        intent.putExtra("result", floatingItem);
        setResult(-1, intent);
        finish();
    }

    /* loaded from: classes.dex */
    public class BootReceiver extends BroadcastReceiver {
        public BootReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
                intent.getDataString();
            }
            if (intent.getAction().equals("android.intent.action.PACKAGE_REMOVED")) {
                intent.getDataString();
            }
            FloatingWidgetPicker.this.a();
            if (FloatingWidgetPicker.b >= FloatingWidgetPicker.this.a.size()) {
                FloatingWidgetPicker.b = 0;
            }
            if (FloatingWidgetPicker.this.f != null) {
                FloatingWidgetPicker.this.f.notifyDataSetChanged();
            }
            if (FloatingWidgetPicker.this.g != null) {
                FloatingWidgetPicker.this.g.notifyDataSetChanged();
            }
        }
    }

    private void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.h, intentFilter);
    }

    private void c() {
        try {
            unregisterReceiver(this.h);
        } catch (Exception e) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == b.e.imageView1) {
            finish();
        }
    }
}
