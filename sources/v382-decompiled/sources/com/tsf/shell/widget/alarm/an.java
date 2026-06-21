package com.tsf.shell.widget.alarm;

import android.content.Context;
import com.censivn.C3DEngine.api.core.VObject3d;

/* loaded from: classes.dex */
public class an {
    public VObject3d getWidget(Context context, Integer num) {
        return new AlarmWidget(context, num);
    }
}
