package com.tsf.shell.widget.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.f.l;
import com.censivn.C3DEngine.b.f.o;

/* loaded from: classes.dex */
public class d extends com.censivn.C3DEngine.b.e.i {
    private o a;
    private e b;
    private l d;
    private TextureElement e = new TextureElement(0, false);
    private TextureElement f = new TextureElement(0, false);
    private h g;
    private i h;
    private i i;
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

    public d(Context context) {
        this.j = context;
        d((int) com.censivn.C3DEngine.b.b.a.a(300.0f));
        a(0);
        this.a = new o();
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
        this.d = new l();
        this.b = new e(this);
        this.b.a(D);
        this.b.b(l);
        this.b.calAABB();
        this.d.addChild(this.b);
        this.d.setMouseEventListener(new g(this, this.d));
        this.h = new i(this, 0.0f, 0.0f);
        this.h.a(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.h.b(com.censivn.C3DEngine.b.b.a.a(30.0f));
        this.h.position().y = com.censivn.C3DEngine.b.b.a.a(95.0f);
        this.h.textures().addElement(this.f);
        this.h.calAABB();
        this.d.addChild(this.h);
        this.i = new i(this, 0.0f, 0.0f);
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

    private static Bitmap a(int i, int i2, int i3) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawRect(0.0f, 0.0f, i2, i3, paint);
        return createBitmap;
    }

    public void a(h hVar) {
        this.g = hVar;
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void g() {
        if (this.f.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.f);
        }
        if (this.e.id != 0) {
            com.censivn.C3DEngine.a.g().a(this.e);
        }
    }

    private Bitmap b(int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        canvas.drawCircle(i2 / 2.0f, i2 / 2.0f, (i2 / 2.0f) - 2.0f, paint);
        return createBitmap;
    }

    @Override // com.censivn.C3DEngine.b.e.i
    public void f() {
        if (this.e.id == 0) {
            Bitmap a = a(-1, 100, 100);
            com.censivn.C3DEngine.a.g().a(this.e, a);
            a.recycle();
        }
        if (this.f.id == 0) {
            Bitmap b = b(-1, (int) com.censivn.C3DEngine.b.b.a.a(30.0f));
            com.censivn.C3DEngine.a.g().a(this.f, b);
            b.recycle();
        }
    }
}
