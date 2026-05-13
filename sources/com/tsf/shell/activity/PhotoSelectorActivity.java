package com.tsf.shell.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import com.censivn.C3DEngine.C0853a;
import com.tsf.shell.plugin.crop.CropImageActivity;
/* loaded from: classes.dex */
public class PhotoSelectorActivity extends Activity {

    /* renamed from: a */
    private int f7253a;

    /* renamed from: b */
    private int f7254b;

    /* renamed from: c */
    private boolean f7255c = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7253a = getIntent().getIntExtra("image_width", 0);
        this.f7254b = getIntent().getIntExtra("image_height", 0);
        if (this.f7253a * this.f7254b > 65536) {
            this.f7255c = true;
        }
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 100);
    }

    /* renamed from: a */
    public void m6080a(Uri uri) {
        Intent intent = new Intent();
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", this.f7253a);
        intent.putExtra("outputY", this.f7254b);
        if (!this.f7255c) {
            intent.putExtra("return-data", true);
        }
        intent.setClass(C0853a.m10856d(), CropImageActivity.class);
        startActivityForResult(intent, 101);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap createScaledBitmap;
        if (i2 == -1) {
            if (i == 100) {
                m6080a(intent.getData());
                return;
            } else if (i == 101) {
                if (this.f7255c) {
                    intent.putExtra("image_width", this.f7253a);
                    intent.putExtra("image_height", this.f7254b);
                    intent.putExtra("data_mode", 1);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("data");
                if (bitmap.getWidth() != this.f7253a || bitmap.getHeight() != this.f7254b) {
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.f7253a, this.f7254b, true);
                } else {
                    createScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                }
                bitmap.recycle();
                Intent intent2 = new Intent();
                intent2.putExtra("data_mode", 0);
                intent2.putExtra("data", createScaledBitmap);
                setResult(-1, intent2);
                finish();
                return;
            }
        }
        setResult(0);
        finish();
    }
}
