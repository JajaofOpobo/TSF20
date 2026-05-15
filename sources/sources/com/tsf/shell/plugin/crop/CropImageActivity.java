package com.tsf.shell.plugin.crop;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.TextView;
import com.tsf.shell.plugin.crop.e;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class CropImageActivity extends FragmentActivity implements View.OnClickListener {
    private CropImageView s;
    private PopupWindow t;
    private static int u = 0;
    private static int v = 0;
    public static String m = "crop_mode";
    public static int n = 0;
    public static int o = 4;
    public static int p = 1;
    public static int q = 2;
    private final int r = 100;
    private int w = n;
    private Handler x = new Handler();
    private boolean y = false;

    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(e.b.cutting_activity_layout);
        this.s = (CropImageView) findViewById(e.a.cropimageview);
        Intent intent = getIntent();
        Uri data = intent.getData();
        try {
            this.s.setStroke(intent.getExtras().getBoolean("stroke"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.w = intent.getExtras().getInt(m);
            if (this.w != n) {
                if (this.w == o) {
                    this.s.setCropMode(3);
                    findViewById(e.a.ic_menu_crop).setVisibility(8);
                } else if (this.w == p) {
                    this.s.setCropMode(0);
                    findViewById(e.a.ic_menu_crop).setVisibility(8);
                } else if (this.w == q) {
                    this.s.setCropMode(1);
                    findViewById(e.a.ic_menu_crop).setVisibility(8);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.s.a(intent.getExtras().getInt("outputX"), intent.getExtras().getInt("outputY"));
        } catch (Exception e3) {
        }
        try {
            this.y = intent.getExtras().getBoolean("return-data");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        c.a("GET DATE:" + data);
        findViewById(e.a.ic_menu_metrics).setOnClickListener(this);
        findViewById(e.a.ic_menu_crop).setOnClickListener(this);
        findViewById(e.a.crop_image_cancel).setOnClickListener(this);
        findViewById(e.a.crop_image_done).setOnClickListener(this);
        a(data);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        c.a("resultCode:" + i2);
        if (intent == null || i2 == 0) {
            i();
            return;
        }
        if (i == 100) {
            c.a("URI:" + intent.getData().toString());
            a(intent.getData());
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.tsf.shell.plugin.crop.CropImageActivity$2] */
    public void a(final Uri uri) {
        if (uri != null) {
            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please wait while loading...");
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.show();
            progressDialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.1
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    CropImageActivity.this.i();
                }
            });
            new Thread() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.2
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    Bitmap bitmapDecodeStream;
                    try {
                        InputStream inputStreamOpenInputStream = CropImageActivity.this.getContentResolver().openInputStream(uri);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        inputStreamOpenInputStream.close();
                        double dMin = Math.min(options.outHeight, options.outWidth);
                        int unused = CropImageActivity.u = options.outWidth;
                        int unused2 = CropImageActivity.v = options.outHeight;
                        InputStream inputStreamOpenInputStream2 = CropImageActivity.this.getContentResolver().openInputStream(uri);
                        options.inJustDecodeBounds = false;
                        if (dMin > 1000.0d) {
                            options.inSampleSize = 2;
                        }
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options);
                        try {
                            inputStreamOpenInputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bitmapDecodeStream = null;
                    }
                    final Bitmap bitmapA = bitmapDecodeStream != null ? CropImageActivity.this.a(bitmapDecodeStream, uri) : null;
                    CropImageActivity.this.x.post(new Runnable() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapA != null) {
                                CropImageActivity.this.s.setImageBitmap(bitmapA);
                                c.a("setImageBitmap :" + bitmapA);
                                CropImageActivity.this.s.invalidate();
                            }
                            if (progressDialog != null && progressDialog.isShowing()) {
                                c.a("dismiss dialog");
                                progressDialog.dismiss();
                            }
                        }
                    });
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Bitmap bitmap, Uri uri) {
        int iB = b(uri);
        return iB == 0 ? bitmap : a(bitmap, iB);
    }

    private Bitmap a(Bitmap bitmap, int i) {
        if (i != 0 && bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.setRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                if (bitmap != bitmapCreateBitmap) {
                    bitmap.recycle();
                    return bitmapCreateBitmap;
                }
                return bitmap;
            } catch (OutOfMemoryError e) {
                e.printStackTrace();
                return bitmap;
            }
        }
        return bitmap;
    }

    private int b(Uri uri) {
        Exception e;
        int i;
        try {
            Cursor cursorQuery = getContentResolver().query(uri, new String[]{"orientation"}, null, null, null);
            if (cursorQuery == null) {
                return 0;
            }
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("orientation");
            cursorQuery.moveToFirst();
            i = cursorQuery.getInt(columnIndexOrThrow);
            try {
                cursorQuery.close();
                return i;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
        e.printStackTrace();
        return i;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        c.a("click");
        if (id == e.a.ic_menu_crop) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point();
            point.x = iArr[0];
            point.y = iArr[1];
            a(view, point);
            return;
        }
        if (id == e.a.menu1) {
            this.s.setCropMode(0);
            this.t.dismiss();
            return;
        }
        if (id == e.a.menu2) {
            this.s.setCropMode(1);
            this.t.dismiss();
            return;
        }
        if (id == e.a.menu3) {
            this.s.setCropMode(2);
            this.t.dismiss();
            return;
        }
        if (id == e.a.menu4) {
            this.s.setCropMode(3);
            this.t.dismiss();
        } else if (id == e.a.crop_image_done) {
            c.a("hello");
            j();
        } else if (id == e.a.crop_image_cancel) {
            i();
        } else if (id == e.a.ic_menu_metrics) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        c.a("Cancel and Finish");
        setResult(0);
        finish();
    }

    private void j() {
        Bitmap cropBitmap = this.s.getCropBitmap();
        if (cropBitmap == null) {
            finish();
        }
        Intent intent = new Intent();
        if (cropBitmap != null && cropBitmap.getWidth() < 300 && cropBitmap.getHeight() < 300) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", cropBitmap);
            intent.putExtras(bundle);
        }
        if (!this.y) {
            intent.setData(a(cropBitmap));
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.net.Uri a(android.graphics.Bitmap r5) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.shell.plugin.crop.CropImageActivity.a(android.graphics.Bitmap):android.net.Uri");
    }

    private void a(File file) {
        for (String str : file.list()) {
            File file2 = new File(file.getPath() + "/" + str);
            if (file2.exists()) {
                file2.delete();
                c.a("Clean Cache:" + file2.getPath());
            }
        }
    }

    private void a(View view, Point point) {
        View viewInflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(e.b.popup_menu_layout, (ViewGroup) null);
        viewInflate.findViewById(e.a.menu1).setOnClickListener(this);
        viewInflate.findViewById(e.a.menu2).setOnClickListener(this);
        viewInflate.findViewById(e.a.menu3).setOnClickListener(this);
        viewInflate.findViewById(e.a.menu4).setOnClickListener(this);
        switch (this.s.getCropMode()) {
            case 0:
                ((RadioButton) viewInflate.findViewById(e.a.radioButton1)).setChecked(true);
                break;
            case 1:
                ((RadioButton) viewInflate.findViewById(e.a.radioButton2)).setChecked(true);
                break;
            case 2:
                ((RadioButton) viewInflate.findViewById(e.a.radioButton3)).setChecked(true);
                break;
            case 3:
                ((RadioButton) viewInflate.findViewById(e.a.radioButton4)).setChecked(true);
                break;
        }
        this.t = new PopupWindow(viewInflate, -2, -2, true);
        this.t.setContentView(viewInflate);
        this.t.setFocusable(true);
        float f = getResources().getDisplayMetrics().density;
        int iRound = Math.round(0.0f * f);
        int iRound2 = Math.round(f * (-216.0f));
        this.t.setBackgroundDrawable(new BitmapDrawable());
        this.t.showAtLocation(viewInflate, 0, iRound + point.x, iRound2 + point.y);
    }

    private void k() {
        new a().a(f().a(), "dialog");
    }

    public static class a extends k {
        private View ai;

        public a() {
            a(1, 0);
        }

        @Override // android.support.v4.app.k, android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // android.support.v4.app.Fragment
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.ai = layoutInflater.inflate(e.b.crop_size_dialog_layout, viewGroup);
            ((TextView) this.ai.findViewById(e.a.textView1)).setText("ImageSize: " + CropImageActivity.u + "x" + CropImageActivity.v);
            return this.ai;
        }
    }
}
