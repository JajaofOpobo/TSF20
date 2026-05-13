package com.tsf.shell.p096f.p118e.p129h;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.element.info.shortcut.LauncherShortcutAppInfo;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.p096f.p153i.p155b.p160e.C3222g;
import com.tsf.shell.plugin.themepicker.AppIconEditorActivity;
/* renamed from: com.tsf.shell.f.e.h.b */
/* loaded from: classes.dex */
public class C2614b implements C0913a.InterfaceC0914a {

    /* renamed from: a */
    private static C2614b f8602a;

    /* renamed from: b */
    private InterfaceC2616a f8603b;

    /* renamed from: c */
    private int f8604c;

    /* renamed from: d */
    private int f8605d;

    /* renamed from: e */
    private int f8606e;

    /* renamed from: com.tsf.shell.f.e.h.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2616a {
        /* renamed from: a */
        void mo5155a(Bitmap bitmap, String str);

        /* renamed from: b */
        void mo5154b();
    }

    public C2614b() {
        String[] strArr = {C0853a.m10856d().getString(C1306b.C1315i.icon_picker_main_item_0), C0853a.m10856d().getString(C1306b.C1315i.icon_picker_main_item_1), C0853a.m10856d().getString(C1306b.C1315i.icon_picker_main_item_2), C0853a.m10856d().getString(C1306b.C1315i.icon_picker_main_item_3)};
    }

    /* renamed from: a */
    public static void m5158a(final InterfaceC2616a interfaceC2616a, final AbstractC3208b abstractC3208b, final int i, final int i2) {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.f.e.h.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (C2614b.f8602a == null) {
                    C2614b unused = C2614b.f8602a = new C2614b();
                }
                C2614b.f8602a.m5156b(InterfaceC2616a.this, abstractC3208b, i, i2);
            }
        });
    }

    /* renamed from: b */
    public void m5156b(InterfaceC2616a interfaceC2616a, AbstractC3208b abstractC3208b, int i, int i2) {
        this.f8603b = interfaceC2616a;
        this.f8605d = i;
        this.f8606e = i2;
        LauncherShortcut3DInfo launcherShortcut3DInfo = (LauncherShortcut3DInfo) abstractC3208b.m3534K();
        Intent intent = new Intent();
        intent.setClass(C0853a.m10856d(), AppIconEditorActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("icon", launcherShortcut3DInfo.getIconBitmap());
        bundle.putString("name", launcherShortcut3DInfo.title);
        if (launcherShortcut3DInfo instanceof LauncherShortcutAppInfo) {
            bundle.putString("package", ((C3222g) abstractC3208b).m3106bd().f11169b.getPackageName());
        }
        bundle.putInt("width", this.f8605d);
        bundle.putInt("height", this.f8606e);
        bundle.putInt("iconStartX", abstractC3208b.m3159aE().f11746D);
        bundle.putInt("iconStartY", abstractC3208b.m3159aE().f11747E);
        bundle.putInt("iconWidth", abstractC3208b.m3159aE().f11750H);
        bundle.putInt("iconHeight", abstractC3208b.m3159aE().f11751I);
        intent.putExtra("appInfo", bundle);
        this.f8604c = Home.m6177b().m6176b(intent, f8602a);
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == this.f8604c) {
                Bundle extras = intent.getExtras();
                Bitmap bitmap = (Bitmap) extras.getParcelable("icon");
                String string = extras.getString("name");
                boolean z = extras.getBoolean("reset");
                if (this.f8603b == null) {
                    bitmap.recycle();
                    return;
                }
                try {
                    if (z) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.f8603b.mo5154b();
                        return;
                    }
                    this.f8603b.mo5155a(bitmap, string);
                    this.f8603b = null;
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    this.f8603b = null;
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                }
            }
            return;
        }
        this.f8603b = null;
    }
}
