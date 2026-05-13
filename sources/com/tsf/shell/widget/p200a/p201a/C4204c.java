package com.tsf.shell.widget.p200a.p201a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p033b.C0907b;
import com.censivn.C3DEngine.p031b.p036d.C0937a;
import com.censivn.C3DEngine.p031b.p037e.AbstractC0951f;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import com.censivn.C3DEngine.p031b.p038f.C0980j;
import com.censivn.C3DEngine.p031b.p038f.C0981k;
import com.censivn.C3DEngine.p031b.p038f.C0984m;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0962a;
import com.censivn.C3DEngine.p031b.p038f.p039a.C0964b;
import com.censivn.C3DEngine.p031b.p041g.C1014c;
import com.censivn.C3DEngine.p031b.p041g.C1017d;
/* renamed from: com.tsf.shell.widget.a.a.c */
/* loaded from: classes.dex */
public class C4204c extends AbstractC0951f {

    /* renamed from: a */
    private C0984m f13580a;

    /* renamed from: b */
    private C4205a f13581b;

    /* renamed from: d */
    private C0980j f13582d;

    /* renamed from: e */
    private TextureElement f13583e = new TextureElement(0, false);

    /* renamed from: f */
    private TextureElement f13584f = new TextureElement(0, false);

    /* renamed from: g */
    private InterfaceC4210c f13585g;

    /* renamed from: h */
    private C4211d f13586h;

    /* renamed from: i */
    private C4211d f13587i;

    /* renamed from: j */
    private Context f13588j;

    /* renamed from: k */
    private static final int[] f13564k = {-5138, -12846, -1074534, -1739917, -1092784, -769226, -1754827, -2937041, -3790808, -4776932, -30080, -44462, -59580, -2818048};

    /* renamed from: l */
    private static final int[] f13565l = {-203540, -476208, -749647, -1023342, -1294214, -1499549, -2614432, -4056997, -5434281, -7860657, -32597, -49023, -720809, -3862174};

    /* renamed from: m */
    private static final int[] f13566m = {-793099, -1982745, -3238952, -4560696, -5552196, -6543440, -7461718, -8708190, -9823334, -11922292, -1408772, -2080517, -2817799, -5635841};

    /* renamed from: n */
    private static final int[] f13567n = {-1185802, -3029783, -5005861, -6982195, -8497214, -10011977, -10603087, -11457112, -12245088, -13558894, -5011201, -8630785, -10149889, -10354454};

    /* renamed from: o */
    private static final int[] f13568o = {-1512714, -3814679, -6313766, -8812853, -10720320, -12627531, -13022805, -13615201, -14142061, -15064194, -7561473, -11309570, -12756226, -13611010};

    /* renamed from: p */
    private static final int[] f13569p = {-1838339, -4464901, -7288071, -10177034, -12409355, -14575885, -14776091, -15108398, -15374912, -15906911, -8211969, -12285185, -14059009, -14064897};

    /* renamed from: q */
    private static final int[] f13570q = {-1968642, -4987396, -8268550, -11549705, -14043402, -16537100, -16540699, -16611119, -16615491, -16689253, -8333057, -12532481, -16731905, -16739862};

    /* renamed from: r */
    private static final int[] f13571r = {-2033670, -5051406, -8331542, -11677471, -14235942, -16728876, -16732991, -16738393, -16743537, -16752540, -8060929, -15138817, -16718337, -16729900};

    /* renamed from: s */
    private static final int[] f13572s = {-2034959, -5054501, -8336444, -11684180, -14244198, -16738680, -16742021, -16746133, -16750244, -16757440, -5767189, -10158118, -14816842, -16728155};

    /* renamed from: t */
    private static final int[] f13573t = {-1509911, -3610935, -5908825, -8271996, -10044566, -11751600, -12345273, -13070788, -13730510, -14983648, -4589878, -9834322, -16718218, -16725933};

