package com.tsf.shell.ui.effect;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.view.View;
import android.app.WallpaperManager;

public class WallpaperBlurEffect {

    private Bitmap blurredWallpaper;
    private RenderScript rs;

    @SuppressLint("NewApi")
    public Bitmap getBlurredWallpaper(Context context, float radius) {
        if (blurredWallpaper != null && !blurredWallpaper.isRecycled()) return blurredWallpaper;

        try {
            WallpaperManager wm = WallpaperManager.getInstance(context);
            Drawable wallpaperDrawable = wm.getDrawable();
            if (wallpaperDrawable == null) return null;

            Bitmap source;
            if (wallpaperDrawable instanceof BitmapDrawable) {
                source = ((BitmapDrawable) wallpaperDrawable).getBitmap();
            } else {
                int w = wm.getDesiredMinimumWidth();
                int h = wm.getDesiredMinimumHeight();
                if (w <= 0 || h <= 0) { w = 1080; h = 1920; }
                source = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(source);
                wallpaperDrawable.setBounds(0, 0, w, h);
                wallpaperDrawable.draw(canvas);
            }

            if (source == null) return null;

            float scale = 0.25f;
            Bitmap scaled = Bitmap.createScaledBitmap(source,
                    (int) (source.getWidth() * scale),
                    (int) (source.getHeight() * scale), true);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
                rs = RenderScript.create(context);
                Allocation input = Allocation.createFromBitmap(rs, scaled);
                Allocation output = Allocation.createTyped(rs, input.getType());
                ScriptIntrinsicBlur blur = ScriptIntrinsicBlur.create(rs, Element.U8_4(rs));
                blur.setRadius(radius);
                blur.setInput(input);
                blur.forEach(output);
                output.copyTo(scaled);
                blurredWallpaper = scaled;
            } else {
                blurredWallpaper = scaled;
            }
            return blurredWallpaper;
        } catch (Exception ignored) {}
        return null;
    }

    public void release() {
        if (rs != null) {
            rs.destroy();
            rs = null;
        }
        if (blurredWallpaper != null && !blurredWallpaper.isRecycled()) {
            blurredWallpaper.recycle();
            blurredWallpaper = null;
        }
    }
}
