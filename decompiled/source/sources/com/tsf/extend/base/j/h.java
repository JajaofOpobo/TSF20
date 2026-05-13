package com.tsf.extend.base.j;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Patterns;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class h {
    public static String a(Context context) {
        Account[] accounts;
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        String str = null;
        for (Account account : AccountManager.get(context).getAccounts()) {
            if (pattern.matcher(account.name).matches()) {
                str = account.name;
            }
        }
        return str;
    }
}
