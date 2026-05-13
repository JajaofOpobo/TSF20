package android.support.p013v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p013v7.app.C0562a;
import android.support.p013v7.p014a.C0535a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
/* renamed from: android.support.v7.app.b */
/* loaded from: classes.dex */
public class DialogInterfaceC0576b extends DialogC0587i implements DialogInterface {

    /* renamed from: a */
    private C0562a f1282a;

    DialogInterfaceC0576b(Context context, int i, boolean z) {
        super(context, m12003a(context, i));
        this.f1282a = new C0562a(getContext(), this, getWindow());
    }

    /* renamed from: a */
    static int m12003a(Context context, int i) {
        if (i < 16777216) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C0535a.C0536a.alertDialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.support.p013v7.app.DialogC0587i, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f1282a.m12033a(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.app.DialogC0587i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1282a.m12048a();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f1282a.m12046a(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f1282a.m12030b(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* renamed from: android.support.v7.app.b$a */
    /* loaded from: classes.dex */
    public static class C0577a {

        /* renamed from: a */
        private final C0562a.C0568a f1283a;

        /* renamed from: b */
        private int f1284b;

        public C0577a(Context context) {
            this(context, DialogInterfaceC0576b.m12003a(context, 0));
        }

        public C0577a(Context context, int i) {
            this.f1283a = new C0562a.C0568a(new ContextThemeWrapper(context, DialogInterfaceC0576b.m12003a(context, i)));
            this.f1284b = i;
        }

        /* renamed from: a */
        public Context m12001a() {
            return this.f1283a.f1243a;
        }

        /* renamed from: a */
        public C0577a m11996a(CharSequence charSequence) {
            this.f1283a.f1248f = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0577a m11998a(View view) {
            this.f1283a.f1249g = view;
            return this;
        }

        /* renamed from: a */
        public C0577a m11999a(Drawable drawable) {
            this.f1283a.f1246d = drawable;
            return this;
        }

        /* renamed from: a */
        public C0577a m12000a(DialogInterface.OnKeyListener onKeyListener) {
            this.f1283a.f1260r = onKeyListener;
            return this;
        }

        /* renamed from: a */
        public C0577a m11997a(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            this.f1283a.f1262t = listAdapter;
            this.f1283a.f1263u = onClickListener;
            return this;
        }

        /* renamed from: b */
        public DialogInterfaceC0576b m11995b() {
            DialogInterfaceC0576b dialogInterfaceC0576b = new DialogInterfaceC0576b(this.f1283a.f1243a, this.f1284b, false);
            this.f1283a.m12006a(dialogInterfaceC0576b.f1282a);
            dialogInterfaceC0576b.setCancelable(this.f1283a.f1257o);
            if (this.f1283a.f1257o) {
                dialogInterfaceC0576b.setCanceledOnTouchOutside(true);
            }
            dialogInterfaceC0576b.setOnCancelListener(this.f1283a.f1258p);
            dialogInterfaceC0576b.setOnDismissListener(this.f1283a.f1259q);
            if (this.f1283a.f1260r != null) {
                dialogInterfaceC0576b.setOnKeyListener(this.f1283a.f1260r);
            }
            return dialogInterfaceC0576b;
        }
    }
}
