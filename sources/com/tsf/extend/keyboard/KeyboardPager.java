package com.tsf.extend.keyboard;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.volley.AbstractC0795l;
import com.tsf.extend.C1536f;
import com.tsf.extend.C1547h;
import com.tsf.extend.base.InterfaceC1385d;
import com.tsf.extend.base.p071b.C1368a;
import com.tsf.extend.base.p074d.AbstractC1386a;
import com.tsf.extend.base.p080j.C1455z;
import com.tsf.extend.base.widget.pulltorefresh.C1518d;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView;
import com.tsf.extend.base.widget.pulltorefresh.PullToRefreshBase;
import com.tsf.extend.theme.C1848k;
import com.tsf.extend.theme.C1894v;
import com.tsf.extend.theme.C1920x;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class KeyboardPager extends FrameLayout implements View.OnClickListener, AbstractC1386a.InterfaceC1396a<List<C1848k>> {

    /* renamed from: a */
    private int f4883a;

    /* renamed from: b */
    private int f4884b;

    /* renamed from: c */
    private PullToRefreshAndLoadMoreListView f4885c;

    /* renamed from: d */
    private View f4886d;

    /* renamed from: e */
    private View f4887e;

    /* renamed from: f */
    private ProgressBar f4888f;

    /* renamed from: g */
    private TextView f4889g;

    /* renamed from: h */
    private long f4890h;

    /* renamed from: i */
    private int f4891i;

    /* renamed from: j */
    private int f4892j;

    /* renamed from: k */
    private boolean f4893k;

    /* renamed from: l */
    private List<C1552b> f4894l;

    /* renamed from: m */
    private C1554d f4895m;

    /* renamed from: n */
    private C1554d f4896n;

    /* renamed from: o */
    private C1551a f4897o;

    /* renamed from: p */
    private List<C1848k> f4898p;

    public KeyboardPager(Context context) {
        super(context);
        this.f4893k = false;
        this.f4894l = new ArrayList();
        this.f4898p = new ArrayList();
    }

    public KeyboardPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4893k = false;
        this.f4894l = new ArrayList();
        this.f4898p = new ArrayList();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f4885c = (PullToRefreshAndLoadMoreListView) LayoutInflater.from(getContext()).inflate(C1536f.C1542f.locker_list, (ViewGroup) null, false);
        ((FrameLayout) findViewById(C1536f.C1541e.list_content)).addView(this.f4885c, new FrameLayout.LayoutParams(-1, -1));
        getContext().getResources().getDisplayMetrics();
        this.f4891i = getContext().getResources().getDimensionPixelSize(C1536f.C1539c.keyboard_item_PaddingLeftRight);
        this.f4892j = getContext().getResources().getDimensionPixelSize(C1536f.C1539c.keyboard_item_PadingTop);
        this.f4884b = ((getContext().getResources().getDisplayMetrics().widthPixels - (this.f4891i * 2)) - this.f4892j) / 2;
        this.f4883a = (int) (this.f4884b / 1.3651686f);
        this.f4886d = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.retry_item, (ViewGroup) null);
        ((TextView) this.f4886d.findViewById(C1536f.C1541e.retry_text)).setTextColor(getResources().getColorStateList(C1536f.C1540d.wallpaper_list_retry_text_color));
        this.f4886d.setOnClickListener(this);
        this.f4887e = LayoutInflater.from(getContext()).inflate(C1536f.C1542f.wallpaper_loadmore, (ViewGroup) null);
        this.f4888f = (ProgressBar) this.f4887e.findViewById(C1536f.C1541e.loadmore_progress);
        this.f4888f.setIndeterminateDrawable(new C1518d(getContext(), 3, 1));
        this.f4889g = (TextView) this.f4887e.findViewById(C1536f.C1541e.loadmore_tips);
        this.f4889g.setOnClickListener(this);
        this.f4885c.setMode(PullToRefreshBase.EnumC1491b.PULL_FROM_START);
        this.f4885c.setHeaderResizeEnabled(false);
        this.f4885c.m8401k();
        this.f4885c.setLoadMoreView(this.f4887e);
        this.f4885c.setCanLoadMore(true);
        this.f4897o = new C1551a();
        this.f4885c.setAdapter(this.f4897o);
        C1894v.m7069h().m7087b(this);
        this.f4885c.setOnLoadListener(new PullToRefreshAndLoadMoreListView.InterfaceC1486a() { // from class: com.tsf.extend.keyboard.KeyboardPager.1
            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: a */
            public void mo6254a() {
                KeyboardPager.this.f4890h = System.currentTimeMillis();
                AbstractC1386a.EnumC1397b enumC1397b = AbstractC1386a.EnumC1397b.Refresh;
                KeyboardPager.this.f4895m.m8259a(enumC1397b);
                C1558a.m8241h().m8251a(KeyboardPager.this.f4895m, enumC1397b, (JSONObject) null);
            }

            @Override // com.tsf.extend.base.widget.pulltorefresh.PullToRefreshAndLoadMoreListView.InterfaceC1486a
            /* renamed from: b */
            public void mo6253b() {
                if (!KeyboardPager.this.f4893k) {
                    KeyboardPager.this.m8289a();
                } else {
                    KeyboardPager.this.m8277b();
                }
            }
        });
        this.f4895m = new C1554d(AbstractC1386a.EnumC1397b.LoadCache);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean z = false;
        int id = view.getId();
        if (id == C1536f.C1541e.retry) {
            this.f4886d.setVisibility(8);
            this.f4895m = new C1554d(AbstractC1386a.EnumC1397b.Refresh);
            C1558a.m8241h().m8251a(this.f4895m, AbstractC1386a.EnumC1397b.Refresh, (JSONObject) null);
        } else if (id == C1536f.C1541e.loadmore_tips) {
            this.f4888f.setVisibility(0);
            this.f4889g.setVisibility(8);
            m8289a();
        } else if (view.getTag() instanceof C1563b) {
            C1563b c1563b = (C1563b) view.getTag();
            InterfaceC1385d m8293a = C1547h.m8293a();
            if (m8293a != null) {
                m8293a.mo8810c(c1563b.m8240a() + "");
            }
            String m8237b = c1563b.m8237b();
            if (this.f4898p.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= this.f4898p.size()) {
                        break;
                    } else if (!m8283a(this.f4898p.get(i), m8237b)) {
                        i++;
                    } else {
                        z = true;
                        m8282a(m8237b);
                        break;
                    }
                }
            }
            if (!z) {
                C1920x.m7052a(getContext(), c1563b.m8233d(), "tsf_theme_center_keyboard");
                C1894v.m7069h().m7087b(this);
            }
        }
    }

    /* renamed from: a */
    private boolean m8283a(C1848k c1848k, String str) {
        return (c1848k == null || TextUtils.isEmpty(c1848k.m7300g()) || !c1848k.m7300g().equals(str)) ? false : true;
    }

    /* renamed from: a */
    private void m8282a(String str) {
        Intent launchIntentForPackage = getContext().getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            ComponentName component = launchIntentForPackage.getComponent();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.LAUNCHER");
            intent.setComponent(component);
            intent.setFlags(270532608);
            getContext().startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8289a() {
        if (this.f4894l != null && this.f4894l.size() > 0) {
            this.f4896n = new C1554d(AbstractC1386a.EnumC1397b.LoadMore);
            C1558a.m8241h().m8251a(this.f4896n, AbstractC1386a.EnumC1397b.LoadMore, (JSONObject) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8277b() {
        this.f4888f.setVisibility(8);
        this.f4889g.setVisibility(0);
        this.f4889g.setClickable(false);
        this.f4889g.setText(C1536f.C1543g.theme_no_more);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m8273c() {
        this.f4888f.setVisibility(8);
        this.f4889g.setVisibility(0);
        this.f4889g.setClickable(true);
        this.f4889g.setText(C1536f.C1543g.load_more_fail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m8271d() {
        this.f4888f.setVisibility(0);
        this.f4889g.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8281a(final List<C1563b> list) {
        long j;
        long currentTimeMillis = System.currentTimeMillis() - this.f4890h;
        if (currentTimeMillis > 200) {
            j = 0;
        } else {
            j = 200 - currentTimeMillis;
        }
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.2
            @Override // java.lang.Runnable
            public void run() {
                KeyboardPager.this.f4885c.m8402j();
            }
        }, j);
        C1455z.m8563a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.3
            @Override // java.lang.Runnable
            public void run() {
                KeyboardPager.this.m8280a((List<C1563b>) list, false);
            }
        }, j + 150);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public boolean m8274b(List<C1563b> list) {
        if (list == null || list.size() == 0) {
            return false;
        }
        return m8280a(list, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m8280a(List<C1563b> list, boolean z) {
        int i = 0;
        if (!z) {
            this.f4894l.clear();
            if (list == null || list.size() == 0) {
                this.f4886d.setVisibility(0);
                this.f4885c.setEmptyView(this.f4886d);
                return false;
            }
        }
        while (true) {
            int i2 = i;
            if (i2 >= list.size() / 2) {
                break;
            }
            this.f4894l.add(new C1552b(list.get(i2 * 2), list.get((i2 * 2) + 1)));
            i = i2 + 1;
        }
        if (list.size() % 2 != 0) {
            this.f4894l.add(new C1552b(list.get(list.size() - 1), null));
        }
        this.f4897o.notifyDataSetChanged();
        return true;
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6245a(JSONObject jSONObject, List<C1848k> list) {
        if (list != null) {
            this.f4898p.clear();
            this.f4898p.addAll(list);
        }
        if (this.f4898p.size() > 0) {
            this.f4897o.notifyDataSetChanged();
        }
    }

    @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo6247a(JSONObject jSONObject, int i, List<C1848k> list) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.keyboard.KeyboardPager$a */
    /* loaded from: classes.dex */
    public class C1551a extends BaseAdapter {
        private C1551a() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            if (KeyboardPager.this.f4894l != null) {
                return KeyboardPager.this.f4894l.size();
            }
            return 0;
        }

        @Override // android.widget.Adapter
        /* renamed from: a */
        public C1552b getItem(int i) {
            if (KeyboardPager.this.f4894l != null) {
                return (C1552b) KeyboardPager.this.f4894l.get(i);
            }
            return null;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C1557e c1557e;
            if (view == null) {
                view = LayoutInflater.from(KeyboardPager.this.getContext()).inflate(C1536f.C1542f.keyboard_list_item, (ViewGroup) null);
                C1557e c1557e2 = new C1557e();
                c1557e2.f4918c = (FrameLayout) view.findViewById(C1536f.C1541e.left_group);
                c1557e2.f4920e = (ImageView) view.findViewById(C1536f.C1541e.left_img);
                c1557e2.f4924i = (ImageView) view.findViewById(C1536f.C1541e.keyboard_ad_bg_left);
                c1557e2.f4919d = (FrameLayout) view.findViewById(C1536f.C1541e.right_group);
                c1557e2.f4921f = (ImageView) view.findViewById(C1536f.C1541e.right_img);
                c1557e2.f4925j = (ImageView) view.findViewById(C1536f.C1541e.keyboard_ad_bg_right);
                m8262a(c1557e2.f4920e);
                m8262a(c1557e2.f4921f);
                view.setTag(c1557e2);
                c1557e = c1557e2;
            } else {
                c1557e = (C1557e) view.getTag();
            }
            C1552b item = getItem(i);
            c1557e.f4916a = item.f4904a;
            c1557e.f4918c.setVisibility(0);
            c1557e.f4920e.setImageBitmap(null);
            c1557e.f4920e.setBackgroundColor(Color.argb(255, 221, 221, 221));
            c1557e.f4920e.setTag(item.f4904a);
            c1557e.f4920e.setOnClickListener(KeyboardPager.this);
            c1557e.f4924i.setVisibility(0);
            c1557e.f4922g = new C1553c(item.f4904a.m8235c(), c1557e.f4920e);
            C1558a.m8241h().m8800a(item.f4904a.m8235c(), c1557e.f4922g, AbstractC0795l.EnumC0797a.LOW, KeyboardPager.this.f4884b, KeyboardPager.this.f4883a);
            if (item.f4905b != null) {
                c1557e.f4919d.setVisibility(0);
                c1557e.f4921f.setImageBitmap(null);
                c1557e.f4925j.setVisibility(0);
                c1557e.f4921f.setBackgroundColor(Color.argb(255, 221, 221, 221));
                c1557e.f4917b = item.f4905b;
                c1557e.f4921f.setTag(item.f4905b);
                c1557e.f4921f.setOnClickListener(KeyboardPager.this);
                c1557e.f4923h = new C1553c(item.f4905b.m8235c(), c1557e.f4921f);
                C1558a.m8241h().m8800a(item.f4905b.m8235c(), c1557e.f4923h, AbstractC0795l.EnumC0797a.LOW, KeyboardPager.this.f4884b, KeyboardPager.this.f4883a);
            } else {
                c1557e.f4919d.setVisibility(4);
            }
            return view;
        }

        /* renamed from: a */
        void m8262a(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = KeyboardPager.this.f4883a;
                layoutParams.width = KeyboardPager.this.f4884b;
            }
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.tsf.extend.keyboard.KeyboardPager$b */
    /* loaded from: classes.dex */
    public class C1552b {

        /* renamed from: a */
        C1563b f4904a;

        /* renamed from: b */
        C1563b f4905b;

        public C1552b(C1563b c1563b, C1563b c1563b2) {
            this.f4904a = c1563b;
            this.f4905b = c1563b2;
        }
    }

    /* renamed from: com.tsf.extend.keyboard.KeyboardPager$e */
    /* loaded from: classes.dex */
    private class C1557e {

        /* renamed from: a */
        public C1563b f4916a;

        /* renamed from: b */
        public C1563b f4917b;

        /* renamed from: c */
        public FrameLayout f4918c;

        /* renamed from: d */
        public FrameLayout f4919d;

        /* renamed from: e */
        public ImageView f4920e;

        /* renamed from: f */
        public ImageView f4921f;

        /* renamed from: g */
        public C1553c f4922g;

        /* renamed from: h */
        public C1553c f4923h;

        /* renamed from: i */
        public ImageView f4924i;

        /* renamed from: j */
        public ImageView f4925j;

        private C1557e() {
        }
    }

    /* renamed from: com.tsf.extend.keyboard.KeyboardPager$c */
    /* loaded from: classes.dex */
    private class C1553c implements AbstractC1386a.InterfaceC1396a<Pair<String, Bitmap>> {

        /* renamed from: b */
        private String f4908b;

        /* renamed from: c */
        private ImageView f4909c;

        C1553c(String str, ImageView imageView) {
            this.f4908b = str;
            this.f4909c = imageView;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, Pair<String, Bitmap> pair) {
            if (pair != null && ((C1563b) this.f4909c.getTag()).m8235c().equals(this.f4908b)) {
                this.f4909c.setVisibility(0);
                this.f4909c.setBackgroundColor(Color.argb(0, 221, 221, 221));
                this.f4909c.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f4909c.setImageBitmap((Bitmap) pair.second);
            }
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, Pair<String, Bitmap> pair) {
            if (pair != null && ((C1563b) this.f4909c.getTag()).m8235c().equals(this.f4908b)) {
                this.f4909c.setVisibility(0);
                this.f4909c.setBackgroundColor(Color.argb(0, 221, 221, 221));
                this.f4909c.setScaleType(ImageView.ScaleType.FIT_XY);
                this.f4909c.setImageBitmap((Bitmap) pair.second);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.extend.keyboard.KeyboardPager$d */
    /* loaded from: classes.dex */
    public class C1554d implements AbstractC1386a.InterfaceC1396a<C1368a> {

        /* renamed from: b */
        private AbstractC1386a.EnumC1397b f4911b;

        public C1554d(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f4911b = enumC1397b;
        }

        /* renamed from: a */
        public void m8259a(AbstractC1386a.EnumC1397b enumC1397b) {
            this.f4911b = enumC1397b;
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6245a(JSONObject jSONObject, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.d.1
                @Override // java.lang.Runnable
                public void run() {
                    KeyboardPager.this.f4893k = !c1368a.m8868b();
                    if (C1554d.this.f4911b == AbstractC1386a.EnumC1397b.LoadMore) {
                        if (KeyboardPager.this.f4893k) {
                            KeyboardPager.this.m8277b();
                        } else {
                            KeyboardPager.this.f4885c.m8430b(false);
                        }
                        KeyboardPager.this.m8274b(c1368a.m8875a());
                        return;
                    }
                    KeyboardPager.this.f4885c.m8430b(false);
                    KeyboardPager.this.m8271d();
                    KeyboardPager.this.m8281a(c1368a.m8875a());
                }
            });
        }

        @Override // com.tsf.extend.base.p074d.AbstractC1386a.InterfaceC1396a
        /* renamed from: a  reason: avoid collision after fix types in other method */
        public void mo6247a(JSONObject jSONObject, int i, final C1368a c1368a) {
            C1455z.m8564a(0, new Runnable() { // from class: com.tsf.extend.keyboard.KeyboardPager.d.2
                @Override // java.lang.Runnable
                public void run() {
                    if (C1554d.this.f4911b == AbstractC1386a.EnumC1397b.LoadMore) {
                        KeyboardPager.this.m8273c();
                        return;
                    }
                    if (c1368a == null) {
                        KeyboardPager.this.f4885c.setMode(PullToRefreshBase.EnumC1491b.DISABLED);
                    }
                    KeyboardPager.this.m8281a(c1368a == null ? null : c1368a.m8875a());
                }
            });
        }
    }
}
