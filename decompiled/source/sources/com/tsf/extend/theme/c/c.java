package com.tsf.extend.theme.c;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.base.j.p;
import com.tsf.extend.base.j.z;
import com.tsf.extend.f;
import com.tsf.extend.theme.c.i;
import com.tsf.extend.theme.v;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class c extends FrameLayout implements View.OnClickListener, PageActivity.a {
    private final long a;
    private PageActivity b;
    private FrameLayout c;
    private EditText d;
    private View e;
    private TextView f;
    private InputMethodManager g;
    private long h;
    private i i;
    private String j;
    private boolean k;
    private View l;
    private List<e> m;
    private View n;
    private a o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private b u;
    private byte v;
    private i.a w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum b {
        EntryGo,
        Tag,
        Go
    }

    public c(Context context, int i, boolean z, List<e> list) {
        super(context);
        this.a = 1000L;
        this.h = 0L;
        this.p = true;
        this.q = false;
        this.r = -6710887;
        this.s = -13421773;
        this.t = false;
        this.v = (byte) 0;
        this.w = new i.a() { // from class: com.tsf.extend.theme.c.c.4
            @Override // com.tsf.extend.theme.c.i.a
            public void a(String str) {
                c.this.j = str;
                if (c.this.d != null) {
                    c.this.d.setText(str);
                    c.this.z();
                }
                if (c.this.k()) {
                    c.this.u = b.Tag;
                    c.this.a(str);
                }
            }
        };
        this.j = a(i, list);
        this.k = z;
        this.m = list;
        h();
        g();
    }

    private String a(int i, List<e> list) {
        return (list == null || list.size() <= i || i < 0) ? "" : list.get(i).a();
    }

    private void g() {
        if (this.k) {
            this.v = (byte) 1;
        }
    }

    private void h() {
        this.g = (InputMethodManager) getContext().getSystemService("input_method");
        setPadding(0, getContext().getResources().getDimensionPixelSize(f.c.workspace_margin_top), 0, p.c(getContext()));
        this.c = new FrameLayout(getContext());
        this.c.setBackgroundColor(Color.parseColor("#EEEEEE"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int a2 = com.tsf.extend.base.j.i.a(36.0f) + com.tsf.extend.base.j.i.a(8.0f) + com.tsf.extend.base.j.i.a(8.0f);
        layoutParams.topMargin = a2;
        addView(this.c, layoutParams);
        setupSearchBar(a2);
        addView(getSearchProgressView(), layoutParams);
        i();
    }

    private View getSearchProgressView() {
        View inflate = LayoutInflater.from(getContext()).inflate(f.C0052f.theme_search_progress, (ViewGroup) null);
        com.tsf.extend.base.widget.pulltorefresh.d dVar = new com.tsf.extend.base.widget.pulltorefresh.d(getContext(), 3, 2);
        dVar.a(new int[]{12040119, 12040119, -4737097});
        ((ProgressBar) inflate.findViewById(f.e.theme_search_progress)).setIndeterminateDrawable(dVar);
        this.n = inflate;
        q();
        return inflate;
    }

    public void a(View view) {
        this.c.removeAllViews();
        this.c.addView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.theme_search_btn) {
            v();
        } else if (id == f.e.theme_search_delete) {
            u();
        }
    }

    private void setupSearchBar(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(f.C0052f.theme_search_bar, (ViewGroup) null);
        addView(inflate, new FrameLayout.LayoutParams(-1, i));
        this.l = inflate.findViewById(f.e.theme_search_icon);
        if (this.k) {
            s();
        } else {
            r();
        }
        this.f = (TextView) inflate.findViewById(f.e.theme_search_btn);
        this.f.setOnClickListener(this);
        this.e = inflate.findViewById(f.e.theme_search_delete);
        this.e.setOnClickListener(this);
        this.e.setVisibility(4);
        this.d = (EditText) inflate.findViewById(f.e.search_edit);
        this.d.addTextChangedListener(new TextWatcher() { // from class: com.tsf.extend.theme.c.c.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence != null) {
                    if (charSequence.length() > 0) {
                        c.this.e.setVisibility(0);
                        c.this.n();
                        return;
                    }
                    c.this.e.setVisibility(4);
                    c.this.o();
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        this.d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.tsf.extend.theme.c.c.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 == 4 || i2 == 6 || i2 == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    c.this.w();
                    return true;
                }
                return true;
            }
        });
        this.d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.tsf.extend.theme.c.c.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z && c.this.q) {
                    c.this.d.setText("");
                    c.this.q = false;
                    c.this.z();
                }
            }
        });
        this.d.setImeOptions(268435459);
        this.d.setText(this.j);
    }

    private void i() {
        if (this.k || !k()) {
            j();
            m();
            if (this.j != null && this.j.length() > 0) {
                n();
                y();
                this.q = true;
                return;
            }
            return;
        }
        this.u = b.EntryGo;
        a(this.j);
        o();
    }

    private void j() {
        if (this.i == null) {
            this.i = new i(getContext());
            this.i.setTagData(this.m);
            this.i.setOnTagClickListener(this.w);
        }
        a(this.i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k() {
        if (p.d(getContext())) {
            return true;
        }
        a(getResources().getString(f.g.uplaod_wallpaper_dialog_no_network), 1);
        return false;
    }

    private void l() {
        if (this.i != null) {
            this.i.c();
        }
    }

    private void m() {
        if (this.i != null) {
            this.i.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        this.p = true;
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.p = false;
        t();
    }

    private void p() {
        if (this.n != null) {
            this.n.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.n != null) {
            this.n.setVisibility(8);
        }
    }

    private void r() {
        if (this.l != null) {
            this.l.setVisibility(0);
        }
    }

    private void s() {
        if (this.l != null) {
            this.l.setVisibility(8);
        }
    }

    private void t() {
        if (this.p) {
            this.f.setText(f.g.search_btn_text_go);
        } else {
            this.f.setText(f.g.search_btn_text_cancel);
        }
    }

    private void u() {
        this.d.setText("");
        this.e.setVisibility(4);
        com.tsf.extend.theme.c.a.a((byte) 4);
    }

    private void v() {
        if (this.p) {
            w();
            z();
            return;
        }
        x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.h >= 1000) {
            this.h = currentTimeMillis;
            if (k()) {
                String obj = this.d.getText().toString();
                this.j = obj;
                if (!TextUtils.isEmpty(obj)) {
                    this.u = b.Go;
                    a(obj);
                }
                A();
            }
        }
    }

    private void x() {
        a((byte) 3);
        this.t = true;
        this.b.onBackPressed();
        A();
    }

    private void a(byte b2) {
        com.tsf.extend.theme.c.a.a(this.v, b2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (b(str)) {
            String trim = str.trim();
            p();
            r();
            o();
            c(trim);
        }
    }

    private boolean b(String str) {
        return str != null && str.trim().length() > 0;
    }

    private void y() {
        if (this.d != null) {
            this.d.setTextColor(this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        if (this.d != null) {
            this.d.setTextColor(this.s);
        }
    }

    private void A() {
        if (this.d != null) {
            this.g.hideSoftInputFromWindow(this.d.getWindowToken(), 0);
        }
    }

    private void B() {
        if (this.d != null) {
            this.d.clearFocus();
        }
    }

    public void setKeyword(String str) {
        this.j = str;
    }

    public void setIsInitialPage(boolean z) {
        this.k = z;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a(PageActivity pageActivity) {
        this.b = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void c() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public boolean e() {
        if (!this.t) {
            a((byte) 1);
            return false;
        }
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.a
    public void f() {
        a((byte) 2);
    }

    private void c(String str) {
        this.o = new a();
        v.h().a(this.o, a.b.Refresh, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.tsf.extend.base.b.a aVar) {
        if (aVar != null && aVar.a().size() > 0) {
            b(aVar);
            a(aVar.g());
            this.q = false;
            return;
        }
        C();
        a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        j();
        l();
        s();
        this.k = true;
    }

    private void b(com.tsf.extend.base.b.a aVar) {
        d dVar = new d(getContext(), this.b, this.j);
        dVar.a(aVar, false);
        a(dVar);
        this.k = false;
        A();
        B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i) {
        Toast makeText = Toast.makeText(getContext(), str, i);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        byte b2;
        byte b3 = 0;
        switch (this.u) {
            case EntryGo:
                b2 = 2;
                break;
            case Tag:
                b2 = 0;
                b3 = 1;
                break;
            case Go:
                b2 = 0;
                b3 = 3;
                break;
            default:
                b2 = 0;
                break;
        }
        com.tsf.extend.theme.c.a.a(b2, b3, this.j, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements a.InterfaceC0048a<com.tsf.extend.base.b.a> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final com.tsf.extend.base.b.a aVar) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    c.this.a(aVar);
                    c.this.q();
                }
            });
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, final int i, com.tsf.extend.base.b.a aVar) {
            z.a(0, new Runnable() { // from class: com.tsf.extend.theme.c.c.a.2
                @Override // java.lang.Runnable
                public void run() {
                    c.this.q();
                    if (i == 0) {
                        c.this.a(c.this.getResources().getString(f.g.theme_search_network_error), 1);
                    } else {
                        c.this.C();
                    }
                    c.this.a(0);
                }
            });
        }
    }
}
