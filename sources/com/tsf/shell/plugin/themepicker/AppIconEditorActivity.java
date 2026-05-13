package com.tsf.shell.plugin.themepicker;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k;
import android.support.p002v4.app.FragmentActivity;
import android.support.p013v7.widget.C0758q;
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
import com.tsf.shell.plugin.themepicker.C3852f;
/* loaded from: classes.dex */
public class AppIconEditorActivity extends FragmentActivity {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.FragmentActivity, android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundleExtra = getIntent().getBundleExtra("appInfo");
        View$OnClickListenerC3836a view$OnClickListenerC3836a = new View$OnClickListenerC3836a();
        view$OnClickListenerC3836a.m13748g(bundleExtra);
        view$OnClickListenerC3836a.m13634a(m13715f().mo13569a(), "dialog");
    }

    /* renamed from: com.tsf.shell.plugin.themepicker.AppIconEditorActivity$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC3836a extends DialogInterface$OnCancelListenerC0090k implements View.OnClickListener {

        /* renamed from: ai */
        private View f12583ai;

        /* renamed from: aj */
        private Bitmap f12584aj;

        /* renamed from: ak */
        private String f12585ak;

        /* renamed from: al */
        private String f12586al;

        public View$OnClickListenerC3836a() {
            m13637a(1, 0);
        }

        @Override // android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k, android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo782a(Bundle bundle) {
            super.mo782a(bundle);
            Bundle h = m13747h();
            if (h != null) {
                int i = h.getInt("iconStartX");
                int i2 = h.getInt("iconStartY");
                this.f12584aj = Bitmap.createBitmap(h.getInt("iconWidth"), h.getInt("iconHeight"), Bitmap.Config.ARGB_8888);
                new Canvas(this.f12584aj).drawBitmap((Bitmap) h.getParcelable("icon"), -i, i2, (Paint) null);
                this.f12585ak = h.getString("name");
                this.f12586al = h.getString("package");
            }
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public View mo781a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            this.f12583ai = layoutInflater.inflate(C3852f.C3860h.fragment_edit_shortcut, viewGroup);
            this.f12583ai.findViewById(C3852f.C3858f.done).setOnClickListener(this);
            this.f12583ai.findViewById(C3852f.C3858f.icon).setOnClickListener(this);
            this.f12583ai.findViewById(C3852f.C3858f.menu).setOnClickListener(this);
            this.f12583ai.findViewById(C3852f.C3858f.undo).setOnClickListener(this);
            this.f12583ai.findViewById(C3852f.C3858f.reset).setOnClickListener(this);
            if (this.f12584aj != null) {
                ((ImageView) this.f12583ai.findViewById(C3852f.C3858f.icon)).setImageBitmap(this.f12584aj);
            }
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) this.f12583ai.findViewById(C3852f.C3858f.label);
            autoCompleteTextView.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.plugin.themepicker.AppIconEditorActivity.a.1
                @Override // android.view.View.OnKeyListener
                public boolean onKey(View view, int i, KeyEvent keyEvent) {
                    if (keyEvent.getAction() == 0 && i == 66) {
                        C3851e.m1317b("Enter on Key");
                        ((InputMethodManager) View$OnClickListenerC3836a.this.m13745i().getSystemService("input_method")).toggleSoftInput(1, 2);
                        return false;
                    }
                    return false;
                }
            });
            if (this.f12585ak != null) {
                autoCompleteTextView.setText(this.f12585ak);
            }
            return this.f12583ai;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int id = view.getId();
            if (id == C3852f.C3858f.icon) {
                Intent intent = new Intent();
                intent.setClass(m13745i(), IconPickerActivity.class);
                m13773a(intent, VEasing.Back.easeIn);
            } else if (id == C3852f.C3858f.menu) {
                m1342a(view);
            } else if (id == C3852f.C3858f.done) {
                m1344N();
            } else if (id == C3852f.C3858f.undo) {
                m1345M();
            } else if (id == C3852f.C3858f.reset) {
                m1343O();
            }
        }

        /* renamed from: M */
        private void m1345M() {
            m13638a();
        }

        /* renamed from: N */
        private void m1344N() {
            String obj = ((AutoCompleteTextView) this.f12583ai.findViewById(C3852f.C3858f.label)).getText().toString();
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("reset", false);
            bundle.putParcelable("icon", this.f12584aj);
            bundle.putString("name", obj);
            intent.putExtras(bundle);
            m13745i().setResult(-1, intent);
            m13638a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public void m1343O() {
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putBoolean("reset", true);
            intent.putExtras(bundle);
            m13745i().setResult(-1, intent);
            m13638a();
        }

        /* renamed from: a */
        private void m1342a(View view) {
            C0758q c0758q = new C0758q(m13745i(), view);
            c0758q.m11119a().add(0, 0, 0, C3852f.C3862j.theme_picker_discard_changes);
            if (this.f12586al != null) {
                c0758q.m11119a().add(0, 1, 0, C3852f.C3862j.theme_picker_info_target_label);
            }
            c0758q.m11115a(new C0758q.InterfaceC0760b() { // from class: com.tsf.shell.plugin.themepicker.AppIconEditorActivity.a.2
                @Override // android.support.p013v7.widget.C0758q.InterfaceC0760b
                /* renamed from: a */
                public boolean mo1188a(MenuItem menuItem) {
                    int itemId = menuItem.getItemId();
                    C3851e.m1317b("Menu id:" + itemId);
                    if (itemId == 0) {
                        View$OnClickListenerC3836a.this.m1343O();
                    } else if (itemId == 1) {
                        Intent intent = new Intent();
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 9) {
                            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                            intent.setData(Uri.fromParts("package", View$OnClickListenerC3836a.this.f12586al, null));
                        } else {
                            String str = i == 8 ? "pkg" : "com.android.settings.ApplicationPkgName";
                            intent.setAction("android.intent.action.VIEW");
                            intent.setClassName("com.android.settings", "com.android.settings.InstalledAppDetails");
                            intent.putExtra(str, View$OnClickListenerC3836a.this.f12586al);
                        }
                        View$OnClickListenerC3836a.this.m13745i().startActivity(intent);
                    }
                    return true;
                }
            });
            c0758q.m11113b();
        }

        @Override // android.support.p002v4.app.Fragment
        /* renamed from: a */
        public void mo1168a(int i, int i2, Intent intent) {
            if (i2 == -1) {
                switch (i) {
                    case VEasing.Back.easeIn /* 200 */:
                        this.f12584aj = (Bitmap) intent.getExtras().get("data");
                        if (this.f12584aj != null) {
                            C3851e.m1317b("onActivityResult bitmap :" + this.f12584aj.getWidth() + ":" + this.f12584aj.getHeight());
                            ((ImageButton) this.f12583ai.findViewById(C3852f.C3858f.icon)).setImageBitmap(this.f12584aj);
                            return;
                        }
                        C3851e.m1317b("onActivityResult bitmap is null");
                        return;
                    default:
                        return;
                }
            }
        }

        @Override // android.support.p002v4.app.DialogInterface$OnCancelListenerC0090k, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            C3851e.m1317b("onDismiss");
            FragmentActivity i = m13745i();
            if (i != null) {
                i.finish();
            }
        }
    }
}
