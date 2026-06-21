package com.tsf.shell.f.h.a.a.a;

import com.tsf.b;
import com.tsf.shell.f.e.d.a.DropIndicatorState;
import com.tsf.shell.utils.HapticFeedbackManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class SceneBackgroundNode extends com.tsf.shell.f.e.d.a.DropIndicatorConfig {
    private c a;

    public SceneBackgroundNode(c cVar) {
        this.a = cVar;
        ArrayList<SceneSurfaceNode.C0092c> arrayList = new ArrayList<>();
        arrayList.add(new SceneSurfaceNode.C0092c(WorkspaceSceneRoot.i.text_edit, WorkspaceSceneRoot.d.contact_menu_edit_icon) { // from class: com.tsf.shell.f.h.a.a.a.SceneBackgroundNode.1
            @Override // com.tsf.shell.f.e.d.a.DropIndicatorState.C0092c
            public void a() {
                w.b();
                SceneBackgroundNode.this.a.b();
            }
        });
        a(arrayList);
    }
}
