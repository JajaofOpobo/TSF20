package org.acra.collector;

import android.content.Context;
import android.content.res.Configuration;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import org.acra.ACRA;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public final class ConfigurationCollector {
    private static final String FIELD_MCC = "mcc";
    private static final String FIELD_MNC = "mnc";
    private static final String FIELD_SCREENLAYOUT = "screenLayout";
    private static final String FIELD_UIMODE = "uiMode";
    private static final String PREFIX_HARDKEYBOARDHIDDEN = "HARDKEYBOARDHIDDEN_";
    private static final String PREFIX_KEYBOARD = "KEYBOARD_";
    private static final String PREFIX_KEYBOARDHIDDEN = "KEYBOARDHIDDEN_";
    private static final String PREFIX_NAVIGATION = "NAVIGATION_";
    private static final String PREFIX_NAVIGATIONHIDDEN = "NAVIGATIONHIDDEN_";
    private static final String PREFIX_ORIENTATION = "ORIENTATION_";
    private static final String PREFIX_SCREENLAYOUT = "SCREENLAYOUT_";
    private static final String PREFIX_TOUCHSCREEN = "TOUCHSCREEN_";
    private static final String PREFIX_UI_MODE = "UI_MODE_";
    private static final String SUFFIX_MASK = "_MASK";
    private final HashMap<String, SparseArray<String>> mValueArrays = new HashMap<>();

    private ConfigurationCollector() {
        SparseArray<String> sparseArray = new SparseArray<>();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        SparseArray<String> sparseArray3 = new SparseArray<>();
        SparseArray<String> sparseArray4 = new SparseArray<>();
        SparseArray<String> sparseArray5 = new SparseArray<>();
        SparseArray<String> sparseArray6 = new SparseArray<>();
        SparseArray<String> sparseArray7 = new SparseArray<>();
        SparseArray<String> sparseArray8 = new SparseArray<>();
        SparseArray<String> sparseArray9 = new SparseArray<>();
        for (Field field : Configuration.class.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                String name = field.getName();
                try {
                    if (name.startsWith(PREFIX_HARDKEYBOARDHIDDEN)) {
                        sparseArray.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_KEYBOARD)) {
                        sparseArray2.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_KEYBOARDHIDDEN)) {
                        sparseArray3.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_NAVIGATION)) {
                        sparseArray4.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_NAVIGATIONHIDDEN)) {
                        sparseArray5.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_ORIENTATION)) {
                        sparseArray6.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_SCREENLAYOUT)) {
                        sparseArray7.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_TOUCHSCREEN)) {
                        sparseArray8.put(field.getInt(null), name);
                    } else if (name.startsWith(PREFIX_UI_MODE)) {
                        sparseArray9.put(field.getInt(null), name);
                    }
                } catch (IllegalAccessException e) {
                    ACRA.log.w(ACRA.LOG_TAG, "Error while inspecting device configuration: ", e);
                } catch (IllegalArgumentException e2) {
                    ACRA.log.w(ACRA.LOG_TAG, "Error while inspecting device configuration: ", e2);
                }
            }
        }
        this.mValueArrays.put(PREFIX_HARDKEYBOARDHIDDEN, sparseArray);
        this.mValueArrays.put(PREFIX_KEYBOARD, sparseArray2);
        this.mValueArrays.put(PREFIX_KEYBOARDHIDDEN, sparseArray3);
        this.mValueArrays.put(PREFIX_NAVIGATION, sparseArray4);
        this.mValueArrays.put(PREFIX_NAVIGATIONHIDDEN, sparseArray5);
        this.mValueArrays.put(PREFIX_ORIENTATION, sparseArray6);
        this.mValueArrays.put(PREFIX_SCREENLAYOUT, sparseArray7);
        this.mValueArrays.put(PREFIX_TOUCHSCREEN, sparseArray8);
        this.mValueArrays.put(PREFIX_UI_MODE, sparseArray9);
    }

    private String toString(Configuration configuration) {
        StringBuilder sb = new StringBuilder();
        for (Field field : configuration.getClass().getFields()) {
            try {
                if (!Modifier.isStatic(field.getModifiers())) {
                    sb.append(field.getName()).append('=');
                    if (field.getType().equals(Integer.TYPE)) {
                        sb.append(getFieldValueName(configuration, field));
                    } else if (field.get(configuration) != null) {
                        sb.append(field.get(configuration).toString());
                    }
                    sb.append('\n');
                }
            } catch (IllegalAccessException e) {
                ACRA.log.e(ACRA.LOG_TAG, "Error while inspecting device configuration: ", e);
            } catch (IllegalArgumentException e2) {
                ACRA.log.e(ACRA.LOG_TAG, "Error while inspecting device configuration: ", e2);
            }
        }
        return sb.toString();
    }

    private String getFieldValueName(Configuration configuration, Field field) {
        String name = field.getName();
        if (name.equals(FIELD_MCC) || name.equals(FIELD_MNC)) {
            return Integer.toString(field.getInt(configuration));
        }
        if (name.equals(FIELD_UIMODE)) {
            return activeFlags(this.mValueArrays.get(PREFIX_UI_MODE), field.getInt(configuration));
        }
        if (name.equals(FIELD_SCREENLAYOUT)) {
            return activeFlags(this.mValueArrays.get(PREFIX_SCREENLAYOUT), field.getInt(configuration));
        }
        SparseArray<String> sparseArray = this.mValueArrays.get(String.valueOf(name.toUpperCase()) + '_');
        if (sparseArray == null) {
            return Integer.toString(field.getInt(configuration));
        }
        String str = sparseArray.get(field.getInt(configuration));
        if (str == null) {
            return Integer.toString(field.getInt(configuration));
        }
        return str;
    }

    private static String activeFlags(SparseArray<String> sparseArray, int i) {
        int i2;
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 < sparseArray.size()) {
                int iKeyAt = sparseArray.keyAt(i4);
                if (sparseArray.get(iKeyAt).endsWith(SUFFIX_MASK) && (i2 = i & iKeyAt) > 0) {
                    if (sb.length() > 0) {
                        sb.append('+');
                    }
                    sb.append(sparseArray.get(i2));
                }
                i3 = i4 + 1;
            } else {
                return sb.toString();
            }
        }
    }

    public static String collectConfiguration(Context context) {
        try {
            return new ConfigurationCollector().toString(context.getResources().getConfiguration());
        } catch (RuntimeException e) {
            ACRA.log.w(ACRA.LOG_TAG, "Couldn't retrieve CrashConfiguration for : " + context.getPackageName(), e);
            return "Couldn't retrieve crash config";
        }
    }
}
