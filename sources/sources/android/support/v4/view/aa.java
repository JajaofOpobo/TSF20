package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class aa {
    private final ViewGroup a;
    private int b;

    public aa(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public void a(View view, View view2, int i) {
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public void a(View view) {
        this.b = 0;
    }
}
