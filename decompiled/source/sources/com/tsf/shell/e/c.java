package com.tsf.shell.e;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.b;
import com.tsf.shell.utils.g;
/* loaded from: classes.dex */
public class c extends AppWidgetHostView {
    private boolean a;
    private a b;
    private LayoutInflater c;

    public c(Context context) {
        super(context);
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        setDrawingCacheEnabled(false);
        g.a(this);
    }

    public b getHostLayout() {
        if (getParent() == null || !(getParent() instanceof b)) {
            return null;
        }
        return (b) getParent();
    }

    @Override // android.appwidget.AppWidgetHostView
    protected View getErrorView() {
        TextView textView = (TextView) this.c.inflate(b.g.appwidget_error, (ViewGroup) this, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.e.c.1
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
                if (this.b != null) {
                    removeCallbacks(this.b);
                    return false;
                }
                return false;
            case 2:
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        private int b;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.getParent() != null && c.this.hasWindowFocus() && this.b == c.this.getWindowAttachCount() && !c.this.a && c.this.performLongClick()) {
                c.this.a = true;
            }
        }

        public void a() {
            this.b = c.this.getWindowAttachCount();
        }
    }

    private void a() {
        this.a = false;
        if (this.b == null) {
            this.b = new a();
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
