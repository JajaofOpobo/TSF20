package com.tsf.extend.base.widget.pulltorefresh;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.base.widget.pulltorefresh.p081a.InterfaceC1506a;
/* loaded from: classes.dex */
public class PullToRefreshExpandableListView extends PullToRefreshAdapterViewBase<ExpandableListView> {
    public PullToRefreshExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public final PullToRefreshBase.EnumC1497h getPullToRefreshScrollDirection() {
        return PullToRefreshBase.EnumC1497h.VERTICAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* renamed from: b */
    public ExpandableListView mo8374a(Context context, AttributeSet attributeSet) {
        ExpandableListView c1500a;
        if (Build.VERSION.SDK_INT >= 9) {
            c1500a = new C1501b(context, attributeSet);
        } else {
            c1500a = new C1500a(context, attributeSet);
        }
        c1500a.setId(16908298);
        return c1500a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshExpandableListView$a */
    /* loaded from: classes.dex */
    public class C1500a extends ExpandableListView implements InterfaceC1506a {
        public C1500a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.AdapterView
        public void setEmptyView(View view) {
            PullToRefreshExpandableListView.this.setEmptyView(view);
        }

        @Override // com.tsf.extend.base.widget.pulltorefresh.p081a.InterfaceC1506a
        public void setEmptyViewInternal(View view) {
            super.setEmptyView(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(9)
    /* renamed from: com.tsf.extend.base.widget.pulltorefresh.PullToRefreshExpandableListView$b */
    /* loaded from: classes.dex */
    public final class C1501b extends C1500a {
        public C1501b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.View
        protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean overScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            C1516c.m8342a(PullToRefreshExpandableListView.this, i, i3, i2, i4, z);
            return overScrollBy;
        }
    }
}
