package com.tsf.shell.theme.inside;

import com.censivn.C3DEngine.a;
import com.tsf.shell.theme.inside.description.ThemeDescription;
import com.tsf.shell.theme.inside.element.ThemeElementCacher;
import com.tsf.shell.theme.inside.element.ThemeElementType;
import com.tsf.shell.theme.inside.parser.ThemeParser;
import java.io.InputStream;
/* loaded from: classes.dex */
public class ThemeUtils {
    public static ThemeDescription parseCacheDescription(int i) {
        try {
            ThemeParser themeParser = new ThemeParser();
            themeParser.parser(new ThemeParser.InputStreamCallback(a.d()) { // from class: com.tsf.shell.theme.inside.ThemeUtils.1
                @Override // com.tsf.shell.theme.inside.parser.ThemeParser.InputStreamCallback
                public InputStream getElementStream() {
                    return ThemeManager.getInstance().getFileManager().getCacheElementXMLInputStream();
                }

                @Override // com.tsf.shell.theme.inside.parser.ThemeParser.InputStreamCallback
                public InputStream getFolderStream() {
                    return ThemeManager.getInstance().getFileManager().getCacheFolderXMLInputStream();
                }
            }, i);
            ThemeDescription themeDescription = themeParser.getThemeDescription();
            if (themeDescription == null) {
                ThemeManager.getInstance().getFileManager().reset();
                ThemeElementCacher.cacheThemeImage(a.d(), ThemeElementType.PARSER_CONFIG_ALL);
                return parseCacheDescription(i);
            }
            return themeDescription;
        } catch (Exception e) {
            e.printStackTrace();
            ThemeManager.getInstance().getFileManager().reset();
            return parseCacheDescription(i);
        }
    }
}
