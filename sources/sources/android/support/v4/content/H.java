package android.support.v4.content;

import android.content.Context;
import androidx.core.content.ContextCompat;

public class H {
    public static int a(Context context, String permission) {
        return ContextCompat.checkSelfPermission(context, permission);
    }
}