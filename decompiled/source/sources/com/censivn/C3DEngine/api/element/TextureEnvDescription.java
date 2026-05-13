package com.censivn.C3DEngine.api.element;
/* loaded from: classes.dex */
public class TextureEnvDescription {
    public int param;
    public int pname;

    public TextureEnvDescription() {
        this.pname = 8704;
        this.param = 8448;
    }

    public TextureEnvDescription(int i, int i2) {
        this.pname = 8704;
        this.param = 8448;
        this.pname = i;
        this.param = i2;
    }

    public void setAll(int i, int i2) {
        this.pname = i;
        this.param = i2;
    }
}
