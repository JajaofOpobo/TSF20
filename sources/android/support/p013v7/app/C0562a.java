package android.support.p013v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.p002v4.view.C0309ai;
import android.support.p002v4.widget.NestedScrollView;
import android.support.p013v7.p014a.C0535a;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: android.support.v7.app.a */
/* loaded from: classes.dex */
public class C0562a {

    /* renamed from: A */
    private TextView f1177A;

    /* renamed from: B */
    private TextView f1178B;

    /* renamed from: C */
    private View f1179C;

    /* renamed from: D */
    private ListAdapter f1180D;

    /* renamed from: F */
    private int f1182F;

    /* renamed from: G */
    private int f1183G;

    /* renamed from: H */
    private int f1184H;

    /* renamed from: I */
    private int f1185I;

    /* renamed from: J */
    private int f1186J;

    /* renamed from: K */
    private int f1187K;

    /* renamed from: M */
    private Handler f1189M;

    /* renamed from: a */
    private final Context f1191a;

    /* renamed from: b */
    private final DialogC0587i f1192b;

    /* renamed from: c */
    private final Window f1193c;

    /* renamed from: d */
    private CharSequence f1194d;

    /* renamed from: e */
    private CharSequence f1195e;

    /* renamed from: f */
    private ListView f1196f;

    /* renamed from: g */
    private View f1197g;

    /* renamed from: h */
    private int f1198h;

    /* renamed from: i */
    private int f1199i;

    /* renamed from: j */
    private int f1200j;

    /* renamed from: k */
    private int f1201k;

    /* renamed from: l */
    private int f1202l;

    /* renamed from: n */
    private Button f1204n;

    /* renamed from: o */
    private CharSequence f1205o;

    /* renamed from: p */
    private Message f1206p;

    /* renamed from: q */
    private Button f1207q;

    /* renamed from: r */
    private CharSequence f1208r;

    /* renamed from: s */
    private Message f1209s;

    /* renamed from: t */
    private Button f1210t;

    /* renamed from: u */
    private CharSequence f1211u;

    /* renamed from: v */
    private Message f1212v;

    /* renamed from: w */
    private NestedScrollView f1213w;

    /* renamed from: y */
    private Drawable f1215y;

    /* renamed from: z */
    private ImageView f1216z;

    /* renamed from: m */
    private boolean f1203m = false;

    /* renamed from: x */
    private int f1214x = 0;

    /* renamed from: E */
    private int f1181E = -1;

    /* renamed from: L */
    private int f1188L = 0;

