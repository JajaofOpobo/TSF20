package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ai;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.a.a;
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
/* loaded from: classes.dex */
public class a {
    private TextView A;
    private TextView B;
    private View C;
    private ListAdapter D;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private Handler M;
    private final Context a;
    private final i b;
    private final Window c;
    private CharSequence d;
    private CharSequence e;
    private ListView f;
    private View g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private Button n;
    private CharSequence o;
    private Message p;
    private Button q;
    private CharSequence r;
    private Message s;
    private Button t;
    private CharSequence u;
    private Message v;
    private NestedScrollView w;
    private Drawable y;
    private ImageView z;
    private boolean m = false;
    private int x = 0;
    private int E = -1;
    private int L = 0;
    private final View.OnClickListener N = new View.OnClickListener() { // from class: android.support.v7.app.a.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message obtain;
            if (view == a.this.n && a.this.p != null) {
                obtain = Message.obtain(a.this.p);
            } else {
                obtain = (view != a.this.q || a.this.s == null) ? (view != a.this.t || a.this.v == null) ? null : Message.obtain(a.this.v) : Message.obtain(a.this.s);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            a.this.M.obtainMessage(1, a.this.b).sendToTarget();
        }
    };

    /* loaded from: classes.dex */
    private static final class b extends Handler {
        private WeakReference<DialogInterface> a;

