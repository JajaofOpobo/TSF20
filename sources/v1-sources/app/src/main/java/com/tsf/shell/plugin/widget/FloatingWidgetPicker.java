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
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class FloatingWidgetPicker extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {
    public static int b = 0;
    private f f;
    private e g;
    List a = new ArrayList();
    public final float c = -99999.0f;
    public final int d = -99999;
    public final String e = "";
    private BootReceiver h = new BootReceiver();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.plugin_floating_widget_picker_activity_main);
        ListView listView = (ListView) findViewById(R.id.listView1);
        this.f = new f(this);
        listView.setAdapter((ListAdapter) this.f);
        listView.setOnItemClickListener(this);
        listView.setSelector(new ColorDrawable(0));
        ListView listView2 = (ListView) findViewById(R.id.listView2);
        this.g = new e(this);
        listView2.setAdapter((ListAdapter) this.g);
        listView2.setOnItemClickListener(this);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new ColorDrawable(-15395563));
        stateListDrawable.addState(new int[0], new ColorDrawable(0));
        listView2.setSelector(stateListDrawable);
        findViewById(R.id.imageView1).setOnClickListener(this);
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        try {
            unregisterReceiver(this.h);
        } catch (Exception e) {
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addDataScheme("package");
        registerReceiver(this.h, intentFilter);
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
        Iterator<ResolveInfo> it = getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.widget.floating"), 0).iterator();
        while (it.hasNext()) {
            try {
                String str = it.next().activityInfo.packageName;
                Context createPackageContext = createPackageContext(str, 2);
                XmlResourceParser xml = createPackageContext.getResources().getXml(createPackageContext.getResources().getIdentifier("floating", "xml", createPackageContext.getPackageName()));
                FloatingItem floatingItem = null;
                c cVar = null;
                while (xml.getEventType() != 1) {
                    if (xml.getEventType() == 2) {
                        String name = xml.getName();
                        if (name.endsWith("type")) {
                            cVar = new c();
                            cVar.a = createPackageContext;
                            cVar.b = str;
                            cVar.c = xml.getAttributeValue(null, "drawable");
                            cVar.g.a = xml.getAttributeValue(null, "defaultDirection");
                            if (cVar.g.a == null) {
                                cVar.g.a = "horizontal_right";
                            }
                            cVar.g.b = a(xml.getAttributeValue(null, "defaultSpeedRangeMax"), 4.2f);
                            cVar.g.c = a(xml.getAttributeValue(null, "defaultSpeedRangeMin"), 0.0f);
                            cVar.g.d = xml.getAttributeBooleanValue(null, "defaultOverturn", false);
                            cVar.g.e = a(xml.getAttributeValue(null, "defaultWave"), 0.0f);
                        } else if (name.endsWith("item")) {
                            floatingItem = new FloatingItem();
                            floatingItem.p = Animation.a(cVar.g);
                            floatingItem.a = str;
                            floatingItem.b = xml.getAttributeValue(null, "drawable");
                            if (floatingItem.b == null) {
                                floatingItem = null;
                            }
                        } else if (name.endsWith("animation")) {
                            Animation animation = floatingItem.p;
                            animation.a = xml.getAttributeValue(null, "direction");
                            if (animation.a == null) {
                                animation.a = cVar.g.a;
                            }
                            animation.b = a(xml.getAttributeValue(null, "speedRangeMax"), cVar.g.b);
                            animation.c = a(xml.getAttributeValue(null, "speedRangeMin"), cVar.g.c);
                            animation.d = xml.getAttributeBooleanValue(null, "overturn", cVar.g.d);
                            animation.e = a(xml.getAttributeValue(null, "wave"), cVar.g.e);
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
                            if (cVar != null) {
                                this.a.add(cVar);
                            }
                            cVar = null;
                        } else if (name2.endsWith("item") && floatingItem != null) {
                            cVar.d.add(floatingItem);
                            floatingItem = null;
                        }
                    }
                    xml.next();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (a("com.tsf.shell.widget.floating.demo")) {
            c cVar2 = new c();
            cVar2.a = this;
            cVar2.b = getPackageName();
            cVar2.f = "com.tsf.shell.widget.floating.demo";
            cVar2.c = "widget_floating_default";
            cVar2.e = true;
            this.a.add(cVar2);
        }
        Collections.sort(this.a, new d(this));
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private static float a(String str, float f) {
        try {
            return Float.parseFloat(str);
        } catch (Exception e) {
            return f;
        }
    }

    static /* synthetic */ int a(c cVar) {
        if (cVar.e) {
            return 10;
        }
        return cVar.b.equals("com.tsf.shell.plugin.test") ? 0 : 5;
    }

    private boolean a(String str) {
        try {
            getPackageManager().getPackageInfo(str, 64);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            return true;
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        switch (adapterView.getId()) {
            case R.id.listView1 /* 2131623961 */:
                if (!((c) this.a.get(i)).e) {
                    b = i;
                    this.g.notifyDataSetChanged();
                    break;
                } else {
                    com.tsf.shell.g.d.a(this, ((c) this.a.get(i)).f);
                    break;
                }
            case R.id.listView2 /* 2131623962 */:
                Intent intent = new Intent();
                FloatingItem floatingItem = (FloatingItem) ((c) this.a.get(b)).d.get(i);
                if (floatingItem.q != null) {
                    floatingItem.b = floatingItem.q.a;
                }
                intent.putExtra("result", floatingItem);
                setResult(-1, intent);
                finish();
                break;
        }
    }

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

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.imageView1) {
            finish();
        }
    }
}
