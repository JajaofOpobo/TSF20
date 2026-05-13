package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.provider.BaseColumns;
import com.tsf.shell.widget.alarm.C4305i;
import java.util.Calendar;
/* loaded from: classes.dex */
public final class Alarm implements Parcelable {
    public static final Parcelable.Creator<Alarm> CREATOR = new Parcelable.Creator<Alarm>() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.Alarm.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Alarm createFromParcel(Parcel parcel) {
            return new Alarm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Alarm[] newArray(int i) {
            return new Alarm[i];
        }
    };

    /* renamed from: a */
    public int f13658a;

    /* renamed from: b */
    public boolean f13659b;

    /* renamed from: c */
    public int f13660c;

    /* renamed from: d */
    public int f13661d;

    /* renamed from: e */
    public C4227b f13662e;

    /* renamed from: f */
    public long f13663f;

    /* renamed from: g */
    public boolean f13664g;

    /* renamed from: h */
    public String f13665h;

    /* renamed from: i */
    public Uri f13666i;

    /* renamed from: j */
    public boolean f13667j;

    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.Alarm$a */
    /* loaded from: classes.dex */
    public static class C4226a implements BaseColumns {

        /* renamed from: a */
        public static final Uri f13668a = Uri.parse("content://com.tsf.shell.widget.alarm.inshell.alarmclock/alarm");

        /* renamed from: b */
        static final String[] f13669b = {"_id", "hour", "minutes", "daysofweek", "alarmtime", "enabled", "vibrate", "message", "alert"};
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13658a);
        parcel.writeInt(this.f13659b ? 1 : 0);
        parcel.writeInt(this.f13660c);
        parcel.writeInt(this.f13661d);
        parcel.writeInt(this.f13662e.m488a());
        parcel.writeLong(this.f13663f);
        parcel.writeInt(this.f13664g ? 1 : 0);
        parcel.writeString(this.f13665h);
        parcel.writeParcelable(this.f13666i, i);
        parcel.writeInt(this.f13667j ? 1 : 0);
    }

    public Alarm(Cursor cursor) {
        this.f13658a = cursor.getInt(0);
        this.f13659b = cursor.getInt(5) == 1;
        this.f13660c = cursor.getInt(1);
        this.f13661d = cursor.getInt(2);
        this.f13662e = new C4227b(cursor.getInt(3));
        this.f13663f = cursor.getLong(4);
        this.f13664g = cursor.getInt(6) == 1;
        this.f13665h = cursor.getString(7);
        String string = cursor.getString(8);
        if ("silent".equals(string)) {
            C4305i.m258d("Alarm is marked as silent");
            this.f13667j = true;
            return;
        }
        if (string != null && string.length() != 0) {
            this.f13666i = Uri.parse(string);
        }
        if (this.f13666i == null) {
            this.f13666i = RingtoneManager.getDefaultUri(4);
        }
    }

    public Alarm(Parcel parcel) {
        this.f13658a = parcel.readInt();
        this.f13659b = parcel.readInt() == 1;
        this.f13660c = parcel.readInt();
        this.f13661d = parcel.readInt();
        this.f13662e = new C4227b(parcel.readInt());
        this.f13663f = parcel.readLong();
        this.f13664g = parcel.readInt() == 1;
        this.f13665h = parcel.readString();
        this.f13666i = (Uri) parcel.readParcelable(null);
        this.f13667j = parcel.readInt() == 1;
    }

    /* renamed from: a */
    public String m491a(Context context) {
        return (this.f13665h == null || this.f13665h.length() == 0) ? "" : this.f13665h;
    }

    /* renamed from: com.tsf.shell.widget.alarm.AlarmUtils.Alarm$b */
    /* loaded from: classes.dex */
    public static final class C4227b {

        /* renamed from: a */
        private static int[] f13670a = {2, 3, 4, 5, 6, 7, 1};

        /* renamed from: b */
        private int f13671b;

        public C4227b(int i) {
            this.f13671b = i;
        }

        /* renamed from: a */
        private boolean m487a(int i) {
            return (this.f13671b & (1 << i)) > 0;
        }

        /* renamed from: a */
        public void m486a(int i, boolean z) {
            if (z) {
                this.f13671b |= 1 << i;
            } else {
                this.f13671b &= (1 << i) ^ (-1);
            }
        }

        /* renamed from: a */
        public int m488a() {
            return this.f13671b;
        }

        /* renamed from: b */
        public boolean[] m484b() {
            boolean[] zArr = new boolean[7];
            for (int i = 0; i < 7; i++) {
                zArr[i] = m487a(i);
            }
            return zArr;
        }

        /* renamed from: c */
        public boolean m483c() {
            return this.f13671b != 0;
        }

        /* renamed from: a */
        public int m485a(Calendar calendar) {
            if (this.f13671b == 0) {
                return -1;
            }
            int i = (calendar.get(7) + 5) % 7;
            int i2 = 0;
            while (i2 < 7 && !m487a((i + i2) % 7)) {
                i2++;
            }
            return i2;
        }
    }
}
