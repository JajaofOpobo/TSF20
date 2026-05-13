package com.tsf.shell.a.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.b.a.a;
/* loaded from: classes.dex */
public class c extends Dialog {
    Context a;
    private a b;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(DialogInterface dialogInterface, int i, KeyEvent keyEvent);
    }

    public c(Context context) {
        super(context);
        this.a = context;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        a(attributes);
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        setContentView(a.c.permission_guide_dialog);
    }

    public void a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.6f;
    }

    public void a(int i) {
        View findViewById = findViewById(a.b.iv_close);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void a(int i, String str, DialogInterface.OnClickListener onClickListener) {
        a(i, 0, str, onClickListener);
    }

    public void a(int i, int i2, String str, final DialogInterface.OnClickListener onClickListener) {
        if (this.a instanceof Activity) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tsf.shell.a.a.c.1
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 4) {
                        if (c.this.b != null) {
                            return c.this.b.a(dialogInterface, 4, keyEvent);
                        }
                        return true;
                    }
                    return false;
                }
            });
            findViewById(a.b.perm_ok).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.a.a.c.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (onClickListener != null) {
                        onClickListener.onClick(c.this, -1);
                    }
                }
            });
            findViewById(a.b.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.a.a.c.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    c.this.dismiss();
                    if (onClickListener != null) {
                        onClickListener.onClick(c.this, -2);
                    }
                }
            });
            ((TextView) findViewById(a.b.perm_desc)).setText(str);
            if (i2 != 0) {
                ((ImageView) findViewById(a.b.bg)).setImageResource(i2);
            }
            setCanceledOnTouchOutside(false);
            super.show();
        }
    }
}
