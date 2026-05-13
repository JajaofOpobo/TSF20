package android.support.p013v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.p002v4.p005b.p006a.InterfaceMenuC0127a;
import android.support.p002v4.view.AbstractC0388d;
import android.support.p002v4.view.C0419q;
import android.support.p013v7.p014a.C0535a;
import android.support.p013v7.view.menu.C0632h;
import android.support.p013v7.view.menu.MenuItemC0634i;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: android.support.v7.view.g */
/* loaded from: classes.dex */
public class C0614g extends MenuInflater {

    /* renamed from: a */
    private static final Class<?>[] f1406a = {Context.class};

    /* renamed from: b */
    private static final Class<?>[] f1407b = f1406a;

    /* renamed from: c */
    private final Object[] f1408c;

    /* renamed from: d */
    private final Object[] f1409d;

    /* renamed from: e */
    private Context f1410e;

    /* renamed from: f */
    private Object f1411f;

    public C0614g(Context context) {
        super(context);
        this.f1410e = context;
        this.f1408c = new Object[]{context};
        this.f1409d = this.f1408c;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC0127a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.f1410e.getResources().getLayout(i);
                m11842a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* renamed from: a */
    private void m11842a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        boolean z;
        C0616b c0616b = new C0616b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        Object obj = null;
        boolean z2 = false;
        int i = eventType;
        boolean z3 = false;
        while (!z3) {
            switch (i) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (z2) {
                        z = z2;
                        continue;
                    } else {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            c0616b.m11834a(attributeSet);
                            z = z2;
                        } else if (name2.equals("item")) {
                            c0616b.m11829b(attributeSet);
                            z = z2;
                        } else if (name2.equals("menu")) {
                            m11842a(xmlPullParser, attributeSet, c0616b.m11828c());
                            z = z2;
                        } else {
                            obj = name2;
                            z = true;
                        }
                    }
                    boolean z4 = z;
                    i = xmlPullParser.next();
                    z2 = z4;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (z2 && name3.equals(obj)) {
                        obj = null;
                        z = false;
                        continue;
                    } else if (name3.equals("group")) {
                        c0616b.m11836a();
                        z = z2;
                    } else if (name3.equals("item")) {
                        if (!c0616b.m11827d()) {
                            if (c0616b.f1440z != null && c0616b.f1440z.mo11706e()) {
                                c0616b.m11828c();
                                z = z2;
                            } else {
                                c0616b.m11830b();
                                z = z2;
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z3 = true;
                        z = z2;
                    }
                    boolean z42 = z;
                    i = xmlPullParser.next();
                    z2 = z42;
                    break;
            }
            z = z2;
            boolean z422 = z;
            i = xmlPullParser.next();
            z2 = z422;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public Object m11839c() {
        if (this.f1411f == null) {
            this.f1411f = m11843a(this.f1410e);
        }
        return this.f1411f;
    }

    /* renamed from: a */
    private Object m11843a(Object obj) {
        if (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) {
            return m11843a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.g$a */
    /* loaded from: classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0615a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private static final Class<?>[] f1412a = {MenuItem.class};

        /* renamed from: b */
        private Object f1413b;

        /* renamed from: c */
        private Method f1414c;

        public MenuItem$OnMenuItemClickListenerC0615a(Object obj, String str) {
            this.f1413b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1414c = cls.getMethod(str, f1412a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1414c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1414c.invoke(this.f1413b, menuItem)).booleanValue();
                }
                this.f1414c.invoke(this.f1413b, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: android.support.v7.view.g$b */
    /* loaded from: classes.dex */
    public class C0616b {

        /* renamed from: b */
        private Menu f1416b;

        /* renamed from: c */
        private int f1417c;

        /* renamed from: d */
        private int f1418d;

        /* renamed from: e */
        private int f1419e;

        /* renamed from: f */
        private int f1420f;

        /* renamed from: g */
        private boolean f1421g;

        /* renamed from: h */
        private boolean f1422h;

        /* renamed from: i */
        private boolean f1423i;

        /* renamed from: j */
        private int f1424j;

        /* renamed from: k */
        private int f1425k;

        /* renamed from: l */
        private CharSequence f1426l;

        /* renamed from: m */
        private CharSequence f1427m;

        /* renamed from: n */
        private int f1428n;

        /* renamed from: o */
        private char f1429o;

        /* renamed from: p */
        private char f1430p;

        /* renamed from: q */
        private int f1431q;

        /* renamed from: r */
        private boolean f1432r;

        /* renamed from: s */
        private boolean f1433s;

        /* renamed from: t */
        private boolean f1434t;

        /* renamed from: u */
        private int f1435u;

        /* renamed from: v */
        private int f1436v;

        /* renamed from: w */
        private String f1437w;

        /* renamed from: x */
        private String f1438x;

        /* renamed from: y */
        private String f1439y;

        /* renamed from: z */
        private AbstractC0388d f1440z;

        public C0616b(Menu menu) {
            this.f1416b = menu;
            m11836a();
        }

        /* renamed from: a */
        public void m11836a() {
            this.f1417c = 0;
            this.f1418d = 0;
            this.f1419e = 0;
            this.f1420f = 0;
            this.f1421g = true;
            this.f1422h = true;
        }

        /* renamed from: a */
        public void m11834a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0614g.this.f1410e.obtainStyledAttributes(attributeSet, C0535a.C0546k.MenuGroup);
            this.f1417c = obtainStyledAttributes.getResourceId(C0535a.C0546k.MenuGroup_android_id, 0);
            this.f1418d = obtainStyledAttributes.getInt(C0535a.C0546k.MenuGroup_android_menuCategory, 0);
            this.f1419e = obtainStyledAttributes.getInt(C0535a.C0546k.MenuGroup_android_orderInCategory, 0);
            this.f1420f = obtainStyledAttributes.getInt(C0535a.C0546k.MenuGroup_android_checkableBehavior, 0);
            this.f1421g = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuGroup_android_visible, true);
            this.f1422h = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void m11829b(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0614g.this.f1410e.obtainStyledAttributes(attributeSet, C0535a.C0546k.MenuItem);
            this.f1424j = obtainStyledAttributes.getResourceId(C0535a.C0546k.MenuItem_android_id, 0);
            this.f1425k = (obtainStyledAttributes.getInt(C0535a.C0546k.MenuItem_android_menuCategory, this.f1418d) & (-65536)) | (obtainStyledAttributes.getInt(C0535a.C0546k.MenuItem_android_orderInCategory, this.f1419e) & 65535);
            this.f1426l = obtainStyledAttributes.getText(C0535a.C0546k.MenuItem_android_title);
            this.f1427m = obtainStyledAttributes.getText(C0535a.C0546k.MenuItem_android_titleCondensed);
            this.f1428n = obtainStyledAttributes.getResourceId(C0535a.C0546k.MenuItem_android_icon, 0);
            this.f1429o = m11832a(obtainStyledAttributes.getString(C0535a.C0546k.MenuItem_android_alphabeticShortcut));
            this.f1430p = m11832a(obtainStyledAttributes.getString(C0535a.C0546k.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C0535a.C0546k.MenuItem_android_checkable)) {
                this.f1431q = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f1431q = this.f1420f;
            }
            this.f1432r = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuItem_android_checked, false);
            this.f1433s = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuItem_android_visible, this.f1421g);
            this.f1434t = obtainStyledAttributes.getBoolean(C0535a.C0546k.MenuItem_android_enabled, this.f1422h);
            this.f1435u = obtainStyledAttributes.getInt(C0535a.C0546k.MenuItem_showAsAction, -1);
            this.f1439y = obtainStyledAttributes.getString(C0535a.C0546k.MenuItem_android_onClick);
            this.f1436v = obtainStyledAttributes.getResourceId(C0535a.C0546k.MenuItem_actionLayout, 0);
            this.f1437w = obtainStyledAttributes.getString(C0535a.C0546k.MenuItem_actionViewClass);
            this.f1438x = obtainStyledAttributes.getString(C0535a.C0546k.MenuItem_actionProviderClass);
            boolean z = this.f1438x != null;
            if (z && this.f1436v == 0 && this.f1437w == null) {
                this.f1440z = (AbstractC0388d) m11831a(this.f1438x, C0614g.f1407b, C0614g.this.f1409d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1440z = null;
            }
            obtainStyledAttributes.recycle();
            this.f1423i = false;
        }

        /* renamed from: a */
        private char m11832a(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m11833a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f1432r).setVisible(this.f1433s).setEnabled(this.f1434t).setCheckable(this.f1431q >= 1).setTitleCondensed(this.f1427m).setIcon(this.f1428n).setAlphabeticShortcut(this.f1429o).setNumericShortcut(this.f1430p);
            if (this.f1435u >= 0) {
                C0419q.m12617a(menuItem, this.f1435u);
            }
            if (this.f1439y != null) {
                if (C0614g.this.f1410e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0615a(C0614g.this.m11839c(), this.f1439y));
            }
            if (menuItem instanceof C0632h) {
                C0632h c0632h = (C0632h) menuItem;
            }
            if (this.f1431q >= 2) {
                if (menuItem instanceof C0632h) {
                    ((C0632h) menuItem).m11730a(true);
                } else if (menuItem instanceof MenuItemC0634i) {
                    ((MenuItemC0634i) menuItem).m11710a(true);
                }
            }
            if (this.f1437w != null) {
                C0419q.m12615a(menuItem, (View) m11831a(this.f1437w, C0614g.f1406a, C0614g.this.f1408c));
            } else {
                z = false;
            }
            if (this.f1436v > 0) {
                if (!z) {
                    C0419q.m12613b(menuItem, this.f1436v);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.f1440z != null) {
                C0419q.m12616a(menuItem, this.f1440z);
            }
        }

        /* renamed from: b */
        public void m11830b() {
            this.f1423i = true;
            m11833a(this.f1416b.add(this.f1417c, this.f1424j, this.f1425k, this.f1426l));
        }

        /* renamed from: c */
        public SubMenu m11828c() {
            this.f1423i = true;
            SubMenu addSubMenu = this.f1416b.addSubMenu(this.f1417c, this.f1424j, this.f1425k, this.f1426l);
            m11833a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m11827d() {
            return this.f1423i;
        }

        /* renamed from: a */
        private <T> T m11831a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = C0614g.this.f1410e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }
    }
}
