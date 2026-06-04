package com.tsf.shell.theme.inside;

import com.tsf.shell.theme.inside.widget.SystemContactTheme;
import com.tsf.shell.theme.inside.widget.SystemFolderTheme;

/* loaded from: classes.dex */
public class ThemeWidgetDescription {
    public SystemContactTheme contact;
    public SystemFolderTheme folder;

    public void destroy() {
        if (this.folder != null && !this.folder.isSystem) {
            this.folder.destroy();
        }
        if (this.contact != null && !this.contact.isSystem) {
            this.contact.destroy();
        }
    }
}
