package com.tsf.shell.widget.alarm.setting;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
/* loaded from: classes.dex */
public class c {
    private Uri a;
    private Context b;

    public c(Context context) {
        this.b = context;
    }

    public void a(Uri uri) {
        this.a = uri;
    }

    public String a() {
        if (this.a != null) {
            Ringtone ringtone = RingtoneManager.getRingtone(this.b, this.a);
            i.c("ssssssssfffffsssssssss:" + this.a);
            if (ringtone != null) {
                i.c("sssssssssssssssss:" + this.a);
                try {
                    return ringtone.getTitle(this.b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return this.b.getString(m.f.silent_alarm_summary);
    }

    public String b() {
        return this.a != null ? this.a.toString() : "silent";
    }
}
