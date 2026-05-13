package android.support.p013v7.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p002v4.content.C0144a;
import android.support.p002v4.p005b.p006a.InterfaceMenuC0127a;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.support.p013v7.p014a.C0535a;
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
/* renamed from: android.support.v7.view.menu.f */
/* loaded from: classes.dex */
public class C0628f implements InterfaceMenuC0127a {

    /* renamed from: d */
    private static final int[] f1519d = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    CharSequence f1520a;

    /* renamed from: b */
    Drawable f1521b;

    /* renamed from: c */
    View f1522c;

    /* renamed from: e */
    private final Context f1523e;

    /* renamed from: f */
    private final Resources f1524f;

    /* renamed from: g */
    private boolean f1525g;

    /* renamed from: h */
    private boolean f1526h;

    /* renamed from: i */
    private InterfaceC0629a f1527i;

    /* renamed from: q */
    private ContextMenu.ContextMenuInfo f1535q;

    /* renamed from: x */
    private C0632h f1542x;

    /* renamed from: y */
    private boolean f1543y;

    /* renamed from: p */
    private int f1534p = 0;

    /* renamed from: r */
    private boolean f1536r = false;

    /* renamed from: s */
    private boolean f1537s = false;

    /* renamed from: t */
    private boolean f1538t = false;

    /* renamed from: u */
    private boolean f1539u = false;

    /* renamed from: v */
    private ArrayList<C0632h> f1540v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0643l>> f1541w = new CopyOnWriteArrayList<>();

    /* renamed from: j */
    private ArrayList<C0632h> f1528j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0632h> f1529k = new ArrayList<>();

    /* renamed from: l */
    private boolean f1530l = true;

    /* renamed from: m */
    private ArrayList<C0632h> f1531m = new ArrayList<>();

    /* renamed from: n */
    private ArrayList<C0632h> f1532n = new ArrayList<>();

    /* renamed from: o */
    private boolean f1533o = true;

    /* renamed from: android.support.v7.view.menu.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0629a {
        /* renamed from: a */
        void mo11118a(C0628f c0628f);

