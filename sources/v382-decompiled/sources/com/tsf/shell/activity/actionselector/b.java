package com.tsf.shell.activity.actionselector;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.k;
import android.support.v4.app.o;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tsf.shell.R;

/* loaded from: classes.dex */
class b extends o implements d {
    final /* synthetic */ ActionSelector a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionSelector actionSelector, Context context, k kVar) {
        super(kVar);
        this.a = actionSelector;
        this.b = context;
    }

    @Override // android.support.v4.app.o
    public Fragment a(int i) {
        a aVar = new a(this.a, null);
        Bundle bundle = new Bundle();
        bundle.putInt("num", i);
        aVar.g(bundle);
        return aVar;
    }

    @Override // android.support.v4.view.ad, com.tsf.shell.activity.actionselector.d
    public int b() {
        String[] strArr;
        strArr = this.a.n;
        return strArr.length;
    }

    @Override // com.tsf.shell.activity.actionselector.d
    public TextView a(final int i, SwipeyTabs swipeyTabs) {
        String[] strArr;
        TextView textView = (TextView) LayoutInflater.from(this.b).inflate(R.layout.swipey_tab_indicator, (ViewGroup) swipeyTabs, false);
        strArr = this.a.n;
        textView.setText(strArr[i]);
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.tsf.shell.activity.actionselector.b.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ViewPager viewPager;
                viewPager = b.this.a.p;
                viewPager.setCurrentItem(i);
            }
        });
        return textView;
    }
}
