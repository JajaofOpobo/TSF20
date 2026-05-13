package com.tsf.extend.wallpaper;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.PictureDrawable;
import android.service.wallpaper.WallpaperService;
import android.view.SurfaceHolder;
import com.tsf.extend.p068a.C1324e;
/* loaded from: classes.dex */
public class LiveWallPaperService extends WallpaperService {
    @Override // android.service.wallpaper.WallpaperService
    public WallpaperService.Engine onCreateEngine() {
        return new C1933a();
    }

    /* renamed from: com.tsf.extend.wallpaper.LiveWallPaperService$a */
    /* loaded from: classes.dex */
    private class C1933a extends WallpaperService.Engine {

        /* renamed from: b */
        private Bitmap f6207b;

        private C1933a() {
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
                    C1933a.this.m7016b();
                }
            }.start();
        }

        @Override // android.service.wallpaper.WallpaperService.Engine
        public void onSurfaceCreated(SurfaceHolder surfaceHolder) {
            super.onSurfaceCreated(surfaceHolder);
            m7018a();
        }

        /* renamed from: a */
        private void m7018a() {
            if (this.f6207b != null) {
                SurfaceHolder surfaceHolder = getSurfaceHolder();
                Canvas lockCanvas = surfaceHolder.lockCanvas(null);
                if (lockCanvas != null) {
                    lockCanvas.drawBitmap(this.f6207b, 0.0f, 0.0f, (Paint) null);
                }
                surfaceHolder.unlockCanvasAndPost(lockCanvas);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m7016b() {
            LiveWallPaperService liveWallPaperService = LiveWallPaperService.this;
            try {
                PictureDrawable m9015a = C1324e.m9012a(liveWallPaperService.getAssets(), C2035ab.m6659b()).m9015a();
                int i = liveWallPaperService.getResources().getDisplayMetrics().heightPixels;
                int i2 = liveWallPaperService.getResources().getDisplayMetrics().widthPixels;
                float intrinsicHeight = i / m9015a.getIntrinsicHeight();
                Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(1.0f, intrinsicHeight);
                m9015a.setBounds(0, 0, m9015a.getIntrinsicWidth(), m9015a.getIntrinsicHeight());
                m9015a.draw(canvas);
                this.f6207b = createBitmap;
                m7018a();
            } catch (Exception e) {
            }
        }
    }
}
