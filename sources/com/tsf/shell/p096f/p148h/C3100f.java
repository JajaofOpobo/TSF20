package com.tsf.shell.p096f.p148h;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p041g.C0986a;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
import com.censivn.C3DEngine.p031b.p046h.p051e.C1064b;
import com.tsf.C1306b;
import com.tsf.shell.C3345g;
import com.tsf.shell.manager.C3359a;
import com.tsf.shell.manager.p175g.C3489a;
import com.tsf.shell.manager.p180l.C3519a;
import com.tsf.shell.manager.p183o.C3560a;
import com.tsf.shell.manager.p183o.C3566b;
import com.tsf.shell.manager.p183o.C3567c;
import com.tsf.shell.manager.p187r.p189b.C3621a;
import com.tsf.shell.manager.p187r.p193c.C3743g;
import com.tsf.shell.p096f.p153i.C3112b;
import com.tsf.shell.p096f.p153i.p155b.p160e.AbstractC3208b;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.description.ThemeShellDescription;
import com.tsf.shell.utils.C4171h;
import com.tsf.shell.utils.C4189x;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.tsf.shell.f.h.f */
/* loaded from: classes.dex */
public class C3100f extends C1064b {

    /* renamed from: b */
    private C0981k f10058b;

    /* renamed from: c */
    private C3091c f10059c;

    /* renamed from: d */
    private C3621a.C3622a f10060d;

    /* renamed from: e */
    private C0981k f10061e;

    /* renamed from: f */
    private TextureElement f10062f;

    /* renamed from: g */
    private boolean f10063g;

    public C3100f(C3091c c3091c, C0975i c0975i, float f, float f2, float f3, float f4, float f5) {
        super(c0975i, f, f2, f3, f4, f5, 1.0f);
        this.f10063g = false;
        this.f10059c = c3091c;
        this.f10062f = new TextureElement(0, false);
        this.f10061e = new C0981k(C3489a.f11515b, C3489a.f11515b, false);
        this.f10061e.textures().addElement(this.f10062f);
        m3574o();
    }

