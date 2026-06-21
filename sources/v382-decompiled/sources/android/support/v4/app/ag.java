package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ag {
    Notification A;
    public ArrayList C;
    Context a;
    CharSequence b;
    CharSequence c;
    PendingIntent d;
    PendingIntent e;
    RemoteViews f;
    Bitmap g;
    CharSequence h;
    int i;
    int j;
    boolean l;
    ar m;
    CharSequence n;
    int o;
    int p;
    boolean q;
    String r;
    boolean s;
    String t;
    String w;
    Bundle x;
    boolean k = true;
    ArrayList u = new ArrayList();
    boolean v = false;
    int y = 0;
    int z = 0;
    Notification B = new Notification();

    public ag(Context context) {
        this.a = context;
        this.B.when = System.currentTimeMillis();
        this.B.audioStreamType = -1;
        this.j = 0;
        this.C = new ArrayList();
    }

    public ag a(long j) {
        this.B.when = j;
        return this;
    }

    public ag a(int i) {
        this.B.icon = i;
        return this;
    }

    public ag a(CharSequence charSequence) {
        this.b = c(charSequence);
        return this;
    }

    public ag b(CharSequence charSequence) {
        this.c = c(charSequence);
        return this;
    }

    public ag a(PendingIntent pendingIntent) {
        this.d = pendingIntent;
        return this;
    }

    public ag a(Bitmap bitmap) {
        this.g = bitmap;
        return this;
    }

    public ag a(boolean z) {
        a(16, z);
        return this;
    }

    private void a(int i, boolean z) {
        if (z) {
            this.B.flags |= i;
        } else {
            this.B.flags &= i ^ (-1);
        }
    }

    public Notification a() {
        ai aiVar;
        aiVar = ac.a;
        return aiVar.a(this);
    }

    protected static CharSequence c(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
