package com.tsf.extend.base.widget.pulltorefresh;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PullToRefreshExpandableListView extends PullToRefreshAdapterViewBase<ExpandableListView> {
    public PullToRefreshExpandableListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    public final PullToRefreshBase.h getPullToRefreshScrollDirection() {
        return PullToRefreshBase.h.VERTICAL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ExpandableListView a(Context context, AttributeSet attributeSet) {
        ExpandableListView aVar;
        if (Build.VERSION.SDK_INT >= 9) {
            aVar = new b(context, attributeSet);
        } else {
            aVar = new a(context, attributeSet);
        }
        aVar.setId(R.id.list);
        return aVar;
    }

    class a extends ExpandableListView implements com.tsf.extend.base.widget.pulltorefresh.a.a {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.widget.AdapterView
        public void setEmptyView(View view) {
            PullToRefreshExpandableListView.this.setEmptyView(view);
        }

        @Override // com.tsf.extend.base.widget.pulltorefresh.a.a
        public void setEmptyViewInternal(View view) {
            super.setEmptyView(view);
        }
    }

    @TargetApi(9)
    final class b extends a {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.view.View
        protected boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
            boolean zOverScrollBy = super.overScrollBy(i, i2, i3, i4, i5, i6, i7, i8, z);
            c.a(PullToRefreshExpandableListView.this, i, i3, i2, i4, z);
            return zOverScrollBy;
        }
    }
}
