package com.tsf.extend.base.p080j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.extend.C1536f;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
/* renamed from: com.tsf.extend.base.j.e */
/* loaded from: classes.dex */
public class C1426e {
    /* renamed from: a */
    public static int m8668a(BitmapFactory.Options options, int i, int i2, int i3) {
        if (!((i / 90) % 2 != 0)) {
            i3 = i2;
            i2 = i3;
        }
        return m8669a(options, i3, i2);
    }

    /* renamed from: a */
    public static int m8669a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(i3 / i2);
        int round2 = Math.round(i4 / i);
        return round < round2 ? round2 : round;
    }

    /* renamed from: a */
    public static Bitmap m8674a(Bitmap bitmap, int i, int i2) {
        return m8672a(bitmap, i, i2, 0, 17, Bitmap.Config.ARGB_8888, true);
    }

    /* renamed from: a */
    public static Bitmap m8673a(Bitmap bitmap, int i, int i2, int i3) {
        return m8672a(bitmap, i, i2, i3, 17, Bitmap.Config.ARGB_8888, true);
    }

    /* renamed from: a */
    public static Bitmap m8672a(Bitmap bitmap, int i, int i2, int i3, int i4, Bitmap.Config config, boolean z) {
        return m8671a(bitmap, i, i2, i3, i4, config, z, 0);
    }

    /* renamed from: a */
    public static Bitmap m8671a(Bitmap bitmap, int i, int i2, int i3, int i4, Bitmap.Config config, boolean z, int i5) {
        if (bitmap != null || i2 == 0) {
            boolean z2 = (i3 == 0 || (i3 / 90) % 2 == 0) ? false : true;
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
                Canvas canvas = new Canvas(createBitmap);
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                int i6 = z2 ? i2 : i;
                if (!z2) {
                    i = i2;
                }
                float f = i6 / i;
                int width2 = bitmap.getWidth();
                int height2 = bitmap.getHeight();
                int i7 = 0;
                int i8 = 0;
                switch (i4) {
                    case 17:
                        if (bitmap.getWidth() / bitmap.getHeight() > f) {
                            width2 = (int) (height2 * f);
                            i7 = (bitmap.getWidth() - width2) / 2;
                            break;
                        } else {
                            height2 = (int) (width2 / f);
                            i8 = (bitmap.getHeight() - height2) / 2;
                            break;
                        }
                    case 48:
                        if (bitmap.getWidth() / bitmap.getHeight() > f) {
                            width2 = (int) (height2 * f);
                            i7 = (bitmap.getWidth() - width2) / 2;
                            break;
                        } else {
                            height2 = (int) (width2 / f);
                            break;
                        }
                    case 80:
                        if (bitmap.getWidth() / bitmap.getHeight() < f) {
                            height2 = (int) (width2 / f);
                            i8 = bitmap.getHeight() - height2;
                            break;
                        } else {
                            width2 = (int) (height2 * f);
                            break;
                        }
                    case 8388611:
                        if (bitmap.getWidth() / bitmap.getHeight() < f) {
                            height2 = (int) (width2 / f);
                            i8 = (bitmap.getHeight() - height2) / 2;
                            break;
                        } else {
                            width2 = (int) (height2 * f);
                            break;
                        }
                    case 8388613:
                        if (bitmap.getWidth() / bitmap.getHeight() > f) {
                            width2 = (int) (height2 * f);
                            i7 = bitmap.getWidth() - width2;
                            break;
                        } else {
                            height2 = (int) (width2 / f);
                            break;
                        }
                }
                Rect rect = new Rect(i7, i8, width2 + i7, height2 + i8);
                RectF rectF = new RectF(0.0f, 0.0f, i6, i);
                switch (i3) {
                    case -270:
                    case 90:
                        canvas.rotate(i3);
                        canvas.translate(0.0f, -width);
                        break;
                    case -180:
                    case 180:
                        canvas.rotate(i3);
                        canvas.translate(-width, -height);
                        break;
                    case -90:
                    case 270:
                        canvas.rotate(i3);
                        canvas.translate(-height, 0.0f);
                        break;
                }
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                if (i5 > 0) {
                    canvas.drawRoundRect(rectF, i5, i5, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                } else {
                    canvas.drawBitmap(bitmap, rect, rectF, paint);
                }
                if (createBitmap != bitmap && !bitmap.isRecycled() && z) {
                    bitmap.recycle();
                }
                return createBitmap;
            } catch (Throwable th) {
                return bitmap;
            }
        }
        return bitmap;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: a */
    public static int m8675a(android.content.Context r8, android.net.Uri r9) {
        /*
            r7 = 0
            r6 = 0
            if (r9 != 0) goto L5
        L4:
            return r6
        L5:
            java.lang.String r0 = "content"
            java.lang.String r1 = r9.getScheme()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L35
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = r9.getPath()     // Catch: java.lang.Exception -> L32
            r0.<init>(r1)     // Catch: java.lang.Exception -> L32
            java.lang.String r1 = "Orientation"
            r2 = 1
            int r0 = r0.getAttributeInt(r1, r2)     // Catch: java.lang.Exception -> L32
            switch(r0) {
                case 1: goto L27;
                case 2: goto L24;
                case 3: goto L2c;
                case 4: goto L24;
                case 5: goto L24;
                case 6: goto L29;
                case 7: goto L24;
                case 8: goto L2f;
                default: goto L24;
            }
        L24:
            r0 = r6
        L25:
            r6 = r0
            goto L4
        L27:
            r0 = r6
            goto L25
        L29:
            r0 = 90
            goto L25
        L2c:
            r0 = 180(0xb4, float:2.52E-43)
            goto L25
        L2f:
            r0 = 270(0x10e, float:3.78E-43)
            goto L25
        L32:
            r0 = move-exception
            r0 = r6
            goto L25
        L35:
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L62
            r0 = 0
            java.lang.String r1 = "orientation"
            r2[r0] = r1     // Catch: java.lang.Throwable -> L62
            android.content.ContentResolver r0 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L62
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            android.database.Cursor r0 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L5c
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L75
            if (r1 == 0) goto L5c
            r1 = 0
            r1 = r2[r1]     // Catch: java.lang.Throwable -> L75
            int r1 = r0.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L75
            int r6 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L75
        L5c:
            if (r0 == 0) goto L4
            r0.close()
            goto L4
        L62:
            r0 = move-exception
            r0 = r7
        L64:
            if (r0 == 0) goto L4
            r0.close()
            goto L4
        L6a:
            r0 = move-exception
        L6b:
            if (r7 == 0) goto L70
            r7.close()
        L70:
            throw r0
        L71:
            r1 = move-exception
            r7 = r0
            r0 = r1
            goto L6b
        L75:
            r1 = move-exception
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.p080j.C1426e.m8675a(android.content.Context, android.net.Uri):int");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    /* renamed from: b */
    public static java.lang.String m8666b(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = 0
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L37
            r0 = 0
            java.lang.String r1 = "_display_name"
            r2[r0] = r1     // Catch: java.lang.Throwable -> L37
            android.content.ContentResolver r0 = r7.getContentResolver()     // Catch: java.lang.Throwable -> L37
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r8
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L5e
            boolean r0 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L59
            if (r0 == 0) goto L5e
            r0 = 0
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L59
            int r0 = r1.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.String r6 = r1.getString(r0)     // Catch: java.lang.Throwable -> L59
            r0 = r6
        L29:
            if (r1 == 0) goto L2e
            r1.close()
        L2e:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L36
            java.lang.String r0 = "upload.jpg"
        L36:
            return r0
        L37:
            r0 = move-exception
            r0 = r6
        L39:
            if (r0 == 0) goto L3e
            r0.close()
        L3e:
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L5c
            java.lang.String r0 = "upload.jpg"
            goto L36
        L47:
            r0 = move-exception
            r1 = r6
        L49:
            if (r1 == 0) goto L4e
            r1.close()
        L4e:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto L56
            java.lang.String r1 = "upload.jpg"
        L56:
            throw r0
        L57:
            r0 = move-exception
            goto L49
        L59:
            r0 = move-exception
            r0 = r1
            goto L39
        L5c:
            r0 = r6
            goto L36
        L5e:
            r0 = r6
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tsf.extend.base.p080j.C1426e.m8666b(android.content.Context, android.net.Uri):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public static Uri m8665c(Context context, Uri uri) {
        Closeable closeable;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (uri.getScheme() != null && uri.getAuthority() != null && uri.getScheme().contains("content") && (uri.getAuthority().contains("com.android.providers.media.documents") || uri.getAuthority().contains("com.google.android.apps.docs.storage") || uri.getAuthority().contains("com.google.android.apps.photos.contentprovider"))) {
            String m8621a = C1437p.m8621a(context);
            if (TextUtils.isEmpty(m8621a)) {
                m8621a = C1437p.m8617b(context);
            }
            if (m8621a != null) {
                try {
                    String m8666b = m8666b(context, uri);
                    File file = new File(((m8621a + File.separator) + "TsfTheme") + "/.image");
                    file.mkdirs();
                    File file2 = new File(file, m8666b);
                    inputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[2048];
                            while (true) {
                                int read = inputStream.read(bArr, 0, 2048);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            fileOutputStream.flush();
                            uri = Uri.fromFile(file2);
                            m8667a(inputStream);
                            m8667a(fileOutputStream);
                        } catch (IOException e) {
                            inputStream2 = fileOutputStream;
                            m8667a(inputStream);
                            m8667a(inputStream2);
                            return uri;
                        } catch (Throwable th) {
                            inputStream2 = inputStream;
                            th = th;
                            closeable = fileOutputStream;
                            m8667a(inputStream2);
                            m8667a(closeable);
                            throw th;
                        }
                    } catch (IOException e2) {
                    } catch (Throwable th2) {
                        closeable = null;
                        inputStream2 = inputStream;
                        th = th2;
                    }
                } catch (IOException e3) {
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    closeable = null;
                }
            }
        }
        return uri;
    }

    /* renamed from: a */
    private static void m8667a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m8670a(Bitmap bitmap, int i, boolean z) {
        Bitmap copy = z ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        if (i < 1) {
            return null;
        }
        int width = copy.getWidth();
        int height = copy.getHeight();
        int[] iArr = new int[width * height];
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = width - 1;
        int i3 = height - 1;
        int i4 = width * height;
        int i5 = i + i + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i6 = (i5 + 1) >> 1;
        int i7 = i6 * i6;
        int[] iArr6 = new int[i7 * ItemInfo.APP_VERSION_CODE];
        for (int i8 = 0; i8 < i7 * ItemInfo.APP_VERSION_CODE; i8++) {
            iArr6[i8] = i8 / i7;
        }
        int[][] iArr7 = (int[][]) Array.newInstance(Integer.TYPE, i5, 3);
        int i9 = i + 1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i10;
            if (i13 >= height) {
                break;
            }
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            for (int i23 = -i; i23 <= i; i23++) {
                int i24 = iArr[Math.min(i2, Math.max(i23, 0)) + i12];
                int[] iArr8 = iArr7[i23 + i];
                iArr8[0] = (16711680 & i24) >> 16;
                iArr8[1] = (65280 & i24) >> 8;
                iArr8[2] = i24 & 255;
                int abs = i9 - Math.abs(i23);
                i21 += iArr8[0] * abs;
                i20 += iArr8[1] * abs;
                i19 += abs * iArr8[2];
                if (i23 > 0) {
                    i15 += iArr8[0];
                    i22 += iArr8[1];
                    i14 += iArr8[2];
                } else {
                    i18 += iArr8[0];
                    i17 += iArr8[1];
                    i16 += iArr8[2];
                }
            }
            int i25 = i21;
            int i26 = i20;
            int i27 = i19;
            int i28 = i12;
            int i29 = i;
            for (int i30 = 0; i30 < width; i30++) {
                iArr2[i28] = iArr6[i25];
                iArr3[i28] = iArr6[i26];
                iArr4[i28] = iArr6[i27];
                int i31 = i25 - i18;
                int i32 = i26 - i17;
                int i33 = i27 - i16;
                int[] iArr9 = iArr7[((i29 - i) + i5) % i5];
                int i34 = i18 - iArr9[0];
                int i35 = i17 - iArr9[1];
                int i36 = i16 - iArr9[2];
                if (i13 == 0) {
                    iArr5[i30] = Math.min(i30 + i + 1, i2);
                }
                int i37 = iArr[iArr5[i30] + i11];
                iArr9[0] = (16711680 & i37) >> 16;
                iArr9[1] = (65280 & i37) >> 8;
                iArr9[2] = i37 & 255;
                int i38 = i15 + iArr9[0];
                int i39 = i22 + iArr9[1];
                int i40 = i14 + iArr9[2];
                i25 = i31 + i38;
                i26 = i32 + i39;
                i27 = i33 + i40;
                i29 = (i29 + 1) % i5;
                int[] iArr10 = iArr7[i29 % i5];
                i18 = i34 + iArr10[0];
                i17 = i35 + iArr10[1];
                i16 = i36 + iArr10[2];
                i15 = i38 - iArr10[0];
                i22 = i39 - iArr10[1];
                i14 = i40 - iArr10[2];
                i28++;
            }
            i10 = i13 + 1;
            i11 += width;
            i12 = i28;
        }
        for (int i41 = 0; i41 < width; i41++) {
            int i42 = 0;
            int i43 = (-i) * width;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            int i47 = 0;
            int i48 = -i;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            while (i48 <= i) {
                int max = Math.max(0, i43) + i41;
                int[] iArr11 = iArr7[i48 + i];
                iArr11[0] = iArr2[max];
                iArr11[1] = iArr3[max];
                iArr11[2] = iArr4[max];
                int abs2 = i9 - Math.abs(i48);
                int i53 = (iArr2[max] * abs2) + i51;
                int i54 = (iArr3[max] * abs2) + i50;
                int i55 = (iArr4[max] * abs2) + i49;
                if (i48 > 0) {
                    i44 += iArr11[0];
                    i52 += iArr11[1];
                    i42 += iArr11[2];
                } else {
                    i47 += iArr11[0];
                    i46 += iArr11[1];
                    i45 += iArr11[2];
                }
                if (i48 < i3) {
                    i43 += width;
                }
                i48++;
                i49 = i55;
                i50 = i54;
                i51 = i53;
            }
            int i56 = i50;
            int i57 = i51;
            int i58 = i49;
            int i59 = i41;
            int i60 = i42;
            int i61 = i52;
            int i62 = i44;
            int i63 = i45;
            int i64 = i46;
            int i65 = i47;
            int i66 = i;
            for (int i67 = 0; i67 < height; i67++) {
                iArr[i59] = ((-16777216) & iArr[i59]) | (iArr6[i57] << 16) | (iArr6[i56] << 8) | iArr6[i58];
                int i68 = i57 - i65;
                int i69 = i56 - i64;
                int i70 = i58 - i63;
                int[] iArr12 = iArr7[((i66 - i) + i5) % i5];
                int i71 = i65 - iArr12[0];
                int i72 = i64 - iArr12[1];
                int i73 = i63 - iArr12[2];
                if (i41 == 0) {
                    iArr5[i67] = Math.min(i67 + i9, i3) * width;
                }
                int i74 = iArr5[i67] + i41;
                iArr12[0] = iArr2[i74];
                iArr12[1] = iArr3[i74];
                iArr12[2] = iArr4[i74];
                int i75 = i62 + iArr12[0];
                int i76 = i61 + iArr12[1];
                int i77 = i60 + iArr12[2];
                i57 = i68 + i75;
                i56 = i69 + i76;
                i58 = i70 + i77;
                i66 = (i66 + 1) % i5;
                int[] iArr13 = iArr7[i66];
                i65 = i71 + iArr13[0];
                i64 = i72 + iArr13[1];
                i63 = i73 + iArr13[2];
                i62 = i75 - iArr13[0];
                i61 = i76 - iArr13[1];
                i60 = i77 - iArr13[2];
                i59 += width;
            }
        }
        copy.setPixels(iArr, 0, width, 0, 0, width, height);
        return copy;
    }

    /* renamed from: a */
    public static Bitmap m8676a(Context context) {
        try {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), C1536f.C1540d.wallpaper_favorite_btn);
            Paint paint = new Paint();
            paint.setColorFilter(new PorterDuffColorFilter(-4868683, PorterDuff.Mode.SRC_IN));
            Bitmap createBitmap = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawBitmap(decodeResource, (Rect) null, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), paint);
            return createBitmap;
        } catch (Throwable th) {
            return null;
        }
    }
}
