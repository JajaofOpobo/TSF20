package org.acra.collector;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
public final class Compatibility {

    /* loaded from: classes.dex */
    public class VERSION_CODES {
        public static final int ECLAIR = 5;
        public static final int FROYO = 8;
        public static final int ICE_CREAM_SANDWICH = 14;
        public static final int JELLY_BEAN = 16;
        public static final int JELLY_BEAN_MR1 = 17;
        public static final int LOLLIPOP = 21;

        public VERSION_CODES() {
        }
    }

    public static int getAPILevel() {
        try {
            return Build.VERSION.class.getField("SDK_INT").getInt(null);
        } catch (IllegalAccessException e) {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (IllegalArgumentException e2) {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NoSuchFieldException e3) {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (SecurityException e4) {
            return Integer.parseInt(Build.VERSION.SDK);
        }
    }

    public static String getDropBoxServiceName() {
        Field field = Context.class.getField("DROPBOX_SERVICE");
        if (field != null) {
            return (String) field.get(null);
        }
        return null;
    }
}
