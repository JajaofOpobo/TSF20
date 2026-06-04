package com.tsf.shell.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
public class PhotoSelectorActivity extends Activity {
    private int a;
    private int b;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = getIntent().getIntExtra("image_width", 0);
        this.b = getIntent().getIntExtra("image_height", 0);
        Intent intent = new Intent("android.intent.action.PICK", (Uri) null);
        intent.setDataAndType(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
        startActivityForResult(intent, 100);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Bitmap createScaledBitmap;
        if (i2 == -1) {
            if (i == 100) {
                Uri data = intent.getData();
                Intent intent2 = new Intent("com.android.camera.action.CROP");
                intent2.setDataAndType(data, "image/*");
                intent2.putExtra("crop", "true");
                intent2.putExtra("aspectX", 1);
                intent2.putExtra("aspectY", 1);
                intent2.putExtra("outputX", this.a);
                intent2.putExtra("outputY", this.b);
                intent2.putExtra("return-data", true);
                startActivityForResult(intent2, VEasing.Circ.easeOut);
                return;
            }
            if (i == 101) {
                Bitmap bitmap = (Bitmap) intent.getParcelableExtra("data");
                if (bitmap.getWidth() != this.a || bitmap.getHeight() != this.b) {
                    createScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.a, this.b, true);
                } else {
                    createScaledBitmap = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                }
                bitmap.recycle();
                Intent intent3 = new Intent();
                intent3.putExtra("data", createScaledBitmap);
                setResult(-1, intent3);
                finish();
                return;
            }
        }
        setResult(0);
        finish();
    }
}
