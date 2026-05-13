package com.tsf.shell.plugin.crop;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k;
import android.support.p002v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tsf.shell.plugin.crop.C3793e;
import java.io.File;
/* loaded from: classes.dex */
public class CropImageActivity extends FragmentActivity implements View.OnClickListener {

    /* renamed from: s */
    private CropImageView f12405s;

    /* renamed from: t */
    private PopupWindow f12406t;

    /* renamed from: u */
    private static int f12402u = 0;

    /* renamed from: v */
    private static int f12403v = 0;

    /* renamed from: m */
    public static String f12397m = "crop_mode";

    /* renamed from: n */
    public static int f12398n = 0;

    /* renamed from: o */
    public static int f12399o = 4;

    /* renamed from: p */
    public static int f12400p = 1;

    /* renamed from: q */
    public static int f12401q = 2;

    /* renamed from: r */
    private final int f12404r = 100;

    /* renamed from: w */
    private int f12407w = f12398n;

    /* renamed from: x */
    private Handler f12408x = new Handler();

    /* renamed from: y */
    private boolean f12409y = false;

    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3793e.C3795b.cutting_activity_layout);
        this.f12405s = (CropImageView) findViewById(C3793e.C3794a.cropimageview);
        Intent intent = getIntent();
        Uri data = intent.getData();
        try {
            this.f12405s.setStroke(intent.getExtras().getBoolean("stroke"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.f12407w = intent.getExtras().getInt(f12397m);
            if (this.f12407w != f12398n) {
                if (this.f12407w == f12399o) {
                    this.f12405s.setCropMode(3);
                    findViewById(C3793e.C3794a.ic_menu_crop).setVisibility(8);
                } else if (this.f12407w == f12400p) {
                    this.f12405s.setCropMode(0);
                    findViewById(C3793e.C3794a.ic_menu_crop).setVisibility(8);
                } else if (this.f12407w == f12401q) {
                    this.f12405s.setCropMode(1);
                    findViewById(C3793e.C3794a.ic_menu_crop).setVisibility(8);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.f12405s.m1489a(intent.getExtras().getInt("outputX"), intent.getExtras().getInt("outputY"));
        } catch (Exception e3) {
        }
        try {
            this.f12409y = intent.getExtras().getBoolean("return-data");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        C3790c.m1466a("GET DATE:" + data);
        findViewById(C3793e.C3794a.ic_menu_metrics).setOnClickListener(this);
        findViewById(C3793e.C3794a.ic_menu_crop).setOnClickListener(this);
        findViewById(C3793e.C3794a.crop_image_cancel).setOnClickListener(this);
        findViewById(C3793e.C3794a.crop_image_done).setOnClickListener(this);
        m1506a(data);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        C3790c.m1466a("resultCode:" + i2);
        if (intent == null || i2 == 0) {
            m1494i();
            return;
        }
        if (i == 100) {
            C3790c.m1466a("URI:" + intent.getData().toString());
            m1506a(intent.getData());
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tsf.shell.plugin.crop.CropImageActivity$2] */
    /* renamed from: a */
    public void m1506a(final Uri uri) {
        if (uri != null) {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please wait while loading...");
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.show();
            progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    CropImageActivity.this.m1494i();
                }
            });
            new Thread() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.2
                /* JADX WARN: Removed duplicated region for block: B:9:0x005e  */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r8 = this;
                        r0 = 0
                        com.tsf.shell.plugin.crop.CropImageActivity r1 = com.tsf.shell.plugin.crop.CropImageActivity.this     // Catch: java.lang.Exception -> L75
                        android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L75
                        android.net.Uri r2 = r2     // Catch: java.lang.Exception -> L75
                        java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.lang.Exception -> L75
                        android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Exception -> L75
                        r2.<init>()     // Catch: java.lang.Exception -> L75
                        r3 = 1
                        r2.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L75
                        r3 = 0
                        android.graphics.BitmapFactory.decodeStream(r1, r3, r2)     // Catch: java.lang.Exception -> L75
                        r1.close()     // Catch: java.lang.Exception -> L75
                        int r1 = r2.outHeight     // Catch: java.lang.Exception -> L75
                        int r3 = r2.outWidth     // Catch: java.lang.Exception -> L75
                        int r1 = java.lang.Math.min(r1, r3)     // Catch: java.lang.Exception -> L75
                        double r4 = (double) r1     // Catch: java.lang.Exception -> L75
                        int r1 = r2.outWidth     // Catch: java.lang.Exception -> L75
                        com.tsf.shell.plugin.crop.CropImageActivity.m1501b(r1)     // Catch: java.lang.Exception -> L75
                        int r1 = r2.outHeight     // Catch: java.lang.Exception -> L75
                        com.tsf.shell.plugin.crop.CropImageActivity.m1498c(r1)     // Catch: java.lang.Exception -> L75
                        com.tsf.shell.plugin.crop.CropImageActivity r1 = com.tsf.shell.plugin.crop.CropImageActivity.this     // Catch: java.lang.Exception -> L75
                        android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L75
                        android.net.Uri r3 = r2     // Catch: java.lang.Exception -> L75
                        java.io.InputStream r1 = r1.openInputStream(r3)     // Catch: java.lang.Exception -> L75
                        r3 = 0
                        r2.inJustDecodeBounds = r3     // Catch: java.lang.Exception -> L75
                        r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
                        int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                        if (r3 <= 0) goto L4a
                        r3 = 2
                        r2.inSampleSize = r3     // Catch: java.lang.Exception -> L75
                    L4a:
                        android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Exception -> L75
                        r2.inPreferredConfig = r3     // Catch: java.lang.Exception -> L75
                        r3 = 1
                        r2.inPurgeable = r3     // Catch: java.lang.Exception -> L75
                        r3 = 1
                        r2.inInputShareable = r3     // Catch: java.lang.Exception -> L75
                        r3 = 0
                        android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r1, r3, r2)     // Catch: java.lang.Exception -> L75
                        r1.close()     // Catch: java.lang.Exception -> L7b
                    L5c:
                        if (r2 == 0) goto L66
                        com.tsf.shell.plugin.crop.CropImageActivity r0 = com.tsf.shell.plugin.crop.CropImageActivity.this
                        android.net.Uri r1 = r2
                        android.graphics.Bitmap r0 = com.tsf.shell.plugin.crop.CropImageActivity.m1503a(r0, r2, r1)
                    L66:
                        com.tsf.shell.plugin.crop.CropImageActivity r1 = com.tsf.shell.plugin.crop.CropImageActivity.this
                        android.os.Handler r1 = com.tsf.shell.plugin.crop.CropImageActivity.m1497c(r1)
                        com.tsf.shell.plugin.crop.CropImageActivity$2$1 r2 = new com.tsf.shell.plugin.crop.CropImageActivity$2$1
                        r2.<init>()
                        r1.post(r2)
                        return
                    L75:
                        r1 = move-exception
                        r2 = r0
                    L77:
                        r1.printStackTrace()
                        goto L5c
                    L7b:
                        r1 = move-exception
                        goto L77
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.crop.CropImageActivity.C37832.run():void");
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public Bitmap m1507a(Bitmap bitmap, Uri uri) {
        int m1500b = m1500b(uri);
        return m1500b == 0 ? bitmap : m1508a(bitmap, m1500b);
    }

    /* renamed from: a */
    private Bitmap m1508a(Bitmap bitmap, int i) {
        if (i != 0 && bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            try {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != createBitmap) {
                    bitmap.recycle();
                    return createBitmap;
                }
                return bitmap;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return bitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: b */
    private int m1500b(Uri uri) {
        Exception e;
        int i;
        try {
            Cursor query = getContentResolver().query(uri, new String[]{"orientation"}, null, null, null);
            if (query != null) {
                int columnIndexOrThrow = query.getColumnIndexOrThrow("orientation");
                query.moveToFirst();
                i = query.getInt(columnIndexOrThrow);
                try {
                    query.close();
                    return i;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return i;
                }
            }
            return 0;
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        C3790c.m1466a("click");
        if (id == C3793e.C3794a.ic_menu_crop) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point();
            point.x = iArr[0];
            point.y = iArr[1];
            m1505a(view, point);
        } else if (id == C3793e.C3794a.menu1) {
            this.f12405s.setCropMode(0);
            this.f12406t.dismiss();
        } else if (id == C3793e.C3794a.menu2) {
            this.f12405s.setCropMode(1);
            this.f12406t.dismiss();
        } else if (id == C3793e.C3794a.menu3) {
            this.f12405s.setCropMode(2);
            this.f12406t.dismiss();
        } else if (id == C3793e.C3794a.menu4) {
            this.f12405s.setCropMode(3);
            this.f12406t.dismiss();
        } else if (id == C3793e.C3794a.crop_image_done) {
            C3790c.m1466a("hello");
            m1493j();
        } else if (id == C3793e.C3794a.crop_image_cancel) {
            m1494i();
        } else if (id == C3793e.C3794a.ic_menu_metrics) {
            m1492k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public void m1494i() {
        C3790c.m1466a("Cancel and Finish");
        setResult(0);
        finish();
    }

    /* renamed from: j */
    private void m1493j() {
        Bitmap cropBitmap = this.f12405s.getCropBitmap();
        if (cropBitmap == null) {
            finish();
        }
        Intent intent = new Intent();
        if (cropBitmap != null && cropBitmap.getWidth() < 300 && cropBitmap.getHeight() < 300) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", cropBitmap);
            intent.putExtras(bundle);
        }
        if (!this.f12409y) {
            intent.setData(m1509a(cropBitmap));
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.net.Uri m1509a(android.graphics.Bitmap r5) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.crop.CropImageActivity.m1509a(android.graphics.Bitmap):android.net.Uri");
    }

    /* renamed from: a */
    private void m1502a(File file) {
        String[] list = file.list();
        int length = list.length;
        for (int i = 0; i < length; i++) {
            File file2 = new File(file.getPath() + "/" + list[i]);
            if (file2.exists()) {
                file2.delete();
                C3790c.m1466a("Clean Cache:" + file2.getPath());
            }
        }
    }

    /* renamed from: a */
    private void m1505a(View view, Point point) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(C3793e.C3795b.popup_menu_layout, (ViewGroup) null);
        inflate.findViewById(C3793e.C3794a.menu1).setOnClickListener(this);
        inflate.findViewById(C3793e.C3794a.menu2).setOnClickListener(this);
        inflate.findViewById(C3793e.C3794a.menu3).setOnClickListener(this);
        inflate.findViewById(C3793e.C3794a.menu4).setOnClickListener(this);
        switch (this.f12405s.getCropMode()) {
            case 0:
                ((RadioButton) inflate.findViewById(C3793e.C3794a.radioButton1)).setChecked(true);
                break;
            case 1:
                ((RadioButton) inflate.findViewById(C3793e.C3794a.radioButton2)).setChecked(true);
                break;
            case 2:
                ((RadioButton) inflate.findViewById(C3793e.C3794a.radioButton3)).setChecked(true);
                break;
            case 3:
                ((RadioButton) inflate.findViewById(C3793e.C3794a.radioButton4)).setChecked(true);
                break;
        }
        this.f12406t = new PopupWindow(inflate, -2, -2, true);
        this.f12406t.setContentView(inflate);
        this.f12406t.setFocusable(true);
        float f = getResources().getDisplayMetrics().density;
        int round = Math.round(0.0f * f);
        int round2 = Math.round(f * (-216.0f));
        this.f12406t.setBackgroundDrawable(new BitmapDrawable());
        this.f12406t.showAtLocation(inflate, 0, round + point.x, round2 + point.y);
    }

    /* renamed from: k */
    private void m1492k() {
        new C3785a().m13634a(m13715f().mo13569a(), "dialog");
    }

    /* renamed from: com.tsf.shell.plugin.crop.CropImageActivity$a */
    /* loaded from: classes.dex */
    public static class C3785a extends DialogInterface$OnCancelListenerC0090k {

        /* renamed from: ai */
        private View f12416ai;

        public C3785a() {
            m13637a(1, 0);
        }

        @Override // android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k, android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f12416ai = layoutInflater.inflate(C3793e.C3795b.crop_size_dialog_layout, viewGroup);
            ((TextView) this.f12416ai.findViewById(C3793e.C3794a.textView1)).setText("ImageSize: " + CropImageActivity.f12402u + "x" + CropImageActivity.f12403v);
            return this.f12416ai;
        }
    }
}
