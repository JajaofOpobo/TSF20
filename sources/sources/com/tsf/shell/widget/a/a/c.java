package com.tsf.shell.widget.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.PositionNumber3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.api.shell.VInformation;
import com.censivn.C3DEngine.b.e.f;
import com.censivn.C3DEngine.b.f.i;
import com.censivn.C3DEngine.b.f.j;
import com.censivn.C3DEngine.b.f.k;
import com.censivn.C3DEngine.b.f.m;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class c extends f {
    private m a;
    private a b;
    private j d;
    private TextureElement e = new TextureElement(0, false);
    private TextureElement f = new TextureElement(0, false);
    private InterfaceC0171c g;
    private d h;
    private d i;
    private Context j;
    private static final int[] k = {-5138, -12846, -1074534, -1739917, -1092784, -769226, -1754827, -2937041, -3790808, -4776932, -30080, -44462, -59580, -2818048};
    private static final int[] l = {-203540, -476208, -749647, -1023342, -1294214, -1499549, -2614432, -4056997, -5434281, -7860657, -32597, -49023, -720809, -3862174};
    private static final int[] m = {-793099, -1982745, -3238952, -4560696, -5552196, -6543440, -7461718, -8708190, -9823334, -11922292, -1408772, -2080517, -2817799, -5635841};
    private static final int[] n = {-1185802, -3029783, -5005861, -6982195, -8497214, -10011977, -10603087, -11457112, -12245088, -13558894, -5011201, -8630785, -10149889, -10354454};
    private static final int[] o = {-1512714, -3814679, -6313766, -8812853, -10720320, -12627531, -13022805, -13615201, -14142061, -15064194, -7561473, -11309570, -12756226, -13611010};
    private static final int[] p = {-1838339, -4464901, -7288071, -10177034, -12409355, -14575885, -14776091, -15108398, -15374912, -15906911, -8211969, -12285185, -14059009, -14064897};
    private static final int[] q = {-1968642, -4987396, -8268550, -11549705, -14043402, -16537100, -16540699, -16611119, -16615491, -16689253, -8333057, -12532481, -16731905, -16739862};
    private static final int[] r = {-2033670, -5051406, -8331542, -11677471, -14235942, -16728876, -16732991, -16738393, -16743537, -16752540, -8060929, -15138817, -16718337, -16729900};
    private static final int[] s = {-2034959, -5054501, -8336444, -11684180, -14244198, -16738680, -16742021, -16746133, -16750244, -16757440, -5767189, -10158118, -14816842, -16728155};
    private static final int[] t = {-1509911, -3610935, -5908825, -8271996, -10044566, -11751600, -12345273, -13070788, -13730510, -14983648, -4589878, -9834322, -16718218, -16725933};
    private static final int[] u = {-919319, -2298424, -3808859, -5319295, -6501275, -7617718, -8604862, -9920712, -11171025, -13407970, -3342448, -5046439, -8978685, -10167017};
    private static final int[] v = {-394265, -985917, -1642852, -2300043, -2825897, -3285959, -4142541, -5262293, -6382300, -8227049, -721023, -1114303, -3735808, -5314048};
    private static final int[] w = {-537, -1596, -2659, -3722, -4520, -5317, -141259, -278483, -415707, -688361, -115, -256, -5632, -10752};
    private static final int[] x = {-1823, -4941, -8062, -10929, -13784, -16121, -19712, -24576, -28928, -37120, -6785, -10432, -15360, -21760};
    private static final int[] y = {-3104, -8014, -13184, -18611, -22746, -26624, -291840, -689152, -1086464, -1683200, -11904, -21696, -28416, -37632};
    private static final int[] z = {-267801, -13124, -21615, -30107, -36797, -43230, -765666, -1684967, -2604267, -4246004, -24960, -37312, -49920, -2282496};
    private static final int[] A = {-1053719, -2634552, -4412764, -6190977, -7508381, -8825528, -9614271, -10665929, -11652050, -12703965, -270894, -4219247, -5143178, -6066082};
    private static final int[] B = {-328966, -657931, -1118482, -2039584, -4342339, -6381922, -9079435, -10395295, -12434878, -14606047, -723724, -1579033, -2894893, -4144960};
    private static final int[] C = {-1249295, -3155748, -5194043, -7297874, -8875876, -10453621, -11243910, -12232092, -13154481, -14273992, -2691334, -5912617, -8014388, -9069393};
    private static final int[] D = {-769226, -1499549, -6543440, -10011977, -12627531, -14575885, -16537100, -16728876, -16738680, -11751600, -7617718, -3285959, -5317, -16121, -26624, -43230, -8825528, -6381922, -10453621};
    private static final int[][] E = {k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z, A, B, C};

    /* JADX INFO: renamed from: com.tsf.shell.widget.a.a.c$c, reason: collision with other inner class name */
    public interface InterfaceC0171c {
        boolean a(int i);
    }

    public c(Context context) {
        this.j = context;
        d((int) com.censivn.C3DEngine.b.b.a.a(300.0f));
        a(0);
        this.a = new m();
        this.a.b(1);
        this.a.d(50);
        this.a.a(" ");
        this.a.b();
        com.censivn.C3DEngine.b.b.b bVar = new com.censivn.C3DEngine.b.b.b();
        bVar.a = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar.i = this.a.minY();
        bVar.k = this.a.maxY();
        this.a.setLayoutParams(bVar);
        addChild(this.a);
        this.d = new j();
        this.b = new a();
        this.b.a(D);
        this.b.b(l);
        this.b.calAABB();
        this.d.addChild(this.b);
        this.d.setMouseEventListener(new b(this.d));
        this.h = new d(0.0f, 0.0f);
        this.h.a(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.h.b(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.h.position().y = com.censivn.C3DEngine.b.b.a.a(95.0f);
        this.h.textures().addElement(this.f);
        this.h.calAABB();
        this.d.addChild(this.h);
        this.i = new d(0.0f, 0.0f);
        this.i.a(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.i.b(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.i.position().y = com.censivn.C3DEngine.b.b.a.a(-115.0f);
        this.i.textures().addElement(this.f);
        this.i.calAABB();
        this.d.addChild(this.i);
        this.d.calAABB(1.0f, 1.2f, 1.0f);
        com.censivn.C3DEngine.b.b.b bVar2 = new com.censivn.C3DEngine.b.b.b();
        bVar2.a = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar2.b = com.censivn.C3DEngine.b.b.a.a(20.0f);
        bVar2.i = this.d.minY();
        bVar2.k = this.d.maxY();
        this.d.setLayoutParams(bVar2);
        addChild(this.d);
    }

    @Override // com.censivn.C3DEngine.b.b.c
    public void c(int i) {
        this.a.position().x = ((-i) / 2.0f) + com.censivn.C3DEngine.b.b.a.a(0.0f);
        this.b.b(i);
        this.d.calAABB(1.0f, 1.2f, 1.0f);
    }

    public void a(String str) {
        this.a.a(str);
    }

    class d extends k {
        private float d;
        private float e;

        public d(float f, float f2) {
            super(f, f2);
            this.d = 0.1f;
            this.e = 0.0f;
        }

        public void c(float f) {
            this.e = f;
        }

        @Override // com.censivn.C3DEngine.b.f.i
        public void onDrawStart() {
            float f = this.e - position().x;
            if (Math.abs(f) < 0.1f) {
                position().x = this.e;
            } else {
                PositionNumber3d positionNumber3dPosition = position();
                positionNumber3dPosition.x = (f * this.d) + positionNumber3dPosition.x;
                invalidate();
            }
        }
    }

    class b extends com.censivn.C3DEngine.b.d.a {
        public b(i iVar) {
            super(iVar);
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(final MotionEvent motionEvent) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.widget.a.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    Number3d number3dL = b.this.l(motionEvent);
                    c.this.b.a(number3dL.x, number3dL.y);
                }
            });
        }

        @Override // com.censivn.C3DEngine.b.d.a
        public void a(MotionEvent motionEvent, final MotionEvent motionEvent2, float f, float f2) {
            com.censivn.C3DEngine.a.a().c(new Runnable() { // from class: com.tsf.shell.widget.a.a.c.b.2
                @Override // java.lang.Runnable
                public void run() {
                    Number3d number3dL = b.this.l(motionEvent2);
                    c.this.b.a(number3dL.x, number3dL.y);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Number3d l(MotionEvent motionEvent) {
            Number3d number3d = new Number3d(0.0f, 0.0f, 0.0f);
            float screenHeight = VInformation.getScreenHeight();
            number3d.x = motionEvent.getX() - (VInformation.getScreenWidth() / 2.0f);
            number3d.y = 0.0f - (motionEvent.getY() - (screenHeight / 2.0f));
            number3d.z = 0.0f;
            return this.c.globalToLocal(number3d);
        }
    }

    class a extends com.censivn.C3DEngine.b.f.a.a {
        private int[] c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public a() {
            super(35, 1, 1, 1, null, true);
            this.d = 0;
            this.e = (int) com.censivn.C3DEngine.b.b.a.a(150.0f);
            this.f = (int) com.censivn.C3DEngine.b.b.a.a(60.0f);
            this.g = 0;
            this.h = 0;
            textures().addElement(c.this.e);
            for (int i = 0; i < 19; i++) {
                com.censivn.C3DEngine.b.f.a.b bVarA = a(i);
                bVarA.a(0, 0, 100, 100);
                bVarA.b(40, this.e);
                bVarA.h();
            }
            for (int i2 = 0; i2 < 14; i2++) {
                com.censivn.C3DEngine.b.f.a.b bVarA2 = a(i2 + 20);
                bVarA2.a(0, 0, 100, 100);
                bVarA2.b(40, this.e);
                bVarA2.i().y = -150.0f;
                bVarA2.h();
            }
        }

        public void a(int[] iArr) {
            this.c = iArr;
            for (int i = 0; i < this.c.length; i++) {
                a(i).H.set(this.c[i]);
            }
        }

        /* JADX INFO: renamed from: com.tsf.shell.widget.a.a.c$a$a, reason: collision with other inner class name */
        class C0170a extends com.censivn.C3DEngine.b.g.d {
            int C;
            int D;
            int E;
            boolean a = true;
            int b = -1;
            int c = -1;
            int d;
            int e;
            int f;

            C0170a() {
            }

            @Override // com.censivn.C3DEngine.b.g.d
            public void a(float f) {
                if (this.a) {
                    d(((com.censivn.C3DEngine.b.f.a.b) d()).H.color);
                    this.a = false;
                }
                o(f);
            }

            private void o(float f) {
                ((com.censivn.C3DEngine.b.f.a.b) d()).H.set(255, (int) (this.d + ((this.C - this.d) * f)), (int) (this.e + ((this.D - this.e) * f)), (int) (this.f + ((this.E - this.f) * f)));
            }

            private void d(int i) {
                this.b = i;
                this.d = Color.red(i);
                this.e = Color.green(i);
                this.f = Color.blue(i);
            }

            public void c(int i) {
                this.c = i;
                this.C = Color.red(i);
                this.D = Color.green(i);
                this.E = Color.blue(i);
            }
        }

        public void b(int[] iArr) {
            for (int i = 0; i < 14; i++) {
                com.censivn.C3DEngine.b.f.a.b bVarA = a(i + 20);
                C0170a c0170a = new C0170a();
                c0170a.b(i * 40);
                c0170a.c(iArr[i]);
                com.censivn.C3DEngine.b.g.c.a(bVarA, 90, c0170a);
            }
        }

        public void b(int i) {
            this.d = i;
            float length = i / this.c.length;
            int iCeil = (int) Math.ceil(length);
            for (int i2 = 0; i2 < this.c.length; i2++) {
                com.censivn.C3DEngine.b.f.a.b bVarA = a(i2);
                bVarA.b(iCeil, this.e);
                bVarA.i().x = (((-i) / 2.0f) + ((i2 + 1) * length)) - (length * 0.5f);
                bVarA.h();
            }
            float f = i / 14.0f;
            int iCeil2 = (int) Math.ceil(f);
            for (int i3 = 0; i3 < 14; i3++) {
                com.censivn.C3DEngine.b.f.a.b bVarA2 = a(i3 + 20);
                bVarA2.b(iCeil2, this.e);
                bVarA2.i().x = (((-i) / 2.0f) + ((i3 + 1) * f)) - (f * 0.5f);
                bVarA2.i().y = (-this.e) - this.f;
                bVarA2.h();
            }
            c.this.h.c(c(this.g));
            c.this.i.c(d(this.h));
            calAABB();
        }

        private float c(int i) {
            float length = this.d / this.c.length;
            return (((-this.d) / 2.0f) + ((i + 1) * length)) - (length * 0.5f);
        }

        private float d(int i) {
            float f = this.d / 14.0f;
            return (((-this.d) / 2.0f) + ((i + 1) * f)) - (f * 0.5f);
        }

        public void a(float f, float f2) {
            int length = 0;
            if (f2 > (-this.e) / 2.0f) {
                float length2 = this.d / this.c.length;
                int iRound = Math.round(((((length2 / 2.0f) + f) + (this.d / 2.0f)) / length2) - 1.0f);
                if (iRound >= 0) {
                    length = iRound > this.c.length + (-1) ? this.c.length - 1 : iRound;
                }
                if (this.g != length) {
                    b(c.E[length]);
                    this.g = length;
                    if (c.this.g != null) {
                        c.this.g.a(c.D[length]);
                    }
                    c.this.h.c(c(this.g));
                    return;
                }
                return;
            }
            float f3 = this.d / 14.0f;
            int iRound2 = Math.round(((((f3 / 2.0f) + f) + (this.d / 2.0f)) / f3) - 1.0f);
            if (iRound2 >= 0) {
                length = iRound2 > 13 ? 13 : iRound2;
            }
            if (this.h != length) {
                this.h = length;
                if (c.this.g != null) {
                    c.this.g.a(c.E[this.g][length]);
                }
                c.this.i.c(d(this.h));
            }
        }
    }

    private static Bitmap a(int i, int i2, int i3) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(0.0f, 0.0f, i2, i3, paint);
        return bitmapCreateBitmap;
    }

    public void a(InterfaceC0171c interfaceC0171c) {
        this.g = interfaceC0171c;
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void g() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
    }

    private Bitmap b(int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, (i2 / 2.0f) - 2.0f, paint);
        return bitmapCreateBitmap;
    }

    @Override // com.censivn.C3DEngine.b.e.f
    public void f() {
        if (this.e.id == 0) {
            Bitmap bitmapA = a(-1, 100, 100);
            com.censivn.C3DEngine.a.g().a(this.e, bitmapA);
            bitmapA.recycle();
        }
        if (this.f.id == 0) {
            Bitmap bitmapB = b(-1, (int) com.censivn.C3DEngine.b.b.a.a(30.0f));
            com.censivn.C3DEngine.a.g().a(this.f, bitmapB);
            bitmapB.recycle();
        }
    }
}
