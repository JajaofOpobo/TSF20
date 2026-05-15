package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class LiveWallPaperService extends WallpaperService {
    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        return new a();
    }

    private class a extends WallpaperService.Engine {
        private Bitmap b;

        private a() {
            super(LiveWallPaperService.this);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.tsf.extend.wallpaper.LiveWallPaperService$a$1] */
        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onCreate(SurfaceHolder surfaceHolder) {
            super.onCreate(surfaceHolder);
            try {
                setOffsetNotificationsEnabled(false);
            } catch (Exception e) {
            }
            new Thread() { // from class: com.tsf.extend.wallpaper.LiveWallPaperService.a.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    a.this.b();
                }
            }.start();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            a();
        }

        private void a() {
            if (this.b != null) {
                SurfaceHolder surfaceHolder = getSurfaceHolder();
                Canvas canvasLockCanvas = surfaceHolder.lockCanvas(null);
                if (canvasLockCanvas != null) {
                    canvasLockCanvas.drawBitmap(this.b, 0.0f, 0.0f, (Paint) null);
                }
                surfaceHolder.unlockCanvasAndPost(canvasLockCanvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            LiveWallPaperService liveWallPaperService = LiveWallPaperService.this;
            try {
                PictureDrawable pictureDrawableA = com.tsf.extend.a.e.a(liveWallPaperService.getAssets(), ab.b()).a();
                int i = liveWallPaperService.getResources().getDisplayMetrics().heightPixels;
                float intrinsicHeight = i / pictureDrawableA.getIntrinsicHeight();
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(liveWallPaperService.getResources().getDisplayMetrics().widthPixels, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.scale(1.0f, intrinsicHeight);
                pictureDrawableA.setBounds(0, 0, pictureDrawableA.getIntrinsicWidth(), pictureDrawableA.getIntrinsicHeight());
                pictureDrawableA.draw(canvas);
                this.b = bitmapCreateBitmap;
                a();
            } catch (Exception e) {
            }
        }
    }
}
