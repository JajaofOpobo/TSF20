package com.tsf.extend.base.p077g;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tsf.extend.C1536f;
import com.tsf.extend.base.p080j.C1435n;
import java.net.URLEncoder;
/* renamed from: com.tsf.extend.base.g.a */
/* loaded from: classes.dex */
public class C1407a extends C1411d {

    /* renamed from: f */
    private static String f4375f = "http://m.facebook.com/sharer.php?u=";

    /* renamed from: g */
    private static String f4376g = "https://play.google.com/store/apps/details?id=com.ksmobile.launcher&referrer=utm_source%3Dsharelink_fbshare";

    public C1407a(Context context, Intent intent) {
        super(context, intent, "com.facebook.katana", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: a */
    public void mo8756a() {
        String stringExtra;
        String stringExtra2;
        super.mo8756a();
        String stringExtra3 = this.f4381a.getStringExtra("IMG_URL");
        boolean booleanExtra = this.f4381a.getBooleanExtra("USE_DEEP_LINK", false);
        if (!TextUtils.isEmpty(stringExtra3) && booleanExtra) {
            String stringExtra4 = this.f4381a.getStringExtra("THEME_ID");
            String stringExtra5 = this.f4381a.getStringExtra("THEME_PKG");
            String stringExtra6 = this.f4381a.getStringExtra("SHARE_URL");
            String str = null;
            switch (this.f4381a.getIntExtra("SHARE_TYPE", 1)) {
                case 2:
                    stringExtra = this.f4385e.getString(C1536f.C1543g.share_diy_fb_link_title);
                    stringExtra2 = this.f4385e.getString(C1536f.C1543g.share_diy_fb_link_des);
                    break;
                case 3:
                    stringExtra = this.f4385e.getString(C1536f.C1543g.album_share_title);
                    stringExtra2 = this.f4385e.getString(C1536f.C1543g.album_share_content);
                    break;
                case 4:
                    stringExtra = this.f4381a.getStringExtra("android.intent.extra.SUBJECT");
                    stringExtra2 = this.f4381a.getStringExtra("android.intent.extra.TEXT");
                    break;
                default:
                    stringExtra = this.f4385e.getString(C1536f.C1543g.share_theme_fb_link_title);
                    stringExtra2 = this.f4385e.getString(C1536f.C1543g.share_diy_fb_link_des);
                    break;
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("http://www.cmcm.com/activity/cml/applink/?language=en&type=fb_call&shareurl=");
                if (!TextUtils.isEmpty(stringExtra6)) {
                    sb.append(URLEncoder.encode(stringExtra6, "utf-8"));
                }
                sb.append("&title=");
                sb.append(URLEncoder.encode(stringExtra, "utf-8"));
                sb.append("&sitename=INSIGHTS&des=");
                sb.append(URLEncoder.encode(stringExtra2, "utf-8"));
                sb.append("&imgsrc=");
                sb.append(URLEncoder.encode(stringExtra3, "utf-8"));
                sb.append("&cmurl=");
                if (TextUtils.isEmpty(stringExtra6)) {
                    sb.append(URLEncoder.encode("cmlauncher://theme", "utf-8"));
                }
                if (stringExtra4 != null) {
                    sb.append("&theme_id=");
                    sb.append(stringExtra4);
                }
                if (stringExtra5 != null) {
                    sb.append("&pkg=");
                    sb.append(stringExtra5);
                }
                str = sb.toString();
            } catch (Exception e) {
            }
            this.f4381a.setType("text/plain");
            this.f4381a.putExtra("android.intent.extra.TEXT", str);
            return;
        }
        this.f4381a.putExtra("android.intent.extra.TEXT", this.f4381a.getStringExtra("WEB_URL"));
    }

    @Override // com.tsf.extend.base.p077g.C1411d
    /* renamed from: b */
    public boolean mo8755b() {
        this.f4385e.startActivity(C1435n.m8632a(this.f4385e, f4375f + f4376g));
        return true;
    }
}
