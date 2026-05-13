package com.tsf.extend.theme.p084c;

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
import com.tsf.extend.C1536f;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1437p;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.p084c.View$OnClickListenerC1731i;
import java.util.List;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.theme.c.c */
/* loaded from: classes.dex */
public class View$OnClickListenerC1709c extends FrameLayout implements View.OnClickListener, PageActivity.InterfaceC1352a {

    /* renamed from: a */
    private final long f5482a;

    /* renamed from: b */
    private PageActivity f5483b;

    /* renamed from: c */
    private FrameLayout f5484c;

    /* renamed from: d */
    private EditText f5485d;

    /* renamed from: e */
    private View f5486e;

    /* renamed from: f */
    private TextView f5487f;

    /* renamed from: g */
    private InputMethodManager f5488g;

    /* renamed from: h */
    private long f5489h;

    /* renamed from: i */
    private View$OnClickListenerC1731i f5490i;

    /* renamed from: j */
    private String f5491j;

    /* renamed from: k */
    private boolean f5492k;

    /* renamed from: l */
    private View f5493l;

    /* renamed from: m */
    private List<C1726e> f5494m;

    /* renamed from: n */
    private View f5495n;

    /* renamed from: o */
    private C1715a f5496o;

    /* renamed from: p */
    private boolean f5497p;

    /* renamed from: q */
    private boolean f5498q;

    /* renamed from: r */
    private int f5499r;

    /* renamed from: s */
    private int f5500s;

    /* renamed from: t */
    private boolean f5501t;

    /* renamed from: u */
    private EnumC1718b f5502u;

    /* renamed from: v */
    private byte f5503v;

    /* renamed from: w */
    private View$OnClickListenerC1731i.InterfaceC1733a f5504w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.theme.c.c$b */
    /* loaded from: classes.dex */
    public enum EnumC1718b {
        EntryGo,
        Tag,
        Go
    }

    public View$OnClickListenerC1709c(Context context, int i, boolean z, List<C1726e> list) {
        super(context);
        this.f5482a = 1000L;
        this.f5489h = 0L;
        this.f5497p = true;
        this.f5498q = false;
        this.f5499r = -6710887;
        this.f5500s = -13421773;
        this.f5501t = false;
        this.f5503v = (byte) 0;
        this.f5504w = new View$OnClickListenerC1731i.InterfaceC1733a() { // from class: com.tsf.extend.theme.c.c.4
            @Override // com.tsf.extend.theme.p084c.View$OnClickListenerC1731i.InterfaceC1733a
            /* renamed from: a */
            public void mo7634a(String str) {
                View$OnClickListenerC1709c.this.f5491j = str;
                if (View$OnClickListenerC1709c.this.f5485d != null) {
                    View$OnClickListenerC1709c.this.f5485d.setText(str);
                    View$OnClickListenerC1709c.this.m7680z();
                }
                if (View$OnClickListenerC1709c.this.m7695k()) {
                    View$OnClickListenerC1709c.this.f5502u = EnumC1718b.Tag;
                    View$OnClickListenerC1709c.this.m7714a(str);
                }
            }
        };
        this.f5491j = m7724a(i, list);
        this.f5492k = z;
        this.f5494m = list;
        m7701h();
        m7703g();
    }

    /* renamed from: a */
    private String m7724a(int i, List<C1726e> list) {
        return (list == null || list.size() <= i || i < 0) ? "" : list.get(i).m7657a();
    }

    /* renamed from: g */
    private void m7703g() {
        if (this.f5492k) {
            this.f5503v = (byte) 1;
        }
    }

    /* renamed from: h */
    private void m7701h() {
        this.f5488g = (InputMethodManager) getContext().getSystemService("input_method");
        setPadding(0, getContext().getResources().getDimensionPixelSize(C1536f.C1539c.workspace_margin_top), 0, C1437p.m8615c(getContext()));
        this.f5484c = new FrameLayout(getContext());
        this.f5484c.setBackgroundColor(Color.parseColor("#EEEEEE"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int m8659a = C1430i.m8659a(36.0f) + C1430i.m8659a(8.0f) + C1430i.m8659a(8.0f);
        layoutParams.topMargin = m8659a;
        addView(this.f5484c, layoutParams);
        setupSearchBar(m8659a);
        addView(getSearchProgressView(), layoutParams);
        m7699i();
    }

    private View getSearchProgressView() {
        View inflate = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_search_progress, (ViewGroup) null);
        C1518d c1518d = new C1518d(getContext(), 3, 2);
        c1518d.m8340a(new int[]{12040119, 12040119, -4737097});
        ((ProgressBar) inflate.findViewById(C1536f.C1541e.theme_search_progress)).setIndeterminateDrawable(c1518d);
        this.f5495n = inflate;
        m7689q();
        return inflate;
    }

    /* renamed from: a */
    public void m7723a(View view) {
        this.f5484c.removeAllViews();
        this.f5484c.addView(view);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.theme_search_btn) {
            m7684v();
        } else if (id == C1536f.C1541e.theme_search_delete) {
            m7685u();
        }
    }

