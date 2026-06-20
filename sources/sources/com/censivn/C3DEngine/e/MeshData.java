package com.censivn.C3DEngine.e;

import com.censivn.C3DEngine.api.element.Color4;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.Uv;
import com.censivn.C3DEngine.b.f.BaseRenderable;
import com.censivn.C3DEngine.e.AbstractModelParser;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class MeshData {
    protected ArrayList<FaceGroup> a;
    protected int b;
    protected ArrayList<Number3d> c;
    protected ArrayList<Uv> d;
    protected ArrayList<Number3d> e;
    public String f;

    public MeshData() {
        this.b = 0;
        this.c = new ArrayList<>();
        this.d = new ArrayList<>();
        this.e = new ArrayList<>();
        this.f = "";
        this.a = new ArrayList<>();
    }

    public MeshData(ArrayList<Number3d> arrayList, ArrayList<Uv> arrayList2, ArrayList<Number3d> arrayList3) {
        this.b = 0;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = "";
        this.a = new ArrayList<>();
    }

    public com.censivn.C3DEngine.b.f.i a(HashMap<String, AbstractModelParser.MaterialEntry> map, AbstractModelParser.TextureManager textureManager) {
        j jVar = new j(this.b * 3, this.b);
        jVar.name(this.f);
        a(jVar, map, textureManager);
        return jVar;
    }

    private void a(com.censivn.C3DEngine.b.f.i iVar, HashMap<String, AbstractModelParser.MaterialEntry> map, AbstractModelParser.TextureManager textureManager) {
        int size = this.a.size();
        boolean zC = textureManager.c();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            FaceGroup faceGroup = this.a.get(i);
            AbstractModelParser.TextureEntry c0039aB = textureManager.b(faceGroup.h);
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= faceGroup.e) {
                    break;
                }
                Number3d number3d = this.c.get(faceGroup.b[i4]);
                Uv uvM6clone = faceGroup.f ? this.d.get(faceGroup.c[i4]).m6clone() : new Uv();
                Number3d number3d2 = faceGroup.g ? this.e.get(faceGroup.d[i4]) : new Number3d();
                AbstractModelParser.MaterialEntry bVar = map.get(faceGroup.h);
                Color4 color4 = new Color4(255, 255, 0, 255);
                if (bVar != null && bVar.c != null) {
                    color4.r = bVar.c.r;
                    color4.g = bVar.c.g;
                    color4.b = bVar.c.b;
                    color4.a = bVar.c.a;
                }
                if (zC && c0039aB != null) {
                    uvM6clone.u = c0039aB.d + (uvM6clone.u * c0039aB.f);
                    uvM6clone.v = (c0039aB.e + ((uvM6clone.v + 1.0f) * c0039aB.g)) - 1.0f;
                }
                uvM6clone.v = 1.0f + uvM6clone.v;
                iVar.vertices().addVertex(number3d, uvM6clone, number3d2, color4);
                i3 = i4 + 1;
            }
            if (faceGroup.e == 3) {
                iVar.faces().add(new com.censivn.C3DEngine.f.Vertex3s(i2, i2 + 1, i2 + 2));
            } else if (faceGroup.e == 4) {
                iVar.faces().add(new com.censivn.C3DEngine.f.Vertex3s(i2, i2 + 1, i2 + 3));
                iVar.faces().add(new com.censivn.C3DEngine.f.Vertex3s(i2 + 1, i2 + 2, i2 + 3));
            }
            i++;
            i2 += faceGroup.e;
        }
        if (zC) {
            iVar.textures().addElement(textureManager.e());
        }
        a();
    }

    public void a(FaceGroup faceGroup) {
        Number3d number3d = this.c.get(faceGroup.b[0]);
        Number3d number3d2 = this.c.get(faceGroup.b[1]);
        Number3d number3d3 = this.c.get(faceGroup.b[2]);
        Number3d number3dSubtract = Number3d.subtract(number3d2, number3d);
        Number3d number3dSubtract2 = Number3d.subtract(number3d3, number3d);
        Number3d number3d4 = new Number3d();
        number3d4.x = (number3dSubtract.y * number3dSubtract2.z) - (number3dSubtract.z * number3dSubtract2.y);
        number3d4.y = -((number3dSubtract2.z * number3dSubtract.x) - (number3dSubtract2.x * number3dSubtract.z));
        number3d4.z = (number3dSubtract.x * number3dSubtract2.y) - (number3dSubtract2.x * number3dSubtract.y);
        double dSqrt = Math.sqrt((number3d4.x * number3d4.x) + (number3d4.y * number3d4.y) + (number3d4.z * number3d4.z));
        number3d4.x = (float) (((double) number3d4.x) / dSqrt);
        number3d4.y = (float) (((double) number3d4.y) / dSqrt);
        number3d4.z = (float) (((double) number3d4.z) / dSqrt);
        this.e.add(number3d4);
        int size = this.e.size() - 1;
        faceGroup.d = new int[3];
        faceGroup.d[0] = size;
        faceGroup.d[1] = size;
        faceGroup.d[2] = size;
        faceGroup.g = true;
    }

    protected void a() {
        this.a.clear();
    }
}
