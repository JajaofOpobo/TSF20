package com.cm.a;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class i {
    private static i a = new i();
    private h b = null;
    private boolean c = false;

    public static i a() {
        return a;
    }

    public void a(String str) {
        boolean z = false;
        if (!this.c || (this.b != null && !this.b.d())) {
            this.c = false;
            this.b = new h(str);
            if (this.b.c()) {
                z = true;
            } else {
                System.loadLibrary(str);
            }
            this.c = true;
            this.b.e();
            if (!z) {
                this.b = null;
            }
        }
    }
}
