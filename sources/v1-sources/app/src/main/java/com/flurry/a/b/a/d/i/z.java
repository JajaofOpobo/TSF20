package com.flurry.a.b.a.d.i;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class z extends DateFormat {
    protected static final String[] a = {"yyyy-MM-dd'T'HH:mm:ss.SSSZ", "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
    protected static final DateFormat b;
    protected static final DateFormat c;
    protected static final DateFormat d;
    protected static final DateFormat e;
    public static final z f;
    protected transient DateFormat g;
    protected transient DateFormat h;
    protected transient DateFormat i;
    protected transient DateFormat j;

    @Override // java.text.DateFormat, java.text.Format
    public final /* synthetic */ Object clone() {
        return new z();
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz");
        b = simpleDateFormat;
        simpleDateFormat.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        c = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        d = simpleDateFormat3;
        simpleDateFormat3.setTimeZone(timeZone);
        SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("yyyy-MM-dd");
        e = simpleDateFormat4;
        simpleDateFormat4.setTimeZone(timeZone);
        f = new z();
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) {
        String trim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = parse(trim, parsePosition);
        if (parse != null) {
            return parse;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : a) {
            if (sb.length() > 0) {
                sb.append("\", \"");
            } else {
                sb.append('\"');
            }
            sb.append(str2);
        }
        sb.append('\"');
        throw new ParseException(String.format("Can not parse date \"%s\": not compatible with any of standard forms (%s)", trim, sb.toString()), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        char charAt;
        DateFormat dateFormat;
        char charAt2;
        char charAt3;
        char charAt4;
        boolean z = true;
        if (str.length() >= 5 && Character.isDigit(str.charAt(0)) && Character.isDigit(str.charAt(3)) && str.charAt(4) == '-') {
            int length = str.length();
            char charAt5 = str.charAt(length - 1);
            if (length <= 10 && Character.isDigit(charAt5)) {
                dateFormat = this.j;
                if (dateFormat == null) {
                    dateFormat = (DateFormat) e.clone();
                    this.j = dateFormat;
                }
            } else if (charAt5 == 'Z') {
                dateFormat = this.i;
                if (dateFormat == null) {
                    dateFormat = (DateFormat) d.clone();
                    this.i = dateFormat;
                }
                if (str.charAt(length - 4) == ':') {
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(length - 1, ".000");
                    str = sb.toString();
                }
            } else {
                int length2 = str.length();
                if (length2 < 6 || ((charAt2 = str.charAt(length2 - 6)) != '+' && charAt2 != '-' && (charAt3 = str.charAt(length2 - 5)) != '+' && charAt3 != '-' && (charAt4 = str.charAt(length2 - 3)) != '+' && charAt4 != '-')) {
                    z = false;
                }
                if (z) {
                    char charAt6 = str.charAt(length - 3);
                    if (charAt6 == ':') {
                        StringBuilder sb2 = new StringBuilder(str);
                        sb2.delete(length - 3, length - 2);
                        str = sb2.toString();
                    } else if (charAt6 == '+' || charAt6 == '-') {
                        str = str + "00";
                    }
                    int length3 = str.length();
                    if (Character.isDigit(str.charAt(length3 - 9))) {
                        StringBuilder sb3 = new StringBuilder(str);
                        sb3.insert(length3 - 5, ".000");
                        str = sb3.toString();
                    }
                    dateFormat = this.h;
                    if (this.h == null) {
                        dateFormat = (DateFormat) c.clone();
                        this.h = dateFormat;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(str);
                    if ((length - str.lastIndexOf(84)) - 1 <= 8) {
                        sb4.append(".000");
                    }
                    sb4.append('Z');
                    str = sb4.toString();
                    dateFormat = this.i;
                    if (dateFormat == null) {
                        dateFormat = (DateFormat) d.clone();
                        this.i = dateFormat;
                    }
                }
            }
            return dateFormat.parse(str, parsePosition);
        }
        int length4 = str.length();
        do {
            length4--;
            if (length4 < 0 || (charAt = str.charAt(length4)) < '0') {
                break;
            }
        } while (charAt <= '9');
        if (length4 < 0 && com.flurry.a.b.a.c.e.c(str)) {
            return new Date(Long.parseLong(str));
        }
        if (this.g == null) {
            this.g = (DateFormat) b.clone();
        }
        return this.g.parse(str, parsePosition);
    }

    @Override // java.text.DateFormat
    public final StringBuffer format(Date date, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (this.h == null) {
            this.h = (DateFormat) c.clone();
        }
        return this.h.format(date, stringBuffer, fieldPosition);
    }
}
