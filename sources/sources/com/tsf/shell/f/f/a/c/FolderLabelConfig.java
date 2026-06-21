package com.tsf.shell.f.f.a.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.manager.o.a.LabelManager;
import com.tsf.shell.utils.GraphicsEngineBridge;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FolderLabelConfig {
    private static com.tsf.shell.manager.o.ButtonMetrics a;

    public static com.censivn.C3DEngine.b.f.sprite.TextureSpriteRenderable a() {
        if (a == null) {
            a = new com.tsf.shell.manager.o.ButtonMetrics(1.0f, 1.0f, 120, 120, 250, 42, 20);
            FolderContentList.a aVar = new FolderContentList.a();
            aVar.g = 32;
            FolderTouchBase.ab = new com.tsf.shell.manager.o.a.TextLabelElement(0, aVar);
        }
        return new com.tsf.shell.f.i.b.e.DrawerItemButton(FolderTouchBase).k;
    }

    public static void a(TextureElement textureElement, int i, String str) {
        if (textureElement.id == 0) {
            Bitmap bitmapA = i == 0 ? null : x.a(i, FolderTouchBase.H, FolderTouchBase.I);
            Bitmap bitmapA2 = FolderTouchBase.a(str);
            Bitmap bitmapA3 = FolderTouchBase.a();
            Canvas canvas = new Canvas(bitmapA3);
            canvas.drawColor(-1, PorterDuff.Mode.CLEAR);
            FolderTouchBase.a(canvas, bitmapA, bitmapA2, true);
            com.tsf.shell.f.i.b.e.DrawerShortcutItemBase.a(bitmapA3);
            com.censivn.C3DEngine.C3DEngine.g().a(textureElement, bitmapA3);
        }
    }
}