    /* renamed from: N */
    private final View.OnClickListener f1190N = new View.OnClickListener() { // from class: android.support.v7.app.a.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            if (view == C0562a.this.f1204n && C0562a.this.f1206p != null) {
                obtain = Message.obtain(C0562a.this.f1206p);
            } else {
                obtain = (view != C0562a.this.f1207q || C0562a.this.f1209s == null) ? (view != C0562a.this.f1210t || C0562a.this.f1212v == null) ? null : Message.obtain(C0562a.this.f1212v) : Message.obtain(C0562a.this.f1209s);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            C0562a.this.f1189M.obtainMessage(1, C0562a.this.f1192b).sendToTarget();
        }
    };

    /* renamed from: android.support.v7.app.a$b */
    /* loaded from: classes.dex */
    private static final class HandlerC0574b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f1281a;

        public HandlerC0574b(DialogInterface dialogInterface) {
            this.f1281a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case ItemInfo.NO_ID /* -1 */:
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.f1281a.get(), message.what);
                    return;
                case 0:
                default:
                    return;
                case 1:
                    ((DialogInterface) message.obj).dismiss();
                    return;
            }
        }
    }

    public C0562a(Context context, DialogC0587i dialogC0587i, Window window) {
        this.f1191a = context;
        this.f1192b = dialogC0587i;
        this.f1193c = window;
        this.f1189M = new HandlerC0574b(dialogC0587i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0535a.C0546k.AlertDialog, C0535a.C0536a.alertDialogStyle, 0);
        this.f1182F = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_android_layout, 0);
        this.f1183G = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_buttonPanelSideLayout, 0);
        this.f1184H = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_listLayout, 0);
        this.f1185I = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_multiChoiceItemLayout, 0);
        this.f1186J = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_singleChoiceItemLayout, 0);
        this.f1187K = obtainStyledAttributes.getResourceId(C0535a.C0546k.AlertDialog_listItemLayout, 0);
        obtainStyledAttributes.recycle();
        dialogC0587i.m11950a(1);
    }

    /* renamed from: a */
    static boolean m12039a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (m12039a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public void m12048a() {
        this.f1192b.setContentView(m12032b());
        m12024c();
    }

    /* renamed from: b */
    private int m12032b() {
        if (this.f1183G == 0) {
            return this.f1182F;
        }
        if (this.f1188L == 1) {
            return this.f1183G;
        }
        return this.f1182F;
    }

    /* renamed from: a */
    public void m12033a(CharSequence charSequence) {
        this.f1194d = charSequence;
        if (this.f1177A != null) {
            this.f1177A.setText(charSequence);
        }
    }

    /* renamed from: b */
    public void m12028b(View view) {
        this.f1179C = view;
    }

    /* renamed from: b */
    public void m12025b(CharSequence charSequence) {
        this.f1195e = charSequence;
        if (this.f1178B != null) {
            this.f1178B.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void m12047a(int i) {
        this.f1197g = null;
        this.f1198h = i;
        this.f1203m = false;
    }

    /* renamed from: c */
    public void m12021c(View view) {
        this.f1197g = view;
        this.f1198h = 0;
        this.f1203m = false;
    }

    /* renamed from: a */
    public void m12038a(View view, int i, int i2, int i3, int i4) {
        this.f1197g = view;
        this.f1198h = 0;
        this.f1203m = true;
        this.f1199i = i;
        this.f1200j = i2;
        this.f1201k = i3;
        this.f1202l = i4;
    }

    /* renamed from: a */
    public void m12045a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.f1189M.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f1211u = charSequence;
                this.f1212v = message;
                return;
            case -2:
                this.f1208r = charSequence;
                this.f1209s = message;
                return;
            case ItemInfo.NO_ID /* -1 */:
                this.f1205o = charSequence;
                this.f1206p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: b */
    public void m12031b(int i) {
        this.f1215y = null;
        this.f1214x = i;
        if (this.f1216z != null) {
            if (i != 0) {
                this.f1216z.setVisibility(0);
                this.f1216z.setImageResource(this.f1214x);
                return;
            }
            this.f1216z.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void m12044a(Drawable drawable) {
        this.f1215y = drawable;
        this.f1214x = 0;
        if (this.f1216z != null) {
            if (drawable != null) {
                this.f1216z.setVisibility(0);
                this.f1216z.setImageDrawable(drawable);
                return;
            }
            this.f1216z.setVisibility(8);
        }
    }

    /* renamed from: c */
    public int m12023c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f1191a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: a */
    public boolean m12046a(int i, KeyEvent keyEvent) {
        return this.f1213w != null && this.f1213w.m12488a(keyEvent);
    }

    /* renamed from: b */
    public boolean m12030b(int i, KeyEvent keyEvent) {
        return this.f1213w != null && this.f1213w.m12488a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m12037a(View view, View view2) {
        if (view == null) {
            return (ViewGroup) (view2 instanceof ViewStub ? ((ViewStub) view2).inflate() : view2);
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        return (ViewGroup) (view instanceof ViewStub ? ((ViewStub) view).inflate() : view);
    }

    /* renamed from: c */
    private void m12024c() {
        View findViewById;
        View findViewById2 = this.f1193c.findViewById(C0535a.C0541f.parentPanel);
        View findViewById3 = findViewById2.findViewById(C0535a.C0541f.topPanel);
        View findViewById4 = findViewById2.findViewById(C0535a.C0541f.contentPanel);
        View findViewById5 = findViewById2.findViewById(C0535a.C0541f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C0535a.C0541f.customPanel);
        m12035a(viewGroup);
        View findViewById6 = viewGroup.findViewById(C0535a.C0541f.topPanel);
        View findViewById7 = viewGroup.findViewById(C0535a.C0541f.contentPanel);
        View findViewById8 = viewGroup.findViewById(C0535a.C0541f.buttonPanel);
        ViewGroup m12037a = m12037a(findViewById6, findViewById3);
        ViewGroup m12037a2 = m12037a(findViewById7, findViewById4);
        ViewGroup m12037a3 = m12037a(findViewById8, findViewById5);
        m12020c(m12037a2);
        m12018d(m12037a3);
        m12026b(m12037a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (m12037a == null || m12037a.getVisibility() == 8) ? false : true;
        boolean z3 = (m12037a3 == null || m12037a3.getVisibility() == 8) ? false : true;
        if (!z3 && m12037a2 != null && (findViewById = m12037a2.findViewById(C0535a.C0541f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z2 && this.f1213w != null) {
            this.f1213w.setClipToPadding(true);
        }
        if (!z) {
            ListView listView = this.f1196f != null ? this.f1196f : this.f1213w;
            if (listView != null) {
                m12034a(m12037a2, listView, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView2 = this.f1196f;
        if (listView2 != null && this.f1180D != null) {
            listView2.setAdapter(this.f1180D);
            int i = this.f1181E;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: a */
    private void m12034a(ViewGroup viewGroup, View view, int i, int i2) {
        final View view2 = null;
        final View findViewById = this.f1193c.findViewById(C0535a.C0541f.scrollIndicatorUp);
        View findViewById2 = this.f1193c.findViewById(C0535a.C0541f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C0309ai.m12928a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view2 = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view2 != null) {
            if (this.f1195e != null) {
                this.f1213w.setOnScrollChangeListener(new NestedScrollView.InterfaceC0452b() { // from class: android.support.v7.app.a.2
                    @Override // android.support.p002v4.widget.NestedScrollView.InterfaceC0452b
                    /* renamed from: a */
                    public void mo12007a(NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
                        C0562a.m12027b(nestedScrollView, findViewById, view2);
                    }
                });
                this.f1213w.post(new Runnable() { // from class: android.support.v7.app.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        C0562a.m12027b(C0562a.this.f1213w, findViewById, view2);
                    }
                });
            } else if (this.f1196f != null) {
                this.f1196f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: android.support.v7.app.a.4
                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScrollStateChanged(AbsListView absListView, int i3) {
                    }

                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
                        C0562a.m12027b(absListView, findViewById, view2);
                    }
                });
                this.f1196f.post(new Runnable() { // from class: android.support.v7.app.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        C0562a.m12027b(C0562a.this.f1196f, findViewById, view2);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view2 != null) {
                    viewGroup.removeView(view2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m12035a(ViewGroup viewGroup) {
        View view;
        if (this.f1197g != null) {
            view = this.f1197g;
        } else if (this.f1198h != 0) {
            view = LayoutInflater.from(this.f1191a).inflate(this.f1198h, viewGroup, false);
        } else {
            view = null;
        }
        boolean z = view != null;
        if (!z || !m12039a(view)) {
            this.f1193c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f1193c.findViewById(C0535a.C0541f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f1203m) {
                frameLayout.setPadding(this.f1199i, this.f1200j, this.f1201k, this.f1202l);
            }
            if (this.f1196f != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: b */
    private void m12026b(ViewGroup viewGroup) {
        if (this.f1179C != null) {
            viewGroup.addView(this.f1179C, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f1193c.findViewById(C0535a.C0541f.title_template).setVisibility(8);
            return;
        }
        this.f1216z = (ImageView) this.f1193c.findViewById(16908294);
        if (!TextUtils.isEmpty(this.f1194d)) {
            this.f1177A = (TextView) this.f1193c.findViewById(C0535a.C0541f.alertTitle);
            this.f1177A.setText(this.f1194d);
            if (this.f1214x != 0) {
                this.f1216z.setImageResource(this.f1214x);
                return;
            } else if (this.f1215y != null) {
                this.f1216z.setImageDrawable(this.f1215y);
                return;
            } else {
                this.f1177A.setPadding(this.f1216z.getPaddingLeft(), this.f1216z.getPaddingTop(), this.f1216z.getPaddingRight(), this.f1216z.getPaddingBottom());
                this.f1216z.setVisibility(8);
                return;
            }
        }
        this.f1193c.findViewById(C0535a.C0541f.title_template).setVisibility(8);
        this.f1216z.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* renamed from: c */
    private void m12020c(ViewGroup viewGroup) {
        this.f1213w = (NestedScrollView) this.f1193c.findViewById(C0535a.C0541f.scrollView);
        this.f1213w.setFocusable(false);
        this.f1213w.setNestedScrollingEnabled(false);
        this.f1178B = (TextView) viewGroup.findViewById(16908299);
        if (this.f1178B != null) {
            if (this.f1195e != null) {
                this.f1178B.setText(this.f1195e);
                return;
            }
            this.f1178B.setVisibility(8);
            this.f1213w.removeView(this.f1178B);
            if (this.f1196f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f1213w.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f1213w);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f1196f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m12027b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(C0309ai.m12913b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(C0309ai.m12913b(view, 1) ? 0 : 4);
        }
    }

    /* renamed from: d */
    private void m12018d(ViewGroup viewGroup) {
        boolean z;
        this.f1204n = (Button) viewGroup.findViewById(16908313);
        this.f1204n.setOnClickListener(this.f1190N);
        if (TextUtils.isEmpty(this.f1205o)) {
            this.f1204n.setVisibility(8);
            z = false;
        } else {
            this.f1204n.setText(this.f1205o);
            this.f1204n.setVisibility(0);
            z = true;
        }
        this.f1207q = (Button) viewGroup.findViewById(16908314);
        this.f1207q.setOnClickListener(this.f1190N);
        if (TextUtils.isEmpty(this.f1208r)) {
            this.f1207q.setVisibility(8);
        } else {
            this.f1207q.setText(this.f1208r);
            this.f1207q.setVisibility(0);
            z |= true;
        }
        this.f1210t = (Button) viewGroup.findViewById(16908315);
        this.f1210t.setOnClickListener(this.f1190N);
        if (TextUtils.isEmpty(this.f1211u)) {
            this.f1210t.setVisibility(8);
        } else {
            this.f1210t.setText(this.f1211u);
            this.f1210t.setVisibility(0);
            z |= true;
        }
        if (!(z)) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: android.support.v7.app.a$a */
    /* loaded from: classes.dex */
    public static class C0568a {

        /* renamed from: A */
        public int f1230A;

        /* renamed from: C */
        public boolean[] f1232C;

        /* renamed from: D */
        public boolean f1233D;

        /* renamed from: E */
        public boolean f1234E;

        /* renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f1236G;

        /* renamed from: H */
        public Cursor f1237H;

        /* renamed from: I */
        public String f1238I;

        /* renamed from: J */
        public String f1239J;

        /* renamed from: K */
        public AdapterView.OnItemSelectedListener f1240K;

        /* renamed from: L */
        public InterfaceC0573a f1241L;

        /* renamed from: a */
        public final Context f1243a;

        /* renamed from: b */
        public final LayoutInflater f1244b;

        /* renamed from: d */
        public Drawable f1246d;

        /* renamed from: f */
        public CharSequence f1248f;

        /* renamed from: g */
        public View f1249g;

        /* renamed from: h */
        public CharSequence f1250h;

        /* renamed from: i */
        public CharSequence f1251i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f1252j;

        /* renamed from: k */
        public CharSequence f1253k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f1254l;

        /* renamed from: m */
        public CharSequence f1255m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1256n;

        /* renamed from: p */
        public DialogInterface.OnCancelListener f1258p;

        /* renamed from: q */
        public DialogInterface.OnDismissListener f1259q;

        /* renamed from: r */
        public DialogInterface.OnKeyListener f1260r;

        /* renamed from: s */
        public CharSequence[] f1261s;

        /* renamed from: t */
        public ListAdapter f1262t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f1263u;

        /* renamed from: v */
        public int f1264v;

        /* renamed from: w */
        public View f1265w;

        /* renamed from: x */
        public int f1266x;

        /* renamed from: y */
        public int f1267y;

        /* renamed from: z */
        public int f1268z;

        /* renamed from: c */
        public int f1245c = 0;

        /* renamed from: e */
        public int f1247e = 0;

        /* renamed from: B */
        public boolean f1231B = false;

        /* renamed from: F */
        public int f1235F = -1;

        /* renamed from: M */
        public boolean f1242M = true;

        /* renamed from: o */
        public boolean f1257o = true;

        /* renamed from: android.support.v7.app.a$a$a */
        /* loaded from: classes.dex */
        public interface InterfaceC0573a {
            /* renamed from: a */
            void m12004a(ListView listView);
        }

        public C0568a(Context context) {
            this.f1243a = context;
            this.f1244b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: a */
        public void m12006a(C0562a c0562a) {
            if (this.f1249g != null) {
                c0562a.m12028b(this.f1249g);
            } else {
                if (this.f1248f != null) {
                    c0562a.m12033a(this.f1248f);
                }
                if (this.f1246d != null) {
                    c0562a.m12044a(this.f1246d);
                }
                if (this.f1245c != 0) {
                    c0562a.m12031b(this.f1245c);
                }
                if (this.f1247e != 0) {
                    c0562a.m12031b(c0562a.m12023c(this.f1247e));
                }
            }
            if (this.f1250h != null) {
                c0562a.m12025b(this.f1250h);
            }
            if (this.f1251i != null) {
                c0562a.m12045a(-1, this.f1251i, this.f1252j, (Message) null);
            }
            if (this.f1253k != null) {
                c0562a.m12045a(-2, this.f1253k, this.f1254l, (Message) null);
            }
            if (this.f1255m != null) {
                c0562a.m12045a(-3, this.f1255m, this.f1256n, (Message) null);
            }
            if (this.f1261s != null || this.f1237H != null || this.f1262t != null) {
                m12005b(c0562a);
            }
            if (this.f1265w != null) {
                if (this.f1231B) {
                    c0562a.m12038a(this.f1265w, this.f1266x, this.f1267y, this.f1268z, this.f1230A);
                } else {
                    c0562a.m12021c(this.f1265w);
                }
            } else if (this.f1264v != 0) {
                c0562a.m12047a(this.f1264v);
            }
        }

        /* renamed from: b */
        private void m12005b(final C0562a c0562a) {
            ListAdapter c0575c;
            final ListView listView = (ListView) this.f1244b.inflate(c0562a.f1184H, (ViewGroup) null);
            if (this.f1233D) {
                if (this.f1237H == null) {
                    c0575c = new ArrayAdapter<CharSequence>(this.f1243a, c0562a.f1185I, 16908308, this.f1261s) { // from class: android.support.v7.app.a.a.1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i, view, viewGroup);
                            if (C0568a.this.f1232C != null && C0568a.this.f1232C[i]) {
                                listView.setItemChecked(i, true);
                            }
                            return view2;
                        }
                    };
                } else {
                    c0575c = new CursorAdapter(this.f1243a, this.f1237H, false) { // from class: android.support.v7.app.a.a.2

                        /* renamed from: d */
                        private final int f1274d;

                        /* renamed from: e */
                        private final int f1275e;

                        {
                            Cursor cursor = getCursor();
                            this.f1274d = cursor.getColumnIndexOrThrow(C0568a.this.f1238I);
                            this.f1275e = cursor.getColumnIndexOrThrow(C0568a.this.f1239J);
                        }

                        @Override // android.widget.CursorAdapter
                        public void bindView(View view, Context context, Cursor cursor) {
                            ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f1274d));
                            listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.f1275e) == 1);
                        }

                        @Override // android.widget.CursorAdapter
                        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                            return C0568a.this.f1244b.inflate(c0562a.f1185I, viewGroup, false);
                        }
                    };
                }
            } else {
                int i = this.f1234E ? c0562a.f1186J : c0562a.f1187K;
                if (this.f1237H != null) {
                    c0575c = new SimpleCursorAdapter(this.f1243a, i, this.f1237H, new String[]{this.f1238I}, new int[]{16908308});
                } else if (this.f1262t != null) {
                    c0575c = this.f1262t;
                } else {
                    c0575c = new C0575c(this.f1243a, i, 16908308, this.f1261s);
                }
            }
            if (this.f1241L != null) {
                this.f1241L.m12004a(listView);
            }
            c0562a.f1180D = c0575c;
            c0562a.f1181E = this.f1235F;
            if (this.f1263u != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.a.a.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        C0568a.this.f1263u.onClick(c0562a.f1192b, i2);
                        if (!C0568a.this.f1234E) {
                            c0562a.f1192b.dismiss();
                        }
                    }
                });
            } else if (this.f1236G != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.a.a.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        if (C0568a.this.f1232C != null) {
                            C0568a.this.f1232C[i2] = listView.isItemChecked(i2);
                        }
                        C0568a.this.f1236G.onClick(c0562a.f1192b, i2, listView.isItemChecked(i2));
                    }
                });
            }
            if (this.f1240K != null) {
                listView.setOnItemSelectedListener(this.f1240K);
            }
            if (this.f1234E) {
                listView.setChoiceMode(1);
            } else if (this.f1233D) {
                listView.setChoiceMode(2);
            }
            c0562a.f1196f = listView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.app.a$c */
    /* loaded from: classes.dex */
    public static class C0575c extends ArrayAdapter<CharSequence> {
        public C0575c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }
    }
}
