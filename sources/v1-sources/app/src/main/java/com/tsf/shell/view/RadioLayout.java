package com.tsf.shell.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
public class RadioLayout extends LinearLayout implements View.OnClickListener {
    private boolean isCheck;
    private String title;

    public RadioLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.title = "";
        this.isCheck = false;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        setOnClickListener(this);
    }

    public void setTitle(String str) {
        this.title = str;
        TextView textView = (TextView) findViewById(R.id.textView1);
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public void setValue(boolean z) {
        this.isCheck = z;
        View findViewById = findViewById(R.id.icon1);
        if (findViewById != null) {
            findViewById.setBackgroundResource(this.isCheck ? R.drawable.setting_radio_r_on : R.drawable.setting_radio_r_off);
        }
    }

    private void toggle() {
        this.isCheck = !this.isCheck;
        setValue(this.isCheck);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        toggle();
    }
}