        public b(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case -3:
                case -2:
                case ItemInfo.NO_ID /* -1 */:
                    ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
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

    public a(Context context, i iVar, Window window) {
        this.a = context;
        this.b = iVar;
        this.c = window;
        this.M = new b(iVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, a.k.AlertDialog, a.C0012a.alertDialogStyle, 0);
        this.F = obtainStyledAttributes.getResourceId(a.k.AlertDialog_android_layout, 0);
        this.G = obtainStyledAttributes.getResourceId(a.k.AlertDialog_buttonPanelSideLayout, 0);
        this.H = obtainStyledAttributes.getResourceId(a.k.AlertDialog_listLayout, 0);
        this.I = obtainStyledAttributes.getResourceId(a.k.AlertDialog_multiChoiceItemLayout, 0);
        this.J = obtainStyledAttributes.getResourceId(a.k.AlertDialog_singleChoiceItemLayout, 0);
        this.K = obtainStyledAttributes.getResourceId(a.k.AlertDialog_listItemLayout, 0);
        obtainStyledAttributes.recycle();
        iVar.a(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (childCount > 0) {
                childCount--;
                if (a(viewGroup.getChildAt(childCount))) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void a() {
        this.b.setContentView(b());
        c();
    }

    private int b() {
        if (this.G == 0) {
            return this.F;
        }
        if (this.L == 1) {
            return this.G;
        }
        return this.F;
    }

    public void a(CharSequence charSequence) {
        this.d = charSequence;
        if (this.A != null) {
            this.A.setText(charSequence);
        }
    }

    public void b(View view) {
        this.C = view;
    }

    public void b(CharSequence charSequence) {
        this.e = charSequence;
        if (this.B != null) {
            this.B.setText(charSequence);
        }
    }

    public void a(int i) {
        this.g = null;
        this.h = i;
        this.m = false;
    }

    public void c(View view) {
        this.g = view;
        this.h = 0;
        this.m = false;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.g = view;
        this.h = 0;
        this.m = true;
        this.i = i;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    public void a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.M.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.u = charSequence;
                this.v = message;
                return;
            case -2:
                this.r = charSequence;
                this.s = message;
                return;
            case ItemInfo.NO_ID /* -1 */:
                this.o = charSequence;
                this.p = message;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void b(int i) {
        this.y = null;
        this.x = i;
        if (this.z != null) {
            if (i != 0) {
                this.z.setVisibility(0);
                this.z.setImageResource(this.x);
                return;
            }
            this.z.setVisibility(8);
        }
    }

    public void a(Drawable drawable) {
        this.y = drawable;
        this.x = 0;
        if (this.z != null) {
            if (drawable != null) {
                this.z.setVisibility(0);
                this.z.setImageDrawable(drawable);
                return;
            }
            this.z.setVisibility(8);
        }
    }

    public int c(int i) {
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return this.w != null && this.w.a(keyEvent);
    }

    public boolean b(int i, KeyEvent keyEvent) {
        return this.w != null && this.w.a(keyEvent);
    }

    private ViewGroup a(View view, View view2) {
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

    private void c() {
        View findViewById;
        View findViewById2 = this.c.findViewById(a.f.parentPanel);
        View findViewById3 = findViewById2.findViewById(a.f.topPanel);
        View findViewById4 = findViewById2.findViewById(a.f.contentPanel);
        View findViewById5 = findViewById2.findViewById(a.f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(a.f.customPanel);
        a(viewGroup);
        View findViewById6 = viewGroup.findViewById(a.f.topPanel);
        View findViewById7 = viewGroup.findViewById(a.f.contentPanel);
        View findViewById8 = viewGroup.findViewById(a.f.buttonPanel);
        ViewGroup a = a(findViewById6, findViewById3);
        ViewGroup a2 = a(findViewById7, findViewById4);
        ViewGroup a3 = a(findViewById8, findViewById5);
        c(a2);
        d(a3);
        b(a);
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!z3 && a2 != null && (findViewById = a2.findViewById(a.f.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (z2 && this.w != null) {
            this.w.setClipToPadding(true);
        }
        if (!z) {
            ListView listView = this.f != null ? this.f : this.w;
            if (listView != null) {
                a(a2, listView, (z3 ? 2 : 0) | (z2 ? 1 : 0), 3);
            }
        }
        ListView listView2 = this.f;
        if (listView2 != null && this.D != null) {
            listView2.setAdapter(this.D);
            int i = this.E;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    private void a(ViewGroup viewGroup, View view, int i, int i2) {
        final View view2 = null;
        final View findViewById = this.c.findViewById(a.f.scrollIndicatorUp);
        View findViewById2 = this.c.findViewById(a.f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            ai.a(view, i, i2);
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
            if (this.e != null) {
                this.w.setOnScrollChangeListener(new NestedScrollView.b() { // from class: android.support.v7.app.a.2
                    @Override // android.support.v4.widget.NestedScrollView.b
                    public void a(NestedScrollView nestedScrollView, int i3, int i4, int i5, int i6) {
                        a.b(nestedScrollView, findViewById, view2);
                    }
                });
                this.w.post(new Runnable() { // from class: android.support.v7.app.a.3
                    @Override // java.lang.Runnable
                    public void run() {
                        a.b(a.this.w, findViewById, view2);
                    }
                });
            } else if (this.f != null) {
                this.f.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: android.support.v7.app.a.4
                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScrollStateChanged(AbsListView absListView, int i3) {
                    }

                    @Override // android.widget.AbsListView.OnScrollListener
                    public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
                        a.b(absListView, findViewById, view2);
                    }
                });
                this.f.post(new Runnable() { // from class: android.support.v7.app.a.5
                    @Override // java.lang.Runnable
                    public void run() {
                        a.b(a.this.f, findViewById, view2);
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

    private void a(ViewGroup viewGroup) {
        View view;
        if (this.g != null) {
            view = this.g;
        } else if (this.h != 0) {
            view = LayoutInflater.from(this.a).inflate(this.h, viewGroup, false);
        } else {
            view = null;
        }
        boolean z = view != null;
        if (!z || !a(view)) {
            this.c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.c.findViewById(a.f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.m) {
                frameLayout.setPadding(this.i, this.j, this.k, this.l);
            }
            if (this.f != null) {
                ((LinearLayout.LayoutParams) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void b(ViewGroup viewGroup) {
        if (this.C != null) {
            viewGroup.addView(this.C, 0, new ViewGroup.LayoutParams(-1, -2));
            this.c.findViewById(a.f.title_template).setVisibility(8);
            return;
        }
        this.z = (ImageView) this.c.findViewById(16908294);
        if (!TextUtils.isEmpty(this.d)) {
            this.A = (TextView) this.c.findViewById(a.f.alertTitle);
            this.A.setText(this.d);
            if (this.x != 0) {
                this.z.setImageResource(this.x);
                return;
            } else if (this.y != null) {
                this.z.setImageDrawable(this.y);
                return;
            } else {
                this.A.setPadding(this.z.getPaddingLeft(), this.z.getPaddingTop(), this.z.getPaddingRight(), this.z.getPaddingBottom());
                this.z.setVisibility(8);
                return;
            }
        }
        this.c.findViewById(a.f.title_template).setVisibility(8);
        this.z.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    private void c(ViewGroup viewGroup) {
        this.w = (NestedScrollView) this.c.findViewById(a.f.scrollView);
        this.w.setFocusable(false);
        this.w.setNestedScrollingEnabled(false);
        this.B = (TextView) viewGroup.findViewById(16908299);
        if (this.B != null) {
            if (this.e != null) {
                this.B.setText(this.e);
                return;
            }
            this.B.setVisibility(8);
            this.w.removeView(this.B);
            if (this.f != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.w.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.w);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(ai.b(view, -1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(ai.b(view, 1) ? 0 : 4);
        }
    }

    private void d(ViewGroup viewGroup) {
        boolean z;
        this.n = (Button) viewGroup.findViewById(16908313);
        this.n.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.o)) {
            this.n.setVisibility(8);
            z = false;
        } else {
            this.n.setText(this.o);
            this.n.setVisibility(0);
            z = true;
        }
        this.q = (Button) viewGroup.findViewById(16908314);
        this.q.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.r)) {
            this.q.setVisibility(8);
        } else {
            this.q.setText(this.r);
            this.q.setVisibility(0);
            z |= true;
        }
        this.t = (Button) viewGroup.findViewById(16908315);
        this.t.setOnClickListener(this.N);
        if (TextUtils.isEmpty(this.u)) {
            this.t.setVisibility(8);
        } else {
            this.t.setText(this.u);
            this.t.setVisibility(0);
            z |= true;
        }
        if (!(z)) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: android.support.v7.app.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0013a {
        public int A;
        public boolean[] C;
        public boolean D;
        public boolean E;
        public DialogInterface.OnMultiChoiceClickListener G;
        public Cursor H;
        public String I;
        public String J;
        public AdapterView.OnItemSelectedListener K;
        public InterfaceC0014a L;
        public final Context a;
        public final LayoutInflater b;
        public Drawable d;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public DialogInterface.OnClickListener j;
        public CharSequence k;
        public DialogInterface.OnClickListener l;
        public CharSequence m;
        public DialogInterface.OnClickListener n;
        public DialogInterface.OnCancelListener p;
        public DialogInterface.OnDismissListener q;
        public DialogInterface.OnKeyListener r;
        public CharSequence[] s;
        public ListAdapter t;
        public DialogInterface.OnClickListener u;
        public int v;
        public View w;
        public int x;
        public int y;
        public int z;
        public int c = 0;
        public int e = 0;
        public boolean B = false;
        public int F = -1;
        public boolean M = true;
        public boolean o = true;

        /* renamed from: android.support.v7.app.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0014a {
            void a(ListView listView);
        }

        public C0013a(Context context) {
            this.a = context;
            this.b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(a aVar) {
            if (this.g != null) {
                aVar.b(this.g);
            } else {
                if (this.f != null) {
                    aVar.a(this.f);
                }
                if (this.d != null) {
                    aVar.a(this.d);
                }
                if (this.c != 0) {
                    aVar.b(this.c);
                }
                if (this.e != 0) {
                    aVar.b(aVar.c(this.e));
                }
            }
            if (this.h != null) {
                aVar.b(this.h);
            }
            if (this.i != null) {
                aVar.a(-1, this.i, this.j, (Message) null);
            }
            if (this.k != null) {
                aVar.a(-2, this.k, this.l, (Message) null);
            }
            if (this.m != null) {
                aVar.a(-3, this.m, this.n, (Message) null);
            }
            if (this.s != null || this.H != null || this.t != null) {
                b(aVar);
            }
            if (this.w != null) {
                if (this.B) {
                    aVar.a(this.w, this.x, this.y, this.z, this.A);
                } else {
                    aVar.c(this.w);
                }
            } else if (this.v != 0) {
                aVar.a(this.v);
            }
        }

        private void b(final a aVar) {
            ListAdapter cVar;
            final ListView listView = (ListView) this.b.inflate(aVar.H, (ViewGroup) null);
            if (this.D) {
                if (this.H == null) {
                    cVar = new ArrayAdapter<CharSequence>(this.a, aVar.I, 16908308, this.s) { // from class: android.support.v7.app.a.a.1
                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i, View view, ViewGroup viewGroup) {
                            View view2 = super.getView(i, view, viewGroup);
                            if (C0013a.this.C != null && C0013a.this.C[i]) {
                                listView.setItemChecked(i, true);
                            }
                            return view2;
                        }
                    };
                } else {
                    cVar = new CursorAdapter(this.a, this.H, false) { // from class: android.support.v7.app.a.a.2
                        private final int d;
                        private final int e;

                        {
                            Cursor cursor = getCursor();
                            this.d = cursor.getColumnIndexOrThrow(C0013a.this.I);
                            this.e = cursor.getColumnIndexOrThrow(C0013a.this.J);
                        }

                        @Override // android.widget.CursorAdapter
                        public void bindView(View view, Context context, Cursor cursor) {
                            ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.d));
                            listView.setItemChecked(cursor.getPosition(), cursor.getInt(this.e) == 1);
                        }

                        @Override // android.widget.CursorAdapter
                        public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                            return C0013a.this.b.inflate(aVar.I, viewGroup, false);
                        }
                    };
                }
            } else {
                int i = this.E ? aVar.J : aVar.K;
                if (this.H != null) {
                    cVar = new SimpleCursorAdapter(this.a, i, this.H, new String[]{this.I}, new int[]{16908308});
                } else if (this.t != null) {
                    cVar = this.t;
                } else {
                    cVar = new c(this.a, i, 16908308, this.s);
                }
            }
            if (this.L != null) {
                this.L.a(listView);
            }
            aVar.D = cVar;
            aVar.E = this.F;
            if (this.u != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.a.a.3
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        C0013a.this.u.onClick(aVar.b, i2);
                        if (!C0013a.this.E) {
                            aVar.b.dismiss();
                        }
                    }
                });
            } else if (this.G != null) {
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: android.support.v7.app.a.a.4
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                        if (C0013a.this.C != null) {
                            C0013a.this.C[i2] = listView.isItemChecked(i2);
                        }
                        C0013a.this.G.onClick(aVar.b, i2, listView.isItemChecked(i2));
                    }
                });
            }
            if (this.K != null) {
                listView.setOnItemSelectedListener(this.K);
            }
            if (this.E) {
                listView.setChoiceMode(1);
            } else if (this.D) {
                listView.setChoiceMode(2);
            }
            aVar.f = listView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends ArrayAdapter<CharSequence> {
        public c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
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