        /* renamed from: a */
        boolean mo11117a(C0628f c0628f, MenuItem menuItem);
    }

    /* renamed from: android.support.v7.view.menu.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0630b {
        /* renamed from: a */
        boolean mo11598a(C0632h c0632h);
    }

    public C0628f(Context context) {
        this.f1523e = context;
        this.f1524f = context.getResources();
        m11754e(true);
    }

    /* renamed from: a */
    public C0628f m11786a(int i) {
        this.f1534p = i;
        return this;
    }

    /* renamed from: a */
    public void m11776a(InterfaceC0643l interfaceC0643l) {
        m11775a(interfaceC0643l, this.f1523e);
    }

    /* renamed from: a */
    public void m11775a(InterfaceC0643l interfaceC0643l, Context context) {
        this.f1541w.add(new WeakReference<>(interfaceC0643l));
        interfaceC0643l.mo11319a(context, this);
        this.f1533o = true;
    }

    /* renamed from: b */
    public void m11762b(InterfaceC0643l interfaceC0643l) {
        Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0643l> next = it.next();
            InterfaceC0643l interfaceC0643l2 = next.get();
            if (interfaceC0643l2 == null || interfaceC0643l2 == interfaceC0643l) {
                this.f1541w.remove(next);
            }
        }
    }

    /* renamed from: d */
    private void m11756d(boolean z) {
        if (!this.f1541w.isEmpty()) {
            m11752g();
            Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0643l> next = it.next();
                InterfaceC0643l interfaceC0643l = next.get();
                if (interfaceC0643l == null) {
                    this.f1541w.remove(next);
                } else {
                    interfaceC0643l.mo11313b(z);
                }
            }
            m11751h();
        }
    }

    /* renamed from: a */
    private boolean m11774a(SubMenuC0649p subMenuC0649p, InterfaceC0643l interfaceC0643l) {
        if (this.f1541w.isEmpty()) {
            return false;
        }
        boolean mo11316a = interfaceC0643l != null ? interfaceC0643l.mo11316a(subMenuC0649p) : false;
        Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
        while (true) {
            boolean z = mo11316a;
            if (!it.hasNext()) {
                return z;
            }
            WeakReference<InterfaceC0643l> next = it.next();
            InterfaceC0643l interfaceC0643l2 = next.get();
            if (interfaceC0643l2 == null) {
                this.f1541w.remove(next);
            } else if (!z) {
                z = interfaceC0643l2.mo11316a(subMenuC0649p);
            }
            mo11316a = z;
        }
    }

    /* renamed from: a */
    public void m11778a(Bundle bundle) {
        int size = size();
        int i = 0;
        SparseArray<Parcelable> sparseArray = null;
        while (i < size) {
            MenuItem item = getItem(i);
            View m12618a = C0419q.m12618a(item);
            if (m12618a != null && m12618a.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                m12618a.saveHierarchyState(sparseArray);
                if (C0419q.m12612c(item)) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            SparseArray<Parcelable> sparseArray2 = sparseArray;
            if (item.hasSubMenu()) {
                ((SubMenuC0649p) item.getSubMenu()).m11778a(bundle);
            }
            i++;
            sparseArray = sparseArray2;
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo11676a(), sparseArray);
        }
    }

    /* renamed from: b */
    public void m11764b(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo11676a());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View m12618a = C0419q.m12618a(item);
                if (m12618a != null && m12618a.getId() != -1) {
                    m12618a.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((SubMenuC0649p) item.getSubMenu()).m11764b(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                C0419q.m12614b(findItem);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public String mo11676a() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: a */
    public void mo11675a(InterfaceC0629a interfaceC0629a) {
        this.f1527i = interfaceC0629a;
    }

    /* renamed from: a */
    protected MenuItem m11783a(int i, int i2, int i3, CharSequence charSequence) {
        int m11757d = m11757d(i3);
        C0632h m11784a = m11784a(i, i2, i3, m11757d, charSequence, this.f1534p);
        if (this.f1535q != null) {
            m11784a.m11732a(this.f1535q);
        }
        this.f1528j.add(m11768a(this.f1528j, m11757d), m11784a);
        m11761b(true);
        return m11784a;
    }

    /* renamed from: a */
    private C0632h m11784a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0632h(this, i, i2, i3, i4, charSequence, i5);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m11783a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m11783a(0, 0, 0, this.f1524f.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m11783a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m11783a(i, i2, i3, this.f1524f.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1524f.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0632h c0632h = (C0632h) m11783a(i, i2, i3, charSequence);
        SubMenuC0649p subMenuC0649p = new SubMenuC0649p(this.f1523e, this, c0632h);
        c0632h.m11733a(subMenuC0649p);
        return subMenuC0649p;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1524f.getString(i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f1523e.getPackageManager();
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
        m11780a(m11765b(i), true);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m11760c = m11760c(i);
        if (m11760c >= 0) {
            int size = this.f1528j.size() - m11760c;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1528j.get(m11760c).getGroupId() != i) {
                    break;
                }
                m11780a(m11760c, false);
                i2 = i3;
            }
            m11761b(true);
        }
    }

    /* renamed from: a */
    private void m11780a(int i, boolean z) {
        if (i >= 0 && i < this.f1528j.size()) {
            this.f1528j.remove(i);
            if (z) {
                m11761b(true);
            }
        }
    }

    @Override // android.view.Menu
    public void clear() {
        if (this.f1542x != null) {
            mo11670d(this.f1542x);
        }
        this.f1528j.clear();
        m11761b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11773a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f1528j.size();
        for (int i = 0; i < size; i++) {
            C0632h c0632h = this.f1528j.get(i);
            if (c0632h.getGroupId() == groupId && c0632h.m11719g() && c0632h.isCheckable()) {
                c0632h.m11727b(c0632h == menuItem);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1528j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0632h c0632h = this.f1528j.get(i2);
            if (c0632h.getGroupId() == i) {
                c0632h.m11730a(z2);
                c0632h.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1528j.size();
        int i2 = 0;
        boolean z2 = false;
        while (i2 < size) {
            C0632h c0632h = this.f1528j.get(i2);
            i2++;
            z2 = (c0632h.getGroupId() == i && c0632h.m11725c(z)) ? true : z2;
        }
        if (z2) {
            m11761b(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1528j.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0632h c0632h = this.f1528j.get(i2);
            if (c0632h.getGroupId() == i) {
                c0632h.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1543y) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1528j.get(i).isVisible()) {
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
            C0632h c0632h = this.f1528j.get(i2);
            if (c0632h.getItemId() != i) {
                if (c0632h.hasSubMenu() && (findItem = c0632h.getSubMenu().findItem(i)) != null) {
                    return findItem;
                }
            } else {
                return c0632h;
            }
        }
        return null;
    }

    /* renamed from: b */
    public int m11765b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1528j.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public int m11760c(int i) {
        return m11785a(i, 0);
    }

    /* renamed from: a */
    public int m11785a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        for (int i3 = i2; i3 < size; i3++) {
            if (this.f1528j.get(i3).getGroupId() == i) {
                return i3;
            }
        }
        return -1;
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1528j.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1528j.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m11782a(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1525g = z;
        m11761b(false);
    }

    /* renamed from: d */
    private static int m11757d(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 < 0 || i2 >= f1519d.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        return (f1519d[i2] << 16) | (65535 & i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo11673b() {
        return this.f1525g;
    }

    /* renamed from: e */
    private void m11754e(boolean z) {
        boolean z2 = true;
        this.f1526h = (z && this.f1524f.getConfiguration().keyboard != 1 && this.f1524f.getBoolean(C0535a.C0537b.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : false;
    }

    /* renamed from: c */
    public boolean mo11672c() {
        return this.f1526h;
    }

    /* renamed from: d */
    Resources m11758d() {
        return this.f1524f;
    }

    /* renamed from: e */
    public Context m11755e() {
        return this.f1523e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo11674a(C0628f c0628f, MenuItem menuItem) {
        return this.f1527i != null && this.f1527i.mo11117a(c0628f, menuItem);
    }

    /* renamed from: f */
    public void m11753f() {
        if (this.f1527i != null) {
            this.f1527i.mo11118a(this);
        }
    }

    /* renamed from: a */
    private static int m11768a(ArrayList<C0632h> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m11726c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0632h m11782a = m11782a(i, keyEvent);
        boolean z = false;
        if (m11782a != null) {
            z = m11772a(m11782a, i2);
        }
        if ((i2 & 2) != 0) {
            m11766a(true);
        }
        return z;
    }

    /* renamed from: a */
    void m11767a(List<C0632h> list, int i, KeyEvent keyEvent) {
        boolean mo11673b = mo11673b();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f1528j.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0632h c0632h = this.f1528j.get(i2);
                if (c0632h.hasSubMenu()) {
                    ((C0628f) c0632h.getSubMenu()).m11767a(list, i, keyEvent);
                }
                char alphabeticShortcut = mo11673b ? c0632h.getAlphabeticShortcut() : c0632h.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (mo11673b && alphabeticShortcut == '\b' && i == 67)) && c0632h.isEnabled())) {
                    list.add(c0632h);
                }
            }
        }
    }

    /* renamed from: a */
    C0632h m11782a(int i, KeyEvent keyEvent) {
        ArrayList<C0632h> arrayList = this.f1540v;
        arrayList.clear();
        m11767a(arrayList, i, keyEvent);
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
        boolean mo11673b = mo11673b();
        for (int i2 = 0; i2 < size; i2++) {
            C0632h c0632h = arrayList.get(i2);
            char alphabeticShortcut = mo11673b ? c0632h.getAlphabeticShortcut() : c0632h.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return c0632h;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return c0632h;
            }
            if (mo11673b && alphabeticShortcut == '\b' && i == 67) {
                return c0632h;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m11772a(findItem(i), i2);
    }

    /* renamed from: a */
    public boolean m11772a(MenuItem menuItem, int i) {
        return m11771a(menuItem, (InterfaceC0643l) null, i);
    }

    /* renamed from: a */
    public boolean m11771a(MenuItem menuItem, InterfaceC0643l interfaceC0643l, int i) {
        C0632h c0632h = (C0632h) menuItem;
        if (c0632h == null || !c0632h.isEnabled()) {
            return false;
        }
        boolean m11729b = c0632h.m11729b();
        AbstractC0388d mo11739a = c0632h.mo11739a();
        boolean z = mo11739a != null && mo11739a.mo11706e();
        if (c0632h.m11712n()) {
            boolean expandActionView = c0632h.expandActionView() | m11729b;
            if (expandActionView) {
                m11766a(true);
                return expandActionView;
            }
            return expandActionView;
        } else if (c0632h.hasSubMenu() || z) {
            m11766a(false);
            if (!c0632h.hasSubMenu()) {
                c0632h.m11733a(new SubMenuC0649p(m11755e(), this, c0632h));
            }
            SubMenuC0649p subMenuC0649p = (SubMenuC0649p) c0632h.getSubMenu();
            if (z) {
                mo11739a.mo11708a(subMenuC0649p);
            }
            boolean m11774a = m11774a(subMenuC0649p, interfaceC0643l) | m11729b;
            if (!m11774a) {
                m11766a(true);
                return m11774a;
            }
            return m11774a;
        } else {
            if ((i & 1) == 0) {
                m11766a(true);
            }
            return m11729b;
        }
    }

    /* renamed from: a */
    public final void m11766a(boolean z) {
        if (!this.f1539u) {
            this.f1539u = true;
            Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0643l> next = it.next();
                InterfaceC0643l interfaceC0643l = next.get();
                if (interfaceC0643l == null) {
                    this.f1541w.remove(next);
                } else {
                    interfaceC0643l.mo11317a(this, z);
                }
            }
            this.f1539u = false;
        }
    }

    @Override // android.view.Menu
    public void close() {
        m11766a(true);
    }

    /* renamed from: b */
    public void m11761b(boolean z) {
        if (!this.f1536r) {
            if (z) {
                this.f1530l = true;
                this.f1533o = true;
            }
            m11756d(z);
            return;
        }
        this.f1537s = true;
    }

    /* renamed from: g */
    public void m11752g() {
        if (!this.f1536r) {
            this.f1536r = true;
            this.f1537s = false;
        }
    }

    /* renamed from: h */
    public void m11751h() {
        this.f1536r = false;
        if (this.f1537s) {
            this.f1537s = false;
            m11761b(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m11777a(C0632h c0632h) {
        this.f1530l = true;
        m11761b(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m11763b(C0632h c0632h) {
        this.f1533o = true;
        m11761b(true);
    }

    /* renamed from: i */
    public ArrayList<C0632h> m11750i() {
        if (this.f1530l) {
            this.f1529k.clear();
            int size = this.f1528j.size();
            for (int i = 0; i < size; i++) {
                C0632h c0632h = this.f1528j.get(i);
                if (c0632h.isVisible()) {
                    this.f1529k.add(c0632h);
                }
            }
            this.f1530l = false;
            this.f1533o = true;
            return this.f1529k;
        }
        return this.f1529k;
    }

    /* renamed from: j */
    public void m11749j() {
        boolean mo11315b;
        ArrayList<C0632h> m11750i = m11750i();
        if (this.f1533o) {
            Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<InterfaceC0643l> next = it.next();
                InterfaceC0643l interfaceC0643l = next.get();
                if (interfaceC0643l == null) {
                    this.f1541w.remove(next);
                    mo11315b = z;
                } else {
                    mo11315b = interfaceC0643l.mo11315b() | z;
                }
                z = mo11315b;
            }
            if (z) {
                this.f1531m.clear();
                this.f1532n.clear();
                int size = m11750i.size();
                for (int i = 0; i < size; i++) {
                    C0632h c0632h = m11750i.get(i);
                    if (c0632h.m11716j()) {
                        this.f1531m.add(c0632h);
                    } else {
                        this.f1532n.add(c0632h);
                    }
                }
            } else {
                this.f1531m.clear();
                this.f1532n.clear();
                this.f1532n.addAll(m11750i());
            }
            this.f1533o = false;
        }
    }

    /* renamed from: k */
    public ArrayList<C0632h> m11748k() {
        m11749j();
        return this.f1531m;
    }

    /* renamed from: l */
    public ArrayList<C0632h> m11747l() {
        m11749j();
        return this.f1532n;
    }

    public void clearHeader() {
        this.f1521b = null;
        this.f1520a = null;
        this.f1522c = null;
        m11761b(false);
    }

    /* renamed from: a */
    private void m11781a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m11758d = m11758d();
        if (view != null) {
            this.f1522c = view;
            this.f1520a = null;
            this.f1521b = null;
        } else {
            if (i > 0) {
                this.f1520a = m11758d.getText(i);
            } else if (charSequence != null) {
                this.f1520a = charSequence;
            }
            if (i2 > 0) {
                this.f1521b = C0144a.m13403a(m11755e(), i2);
            } else if (drawable != null) {
                this.f1521b = drawable;
            }
            this.f1522c = null;
        }
        m11761b(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0628f m11769a(CharSequence charSequence) {
        m11781a(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0628f m11779a(Drawable drawable) {
        m11781a(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public C0628f m11770a(View view) {
        m11781a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: m */
    public CharSequence m11746m() {
        return this.f1520a;
    }

    /* renamed from: n */
    public Drawable m11745n() {
        return this.f1521b;
    }

    /* renamed from: o */
    public View m11744o() {
        return this.f1522c;
    }

    /* renamed from: p */
    public C0628f mo11669p() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean m11743q() {
        return this.f1538t;
    }

    /* renamed from: c */
    public boolean mo11671c(C0632h c0632h) {
        boolean z = false;
        if (!this.f1541w.isEmpty()) {
            m11752g();
            Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<InterfaceC0643l> next = it.next();
                InterfaceC0643l interfaceC0643l = next.get();
                if (interfaceC0643l == null) {
                    this.f1541w.remove(next);
                    z = z2;
                } else {
                    z = interfaceC0643l.mo11318a(this, c0632h);
                    if (z) {
                        break;
                    }
                }
            }
            m11751h();
            if (z) {
                this.f1542x = c0632h;
            }
        }
        return z;
    }

    /* renamed from: d */
    public boolean mo11670d(C0632h c0632h) {
        boolean z = false;
        if (!this.f1541w.isEmpty() && this.f1542x == c0632h) {
            m11752g();
            Iterator<WeakReference<InterfaceC0643l>> it = this.f1541w.iterator();
            while (true) {
                boolean z2 = z;
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference<InterfaceC0643l> next = it.next();
                InterfaceC0643l interfaceC0643l = next.get();
                if (interfaceC0643l == null) {
                    this.f1541w.remove(next);
                    z = z2;
                } else {
                    z = interfaceC0643l.mo11314b(this, c0632h);
                    if (z) {
                        break;
                    }
                }
            }
            m11751h();
            if (z) {
                this.f1542x = null;
            }
        }
        return z;
    }

    /* renamed from: r */
    public C0632h m11742r() {
        return this.f1542x;
    }

    /* renamed from: c */
    public void m11759c(boolean z) {
        this.f1543y = z;
    }
}
