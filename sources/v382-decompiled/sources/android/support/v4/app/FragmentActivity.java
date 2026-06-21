package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class FragmentActivity extends Activity {
    final Handler a = new Handler() { // from class: android.support.v4.app.FragmentActivity.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (FragmentActivity.this.f) {
                        FragmentActivity.this.a(false);
                        break;
                    }
                    break;
                case 2:
                    FragmentActivity.this.b();
                    FragmentActivity.this.b.f();
                    break;
                default:
                    super.handleMessage(message);
                    break;
            }
        }
    };
    final m b = new m();
    final j c = new j() { // from class: android.support.v4.app.FragmentActivity.2
        @Override // android.support.v4.app.j
        public View a(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // android.support.v4.app.j
        public boolean a() {
            Window window = FragmentActivity.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    };
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    android.support.v4.f.l l;
    x m;

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.b.j();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            if (this.b.f == null || i4 < 0 || i4 >= this.b.f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            }
            Fragment fragment = (Fragment) this.b.f.get(i4);
            if (fragment == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                fragment.a(65535 & i, i2, intent);
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.b.d()) {
            a();
        }
    }

    public void a() {
        a.a(this);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.b.a(this, this.c, (Fragment) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        i iVar = (i) getLastNonConfigurationInstance();
        if (iVar != null) {
            this.l = iVar.e;
        }
        if (bundle != null) {
            this.b.a(bundle.getParcelable("android:support:fragments"), iVar != null ? iVar.d : null);
        }
        this.b.k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.b.a(menu, getMenuInflater());
            if (Build.VERSION.SDK_INT < 11) {
                return true;
            }
            return onCreatePanelMenu;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        View onCreateView = this.b.onCreateView(str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        a(false);
        this.b.s();
        if (this.m != null) {
            this.m.h();
        }
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
        this.b.t();
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
        this.e = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            b();
        }
        this.b.o();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.j();
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.f();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        b();
        this.b.f();
    }

    protected void b() {
        this.b.n();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.i) {
            this.i = false;
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
        boolean z;
        if (this.f) {
            a(true);
        }
        Object c = c();
        ArrayList h = this.b.h();
        if (this.l != null) {
            int size = this.l.size();
            x[] xVarArr = new x[size];
            for (int i = size - 1; i >= 0; i--) {
                xVarArr[i] = (x) this.l.c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                x xVar = xVarArr[i2];
                if (xVar.g) {
                    z = true;
                } else {
                    xVar.h();
                    this.l.remove(xVar.d);
                }
            }
        } else {
            z = false;
        }
        if (h == null && !z && c == null) {
            return null;
        }
        i iVar = new i();
        iVar.a = null;
        iVar.b = c;
        iVar.c = null;
        iVar.d = h;
        iVar.e = this.l;
        return iVar;
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable i = this.b.i();
        if (i != null) {
            bundle.putParcelable("android:support:fragments", i);
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        this.f = false;
        this.g = false;
        this.a.removeMessages(1);
        if (!this.d) {
            this.d = true;
            this.b.l();
        }
        this.b.j();
        this.b.f();
        if (!this.k) {
            this.k = true;
            if (this.m != null) {
                this.m.b();
            } else if (!this.j) {
                this.m = a("(root)", this.k, false);
                if (this.m != null && !this.m.f) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.m();
        if (this.l != null) {
            int size = this.l.size();
            x[] xVarArr = new x[size];
            for (int i = size - 1; i >= 0; i--) {
                xVarArr[i] = (x) this.l.c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                x xVar = xVarArr[i2];
                xVar.e();
                xVar.g();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.p();
    }

    public Object c() {
        return null;
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 11) {
            c.a(this);
        } else {
            this.i = true;
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = String.valueOf(str) + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(String.valueOf(str) + "  ", fileDescriptor, printWriter, strArr);
        }
        this.b.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(String.valueOf(str) + "  ", printWriter, getWindow().getDecorView());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:39:0x00ed. Please report as an issue. */
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
            String str2 = String.valueOf(str) + "  ";
            for (int i = 0; i < childCount; i++) {
                a(str2, printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    void a(boolean z) {
        if (!this.g) {
            this.g = true;
            this.h = z;
            this.a.removeMessages(1);
            e();
        }
    }

    void e() {
        if (this.k) {
            this.k = false;
            if (this.m != null) {
                if (!this.h) {
                    this.m.c();
                } else {
                    this.m.d();
                }
            }
        }
        this.b.q();
    }

    public void a(Fragment fragment) {
    }

    public k f() {
        return this.b;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }

    public void a(Fragment fragment, Intent intent, int i) {
        if (i == -1) {
            super.startActivityForResult(intent, -1);
        } else {
            if (((-65536) & i) != 0) {
                throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
            }
            super.startActivityForResult(intent, ((fragment.p + 1) << 16) + (65535 & i));
        }
    }

    void a(String str) {
        x xVar;
        if (this.l != null && (xVar = (x) this.l.get(str)) != null && !xVar.g) {
            xVar.h();
            this.l.remove(str);
        }
    }

    x a(String str, boolean z, boolean z2) {
        if (this.l == null) {
            this.l = new android.support.v4.f.l();
        }
        x xVar = (x) this.l.get(str);
        if (xVar == null) {
            if (z2) {
                x xVar2 = new x(str, this, z);
                this.l.put(str, xVar2);
                return xVar2;
            }
            return xVar;
        }
        xVar.a(this);
        return xVar;
    }
}
