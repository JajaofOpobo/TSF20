package com.tsf.shell.theme.inside.mix.menu.item;

import android.content.Intent;
import android.graphics.Bitmap;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.p031b.p035c.C0913a;
import com.tsf.C1306b;
import com.tsf.shell.Home;
import com.tsf.shell.plugin.fontspicker.FontsPickerActivity;
import com.tsf.shell.utils.C4189x;
/* loaded from: classes.dex */
public class ThemeMixFontPlane extends ThemeMenuMixElementPlane implements C0913a.InterfaceC0914a {
    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public Bitmap getPreviewBitmap() {
        return C4189x.m609a(C1306b.C1310d.theme_font);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public String getTitle() {
        return C4189x.m588c(C1306b.C1315i.text_font);
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public String getSummary() {
        return "";
    }

    @Override // com.tsf.shell.theme.inside.mix.menu.item.ThemeMenuMixElementPlane
    public void onClick() {
        C0853a.m10865a().m10588a(new Runnable() { // from class: com.tsf.shell.theme.inside.mix.menu.item.ThemeMixFontPlane.1
            @Override // java.lang.Runnable
            public void run() {
                Intent intent = new Intent();
                intent.setClass(C0853a.m10856d(), FontsPickerActivity.class);
                Home.m6177b().mo927a(intent, (C0913a.InterfaceC0914a) ThemeMixFontPlane.this);
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p035c.C0913a.InterfaceC0914a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            Home.m6177b().m6173c();
        }
    }
}
