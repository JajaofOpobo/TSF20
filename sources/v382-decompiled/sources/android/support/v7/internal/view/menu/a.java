package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class a implements android.support.v4.c.a.a {
    private static final int[] d = {1, 4, 5, 3, 2, 0};
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private b i;
    private ContextMenu.ContextMenuInfo q;
    private c x;
    private int p = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList v = new ArrayList();
    private CopyOnWriteArrayList w = new CopyOnWriteArrayList();
    private ArrayList j = new ArrayList();
    private ArrayList k = new ArrayList();
    private boolean l = true;
    private ArrayList m = new ArrayList();
    private ArrayList n = new ArrayList();
    private boolean o = true;

    public a(Context context) {
        this.e = context;
        this.f = context.getResources();
        d(true);
    }

    public void a(f fVar, Context context) {
        this.w.add(new WeakReference(fVar));
        fVar.a(context, this);
        this.o = true;
    }

    private void c(boolean z) {
        if (!this.w.isEmpty()) {
            e();
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                f fVar = (f) weakReference.get();
                if (fVar == null) {
                    this.w.remove(weakReference);
                } else {
                    fVar.b(z);
                }
            }
            f();
        }
    }

    private boolean a(j jVar, f fVar) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean a = fVar != null ? fVar.a(jVar) : false;
        Iterator it = this.w.iterator();
        boolean z = a;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            f fVar2 = (f) weakReference.get();
            if (fVar2 == null) {
                this.w.remove(weakReference);
            } else if (!z) {
                z = fVar2.a(jVar);
            }
        }
        return z;
    }

    public void a(b bVar) {
        this.i = bVar;
    }

    private MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int c = c(i3);
        c a = a(i, i2, i3, c, charSequence, this.p);
        if (this.q != null) {
            a.a(this.q);
        }
        this.j.add(a(this.j, c), a);
        b(true);
        return a;
    }

    private c a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new c(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return a(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return a(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        c cVar = (c) a(i, i2, i3, charSequence);
        j jVar = new j(this.e, this, cVar);
        cVar.a(jVar);
        return jVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.e.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        a(a(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int b = b(i);
        if (b >= 0) {
            int size = this.j.size() - b;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((c) this.j.get(b)).getGroupId() != i) {
                    break;
                }
                a(b, false);
                i2 = i3;
            }
            b(true);
        }
    }

    private void a(int i, boolean z) {
        if (i >= 0 && i < this.j.size()) {
            this.j.remove(i);
            if (z) {
                b(true);
            }
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.x != null) {
            d(this.x);
        }
        this.j.clear();
        b(true);
    }

    void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) this.j.get(i);
            if (cVar.getGroupId() == groupId && cVar.f() && cVar.isCheckable()) {
                cVar.b(cVar == menuItem);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) this.j.get(i2);
            if (cVar.getGroupId() == i) {
                cVar.a(z2);
                cVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            c cVar = (c) this.j.get(i2);
            i2++;
            z2 = (cVar.getGroupId() == i && cVar.c(z)) ? true : z2;
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) this.j.get(i2);
            if (cVar.getGroupId() == i) {
                cVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((c) this.j.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) this.j.get(i2);
            if (cVar.getItemId() == i) {
                return cVar;
            }
            if (cVar.hasSubMenu() && (findItem = cVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int a(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((c) this.j.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int b(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (((c) this.j.get(i3)).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.j.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.j.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.g = z;
        b(false);
    }

    private static int c(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (d[i2] << 16) | (65535 & i);
    }

    boolean a() {
        return this.g;
    }

    private void d(boolean z) {
        this.h = z && this.f.getConfiguration().keyboard != 1 && this.f.getBoolean(android.support.v7.a.c.abc_config_showMenuShortcutsWhenKeyboardPresent);
    }

    public boolean b() {
        return this.h;
    }

    Resources c() {
        return this.f;
    }

    public Context d() {
        return this.e;
    }

    boolean a(a aVar, MenuItem menuItem) {
        return this.i != null && this.i.a(aVar, menuItem);
    }

    private static int a(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((c) arrayList.get(size)).b() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        c a = a(i, keyEvent);
        boolean z = false;
        if (a != null) {
            z = a(a, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    void a(List list, int i, KeyEvent keyEvent) {
        boolean a = a();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                c cVar = (c) this.j.get(i2);
                if (cVar.hasSubMenu()) {
                    ((a) cVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = a ? cVar.getAlphabeticShortcut() : cVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (a && alphabeticShortcut == '\b' && i == 67)) && cVar.isEnabled())) {
                    list.add(cVar);
                }
            }
        }
    }

    c a(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.v;
        arrayList.clear();
        a(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (c) arrayList.get(0);
        }
        boolean a = a();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) arrayList.get(i2);
            char alphabeticShortcut = a ? cVar.getAlphabeticShortcut() : cVar.getNumericShortcut();
            if (alphabeticShortcut != keyData.meta[0] || (metaState & 2) != 0) {
                if (alphabeticShortcut != keyData.meta[2] || (metaState & 2) == 0) {
                    if (a && alphabeticShortcut == '\b' && i == 67) {
                        return cVar;
                    }
                } else {
                    return cVar;
                }
            } else {
                return cVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (f) null, i);
    }

    public boolean a(MenuItem menuItem, f fVar, int i) {
        c cVar = (c) menuItem;
        if (cVar == null || !cVar.isEnabled()) {
            return false;
        }
        boolean a = cVar.a();
        android.support.v4.view.j i2 = cVar.i();
        boolean z = i2 != null && i2.e();
        if (cVar.j()) {
            boolean expandActionView = cVar.expandActionView() | a;
            if (expandActionView) {
                a(true);
                return expandActionView;
            }
            return expandActionView;
        }
        if (cVar.hasSubMenu() || z) {
            a(false);
            if (!cVar.hasSubMenu()) {
                cVar.a(new j(d(), this, cVar));
            }
            j jVar = (j) cVar.getSubMenu();
            if (z) {
                i2.a(jVar);
            }
            boolean a2 = a(jVar, fVar) | a;
            if (!a2) {
                a(true);
                return a2;
            }
            return a2;
        }
        if ((i & 1) == 0) {
            a(true);
        }
        return a;
    }

    public final void a(boolean z) {
        if (!this.u) {
            this.u = true;
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                f fVar = (f) weakReference.get();
                if (fVar == null) {
                    this.w.remove(weakReference);
                } else {
                    fVar.a(this, z);
                }
            }
            this.u = false;
        }
    }

    @Override // android.view.Menu
    public void close() {
        a(true);
    }

    public void b(boolean z) {
        if (!this.r) {
            if (z) {
                this.l = true;
                this.o = true;
            }
            c(z);
            return;
        }
        this.s = true;
    }

    public void e() {
        if (!this.r) {
            this.r = true;
            this.s = false;
        }
    }

    public void f() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(true);
        }
    }

    void a(c cVar) {
        this.l = true;
        b(true);
    }

    void b(c cVar) {
        this.o = true;
        b(true);
    }

    public ArrayList g() {
        if (!this.l) {
            return this.k;
        }
        this.k.clear();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            c cVar = (c) this.j.get(i);
            if (cVar.isVisible()) {
                this.k.add(cVar);
            }
        }
        this.l = false;
        this.o = true;
        return this.k;
    }

    public void h() {
        ArrayList g = g();
        if (this.o) {
            Iterator it = this.w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                f fVar = (f) weakReference.get();
                if (fVar == null) {
                    this.w.remove(weakReference);
                } else {
                    z = fVar.e() | z;
                }
            }
            if (z) {
                this.m.clear();
                this.n.clear();
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    c cVar = (c) g.get(i);
                    if (cVar.h()) {
                        this.m.add(cVar);
                    } else {
                        this.n.add(cVar);
                    }
                }
            } else {
                this.m.clear();
                this.n.clear();
                this.n.addAll(g());
            }
            this.o = false;
        }
    }

    public ArrayList i() {
        h();
        return this.n;
    }

    public void clearHeader() {
        this.b = null;
        this.a = null;
        this.c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources c = c();
        if (view != null) {
            this.c = view;
            this.a = null;
            this.b = null;
        } else {
            if (i > 0) {
                this.a = c.getText(i);
            } else if (charSequence != null) {
                this.a = charSequence;
            }
            if (i2 > 0) {
                this.b = android.support.v4.a.a.a(d(), i2);
            } else if (drawable != null) {
                this.b = drawable;
            }
            this.c = null;
        }
        b(false);
    }

    protected a a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    protected a a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    protected a a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public a j() {
        return this;
    }

    boolean k() {
        return this.t;
    }

    public boolean c(c cVar) {
        boolean z = false;
        if (!this.w.isEmpty()) {
            e();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                f fVar = (f) weakReference.get();
                if (fVar == null) {
                    this.w.remove(weakReference);
                } else {
                    z = fVar.a(this, cVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            f();
            if (z) {
                this.x = cVar;
            }
        }
        return z;
    }

    public boolean d(c cVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == cVar) {
            e();
            Iterator it = this.w.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference weakReference = (WeakReference) it.next();
                f fVar = (f) weakReference.get();
                if (fVar == null) {
                    this.w.remove(weakReference);
                } else {
                    z = fVar.b(this, cVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            f();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public c l() {
        return this.x;
    }
}
