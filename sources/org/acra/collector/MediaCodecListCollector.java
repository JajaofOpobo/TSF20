package org.acra.collector;

import android.util.SparseArray;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
/* loaded from: classes.dex */
public class MediaCodecListCollector {

    /* renamed from: $SWITCH_TABLE$org$acra$collector$MediaCodecListCollector$CodecType */
    private static /* synthetic */ int[] f14298xcbf5c4fc = null;
    private static final String COLOR_FORMAT_PREFIX = "COLOR_";
    private static Class<?> codecCapabilitiesClass;
    private static Field colorFormatsField;
    private static Method getCapabilitiesForTypeMethod;
    private static Method getCodecInfoAtMethod;
    private static Method getNameMethod;
    private static Method getSupportedTypesMethod;
    private static Method isEncoderMethod;
    private static Field levelField;
    private static Class<?> mediaCodecInfoClass;
    private static Class<?> mediaCodecListClass;
    private static Field profileField;
    private static Field profileLevelsField;
    private static final String[] MPEG4_TYPES = {"mp4", "mpeg4", "MP4", "MPEG4"};
    private static final String[] AVC_TYPES = {"avc", "h264", "AVC", "H264"};
    private static final String[] H263_TYPES = {"h263", "H263"};
    private static final String[] AAC_TYPES = {"aac", "AAC"};
    private static SparseArray<String> mColorFormatValues = new SparseArray<>();
    private static SparseArray<String> mAVCLevelValues = new SparseArray<>();
    private static SparseArray<String> mAVCProfileValues = new SparseArray<>();
    private static SparseArray<String> mH263LevelValues = new SparseArray<>();
    private static SparseArray<String> mH263ProfileValues = new SparseArray<>();
    private static SparseArray<String> mMPEG4LevelValues = new SparseArray<>();
    private static SparseArray<String> mMPEG4ProfileValues = new SparseArray<>();
    private static SparseArray<String> mAACProfileValues = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum CodecType {
        AVC,
        H263,
        MPEG4,
        AAC;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CodecType[] valuesCustom() {
            CodecType[] valuesCustom = values();
            int length = valuesCustom.length;
            CodecType[] codecTypeArr = new CodecType[length];
            System.arraycopy(valuesCustom, 0, codecTypeArr, 0, length);
            return codecTypeArr;
        }
    }

