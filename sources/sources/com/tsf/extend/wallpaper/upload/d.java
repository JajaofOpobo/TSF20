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
import com.tsf.extend.base.j.h;
import com.tsf.extend.base.j.i;
import com.tsf.extend.base.j.o;
import com.tsf.extend.e;
import com.tsf.extend.f;
import com.tsf.extend.wallpaper.ag;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class d extends FrameLayout implements DialogInterface.OnClickListener, TextWatcher, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private InputMethodManager a;
    private UploadWallpaperActivity b;
    private c c;
    private FrameLayout d;
    private TextView e;
    private TextView f;
    private TextView g;
    private EditText h;
    private Button i;
    private ImageButton j;
    private e k;
    private int l;
    private String m;
    private int n;

    public d(Context context) {
        super(context);
        this.l = 0;
        this.m = null;
        this.n = 2;
    }

    public void a(UploadWallpaperActivity uploadWallpaperActivity, c cVar) {
        this.c = cVar;
        this.b = uploadWallpaperActivity;
    }

    public void a() {
        this.l = i.a(16.0f);
        setPadding(this.l, 0, this.l, 0);
        setOnClickListener(this);
        this.f = new TextView(getContext());
        this.f.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.f.setTextSize(20.0f);
        this.f.setTextColor(Color.rgb(255, 255, 255));
        this.f.setText(f.g.upload_wallpaper_submitpage_titleTip);
        addView(this.f);
        this.e = new TextView(getContext());
        this.e.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.e.setTextSize(13.0f);
        this.e.setText(f.g.upload_wallpaper_submitpage_tip);
        this.e.setTextColor(Color.rgb(255, 255, 255));
        addView(this.e);
        c();
        this.g = new TextView(getContext());
        this.g.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.g.setTextSize(13.0f);
        this.g.setTextColor(Color.argb(178, 255, 255, 255));
        this.g.setText(f.g.upload_wallpaper_submitpage_copyright);
        addView(this.g);
        e();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.a = (InputMethodManager) getContext().getSystemService("input_method");
    }

    public void b() {
        postDelayed(new Runnable() { // from class: com.tsf.extend.wallpaper.upload.d.1
            @Override // java.lang.Runnable
            public void run() {
                d.this.h.requestFocus();
                d.this.a.showSoftInput(d.this.h, 0);
            }
        }, 300L);
    }

    private void c() {
        this.d = new FrameLayout(getContext());
        this.d.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d.setBackgroundResource(f.d.upload_wallpaper_edit_bk);
        this.h = new EditText(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i.a(272.0f), -1);
        layoutParams.topMargin = i.a(5.0f);
        this.h.setLayoutParams(layoutParams);
        this.h.setTextSize(16.0f);
        this.h.setBackgroundColor(0);
        this.h.setTextColor(Color.rgb(255, 255, 255));
        this.h.setGravity(16);
        this.h.setSingleLine();
        this.h.addTextChangedListener(this);
        this.h.setFilters(new InputFilter[]{new InputFilter.LengthFilter(30)});
        this.d.addView(this.h);
        int iA = i.a(19.0f);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iA, iA);
        layoutParams2.topMargin = i.a(14.0f);
        this.j = new ImageButton(getContext());
        this.j.setLayoutParams(layoutParams2);
        this.j.setBackgroundResource(f.d.icon_search_delete);
        this.j.setOnClickListener(this);
        this.d.addView(this.j);
        addView(this.d);
        d();
    }

    private void d() {
        String strB = ag.a().b();
        if (strB == null) {
            String strE = ag.a().e();
            if (TextUtils.isEmpty(strE)) {
                strE = h.a(getContext());
            }
            if (!TextUtils.isEmpty(strE)) {
                String strTrim = strE.trim();
                int iIndexOf = strTrim.indexOf("@");
                String strSubstring = iIndexOf != -1 ? strTrim.substring(0, iIndexOf) : strB;
                this.h.setText(strSubstring);
                this.m = strSubstring;
                this.n = 1;
                return;
            }
            return;
        }
        this.h.setText(strB);
        this.m = strB;
        this.n = 3;
    }

    private void e() {
        this.i = new Button(getContext());
        this.i.setText(f.g.wallpaper_upload_text);
        this.i.setTextColor(Color.rgb(255, 255, 255));
        this.i.setTextSize(16.0f);
        this.i.setLayoutParams(new ViewGroup.LayoutParams(-1, i.a(48.0f)));
        com.tsf.extend.base.j.b.a(this.i, getResources().getDrawable(f.d.upload_wallpaper_submit_btn));
        addView(this.i);
        this.i.setOnClickListener(this);
        if (this.h != null) {
            this.i.setEnabled(!TextUtils.isEmpty(this.h.getText()));
        }
    }

    private void f() {
        if (this.k != null) {
            try {
                this.k.dismiss();
            } catch (Exception e) {
            }
            this.k = null;
        }
    }

    public static String a(long j) {
        return new DecimalFormat("0.00").format(j / 1048576.0d);
    }

    private void a(String str) {
        int i = 0;
        String string = "";
        if ("1".equals(str)) {
            string = getContext().getString(f.g.uplaod_wallpaper_dialog_no_network);
            i = f.g.uplaod_wallpaper_dialog_check_network;
        } else if ("2".equals(str)) {
            string = getContext().getString(f.g.uplaod_wallpaper_dialog_mobile_network);
            long jA = this.b.a();
            if (jA != -1) {
                string = String.format(string, a(jA));
            }
            i = f.g.uplaod_wallpaper_dialog_ok;
        }
        f();
        this.k = new e.a(getContext()).a(string).b(f.g.uplaod_wallpaper_dialog_cancel, this).a(i, this).a();
        this.k.a(str);
        try {
            this.k.a(true);
        } catch (Exception e) {
        }
    }

    private void g() {
        a("2");
    }

    private void h() {
        a("1");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.k.dismiss();
        String strC = this.k.c();
        this.k = null;
        if ("1".equals(strC)) {
            if (i == -1) {
            }
        } else if ("2".equals(strC) && i == -1) {
            this.b.b();
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.i != null) {
            this.i.setEnabled(!TextUtils.isEmpty(charSequence));
        }
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.i) {
            if (this.h.getText() != null) {
                String strTrim = this.h.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim)) {
                    this.h.setText("");
                    return;
                }
                this.b.a(strTrim);
                ag.a().a(strTrim);
                if (!strTrim.equals(this.m)) {
                }
                int iA = o.a(getContext());
                if (iA != 2 && iA != 0) {
                    if (this.b.a() < 1048576) {
                        this.b.b();
                        return;
                    } else {
                        g();
                        return;
                    }
                }
                if (iA == 0) {
                    h();
                    return;
                } else {
                    Toast.makeText(this.b, f.g.uplaod_wallpaper_submit_tip, 0).show();
                    this.b.b();
                    return;
                }
            }
            return;
        }
        if (view == this.j) {
            if (this.h != null) {
                this.h.setText("");
            }
            this.i.setEnabled(false);
        } else if (view == this && this.a != null && this.h != null) {
            this.a.hideSoftInputFromWindow(this.h.getWindowToken(), 0);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int height = getHeight();
        if (height > 0) {
            int iA = i.a(10.0f);
            int categoryRealY = 0;
            if (Build.VERSION.SDK_INT >= 11) {
                categoryRealY = this.c.getCategoryRealY();
            }
            int i = categoryRealY <= 0 ? iA * 10 : categoryRealY;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.topMargin = i;
            this.f.setLayoutParams(layoutParams);
            int height2 = i + this.f.getHeight() + i.a(6.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            layoutParams2.topMargin = height2;
            this.e.setLayoutParams(layoutParams2);
            int height3 = height2 + this.e.getHeight() + (iA * 2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
            layoutParams3.topMargin = height3;
            this.d.setLayoutParams(layoutParams3);
            int height4 = (height - this.i.getHeight()) - this.l;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams4.topMargin = height4;
            this.i.setLayoutParams(layoutParams4);
            int height5 = (height4 - this.g.getHeight()) - this.l;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams5.topMargin = height5;
            this.g.setLayoutParams(layoutParams5);
            int width = (this.d.getWidth() - this.l) - this.j.getWidth();
            if (Build.VERSION.SDK_INT >= 11) {
                this.j.setTranslationX(width);
            }
            com.tsf.extend.base.j.b.a(this, this);
        }
    }

    public void a(boolean z) {
        if (!z && this.h != null) {
            this.a.hideSoftInputFromWindow(this.h.getWindowToken(), 0);
        }
    }

    public void b(boolean z) {
        if (z && this.h != null) {
            if (TextUtils.isEmpty(this.h.getText().toString())) {
                b();
            } else {
                this.h.setSelection(this.h.getText().length());
                this.h.requestFocus();
            }
        }
    }

    public void c(boolean z) {
    }

    public void d(boolean z) {
    }
}
