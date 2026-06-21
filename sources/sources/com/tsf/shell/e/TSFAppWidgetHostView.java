package com.tsf.shell.e;

import android.appwidget.AppWidgetHostView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.b;
import com.tsf.shell.utils.StatusBarHelper;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class TSFAppWidgetHostView extends AppWidgetHostView {
    private boolean a;
    private a b;
    private LayoutInflater c;

    public TSFAppWidgetHostView(Context context) {
        super(context);
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
        setDrawingCacheEnabled(false);
        g.a(this);
    }

    public WidgetContainer getHostLayout() {
        if (getParent() == null || !(getParent() instanceof b)) {
            return null;
        }
        return (WidgetContainer) getParent();
    }

    @Override // android.appwidget.AppWidgetHostView
    protected View getErrorView() {
        TextView textView = (TextView) this.c.inflate(b.g.appwidget_error, (ViewGroup) this, false);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.e.TSFAppWidgetHostView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.tsf.shell.manager.app.WidgetLayoutManager.a.a(TSFAppWidgetHostView.this.getHostLayout());
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
                TSFAppWidgetHostView();
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

    class a implements Runnable {
        private int b;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (TSFAppWidgetHostView.this.getParent() != null && TSFAppWidgetHostView.this.hasWindowFocus() && this.b == TSFAppWidgetHostView.this.getWindowAttachCount() && !TSFAppWidgetHostView.this.a && TSFAppWidgetHostView.this.performLongClick()) {
                TSFAppWidgetHostView.this.a = true;
            }
        }

        public void a() {
            this.b = TSFAppWidgetHostView.this.getWindowAttachCount();
        }
    }

    private void a() {
        this.a = false;
        if (this.b == null) {
            this.b = new TSFAppWidgetHost();
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
