package com.tsf.shell.widget.alarm.setting;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.C4305i;
import com.tsf.shell.widget.alarm.C4314m;
import com.tsf.shell.widget.alarm.p205d.C4284a;
import com.tsf.shell.widget.alarm.p205d.p206a.C4285a;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PlaceSearchActivity extends Activity implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public static ArrayList<AsyncTaskC4350b> f14078a = new ArrayList<>();

    /* renamed from: b */
    private C4349a f14079b;

    /* renamed from: c */
    private ListView f14080c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C4314m.C4318d.activity_place_search_layout);
        m186a();
    }

    /* renamed from: a */
    private void m186a() {
        C4371e.m119a();
        this.f14079b = new C4349a();
        this.f14080c = (ListView) findViewById(C4314m.C4317c.searchcity_list);
        this.f14080c.setAdapter((ListAdapter) this.f14079b);
        this.f14080c.setOnItemClickListener(this);
        final EditText editText = (EditText) findViewById(C4314m.C4317c.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(C4314m.C4315a.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    C4305i.m259c("Enter on Key");
                    ((InputMethodManager) PlaceSearchActivity.this.getSystemService("input_method")).toggleSoftInput(1, 2);
                    PlaceSearchActivity.this.m182a(editText.getText().toString());
                    return false;
                }
                return false;
            }
        });
        editText.addTextChangedListener(new TextWatcher() { // from class: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity.2
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                int length = charSequence.length();
                if (length <= 2) {
                    PlaceSearchActivity.this.f14079b.m179a(null);
                } else if (length > 2) {
                    PlaceSearchActivity.this.m182a(charSequence.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m182a(String str) {
        if (!str.equals("")) {
            m181b(str);
        }
    }

    /* renamed from: b */
    private void m181b(String str) {
        synchronized (this) {
            while (f14078a.size() > 0) {
                f14078a.remove(0).cancel(true);
            }
            AsyncTaskC4350b asyncTaskC4350b = new AsyncTaskC4350b();
            f14078a.add(asyncTaskC4350b);
            asyncTaskC4350b.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity$b */
    /* loaded from: classes.dex */
    public class AsyncTaskC4350b extends AsyncTask<String, Void, ArrayList<C4284a>> {
        private AsyncTaskC4350b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public ArrayList<C4284a> doInBackground(String... strArr) {
            return C4285a.m312a(strArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(ArrayList<C4284a> arrayList) {
            PlaceSearchActivity.this.f14079b.m179a(arrayList);
            synchronized (PlaceSearchActivity.this) {
                PlaceSearchActivity.f14078a.remove(this);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            m185a((C4284a) null);
        } else {
            m185a((C4284a) view.getTag());
        }
    }

    /* renamed from: a */
    private void m185a(C4284a c4284a) {
        if (c4284a == null) {
            C4305i.m259c("PositionOnChange item null");
            C4371e.f14137a = true;
        } else {
            C4305i.m259c("PositionOnChange item " + c4284a.f13881a + " code:" + c4284a.f13883c);
            C4371e.f14137a = false;
            C4371e.f14139c = c4284a.f13881a;
            C4371e.f14140d = c4284a.f13883c;
            C4370d.m120a(c4284a);
        }
        C4371e.m118a(this).m116c();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity$a */
    /* loaded from: classes.dex */
    public class C4349a extends BaseAdapter {

        /* renamed from: a */
        ArrayList<C4284a> f14084a = new ArrayList<>();

        public C4349a() {
        }

        /* renamed from: a */
        public void m179a(ArrayList<C4284a> arrayList) {
            if (arrayList == null) {
                this.f14084a.clear();
            } else {
                this.f14084a.clear();
                this.f14084a = null;
                this.f14084a = arrayList;
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f14084a.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = LayoutInflater.from(SettingActivity.f14091a).inflate(C4314m.C4318d.list_item_icon, (ViewGroup) null);
            }
            C4284a c4284a = this.f14084a.get(i);
            m180a(c4284a.f13881a + "," + c4284a.f13882b, view);
            view.setTag(this.f14084a.get(i));
            ((ImageView) view.findViewById(C4314m.C4317c.imageView1)).setImageResource(C4314m.C4316b.activity_list_city_ico);
            return view;
        }

        /* renamed from: a */
        private void m180a(String str, View view) {
            ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(str);
        }
    }
}
