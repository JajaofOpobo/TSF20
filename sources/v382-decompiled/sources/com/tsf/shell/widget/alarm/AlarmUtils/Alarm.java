package com.tsf.shell.widget.alarm.AlarmUtils;

import android.content.Context;
import android.database.Cursor;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.tsf.shell.widget.alarm.u;

/* loaded from: classes.dex */
public final class Alarm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: com.tsf.shell.widget.alarm.AlarmUtils.Alarm.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Alarm createFromParcel(Parcel parcel) {
            return new Alarm(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Alarm[] newArray(int i) {
            return new Alarm[i];
        }
    };
    public int a;
    public boolean b;
    public int c;
    public int d;
    public b e;
    public long f;
    public boolean g;
    public String h;
    public Uri i;
    public boolean j;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e.a());
        parcel.writeLong(this.f);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeString(this.h);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public Alarm(Cursor cursor) {
        this.a = cursor.getInt(0);
        this.b = cursor.getInt(5) == 1;
        this.c = cursor.getInt(1);
        this.d = cursor.getInt(2);
        this.e = new b(cursor.getInt(3));
        this.f = cursor.getLong(4);
        this.g = cursor.getInt(6) == 1;
        this.h = cursor.getString(7);
        String string = cursor.getString(8);
        if ("silent".equals(string)) {
            u.d("Alarm is marked as silent");
            this.j = true;
            return;
        }
        if (string != null && string.length() != 0) {
            this.i = Uri.parse(string);
        }
        if (this.i == null) {
            this.i = RingtoneManager.getDefaultUri(4);
        }
    }

    public Alarm(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt() == 1;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = new b(parcel.readInt());
        this.f = parcel.readLong();
        this.g = parcel.readInt() == 1;
        this.h = parcel.readString();
        this.i = (Uri) parcel.readParcelable(null);
        this.j = parcel.readInt() == 1;
    }

    public String a(Context context) {
        return (this.h == null || this.h.length() == 0) ? "" : this.h;
    }
}
