package com.tsf.shell.h;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public final class g extends AppWidgetHostView {
    private boolean a;
    private i b;
    private LayoutInflater c;

    public g(Context context) {
        super(context);
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        setDrawingCacheEnabled(false);
        com.tsf.shell.g.c.a();
    }

    public final d a() {
        if (getParent() == null || !(getParent() instanceof d)) {
            return null;
        }
        return (d) getParent();
    }

    @Override // android.appwidget.AppWidgetHostView
    protected final View getErrorView() {
        TextView textView = (TextView) this.c.inflate(R.layout.appwidget_error, (ViewGroup) this, false);
        textView.setOnClickListener(new h(this));
        return textView;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            this.a = false;
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.a = false;
                if (this.b == null) {
                    this.b = new i(this);
                }
                this.b.a();
                postDelayed(this.b, 750L);
                return false;
            case 1:
            case 3:
                this.a = false;
                if (this.b == null) {
                    return false;
                }
                removeCallbacks(this.b);
                return false;
            case 2:
            default:
                return false;
        }
    }

    @Override // android.view.View
    public final void cancelLongPress() {
        super.cancelLongPress();
        this.a = false;
        if (this.b != null) {
            removeCallbacks(this.b);
        }
    }
}
