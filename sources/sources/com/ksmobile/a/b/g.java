package com.ksmobile.a.b;

import android.util.Log;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class g {
    private static int a = -1;

    public static int a() {
        Pattern patternCompile = Pattern.compile("^MemTotal:\\s+([0-9]+) kB$");
        try {
            FileReader fileReader = new FileReader("/proc/meminfo");
            try {
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            Log.w("SysUtils", "/proc/meminfo lacks a MemTotal entry?");
                            break;
                        }
                        Matcher matcher = patternCompile.matcher(line);
                        if (matcher.find()) {
                            int i = Integer.parseInt(matcher.group(1));
                            if (i > 1024) {
                                return i;
                            }
                            Log.w("SysUtils", "Invalid /proc/meminfo total size in kB: " + matcher.group(1));
                        }
                    } finally {
                        bufferedReader.close();
                    }
                }
            } finally {
                fileReader.close();
            }
        } catch (Exception e) {
            Log.w("SysUtils", "Cannot get total physical size from /proc/meminfo", e);
        }
        return 0;
    }
}
