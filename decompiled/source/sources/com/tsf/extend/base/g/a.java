package com.tsf.extend.base.g;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.tsf.extend.base.j.n;
import com.tsf.extend.f;
import java.net.URLEncoder;
/* loaded from: classes.dex */
public class a extends d {
    private static String f = "http://m.facebook.com/sharer.php?u=";
    private static String g = "https://play.google.com/store/apps/details?id=com.ksmobile.launcher&referrer=utm_source%3Dsharelink_fbshare";

    public a(Context context, Intent intent) {
        super(context, intent, "com.facebook.katana", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.g.d
    public void a() {
        String stringExtra;
        String stringExtra2;
        super.a();
        String stringExtra3 = this.a.getStringExtra("IMG_URL");
        boolean booleanExtra = this.a.getBooleanExtra("USE_DEEP_LINK", false);
        if (!TextUtils.isEmpty(stringExtra3) && booleanExtra) {
            String stringExtra4 = this.a.getStringExtra("THEME_ID");
            String stringExtra5 = this.a.getStringExtra("THEME_PKG");
            String stringExtra6 = this.a.getStringExtra("SHARE_URL");
            String str = null;
            switch (this.a.getIntExtra("SHARE_TYPE", 1)) {
                case 2:
                    stringExtra = this.e.getString(f.g.share_diy_fb_link_title);
                    stringExtra2 = this.e.getString(f.g.share_diy_fb_link_des);
                    break;
                case 3:
                    stringExtra = this.e.getString(f.g.album_share_title);
                    stringExtra2 = this.e.getString(f.g.album_share_content);
                    break;
                case 4:
                    stringExtra = this.a.getStringExtra("android.intent.extra.SUBJECT");
                    stringExtra2 = this.a.getStringExtra("android.intent.extra.TEXT");
                    break;
                default:
                    stringExtra = this.e.getString(f.g.share_theme_fb_link_title);
                    stringExtra2 = this.e.getString(f.g.share_diy_fb_link_des);
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
            this.a.setType("text/plain");
            this.a.putExtra("android.intent.extra.TEXT", str);
            return;
        }
        this.a.putExtra("android.intent.extra.TEXT", this.a.getStringExtra("WEB_URL"));
    }

    @Override // com.tsf.extend.base.g.d
    public boolean b() {
        this.e.startActivity(n.a(this.e, f + g));
        return true;
    }
}