    /* renamed from: $SWITCH_TABLE$org$acra$collector$MediaCodecListCollector$CodecType */
    static /* synthetic */ int[] m12xcbf5c4fc() {
        int[] iArr = f14298xcbf5c4fc;
        if (iArr == null) {
            iArr = new int[CodecType.valuesCustom().length];
            try {
                iArr[CodecType.AAC.ordinal()] = 4;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[CodecType.AVC.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[CodecType.H263.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[CodecType.MPEG4.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
            f14298xcbf5c4fc = iArr;
        }
        return iArr;
    }

    static {
        Field[] fields;
        Field[] fields2;
        mediaCodecListClass = null;
        getCodecInfoAtMethod = null;
        mediaCodecInfoClass = null;
        getNameMethod = null;
        isEncoderMethod = null;
        getSupportedTypesMethod = null;
        getCapabilitiesForTypeMethod = null;
        codecCapabilitiesClass = null;
        colorFormatsField = null;
        profileLevelsField = null;
        profileField = null;
        levelField = null;
        try {
            mediaCodecListClass = Class.forName("android.media.MediaCodecList");
            getCodecInfoAtMethod = mediaCodecListClass.getMethod("getCodecInfoAt", Integer.TYPE);
            mediaCodecInfoClass = Class.forName("android.media.MediaCodecInfo");
            getNameMethod = mediaCodecInfoClass.getMethod("getName", new Class[0]);
            isEncoderMethod = mediaCodecInfoClass.getMethod("isEncoder", new Class[0]);
            getSupportedTypesMethod = mediaCodecInfoClass.getMethod("getSupportedTypes", new Class[0]);
            getCapabilitiesForTypeMethod = mediaCodecInfoClass.getMethod("getCapabilitiesForType", String.class);
            codecCapabilitiesClass = Class.forName("android.media.MediaCodecInfo$CodecCapabilities");
            colorFormatsField = codecCapabilitiesClass.getField("colorFormats");
            profileLevelsField = codecCapabilitiesClass.getField("profileLevels");
            for (Field field : codecCapabilitiesClass.getFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers()) && field.getName().startsWith(COLOR_FORMAT_PREFIX)) {
                    mColorFormatValues.put(field.getInt(null), field.getName());
                }
            }
            Class<?> cls = Class.forName("android.media.MediaCodecInfo$CodecProfileLevel");
            for (Field field2 : cls.getFields()) {
                if (Modifier.isStatic(field2.getModifiers()) && Modifier.isFinal(field2.getModifiers())) {
                    if (field2.getName().startsWith("AVCLevel")) {
                        mAVCLevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("AVCProfile")) {
                        mAVCProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("H263Level")) {
                        mH263LevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("H263Profile")) {
                        mH263ProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("MPEG4Level")) {
                        mMPEG4LevelValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("MPEG4Profile")) {
                        mMPEG4ProfileValues.put(field2.getInt(null), field2.getName());
                    } else if (field2.getName().startsWith("AAC")) {
                        mAACProfileValues.put(field2.getInt(null), field2.getName());
                    }
                }
            }
            profileField = cls.getField("profile");
            levelField = cls.getField("level");
        } catch (ClassNotFoundException e) {
        } catch (IllegalAccessException e2) {
        } catch (IllegalArgumentException e3) {
        } catch (NoSuchFieldException e4) {
        } catch (NoSuchMethodException e5) {
        } catch (SecurityException e6) {
        }
    }

    public static String collecMediaCodecList() {
        StringBuilder sb = new StringBuilder();
        if (mediaCodecListClass != null && mediaCodecInfoClass != null) {
            try {
                int intValue = ((Integer) mediaCodecListClass.getMethod("getCodecCount", new Class[0]).invoke(null, new Object[0])).intValue();
                for (int i = 0; i < intValue; i++) {
                    sb.append("\n");
                    Object invoke = getCodecInfoAtMethod.invoke(null, Integer.valueOf(i));
                    sb.append(i).append(": ").append(getNameMethod.invoke(invoke, new Object[0])).append("\n");
                    sb.append("isEncoder: ").append(isEncoderMethod.invoke(invoke, new Object[0])).append("\n");
                    String[] strArr = (String[]) getSupportedTypesMethod.invoke(invoke, new Object[0]);
                    sb.append("Supported types: ").append(Arrays.toString(strArr)).append("\n");
                    for (String str : strArr) {
                        sb.append(collectCapabilitiesForType(invoke, str));
                    }
                    sb.append("\n");
                }
            } catch (IllegalAccessException e) {
            } catch (NoSuchMethodException e2) {
            } catch (InvocationTargetException e3) {
            }
        }
        return sb.toString();
    }

    private static String collectCapabilitiesForType(Object obj, String str) {
        StringBuilder sb = new StringBuilder();
        Object invoke = getCapabilitiesForTypeMethod.invoke(obj, str);
        int[] iArr = (int[]) colorFormatsField.get(invoke);
        if (iArr.length > 0) {
            sb.append(str).append(" color formats:");
            for (int i = 0; i < iArr.length; i++) {
                sb.append(mColorFormatValues.get(iArr[i]));
                if (i < iArr.length - 1) {
                    sb.append(',');
                }
            }
            sb.append("\n");
        }
        Object[] objArr = (Object[]) profileLevelsField.get(invoke);
        if (objArr.length > 0) {
            sb.append(str).append(" profile levels:");
            for (int i2 = 0; i2 < objArr.length; i2++) {
                CodecType identifyCodecType = identifyCodecType(obj);
                int i3 = profileField.getInt(objArr[i2]);
                int i4 = levelField.getInt(objArr[i2]);
                if (identifyCodecType == null) {
                    sb.append(i3).append('-').append(i4);
                }
                switch (m12xcbf5c4fc()[identifyCodecType.ordinal()]) {
                    case 1:
                        sb.append(i3).append(mAVCProfileValues.get(i3)).append('-').append(mAVCLevelValues.get(i4));
                        break;
                    case 2:
                        sb.append(mH263ProfileValues.get(i3)).append('-').append(mH263LevelValues.get(i4));
                        break;
                    case 3:
                        sb.append(mMPEG4ProfileValues.get(i3)).append('-').append(mMPEG4LevelValues.get(i4));
                        break;
                    case 4:
                        sb.append(mAACProfileValues.get(i3));
                        break;
                }
                if (i2 < objArr.length - 1) {
                    sb.append(',');
                }
            }
            sb.append("\n");
        }
        return sb.append("\n").toString();
    }

    private static CodecType identifyCodecType(Object obj) {
        String str = (String) getNameMethod.invoke(obj, new Object[0]);
        for (String str2 : AVC_TYPES) {
            if (str.contains(str2)) {
                return CodecType.AVC;
            }
        }
        for (String str3 : H263_TYPES) {
            if (str.contains(str3)) {
                return CodecType.H263;
            }
        }
        for (String str4 : MPEG4_TYPES) {
            if (str.contains(str4)) {
                return CodecType.MPEG4;
            }
        }
        for (String str5 : AAC_TYPES) {
            if (str.contains(str5)) {
                return CodecType.AAC;
            }
        }
        return null;
    }
}
