package com.censivn.C3DEngine.f;

import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class d {
    final /* synthetic */ a a;
    private ArrayList b = new ArrayList();
    private Bitmap c;
    private TextureElement d;

    public d(a aVar) {
        this.a = aVar;
    }

    public final void a(b bVar) {
        b b = b(bVar.c);
        if (b == null) {
            int identifier = this.a.a.getIdentifier(bVar.c, null, null);
            if (identifier == 0) {
                Log.d("Censivn3D", "Texture not found: " + bVar.c);
                return;
            }
            Log.d("Censivn3D", "Adding texture " + bVar.c);
            Bitmap a = com.censivn.C3DEngine.h.a.a(com.censivn.C3DEngine.a.c(), identifier);
            bVar.h = true;
            bVar.a = a;
        } else {
            bVar.a = b.a;
        }
        this.b.add(bVar);
    }

    private b b(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.b.get(i)).c.equals(str)) {
                return (b) this.b.get(i);
            }
        }
        return null;
    }

    public final void a() {
        Collections.sort(this.b, new e(this, (byte) 0));
        if (this.b.size() != 0) {
            b bVar = (b) this.b.get(0);
            int i = 0;
            int size = this.b.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                int width = ((b) this.b.get(i3)).h ? ((b) this.b.get(i3)).a.getWidth() + i : i;
                i3++;
                i = width;
            }
            this.c = Bitmap.createBitmap(i, bVar.a.getHeight(), Bitmap.Config.ARGB_8888);
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 < size) {
                    b bVar2 = (b) this.b.get(i5);
                    b b = b(bVar2.c);
                    if (bVar2.h) {
                        Bitmap bitmap = bVar2.a;
                        int width2 = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int[] iArr = new int[width2 * height];
                        bitmap.getPixels(iArr, 0, width2, 0, 0, width2, height);
                        this.c.setPixels(iArr, 0, width2, i2, 0, width2, height);
                        bVar2.d = i2 / i;
                        bVar2.e = 0.0f;
                        bVar2.f = width2 / i;
                        bVar2.g = height / bVar.a.getHeight();
                        i2 += width2;
                        bitmap.recycle();
                    } else {
                        bVar2.d = b.d;
                        bVar2.e = b.e;
                        bVar2.f = b.f;
                        bVar2.g = b.g;
                    }
                    i4 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public final Bitmap b() {
        return this.c;
    }

    public final boolean c() {
        return this.b.size() > 0;
    }

    public final b a(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.b.get(i)).b.equals(str)) {
                return (b) this.b.get(i);
            }
        }
        return null;
    }

    public final void d() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((b) this.b.get(i)).a.recycle();
        }
        if (this.c != null) {
            this.c.recycle();
        }
        this.b.clear();
        this.a.i.clear();
        this.a.j.clear();
        this.a.k.clear();
    }

    public final void a(TextureElement textureElement) {
        this.d = textureElement;
    }

    public final TextureElement e() {
        return this.d;
    }
}
