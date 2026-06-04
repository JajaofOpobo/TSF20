package com.censivn.C3DEngine.b;

import com.censivn.C3DEngine.api.core.VTextureList;
import com.censivn.C3DEngine.api.element.TextureDescription;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ac {
    private ArrayList a = new ArrayList();
    private VTextureList b;

    public final VTextureList a() {
        if (this.b == null) {
            this.b = new VTextureList(this);
        }
        return this.b;
    }

    public final void a(int i, TextureDescription textureDescription) {
        this.a.add(i, textureDescription);
    }

    public final TextureDescription a(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.a.add(textureDescription);
        return textureDescription;
    }

    public final TextureDescription b(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.a.add(textureDescription);
        com.censivn.C3DEngine.a.d().g();
        return textureDescription;
    }

    public final TextureDescription c(TextureElement textureElement) {
        TextureDescription textureDescription = new TextureDescription(textureElement);
        this.a.add(textureDescription);
        com.censivn.C3DEngine.a.d().g();
        return textureDescription;
    }

    public final boolean a(TextureDescription textureDescription) {
        return this.a.remove(textureDescription);
    }

    public final boolean d(TextureElement textureElement) {
        TextureDescription e = e(textureElement);
        if (e == null) {
            throw new Error("No match in TextureList for id \"" + e.textureElement.id + "\"");
        }
        com.censivn.C3DEngine.a.d().g();
        return this.a.remove(e);
    }

    public final void b() {
        this.a.clear();
        com.censivn.C3DEngine.a.d().g();
    }

    public final TextureDescription a(int i) {
        return (TextureDescription) this.a.get(i);
    }

    public final TextureDescription e(TextureElement textureElement) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            TextureDescription textureDescription = (TextureDescription) it.next();
            if (textureDescription.textureElement == textureElement) {
                return textureDescription;
            }
        }
        return null;
    }

    public final int c() {
        return this.a.size();
    }

    public final void d() {
        this.a.clear();
        com.censivn.C3DEngine.a.d().g();
    }

    public final void e() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            com.censivn.C3DEngine.a.f().a(((TextureDescription) it.next()).textureElement);
        }
        this.a.clear();
        com.censivn.C3DEngine.a.d().g();
    }
}
