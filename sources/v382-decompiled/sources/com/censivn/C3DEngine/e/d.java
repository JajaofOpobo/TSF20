package com.censivn.C3DEngine.e;

import android.graphics.Bitmap;
import android.util.Log;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.tsf.shell.utils.x;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class d {
    final /* synthetic */ a a;
    private ArrayList b = new ArrayList();
    private Bitmap c;
    private TextureElement d;

    public d(a aVar) {
        this.a = aVar;
    }

    public void a(b bVar) {
        b a = a(bVar.c);
        if (a == null) {
            int identifier = this.a.a.getIdentifier(bVar.c, null, null);
            if (identifier == 0) {
                Log.d("Censivn3D", "Texture not found: " + bVar.c);
                return;
            }
            Log.d("Censivn3D", "Adding texture " + bVar.c);
            Bitmap a2 = x.a(identifier);
            bVar.h = true;
            bVar.a = a2;
        } else {
            bVar.a = a.a;
        }
        this.b.add(bVar);
    }

    public b a(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.b.get(i)).c.equals(str)) {
                return (b) this.b.get(i);
            }
        }
        return null;
    }

    public void a() {
        Collections.sort(this.b, new e(this, null));
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
                    b a = a(bVar2.c);
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
                        bVar2.d = a.d;
                        bVar2.e = a.e;
                        bVar2.f = a.f;
                        bVar2.g = a.g;
                    }
                    i4 = i5 + 1;
                } else {
                    return;
                }
            }
        }
    }

    public Bitmap b() {
        return this.c;
    }

    public boolean c() {
        return this.b.size() > 0;
    }

    public b b(String str) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (((b) this.b.get(i)).b.equals(str)) {
                return (b) this.b.get(i);
            }
        }
        return null;
    }

    public void d() {
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

    public void a(TextureElement textureElement) {
        this.d = textureElement;
    }

    public TextureElement e() {
        return this.d;
    }
}
