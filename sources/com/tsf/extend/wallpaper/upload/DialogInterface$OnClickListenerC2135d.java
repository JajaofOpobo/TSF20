package com.tsf.extend.wallpaper.upload;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogInterfaceC1526e;
import com.tsf.extend.base.p080j.C1421b;
import com.tsf.extend.base.p080j.C1429h;
import com.tsf.extend.base.p080j.C1430i;
import com.tsf.extend.base.p080j.C1436o;
import com.tsf.extend.wallpaper.C2055ag;
import java.text.DecimalFormat;
/* renamed from: com.tsf.extend.wallpaper.upload.d */
/* loaded from: classes.dex */
public class DialogInterface$OnClickListenerC2135d extends FrameLayout implements DialogInterface.OnClickListener, TextWatcher, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private InputMethodManager f7013a;

    /* renamed from: b */
    private UploadWallpaperActivity f7014b;

    /* renamed from: c */
    private C2134c f7015c;

    /* renamed from: d */
    private FrameLayout f7016d;

    /* renamed from: e */
    private TextView f7017e;

    /* renamed from: f */
    private TextView f7018f;

    /* renamed from: g */
    private TextView f7019g;

    /* renamed from: h */
    private EditText f7020h;

    /* renamed from: i */
    private Button f7021i;

    /* renamed from: j */
    private ImageButton f7022j;

    /* renamed from: k */
    private DialogInterfaceC1526e f7023k;

    /* renamed from: l */
    private int f7024l;

    /* renamed from: m */
    private String f7025m;

    /* renamed from: n */
    private int f7026n;

    public DialogInterface$OnClickListenerC2135d(Context context) {
        super(context);
        this.f7024l = 0;
        this.f7025m = null;
        this.f7026n = 2;
    }

    /* renamed from: a */
    public void m6278a(UploadWallpaperActivity uploadWallpaperActivity, C2134c c2134c) {
        this.f7015c = c2134c;
        this.f7014b = uploadWallpaperActivity;
    }

    /* renamed from: a */
    public void m6280a() {
        this.f7024l = C1430i.m8659a(16.0f);
        setPadding(this.f7024l, 0, this.f7024l, 0);
        setOnClickListener(this);
        this.f7018f = new TextView(getContext());
        this.f7018f.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f7018f.setTextSize(20.0f);
        this.f7018f.setTextColor(Color.rgb(255, 255, 255));
        this.f7018f.setText(C1536f.C1543g.upload_wallpaper_submitpage_titleTip);
        addView(this.f7018f);
        this.f7017e = new TextView(getContext());
        this.f7017e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f7017e.setTextSize(13.0f);
        this.f7017e.setText(C1536f.C1543g.upload_wallpaper_submitpage_tip);
        this.f7017e.setTextColor(Color.rgb(255, 255, 255));
        addView(this.f7017e);
        m6271c();
        this.f7019g = new TextView(getContext());
        this.f7019g.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f7019g.setTextSize(13.0f);
        this.f7019g.setTextColor(Color.argb(178, 255, 255, 255));
        this.f7019g.setText(C1536f.C1543g.upload_wallpaper_submitpage_copyright);
        addView(this.f7019g);
        m6267e();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f7013a = (InputMethodManager) getContext().getSystemService("input_method");
    }

    /* renamed from: b */
    public void m6274b() {
        postDelayed(new Runnable() { // from class: com.tsf.extend.wallpaper.upload.d.1
            @Override // java.lang.Runnable
            public void run() {
                DialogInterface$OnClickListenerC2135d.this.f7020h.requestFocus();
                DialogInterface$OnClickListenerC2135d.this.f7013a.showSoftInput(DialogInterface$OnClickListenerC2135d.this.f7020h, 0);
            }
        }, 300L);
    }

    /* renamed from: c */
    private void m6271c() {
        this.f7016d = new FrameLayout(getContext());
        this.f7016d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f7016d.setBackgroundResource(C1536f.C1540d.upload_wallpaper_edit_bk);
        this.f7020h = new EditText(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C1430i.m8659a(272.0f), -1);
        layoutParams.topMargin = C1430i.m8659a(5.0f);
        this.f7020h.setLayoutParams(layoutParams);
        this.f7020h.setTextSize(16.0f);
        this.f7020h.setBackgroundColor(0);
        this.f7020h.setTextColor(Color.rgb(255, 255, 255));
        this.f7020h.setGravity(16);
        this.f7020h.setSingleLine();
        this.f7020h.addTextChangedListener(this);
        this.f7020h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        this.f7016d.addView(this.f7020h);
        int m8659a = C1430i.m8659a(19.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m8659a, m8659a);
        layoutParams2.topMargin = C1430i.m8659a(14.0f);
        this.f7022j = new ImageButton(getContext());
        this.f7022j.setLayoutParams(layoutParams2);
        this.f7022j.setBackgroundResource(C1536f.C1540d.icon_search_delete);
        this.f7022j.setOnClickListener(this);
        this.f7016d.addView(this.f7022j);
        addView(this.f7016d);
        m6269d();
    }

    /* renamed from: d */
    private void m6269d() {
        String m6568b = C2055ag.m6572a().m6568b();
        if (m6568b == null) {
            String m6564e = C2055ag.m6572a().m6564e();
            if (TextUtils.isEmpty(m6564e)) {
                m6564e = C1429h.m8661a(getContext());
            }
            if (!TextUtils.isEmpty(m6564e)) {
                String trim = m6564e.trim();
                int indexOf = trim.indexOf("@");
                String substring = indexOf != -1 ? trim.substring(0, indexOf) : m6568b;
                this.f7020h.setText(substring);
                this.f7025m = substring;
                this.f7026n = 1;
                return;
            }
            return;
        }
        this.f7020h.setText(m6568b);
        this.f7025m = m6568b;
        this.f7026n = 3;
    }

    /* renamed from: e */
    private void m6267e() {
        this.f7021i = new Button(getContext());
        this.f7021i.setText(C1536f.C1543g.wallpaper_upload_text);
        this.f7021i.setTextColor(Color.rgb(255, 255, 255));
        this.f7021i.setTextSize(16.0f);
        this.f7021i.setLayoutParams(new ViewGroup.LayoutParams(-1, C1430i.m8659a(48.0f)));
        C1421b.m8699a(this.f7021i, getResources().getDrawable(C1536f.C1540d.upload_wallpaper_submit_btn));
        addView(this.f7021i);
        this.f7021i.setOnClickListener(this);
        if (this.f7020h != null) {
            this.f7021i.setEnabled(!TextUtils.isEmpty(this.f7020h.getText()));
        }
    }

    /* renamed from: f */
    private void m6266f() {
        if (this.f7023k != null) {
            try {
                this.f7023k.dismiss();
            } catch (Exception e) {
            }
            this.f7023k = null;
        }
    }

    /* renamed from: a */
    public static String m6279a(long j) {
        return new DecimalFormat("0.00").format(j / 1048576.0d);
    }

    /* renamed from: a */
    private void m6276a(String str) {
        int i = 0;
        String str2 = "";
        if ("1".equals(str)) {
            str2 = getContext().getString(C1536f.C1543g.uplaod_wallpaper_dialog_no_network);
            i = C1536f.C1543g.uplaod_wallpaper_dialog_check_network;
        } else if ("2".equals(str)) {
            str2 = getContext().getString(C1536f.C1543g.uplaod_wallpaper_dialog_mobile_network);
            long m6373a = this.f7014b.m6373a();
            if (m6373a != -1) {
                str2 = String.format(str2, m6279a(m6373a));
            }
            i = C1536f.C1543g.uplaod_wallpaper_dialog_ok;
        }
        m6266f();
        this.f7023k = new DialogInterfaceC1526e.C1532a(getContext()).m8299a(str2).m8298b(C1536f.C1543g.uplaod_wallpaper_dialog_cancel, this).m8300a(i, this).m8302a();
        this.f7023k.m8315a(str);
        try {
            this.f7023k.m8314a(true);
        } catch (Exception e) {
        }
    }

    /* renamed from: g */
    private void m6265g() {
        m6276a("2");
    }

    /* renamed from: h */
    private void m6264h() {
        m6276a("1");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f7023k.dismiss();
        String m8307c = this.f7023k.m8307c();
        this.f7023k = null;
        if ("1".equals(m8307c)) {
            if (i == -1) {
            }
        } else if ("2".equals(m8307c) && i == -1) {
            this.f7014b.m6367b();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f7021i != null) {
            this.f7021i.setEnabled(!TextUtils.isEmpty(charSequence));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f7021i) {
            if (this.f7020h.getText() != null) {
                String trim = this.f7020h.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    this.f7020h.setText("");
                    return;
                }
                this.f7014b.m6368a(trim);
                C2055ag.m6572a().m6570a(trim);
                if (!trim.equals(this.f7025m)) {
                }
                int m8626a = C1436o.m8626a(getContext());
                if (m8626a != 2 && m8626a != 0) {
                    if (this.f7014b.m6373a() < 1048576) {
                        this.f7014b.m6367b();
                    } else {
                        m6265g();
                    }
                } else if (m8626a == 0) {
                    m6264h();
                } else {
                    Toast.makeText(this.f7014b, C1536f.C1543g.uplaod_wallpaper_submit_tip, 0).show();
                    this.f7014b.m6367b();
                }
            }
        } else if (view == this.f7022j) {
            if (this.f7020h != null) {
                this.f7020h.setText("");
            }
            this.f7021i.setEnabled(false);
        } else if (view == this && this.f7013a != null && this.f7020h != null) {
            this.f7013a.hideSoftInputFromWindow(this.f7020h.getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = getHeight();
        if (height > 0) {
            int m8659a = C1430i.m8659a(10.0f);
            int i = 0;
            if (Build.VERSION.SDK_INT >= 11) {
                i = this.f7015c.getCategoryRealY();
            }
            int i2 = i <= 0 ? m8659a * 10 : i;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f7018f.getLayoutParams();
            layoutParams.topMargin = i2;
            this.f7018f.setLayoutParams(layoutParams);
            int height2 = i2 + this.f7018f.getHeight() + C1430i.m8659a(6.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f7017e.getLayoutParams();
            layoutParams2.topMargin = height2;
            this.f7017e.setLayoutParams(layoutParams2);
            int height3 = height2 + this.f7017e.getHeight() + (m8659a * 2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f7016d.getLayoutParams();
            layoutParams3.topMargin = height3;
            this.f7016d.setLayoutParams(layoutParams3);
            int height4 = (height - this.f7021i.getHeight()) - this.f7024l;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f7021i.getLayoutParams();
            layoutParams4.topMargin = height4;
            this.f7021i.setLayoutParams(layoutParams4);
            int height5 = (height4 - this.f7019g.getHeight()) - this.f7024l;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f7019g.getLayoutParams();
            layoutParams5.topMargin = height5;
            this.f7019g.setLayoutParams(layoutParams5);
            int width = (this.f7016d.getWidth() - this.f7024l) - this.f7022j.getWidth();
            if (Build.VERSION.SDK_INT >= 11) {
                this.f7022j.setTranslationX(width);
            }
            C1421b.m8698a(this, this);
        }
    }

    /* renamed from: a */
    public void m6275a(boolean z) {
        if (!z && this.f7020h != null) {
            this.f7013a.hideSoftInputFromWindow(this.f7020h.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public void m6272b(boolean z) {
        if (z && this.f7020h != null) {
            if (TextUtils.isEmpty(this.f7020h.getText().toString())) {
                m6274b();
                return;
            }
            this.f7020h.setSelection(this.f7020h.getText().length());
            this.f7020h.requestFocus();
        }
    }

    /* renamed from: c */
    public void m6270c(boolean z) {
    }

    /* renamed from: d */
    public void m6268d(boolean z) {
    }
}