    /* renamed from: u */
    private static final int[] f13574u = {-919319, -2298424, -3808859, -5319295, -6501275, -7617718, -8604862, -9920712, -11171025, -13407970, -3342448, -5046439, -8978685, -10167017};

    /* renamed from: v */
    private static final int[] f13575v = {-394265, -985917, -1642852, -2300043, -2825897, -3285959, -4142541, -5262293, -6382300, -8227049, -721023, -1114303, -3735808, -5314048};

    /* renamed from: w */
    private static final int[] f13576w = {-537, -1596, -2659, -3722, -4520, -5317, -141259, -278483, -415707, -688361, -115, -256, -5632, -10752};

    /* renamed from: x */
    private static final int[] f13577x = {-1823, -4941, -8062, -10929, -13784, -16121, -19712, -24576, -28928, -37120, -6785, -10432, -15360, -21760};

    /* renamed from: y */
    private static final int[] f13578y = {-3104, -8014, -13184, -18611, -22746, -26624, -291840, -689152, -1086464, -1683200, -11904, -21696, -28416, -37632};

    /* renamed from: z */
    private static final int[] f13579z = {-267801, -13124, -21615, -30107, -36797, -43230, -765666, -1684967, -2604267, -4246004, -24960, -37312, -49920, -2282496};

    /* renamed from: A */
    private static final int[] f13559A = {-1053719, -2634552, -4412764, -6190977, -7508381, -8825528, -9614271, -10665929, -11652050, -12703965, -270894, -4219247, -5143178, -6066082};

    /* renamed from: B */
    private static final int[] f13560B = {-328966, -657931, -1118482, -2039584, -4342339, -6381922, -9079435, -10395295, -12434878, -14606047, -723724, -1579033, -2894893, -4144960};

    /* renamed from: C */
    private static final int[] f13561C = {-1249295, -3155748, -5194043, -7297874, -8875876, -10453621, -11243910, -12232092, -13154481, -14273992, -2691334, -5912617, -8014388, -9069393};

    /* renamed from: D */
    private static final int[] f13562D = {-769226, -1499549, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -43230, -8825528, -6381922, -10453621};

    /* renamed from: E */
    private static final int[][] f13563E = {f13564k, f13565l, f13566m, f13567n, f13568o, f13569p, f13570q, f13571r, f13572s, f13573t, f13574u, f13575v, f13576w, f13577x, f13578y, f13579z, f13559A, f13560B, f13561C};

    /* renamed from: com.tsf.shell.widget.a.a.c$c */
    /* loaded from: classes.dex */
    public interface InterfaceC4210c {
        /* renamed from: a */
        boolean mo524a(int i);
    }

    public C4204c(Context context) {
        this.f13588j = context;
        m10615d((int) C0892a.m10742a(300.0f));
        m10628a(0);
        this.f13580a = new C0984m();
        this.f13580a.m10352b(1);
        this.f13580a.m10347d(50);
        this.f13580a.m10355a(" ");
        this.f13580a.m10353b();
        C0907b c0907b = new C0907b();
        c0907b.f2655a = C0892a.m10742a(20.0f);
        c0907b.f2663i = this.f13580a.minY();
        c0907b.f2665k = this.f13580a.maxY();
        this.f13580a.setLayoutParams(c0907b);
        addChild(this.f13580a);
        this.f13582d = new C0980j();
        this.f13581b = new C4205a();
        this.f13581b.m535a(f13562D);
        this.f13581b.m533b(f13565l);
        this.f13581b.calAABB();
        this.f13582d.addChild(this.f13581b);
        this.f13582d.setMouseEventListener(new C4207b(this.f13582d));
        this.f13586h = new C4211d(0.0f, 0.0f);
        this.f13586h.mo10368a(C0892a.m10742a(30.0f));
        this.f13586h.mo5215b(C0892a.m10742a(30.0f));
        this.f13586h.position().f2527y = C0892a.m10742a(95.0f);
        this.f13586h.textures().addElement(this.f13584f);
        this.f13586h.calAABB();
        this.f13582d.addChild(this.f13586h);
        this.f13587i = new C4211d(0.0f, 0.0f);
        this.f13587i.mo10368a(C0892a.m10742a(30.0f));
        this.f13587i.mo5215b(C0892a.m10742a(30.0f));
        this.f13587i.position().f2527y = C0892a.m10742a(-115.0f);
        this.f13587i.textures().addElement(this.f13584f);
        this.f13587i.calAABB();
        this.f13582d.addChild(this.f13587i);
        this.f13582d.calAABB(1.0f, 1.2f, 1.0f);
        C0907b c0907b2 = new C0907b();
        c0907b2.f2655a = C0892a.m10742a(20.0f);
        c0907b2.f2656b = C0892a.m10742a(20.0f);
        c0907b2.f2663i = this.f13582d.minY();
        c0907b2.f2665k = this.f13582d.maxY();
        this.f13582d.setLayoutParams(c0907b2);
        addChild(this.f13582d);
    }

