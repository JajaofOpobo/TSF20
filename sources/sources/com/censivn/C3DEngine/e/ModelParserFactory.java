package com.censivn.C3DEngine.e;

import android.content.res.Resources;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class ModelParserFactory {

    public enum ParserType {
        OBJ,
        MAX_3DS,
        MD2
    }

    public static IModelParser a(ParserType parserType, Resources resources, String str, boolean z) {
        switch (parserType) {
            case OBJ:
                return new ObjParser(resources, str, z);
            case MAX_3DS:
                return new Max3DSParser(resources, str, z);
            case MD2:
                return new MD2Parser(resources, str, z);
            default:
                return null;
        }
    }
}
