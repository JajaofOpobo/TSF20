package com.tsf.shell.p086a.p087a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.p024b.p025a.C0843a;
/* renamed from: com.tsf.shell.a.a.c */
/* loaded from: classes.dex */
public class DialogC2197c extends Dialog {

    /* renamed from: a */
    Context f7227a;

    /* renamed from: b */
    private InterfaceC2201a f7228b;

    /* renamed from: com.tsf.shell.a.a.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2201a {
        /* renamed from: a */
        boolean mo6086a(DialogInterface dialogInterface, int i, KeyEvent keyEvent);
    }

    public DialogC2197c(Context context) {
        super(context);
        this.f7227a = context;
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        m6095a(attributes);
        getWindow().setAttributes(attributes);
        getWindow().addFlags(2);
        setContentView(C0843a.C0846c.permission_guide_dialog);
    }

    /* renamed from: a */
    public void m6095a(WindowManager.LayoutParams layoutParams) {
        layoutParams.dimAmount = 0.6f;
    }

    /* renamed from: a */
    public void m6098a(int i) {
        View findViewById = findViewById(C0843a.C0845b.iv_close);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    /* renamed from: a */
    public void m6094a(InterfaceC2201a interfaceC2201a) {
        this.f7228b = interfaceC2201a;
    }

    /* renamed from: a */
    public void m6096a(int i, String str, DialogInterface.OnClickListener onClickListener) {
        m6097a(i, 0, str, onClickListener);
    }

    /* renamed from: a */
    public void m6097a(int i, int i2, String str, final DialogInterface.OnClickListener onClickListener) {
        if (this.f7227a instanceof Activity) {
            setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.tsf.shell.a.a.c.1
                @Override // android.content.DialogInterface.OnKeyListener
                public boolean onKey(DialogInterface dialogInterface, int i3, KeyEvent keyEvent) {
                    if (keyEvent.getKeyCode() == 4) {
                        if (DialogC2197c.this.f7228b != null) {
                            return DialogC2197c.this.f7228b.mo6086a(dialogInterface, 4, keyEvent);
                        }
                        return true;
                    }
                    return false;
                }
            });
            findViewById(C0843a.C0845b.perm_ok).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.a.a.c.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (onClickListener != null) {
                        onClickListener.onClick(DialogC2197c.this, -1);
                    }
                }
            });
            findViewById(C0843a.C0845b.iv_close).setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.a.a.c.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    DialogC2197c.this.dismiss();
                    if (onClickListener != null) {
                        onClickListener.onClick(DialogC2197c.this, -2);
                    }
                }
            });
            ((TextView) findViewById(C0843a.C0845b.perm_desc)).setText(str);
            if (i2 != 0) {
                ((ImageView) findViewById(C0843a.C0845b.f2401bg)).setImageResource(i2);
            }
            setCanceledOnTouchOutside(false);
            super.show();
        }
    }
}
