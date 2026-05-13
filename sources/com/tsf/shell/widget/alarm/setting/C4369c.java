package com.tsf.shell.widget.alarm.setting;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
/* renamed from: com.tsf.shell.widget.alarm.setting.c */
/* loaded from: classes.dex */
public class C4369c {

    /* renamed from: a */
    private Uri f14135a;

    /* renamed from: b */
    private Context f14136b;

    public C4369c(Context context) {
        this.f14136b = context;
    }

    /* renamed from: a */
    public void m123a(Uri uri) {
        this.f14135a = uri;
    }

    /* renamed from: a */
    public String m124a() {
        if (this.f14135a != null) {
            Ringtone ringtone = RingtoneManager.getRingtone(this.f14136b, this.f14135a);
            C4305i.m259c("ssssssssfffffsssssssss:" + this.f14135a);
            if (ringtone != null) {
                C4305i.m259c("sssssssssssssssss:" + this.f14135a);
                try {
                    return ringtone.getTitle(this.f14136b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return this.f14136b.getString(C4314m.C4320f.silent_alarm_summary);
    }

    /* renamed from: b */
    public String m122b() {
        return this.f14135a != null ? this.f14135a.toString() : "silent";
    }
}
