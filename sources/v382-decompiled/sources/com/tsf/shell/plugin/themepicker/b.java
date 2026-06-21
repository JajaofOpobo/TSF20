package com.tsf.shell.plugin.themepicker;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.censivn.C3DEngine.api.tween.VEasing;

/* loaded from: classes.dex */
public class b extends android.support.v4.app.g implements View.OnClickListener {
    private View aj;
    private Bitmap ak;
    private String al;
    private String am;

    public b() {
        a(1, 0);
    }

    @Override // android.support.v4.app.g, android.support.v4.app.Fragment
    public void a(Bundle bundle) {
        super.a(bundle);
        Bundle h = h();
        if (h != null) {
            Bitmap bitmap = (Bitmap) h.getParcelable("icon");
            int i = h.getInt("iconStartX");
            int i2 = h.getInt("iconStartY");
            this.ak = Bitmap.createBitmap(h.getInt("iconWidth"), h.getInt("iconHeight"), Bitmap.Config.ARGB_8888);
            new Canvas(this.ak).drawBitmap(bitmap, -i, i2, (Paint) null);
            this.al = h.getString("name");
            this.am = h.getString("package");
        }
    }

    @Override // android.support.v4.app.Fragment
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj = layoutInflater.inflate(p.fragment_edit_shortcut, viewGroup);
        this.aj.findViewById(n.done).setOnClickListener(this);
        this.aj.findViewById(n.icon).setOnClickListener(this);
        this.aj.findViewById(n.menu).setOnClickListener(this);
        this.aj.findViewById(n.undo).setOnClickListener(this);
        this.aj.findViewById(n.reset).setOnClickListener(this);
        if (this.ak != null) {
            ((ImageView) this.aj.findViewById(n.icon)).setImageBitmap(this.ak);
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.aj.findViewById(n.label);
        autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.plugin.themepicker.b.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    g.b("Enter on Key");
                    ((InputMethodManager) b.this.i().getSystemService("input_method")).toggleSoftInput(1, 2);
                    return false;
                }
                return false;
            }
        });
        if (this.al != null) {
            autoCompleteTextView.setText(this.al);
        }
        return this.aj;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == n.icon) {
            Intent intent = new Intent();
            intent.setClass(i(), IconPickerActivity.class);
            a(intent, VEasing.Back.easeIn);
        } else {
            if (id == n.menu) {
                a(view);
                return;
            }
            if (id == n.done) {
                M();
            } else if (id == n.undo) {
                L();
            } else if (id == n.reset) {
                N();
            }
        }
    }

    private void L() {
        a();
    }

    private void M() {
        String editable = ((AutoCompleteTextView) this.aj.findViewById(n.label)).getText().toString();
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putBoolean("reset", false);
        bundle.putParcelable("icon", this.ak);
        bundle.putString("name", editable);
        intent.putExtras(bundle);
        i().setResult(-1, intent);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N() {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putBoolean("reset", true);
        intent.putExtras(bundle);
        i().setResult(-1, intent);
        a();
    }

    private void a(View view) {
        android.support.v7.widget.g gVar = new android.support.v7.widget.g(i(), view);
        gVar.a().add(0, 0, 0, r.theme_picker_discard_changes);
        if (this.am != null) {
            gVar.a().add(0, 1, 0, r.theme_picker_info_target_label);
        }
        gVar.a(new android.support.v7.widget.i() { // from class: com.tsf.shell.plugin.themepicker.b.2
            @Override // android.support.v7.widget.i
            public boolean a(MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                g.b("Menu id:" + itemId);
                if (itemId == 0) {
                    b.this.N();
                } else if (itemId == 1) {
                    Intent intent = new Intent();
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 9) {
                        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.fromParts("package", b.this.am, null));
                    } else {
                        String str = i == 8 ? "pkg" : "com.android.settings.ApplicationPkgName";
                        intent.setAction("android.intent.action.VIEW");
                        intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                        intent.putExtra(str, b.this.am);
                    }
                    b.this.i().startActivity(intent);
                }
                return true;
            }
        });
        gVar.b();
    }

    @Override // android.support.v4.app.Fragment
    public void a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            switch (i) {
                case VEasing.Back.easeIn /* 200 */:
                    this.ak = (Bitmap) intent.getExtras().get("data");
                    if (this.ak != null) {
                        g.b("onActivityResult bitmap :" + this.ak.getWidth() + ":" + this.ak.getHeight());
                        ((ImageButton) this.aj.findViewById(n.icon)).setImageBitmap(this.ak);
                        break;
                    } else {
                        g.b("onActivityResult bitmap is null");
                        break;
                    }
            }
        }
    }

    @Override // android.support.v4.app.g, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        g.b("onDismiss");
        FragmentActivity i = i();
        if (i != null) {
            i.finish();
        }
    }
}