    /* renamed from: o */
    public void m3574o() {
        TextureElement m593b = C4189x.m593b(C1306b.C1310d.smart_button_add_icon);
        this.f10058b = new C0981k(C0892a.f2567c * 128.0f, C0892a.f2567c * 128.0f, false);
        this.f10058b.moveAllPointsPX(0.0f, C3566b.f11841c.f11767Y, 0.0f);
        this.f10058b.calAABB(2.0f, 2.0f, 1.0f);
        this.f10058b.textures().addElement(m593b);
        C3567c.m1967a(this.f10058b, C3567c.f11846e);
        this.f10058b.setMouseEventListener(new C0937a(this.f10058b) { // from class: com.tsf.shell.f.h.f.1
            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                C3100f.this.m3571r();
            }
        });
        this.f10060d = new C3621a.C3622a() { // from class: com.tsf.shell.f.h.f.2
            @Override // com.tsf.shell.manager.p187r.p189b.C3621a.C3622a
            /* renamed from: a */
            public void mo1857a() {
                C3359a.f11101o.m3609j();
            }

            @Override // com.tsf.shell.manager.p187r.p189b.C3621a.C3622a
            /* renamed from: a */
            public void mo1856a(AbstractC3208b abstractC3208b) {
                abstractC3208b.m3534K().onUpdateContainer(-2);
                C3100f.this.m3579a(abstractC3208b);
                C3100f.this.m10023e(abstractC3208b);
            }

            @Override // com.tsf.shell.manager.p187r.p189b.C3621a.C3622a
            /* renamed from: b */
            public C3560a mo1854b() {
                return C3566b.f11840b;
            }
        };
        m10043a(new C0937a(this) { // from class: com.tsf.shell.f.h.f.3

            /* renamed from: b */
            private C0975i f10067b = null;

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: c */
            public void mo2122c(MotionEvent motionEvent) {
                C3100f.this.m3571r();
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: d */
            public void mo2119d(MotionEvent motionEvent) {
                if (C3100f.this.f10063g) {
                    C3100f.this.m10047a();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: e */
            public void mo1654e(MotionEvent motionEvent) {
                this.f10067b = C3100f.this.m10044a(motionEvent);
                if (this.f10067b != C3100f.this.f10058b && this.f10067b != null && (this.f10067b instanceof AbstractC3208b)) {
                    ((AbstractC3208b) this.f10067b).m3151aQ();
                }
            }

            @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
            /* renamed from: a */
            public void mo502a(MotionEvent motionEvent) {
                if (this.f10067b == C3100f.this.f10058b) {
                    C3100f.this.m3571r();
                } else if (this.f10067b != null && (this.f10067b instanceof AbstractC3208b)) {
                    AbstractC3208b abstractC3208b = (AbstractC3208b) this.f10067b;
                    if (C3100f.this.f10063g) {
                        C3743g.m1619a(abstractC3208b, (Runnable) null);
                    } else {
                        abstractC3208b.mo3094l();
                    }
                }
            }
        });
    }

    @Override // com.censivn.C3DEngine.p031b.p046h.p051e.C1064b
    /* renamed from: c */
    public void mo3576c(C0975i c0975i) {
        if (this.f10063g && (c0975i instanceof AbstractC3208b) && c0975i.visible()) {
            this.f10061e.position().f2526x = c0975i.position().f2526x + C0892a.m10742a(50.0f);
            this.f10061e.position().f2527y = c0975i.position().f2527y + C0892a.m10742a(60.0f);
            this.f10061e.dispatchDraw();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m3571r() {
        if (!this.f10063g) {
            this.f10061e.scale().setAll(0.0f, 0.0f, 1.0f);
            C1017d c1017d = new C1017d();
            c1017d.m10294l(1.0f);
            c1017d.m10293m(1.0f);
            c1017d.m10313a(C0986a.f2950e);
            C1014c.m10326a(this.f10061e);
            C1014c.m10325a(this.f10061e, 500, c1017d);
            Bitmap bitmap = ThemeManager.mix.shellOther.getTheme().getBitmap(ThemeShellDescription.PUBLIC_BUTTON_DELETE, C3489a.f11515b, C3489a.f11515b);
            C0853a.m10853g().m10540a(this.f10062f, bitmap);
            bitmap.recycle();
            this.f10063g = true;
            C3359a.f11095i.f12255a.m1859a(this.f10060d);
            C3359a.f11101o.m3632a(C3359a.f11095i.f12255a.getScreenFreeSpaceBottom());
            this.f10058b.removeFromParent();
        }
    }

    /* renamed from: p */
    public void m3573p() {
        if (this.f10063g) {
            m10036b();
            this.f10063g = false;
            m10020f(this.f10058b);
            m3570s();
        }
    }

    /* renamed from: q */
    public static String m3572q() {
        Cursor query = C0853a.m10856d().getContentResolver().query(C3345g.C3351f.f11070a, null, null, null, null);
        String str = "";
        while (query.moveToNext()) {
            str = query.getString(query.getColumnIndex("child"));
        }
        if (str == null) {
            str = "";
        }
        query.close();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m3579a(AbstractC3208b abstractC3208b) {
    }

    /* renamed from: a */
    public void m3578a(ArrayList<ItemInfo> arrayList, String str) {
        Iterator<ItemInfo> it = C4171h.m678a(arrayList, str, ",", true).iterator();
        while (it.hasNext()) {
            AbstractC3208b m2147a = C3519a.m2147a(it.next(), C3566b.f11840b, true);
            m3579a(m2147a);
            m10020f(m2147a);
        }
        m10020f(this.f10058b);
    }

    /* renamed from: s */
    private void m3570s() {
        C0975i next;
        String str;
        final String str2 = "";
        Iterator<C0975i> it = m10031c().children().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof C3112b) {
                str = str2 + ((C3112b) next).m3534K().f2532id + ",";
            } else {
                str = str2;
            }
            str2 = str;
        }
        C0853a.m10865a().m10580e(new Runnable() { // from class: com.tsf.shell.f.h.f.4
            @Override // java.lang.Runnable
            public void run() {
                ContentResolver contentResolver = C0853a.m10856d().getContentResolver();
                ContentValues contentValues = new ContentValues();
                contentValues.put("child", str2);
                contentResolver.update(ContentUris.withAppendedId(C3345g.C3351f.f11070a, 1L), contentValues, null, null);
                contentValues.clear();
            }
        });
    }
}
