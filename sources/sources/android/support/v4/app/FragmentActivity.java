package android.support.v4.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.a;
import android.support.v4.app.b;
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

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class FragmentActivity extends j implements a.InterfaceC0003a, b.a {
    final Handler a = new Handler() { // from class: android.support.v4.app.FragmentActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (FragmentActivity.this.e) {
                        FragmentActivity.this.a(false);
                    }
                    break;
                case 2:
                    FragmentActivity.this.b();
                    FragmentActivity.this.b.n();
                    break;
                default:
                    super.handleMessage(message);
                    break;
            }
        }
    };
    final m b = m.a(new a());
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    int j;
    boolean k;
    android.support.v4.d.i<String> l;

    @Override // android.support.v4.app.j, android.app.Activity, android.view.LayoutInflater.Factory2
    public /* bridge */ /* synthetic */ View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.support.v4.app.h, android.app.Activity, android.view.LayoutInflater.Factory
    public /* bridge */ /* synthetic */ View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    static final class b {
        Object a;
        List<Fragment> b;
        android.support.v4.d.h<String, v> c;

        b() {
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.b.b();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String strA = this.l.a(i4);
            this.l.c(i4);
            if (strA == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentA = this.b.a(strA);
            if (fragmentA == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strA);
                return;
            } else {
                fragmentA.a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.b.a().c()) {
            a_();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    @Override // android.support.v4.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.b.a((Fragment) null);
        super.onCreate(bundle);
        b bVar = (b) getLastNonConfigurationInstance();
        if (bVar != null) {
            this.b.a(bVar.c);
        }
        if (bundle != null) {
            this.b.a(bundle.getParcelable("android:support:fragments"), bVar != null ? bVar.b : null);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.j = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.l = new android.support.v4.d.i<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.l.b(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.l == null) {
            this.l = new android.support.v4.d.i<>();
            this.j = 0;
        }
        this.b.e();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.b.a(menu, getMenuInflater());
            if (Build.VERSION.SDK_INT < 11) {
                return true;
            }
            return zOnCreatePanelMenu;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.support.v4.app.h
    final View a(View view, String str, Context context, AttributeSet attributeSet) {
        return this.b.a(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a(false);
        this.b.l();
        this.b.p();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.b.m();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.b.a(menuItem);
            case 6:
                return this.b.b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.b.b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.d = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            b();
        }
        this.b.i();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.b();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.b.b();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.d = true;
        this.b.n();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        b();
        this.b.n();
    }

    protected void b() {
        this.b.h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.h) {
            this.h = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return a(view, menu) | this.b.a(menu);
    }

    protected boolean a(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        if (this.e) {
            a(true);
        }
        Object objC = c();
        List<Fragment> listD = this.b.d();
        android.support.v4.d.h<String, v> hVarR = this.b.r();
        if (listD == null && hVarR == null && objC == null) {
            return null;
        }
        b bVar = new b();
        bVar.a = objC;
        bVar.b = listD;
        bVar.c = hVarR;
        return bVar;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelableC = this.b.c();
        if (parcelableC != null) {
            bundle.putParcelable("android:support:fragments", parcelableC);
        }
        if (this.l.b() > 0) {
            bundle.putInt("android:support:next_request_index", this.j);
            int[] iArr = new int[this.l.b()];
            String[] strArr = new String[this.l.b()];
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 < this.l.b()) {
                    iArr[i2] = this.l.d(i2);
                    strArr[i2] = this.l.e(i2);
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
        this.e = false;
        this.f = false;
        this.a.removeMessages(1);
        if (!this.c) {
            this.c = true;
            this.b.f();
        }
        this.b.b();
        this.b.n();
        this.b.o();
        this.b.g();
        this.b.q();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.e = true;
        this.a.sendEmptyMessage(1);
        this.b.j();
    }

    public Object c() {
        return null;
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 11) {
            c.a(this);
        } else {
            this.h = true;
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
        printWriter.print(this.c);
        printWriter.print("mResumed=");
        printWriter.print(this.d);
        printWriter.print(" mStopped=");
        printWriter.print(this.e);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f);
        this.b.a(str2, fileDescriptor, printWriter, strArr);
        this.b.a().a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ed. Please report as an issue. */
    private static String a(View view) {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder(ItemInfo.APP_INTENT);
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
                        } catch (Resources.NotFoundException e) {
                        }
                        break;
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                a(str2, printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    void a(boolean z) {
        if (!this.f) {
            this.f = true;
            this.g = z;
            this.a.removeMessages(1);
            e();
        }
    }

    void e() {
        this.b.a(this.g);
        this.b.k();
    }

    public void a(Fragment fragment) {
    }

    public o f() {
        return this.b.a();
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.k && i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.support.v4.app.b.a
    public final void a_(int i) {
        if (!this.i && i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    @Override // android.app.Activity, android.support.v4.app.a.InterfaceC0003a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String strA = this.l.a(i3);
            this.l.c(i3);
            if (strA == null) {
                Log.w("FragmentActivity", "Activity result delivered for unknown Fragment.");
                return;
            }
            Fragment fragmentA = this.b.a(strA);
            if (fragmentA == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for who: " + strA);
            } else {
                fragmentA.a(i & 65535, strArr, iArr);
            }
        }
    }

    public void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
        this.k = true;
        try {
            if (i == -1) {
                android.support.v4.app.a.a(this, intent, -1, bundle);
            } else {
                if (((-65536) & i) != 0) {
                    throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
                }
                android.support.v4.app.a.a(this, intent, ((b(fragment) + 1) << 16) + (65535 & i), bundle);
            }
        } finally {
            this.k = false;
        }
    }

    private int b(Fragment fragment) {
        if (this.l.b() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (this.l.f(this.j) >= 0) {
            this.j = (this.j + 1) % 65534;
        }
        int i = this.j;
        this.l.b(i, fragment.q);
        this.j = (this.j + 1) % 65534;
        return i;
    }

    class a extends n<FragmentActivity> {
        public a() {
            super(FragmentActivity.this);
        }

        @Override // android.support.v4.app.n
        public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            FragmentActivity.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // android.support.v4.app.n
        public boolean a(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // android.support.v4.app.n
        public LayoutInflater b() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // android.support.v4.app.n
        public void c() {
            FragmentActivity.this.d();
        }

        @Override // android.support.v4.app.n
        public void a(Fragment fragment, Intent intent, int i, Bundle bundle) {
            FragmentActivity.this.a(fragment, intent, i, bundle);
        }

        @Override // android.support.v4.app.n
        public boolean d() {
            return FragmentActivity.this.getWindow() != null;
        }

        @Override // android.support.v4.app.n
        public int e() {
            Window window = FragmentActivity.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // android.support.v4.app.n
        public void b(Fragment fragment) {
            FragmentActivity.this.a(fragment);
        }

        @Override // android.support.v4.app.n, android.support.v4.app.l
        public View a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // android.support.v4.app.n, android.support.v4.app.l
        public boolean a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    }
}
