package com.censivn.C3DEngine.f;

import android.content.res.Resources;
import com.censivn.C3DEngine.b.v;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class a implements f {
    protected Resources a;
    protected String b;
    protected String c;
    protected String d;
    protected ArrayList e;
    protected m f;
    protected boolean g;
    protected d h;
    protected ArrayList i;
    protected ArrayList j;
    protected ArrayList k;
    protected boolean l;
    protected HashMap m;

    public a() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = new ArrayList();
        this.h = new d(this);
        this.g = true;
        this.m = new HashMap();
    }

    public a(Resources resources, String str, Boolean bool) {
        this();
        this.a = resources;
        this.b = str;
        if (str.indexOf(":") >= 0) {
            this.c = str.split(":")[0];
        }
        this.l = bool.booleanValue();
    }

    protected void a() {
        this.e.clear();
        this.h.d();
        this.i.clear();
        this.j.clear();
        this.k.clear();
    }

    @Override // com.censivn.C3DEngine.f.f
    public v b() {
        return null;
    }

    protected static String a(InputStream inputStream) {
        String str = new String();
        while (true) {
            byte read = (byte) inputStream.read();
            if (read != 0) {
                str = String.valueOf(str) + ((char) read);
            } else {
                return str;
            }
        }
    }

    protected static int b(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
    }

    protected static int c(InputStream inputStream) {
        return inputStream.read() | (inputStream.read() << 8);
    }

    protected static float d(InputStream inputStream) {
        return Float.intBitsToFloat(b(inputStream));
    }

    @Override // com.censivn.C3DEngine.f.f
    public void c() {
    }
}
