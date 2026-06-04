package com.tsf.shell.action;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Parcelable;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class e implements com.tsf.shell.a {
    private int a;
    private int b;
    private com.tsf.shell.h c;
    private boolean d;
    private Context e;

    public e(Context context, com.tsf.shell.h hVar, boolean z) {
        this.c = hVar;
        this.d = z;
        this.e = context;
        Intent intent = new Intent(context, (Class<?>) ActionSelector.class);
        intent.putExtra("android.intent.extra.INTENT", new Intent("android.intent.action.CREATE_SHORTCUT"));
        intent.putExtra("android.intent.extra.TITLE", "");
        intent.putExtra("EXTRA_NEED_ICON", z);
        this.a = this.c.a(intent, this);
    }

    public void a(f fVar) {
        this.c = null;
    }

    @Override // com.tsf.shell.a
    public void onActivityResult(int i, int i2, Intent intent) {
        int intExtra = intent == null ? -1 : intent.getIntExtra("action_type", -1);
        if (i2 == -1) {
            if (i == this.a) {
                if (intExtra == 2) {
                    this.b = this.c.a(intent, this);
                    return;
                } else if (intExtra == 1) {
                    a(a(intent.getStringExtra("action_name"), "tsf://" + intent.getIntExtra("action", -1), intent));
                    return;
                } else {
                    a(a(intent.getStringExtra("action_name"), intent.toUri(0), intent));
                    return;
                }
            }
            if (i == this.b) {
                f a = a(intent.getStringExtra("android.intent.extra.shortcut.NAME"), ((Intent) intent.getParcelableExtra("android.intent.extra.shortcut.INTENT")).toUri(0), intent);
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
                                a.c = com.censivn.C3DEngine.h.a.a(resourcesForApplication, resourcesForApplication.getIdentifier(shortcutIconResource.resourceName, null, null));
                            } catch (Exception e) {
                            }
                        }
                    }
                    if (a.c == null) {
                        a.c = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), R.drawable.dummy_icon);
                    }
                }
                a(a);
            }
        }
    }

    private f a(String str, String str2, Intent intent) {
        f fVar = new f(this);
        fVar.a = str;
        fVar.b = str2;
        if (this.d) {
            fVar.c = (Bitmap) intent.getParcelableExtra("action_icon");
        }
        return fVar;
    }
}
