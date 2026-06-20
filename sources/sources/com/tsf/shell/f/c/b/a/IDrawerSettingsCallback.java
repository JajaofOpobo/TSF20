package com.tsf.shell.f.c.b.a;

import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.b.f.IRenderable;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public interface IDrawerSettingsCallback {

    /* JADX INFO: renamed from: com.tsf.shell.f.c.b.a.IDrawerSettingsCallback$a, reason: collision with other inner class name */
    public static class C0084a {
        public float a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public float i;
        public float j;
        public float k;
        public float l;
    }

    public static class b {
        public static b c = new DrawerSettingsResult();
        public int a = -1;
        public int b = -1;
    }

    int a();

    b a(Number3d number3d, ArrayList<com.tsf.shell.f.c.b.DrawerSettingsData> arrayList, int i);

    void a(float f, float f2, float f3, float f4);

    void a(Number3d number3d);

    void a(i iVar);

    void a(ArrayList<com.tsf.shell.f.c.b.DrawerSettingsData> arrayList, int i);

    C0084a b();
}
