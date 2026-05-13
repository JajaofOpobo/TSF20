package com.tsf.shell.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.util.Log;
import android.view.MotionEvent;
import com.censivn.C3DEngine.C0853a;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.p031b.p033b.C0892a;
import com.censivn.C3DEngine.p031b.p038f.C0975i;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* renamed from: com.tsf.shell.utils.x */
/* loaded from: classes.dex */
public class C4189x {
    /* renamed from: a */
    public static Bitmap m605a(Context context, int i) {
        return m604a(context.getResources(), i);
    }

    /* renamed from: a */
    public static Bitmap m596a(String str, int i) {
        Context context;
        try {
            Context m10856d = C0853a.m10856d();
            C0853a.m10856d();
            C0853a.m10856d();
            context = m10856d.createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            context = null;
        }
        if (context == null) {
            return null;
        }
        return m604a(context.getResources(), i);
    }

    /* renamed from: a */
    public static Bitmap m609a(int i) {
        return m604a(C0853a.m10856d().getResources(), i);
    }

    /* renamed from: a */
    public static Bitmap m608a(int i, float f, float f2) {
        return m607a(i, (int) f, (int) f2);
    }

    /* renamed from: a */
    public static Bitmap m607a(int i, int i2, int i3) {
        Bitmap m604a = m604a(C0853a.m10856d().getResources(), i);
        if (m604a.getWidth() != i2 || m604a.getHeight() != i3) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m604a, i2, i3, true);
            if (createScaledBitmap != m604a) {
                m604a.recycle();
            } else {
                createScaledBitmap = m604a;
            }
            return createScaledBitmap;
        }
        return m604a;
    }

    /* renamed from: a */
    public static Bitmap m603a(Resources resources, int i, int i2, int i3) {
        Bitmap m604a = m604a(resources, i);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m604a, i2, i3, true);
        if (createScaledBitmap != m604a) {
            m604a.recycle();
            return createScaledBitmap;
        }
        return m604a;
    }

    /* renamed from: a */
    public static Bitmap m604a(Resources resources, int i) {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(openRawResource);
            if (decodeStream == null) {
                return null;
            }
            Bitmap copy = decodeStream.copy(Bitmap.Config.ARGB_8888, true);
            decodeStream.recycle();
            return copy;
        } finally {
            try {
                openRawResource.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m602a(Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: b */
    public static TextureElement m592b(int i, int i2, int i3) {
        Bitmap m603a = m603a(C0853a.m10856d().getResources(), i, i2, i3);
        TextureElement m10544a = C0853a.m10853g().m10544a(m603a, false);
        m603a.recycle();
        return m10544a;
    }

    /* renamed from: b */
    public static TextureElement m593b(int i) {
        Bitmap m604a = m604a(C0853a.m10856d().getResources(), i);
        TextureElement m10544a = C0853a.m10853g().m10544a(m604a, false);
        m604a.recycle();
        return m10544a;
    }

    /* renamed from: a */
    public static void m598a(C0975i c0975i, int i, int i2, int i3, int i4) {
        c0975i.faces().add((short) i, (short) i3, (short) i2);
        c0975i.faces().add((short) i, (short) i4, (short) i3);
    }

    /* renamed from: a */
    public static FloatBuffer m611a(float f, float f2, float f3, float f4) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(16);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(f);
        asFloatBuffer.put(f2);
        asFloatBuffer.put(f3);
        asFloatBuffer.put(f4);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    /* renamed from: a */
    public static float m599a(Number3d number3d, Number3d number3d2) {
        return m594b(number3d.f2526x, number3d.f2527y, number3d2.f2526x, number3d2.f2527y);
    }

    /* renamed from: b */
    public static float m594b(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow(f3 - f, 2.0d) + Math.pow(f4 - f2, 2.0d));
    }

    /* renamed from: c */
    public static float m589c(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        if (f6 > 0.0f) {
            return ((float) (Math.atan(f5 / f6) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(f5 / f6) / 0.017453292519943295d);
    }

    /* renamed from: d */
    public static float m587d(float f, float f2, float f3, float f4) {
        double d = 180.0d;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        double sqrt = Math.sqrt(Math.pow(f5, 2.0d) + Math.pow(f6, 2.0d));
        if (sqrt == 0.0d) {
            return 0.0f;
        }
        double acos = 180.0d / (3.141592653589793d / Math.acos(f5 / sqrt));
        if (f6 < 0.0f) {
            d = -acos;
        } else if (f6 != 0.0f || f5 >= 0.0f) {
            d = acos;
        }
        return (float) d;
    }

    /* renamed from: a */
    public static float m613a(float f) {
        float f2;
        int abs = Math.abs(((int) f) / 360);
        if (f > 0.0f) {
            f2 = f - (abs * 360);
        } else {
            f2 = f - ((-abs) * 360);
        }
        if (f2 < 0.0f) {
            return f2 + 360.0f;
        }
        return f2;
    }

    /* renamed from: b */
    public static double m590b(Number3d number3d, Number3d number3d2) {
        return Math.atan2(number3d2.f2527y - number3d.f2527y, number3d2.f2526x - number3d.f2526x);
    }

    /* renamed from: a */
    public static float[] m612a(float f, float f2) {
        return new float[]{C0892a.f2557H + f, C0892a.f2558I - f2};
    }

    /* renamed from: a */
    public static float[] m601a(MotionEvent motionEvent) {
        return m595b(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: b */
    public static float[] m595b(float f, float f2) {
        return new float[]{f - C0892a.f2557H, 0.0f - (f2 - C0892a.f2558I)};
    }

    /* renamed from: a */
    public static float[] m600a(MotionEvent motionEvent, float[] fArr) {
        return m610a(motionEvent.getX(), motionEvent.getY(), fArr);
    }

    /* renamed from: a */
    public static float[] m610a(float f, float f2, float[] fArr) {
        fArr[0] = f - C0892a.f2557H;
        fArr[1] = 0.0f - (f2 - C0892a.f2558I);
        return fArr;
    }

    /* renamed from: a */
    public static int[] m606a(int i, int i2, int i3, int i4, int i5, int i6) {
        int[] iArr = new int[4];
        int i7 = 2;
        while ((i - (i5 * 2)) / (i7 - 1) > i3) {
            i7++;
        }
        int i8 = i7 - 1;
        if (i8 < 2) {
            i8 = 2;
        }
        int i9 = 2;
        while ((i2 - (i6 * 2)) / (i9 - 1) > i4) {
            i9++;
        }
        int i10 = i9 - 1;
        if (i10 < 2) {
            i10 = 2;
        }
        iArr[0] = i8;
        iArr[1] = i10;
        iArr[2] = (i - (i5 * 2)) / (i8 - 1);
        iArr[3] = (i2 - (i6 * 2)) / (i10 - 1);
        return iArr;
    }

    /* renamed from: c */
    public static String m588c(int i) {
        if (C0853a.m10856d() == null || i == 0) {
            return null;
        }
        return C0853a.m10856d().getString(i);
    }

    /* renamed from: b */
    public static String m591b(Context context, int i) {
        if (context == null || i == 0) {
            return null;
        }
        return context.getString(i);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m597a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("Censivn3D", str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }
}
