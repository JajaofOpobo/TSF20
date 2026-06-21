package com.censivn.C3DEngine.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.util.Log;
import android.view.MotionEvent;
import com.censivn.C3DEngine.api.element.TextureElement;
import com.censivn.C3DEngine.b.r;
import com.tsf.shell.theme.inside.ThemeDockDescription;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class a {
    public static Bitmap a(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
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

    public static TextureElement a(int i) {
        Bitmap a = a(com.censivn.C3DEngine.a.MatrixUtils(), i);
        TextureElement a2 = com.censivn.C3DEngine.a.f().a(a, false);
        a.recycle();
        return a2;
    }

    public static void a(r rVar, int i, int i2, int i3, int i4) {
        rVar.y().a((short) i, (short) i3, (short) i2);
        rVar.y().a((short) i, (short) i4, (short) i3);
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

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(Math.pow(f3 - f, 2.0d) + Math.pow(f4 - f2, 2.0d));
    }

    public static float c(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        if (f2 - f4 > 0.0f) {
            return ((float) (Math.atan(f5 / r1) / 0.017453292519943295d)) + 180.0f;
        }
        return (float) (Math.atan(f5 / r1) / 0.017453292519943295d);
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

    public static float[] a(float f, float f2) {
        return new float[]{com.censivn.C3DEngine.a.n + f, com.censivn.C3DEngine.a.o - f2};
    }

    public static float[] a(MotionEvent motionEvent) {
        return b(motionEvent.getX(), motionEvent.getY());
    }

    public static float[] b(float f, float f2) {
        return new float[]{f - com.censivn.C3DEngine.a.n, 0.0f - (f2 - com.censivn.C3DEngine.a.o)};
    }

    public static float[] a(MotionEvent motionEvent, float[] fArr) {
        return a(motionEvent.getX(), motionEvent.getY(), fArr);
    }

    public static float[] a(float f, float f2, float[] fArr) {
        fArr[0] = f - com.censivn.C3DEngine.a.n;
        fArr[1] = 0.0f - (f2 - com.censivn.C3DEngine.a.o);
        return fArr;
    }

    public static int b(int i) {
        int[] iArr = {2, 4, 8, 16, 32, 64, 128, 256, ThemeDockDescription.DOCK_MENU_ADD_BUTTON_OFF, 1024};
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i <= iArr[i2]) {
                return iArr[i2];
            }
        }
        return iArr[length - 1];
    }

    public static String c(int i) {
        if (com.censivn.C3DEngine.a.MatrixUtils() == null) {
            return null;
        }
        return com.censivn.C3DEngine.a.MatrixUtils().getString(i);
    }

    public static byte[] a(Bitmap bitmap) {
        if (bitmap != null) {
            return b(bitmap);
        }
        return null;
    }

    private static byte[] b(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bitmap.getWidth() * bitmap.getHeight() * 4);
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            Log.w("Favorite", "Could not write icon");
            return null;
        }
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            Log.e("Censivn3D", String.valueOf(str) + ": glError " + glGetError);
            throw new RuntimeException(String.valueOf(str) + ": glError " + glGetError);
        }
    }
}
