package com.censivn.C3DEngine.api.message;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class RenderRunnable implements Runnable {
    public static final int TYPE_EXTERNAL_THREAD = 2;
    public static final int TYPE_GL_THREAD = 1;
    public static final int TYPE_MAINUI_THREAD = 0;
    public boolean autoInvalidate = false;
    public int frame;
    public int type;

    public RenderRunnable(int i, int i2) {
        this.frame = 0;
        this.frame = i;
        this.type = i2;
    }

    @Override // java.lang.Runnable
    public void run() {
    }
}
