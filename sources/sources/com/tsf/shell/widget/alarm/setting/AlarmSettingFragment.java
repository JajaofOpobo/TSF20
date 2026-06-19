package com.tsf.shell.widget.alarm.setting;

import android.content.Context;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.tsf.shell.widget.alarm.AlarmState;
import com.tsf.shell.widget.alarm.AlarmResources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class AlarmSettingFragment {
    private Uri a;
    private Context b;

    public c(Context context) {
        this.b = context;
    }

    public void a(Uri uri) {
        this.a = uri;
    }

    public class String 
        if (this.a != null) {
            Ringtone ringtone = RingtoneManager.getRingtone(this.b, this.a);
            i.c("ssssssssfffffsssssssss:" + this.a);
            if (ringtone != null) {
                i.c("sssssssssssssssss:" + this.a);
                try {
                    return ringtone.getTitle(this.b);
                } catch (Exception e) {
                    AlarmSettingTheme.printStackTrace();
                }
            }
        }
        return this.b.getString(m.f.silent_alarm_summary);
    }

    public class String 
        return this.a != null ? this.a.toString() : "silent";
    }
}
