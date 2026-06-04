package com.tsf.shell;

import android.app.Activity;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import com.tsf.shell.theme.inside.ThemeWallpaperDescription;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* loaded from: classes.dex */
public class ShellWallpaperSelector extends Activity implements View.OnClickListener, AdapterView.OnItemSelectedListener {
    private Gallery a;
    private ImageView b;
    private boolean c;
    private Bitmap d;
    private ArrayList e = new ArrayList();
    private ch f;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        a();
        setContentView(R.layout.wallpaper_chooser);
        this.a = (Gallery) findViewById(R.id.gallery);
        this.a.setAdapter((SpinnerAdapter) new cf(this, this));
        this.a.setOnItemSelectedListener(this);
        this.a.setCallbackDuringFling(false);
        findViewById(R.id.set).setOnClickListener(this);
        this.b = (ImageView) findViewById(R.id.wallpaper);
    }

    private boolean a() {
        try {
            ThemeWallpaperDescription a = a((Context) this);
            if (a != null) {
                a(a.getContext(), a.getWallpapers());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<ResolveInfo> queryIntentActivities = getPackageManager().queryIntentActivities(new Intent("com.tsf.shell.themes", (Uri) null), 0);
        Collections.sort(queryIntentActivities, new ResolveInfo.DisplayNameComparator(getPackageManager()));
        Iterator<ResolveInfo> it = queryIntentActivities.iterator();
        while (it.hasNext()) {
            try {
                Context createPackageContext = createPackageContext(it.next().activityInfo.packageName, 3);
                ThemeWallpaperDescription a2 = a(createPackageContext);
                if (a2 != null) {
                    a(createPackageContext, a2.getWallpapers());
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return true;
    }

    private ThemeWallpaperDescription a(Context context) {
        InputStream openRawResource;
        try {
            try {
                openRawResource = context.getAssets().open("theme/ThemeDescription.xml");
            } catch (Exception e) {
                try {
                    openRawResource = context.getAssets().open("theme/theme_description.xml");
                } catch (Exception e2) {
                    openRawResource = context.getResources().openRawResource(context.getResources().getIdentifier("theme_description", "raw", context.getPackageName()));
                }
            }
            NodeList childNodes = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(openRawResource).getDocumentElement().getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node item = childNodes.item(i);
                if (item.getNodeType() == 1) {
                    Element element = (Element) item;
                    if (element.getNodeName().equals("wallpaper")) {
                        NodeList childNodes2 = element.getChildNodes();
                        ThemeWallpaperDescription themeWallpaperDescription = new ThemeWallpaperDescription(this);
                        int length2 = childNodes2.getLength();
                        for (int i2 = 0; i2 < length2; i2++) {
                            Node item2 = childNodes2.item(i2);
                            if (item2.getNodeType() == 1) {
                                Element element2 = (Element) item2;
                                themeWallpaperDescription.addItem(new String[]{element2.getAttribute("image"), element2.getAttribute("thumb")});
                            }
                        }
                        return themeWallpaperDescription;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    private void a(Context context, ArrayList arrayList) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String[] strArr = (String[]) it.next();
            int identifier2 = resources.getIdentifier(strArr[0], "drawable", packageName);
            if (identifier2 != 0 && (identifier = resources.getIdentifier(strArr[1], "drawable", packageName)) != 0) {
                this.e.add(new cg(this, identifier, identifier2, context));
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.c = false;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        if (this.f != null && this.f.getStatus() != AsyncTask.Status.FINISHED) {
            this.f.cancel(true);
            this.f = null;
        }
        try {
            System.exit(0);
        } catch (Exception e) {
        }
        super.onDestroy();
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f != null && this.f.getStatus() != AsyncTask.Status.FINISHED) {
            this.f.a();
        }
        this.f = (ch) new ch(this).execute(Integer.valueOf(i));
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int selectedItemPosition = this.a.getSelectedItemPosition();
        if (!this.c) {
            this.c = true;
            try {
                WallpaperManager.getInstance(((cg) this.e.get(selectedItemPosition)).a).setResource(((cg) this.e.get(selectedItemPosition)).c);
                setResult(-1);
                finish();
            } catch (IOException e) {
                Log.e("Home.WallpaperChooser", "Failed to set wallpaper: " + e);
            }
        }
    }

    public static int a(BitmapFactory.Options options, int i) {
        int i2 = 1;
        int ceil = i == -1 ? 1 : (int) Math.ceil(Math.sqrt((options.outWidth * options.outHeight) / i));
        if (128 >= ceil && i == -1) {
            ceil = 1;
        }
        if (ceil <= 8) {
            while (i2 < ceil) {
                i2 <<= 1;
            }
            return i2;
        }
        return ((ceil + 7) / 8) * 8;
    }
}
