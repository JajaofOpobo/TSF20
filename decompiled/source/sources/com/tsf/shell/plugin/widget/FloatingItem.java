package com.tsf.shell.plugin.widget;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class FloatingItem implements Parcelable {
    public static final Parcelable.Creator<FloatingItem> CREATOR = new Parcelable.Creator<FloatingItem>() { // from class: com.tsf.shell.plugin.widget.FloatingItem.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FloatingItem createFromParcel(Parcel parcel) {
            return new FloatingItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public FloatingItem[] newArray(int i) {
            return new FloatingItem[i];
        }
    };
    public String a;
    public String b;
    public float c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public float n;
    public boolean o;
    public Animation p;
    public TSFsequence q;

    public FloatingItem() {
        this.f = true;
        this.g = true;
        this.h = false;
        this.m = false;
        this.o = false;
    }

    public FloatingItem(String str) {
        this.f = true;
        this.g = true;
        this.h = false;
        this.m = false;
        this.o = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f = jSONObject.getBoolean("horizontal");
            this.f = jSONObject.getBoolean("horizontal");
            this.h = jSONObject.getBoolean("isSequence");
            this.m = jSONObject.getBoolean("overturn");
            this.g = jSONObject.getBoolean("positionIncrease");
            this.i = jSONObject.getInt("totalFrame");
            this.j = jSONObject.getInt("unitCount");
            this.k = jSONObject.getInt("unitHeight");
            this.l = jSONObject.getInt("unitWidth");
            this.e = (float) jSONObject.getDouble("currentSpeed");
            this.b = jSONObject.getString("drawable");
            this.n = (float) jSONObject.getDouble("wave");
            this.d = (float) jSONObject.getDouble("maxSpeed");
            this.c = (float) jSONObject.getDouble("miniSpeed");
            this.a = jSONObject.getString("packageName");
        } catch (Exception e) {
            this.o = true;
            e.printStackTrace();
        }
    }

    public void a() {
        this.m = this.p.d;
        this.c = this.p.c;
        this.d = this.p.b;
        this.n = this.p.e;
        if (this.n > 300.0f) {
            this.n = 300.0f;
        } else if (this.n < 0.0f) {
            this.n = 0.0f;
        }
        if (this.c < 0.0f) {
            this.c = 0.0f;
        }
        if (this.d > 20.0f) {
            this.d = 20.0f;
        }
        this.f = (this.p.a.equals("vertical_up") || this.p.a.equals("vertical_down")) ? false : true;
        if (this.p.a.equals("vertical_up") || this.p.a.equals("horizontal_right")) {
            this.g = true;
        } else {
            this.g = false;
        }
        if (this.q == null) {
            this.h = false;
            return;
        }
        this.i = this.q.b;
        this.j = this.q.c;
        this.l = this.q.e;
        this.k = this.q.d;
        if (this.i == 0 || this.j == 0 || this.l == 0 || this.k == 0) {
            this.h = false;
            this.o = true;
            return;
        }
        this.h = true;
    }

    private FloatingItem(Parcel parcel) {
        this.f = true;
        this.g = true;
        this.h = false;
        this.m = false;
        this.o = false;
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.p = (Animation) parcel.readParcelable(Animation.class.getClassLoader());
        this.q = (TSFsequence) parcel.readParcelable(TSFsequence.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.p, i);
        parcel.writeParcelable(this.q, i);
    }
}