    @Override // com.censivn.C3DEngine.p031b.p033b.C0908c
    /* renamed from: c */
    public void mo544c(int i) {
        this.f13580a.position().f2526x = ((-i) / 2.0f) + C0892a.m10742a(0.0f);
        this.f13581b.m534b(i);
        this.f13582d.calAABB(1.0f, 1.2f, 1.0f);
    }

    /* renamed from: a */
    public void m547a(String str) {
        this.f13580a.m10355a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.a.a.c$d */
    /* loaded from: classes.dex */
    public class C4211d extends C0981k {

        /* renamed from: d */
        private float f13612d;

        /* renamed from: e */
        private float f13613e;

        public C4211d(float f, float f2) {
            super(f, f2);
            this.f13612d = 0.1f;
            this.f13613e = 0.0f;
        }

        /* renamed from: c */
        public void m523c(float f) {
            this.f13613e = f;
        }

        @Override // com.censivn.C3DEngine.p031b.p038f.C0975i
        public void onDrawStart() {
            float f = this.f13613e - position().f2526x;
            if (Math.abs(f) < 0.1f) {
                position().f2526x = this.f13613e;
                return;
            }
            PositionNumber3d position = position();
            position.f2526x = (f * this.f13612d) + position.f2526x;
            invalidate();
        }
    }

    /* renamed from: com.tsf.shell.widget.a.a.c$b */
    /* loaded from: classes.dex */
    class C4207b extends C0937a {
        public C4207b(C0975i c0975i) {
            super(c0975i);
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo502a(final MotionEvent motionEvent) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.widget.a.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    Number3d m525l = C4207b.this.m525l(motionEvent);
                    C4204c.this.f13581b.m536a(m525l.f2526x, m525l.f2527y);
                }
            });
        }

        @Override // com.censivn.C3DEngine.p031b.p036d.C0937a
        /* renamed from: a */
        public void mo527a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
            C0853a.m10865a().m10583c(new Runnable() { // from class: com.tsf.shell.widget.a.a.c.b.2
                @Override // java.lang.Runnable
                public void run() {
                    Number3d m525l = C4207b.this.m525l(motionEvent2);
                    C4204c.this.f13581b.m536a(m525l.f2526x, m525l.f2527y);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public Number3d m525l(MotionEvent motionEvent) {
            Number3d number3d = new Number3d(0.0f, 0.0f, 0.0f);
            number3d.f2526x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            number3d.f2527y = 0.0f - (motionEvent.getY() - (VInformation.getScreenHeight() / 2.0f));
            number3d.f2528z = 0.0f;
            return this.f2740c.globalToLocal(number3d);
        }
    }

    /* renamed from: com.tsf.shell.widget.a.a.c$a */
    /* loaded from: classes.dex */
    class C4205a extends C0962a {

        /* renamed from: c */
        private int[] f13590c;

        /* renamed from: d */
        private int f13591d;

        /* renamed from: e */
        private int f13592e;

        /* renamed from: f */
        private int f13593f;

        /* renamed from: g */
        private int f13594g;

        /* renamed from: h */
        private int f13595h;

        public C4205a() {
            super(35, 1, 1, 1, null, true);
            this.f13591d = 0;
            this.f13592e = (int) C0892a.m10742a(150.0f);
            this.f13593f = (int) C0892a.m10742a(60.0f);
            this.f13594g = 0;
            this.f13595h = 0;
            textures().addElement(C4204c.this.f13583e);
            for (int i = 0; i < 19; i++) {
                C0964b a = m10456a(i);
                a.m10439a(0, 0, 100, 100);
                a.m10429b(40, this.f13592e);
                a.m10408h();
            }
            for (int i2 = 0; i2 < 14; i2++) {
                C0964b a2 = m10456a(i2 + 20);
                a2.m10439a(0, 0, 100, 100);
                a2.m10429b(40, this.f13592e);
                a2.m10407i().f2527y = -150.0f;
                a2.m10408h();
            }
        }

        /* renamed from: a */
        public void m535a(int[] iArr) {
            this.f13590c = iArr;
            for (int i = 0; i < this.f13590c.length; i++) {
                m10456a(i).f2830H.set(this.f13590c[i]);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tsf.shell.widget.a.a.c$a$a */
        /* loaded from: classes.dex */
        public class C4206a extends C1017d {

            /* renamed from: C */
            int f13596C;

            /* renamed from: D */
            int f13597D;

            /* renamed from: E */
            int f13598E;

            /* renamed from: a */
            boolean f13600a = true;

            /* renamed from: b */
            int f13601b = -1;

            /* renamed from: c */
            int f13602c = -1;

            /* renamed from: d */
            int f13603d;

            /* renamed from: e */
            int f13604e;

            /* renamed from: f */
            int f13605f;

            C4206a() {
            }

            @Override // com.censivn.C3DEngine.p031b.p041g.C1017d
            /* renamed from: a */
            public void mo518a(float f) {
                if (this.f13600a) {
                    m529d(((C0964b) m10306d()).f2830H.color);
                    this.f13600a = false;
                }
                m528o(f);
            }

            /* renamed from: o */
            private void m528o(float f) {
                ((C0964b) m10306d()).f2830H.set(255, (int) (this.f13603d + ((this.f13596C - this.f13603d) * f)), (int) (this.f13604e + ((this.f13597D - this.f13604e) * f)), (int) (this.f13605f + ((this.f13598E - this.f13605f) * f)));
            }

            /* renamed from: d */
            private void m529d(int i) {
                this.f13601b = i;
                this.f13603d = Color.red(i);
                this.f13604e = Color.green(i);
                this.f13605f = Color.blue(i);
            }

            /* renamed from: c */
            public void m530c(int i) {
                this.f13602c = i;
                this.f13596C = Color.red(i);
                this.f13597D = Color.green(i);
                this.f13598E = Color.blue(i);
            }
        }

        /* renamed from: b */
        public void m533b(int[] iArr) {
            for (int i = 0; i < 14; i++) {
                C0964b a = m10456a(i + 20);
                C4206a c4206a = new C4206a();
                c4206a.m10309b(i * 40);
                c4206a.m530c(iArr[i]);
                C1014c.m10325a(a, 90, c4206a);
            }
        }

        /* renamed from: b */
        public void m534b(int i) {
            this.f13591d = i;
            float length = i / this.f13590c.length;
            int ceil = (int) Math.ceil(length);
            for (int i2 = 0; i2 < this.f13590c.length; i2++) {
                C0964b a = m10456a(i2);
                a.m10429b(ceil, this.f13592e);
                a.m10407i().f2526x = (((-i) / 2.0f) + ((i2 + 1) * length)) - (length * 0.5f);
                a.m10408h();
            }
            float f = i / 14.0f;
            int ceil2 = (int) Math.ceil(f);
            for (int i3 = 0; i3 < 14; i3++) {
                C0964b a2 = m10456a(i3 + 20);
                a2.m10429b(ceil2, this.f13592e);
                a2.m10407i().f2526x = (((-i) / 2.0f) + ((i3 + 1) * f)) - (f * 0.5f);
                a2.m10407i().f2527y = (-this.f13592e) - this.f13593f;
                a2.m10408h();
            }
            C4204c.this.f13586h.m523c(m532c(this.f13594g));
            C4204c.this.f13587i.m523c(m531d(this.f13595h));
            calAABB();
        }

        /* renamed from: c */
        private float m532c(int i) {
            float length = this.f13591d / this.f13590c.length;
            return (((-this.f13591d) / 2.0f) + ((i + 1) * length)) - (length * 0.5f);
        }

        /* renamed from: d */
        private float m531d(int i) {
            float f = this.f13591d / 14.0f;
            return (((-this.f13591d) / 2.0f) + ((i + 1) * f)) - (f * 0.5f);
        }

        /* renamed from: a */
        public void m536a(float f, float f2) {
            int i = 0;
            if (f2 > (-this.f13592e) / 2.0f) {
                float length = this.f13591d / this.f13590c.length;
                int round = Math.round(((((length / 2.0f) + f) + (this.f13591d / 2.0f)) / length) - 1.0f);
                if (round >= 0) {
                    i = round > this.f13590c.length + (-1) ? this.f13590c.length - 1 : round;
                }
                if (this.f13594g != i) {
                    m533b(C4204c.f13563E[i]);
                    this.f13594g = i;
                    if (C4204c.this.f13585g != null) {
                        C4204c.this.f13585g.mo524a(C4204c.f13562D[i]);
                    }
                    C4204c.this.f13586h.m523c(m532c(this.f13594g));
                    return;
                }
                return;
            }
            float f3 = this.f13591d / 14.0f;
            int round2 = Math.round(((((f3 / 2.0f) + f) + (this.f13591d / 2.0f)) / f3) - 1.0f);
            if (round2 >= 0) {
                i = round2 > 13 ? 13 : round2;
            }
            if (this.f13595h != i) {
                this.f13595h = i;
                if (C4204c.this.f13585g != null) {
                    C4204c.this.f13585g.mo524a(C4204c.f13563E[this.f13594g][i]);
                }
                C4204c.this.f13587i.m523c(m531d(this.f13595h));
            }
        }
    }

    /* renamed from: a */
    private static Bitmap m550a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(0.0f, 0.0f, i2, i3, paint);
        return createBitmap;
    }

    /* renamed from: a */
    public void m549a(InterfaceC4210c interfaceC4210c) {
        this.f13585g = interfaceC4210c;
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: g */
    public void mo538g() {
        if (this.f13584f.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13584f);
        }
        if (this.f13583e.f2529id != 0) {
            C0853a.m10853g().m10543a(this.f13583e);
        }
    }

    /* renamed from: b */
    private Bitmap m546b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, (i2 / 2.0f) - 2.0f, paint);
        return createBitmap;
    }

    @Override // com.censivn.C3DEngine.p031b.p037e.AbstractC0951f
    /* renamed from: f */
    public void mo539f() {
        if (this.f13583e.f2529id == 0) {
            Bitmap m550a = m550a(-1, 100, 100);
            C0853a.m10853g().m10540a(this.f13583e, m550a);
            m550a.recycle();
        }
        if (this.f13584f.f2529id == 0) {
            Bitmap m546b = m546b(-1, (int) C0892a.m10742a(30.0f));
            C0853a.m10853g().m10540a(this.f13584f, m546b);
            m546b.recycle();
        }
    }
}
