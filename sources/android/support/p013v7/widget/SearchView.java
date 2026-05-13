package android.support.p013v7.widget;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.p002v4.view.C0396g;
import android.support.p002v4.widget.AbstractC0492g;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.InterfaceC0609c;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* renamed from: android.support.v7.widget.SearchView */
/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements InterfaceC0609c {

    /* renamed from: a */
    static final C0710a f1901a;

    /* renamed from: c */
    private static final boolean f1902c;

    /* renamed from: A */
    private AbstractC0492g f1903A;

    /* renamed from: B */
    private boolean f1904B;

    /* renamed from: C */
    private CharSequence f1905C;

    /* renamed from: D */
    private boolean f1906D;

    /* renamed from: E */
    private boolean f1907E;

    /* renamed from: F */
    private int f1908F;

    /* renamed from: G */
    private boolean f1909G;

    /* renamed from: H */
    private CharSequence f1910H;

    /* renamed from: I */
    private CharSequence f1911I;

    /* renamed from: J */
    private boolean f1912J;

    /* renamed from: K */
    private int f1913K;

    /* renamed from: L */
    private SearchableInfo f1914L;

    /* renamed from: M */
    private Bundle f1915M;

    /* renamed from: N */
    private final C0742g f1916N;

    /* renamed from: O */
    private Runnable f1917O;

    /* renamed from: P */
    private final Runnable f1918P;

    /* renamed from: Q */
    private Runnable f1919Q;

    /* renamed from: R */
    private final WeakHashMap<String, Drawable.ConstantState> f1920R;

    /* renamed from: S */
    private final View.OnClickListener f1921S;

    /* renamed from: T */
    private final TextView.OnEditorActionListener f1922T;

    /* renamed from: U */
    private final AdapterView.OnItemClickListener f1923U;

    /* renamed from: V */
    private final AdapterView.OnItemSelectedListener f1924V;

    /* renamed from: W */
    private TextWatcher f1925W;

    /* renamed from: b */
    View.OnKeyListener f1926b;

    /* renamed from: d */
    private final SearchAutoComplete f1927d;

    /* renamed from: e */
    private final View f1928e;

    /* renamed from: f */
    private final View f1929f;

    /* renamed from: g */
    private final View f1930g;

    /* renamed from: h */
    private final ImageView f1931h;

    /* renamed from: i */
    private final ImageView f1932i;

    /* renamed from: j */
    private final ImageView f1933j;

    /* renamed from: k */
    private final ImageView f1934k;

    /* renamed from: l */
    private final View f1935l;

    /* renamed from: m */
    private final ImageView f1936m;

    /* renamed from: n */
    private final Drawable f1937n;

    /* renamed from: o */
    private final int f1938o;

    /* renamed from: p */
    private final int f1939p;

    /* renamed from: q */
    private final Intent f1940q;

    /* renamed from: r */
    private final Intent f1941r;

    /* renamed from: s */
    private final CharSequence f1942s;

    /* renamed from: t */
    private InterfaceC0712c f1943t;

    /* renamed from: u */
    private InterfaceC0711b f1944u;

    /* renamed from: v */
    private View.OnFocusChangeListener f1945v;

    /* renamed from: w */
    private InterfaceC0713d f1946w;

    /* renamed from: x */
    private View.OnClickListener f1947x;

    /* renamed from: y */
    private boolean f1948y;

    /* renamed from: z */
    private boolean f1949z;

    /* renamed from: android.support.v7.widget.SearchView$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0711b {
        /* renamed from: a */
        boolean m11384a();
    }

    /* renamed from: android.support.v7.widget.SearchView$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0712c {
        /* renamed from: a */
        boolean m11383a(String str);

        /* renamed from: b */
        boolean m11382b(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0713d {
        /* renamed from: a */
        boolean m11381a(int i);

        /* renamed from: b */
        boolean m11380b(int i);
    }

    static {
        f1902c = Build.VERSION.SDK_INT >= 8;
        f1901a = new C0710a();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0535a.C0536a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1917O = new Runnable() { // from class: android.support.v7.widget.SearchView.1
            @Override // java.lang.Runnable
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) SearchView.this.getContext().getSystemService("input_method");
                if (inputMethodManager != null) {
                    SearchView.f1901a.m11388a(inputMethodManager, SearchView.this, 0);
                }
            }
        };
        this.f1918P = new Runnable() { // from class: android.support.v7.widget.SearchView.5
            @Override // java.lang.Runnable
            public void run() {
                SearchView.this.m11405m();
            }
        };
        this.f1919Q = new Runnable() { // from class: android.support.v7.widget.SearchView.6
            @Override // java.lang.Runnable
            public void run() {
                if (SearchView.this.f1903A != null && (SearchView.this.f1903A instanceof View$OnClickListenerC0768u)) {
                    SearchView.this.f1903A.mo11089a((Cursor) null);
                }
            }
        };
        this.f1920R = new WeakHashMap<>();
        this.f1921S = new View.OnClickListener() { // from class: android.support.v7.widget.SearchView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (view == SearchView.this.f1931h) {
                    SearchView.this.m11396s();
                } else if (view == SearchView.this.f1933j) {
                    SearchView.this.m11397r();
                } else if (view == SearchView.this.f1932i) {
                    SearchView.this.m11399p();
                } else if (view == SearchView.this.f1934k) {
                    SearchView.this.m11395t();
                } else if (view == SearchView.this.f1927d) {
                    SearchView.this.m11393v();
                }
            }
        };
        this.f1926b = new View.OnKeyListener() { // from class: android.support.v7.widget.SearchView.11
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i2, KeyEvent keyEvent) {
                if (SearchView.this.f1914L == null) {
                    return false;
                }
                if (SearchView.this.f1927d.isPopupShowing() && SearchView.this.f1927d.getListSelection() != -1) {
                    return SearchView.this.m11438a(view, i2, keyEvent);
                }
                if (!SearchView.this.f1927d.m11390a() && C0396g.m12645a(keyEvent) && keyEvent.getAction() == 1 && i2 == 66) {
                    view.cancelLongPress();
                    SearchView.this.m11450a(0, (String) null, SearchView.this.f1927d.getText().toString());
                    return true;
                }
                return false;
            }
        };
        this.f1922T = new TextView.OnEditorActionListener() { // from class: android.support.v7.widget.SearchView.12
            @Override // android.widget.TextView.OnEditorActionListener
            public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.m11399p();
                return true;
            }
        };
        this.f1923U = new AdapterView.OnItemClickListener() { // from class: android.support.v7.widget.SearchView.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.m11451a(i2, 0, (String) null);
            }
        };
        this.f1924V = new AdapterView.OnItemSelectedListener() { // from class: android.support.v7.widget.SearchView.3
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                SearchView.this.m11452a(i2);
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        };
        this.f1925W = new TextWatcher() { // from class: android.support.v7.widget.SearchView.4
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView.this.m11425c(charSequence);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }
        };
        this.f1916N = C0742g.m11215a();
        C0725aa m11295a = C0725aa.m11295a(context, attributeSet, C0535a.C0546k.SearchView, i, 0);
        LayoutInflater.from(context).inflate(m11295a.m11284g(C0535a.C0546k.SearchView_layout, C0535a.C0543h.abc_search_view), (ViewGroup) this, true);
        this.f1927d = (SearchAutoComplete) findViewById(C0535a.C0541f.search_src_text);
        this.f1927d.setSearchView(this);
        this.f1928e = findViewById(C0535a.C0541f.search_edit_frame);
        this.f1929f = findViewById(C0535a.C0541f.search_plate);
        this.f1930g = findViewById(C0535a.C0541f.submit_area);
        this.f1931h = (ImageView) findViewById(C0535a.C0541f.search_button);
        this.f1932i = (ImageView) findViewById(C0535a.C0541f.search_go_btn);
        this.f1933j = (ImageView) findViewById(C0535a.C0541f.search_close_btn);
        this.f1934k = (ImageView) findViewById(C0535a.C0541f.search_voice_btn);
        this.f1936m = (ImageView) findViewById(C0535a.C0541f.search_mag_icon);
        this.f1929f.setBackgroundDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_queryBackground));
        this.f1930g.setBackgroundDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_submitBackground));
        this.f1931h.setImageDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_searchIcon));
        this.f1932i.setImageDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_goIcon));
        this.f1933j.setImageDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_closeIcon));
        this.f1934k.setImageDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_voiceIcon));
        this.f1936m.setImageDrawable(m11295a.m11300a(C0535a.C0546k.SearchView_searchIcon));
        this.f1937n = m11295a.m11300a(C0535a.C0546k.SearchView_searchHintIcon);
        this.f1938o = m11295a.m11284g(C0535a.C0546k.SearchView_suggestionRowLayout, C0535a.C0543h.abc_search_dropdown_item_icons_2line);
        this.f1939p = m11295a.m11284g(C0535a.C0546k.SearchView_commitIcon, 0);
        this.f1931h.setOnClickListener(this.f1921S);
        this.f1933j.setOnClickListener(this.f1921S);
        this.f1932i.setOnClickListener(this.f1921S);
        this.f1934k.setOnClickListener(this.f1921S);
        this.f1927d.setOnClickListener(this.f1921S);
        this.f1927d.addTextChangedListener(this.f1925W);
        this.f1927d.setOnEditorActionListener(this.f1922T);
        this.f1927d.setOnItemClickListener(this.f1923U);
        this.f1927d.setOnItemSelectedListener(this.f1924V);
        this.f1927d.setOnKeyListener(this.f1926b);
        this.f1927d.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: android.support.v7.widget.SearchView.7
            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z) {
                if (SearchView.this.f1945v != null) {
                    SearchView.this.f1945v.onFocusChange(SearchView.this, z);
                }
            }
        });
        setIconifiedByDefault(m11295a.m11297a(C0535a.C0546k.SearchView_iconifiedByDefault, true));
        int m11287e = m11295a.m11287e(C0535a.C0546k.SearchView_android_maxWidth, -1);
        if (m11287e != -1) {
            setMaxWidth(m11287e);
        }
        this.f1942s = m11295a.m11292c(C0535a.C0546k.SearchView_defaultQueryHint);
        this.f1905C = m11295a.m11292c(C0535a.C0546k.SearchView_queryHint);
        int m11298a = m11295a.m11298a(C0535a.C0546k.SearchView_android_imeOptions, -1);
        if (m11298a != -1) {
            setImeOptions(m11298a);
        }
        int m11298a2 = m11295a.m11298a(C0535a.C0546k.SearchView_android_inputType, -1);
        if (m11298a2 != -1) {
            setInputType(m11298a2);
        }
        setFocusable(m11295a.m11297a(C0535a.C0546k.SearchView_android_focusable, true));
        m11295a.m11301a();
        this.f1940q = new Intent("android.speech.action.WEB_SEARCH");
        this.f1940q.addFlags(268435456);
        this.f1940q.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.f1941r = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1941r.addFlags(268435456);
        this.f1935l = findViewById(this.f1927d.getDropDownAnchor());
        if (this.f1935l != null) {
            if (Build.VERSION.SDK_INT >= 11) {
                m11421e();
            } else {
                m11418f();
            }
        }
        m11434a(this.f1948y);
        m11403n();
    }

    @TargetApi(11)
    /* renamed from: e */
    private void m11421e() {
        this.f1935l.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: android.support.v7.widget.SearchView.8
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SearchView.this.m11394u();
            }
        });
    }

    /* renamed from: f */
    private void m11418f() {
        this.f1935l.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: android.support.v7.widget.SearchView.9
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                SearchView.this.m11394u();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1938o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1939p;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1914L = searchableInfo;
        if (this.f1914L != null) {
            if (f1902c) {
                m11401o();
            }
            m11403n();
        }
        this.f1909G = f1902c && m11416g();
        if (this.f1909G) {
            this.f1927d.setPrivateImeOptions("nm");
        }
        m11434a(m11427c());
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1915M = bundle;
    }

    public void setImeOptions(int i) {
        this.f1927d.setImeOptions(i);
    }

    public int getImeOptions() {
        return this.f1927d.getImeOptions();
    }

    public void setInputType(int i) {
        this.f1927d.setInputType(i);
    }

    public int getInputType() {
        return this.f1927d.getInputType();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (!this.f1907E && isFocusable()) {
            if (!m11427c()) {
                boolean requestFocus = this.f1927d.requestFocus(i, rect);
                if (requestFocus) {
                    m11434a(false);
                }
                return requestFocus;
            }
            return super.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f1907E = true;
        setImeVisibility(false);
        super.clearFocus();
        this.f1927d.clearFocus();
        this.f1907E = false;
    }

    public void setOnQueryTextListener(InterfaceC0712c interfaceC0712c) {
        this.f1943t = interfaceC0712c;
    }

    public void setOnCloseListener(InterfaceC0711b interfaceC0711b) {
        this.f1944u = interfaceC0711b;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1945v = onFocusChangeListener;
    }

    public void setOnSuggestionListener(InterfaceC0713d interfaceC0713d) {
        this.f1946w = interfaceC0713d;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1947x = onClickListener;
    }

    public CharSequence getQuery() {
        return this.f1927d.getText();
    }

    /* renamed from: a */
    public void m11436a(CharSequence charSequence, boolean z) {
        this.f1927d.setText(charSequence);
        if (charSequence != null) {
            this.f1927d.setSelection(this.f1927d.length());
            this.f1911I = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m11399p();
        }
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1905C = charSequence;
        m11403n();
    }

    public CharSequence getQueryHint() {
        if (this.f1905C != null) {
            return this.f1905C;
        }
        if (f1902c && this.f1914L != null && this.f1914L.getHintId() != 0) {
            return getContext().getText(this.f1914L.getHintId());
        }
        return this.f1942s;
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1948y != z) {
            this.f1948y = z;
            m11434a(z);
            m11403n();
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            m11397r();
        } else {
            m11396s();
        }
    }

    /* renamed from: c */
    public boolean m11427c() {
        return this.f1949z;
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1904B = z;
        m11434a(m11427c());
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1906D = z;
        if (this.f1903A instanceof View$OnClickListenerC0768u) {
            ((View$OnClickListenerC0768u) this.f1903A).m11093a(z ? 2 : 1);
        }
    }

    public void setSuggestionsAdapter(AbstractC0492g abstractC0492g) {
        this.f1903A = abstractC0492g;
        this.f1927d.setAdapter(this.f1903A);
    }

    public AbstractC0492g getSuggestionsAdapter() {
        return this.f1903A;
    }

    public void setMaxWidth(int i) {
        this.f1908F = i;
        requestLayout();
    }

    public int getMaxWidth() {
        return this.f1908F;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p013v7.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        if (m11427c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.f1908F > 0) {
                    size = Math.min(this.f1908F, size);
                    break;
                } else {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                }
            case 0:
                if (this.f1908F <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.f1908F;
                    break;
                }
            case 1073741824:
                if (this.f1908F > 0) {
                    size = Math.min(this.f1908F, size);
                    break;
                }
                break;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0535a.C0539d.abc_search_view_preferred_width);
    }

    /* renamed from: a */
    private void m11434a(boolean z) {
        int i = 8;
        this.f1949z = z;
        int i2 = z ? 0 : 8;
        boolean z2 = !TextUtils.isEmpty(this.f1927d.getText());
        this.f1931h.setVisibility(i2);
        m11428b(z2);
        this.f1928e.setVisibility(z ? 8 : 0);
        if (this.f1936m.getDrawable() != null && !this.f1948y) {
            i = 0;
        }
        this.f1936m.setVisibility(i);
        m11409k();
        m11424c(z2 ? false : true);
        m11412i();
    }

    @TargetApi(8)
    /* renamed from: g */
    private boolean m11416g() {
        if (this.f1914L == null || !this.f1914L.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1914L.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1940q;
        } else if (this.f1914L.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1941r;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    /* renamed from: h */
    private boolean m11414h() {
        return (this.f1904B || this.f1909G) && !m11427c();
    }

    /* renamed from: b */
    private void m11428b(boolean z) {
        int i = 8;
        if (this.f1904B && m11414h() && hasFocus() && (z || !this.f1909G)) {
            i = 0;
        }
        this.f1932i.setVisibility(i);
    }

    /* renamed from: i */
    private void m11412i() {
        int i = 8;
        if (m11414h() && (this.f1932i.getVisibility() == 0 || this.f1934k.getVisibility() == 0)) {
            i = 0;
        }
        this.f1930g.setVisibility(i);
    }

    /* renamed from: k */
    private void m11409k() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1927d.getText());
        if (!z2 && (!this.f1948y || this.f1912J)) {
            z = false;
        }
        this.f1933j.setVisibility(z ? 0 : 8);
        Drawable drawable = this.f1933j.getDrawable();
        if (drawable != null) {
            drawable.setState(z2 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    /* renamed from: l */
    private void m11407l() {
        post(this.f1918P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public void m11405m() {
        int[] iArr = this.f1927d.hasFocus() ? FOCUSED_STATE_SET : EMPTY_STATE_SET;
        Drawable background = this.f1929f.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1930g.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1918P);
        post(this.f1919Q);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImeVisibility(boolean z) {
        if (z) {
            post(this.f1917O);
            return;
        }
        removeCallbacks(this.f1917O);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11437a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11438a(View view, int i, KeyEvent keyEvent) {
        if (this.f1914L != null && this.f1903A != null && keyEvent.getAction() == 0 && C0396g.m12645a(keyEvent)) {
            if (i == 66 || i == 84 || i == 61) {
                return m11451a(this.f1927d.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                this.f1927d.setSelection(i == 21 ? 0 : this.f1927d.length());
                this.f1927d.setListSelection(0);
                this.f1927d.clearListSelection();
                f1901a.m11386a(this.f1927d, true);
                return true;
            }
            if (i != 19 || this.f1927d.getListSelection() != 0) {
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    private CharSequence m11429b(CharSequence charSequence) {
        if (this.f1948y && this.f1937n != null) {
            int textSize = (int) (this.f1927d.getTextSize() * 1.25d);
            this.f1937n.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f1937n), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    /* renamed from: n */
    private void m11403n() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1927d;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m11429b(queryHint));
    }

    @TargetApi(8)
    /* renamed from: o */
    private void m11401o() {
        this.f1927d.setThreshold(this.f1914L.getSuggestThreshold());
        this.f1927d.setImeOptions(this.f1914L.getImeOptions());
        int inputType = this.f1914L.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1914L.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1927d.setInputType(inputType);
        if (this.f1903A != null) {
            this.f1903A.mo11089a((Cursor) null);
        }
        if (this.f1914L.getSuggestAuthority() != null) {
            this.f1903A = new View$OnClickListenerC0768u(getContext(), this, this.f1914L, this.f1920R);
            this.f1927d.setAdapter(this.f1903A);
            ((View$OnClickListenerC0768u) this.f1903A).m11093a(this.f1906D ? 2 : 1);
        }
    }

    /* renamed from: c */
    private void m11424c(boolean z) {
        int i;
        if (this.f1909G && !m11427c() && z) {
            i = 0;
            this.f1932i.setVisibility(8);
        } else {
            i = 8;
        }
        this.f1934k.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m11425c(CharSequence charSequence) {
        Editable text = this.f1927d.getText();
        this.f1911I = text;
        boolean z = !TextUtils.isEmpty(text);
        m11428b(z);
        m11424c(z ? false : true);
        m11409k();
        m11412i();
        if (this.f1943t != null && !TextUtils.equals(charSequence, this.f1910H)) {
            this.f1943t.m11382b(charSequence.toString());
        }
        this.f1910H = charSequence.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public void m11399p() {
        Editable text = this.f1927d.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1943t == null || !this.f1943t.m11383a(text.toString())) {
                if (this.f1914L != null) {
                    m11450a(0, (String) null, text.toString());
                }
                setImeVisibility(false);
                m11398q();
            }
        }
    }

    /* renamed from: q */
    private void m11398q() {
        this.f1927d.dismissDropDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m11397r() {
        if (TextUtils.isEmpty(this.f1927d.getText())) {
            if (this.f1948y) {
                if (this.f1944u == null || !this.f1944u.m11384a()) {
                    clearFocus();
                    m11434a(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f1927d.setText("");
        this.f1927d.requestFocus();
        setImeVisibility(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public void m11396s() {
        m11434a(false);
        this.f1927d.requestFocus();
        setImeVisibility(true);
        if (this.f1947x != null) {
            this.f1947x.onClick(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(8)
    /* renamed from: t */
    public void m11395t() {
        if (this.f1914L != null) {
            SearchableInfo searchableInfo = this.f1914L;
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m11447a(this.f1940q, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m11431b(this.f1941r, searchableInfo));
                }
            } catch (ActivityNotFoundException e) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: d */
    void m11423d() {
        m11434a(m11427c());
        m11407l();
        if (this.f1927d.hasFocus()) {
            m11393v();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m11407l();
    }

    @Override // android.support.p013v7.view.InterfaceC0609c
    /* renamed from: b */
    public void mo11433b() {
        m11436a("", false);
        clearFocus();
        m11434a(true);
        this.f1927d.setImeOptions(this.f1913K);
        this.f1912J = false;
    }

    @Override // android.support.p013v7.view.InterfaceC0609c
    /* renamed from: a */
    public void mo11453a() {
        if (!this.f1912J) {
            this.f1912J = true;
            this.f1913K = this.f1927d.getImeOptions();
            this.f1927d.setImeOptions(this.f1913K | 33554432);
            this.f1927d.setText("");
            setIconified(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: android.support.v7.widget.SearchView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };

        /* renamed from: a */
        boolean f1962a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f1962a = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1962a));
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1962a + "}";
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1962a = m11427c();
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        m11434a(savedState.f1962a);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m11394u() {
        int i;
        int i2;
        if (this.f1935l.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1929f.getPaddingLeft();
            Rect rect = new Rect();
            boolean m11259a = C0730ad.m11259a(this);
            if (this.f1948y) {
                i = resources.getDimensionPixelSize(C0535a.C0539d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(C0535a.C0539d.abc_dropdownitem_icon_width);
            } else {
                i = 0;
            }
            this.f1927d.getDropDownBackground().getPadding(rect);
            if (m11259a) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f1927d.setDropDownHorizontalOffset(i2);
            this.f1927d.setDropDownWidth((i + ((this.f1935l.getWidth() + rect.left) + rect.right)) - paddingLeft);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11451a(int i, int i2, String str) {
        if (this.f1946w == null || !this.f1946w.m11380b(i)) {
            m11432b(i, 0, null);
            setImeVisibility(false);
            m11398q();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m11452a(int i) {
        if (this.f1946w == null || !this.f1946w.m11381a(i)) {
            m11420e(i);
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m11420e(int i) {
        Editable text = this.f1927d.getText();
        Cursor mo12266a = this.f1903A.mo12266a();
        if (mo12266a != null) {
            if (mo12266a.moveToPosition(i)) {
                CharSequence mo11075c = this.f1903A.mo11075c(mo12266a);
                if (mo11075c != null) {
                    setQuery(mo11075c);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    /* renamed from: b */
    private boolean m11432b(int i, int i2, String str) {
        Cursor mo12266a = this.f1903A.mo12266a();
        if (mo12266a == null || !mo12266a.moveToPosition(i)) {
            return false;
        }
        m11448a(m11446a(mo12266a, i2, str));
        return true;
    }

    /* renamed from: a */
    private void m11448a(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.f1927d.setText(charSequence);
        this.f1927d.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m11450a(int i, String str, String str2) {
        getContext().startActivity(m11435a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* renamed from: a */
    private Intent m11435a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1911I);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f1915M != null) {
            intent.putExtra("app_data", this.f1915M);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        if (f1902c) {
            intent.setComponent(this.f1914L.getSearchActivity());
        }
        return intent;
    }

    @TargetApi(8)
    /* renamed from: a */
    private Intent m11447a(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    @TargetApi(8)
    /* renamed from: b */
    private Intent m11431b(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        if (this.f1915M != null) {
            bundle.putParcelable("app_data", this.f1915M);
        }
        Intent intent3 = new Intent(intent);
        String str4 = "free_form";
        if (Build.VERSION.SDK_INT < 8) {
            str = null;
            str2 = null;
            str3 = "free_form";
            i = 1;
        } else {
            Resources resources = getResources();
            if (searchableInfo.getVoiceLanguageModeId() != 0) {
                str4 = resources.getString(searchableInfo.getVoiceLanguageModeId());
            }
            str2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
            str = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
            if (searchableInfo.getVoiceMaxResults() == 0) {
                str3 = str4;
                i = 1;
            } else {
                str3 = str4;
                i = searchableInfo.getVoiceMaxResults();
            }
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str3);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: a */
    private Intent m11446a(Cursor cursor, int i, String str) {
        int i2;
        String m11087a;
        try {
            String m11087a2 = View$OnClickListenerC0768u.m11087a(cursor, "suggest_intent_action");
            if (m11087a2 == null && Build.VERSION.SDK_INT >= 8) {
                m11087a2 = this.f1914L.getSuggestIntentAction();
            }
            if (m11087a2 == null) {
                m11087a2 = "android.intent.action.SEARCH";
            }
            String m11087a3 = View$OnClickListenerC0768u.m11087a(cursor, "suggest_intent_data");
            if (f1902c && m11087a3 == null) {
                m11087a3 = this.f1914L.getSuggestIntentData();
            }
            if (m11087a3 != null && (m11087a = View$OnClickListenerC0768u.m11087a(cursor, "suggest_intent_data_id")) != null) {
                m11087a3 = m11087a3 + "/" + Uri.encode(m11087a);
            }
            return m11435a(m11087a2, m11087a3 == null ? null : Uri.parse(m11087a3), View$OnClickListenerC0768u.m11087a(cursor, "suggest_intent_extra_data"), View$OnClickListenerC0768u.m11087a(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException e2) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m11393v() {
        f1901a.m11387a(this.f1927d);
        f1901a.m11385b(this.f1927d);
    }

    /* renamed from: a */
    static boolean m11449a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {

        /* renamed from: a */
        private int f1963a;

        /* renamed from: b */
        private SearchView f1964b;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0535a.C0536a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1963a = getThreshold();
        }

        void setSearchView(SearchView searchView) {
            this.f1964b = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1963a = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public boolean m11390a() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1964b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.m11449a(getContext())) {
                    SearchView.f1901a.m11386a(this, true);
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1964b.m11423d();
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f1963a <= 0 || super.enoughToFilter();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                        return true;
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1964b.clearFocus();
                        this.f1964b.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.widget.SearchView$a */
    /* loaded from: classes.dex */
    public static class C0710a {

        /* renamed from: a */
        private Method f1965a;

        /* renamed from: b */
        private Method f1966b;

        /* renamed from: c */
        private Method f1967c;

        /* renamed from: d */
        private Method f1968d;

        C0710a() {
            try {
                this.f1965a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1965a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f1966b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1966b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f1967c = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f1967c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.f1968d = InputMethodManager.class.getMethod("showSoftInputUnchecked", Integer.TYPE, ResultReceiver.class);
                this.f1968d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        /* renamed from: a */
        void m11387a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1965a != null) {
                try {
                    this.f1965a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: b */
        void m11385b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1966b != null) {
                try {
                    this.f1966b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: a */
        void m11386a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f1967c != null) {
                try {
                    this.f1967c.invoke(autoCompleteTextView, Boolean.valueOf(z));
                } catch (Exception e) {
                }
            }
        }

        /* renamed from: a */
        void m11388a(InputMethodManager inputMethodManager, View view, int i) {
            if (this.f1968d != null) {
                try {
                    this.f1968d.invoke(inputMethodManager, Integer.valueOf(i), null);
                    return;
                } catch (Exception e) {
                }
            }
            inputMethodManager.showSoftInput(view, i);
        }
    }
}
