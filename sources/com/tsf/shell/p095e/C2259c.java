package com.tsf.shell.p095e;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.C1306b;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.utils.C4170g;
/* renamed from: com.tsf.shell.e.c */
/* loaded from: classes.dex */
public class C2259c extends AppWidgetHostView {

    /* renamed from: a */
    private boolean f7370a;

    /* renamed from: b */
    private RunnableC2261a f7371b;

    /* renamed from: c */
    private LayoutInflater f7372c;

    public C2259c(Context context) {
        super(context);
        this.f7372c = (LayoutInflater) context.getSystemService("layout_inflater");
        setDrawingCacheEnabled(false);
        C4170g.m687a(this);
    }

    public C2255b getHostLayout() {
        if (getParent() == null || !(getParent() instanceof C2255b)) {
            return null;
        }
        return (C2255b) getParent();
    }

    @Override // android.appwidget.AppWidgetHostView
    protected View getErrorView() {
        TextView textView = (TextView) this.f7372c.inflate(C1306b.C1313g.appwidget_error, (ViewGroup) this, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.e.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                C3359a.f11098l.f11996a.m1879a(C2259c.this.getHostLayout());
            }
        });
        return textView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f7370a) {
            this.f7370a = false;
            return true;
        }
        switch (motionEvent.getAction()) {
            case 0:
                m6001a();
                return false;
            case 1:
            case 3:
                this.f7370a = false;
                if (this.f7371b != null) {
                    removeCallbacks(this.f7371b);
                    return false;
                }
                return false;
            case 2:
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.e.c$a */
    /* loaded from: classes.dex */
    public class RunnableC2261a implements Runnable {

        /* renamed from: b */
        private int f7375b;

        RunnableC2261a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2259c.this.getParent() != null && C2259c.this.hasWindowFocus() && this.f7375b == C2259c.this.getWindowAttachCount() && !C2259c.this.f7370a && C2259c.this.performLongClick()) {
                C2259c.this.f7370a = true;
            }
        }

        /* renamed from: a */
        public void m5996a() {
            this.f7375b = C2259c.this.getWindowAttachCount();
        }
    }

    /* renamed from: a */
    private void m6001a() {
        this.f7370a = false;
        if (this.f7371b == null) {
            this.f7371b = new RunnableC2261a();
        }
        this.f7371b.m5996a();
        postDelayed(this.f7371b, 750L);
    }

    @Override // android.view.View
    public void cancelLongPress() {
        super.cancelLongPress();
        this.f7370a = false;
        if (this.f7371b != null) {
            removeCallbacks(this.f7371b);
        }
    }
}
