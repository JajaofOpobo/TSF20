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
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.TextureElement;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
/* loaded from: classes.dex */
public class x {
    public static Bitmap a(Context context, int i) {
        return a(context.getResources(), i);
    }

    public static Bitmap a(String str, int i) {
        Context context;
        try {
            Context d = com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            com.censivn.C3DEngine.a.d();
            context = d.createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            context = null;
        }
        if (context == null) {
            return null;
        }
        return a(context.getResources(), i);
    }

    public static Bitmap a(int i) {
        return a(com.censivn.C3DEngine.a.d().getResources(), i);
    }

    public static Bitmap a(int i, float f, float f2) {
        return a(i, (int) f, (int) f2);
    }

    public static Bitmap a(int i, int i2, int i3) {
        Bitmap a = a(com.censivn.C3DEngine.a.d().getResources(), i);
        if (a.getWidth() != i2 || a.getHeight() != i3) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, i2, i3, true);
            if (createScaledBitmap != a) {
                a.recycle();
            } else {
                createScaledBitmap = a;
            }
            return createScaledBitmap;
        }
        return a;
    }

    public static Bitmap a(Resources resources, int i, int i2, int i3) {
        Bitmap a = a(resources, i);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(a, i2, i3, true);
        if (createScaledBitmap != a) {
            a.recycle();
            return createScaledBitmap;
        }
        return a;
    }

    public static Bitmap a(Resources resources, int i) {
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

    public static Bitmap a(Drawable drawable, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        return createBitmap;
    }

    public static TextureElement b(int i, int i2, int i3) {
        Bitmap a = a(com.censivn.C3DEngine.a.d().getResources(), i, i2, i3);
        TextureElement a2 = com.censivn.C3DEngine.a.g().a(a, false);
        a.recycle();
        return a2;
    }

    public static TextureElement b(int i) {
        Bitmap a = a(com.censivn.C3DEngine.a.d().getResources(), i);
        TextureElement a2 = com.censivn.C3DEngine.a.g().a(a, false);
        a.recycle();
        return a2;
    }

    public static void a(com.censivn.C3DEngine.b.f.i iVar, int i, int i2, int i3, int i4) {
        iVar.faces().add((short) i, (short) i3, (short) i2);
        iVar.faces().add((short) i, (short) i4, (short) i3);
    }

    public static FloatBuffer a(float f, float f2, float f3, float f4) {
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

    public static float a(Number3d number3d, Number3d number3d2) {
        return b(number3d.x, number3d.y, number3d2.x, number3d2.y);
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow(f3 - f, 2.0d) + Math.pow(f4 - f2, 2.0d));
    }

    public static float c(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        if (f6 > 0.0f) {
            return ((float) (Math.atan(f5 / f6) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(f5 / f6) / 0.017453292519943295d);
    }

    public static float d(float f, float f2, float f3, float f4) {
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

    public static float a(float f) {
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

    public static double b(Number3d number3d, Number3d number3d2) {
        return Math.atan2(number3d2.y - number3d.y, number3d2.x - number3d.x);
    }

    public static float[] a(float f, float f2) {
        return new float[]{com.censivn.C3DEngine.b.b.a.H + f, com.censivn.C3DEngine.b.b.a.I - f2};
    }

    public static float[] a(MotionEvent motionEvent) {
        return b(motionEvent.getX(), motionEvent.getY());
    }

    public static float[] b(float f, float f2) {
        return new float[]{f - com.censivn.C3DEngine.b.b.a.H, 0.0f - (f2 - com.censivn.C3DEngine.b.b.a.I)};
    }

    public static float[] a(MotionEvent motionEvent, float[] fArr) {
        return a(motionEvent.getX(), motionEvent.getY(), fArr);
    }

    public static float[] a(float f, float f2, float[] fArr) {
        fArr[0] = f - com.censivn.C3DEngine.b.b.a.H;
        fArr[1] = 0.0f - (f2 - com.censivn.C3DEngine.b.b.a.I);
        return fArr;
    }

    public static int[] a(int i, int i2, int i3, int i4, int i5, int i6) {
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

    public static String c(int i) {
        if (com.censivn.C3DEngine.a.d() == null || i == 0) {
            return null;
        }
        return com.censivn.C3DEngine.a.d().getString(i);
    }

    public static String b(Context context, int i) {
        if (context == null || i == 0) {
            return null;
        }
        return context.getString(i);
    }

    @SuppressLint({"NewApi"})
    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("Censivn3D", str + ": glError " + glGetError);
            throw new RuntimeException(str + ": glError " + glGetError);
        }
    }
}
