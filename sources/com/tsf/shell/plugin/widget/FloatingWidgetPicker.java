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
import com.tsf.C1306b;
import com.tsf.shell.utils.C4175k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* loaded from: classes.dex */
public class FloatingWidgetPicker extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

    /* renamed from: b */
    public static int f13040b = 0;

    /* renamed from: f */
    private C3973b f13045f;

    /* renamed from: g */
    private C3972a f13046g;

    /* renamed from: a */
    List<C3975a> f13041a = new ArrayList();

    /* renamed from: c */
    public final float f13042c = -99999.0f;

    /* renamed from: d */
    public final int f13043d = -99999;

    /* renamed from: e */
    public final String f13044e = "";

    /* renamed from: h */
    private BootReceiver f13047h = new BootReceiver();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1306b.C1313g.plugin_floating_widget_picker_activity_main);
        ListView listView = (ListView) findViewById(C1306b.C1311e.listView1);
        this.f13045f = new C3973b();
        listView.setAdapter((ListAdapter) this.f13045f);
        listView.setOnItemClickListener(this);
        listView.setSelector(new ColorDrawable(0));
        ListView listView2 = (ListView) findViewById(C1306b.C1311e.listView2);
        this.f13046g = new C3972a();
        listView2.setAdapter((ListAdapter) this.f13046g);
        listView2.setOnItemClickListener(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(-15395563));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        listView2.setSelector(stateListDrawable);
        findViewById(C1306b.C1311e.imageView1).setOnClickListener(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        m951c();
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        m954b();
        m962a();
        if (f13040b >= this.f13041a.size()) {
            f13040b = 0;
        }
        if (this.f13045f != null) {
            this.f13045f.notifyDataSetChanged();
        }
        if (this.f13046g != null) {
            this.f13046g.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m962a() {
        this.f13041a.clear();
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.widget.floating"), 0);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                try {
                    String str = resolveInfo.activityInfo.packageName;
                    Context createPackageContext = createPackageContext(str, 2);
                    XmlResourceParser xml = createPackageContext.getResources().getXml(createPackageContext.getResources().getIdentifier("floating", "xml", createPackageContext.getPackageName()));
                    FloatingItem floatingItem = null;
                    C3975a c3975a = null;
                    while (xml.getEventType() != 1) {
                        if (xml.getEventType() == 2) {
                            String name = xml.getName();
                            if (name.endsWith("type")) {
                                c3975a = new C3975a();
                                c3975a.f13057a = createPackageContext;
                                c3975a.f13058b = str;
                                c3975a.f13059c = xml.getAttributeValue(null, "drawable");
                                c3975a.f13063g.f13018a = xml.getAttributeValue(null, "defaultDirection");
                                if (c3975a.f13063g.f13018a == null) {
                                    c3975a.f13063g.f13018a = "horizontal_right";
                                }
                                c3975a.f13063g.f13019b = m956a(xml.getAttributeValue(null, "defaultSpeedRangeMax"), 4.2f);
                                c3975a.f13063g.f13020c = m956a(xml.getAttributeValue(null, "defaultSpeedRangeMin"), 0.0f);
                                c3975a.f13063g.f13021d = xml.getAttributeBooleanValue(null, "defaultOverturn", false);
                                c3975a.f13063g.f13022e = m956a(xml.getAttributeValue(null, "defaultWave"), 0.0f);
                            } else if (name.endsWith("item")) {
                                floatingItem = new FloatingItem();
                                floatingItem.f13038p = Animation.m968a(c3975a.f13063g);
                                floatingItem.f13023a = str;
                                floatingItem.f13024b = xml.getAttributeValue(null, "drawable");
                                if (floatingItem.f13024b == null) {
                                    floatingItem = null;
                                }
                            } else if (name.endsWith("animation")) {
                                Animation animation = floatingItem.f13038p;
                                animation.f13018a = xml.getAttributeValue(null, "direction");
                                if (animation.f13018a == null) {
                                    animation.f13018a = c3975a.f13063g.f13018a;
                                }
                                animation.f13019b = m956a(xml.getAttributeValue(null, "speedRangeMax"), c3975a.f13063g.f13019b);
                                animation.f13020c = m956a(xml.getAttributeValue(null, "speedRangeMin"), c3975a.f13063g.f13020c);
                                animation.f13021d = xml.getAttributeBooleanValue(null, "overturn", c3975a.f13063g.f13021d);
                                animation.f13022e = m956a(xml.getAttributeValue(null, "wave"), c3975a.f13063g.f13022e);
                            } else if (name.endsWith("TSFsequence")) {
                                TSFsequence tSFsequence = new TSFsequence();
                                tSFsequence.f13052a = xml.getAttributeValue(null, "image");
                                tSFsequence.f13053b = xml.getAttributeIntValue(null, "totalFrame", -99999);
                                tSFsequence.f13054c = xml.getAttributeIntValue(null, "unitCount", -99999);
                                tSFsequence.f13055d = xml.getAttributeIntValue(null, "unitHeight", -99999);
                                tSFsequence.f13056e = xml.getAttributeIntValue(null, "unitWidth", -99999);
                                if (tSFsequence.f13052a == null || tSFsequence.f13053b == -99999 || tSFsequence.f13054c == -99999 || tSFsequence.f13055d == -99999 || tSFsequence.f13056e == -99999) {
                                    floatingItem = null;
                                } else if (floatingItem != null) {
                                    floatingItem.f13039q = tSFsequence;
                                }
                            }
                        } else if (xml.getEventType() == 3) {
                            String name2 = xml.getName();
                            if (name2.endsWith("type")) {
                                if (c3975a != null) {
                                    this.f13041a.add(c3975a);
                                }
                                c3975a = null;
                            } else if (name2.endsWith("item") && floatingItem != null) {
                                c3975a.f13060d.add(floatingItem);
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
        m955a("com.tsf.shell.widget.floating.demo", "widget_floating_default");
        Collections.sort(this.f13041a, new Comparator<C3975a>() { // from class: com.tsf.shell.plugin.widget.FloatingWidgetPicker.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(C3975a c3975a2, C3975a c3975a3) {
                return FloatingWidgetPicker.this.m958a(c3975a2) - FloatingWidgetPicker.this.m958a(c3975a3);
            }
        });
        for (C3975a c3975a2 : this.f13041a) {
        }
    }

    /* renamed from: a */
    private float m956a(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return f;
        }
    }

    /* renamed from: a */
    private void m955a(String str, String str2) {
        if (m957a(str)) {
            this.f13041a.add(C3975a.m944a(this, str, str2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public int m958a(C3975a c3975a) {
        if (c3975a.f13061e) {
            return 10;
        }
        if (c3975a.f13058b.equals("com.tsf.shell.plugin.test")) {
            return 0;
        }
        return 5;
    }

    /* renamed from: a */
    private boolean m957a(String str) {
        try {
            getPackageManager().getPackageInfo(str, 64);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }

    /* renamed from: com.tsf.shell.plugin.widget.FloatingWidgetPicker$b */
    /* loaded from: classes.dex */
    class C3973b extends BaseAdapter {
        C3973b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return FloatingWidgetPicker.this.f13041a.size();
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
                view = LayoutInflater.from(context).inflate(C1306b.C1313g.plugin_floating_widget_picker_cover_list_item, (ViewGroup) null);
            }
            ((ImageView) view.findViewById(C1306b.C1311e.imageView1)).setImageBitmap(FloatingWidgetPicker.this.f13041a.get(i).m946a());
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.plugin.widget.FloatingWidgetPicker$a */
    /* loaded from: classes.dex */
    public class C3972a extends BaseAdapter {
        C3972a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (FloatingWidgetPicker.this.f13041a.size() == 0) {
                return 0;
            }
            return FloatingWidgetPicker.this.f13041a.get(FloatingWidgetPicker.f13040b).f13060d.size();
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
                view = LayoutInflater.from(context).inflate(C1306b.C1313g.plugin_floating_widget_picker_content_list_item, (ViewGroup) null);
            }
            ((ImageView) view.findViewById(C1306b.C1311e.imageView1)).setImageBitmap(FloatingWidgetPicker.this.f13041a.get(FloatingWidgetPicker.f13040b).m945a(i));
            return view;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        int id = adapterView.getId();
        if (id == C1306b.C1311e.listView1) {
            m961a(i);
        } else if (id == C1306b.C1311e.listView2) {
            m953b(i);
        }
    }

    /* renamed from: a */
    private void m961a(int i) {
        if (this.f13041a.get(i).f13061e) {
            C4175k.m671a(this, this.f13041a.get(i).f13062f);
            return;
        }
        f13040b = i;
        this.f13046g.notifyDataSetChanged();
    }

    /* renamed from: b */
    private void m953b(int i) {
        Intent intent = new Intent();
        FloatingItem floatingItem = this.f13041a.get(f13040b).f13060d.get(i);
        if (floatingItem.f13039q != null) {
            floatingItem.f13024b = floatingItem.f13039q.f13052a;
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
            FloatingWidgetPicker.this.m962a();
            if (FloatingWidgetPicker.f13040b >= FloatingWidgetPicker.this.f13041a.size()) {
                FloatingWidgetPicker.f13040b = 0;
            }
            if (FloatingWidgetPicker.this.f13045f != null) {
                FloatingWidgetPicker.this.f13045f.notifyDataSetChanged();
            }
            if (FloatingWidgetPicker.this.f13046g != null) {
                FloatingWidgetPicker.this.f13046g.notifyDataSetChanged();
            }
        }
    }

    /* renamed from: b */
    private void m954b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.f13047h, intentFilter);
    }

    /* renamed from: c */
    private void m951c() {
        try {
            unregisterReceiver(this.f13047h);
        } catch (Exception e) {
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == C1306b.C1311e.imageView1) {
            finish();
        }
    }
}
