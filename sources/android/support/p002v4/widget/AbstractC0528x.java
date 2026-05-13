package android.support.p002v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: android.support.v4.widget.x */
/* loaded from: classes.dex */
public abstract class AbstractC0528x extends AbstractC0492g {

    /* renamed from: j */
    private int f1106j;

    /* renamed from: k */
    private int f1107k;

    /* renamed from: l */
    private LayoutInflater f1108l;

    public AbstractC0528x(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f1107k = i;
        this.f1106j = i;
        this.f1108l = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // android.support.p002v4.widget.AbstractC0492g
    /* renamed from: a */
    public View mo11090a(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1108l.inflate(this.f1106j, viewGroup, false);
    }

    @Override // android.support.p002v4.widget.AbstractC0492g
    /* renamed from: b */
    public View mo12164b(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f1108l.inflate(this.f1107k, viewGroup, false);
    }
}
