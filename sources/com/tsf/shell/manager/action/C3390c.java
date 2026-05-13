package com.tsf.shell.manager.action;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.C1306b;
import com.tsf.shell.InterfaceC2185a;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.utils.C4189x;
/* renamed from: com.tsf.shell.manager.action.c */
/* loaded from: classes.dex */
public class C3390c implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    private int f11200a;

    /* renamed from: b */
    private int f11201b;

    /* renamed from: c */
    private InterfaceC2185a f11202c;

    /* renamed from: d */
    private boolean f11203d;

    /* renamed from: e */
    private Context f11204e;

    public C3390c(Context context, InterfaceC2185a interfaceC2185a, boolean z) {
        this.f11202c = interfaceC2185a;
        this.f11203d = z;
        this.f11204e = context;
        Intent intent = new Intent(context, ActionSelector.class);
        intent.putExtra("android.intent.extra.INTENT", new Intent("android.intent.action.CREATE_SHORTCUT"));
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.putExtra("EXTRA_NEED_ICON", z);
        this.f11200a = this.f11202c.mo927a(intent, this);
    }

    /* renamed from: a */
    public void mo924a(C3391a c3391a) {
        this.f11202c = null;
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra = intent == null ? -1 : intent.getIntExtra("action_type", -1);
        if (i2 == -1) {
            if (i == this.f11200a) {
                if (intExtra == 3) {
                    m2662a(intent);
                } else if (intExtra == 1 || intExtra == 2) {
                    mo924a(m2661a(intent.getStringExtra("action_name"), "tsf://" + intent.getIntExtra("action", -1), intent));
                } else {
                    mo924a(m2661a(intent.getStringExtra("action_name"), intent.toUri(0), intent));
                }
            } else if (i == this.f11201b) {
                C3391a m2661a = m2661a(intent.getStringExtra("android.intent.extra.shortcut.NAME"), ((Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT")).toUri(0), intent);
                if (this.f11203d) {
                    Bitmap bitmap = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                    if (bitmap != null) {
                        m2661a.f11207c = bitmap;
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (parcelableExtra != null && (parcelableExtra instanceof Intent.ShortcutIconResource)) {
                            Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) parcelableExtra;
                            try {
                                Resources resourcesForApplication = this.f11204e.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
                                m2661a.f11207c = C4189x.m604a(resourcesForApplication, resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null));
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (m2661a.f11207c == null) {
                        m2661a.f11207c = C4189x.m609a(C1306b.C1310d.sym_def_app_icon);
                    }
                }
                mo924a(m2661a);
            }
        }
    }

    /* renamed from: a */
    private C3391a m2661a(String str, String str2, Intent intent) {
        C3391a c3391a = new C3391a();
        c3391a.f11205a = str;
        c3391a.f11206b = str2;
        if (this.f11203d) {
            c3391a.f11207c = (Bitmap) intent.getParcelableExtra("action_icon");
        }
        return c3391a;
    }

    /* renamed from: a */
    void m2662a(Intent intent) {
        this.f11201b = this.f11202c.mo927a(intent, this);
    }

    /* renamed from: com.tsf.shell.manager.action.c$a */
    /* loaded from: classes.dex */
    public class C3391a {

        /* renamed from: a */
        public String f11205a;

        /* renamed from: b */
        public String f11206b;

        /* renamed from: c */
        public Bitmap f11207c;

        public C3391a() {
        }
    }
}
