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
import com.tsf.shell.widget.alarm.i;
import com.tsf.shell.widget.alarm.m;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class PlaceSearchActivity extends Activity implements AdapterView.OnItemClickListener {
    public static ArrayList<b> a = new ArrayList<>();
    private a b;
    private ListView c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.d.activity_place_search_layout);
        a();
    }

    private void a() {
        e.a();
        this.b = new a();
        this.c = (ListView) findViewById(m.c.searchcity_list);
        this.c.setAdapter((ListAdapter) this.b);
        this.c.setOnItemClickListener(this);
        final EditText editText = (EditText) findViewById(m.c.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(m.a.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    i.c("Enter on Key");
                    ((InputMethodManager) PlaceSearchActivity.this.getSystemService("input_method")).toggleSoftInput(1, 2);
                    PlaceSearchActivity.this.a(editText.getText().toString());
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
                    PlaceSearchActivity.this.b.a(null);
                } else if (length > 2) {
                    PlaceSearchActivity.this.a(charSequence.toString());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (!str.equals("")) {
            b(str);
        }
    }

    private void b(String str) {
        synchronized (this) {
            while (a.size() > 0) {
                a.remove(0).cancel(true);
            }
            b bVar = new b();
            a.add(bVar);
            bVar.execute(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends AsyncTask<String, Void, ArrayList<com.tsf.shell.widget.alarm.d.a>> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public ArrayList<com.tsf.shell.widget.alarm.d.a> doInBackground(String... strArr) {
            return com.tsf.shell.widget.alarm.d.a.a.a(strArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(ArrayList<com.tsf.shell.widget.alarm.d.a> arrayList) {
            PlaceSearchActivity.this.b.a(arrayList);
            synchronized (PlaceSearchActivity.this) {
                PlaceSearchActivity.a.remove(this);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            a((com.tsf.shell.widget.alarm.d.a) null);
        } else {
            a((com.tsf.shell.widget.alarm.d.a) view.getTag());
        }
    }

    private void a(com.tsf.shell.widget.alarm.d.a aVar) {
        if (aVar == null) {
            i.c("PositionOnChange item null");
            e.a = true;
        } else {
            i.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            e.a = false;
            e.c = aVar.a;
            e.d = aVar.c;
            d.a(aVar);
        }
        e.a(this).c();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {
        ArrayList<com.tsf.shell.widget.alarm.d.a> a = new ArrayList<>();

        public a() {
        }

        public void a(ArrayList<com.tsf.shell.widget.alarm.d.a> arrayList) {
            if (arrayList == null) {
                this.a.clear();
            } else {
                this.a.clear();
                this.a = null;
                this.a = arrayList;
            }
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.a.size();
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
                view = LayoutInflater.from(SettingActivity.a).inflate(m.d.list_item_icon, (ViewGroup) null);
            }
            com.tsf.shell.widget.alarm.d.a aVar = this.a.get(i);
            a(aVar.a + "," + aVar.b, view);
            view.setTag(this.a.get(i));
            ((ImageView) view.findViewById(m.c.imageView1)).setImageResource(m.b.activity_list_city_ico);
            return view;
        }

        private void a(String str, View view) {
            ((TextView) view.findViewById(m.c.textView1)).setText(str);
        }
    }
}
