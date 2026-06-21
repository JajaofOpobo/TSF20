package com.tsf.shell.widget.alarm.AlarmUtils;

import android.net.Uri;
import android.provider.BaseColumns;

/* loaded from: classes.dex */
public class a implements BaseColumns {
    public static final Uri a = Uri.parse("content://com.tsf.shell.widget.alarm.inshell.alarmclock/alarm");
    static final String[] b = {"_id", "hour", "minutes", "daysofweek", "alarmtime", "enabled", "vibrate", "message", "alert"};
}
