package com.censivn.C3DEngine.b.e;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PercentLabelRenderer extends TextIconRenderer {
    private String b = "%";

    @Override // com.censivn.C3DEngine.b.e.TextIconRenderer
    public void f(int i) {
        d(i + this.b);
    }

    public void a(String str) {
        this.b = str;
    }
}
