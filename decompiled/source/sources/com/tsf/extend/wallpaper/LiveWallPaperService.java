package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
/* loaded from: classes.dex */
public class LiveWallPaperService extends WallpaperService {
    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        return new a();
    }

    /* loaded from: classes.dex */
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
                Canvas lockCanvas = surfaceHolder.lockCanvas(null);
                if (lockCanvas != null) {
                    lockCanvas.drawBitmap(this.b, 0.0f, 0.0f, (Paint) null);
                }
                surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            LiveWallPaperService liveWallPaperService = LiveWallPaperService.this;
            try {
                PictureDrawable a = com.tsf.extend.a.e.a(liveWallPaperService.getAssets(), ab.b()).a();
                int i = liveWallPaperService.getResources().getDisplayMetrics().heightPixels;
                int i2 = liveWallPaperService.getResources().getDisplayMetrics().widthPixels;
                float intrinsicHeight = i / a.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(1.0f, intrinsicHeight);
                a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
                a.draw(canvas);
                this.b = createBitmap;
                a();
            } catch (Exception e) {
            }
        }
    }
}
