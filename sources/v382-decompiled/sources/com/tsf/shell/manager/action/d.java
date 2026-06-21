package com.tsf.shell.manager.action;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.tsf.shell.R;
import com.tsf.shell.activity.actionselector.ActionSelector;
import com.tsf.shell.utils.x;

/* loaded from: classes.dex */
public class d implements com.censivn.C3DEngine.b.c.b {
    private int a;
    private int b;
    private com.tsf.shell.a c;
    private boolean d;
    private Context e;

    public d(Context context, com.tsf.shell.a aVar, boolean z) {
        this.c = aVar;
        this.d = z;
        this.e = context;
        Intent intent = new Intent(context, (Class<?>) ActionSelector.class);
        intent.putExtra("android.intent.extra.INTENT", new Intent("android.intent.action.CREATE_SHORTCUT"));
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.putExtra("EXTRA_NEED_ICON", z);
        this.a = this.c.a(intent, this);
    }

    public void a(e eVar) {
        this.c = null;
    }

    @Override // com.censivn.C3DEngine.b.c.b
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra = intent == null ? -1 : intent.getIntExtra("action_type", -1);
        if (i2 == -1) {
            if (i == this.a) {
                if (intExtra == 3) {
                    a(intent);
                    return;
                } else if (intExtra == 1 || intExtra == 2) {
                    a(a(intent.getStringExtra("action_name"), "tsf://" + intent.getIntExtra("action", -1), intent));
                    return;
                } else {
                    a(a(intent.getStringExtra("action_name"), intent.toUri(0), intent));
                    return;
                }
            }
            if (i == this.b) {
                e a = a(intent.getStringExtra("android.intent.extra.shortcut.NAME"), ((Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT")).toUri(0), intent);
                if (this.d) {
                    Bitmap bitmap = (Bitmap) intent.getParcelableExtra("android.intent.extra.shortcut.ICON");
                    if (bitmap != null) {
                        a.c = bitmap;
                    } else {
                        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.shortcut.ICON_RESOURCE");
                        if (parcelableExtra != null && (parcelableExtra instanceof Intent.ShortcutIconResource)) {
                            Intent.ShortcutIconResource shortcutIconResource = (Intent.ShortcutIconResource) parcelableExtra;
                            try {
                                Resources resourcesForApplication = this.e.getPackageManager().getResourcesForApplication(shortcutIconResource.packageName);
                                a.c = x.a(resourcesForApplication, resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null));
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (a.c == null) {
                        a.c = x.a(R.drawable.sym_def_app_icon);
                    }
                }
                a(a);
            }
        }
    }

    private e a(String str, String str2, Intent intent) {
        e eVar = new e(this);
        eVar.a = str;
        eVar.b = str2;
        if (this.d) {
            eVar.c = (Bitmap) intent.getParcelableExtra("action_icon");
        }
        return eVar;
    }

    void a(Intent intent) {
        this.b = this.c.a(intent, this);
    }
}
