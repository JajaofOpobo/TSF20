package com.tsf.shell.theme.inside.mix.menu.item;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.b.c.a;
import com.tsf.b;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.fontspicker.FontsPickerActivity;
import com.tsf.shell.utils.x;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ThemeMixFontPlane extends ThemeMenuMixElementPlane implements a.InterfaceC0025a {
    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public Bitmap getPreviewBitmap() {
        return x.a(b.d.theme_font);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public String getTitle() {
        return x.c(b.i.text_font);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public String getSummary() {
        return "";
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public void onClick() {
        com.censivn.C3DEngine.a.a().a(new Runnable() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixFontPlane.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setClass(com.censivn.C3DEngine.a.d(), FontsPickerActivity.class);
                Home.b().a(intent, (a.InterfaceC0025a) ThemeMixFontPlane.this);
            }
        });
    }

    @Override // com.censivn.C3DEngine.b.c.a.InterfaceC0025a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Home.b().c();
        }
    }
}
