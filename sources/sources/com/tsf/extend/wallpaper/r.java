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
import com.tsf.extend.base.actstru.model.activi.PageActivity;
import com.tsf.extend.base.d.a;
import com.tsf.extend.f;
import com.tsf.extend.theme.ThemeDetail;
import org.json.JSONObject;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class r extends com.tsf.extend.g implements View.OnClickListener {
    public static boolean a = false;
    private ImageView b;
    private TextView c;
    private ImageView f;
    private ProgressBar g;
    private com.tsf.extend.theme.k h;
    private a i;
    private Context j;

    public r(Context context, com.tsf.extend.theme.k kVar) {
        super(context);
        a = true;
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.tsf.extend.wallpaper.r.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                r.a = false;
            }
        });
        this.j = context;
        d = 0.8f;
        b();
        this.i = new a();
        this.h = kVar;
        com.tsf.extend.theme.v.h().c(kVar.m(), this.i);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == f.e.cancel) {
            dismiss();
            return;
        }
        if (id == f.e.download) {
            ThemeDetail themeDetail = (ThemeDetail) LayoutInflater.from(this.j).inflate(f.C0052f.theme_detail, (ViewGroup) null);
            themeDetail.setFromInlet("15");
            themeDetail.setFromTab("detail");
            themeDetail.setTheme(this.h);
            themeDetail.setNewEntry("_kp");
            themeDetail.a("1010", "1010");
            if (this.j instanceof PageActivity) {
                ((PageActivity) this.j).a(themeDetail);
            }
            dismiss();
            return;
        }
        if (id == f.e.cover) {
            ThemeDetail themeDetail2 = (ThemeDetail) LayoutInflater.from(this.j).inflate(f.C0052f.theme_detail, (ViewGroup) null);
            themeDetail2.setFromInlet("15");
            themeDetail2.setFromTab("detail");
            themeDetail2.setTheme(this.h);
            themeDetail2.setNewEntry("_kp");
            themeDetail2.a("1010", "1010");
            if (this.j instanceof PageActivity) {
                ((PageActivity) this.j).a(themeDetail2);
            }
            dismiss();
        }
    }

    private void b() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f.C0052f.theme_recommend_dialog, (ViewGroup) null);
        this.b = (ImageView) viewInflate.findViewById(f.e.cover);
        this.c = (TextView) viewInflate.findViewById(f.e.download);
        this.f = (ImageView) viewInflate.findViewById(f.e.cancel);
        this.g = (ProgressBar) viewInflate.findViewById(f.e.progressbar);
        this.f.setOnClickListener(this);
        a(this.c);
        a(this.b);
        c();
        setContentView(viewInflate);
    }

    @Override // com.tsf.extend.g
    public FrameLayout.LayoutParams a() {
        return new FrameLayout.LayoutParams((int) (getContext().getResources().getDisplayMetrics().widthPixels * d), -1);
    }

    private void c() {
        int iA = PersonalizationActivity.a(getContext(), 4.0f);
        com.tsf.extend.theme.i iVar = new com.tsf.extend.theme.i(-16400241);
        iVar.a(iA);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(StateSet.WILD_CARD, iVar);
        a(this.c, stateListDrawable);
    }

    private static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    private class a implements a.InterfaceC0048a<Pair<String, Bitmap>> {
        private a() {
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null) {
                r.this.b.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.d.a.InterfaceC0048a
        public void a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
        }
    }

    @Override // com.tsf.extend.g, android.app.Dialog
    public void show() {
        super.show();
    }

    private void a(final View view) {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.tsf.extend.wallpaper.r.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent motionEvent) {
                r.this.onClick(view);
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
