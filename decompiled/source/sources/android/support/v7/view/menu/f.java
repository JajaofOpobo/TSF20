package android.support.v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.a.a;
import android.util.SparseArray;
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
public class f implements android.support.v4.b.a.a {
    private static final int[] d = {1, 4, 5, 3, 2, 0};
    CharSequence a;
    Drawable b;
    View c;
    private final Context e;
    private final Resources f;
    private boolean g;
    private boolean h;
    private a i;
    private ContextMenu.ContextMenuInfo q;
    private h x;
    private boolean y;
    private int p = 0;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<h> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<l>> w = new CopyOnWriteArrayList<>();
    private ArrayList<h> j = new ArrayList<>();
    private ArrayList<h> k = new ArrayList<>();
    private boolean l = true;
    private ArrayList<h> m = new ArrayList<>();
    private ArrayList<h> n = new ArrayList<>();
    private boolean o = true;

    /* loaded from: classes.dex */
    public interface a {
        void a(f fVar);

        boolean a(f fVar, MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface b {
        boolean a(h hVar);
    }

    public f(Context context) {
        this.e = context;
        this.f = context.getResources();
        e(true);
    }

    public f a(int i) {
        this.p = i;
        return this;
    }

    public void a(l lVar) {
        a(lVar, this.e);
    }

    public void a(l lVar, Context context) {
        this.w.add(new WeakReference<>(lVar));
        lVar.a(context, this);
        this.o = true;
    }

    public void b(l lVar) {
        Iterator<WeakReference<l>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<l> next = it.next();
            l lVar2 = next.get();
            if (lVar2 == null || lVar2 == lVar) {
                this.w.remove(next);
            }
        }
    }

