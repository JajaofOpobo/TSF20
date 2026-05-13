package android.support.p002v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.p002v4.app.C0062a;
import android.support.p002v4.app.C0072b;
import android.support.p002v4.p009d.C0173h;
import android.support.p002v4.p009d.C0174i;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
/* renamed from: android.support.v4.app.FragmentActivity */
/* loaded from: classes.dex */
public class FragmentActivity extends AbstractActivityC0089j implements C0062a.InterfaceC0064a, C0072b.InterfaceC0073a {

    /* renamed from: a */
    final Handler f171a = new Handler() { // from class: android.support.v4.app.FragmentActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (FragmentActivity.this.f175e) {
                        FragmentActivity.this.m13720a(false);
                        return;
                    }
                    return;
                case 2:
                    FragmentActivity.this.m13719b();
                    FragmentActivity.this.f172b.m13599n();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };

    /* renamed from: b */
    final C0092m f172b = C0092m.m13622a(new C0055a());

    /* renamed from: c */
    boolean f173c;

    /* renamed from: d */
    boolean f174d;

    /* renamed from: e */
    boolean f175e;

    /* renamed from: f */
    boolean f176f;

    /* renamed from: g */
    boolean f177g;

    /* renamed from: h */
    boolean f178h;

    /* renamed from: i */
    boolean f179i;

    /* renamed from: j */
    int f180j;

    /* renamed from: k */
    boolean f181k;

    /* renamed from: l */
    C0174i<String> f182l;

    @Override // android.support.p002v4.app.AbstractActivityC0089j, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    /* renamed from: android.support.v4.app.FragmentActivity$b */
    /* loaded from: classes.dex */
    static final class C0056b {

        /* renamed from: a */
        Object f185a;

        /* renamed from: b */
        List<Fragment> f186b;

        /* renamed from: c */
        C0173h<String, AbstractC0117v> f187c;

        C0056b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f172b.m13613b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String m13322a = this.f182l.m13322a(i4);
            this.f182l.m13316c(i4);
            if (m13322a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment m13616a = this.f172b.m13616a(m13322a);
            if (m13616a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m13322a);
                return;
            } else {
                m13616a.mo1168a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f172b.m13626a().mo13530c()) {
            mo13639a_();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f172b.m13625a(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.p002v4.app.AbstractActivityC0087h, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f172b.m13623a((Fragment) null);
        super.onCreate(bundle);
        C0056b c0056b = (C0056b) getLastNonConfigurationInstance();
        if (c0056b != null) {
            this.f172b.m13621a(c0056b.f187c);
        }
        if (bundle != null) {
            this.f172b.m13624a(bundle.getParcelable("android:support:fragments"), c0056b != null ? c0056b.f186b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.f180j = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.f182l = new C0174i<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.f182l.m13318b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.f182l == null) {
            this.f182l = new C0174i<>();
            this.f180j = 0;
        }
        this.f172b.m13608e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.f172b.m13619a(menu, getMenuInflater());
            if (Build.VERSION.SDK_INT < 11) {
                return true;
            }
            return onCreatePanelMenu;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // android.support.p002v4.app.AbstractActivityC0087h
    /* renamed from: a */
    public final View mo13640a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f172b.m13617a(view, str, context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m13720a(false);
        this.f172b.m13601l();
        this.f172b.m13597p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT < 5 && i == 4 && keyEvent.getRepeatCount() == 0) {
            onBackPressed();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f172b.m13600m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f172b.m13618a(menuItem);
            case 6:
                return this.f172b.m13611b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f172b.m13612b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f174d = false;
        if (this.f171a.hasMessages(2)) {
            this.f171a.removeMessages(2);
            m13719b();
        }
        this.f172b.m13604i();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f172b.m13613b();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f172b.m13613b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.f171a.sendEmptyMessage(2);
        this.f174d = true;
        this.f172b.m13599n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f171a.removeMessages(2);
        m13719b();
        this.f172b.m13599n();
    }

    /* renamed from: b */
    protected void m13719b() {
        this.f172b.m13605h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f178h) {
            this.f178h = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return m13722a(view, menu) | this.f172b.m13620a(menu);
    }

    /* renamed from: a */
    protected boolean m13722a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.f175e) {
            m13720a(true);
        }
        Object m13717c = m13717c();
        List<Fragment> m13609d = this.f172b.m13609d();
        C0173h<String, AbstractC0117v> m13595r = this.f172b.m13595r();
        if (m13609d == null && m13595r == null && m13717c == null) {
            return null;
        }
        C0056b c0056b = new C0056b();
        c0056b.f185a = m13717c;
        c0056b.f186b = m13609d;
        c0056b.f187c = m13595r;
        return c0056b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable m13610c = this.f172b.m13610c();
        if (m13610c != null) {
            bundle.putParcelable("android:support:fragments", m13610c);
        }
        if (this.f182l.m13320b() > 0) {
            bundle.putInt("android:support:next_request_index", this.f180j);
            int[] iArr = new int[this.f182l.m13320b()];
            String[] strArr = new String[this.f182l.m13320b()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.f182l.m13320b()) {
                    iArr[i2] = this.f182l.m13314d(i2);
                    strArr[i2] = this.f182l.m13313e(i2);
                    i = i2 + 1;
                } else {
                    bundle.putIntArray("android:support:request_indicies", iArr);
                    bundle.putStringArray("android:support:request_fragment_who", strArr);
                    return;
                }
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f175e = false;
        this.f176f = false;
        this.f171a.removeMessages(1);
        if (!this.f173c) {
            this.f173c = true;
            this.f172b.m13607f();
        }
        this.f172b.m13613b();
        this.f172b.m13599n();
        this.f172b.m13598o();
        this.f172b.m13606g();
        this.f172b.m13596q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f175e = true;
        this.f171a.sendEmptyMessage(1);
        this.f172b.m13603j();
    }

    /* renamed from: c */
    public Object m13717c() {
        return null;
    }

    /* renamed from: d */
    public void mo12110d() {
        if (Build.VERSION.SDK_INT >= 11) {
            C0074c.m13684a(this);
        } else {
            this.f178h = true;
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 11) {
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f173c);
        printWriter.print("mResumed=");
        printWriter.print(this.f174d);
        printWriter.print(" mStopped=");
        printWriter.print(this.f175e);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f176f);
        this.f172b.m13615a(str2, fileDescriptor, printWriter, strArr);
        this.f172b.m13626a().mo13541a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m13721a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* renamed from: a */
    private static String m13723a(View view) {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder((int) ItemInfo.APP_INTENT);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        sb.append(view.isFocused() ? 'F' : '.');
        sb.append(view.isSelected() ? 'S' : '.');
        sb.append(view.isPressed() ? 'P' : '.');
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                switch ((-16777216) & id) {
                    case 16777216:
                        resourcePackageName = "android";
                        String resourceTypeName = resources.getResourceTypeName(id);
                        String resourceEntryName = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName);
                        sb.append("/");
                        sb.append(resourceEntryName);
                        break;
                    case 2130706432:
                        resourcePackageName = "app";
                        String resourceTypeName2 = resources.getResourceTypeName(id);
                        String resourceEntryName2 = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName2);
                        sb.append("/");
                        sb.append(resourceEntryName2);
                        break;
                    default:
                        try {
                            resourcePackageName = resources.getResourcePackageName(id);
                            String resourceTypeName22 = resources.getResourceTypeName(id);
                            String resourceEntryName22 = resources.getResourceEntryName(id);
                            sb.append(" ");
                            sb.append(resourcePackageName);
                            sb.append(":");
                            sb.append(resourceTypeName22);
                            sb.append("/");
                            sb.append(resourceEntryName22);
                            break;
                        } catch (Resources.NotFoundException e) {
                            break;
                        }
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private void m13721a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m13723a(view));
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                m13721a(str2, printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    void m13720a(boolean z) {
        if (!this.f176f) {
            this.f176f = true;
            this.f177g = z;
            this.f171a.removeMessages(1);
            m13716e();
        }
    }

    /* renamed from: e */
    void m13716e() {
        this.f172b.m13614a(this.f177g);
        this.f172b.m13602k();
    }

    /* renamed from: a */
    public void m13725a(Fragment fragment) {
    }

    /* renamed from: f */
    public AbstractC0094o m13715f() {
        return this.f172b.m13626a();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.f181k && i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.p002v4.app.C0072b.InterfaceC0073a
    /* renamed from: a_ */
    public final void mo13685a_(int i) {
        if (!this.f179i && i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.app.Activity, android.support.p002v4.app.C0062a.InterfaceC0064a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String m13322a = this.f182l.m13322a(i3);
            this.f182l.m13316c(i3);
            if (m13322a == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment m13616a = this.f172b.m13616a(m13322a);
            if (m13616a == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + m13322a);
            } else {
                m13616a.m13780a(i & 65535, strArr, iArr);
            }
        }
    }

    /* renamed from: a */
    public void m13724a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.f181k = true;
        try {
            if (i == -1) {
                C0062a.m13699a(this, intent, -1, bundle);
            } else if (((-65536) & i) != 0) {
                throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
            } else {
                C0062a.m13699a(this, intent, ((m13718b(fragment) + 1) << 16) + (65535 & i), bundle);
            }
        } finally {
            this.f181k = false;
        }
    }

    /* renamed from: b */
    private int m13718b(Fragment fragment) {
        if (this.f182l.m13320b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.f182l.m13312f(this.f180j) >= 0) {
            this.f180j = (this.f180j + 1) % 65534;
        }
        int i = this.f180j;
        this.f182l.m13318b(i, fragment.f159q);
        this.f180j = (this.f180j + 1) % 65534;
        return i;
    }

    /* renamed from: android.support.v4.app.FragmentActivity$a */
    /* loaded from: classes.dex */
    class C0055a extends AbstractC0093n<FragmentActivity> {
        public C0055a() {
            super(FragmentActivity.this);
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: a */
        public void mo13588a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: a */
        public boolean mo13592a(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: b */
        public LayoutInflater mo13585b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: c */
        public void mo13582c() {
            FragmentActivity.this.mo12110d();
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: a */
        public void mo13591a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.m13724a(fragment, intent, i, bundle);
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: d */
        public boolean mo13581d() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: e */
        public int mo13580e() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.p002v4.app.AbstractC0093n
        /* renamed from: b */
        public void mo13584b(Fragment fragment) {
            FragmentActivity.this.m13725a(fragment);
        }

        @Override // android.support.p002v4.app.AbstractC0093n, android.support.p002v4.app.AbstractC0091l
        /* renamed from: a */
        public View mo13593a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // android.support.p002v4.app.AbstractC0093n, android.support.p002v4.app.AbstractC0091l
        /* renamed from: a */
        public boolean mo13594a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }
}
