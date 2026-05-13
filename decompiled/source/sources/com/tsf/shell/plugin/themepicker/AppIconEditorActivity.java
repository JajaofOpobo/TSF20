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
import android.support.v7.widget.q;
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
import com.tsf.shell.plugin.themepicker.f;
/* loaded from: classes.dex */
public class AppIconEditorActivity extends FragmentActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.app.FragmentActivity, android.support.v4.app.h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("appInfo");
        a aVar = new a();
        aVar.g(bundleExtra);
        aVar.a(f().a(), "dialog");
    }

    /* loaded from: classes.dex */
    public static class a extends android.support.v4.app.k implements View.OnClickListener {
        private View ai;
        private Bitmap aj;
        private String ak;
        private String al;

        public a() {
            a(1, 0);
        }

        @Override // android.support.v4.app.k, android.support.v4.app.Fragment
        public void a(Bundle bundle) {
            super.a(bundle);
            Bundle h = h();
            if (h != null) {
                int i = h.getInt("iconStartX");
                int i2 = h.getInt("iconStartY");
                this.aj = Bitmap.createBitmap(h.getInt("iconWidth"), h.getInt("iconHeight"), Bitmap.Config.ARGB_8888);
                new Canvas(this.aj).drawBitmap((Bitmap) h.getParcelable("icon"), -i, i2, (Paint) null);
                this.ak = h.getString("name");
                this.al = h.getString("package");
            }
        }

        @Override // android.support.v4.app.Fragment
        public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.ai = layoutInflater.inflate(f.h.fragment_edit_shortcut, viewGroup);
            this.ai.findViewById(f.C0155f.done).setOnClickListener(this);
            this.ai.findViewById(f.C0155f.icon).setOnClickListener(this);
            this.ai.findViewById(f.C0155f.menu).setOnClickListener(this);
            this.ai.findViewById(f.C0155f.undo).setOnClickListener(this);
            this.ai.findViewById(f.C0155f.reset).setOnClickListener(this);
            if (this.aj != null) {
                ((ImageView) this.ai.findViewById(f.C0155f.icon)).setImageBitmap(this.aj);
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.ai.findViewById(f.C0155f.label);
            autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.plugin.themepicker.AppIconEditorActivity.a.1
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (keyEvent.getAction() == 0 && i == 66) {
                        e.b("Enter on Key");
                        ((InputMethodManager) a.this.i().getSystemService("input_method")).toggleSoftInput(1, 2);
                        return false;
                    }
                    return false;
                }
            });
            if (this.ak != null) {
                autoCompleteTextView.setText(this.ak);
            }
            return this.ai;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == f.C0155f.icon) {
                Intent intent = new Intent();
                intent.setClass(i(), IconPickerActivity.class);
                a(intent, VEasing.Back.easeIn);
            } else if (id == f.C0155f.menu) {
                a(view);
            } else if (id == f.C0155f.done) {
                N();
            } else if (id == f.C0155f.undo) {
                M();
            } else if (id == f.C0155f.reset) {
                O();
            }
        }

        private void M() {
            a();
        }

        private void N() {
            String obj = ((AutoCompleteTextView) this.ai.findViewById(f.C0155f.label)).getText().toString();
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("reset", false);
            bundle.putParcelable("icon", this.aj);
            bundle.putString("name", obj);
            intent.putExtras(bundle);
            i().setResult(-1, intent);
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void O() {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("reset", true);
            intent.putExtras(bundle);
            i().setResult(-1, intent);
            a();
        }

        private void a(View view) {
            q qVar = new q(i(), view);
            qVar.a().add(0, 0, 0, f.j.theme_picker_discard_changes);
            if (this.al != null) {
                qVar.a().add(0, 1, 0, f.j.theme_picker_info_target_label);
            }
            qVar.a(new q.b() { // from class: com.tsf.shell.plugin.themepicker.AppIconEditorActivity.a.2
                @Override // android.support.v7.widget.q.b
                public boolean a(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    e.b("Menu id:" + itemId);
                    if (itemId == 0) {
                        a.this.O();
                    } else if (itemId == 1) {
                        Intent intent = new Intent();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 9) {
                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", a.this.al, null));
                        } else {
                            String str = i == 8 ? "pkg" : "com.android.settings.ApplicationPkgName";
                            intent.setAction("android.intent.action.VIEW");
                            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                            intent.putExtra(str, a.this.al);
                        }
                        a.this.i().startActivity(intent);
                    }
                    return true;
                }
            });
            qVar.b();
        }

        @Override // android.support.v4.app.Fragment
        public void a(int i, int i2, Intent intent) {
            if (i2 == -1) {
                switch (i) {
                    case VEasing.Back.easeIn /* 200 */:
                        this.aj = (Bitmap) intent.getExtras().get("data");
                        if (this.aj != null) {
                            e.b("onActivityResult bitmap :" + this.aj.getWidth() + ":" + this.aj.getHeight());
                            ((ImageButton) this.ai.findViewById(f.C0155f.icon)).setImageBitmap(this.aj);
                            return;
                        }
                        e.b("onActivityResult bitmap is null");
                        return;
                    default:
                        return;
                }
            }
        }

        @Override // android.support.v4.app.k, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            e.b("onDismiss");
            FragmentActivity i = i();
            if (i != null) {
                i.finish();
            }
        }
    }
}
