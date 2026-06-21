package com.tsf.shell.d;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class c extends AppWidgetHostView {
    private boolean a;
    private d b;
    private LayoutInflater c;

    public c(Context context) {
        super(context);
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        setDrawingCacheEnabled(false);
        com.tsf.shell.utils.g.a(this);
    }

    public b getHostLayout() {
        if (getParent() == null || !(getParent() instanceof b)) {
            return null;
        }
        return (b) getParent();
    }

    @Override // android.appwidget.AppWidgetHostView
    protected View getErrorView() {
        TextView textView = (TextView) this.c.inflate(R.layout.appwidget_error, (ViewGroup) this, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.d.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.tsf.shell.manager.a.l.a.a(c.this.getHostLayout());
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.a) {
            this.a = false;
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                a();
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

    private void a() {
        this.a = false;
        if (this.b == null) {
            this.b = new d(this);
        }
        this.b.a();
        postDelayed(this.b, 750L);
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.a = false;
        if (this.b != null) {
            removeCallbacks(this.b);
        }
    }
}
