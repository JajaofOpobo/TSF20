package com.tsf.shell.p096f.p153i.p161c.p162a.p163a;

import android.graphics.Color;
import com.censivn.C3DEngine.api.element.TextureElement;
/* renamed from: com.tsf.shell.f.i.c.a.a.e */
/* loaded from: classes.dex */
public class C3249e {

    /* renamed from: a */
    private int f10674a = Color.argb(127, 5, 255, 255);

    /* renamed from: b */
    private int f10675b = Color.argb(127, 5, 255, 255);

    /* renamed from: c */
    private TextureElement f10676c;

    /* renamed from: d */
    private TextureElement f10677d;

    /* renamed from: e */
    private boolean f10678e;

    public C3249e() {
        m3003b();
    }

    /* renamed from: a */
    public int m3005a(int i) {
        switch (i) {
            case 1:
                return this.f10675b;
            default:
                return this.f10674a;
        }
    }

    /* renamed from: b */
    public TextureElement m3002b(int i) {
        switch (i) {
            case 1:
                return this.f10677d;
            default:
                return this.f10676c;
        }
    }

    /* renamed from: a */
    public void m3006a() {
        if (this.f10676c != null) {
            C3236a.m3047a().deleteTexture(this.f10676c);
            this.f10676c = null;
        }
        if (this.f10677d != null) {
            C3236a.m3047a().deleteTexture(this.f10677d);
            this.f10677d = null;
        }
        this.f10678e = false;
    }

    /* renamed from: b */
    public void m3003b() {
        this.f10674a = -1;
        this.f10675b = -1;
        m3006a();
    }

    /* renamed from: a */
    public void m3004a(TextureElement textureElement) {
        this.f10676c = textureElement;
        this.f10677d = textureElement;
        this.f10678e = true;
    }

    /* renamed from: c */
    public void m3001c() {
        this.f10676c = null;
        this.f10677d = null;
    }
}
