package com.tsf.shell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class SettingLayout extends RelativeLayout {
    private View Drag;
    private onValueChange Listener;
    private View SeekEnable;
    private float max;
    private int offsetY;
    private float seekPrecent;
    private View seekbar;
    private TextView valuenum;

    public interface onValueChange {
        void onSeekChange(View view, float f);

        void onSeekChangeComplete(View view);
    }

    public SettingLayout(Context context) {
        super(context);
        this.seekPrecent = 0.0f;
        this.max = 1.0f;
    }

    public SettingLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.seekPrecent = 0.0f;
        this.max = 1.0f;
    }

    public SettingLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.seekPrecent = 0.0f;
        this.max = 1.0f;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.seekbar = findViewById(R.id.seekbar);
        this.valuenum = (TextView) findViewById(R.id.valuenum);
        setOnTouchListener(new a(this));
        this.Drag = findViewById(R.id.drag_btn);
        this.SeekEnable = findViewById(R.id.seekenable);
        this.offsetY = this.SeekEnable.getTop();
        this.max = this.seekbar.getWidth() - this.Drag.getWidth();
        refreshLayout();
    }

    public void setPrecent(float f) {
        this.seekPrecent = f;
        refreshLayout();
    }

    private void refreshLayout() {
        if (this.valuenum != null) {
            this.valuenum.setText(new StringBuilder().append((int) (this.seekPrecent * 100.0f)).toString());
        }
        if (this.Drag != null) {
            int i = (int) (this.seekPrecent * this.max);
            this.Drag.layout(i, 0, this.Drag.getWidth() + i, this.Drag.getHeight());
        }
        if (this.SeekEnable != null) {
            this.SeekEnable.layout(0, this.offsetY, ((int) (this.max * this.seekPrecent)) + 2, this.offsetY + this.SeekEnable.getHeight());
        }
        if (this.Listener != null) {
            this.Listener.onSeekChange(this, this.seekPrecent);
        }
        invalidate();
    }

    public void setValueChangeListener(onValueChange onvaluechange) {
        this.Listener = onvaluechange;
    }

    public void drag(float f, float f2) {
        float f3 = f / this.max;
        float f4 = f3 >= 0.0f ? f3 : 0.0f;
        setPrecent(f4 <= 1.0f ? f4 : 1.0f);
    }

    public void dragComplete() {
        this.Listener.onSeekChangeComplete(this);
    }

    public void setTitle(String str) {
        ((TextView) findViewById(R.id.title)).setText(str);
    }
}
