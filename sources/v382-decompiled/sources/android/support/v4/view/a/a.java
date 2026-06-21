package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import org.acra.ACRAConstants;

/* loaded from: classes.dex */
public class a {
    private static final e a;
    private final Object b;

    static {
        if (Build.VERSION.SDK_INT >= 22) {
            a = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            a = new b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a = new h();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            a = new g();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            a = new f();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new d();
        } else {
            a = new i();
        }
    }

    public a(Object obj) {
        this.b = obj;
    }

    public Object a() {
        return this.b;
    }

    public int b() {
        return a.a(this.b);
    }

    public void a(int i) {
        a.a(this.b, i);
    }

    public void a(Rect rect) {
        a.a(this.b, rect);
    }

    public void b(Rect rect) {
        a.b(this.b, rect);
    }

    public boolean c() {
        return a.f(this.b);
    }

    public boolean d() {
        return a.g(this.b);
    }

    public boolean e() {
        return a.j(this.b);
    }

    public boolean f() {
        return a.k(this.b);
    }

    public boolean g() {
        return a.o(this.b);
    }

    public boolean h() {
        return a.h(this.b);
    }

    public boolean i() {
        return a.l(this.b);
    }

    public boolean j() {
        return a.i(this.b);
    }

    public boolean k() {
        return a.m(this.b);
    }

    public boolean l() {
        return a.n(this.b);
    }

    public void a(boolean z) {
        a.a(this.b, z);
    }

    public CharSequence m() {
        return a.d(this.b);
    }

    public CharSequence n() {
        return a.b(this.b);
    }

    public void a(CharSequence charSequence) {
        a.a(this.b, charSequence);
    }

    public CharSequence o() {
        return a.e(this.b);
    }

    public CharSequence p() {
        return a.c(this.b);
    }

    public String q() {
        return a.p(this.b);
    }

    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            return this.b == null ? aVar.b == null : this.b.equals(aVar.b);
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a(rect);
        sb.append("; boundsInParent: " + rect);
        b(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(m());
        sb.append("; className: ").append(n());
        sb.append("; text: ").append(o());
        sb.append("; contentDescription: ").append(p());
        sb.append("; viewId: ").append(q());
        sb.append("; checkable: ").append(c());
        sb.append("; checked: ").append(d());
        sb.append("; focusable: ").append(e());
        sb.append("; focused: ").append(f());
        sb.append("; selected: ").append(g());
        sb.append("; clickable: ").append(h());
        sb.append("; longClickable: ").append(i());
        sb.append("; enabled: ").append(j());
        sb.append("; password: ").append(k());
        sb.append("; scrollable: " + l());
        sb.append("; [");
        int b = b();
        while (b != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(b);
            b &= numberOfTrailingZeros ^ (-1);
            sb.append(b(numberOfTrailingZeros));
            if (b != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static String b(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case ItemInfo.APP_INTENT /* 128 */:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case ItemInfo.APP_VERSION_CODE /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case ItemInfo.APP_VERSION_NAME /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case ACRAConstants.DEFAULT_BUFFER_SIZE_IN_BYTES /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }
}
