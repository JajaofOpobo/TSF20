package org.acra.collector;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.acra.util.BoundedLinkedList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
class LogFileCollector {
    private LogFileCollector() {
    }

    public static String collectLogFile(Context context, String str, int i) {
        BufferedReader bufferedReader;
        BoundedLinkedList boundedLinkedList = new BoundedLinkedList(i);
        if (str.contains("/")) {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)), 1024);
        } else {
            bufferedReader = new BufferedReader(new InputStreamReader(context.openFileInput(str)), 1024);
        }
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                boundedLinkedList.add(String.valueOf(line) + "\n");
            }
            CollectorUtil.safeClose(bufferedReader);
            return boundedLinkedList.toString();
        } catch (Throwable th) {
            CollectorUtil.safeClose(bufferedReader);
            throw th;
        }
    }
}
