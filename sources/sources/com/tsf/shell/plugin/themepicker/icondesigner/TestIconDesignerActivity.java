package com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.tsf.shell.plugin.themepicker.ThemePickerResources;
import com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.c;
import com.tsf.shell.plugin.themepicker.ThemePickerRenderer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TestIconDesignerActivity extends Activity implements View.OnClickListener, IconDesignerManager.a, k.f {
    List<ResolveInfo> a;
    private ArrayList<a> b;
    private int c = 0;
    private int d;
    private int e;
    private d f;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(IconDesignerColumns.h.theme_preview_test_icon_designer);
        IconDesignerManager.a((Context) this, (IconDesignerManager.a) this);
        ((Button) findViewById(IconDesignerColumns.C0155f.button1)).setOnClickListener(this);
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f = new IconDesignerRenderer();
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("getThemePreviewCount Cost :" + (System.currentTimeMillis() - jCurrentTimeMillis));
    }

    @Override // com.tsf.shell.plugin.themepicker.ThemePickerManagercondesigner.c.a
    public void a() {
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("onDeviceThemeInfoUpdate");
        this.b = IconDesignerManager.a(this);
        this.d = this.b.size();
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("backs max:" + this.d);
        k.a(this, this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws Throwable {
        ImageView imageView = (ImageView) findViewById(IconDesignerColumns.C0155f.imageView1);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = this.a.get(this.c).activityInfo.packageName;
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("packagename:" + str);
        Bitmap bitmapA = this.f.a(this, str, 500);
        com.tsf.shell.plugin.themepicker.ThemePickerEvent.b("load bitmap Cost :" + (System.currentTimeMillis() - jCurrentTimeMillis));
        imageView.setImageBitmap(bitmapA);
        this.c++;
        this.e = this.a.size();
        if (this.c >= this.e) {
            this.c = 0;
        }
    }

    @Override // com.tsf.shell.plugin.themepicker.ThemePickerRenderer.f
    public void a(List<ResolveInfo> list) {
        this.a = list;
    }
}
