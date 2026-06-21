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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class CropImageActivity extends FragmentActivity implements View.OnClickListener {
    private CropImageView t;
    private PopupWindow u;
    private static int v = 0;
    private static int w = 0;
    public static String n = "crop_mode";
    public static int o = 0;
    public static int p = 4;
    public static int q = 1;
    public static int r = 2;
    private final int s = 100;
    private int x = o;
    private Handler y = new Handler();
    private boolean z = false;

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(j.cutting_activity_layout);
        this.t = (CropImageView) findViewById(i.cropimageview);
        Intent intent = getIntent();
        Uri data = intent.getData();
        try {
            this.t.setStroke(intent.getExtras().getBoolean("stroke"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            this.x = intent.getExtras().getInt(n);
            if (this.x != o) {
                if (this.x == p) {
                    this.t.setCropMode(3);
                    findViewById(i.ic_menu_crop).setVisibility(8);
                } else if (this.x == q) {
                    this.t.setCropMode(0);
                    findViewById(i.ic_menu_crop).setVisibility(8);
                } else if (this.x == r) {
                    this.t.setCropMode(1);
                    findViewById(i.ic_menu_crop).setVisibility(8);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            this.t.a(intent.getExtras().getInt("outputX"), intent.getExtras().getInt("outputY"));
        } catch (Exception e3) {
        }
        try {
            this.z = intent.getExtras().getBoolean("return-data");
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        e.a("GET DATE:" + data);
        findViewById(i.ic_menu_metrics).setOnClickListener(this);
        findViewById(i.ic_menu_crop).setOnClickListener(this);
        findViewById(i.crop_image_cancel).setOnClickListener(this);
        findViewById(i.crop_image_done).setOnClickListener(this);
        a(data);
    }

    @Override // android.support.v4.app.FragmentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        e.a("resultCode:" + i2);
        if (intent == null || i2 == 0) {
            i();
            return;
        }
        if (i == 100) {
            e.a("URI:" + intent.getData().toString());
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
                /* JADX WARN: Removed duplicated region for block: B:10:0x005e  */
                @Override // java.lang.Thread, java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void run() {
                    Bitmap bitmap;
                    try {
                        InputStream openInputStream = CropImageActivity.this.getContentResolver().openInputStream(uri);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(openInputStream, null, options);
                        openInputStream.close();
                        double min = Math.min(options.outHeight, options.outWidth);
                        CropImageActivity.v = options.outWidth;
                        CropImageActivity.w = options.outHeight;
                        InputStream openInputStream2 = CropImageActivity.this.getContentResolver().openInputStream(uri);
                        options.inJustDecodeBounds = false;
                        if (min > 1000.0d) {
                            options.inSampleSize = 2;
                        }
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inPurgeable = true;
                        options.inInputShareable = true;
                        bitmap = BitmapFactory.decodeStream(openInputStream2, null, options);
                        try {
                            openInputStream2.close();
                        } catch (Exception e) {
                            e = e;
                            e.printStackTrace();
                            if (bitmap != null) {
                            }
                            Handler handler = CropImageActivity.this.y;
                            final ProgressDialog progressDialog2 = progressDialog;
                            handler.post(new Runnable() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.2.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (r2 != null) {
                                        CropImageActivity.this.t.setImageBitmap(r2);
                                        e.a("setImageBitmap :" + r2);
                                        CropImageActivity.this.t.invalidate();
                                    }
                                    if (progressDialog2 != null && progressDialog2.isShowing()) {
                                        e.a("dismiss dialog");
                                        progressDialog2.dismiss();
                                    }
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bitmap = null;
                    }
                    final Bitmap a = bitmap != null ? CropImageActivity.this.a(bitmap, uri) : null;
                    Handler handler2 = CropImageActivity.this.y;
                    final ProgressDialog progressDialog22 = progressDialog;
                    handler2.post(new Runnable() { // from class: com.tsf.shell.plugin.crop.CropImageActivity.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (a != null) {
                                CropImageActivity.this.t.setImageBitmap(a);
                                e.a("setImageBitmap :" + a);
                                CropImageActivity.this.t.invalidate();
                            }
                            if (progressDialog22 != null && progressDialog22.isShowing()) {
                                e.a("dismiss dialog");
                                progressDialog22.dismiss();
                            }
                        }
                    });
                }
            }.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap a(Bitmap bitmap, Uri uri) {
        int b = b(uri);
        return b == 0 ? bitmap : a(bitmap, b);
    }

    private Bitmap a(Bitmap bitmap, int i) {
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

    private int b(Uri uri) {
        Exception e;
        int i;
        try {
            Cursor query = getContentResolver().query(uri, new String[]{"orientation"}, null, null, null);
            if (query == null) {
                return 0;
            }
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
        } catch (Exception e3) {
            e = e3;
            i = 0;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        e.a("click");
        if (id == i.ic_menu_crop) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Point point = new Point();
            point.x = iArr[0];
            point.y = iArr[1];
            a(view, point);
            return;
        }
        if (id == i.menu1) {
            this.t.setCropMode(0);
            this.u.dismiss();
            return;
        }
        if (id == i.menu2) {
            this.t.setCropMode(1);
            this.u.dismiss();
            return;
        }
        if (id == i.menu3) {
            this.t.setCropMode(2);
            this.u.dismiss();
            return;
        }
        if (id == i.menu4) {
            this.t.setCropMode(3);
            this.u.dismiss();
        } else if (id == i.crop_image_done) {
            e.a("hello");
            j();
        } else if (id == i.crop_image_cancel) {
            i();
        } else if (id == i.ic_menu_metrics) {
            k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        e.a("Cancel and Finish");
        setResult(0);
        finish();
    }

    private void j() {
        Bitmap cropBitmap = this.t.getCropBitmap();
        if (cropBitmap == null) {
            finish();
        }
        Intent intent = new Intent();
        if (cropBitmap != null && cropBitmap.getWidth() < 300 && cropBitmap.getHeight() < 300) {
            Bundle bundle = new Bundle();
            bundle.putParcelable("data", cropBitmap);
            intent.putExtras(bundle);
        }
        if (!this.z) {
            intent.setData(a(cropBitmap));
        }
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Uri a(Bitmap bitmap) {
        FileOutputStream fileOutputStream;
        File file = new File(getCacheDir() + "/CropImage/");
        if (!file.exists()) {
            if (file.mkdir()) {
                e.a(String.valueOf(file.getAbsolutePath()) + " directory created");
            } else {
                e.a(String.valueOf(file.getAbsolutePath()) + " directory created fail");
            }
        }
        a(file);
        e.a("SaveFile" + file.getPath());
        String str = "IMG_temp.png";
        e.a("output name :" + str);
        String str2 = String.valueOf(file.getPath()) + "/" + str;
        try {
            fileOutputStream = new FileOutputStream(str2, false);
            try {
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    return Uri.parse(str2);
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e5) {
            e = e5;
            fileOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            if (fileOutputStream != null) {
            }
            throw th;
        }
        return Uri.parse(str2);
    }

    private void a(File file) {
        for (String str : file.list()) {
            File file2 = new File(String.valueOf(file.getPath()) + "/" + str);
            if (file2.exists()) {
                file2.delete();
                e.a("Clean Cache:" + file2.getPath());
            }
        }
    }

    private void a(View view, Point point) {
        View inflate = ((LayoutInflater) getSystemService("layout_inflater")).inflate(j.popup_menu_layout, (ViewGroup) null);
        inflate.findViewById(i.menu1).setOnClickListener(this);
        inflate.findViewById(i.menu2).setOnClickListener(this);
        inflate.findViewById(i.menu3).setOnClickListener(this);
        inflate.findViewById(i.menu4).setOnClickListener(this);
        switch (this.t.getCropMode()) {
            case 0:
                ((RadioButton) inflate.findViewById(i.radioButton1)).setChecked(true);
                break;
            case 1:
                ((RadioButton) inflate.findViewById(i.radioButton2)).setChecked(true);
                break;
            case 2:
                ((RadioButton) inflate.findViewById(i.radioButton3)).setChecked(true);
                break;
            case 3:
                ((RadioButton) inflate.findViewById(i.radioButton4)).setChecked(true);
                break;
        }
        this.u = new PopupWindow(inflate, -2, -2, true);
        this.u.setContentView(inflate);
        this.u.setFocusable(true);
        float f = getResources().getDisplayMetrics().density;
        int round = Math.round(0.0f * f);
        int round2 = Math.round(f * (-216.0f));
        this.u.setBackgroundDrawable(new BitmapDrawable());
        this.u.showAtLocation(inflate, 0, round + point.x, round2 + point.y);
    }

    private void k() {
        new a().a(f().a(), "dialog");
    }
}
