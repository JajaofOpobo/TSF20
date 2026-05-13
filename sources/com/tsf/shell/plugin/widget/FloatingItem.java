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

    /* renamed from: a */
    public String f13023a;

    /* renamed from: b */
    public String f13024b;

    /* renamed from: c */
    public float f13025c;

    /* renamed from: d */
    public float f13026d;

    /* renamed from: e */
    public float f13027e;

    /* renamed from: f */
    public boolean f13028f;

    /* renamed from: g */
    public boolean f13029g;

    /* renamed from: h */
    public boolean f13030h;

    /* renamed from: i */
    public int f13031i;

    /* renamed from: j */
    public int f13032j;

    /* renamed from: k */
    public int f13033k;

    /* renamed from: l */
    public int f13034l;

    /* renamed from: m */
    public boolean f13035m;

    /* renamed from: n */
    public float f13036n;

    /* renamed from: o */
    public boolean f13037o;

    /* renamed from: p */
    public Animation f13038p;

    /* renamed from: q */
    public TSFsequence f13039q;

    public FloatingItem() {
        this.f13028f = true;
        this.f13029g = true;
        this.f13030h = false;
        this.f13035m = false;
        this.f13037o = false;
    }

    public FloatingItem(String str) {
        this.f13028f = true;
        this.f13029g = true;
        this.f13030h = false;
        this.f13035m = false;
        this.f13037o = false;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f13028f = jSONObject.getBoolean("horizontal");
            this.f13028f = jSONObject.getBoolean("horizontal");
            this.f13030h = jSONObject.getBoolean("isSequence");
            this.f13035m = jSONObject.getBoolean("overturn");
            this.f13029g = jSONObject.getBoolean("positionIncrease");
            this.f13031i = jSONObject.getInt("totalFrame");
            this.f13032j = jSONObject.getInt("unitCount");
            this.f13033k = jSONObject.getInt("unitHeight");
            this.f13034l = jSONObject.getInt("unitWidth");
            this.f13027e = (float) jSONObject.getDouble("currentSpeed");
            this.f13024b = jSONObject.getString("drawable");
            this.f13036n = (float) jSONObject.getDouble("wave");
            this.f13026d = (float) jSONObject.getDouble("maxSpeed");
            this.f13025c = (float) jSONObject.getDouble("miniSpeed");
            this.f13023a = jSONObject.getString("packageName");
        } catch (Exception e) {
            this.f13037o = true;
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m965a() {
        this.f13035m = this.f13038p.f13021d;
        this.f13025c = this.f13038p.f13020c;
        this.f13026d = this.f13038p.f13019b;
        this.f13036n = this.f13038p.f13022e;
        if (this.f13036n > 300.0f) {
            this.f13036n = 300.0f;
        } else if (this.f13036n < 0.0f) {
            this.f13036n = 0.0f;
        }
        if (this.f13025c < 0.0f) {
            this.f13025c = 0.0f;
        }
        if (this.f13026d > 20.0f) {
            this.f13026d = 20.0f;
        }
        this.f13028f = (this.f13038p.f13018a.equals("vertical_up") || this.f13038p.f13018a.equals("vertical_down")) ? false : true;
        if (this.f13038p.f13018a.equals("vertical_up") || this.f13038p.f13018a.equals("horizontal_right")) {
            this.f13029g = true;
        } else {
            this.f13029g = false;
        }
        if (this.f13039q == null) {
            this.f13030h = false;
            return;
        }
        this.f13031i = this.f13039q.f13053b;
        this.f13032j = this.f13039q.f13054c;
        this.f13034l = this.f13039q.f13056e;
        this.f13033k = this.f13039q.f13055d;
        if (this.f13031i == 0 || this.f13032j == 0 || this.f13034l == 0 || this.f13033k == 0) {
            this.f13030h = false;
            this.f13037o = true;
            return;
        }
        this.f13030h = true;
    }

    private FloatingItem(Parcel parcel) {
        this.f13028f = true;
        this.f13029g = true;
        this.f13030h = false;
        this.f13035m = false;
        this.f13037o = false;
        this.f13023a = parcel.readString();
        this.f13024b = parcel.readString();
        this.f13038p = (Animation) parcel.readParcelable(Animation.class.getClassLoader());
        this.f13039q = (TSFsequence) parcel.readParcelable(TSFsequence.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13023a);
        parcel.writeString(this.f13024b);
        parcel.writeParcelable(this.f13038p, i);
        parcel.writeParcelable(this.f13039q, i);
    }
}
