package com.tsf.shell.manager.action;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.b;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.utils.x;
/* loaded from: classes.dex */
public class c implements a.InterfaceC0025a {
    private int a;
    private int b;
    private com.tsf.shell.a c;
    private boolean d;
    private Context e;

    public c(Context context, com.tsf.shell.a aVar, boolean z) {
        this.c = aVar;
        this.d = z;
        this.e = context;
        Intent intent = new Intent(context, ActionSelector.class);
        intent.putExtra("android.intent.extra.INTENT", new Intent("android.intent.action.CREATE_SHORTCUT"));
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.putExtra("EXTRA_NEED_ICON", z);
        this.a = this.c.a(intent, this);
    }

    public void a(a aVar) {
        this.c = null;
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra = intent == null ? -1 : intent.getIntExtra("action_type", -1);
        if (i2 == -1) {
            if (i == this.a) {
                if (intExtra == 3) {
                    a(intent);
                } else if (intExtra == 1 || intExtra == 2) {
                    a(a(intent.getStringExtra("action_name"), "tsf://" + intent.getIntExtra("action", -1), intent));
                } else {
                    a(a(intent.getStringExtra("action_name"), intent.toUri(0), intent));
                }
            } else if (i == this.b) {
                a a2 = a(intent.getStringExtra("android.intent.extra.shortcut.NAME"), ((Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT")).toUri(0), intent);
                if (this.d) {
                    Bitmap bitmap = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                    if (bitmap != null) {
                        a2.c = bitmap;
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (parcelableExtra != null && (parcelableExtra instanceof Intent.ShortcutIconResource)) {
                            Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) parcelableExtra;
                            try {
                                Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
                                a2.c = x.a(resourcesForApplication, resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null));
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (a2.c == null) {
                        a2.c = x.a(b.d.sym_def_app_icon);
                    }
                }
                a(a2);
            }
        }
    }

    private a a(String str, String str2, Intent intent) {
        a aVar = new a();
        aVar.a = str;
        aVar.b = str2;
        if (this.d) {
            aVar.c = (Bitmap) intent.getParcelableExtra("action_icon");
        }
        return aVar;
    }

    void a(Intent intent) {
        this.b = this.c.a(intent, this);
    }

    /* loaded from: classes.dex */
    public class a {
        public String a;
        public String b;
        public Bitmap c;

        public a() {
        }
    }
}
