package com.tsf.shell;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.widget.ImageView;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class ch extends AsyncTask {
    BitmapFactory.Options a = new BitmapFactory.Options();
    final /* synthetic */ ShellWallpaperSelector b;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap;
        ImageView imageView;
        Bitmap bitmap2;
        Bitmap bitmap3 = (Bitmap) obj;
        if (bitmap3 != null) {
            if (isCancelled() || this.a.mCancel) {
                bitmap3.recycle();
                return;
            }
            bitmap = this.b.d;
            if (bitmap != null) {
                bitmap2 = this.b.d;
                bitmap2.recycle();
            }
            imageView = this.b.b;
            imageView.setImageBitmap(bitmap3);
            this.b.d = bitmap3;
            Drawable drawable = imageView.getDrawable();
            drawable.setFilterBitmap(true);
            drawable.setDither(true);
            imageView.postInvalidate();
            this.b.f = null;
        }
    }

    ch(ShellWallpaperSelector shellWallpaperSelector) {
        this.b = shellWallpaperSelector;
        this.a.inDither = false;
        this.a.inPreferredConfig = Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap doInBackground(Integer... numArr) {
        ArrayList arrayList;
        ImageView imageView;
        if (isCancelled()) {
            return null;
        }
        try {
            arrayList = this.b.e;
            cg cgVar = (cg) arrayList.get(numArr[0].intValue());
            this.a.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(cgVar.a.getResources(), cgVar.c, this.a);
            imageView = this.b.b;
            float width = imageView.getWidth();
            this.a.inSampleSize = ShellWallpaperSelector.a(this.a, (int) (width * (width / this.a.outWidth) * this.a.outHeight));
            this.a.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(cgVar.a.getResources(), cgVar.c, this.a);
        } catch (OutOfMemoryError e) {
            return null;
        }
    }

    final void a() {
        this.a.requestCancelDecode();
        super.cancel(true);
    }
}
