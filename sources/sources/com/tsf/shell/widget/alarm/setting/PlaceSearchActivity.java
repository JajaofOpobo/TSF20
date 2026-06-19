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
import com.tsf.shell.widget.alarm.AlarmState;
import com.tsf.shell.widget.alarm.AlarmResources;
import java.util.ArrayList;

/* JADX INFO: loaded from: C:\Users\Jaja\AndroidStudioProjects\TSF20\resources-Prime\classes.dex */
public class PlaceSearchActivity extends Activity implements AdapterView.OnItemClickListener {
    public static ArrayList<b> a = new ArrayList<>();
    private a b;
    private ListView c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m.d.activity_place_search_layout);
        PlaceSearchActivity();
    }

    private void a() {
        AlarmSettingTheme.a();
        this.b = new AlarmSettingAdapter();
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
            while (AlarmSettingAdapter.size() > 0) {
                AlarmSettingAdapter.remove(0).cancel(true);
            }
            b bVar = new AlarmSettingController();
            AlarmSettingAdapter.add(bVar);
            bVar.execute(str);
        }
    }

    private class b extends AsyncTask<String, Void, ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty>> {
        private b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> doInBackground(String... strArr) {
            return com.tsf.shell.widget.alarm.d.a.AlarmConfigParser.a(strArr[0]);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> arrayList) {
            PlaceSearchActivity.this.b.a(arrayList);
            synchronized (PlaceSearchActivity.this) {
                PlaceSearchActivity.a.remove(this);
            }
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        if (i == 0) {
            a((com.tsf.shell.widget.alarm.d.AlarmConfigEmpty) null);
        } else {
            a((com.tsf.shell.widget.alarm.d.AlarmConfigEmpty) view.getTag());
        }
    }

    private void a(com.tsf.shell.widget.alarm.d.AlarmConfigEmpty aVar) {
        if (aVar == null) {
            i.c("PositionOnChange item null");
            AlarmSettingTheme.a = true;
        } else {
            i.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            AlarmSettingTheme.a = false;
            AlarmSettingTheme.c = aVar.a;
            AlarmSettingTheme.d = aVar.c;
            AlarmSettingData.a(aVar);
        }
        AlarmSettingTheme.a(this).c();
        finish();
    }

    class a extends BaseAdapter {
        ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> a = new ArrayList<>();

        public a() {
        }

        public void a(ArrayList<com.tsf.shell.widget.alarm.d.AlarmConfigEmpty> arrayList) {
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
        public Object c() {
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return 0L;
        }

        @Override // android.widget.Adapter
        public View c() {
            if (view == null) {
                view = LayoutInflater.from(SettingActivity.a).inflate(m.d.list_item_icon, (ViewGroup) null);
            }
            ImageView imageView = (ImageView) view.findViewById(m.c.imageView1);
            com.tsf.shell.widget.alarm.d.AlarmConfigEmpty aVar = this.a.get(i);
            a(aVar.a + "," + aVar.b, view);
            view.setTag(this.a.get(i));
            imageView.setImageResource(m.b.activity_list_city_ico);
            return view;
        }

        private void a(String str, View view) {
            ((TextView) view.findViewById(m.c.textView1)).setText(str);
        }
    }
}
