package com.tsf.shell.action;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
final class h extends android.support.v4.app.q implements p {
    final /* synthetic */ ActionSelector a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ActionSelector actionSelector, Context context, android.support.v4.app.l lVar) {
        super(lVar);
        this.a = actionSelector;
        this.b = context;
    }

    @Override // android.support.v4.app.q
    public final Fragment a(int i) {
        return g.b(i);
    }

    @Override // android.support.v4.view.v, com.tsf.shell.action.p
    public final int c() {
        String[] strArr;
        strArr = ActionSelector.n;
        return strArr.length;
    }

    @Override // com.tsf.shell.action.p
    public final TextView a(int i, SwipeyTabs swipeyTabs) {
        String[] strArr;
        TextView textView = (TextView) LayoutInflater.from(this.b).inflate(R.layout.swipey_tab_indicator, (ViewGroup) swipeyTabs, false);
        strArr = ActionSelector.n;
        textView.setText(strArr[i]);
        textView.setOnClickListener(new i(this, i));
        return textView;
    }
}
