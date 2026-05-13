package com.tsf.shell.widget.alarm.p205d;

import android.content.Context;
import com.censivn.C3DEngine.api.element.info.ItemInfo;
import com.tsf.shell.widget.alarm.C4314m;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
/* renamed from: com.tsf.shell.widget.alarm.d.d */
/* loaded from: classes.dex */
public class C4293d {
    /* renamed from: a */
    public static byte[] m297a(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(m296b(context, i));
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[ItemInfo.APP_VERSION_NAME];
                while (true) {
                    int read = openRawResource.read(bArr, 0, ItemInfo.APP_VERSION_NAME);
                    if (read <= 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                        return byteArray;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return byteArray;
                    }
                }
                return byteArray;
            } catch (Throwable th) {
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            if (openRawResource != null) {
                try {
                    openRawResource.close();
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    public static int m296b(Context context, int i) {
        switch (i) {
            case 1:
                return C4314m.C4319e.ic_accuweather_tablet_1;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return C4314m.C4319e.ic_accuweather_tablet_2;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return C4314m.C4319e.ic_accuweather_tablet_7;
            case 12:
                return C4314m.C4319e.ic_accuweather_tablet_12;
            case 13:
            case 14:
                return C4314m.C4319e.ic_accuweather_tablet_13;
            case 15:
            case 16:
            case 17:
            case 18:
                return C4314m.C4319e.ic_accuweather_tablet_15;
            case 19:
                return C4314m.C4319e.ic_accuweather_tablet_19;
            case 20:
            case 21:
                return C4314m.C4319e.ic_accuweather_tablet_20;
            case 22:
                return C4314m.C4319e.ic_accuweather_tablet_22;
            case 23:
                return C4314m.C4319e.ic_accuweather_tablet_23;
            case 24:
                return C4314m.C4319e.ic_accuweather_tablet_24;
            case 25:
                return C4314m.C4319e.ic_accuweather_tablet_25;
            case 26:
            case 27:
            case 28:
                return C4314m.C4319e.ic_accuweather_tablet_26;
            case 29:
                return C4314m.C4319e.ic_accuweather_tablet_29;
            case 30:
                return C4314m.C4319e.ic_accuweather_tablet_30;
            case 31:
                return C4314m.C4319e.ic_accuweather_tablet_31;
            case 32:
                return C4314m.C4319e.ic_accuweather_tablet_32;
            case 33:
                return C4314m.C4319e.ic_accuweather_tablet_33;
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                return C4314m.C4319e.ic_accuweather_tablet_34;
            case 39:
            case 40:
                return C4314m.C4319e.ic_accuweather_tablet_39;
            case 41:
            case 42:
                return C4314m.C4319e.ic_accuweather_tablet_41;
            case 43:
            case 44:
                return C4314m.C4319e.ic_accuweather_tablet_43;
            default:
                return C4314m.C4319e.unknown;
        }
    }
}