    private void d(boolean z) {
        if (!this.w.isEmpty()) {
            g();
            Iterator<WeakReference<l>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.w.remove(next);
                } else {
                    lVar.b(z);
                }
            }
            h();
        }
    }

    private boolean a(p pVar, l lVar) {
        if (this.w.isEmpty()) {
            return false;
        }
        boolean a2 = lVar != null ? lVar.a(pVar) : false;
        Iterator<WeakReference<l>> it = this.w.iterator();
        while (true) {
            boolean z = a2;
            if (!it.hasNext()) {
                return z;
            }
            WeakReference<l> next = it.next();
            l lVar2 = next.get();
            if (lVar2 == null) {
                this.w.remove(next);
            } else if (!z) {
                z = lVar2.a(pVar);
            }
            a2 = z;
        }
    }

    public void a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray<Parcelable> sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View a2 = android.support.v4.view.q.a(item);
            if (a2 != null && a2.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                a2.saveHierarchyState(sparseArray);
                if (android.support.v4.view.q.c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray<Parcelable> sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((p) item.getSubMenu()).a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(a(), sparseArray);
        }
    }

    public void b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View a2 = android.support.v4.view.q.a(item);
                if (a2 != null && a2.getId() != -1) {
                    a2.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((p) item.getSubMenu()).b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                android.support.v4.view.q.b(findItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String a() {
        return "android:menu:actionviewstates";
    }

    public void a(a aVar) {
        this.i = aVar;
    }

    protected MenuItem a(int i, int i2, int i3, CharSequence charSequence) {
        int d2 = d(i3);
        h a2 = a(i, i2, i3, d2, charSequence, this.p);
        if (this.q != null) {
            a2.a(this.q);
        }
        this.j.add(a(this.j, d2), a2);
        b(true);
        return a2;
    }

    private h a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new h(this, i, i2, i3, i4, charSequence, i5);
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
        h hVar = (h) a(i, i2, i3, charSequence);
        p pVar = new p(this.e, this, hVar);
        hVar.a(pVar);
        return pVar;
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
        a(b(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int c = c(i);
        if (c >= 0) {
            int size = this.j.size() - c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.j.get(c).getGroupId() != i) {
                    break;
                }
                a(c, false);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.j.size();
        for (int i = 0; i < size; i++) {
            h hVar = this.j.get(i);
            if (hVar.getGroupId() == groupId && hVar.g() && hVar.isCheckable()) {
                hVar.b(hVar == menuItem);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.a(z2);
                hVar.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            h hVar = this.j.get(i2);
            i2++;
            z2 = (hVar.getGroupId() == i && hVar.c(z)) ? true : z2;
        }
        if (z2) {
            b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.j.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = this.j.get(i2);
            if (hVar.getGroupId() == i) {
                hVar.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.j.get(i).isVisible()) {
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
            h hVar = this.j.get(i2);
            if (hVar.getItemId() != i) {
                if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i)) != null) {
                    return findItem;
                }
            } else {
                return hVar;
            }
        }
        return null;
    }

    public int b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public int c(int i) {
        return a(i, 0);
    }

    public int a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (this.j.get(i3).getGroupId() == i) {
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
        return this.j.get(i);
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

    private static int d(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (d[i2] << 16) | (65535 & i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        return this.g;
    }

    private void e(boolean z) {
        boolean z2 = true;
        this.h = (z && this.f.getConfiguration().keyboard != 1 && this.f.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : false;
    }

    public boolean c() {
        return this.h;
    }

    Resources d() {
        return this.f;
    }

    public Context e() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(f fVar, MenuItem menuItem) {
        return this.i != null && this.i.a(fVar, menuItem);
    }

    public void f() {
        if (this.i != null) {
            this.i.a(this);
        }
    }

    private static int a(ArrayList<h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        h a2 = a(i, keyEvent);
        boolean z = false;
        if (a2 != null) {
            z = a(a2, i2);
        }
        if ((i2 & 2) != 0) {
            a(true);
        }
        return z;
    }

    void a(List<h> list, int i, KeyEvent keyEvent) {
        boolean b2 = b();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.j.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.j.get(i2);
                if (hVar.hasSubMenu()) {
                    ((f) hVar.getSubMenu()).a(list, i, keyEvent);
                }
                char alphabeticShortcut = b2 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (b2 && alphabeticShortcut == '\b' && i == 67)) && hVar.isEnabled())) {
                    list.add(hVar);
                }
            }
        }
    }

    h a(int i, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.v;
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
            return arrayList.get(0);
        }
        boolean b2 = b();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = arrayList.get(i2);
            char alphabeticShortcut = b2 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return hVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return hVar;
            }
            if (b2 && alphabeticShortcut == '\b' && i == 67) {
                return hVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return a(findItem(i), i2);
    }

    public boolean a(MenuItem menuItem, int i) {
        return a(menuItem, (l) null, i);
    }

    public boolean a(MenuItem menuItem, l lVar, int i) {
        h hVar = (h) menuItem;
        if (hVar == null || !hVar.isEnabled()) {
            return false;
        }
        boolean b2 = hVar.b();
        android.support.v4.view.d a2 = hVar.a();
        boolean z = a2 != null && a2.e();
        if (hVar.n()) {
            boolean expandActionView = hVar.expandActionView() | b2;
            if (expandActionView) {
                a(true);
                return expandActionView;
            }
            return expandActionView;
        } else if (hVar.hasSubMenu() || z) {
            a(false);
            if (!hVar.hasSubMenu()) {
                hVar.a(new p(e(), this, hVar));
            }
            p pVar = (p) hVar.getSubMenu();
            if (z) {
                a2.a(pVar);
            }
            boolean a3 = a(pVar, lVar) | b2;
            if (!a3) {
                a(true);
                return a3;
            }
            return a3;
        } else {
            if ((i & 1) == 0) {
                a(true);
            }
            return b2;
        }
    }

    public final void a(boolean z) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<l>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.w.remove(next);
                } else {
                    lVar.a(this, z);
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
            d(z);
            return;
        }
        this.s = true;
    }

    public void g() {
        if (!this.r) {
            this.r = true;
            this.s = false;
        }
    }

    public void h() {
        this.r = false;
        if (this.s) {
            this.s = false;
            b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(h hVar) {
        this.l = true;
        b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(h hVar) {
        this.o = true;
        b(true);
    }

    public ArrayList<h> i() {
        if (this.l) {
            this.k.clear();
            int size = this.j.size();
            for (int i = 0; i < size; i++) {
                h hVar = this.j.get(i);
                if (hVar.isVisible()) {
                    this.k.add(hVar);
                }
            }
            this.l = false;
            this.o = true;
            return this.k;
        }
        return this.k;
    }

    public void j() {
        boolean b2;
        ArrayList<h> i = i();
        if (this.o) {
            Iterator<WeakReference<l>> it = this.w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.w.remove(next);
                    b2 = z;
                } else {
                    b2 = lVar.b() | z;
                }
                z = b2;
            }
            if (z) {
                this.m.clear();
                this.n.clear();
                int size = i.size();
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar = i.get(i2);
                    if (hVar.j()) {
                        this.m.add(hVar);
                    } else {
                        this.n.add(hVar);
                    }
                }
            } else {
                this.m.clear();
                this.n.clear();
                this.n.addAll(i());
            }
            this.o = false;
        }
    }

    public ArrayList<h> k() {
        j();
        return this.m;
    }

    public ArrayList<h> l() {
        j();
        return this.n;
    }

    public void clearHeader() {
        this.b = null;
        this.a = null;
        this.c = null;
        b(false);
    }

    private void a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources d2 = d();
        if (view != null) {
            this.c = view;
            this.a = null;
            this.b = null;
        } else {
            if (i > 0) {
                this.a = d2.getText(i);
            } else if (charSequence != null) {
                this.a = charSequence;
            }
            if (i2 > 0) {
                this.b = android.support.v4.content.a.a(e(), i2);
            } else if (drawable != null) {
                this.b = drawable;
            }
            this.c = null;
        }
        b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f a(CharSequence charSequence) {
        a(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f a(Drawable drawable) {
        a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public f a(View view) {
        a(0, null, 0, null, view);
        return this;
    }

    public CharSequence m() {
        return this.a;
    }

    public Drawable n() {
        return this.b;
    }

    public View o() {
        return this.c;
    }

    public f p() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean q() {
        return this.t;
    }

    public boolean c(h hVar) {
        boolean z = false;
        if (!this.w.isEmpty()) {
            g();
            Iterator<WeakReference<l>> it = this.w.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.w.remove(next);
                    z = z2;
                } else {
                    z = lVar.a(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            h();
            if (z) {
                this.x = hVar;
            }
        }
        return z;
    }

    public boolean d(h hVar) {
        boolean z = false;
        if (!this.w.isEmpty() && this.x == hVar) {
            g();
            Iterator<WeakReference<l>> it = this.w.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<l> next = it.next();
                l lVar = next.get();
                if (lVar == null) {
                    this.w.remove(next);
                    z = z2;
                } else {
                    z = lVar.b(this, hVar);
                    if (z) {
                        break;
                    }
                }
            }
            h();
            if (z) {
                this.x = null;
            }
        }
        return z;
    }

    public h r() {
        return this.x;
    }

    public void c(boolean z) {
        this.y = z;
    }
}
