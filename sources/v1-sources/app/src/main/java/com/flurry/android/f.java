package com.flurry.android;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class f extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"AdRequest\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"apiKey\",\"type\":\"string\"},{\"name\":\"agentVersion\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"adSpaceName\",\"type\":\"string\"},{\"name\":\"sessionId\",\"type\":\"long\"},{\"name\":\"adReportedIds\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AdReportedId\",\"fields\":[{\"name\":\"type\",\"type\":\"int\"},{\"name\":\"id\",\"type\":\"bytes\"}]}}},{\"name\":\"location\",\"type\":{\"type\":\"record\",\"name\":\"Location\",\"fields\":[{\"name\":\"lat\",\"type\":\"float\",\"default\":0.0},{\"name\":\"lon\",\"type\":\"float\",\"default\":0.0}]},\"default\":\"null\"},{\"name\":\"testDevice\",\"type\":\"boolean\",\"default\":false},{\"name\":\"bindings\",\"type\":{\"type\":\"array\",\"items\":\"int\"}},{\"name\":\"adViewContainer\",\"type\":{\"type\":\"record\",\"name\":\"AdViewContainer\",\"fields\":[{\"name\":\"viewWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"viewHeight\",\"type\":\"int\",\"default\":0},{\"name\":\"screenWidth\",\"type\":\"int\",\"default\":0},{\"name\":\"screenHeight\",\"type\":\"int\",\"default\":0}]},\"default\":\"null\"},{\"name\":\"locale\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"timezone\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"osVersion\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"devicePlatform\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"testAds\",\"type\":{\"type\":\"record\",\"name\":\"TestAds\",\"fields\":[{\"name\":\"adspacePlacement\",\"type\":\"int\",\"default\":0}]},\"default\":\"null\"},{\"name\":\"keywords\",\"type\":{\"type\":\"map\",\"values\":\"string\"},\"default\":[]},{\"name\":\"refresh\",\"type\":\"boolean\",\"default\":false},{\"name\":\"networkStatus\",\"type\":\"int\",\"default\":1},{\"name\":\"canDoSKAppStore\",\"type\":\"boolean\",\"default\":false},{\"name\":\"frequencyCapInfos\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"FrequencyCapInfo\",\"fields\":[{\"name\":\"idHash\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"serveTime\",\"type\":\"long\"},{\"name\":\"expirationTime\",\"type\":\"long\"},{\"name\":\"views\",\"type\":\"int\"},{\"name\":\"newCap\",\"type\":\"int\"},{\"name\":\"previousCap\",\"type\":\"int\"},{\"name\":\"previousCapType\",\"type\":\"int\"}]}}}]}");
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public long e;
    public List f;
    public ab g;
    public boolean h;
    public List i;
    public k j;
    public CharSequence k;
    public CharSequence l;
    public CharSequence m;
    public CharSequence n;
    public ai o;
    public Map p;
    public boolean q;
    public int r;
    public boolean s;
    public List t;

    f() {
    }

    @Override // com.flurry.a.a.a.d.h, com.flurry.a.a.a.b.b
    public final com.flurry.a.a.a.c a() {
        return a;
    }

    @Override // com.flurry.a.a.a.b.r
    public final Object a(int i) {
        switch (i) {
            case 0:
                return this.b;
            case 1:
                return this.c;
            case 2:
                return this.d;
            case 3:
                return Long.valueOf(this.e);
            case 4:
                return this.f;
            case 5:
                return this.g;
            case 6:
                return Boolean.valueOf(this.h);
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return this.i;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                return this.j;
            case 9:
                return this.k;
            case 10:
                return this.l;
            case 11:
                return this.m;
            case 12:
                return this.n;
            case 13:
                return this.o;
            case 14:
                return this.p;
            case 15:
                return Boolean.valueOf(this.q);
            case ThemeParser.TYPE_CONTACT /* 16 */:
                return Integer.valueOf(this.r);
            case 17:
                return Boolean.valueOf(this.s);
            case 18:
                return this.t;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    @Override // com.flurry.a.a.a.b.r
    public final void a(int i, Object obj) {
        switch (i) {
            case 0:
                this.b = (CharSequence) obj;
                return;
            case 1:
                this.c = (CharSequence) obj;
                return;
            case 2:
                this.d = (CharSequence) obj;
                return;
            case 3:
                this.e = ((Long) obj).longValue();
                return;
            case 4:
                this.f = (List) obj;
                return;
            case 5:
                this.g = (ab) obj;
                return;
            case 6:
                this.h = ((Boolean) obj).booleanValue();
                return;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                this.i = (List) obj;
                return;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                this.j = (k) obj;
                return;
            case 9:
                this.k = (CharSequence) obj;
                return;
            case 10:
                this.l = (CharSequence) obj;
                return;
            case 11:
                this.m = (CharSequence) obj;
                return;
            case 12:
                this.n = (CharSequence) obj;
                return;
            case 13:
                this.o = (ai) obj;
                return;
            case 14:
                this.p = (Map) obj;
                return;
            case 15:
                this.q = ((Boolean) obj).booleanValue();
                return;
            case ThemeParser.TYPE_CONTACT /* 16 */:
                this.r = ((Integer) obj).intValue();
                return;
            case 17:
                this.s = ((Boolean) obj).booleanValue();
                return;
            case 18:
                this.t = (List) obj;
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
    }

    public final void a(ai aiVar) {
        this.o = aiVar;
    }

    public final void a(Map map) {
        this.p = map;
    }

    public static g b() {
        return new g((byte) 0);
    }
}
