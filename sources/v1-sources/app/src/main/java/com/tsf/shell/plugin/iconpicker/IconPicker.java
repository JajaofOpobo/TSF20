package com.tsf.shell.plugin.iconpicker;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TextView;
import com.tsf.shell.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class IconPicker extends FragmentActivity {
    private static List o;
    private static int p;
    private static int q;
    private static IconPicker s;
    private static int t = 96;
    private static int u = 96;
    private h n;
    private PackageManager r;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        s = this;
        this.r = getPackageManager();
        o = new ArrayList();
        o.addAll(this.r.queryIntentActivities(new Intent("com.gau.go.launcherex.theme"), 0));
        p = o.size();
        o.addAll(a(this.r.queryIntentActivities(new Intent("org.adw.launcher.THEMES"), 0)));
        q = o.size();
        o.addAll(a(this.r.queryIntentActivities(new Intent("com.tsf.shell.themes"), 0)));
        setContentView(R.layout.icon_picker_viewer_tabs_pager);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.scrollview);
        TabHost tabHost = (TabHost) findViewById(android.R.id.tabhost);
        tabHost.setup();
        this.n = new h(this, tabHost, (ViewPager) findViewById(R.id.pager), horizontalScrollView);
        int size = o.size();
        int i2 = 0;
        while (i2 < size) {
            ResolveInfo resolveInfo = (ResolveInfo) o.get(i2);
            View inflate = LayoutInflater.from(this).inflate(R.layout.icon_picker_tab_item, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            imageView.setImageDrawable(resolveInfo.activityInfo.loadIcon(this.r));
            imageView.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.title)).setText(resolveInfo.loadLabel(this.r));
            Bundle bundle2 = new Bundle();
            bundle2.putInt("num", i2);
            if (i2 < p) {
                i = 0;
            } else {
                i = i2 < q ? 1 : 2;
            }
            bundle2.putInt("PkgType", i);
            bundle2.putString("PkgName", ((ResolveInfo) o.get(i2)).activityInfo.packageName);
            this.n.a(tabHost.newTabSpec("simple").setIndicator(inflate), d.class, bundle2);
            i2++;
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            t = extras.getInt("width", 96);
            u = extras.getInt("height", 96);
        }
        g gVar = new g(this);
        findViewById(R.id.gallery).setOnClickListener(gVar);
        findViewById(R.id.reset).setOnClickListener(gVar);
        findViewById(R.id.file).setOnClickListener(gVar);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            Iterator it2 = o.iterator();
            while (it2.hasNext()) {
                if (resolveInfo.activityInfo.packageName.equals(((ResolveInfo) it2.next()).activityInfo.packageName)) {
                    arrayList.add(resolveInfo);
                }
            }
        }
        list.removeAll(arrayList);
        return list;
    }

    static /* synthetic */ void b(IconPicker iconPicker) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        iconPicker.startActivityForResult(Intent.createChooser(intent, null), 2);
    }

    public static void a(Bitmap bitmap) {
        if (bitmap == null) {
            bitmap = null;
        } else {
            int i = t;
            int i2 = u;
            if (bitmap.getWidth() / bitmap.getHeight() == i / i2) {
                bitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            } else if (bitmap.getWidth() != i || bitmap.getHeight() != i2) {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                float min = Math.min(i / width, i2 / height);
                canvas.translate((i - (width * min)) / 2.0f, (i2 - (height * min)) / 2.0f);
                canvas.scale(min, min);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                bitmap.recycle();
                bitmap = createBitmap;
            }
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("data", bitmap);
        intent.putExtras(bundle);
        s.setResult(-1, intent);
        s.finish();
    }

    static /* synthetic */ void a(IconPicker iconPicker) {
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        iconPicker.startActivityForResult(intent, 0);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            switch (i) {
                case 0:
                    Uri data = intent.getData();
                    Intent intent2 = new Intent("com.android.camera.action.CROP");
                    intent2.setDataAndType(data, "image/*");
                    intent2.putExtra("crop", "true");
                    intent2.putExtra("aspectX", 1);
                    intent2.putExtra("aspectY", 1);
                    intent2.putExtra("outputX", t);
                    intent2.putExtra("outputY", u);
                    intent2.putExtra("return-data", true);
                    startActivityForResult(intent2, 1);
                    break;
                case 1:
                    Bundle extras = intent.getExtras();
                    a(extras != null ? (Bitmap) extras.getParcelable("data") : null);
                    break;
                case 2:
                    try {
                        r0 = MediaStore.Images.Media.getBitmap(getContentResolver(), intent.getData());
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    a(r0);
                    break;
            }
            return;
        }
        setResult(0);
        finish();
    }
}