    private void setupSearchBar(int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_search_bar, (ViewGroup) null);
        addView(inflate, new FrameLayout.LayoutParams(-1, i));
        this.f5493l = inflate.findViewById(C1536f.C1541e.theme_search_icon);
        if (this.f5492k) {
            m7687s();
        } else {
            m7688r();
        }
        this.f5487f = (TextView) inflate.findViewById(C1536f.C1541e.theme_search_btn);
        this.f5487f.setOnClickListener(this);
        this.f5486e = inflate.findViewById(C1536f.C1541e.theme_search_delete);
        this.f5486e.setOnClickListener(this);
        this.f5486e.setVisibility(4);
        this.f5485d = (EditText) inflate.findViewById(C1536f.C1541e.search_edit);
        this.f5485d.addTextChangedListener(new TextWatcher() { // from class: com.tsf.extend.theme.c.c.1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (charSequence != null) {
                    if (charSequence.length() > 0) {
                        View$OnClickListenerC1709c.this.f5486e.setVisibility(0);
                        View$OnClickListenerC1709c.this.m7692n();
                        return;
                    }
                    View$OnClickListenerC1709c.this.f5486e.setVisibility(4);
                    View$OnClickListenerC1709c.this.m7691o();
                }
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        });
        this.f5485d.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.tsf.extend.theme.c.c.2
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                if (i2 == 4 || i2 == 6 || i2 == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
                    View$OnClickListenerC1709c.this.m7683w();
                    return true;
                }
                return true;
            }
        });
        this.f5485d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.tsf.extend.theme.c.c.3
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (z && View$OnClickListenerC1709c.this.f5498q) {
                    View$OnClickListenerC1709c.this.f5485d.setText("");
                    View$OnClickListenerC1709c.this.f5498q = false;
                    View$OnClickListenerC1709c.this.m7680z();
                }
            }
        });
        this.f5485d.setImeOptions(268435459);
        this.f5485d.setText(this.f5491j);
    }

    /* renamed from: i */
    private void m7699i() {
        if (this.f5492k || !m7695k()) {
            m7697j();
            m7693m();
            if (this.f5491j != null && this.f5491j.length() > 0) {
                m7692n();
                m7681y();
                this.f5498q = true;
                return;
            }
            return;
        }
        this.f5502u = EnumC1718b.EntryGo;
        m7714a(this.f5491j);
        m7691o();
    }

    /* renamed from: j */
    private void m7697j() {
        if (this.f5490i == null) {
            this.f5490i = new View$OnClickListenerC1731i(getContext());
            this.f5490i.setTagData(this.f5494m);
            this.f5490i.setOnTagClickListener(this.f5504w);
        }
        m7723a(this.f5490i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public boolean m7695k() {
        if (C1437p.m8613d(getContext())) {
            return true;
        }
        m7713a(getResources().getString(C1536f.C1543g.uplaod_wallpaper_dialog_no_network), 1);
        return false;
    }

    /* renamed from: l */
    private void m7694l() {
        if (this.f5490i != null) {
            this.f5490i.m7640c();
        }
    }

    /* renamed from: m */
    private void m7693m() {
        if (this.f5490i != null) {
            this.f5490i.m7639d();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public void m7692n() {
        this.f5497p = true;
        m7686t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public void m7691o() {
        this.f5497p = false;
        m7686t();
    }

    /* renamed from: p */
    private void m7690p() {
        if (this.f5495n != null) {
            this.f5495n.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public void m7689q() {
        if (this.f5495n != null) {
            this.f5495n.setVisibility(8);
        }
    }

    /* renamed from: r */
    private void m7688r() {
        if (this.f5493l != null) {
            this.f5493l.setVisibility(0);
        }
    }

    /* renamed from: s */
    private void m7687s() {
        if (this.f5493l != null) {
            this.f5493l.setVisibility(8);
        }
    }

    /* renamed from: t */
    private void m7686t() {
        if (this.f5497p) {
            this.f5487f.setText(C1536f.C1543g.search_btn_text_go);
        } else {
            this.f5487f.setText(C1536f.C1543g.search_btn_text_cancel);
        }
    }

    /* renamed from: u */
    private void m7685u() {
        this.f5485d.setText("");
        this.f5486e.setVisibility(4);
        C1707a.m7733a((byte) 4);
    }

    /* renamed from: v */
    private void m7684v() {
        if (this.f5497p) {
            m7683w();
            m7680z();
            return;
        }
        m7682x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void m7683w() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f5489h >= 1000) {
            this.f5489h = currentTimeMillis;
            if (m7695k()) {
                String obj = this.f5485d.getText().toString();
                this.f5491j = obj;
                if (!TextUtils.isEmpty(obj)) {
                    this.f5502u = EnumC1718b.Go;
                    m7714a(obj);
                }
                m7729A();
            }
        }
    }

    /* renamed from: x */
    private void m7682x() {
        m7726a((byte) 3);
        this.f5501t = true;
        this.f5483b.onBackPressed();
        m7729A();
    }

    /* renamed from: a */
    private void m7726a(byte b) {
        C1707a.m7732a(this.f5503v, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7714a(String str) {
        if (m7709b(str)) {
            String trim = str.trim();
            m7690p();
            m7688r();
            m7691o();
            m7707c(trim);
        }
    }

    /* renamed from: b */
    private boolean m7709b(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: y */
    private void m7681y() {
        if (this.f5485d != null) {
            this.f5485d.setTextColor(this.f5499r);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public void m7680z() {
        if (this.f5485d != null) {
            this.f5485d.setTextColor(this.f5500s);
        }
    }

    /* renamed from: A */
    private void m7729A() {
        if (this.f5485d != null) {
            this.f5488g.hideSoftInputFromWindow(this.f5485d.getWindowToken(), 0);
        }
    }

    /* renamed from: B */
    private void m7728B() {
        if (this.f5485d != null) {
            this.f5485d.clearFocus();
        }
    }

    public void setKeyword(String str) {
        this.f5491j = str;
    }

    public void setIsInitialPage(boolean z) {
        this.f5492k = z;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public boolean getPendingTransition() {
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public View getContent() {
        return this;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6535a(PageActivity pageActivity) {
        this.f5483b = pageActivity;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: a */
    public void mo6536a() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: b */
    public void mo6532b() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    public Bundle getResult() {
        return null;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: c */
    public void mo6531c() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: d */
    public void mo6530d() {
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: e */
    public boolean mo6529e() {
        if (!this.f5501t) {
            m7726a((byte) 1);
            return false;
        }
        return false;
    }

    @Override // com.tsf.extend.base.actstru.model.activi.PageActivity.InterfaceC1352a
    /* renamed from: f */
    public void mo6528f() {
        m7726a((byte) 2);
    }

    /* renamed from: c */
    private void m7707c(String str) {
        this.f5496o = new C1715a();
        C1894v.m7069h().m7101a(this.f5496o, AbstractC1386a.EnumC1397b.Refresh, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7722a(C1368a c1368a) {
        if (c1368a != null && c1368a.m8875a().size() > 0) {
            m7712b(c1368a);
            m7725a(c1368a.m8858g());
            this.f5498q = false;
            return;
        }
        m7727C();
        m7725a(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public void m7727C() {
        m7697j();
        m7694l();
        m7687s();
        this.f5492k = true;
    }

    /* renamed from: b */
    private void m7712b(C1368a c1368a) {
        View$OnClickListenerC1719d view$OnClickListenerC1719d = new View$OnClickListenerC1719d(getContext(), this.f5483b, this.f5491j);
        view$OnClickListenerC1719d.m7675a(c1368a, false);
        m7723a(view$OnClickListenerC1719d);
        this.f5492k = false;
        m7729A();
        m7728B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7713a(String str, int i) {
        Toast makeText = Toast.makeText(getContext(), str, i);
        makeText.setGravity(17, 0, 0);
        makeText.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7725a(int i) {
        byte b;
        byte b2 = 0;
        switch (this.f5502u) {
            case EntryGo:
                b = 2;
                break;
            case Tag:
                b = 0;
                b2 = 1;
                break;
            case Go:
                b = 0;
                b2 = 3;
                break;
            default:
                b = 0;
                break;
        }
        C1707a.m7730a(b, b2, this.f5491j, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.theme.c.c$a */
    /* loaded from: classes.dex */
    public class C1715a implements AbstractC1386a.InterfaceC1396a<C1368a> {
        private C1715a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.c.a.1
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC1709c.this.m7722a(c1368a);
                    View$OnClickListenerC1709c.this.m7689q();
                }
            });
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, final int i, C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.theme.c.c.a.2
                @Override // java.lang.Runnable
                public void run() {
                    View$OnClickListenerC1709c.this.m7689q();
                    if (i == 0) {
                        View$OnClickListenerC1709c.this.m7713a(View$OnClickListenerC1709c.this.getResources().getString(C1536f.C1543g.theme_search_network_error), 1);
                    } else {
                        View$OnClickListenerC1709c.this.m7727C();
                    }
                    View$OnClickListenerC1709c.this.m7725a(0);
                }
            });
        }
    }
}
