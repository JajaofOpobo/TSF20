package com.tsf.shell.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import com.censivn.C3DEngine.a;
import com.tsf.shell.plugin.crop.CropImageActivity;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PhotoSelectorActivity extends Activity {
    private int a;
    private int b;
    private boolean c = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getIntent().getIntExtra("image_width", 0);
        this.b = getIntent().getIntExtra("image_height", 0);
        if (this.a * this.b > 65536) {
            this.c = true;
        }
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 100);
    }

    public void a(Uri uri) {
        Intent intent = new Intent();
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", this.a);
        intent.putExtra("outputY", this.b);
        if (!this.c) {
            intent.putExtra("return-data", true);
        }
        intent.setClass(a.d(), CropImageActivity.class);
        startActivityForResult(intent, 101);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap bitmapCreateScaledBitmap;
        if (i2 == -1) {
            if (i == 100) {
                a(intent.getData());
                return;
            }
            if (i == 101) {
                if (this.c) {
                    intent.putExtra("image_width", this.a);
                    intent.putExtra("image_height", this.b);
                    intent.putExtra("data_mode", 1);
                    setResult(-1, intent);
                    finish();
                    return;
                }
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("data");
                if (bitmap.getWidth() != this.a || bitmap.getHeight() != this.b) {
                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.a, this.b, true);
                } else {
                    bitmapCreateScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                }
                bitmap.recycle();
                Intent intent2 = new Intent();
                intent2.putExtra("data_mode", 0);
                intent2.putExtra("data", bitmapCreateScaledBitmap);
                setResult(-1, intent2);
                finish();
                return;
            }
        }
        setResult(0);
        finish();
    }
}
