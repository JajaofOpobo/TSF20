package com.flurry.android;

import com.tsf.shell.R;
import com.tsf.shell.theme.inside.ThemeParser;
import java.util.List;

/* loaded from: classes.dex */
final class j extends com.flurry.a.a.a.d.h implements com.flurry.a.a.a.d.g {
    public static final com.flurry.a.a.a.c a = new com.flurry.a.a.a.y().a("{\"type\":\"record\",\"name\":\"AdUnit\",\"namespace\":\"com.flurry.android\",\"fields\":[{\"name\":\"adSpace\",\"type\":\"string\"},{\"name\":\"expiration\",\"type\":\"long\"},{\"name\":\"adFrames\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AdFrame\",\"fields\":[{\"name\":\"binding\",\"type\":\"int\"},{\"name\":\"display\",\"type\":\"string\"},{\"name\":\"content\",\"type\":\"string\"},{\"name\":\"adSpaceLayout\",\"type\":{\"type\":\"record\",\"name\":\"AdSpaceLayout\",\"fields\":[{\"name\":\"adWidth\",\"type\":\"int\"},{\"name\":\"adHeight\",\"type\":\"int\"},{\"name\":\"fix\",\"type\":\"string\"},{\"name\":\"format\",\"type\":\"string\"},{\"name\":\"alignment\",\"type\":\"string\"}]}},{\"name\":\"callbacks\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Callback\",\"fields\":[{\"name\":\"event\",\"type\":\"string\"},{\"name\":\"actions\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]}}},{\"name\":\"adGuid\",\"type\":\"string\"}]}}},{\"name\":\"combinable\",\"type\":\"int\",\"default\":0},{\"name\":\"groupId\",\"type\":\"string\"},{\"name\":\"idHash\",\"type\":\"string\",\"default\":\"null\"},{\"name\":\"serveTime\",\"type\":\"long\"},{\"name\":\"newCap\",\"type\":\"int\",\"default\":-1},{\"name\":\"previousCap\",\"type\":\"int\",\"default\":-1},{\"name\":\"previousCapType\",\"type\":\"int\",\"default\":0},{\"name\":\"expirationTime\",\"type\":\"long\"}]}");
    public CharSequence b;
    public long c;
    public List d;
    public int e;
    public CharSequence f;
    public CharSequence g;
    public long h;
    public int i;
    public int j;
    public int k;
    public long l;

    j() {
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
                return Long.valueOf(this.c);
            case 2:
                return this.d;
            case 3:
                return Integer.valueOf(this.e);
            case 4:
                return this.f;
            case 5:
                return this.g;
            case 6:
                return Long.valueOf(this.h);
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                return Integer.valueOf(this.i);
            case ThemeParser.TYPE_FOLDER /* 8 */:
                return Integer.valueOf(this.j);
            case 9:
                return Integer.valueOf(this.k);
            case 10:
                return Long.valueOf(this.l);
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
                this.c = ((Long) obj).longValue();
                return;
            case 2:
                this.d = (List) obj;
                return;
            case 3:
                this.e = ((Integer) obj).intValue();
                return;
            case 4:
                this.f = (CharSequence) obj;
                return;
            case 5:
                this.g = (CharSequence) obj;
                return;
            case 6:
                this.h = ((Long) obj).longValue();
                return;
            case R.styleable.CellLayout_longAxisCells /* 7 */:
                this.i = ((Integer) obj).intValue();
                return;
            case ThemeParser.TYPE_FOLDER /* 8 */:
                this.j = ((Integer) obj).intValue();
                return;
            case 9:
                this.k = ((Integer) obj).intValue();
                return;
            case 10:
                this.l = ((Long) obj).longValue();
                return;
            default:
                throw new com.flurry.a.a.a.a("Bad index");
        }
    }

    public final CharSequence b() {
        return this.b;
    }

    public final Long c() {
        return Long.valueOf(this.c);
    }

    public final List d() {
        return this.d;
    }

    public final Integer e() {
        return Integer.valueOf(this.e);
    }

    public final CharSequence f() {
        return this.f;
    }

    public final CharSequence g() {
        return this.g;
    }

    public final Long h() {
        return Long.valueOf(this.h);
    }

    public final Integer i() {
        return Integer.valueOf(this.i);
    }

    public final Integer j() {
        return Integer.valueOf(this.j);
    }

    public final Integer k() {
        return Integer.valueOf(this.k);
    }

    public final Long l() {
        return Long.valueOf(this.l);
    }
}
