package com.tsf.extend.wallpaper;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.Pair;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tsf.extend.C1536f;
import com.tsf.extend.DialogC1546g;
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.theme.C1845i;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.ThemeDetail;
import org.json.JSONObject;
/* renamed from: com.tsf.extend.wallpaper.r */
/* loaded from: classes.dex */
public class View$OnClickListenerC2101r extends DialogC1546g implements View.OnClickListener {

    /* renamed from: a */
    public static boolean f6871a = false;

    /* renamed from: b */
    private ImageView f6872b;

    /* renamed from: c */
    private TextView f6873c;

    /* renamed from: f */
    private ImageView f6874f;

    /* renamed from: g */
    private ProgressBar f6875g;

    /* renamed from: h */
    private C1848k f6876h;

    /* renamed from: i */
    private C2105a f6877i;

    /* renamed from: j */
    private Context f6878j;

    public View$OnClickListenerC2101r(Context context, C1848k c1848k) {
        super(context);
        f6871a = true;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.extend.wallpaper.r.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                View$OnClickListenerC2101r.f6871a = false;
            }
        });
        this.f6878j = context;
        f4876d = 0.8f;
        m6409b();
        this.f6877i = new C2105a();
        this.f6876h = c1848k;
        C1894v.m7069h().m7079c(c1848k.m7285m(), this.f6877i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == C1536f.C1541e.cancel) {
            dismiss();
        } else if (id == C1536f.C1541e.download) {
            ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this.f6878j).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
            themeDetail.setFromInlet("15");
            themeDetail.setFromTab("detail");
            themeDetail.setTheme(this.f6876h);
            themeDetail.setNewEntry("_kp");
            themeDetail.m8092a("1010", "1010");
            if (this.f6878j instanceof PageActivity) {
                ((PageActivity) this.f6878j).m8922a(themeDetail);
            }
            dismiss();
        } else if (id == C1536f.C1541e.cover) {
            ThemeDetail themeDetail2 = (ThemeDetail) LayoutInflater.from(this.f6878j).inflate(C1536f.C1542f.theme_detail, (ViewGroup) null);
            themeDetail2.setFromInlet("15");
            themeDetail2.setFromTab("detail");
            themeDetail2.setTheme(this.f6876h);
            themeDetail2.setNewEntry("_kp");
            themeDetail2.m8092a("1010", "1010");
            if (this.f6878j instanceof PageActivity) {
                ((PageActivity) this.f6878j).m8922a(themeDetail2);
            }
            dismiss();
        }
    }

    /* renamed from: b */
    private void m6409b() {
        View inflate = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.theme_recommend_dialog, (ViewGroup) null);
        this.f6872b = (ImageView) inflate.findViewById(C1536f.C1541e.cover);
        this.f6873c = (TextView) inflate.findViewById(C1536f.C1541e.download);
        this.f6874f = (ImageView) inflate.findViewById(C1536f.C1541e.cancel);
        this.f6875g = (ProgressBar) inflate.findViewById(C1536f.C1541e.progressbar);
        this.f6874f.setOnClickListener(this);
        m6412a(this.f6873c);
        m6412a(this.f6872b);
        m6408c();
        setContentView(inflate);
    }

    @Override // com.tsf.extend.DialogC1546g
    /* renamed from: a */
    public FrameLayout.LayoutParams mo6413a() {
        return new FrameLayout.LayoutParams((int) (getContext().getResources().getDisplayMetrics().widthPixels * f4876d), -1);
    }

    /* renamed from: c */
    private void m6408c() {
        int m7012a = PersonalizationActivity.m7012a(getContext(), 4.0f);
        C1845i c1845i = new C1845i(-16400241);
        c1845i.m7339a(m7012a);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(StateSet.WILD_CARD, c1845i);
        m6411a(this.f6873c, stateListDrawable);
    }

    /* renamed from: a */
    private static void m6411a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: com.tsf.extend.wallpaper.r$a */
    /* loaded from: classes.dex */
    private class C2105a implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {
        private C2105a() {
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                View$OnClickListenerC2101r.this.f6872b.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // com.tsf.extend.DialogC1546g, android.app.Dialog
    public void show() {
        super.show();
    }

    /* renamed from: a */
    private void m6412a(final View view) {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.tsf.extend.wallpaper.r.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                View$OnClickListenerC2101r.this.onClick(view);
                return super.onSingleTapUp(motionEvent);
            }
        });
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.tsf.extend.wallpaper.r.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                return true;
            }
        });
    }
}
