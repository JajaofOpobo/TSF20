package com.tsf.shell.widget.alarm.setting;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tsf.shell.widget.alarm.aa;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import com.tsf.shell.widget.alarm.u;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class PlaceSearchActivity extends Activity implements AdapterView.OnItemClickListener {
    public static ArrayList a = new ArrayList();
    private e b;
    private ListView c;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(ad.activity_place_search_layout);
        a();
    }

    private void a() {
        j.a();
        this.b = new e(this);
        this.c = (ListView) findViewById(ac.searchcity_list);
        this.c.setAdapter((ListAdapter) this.b);
        this.c.setOnItemClickListener(this);
        final EditText editText = (EditText) findViewById(ac.edittext_cityname);
        editText.getBackground().setColorFilter(getResources().getInteger(aa.material_catalog_color), PorterDuff.Mode.SRC_IN);
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: com.tsf.shell.widget.alarm.setting.PlaceSearchActivity.1
            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 0 && i == 66) {
                    u.c("Enter on Key");
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
                } else {
                    if (length <= 2) {
                        return;
                    }
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
                ((f) a.remove(0)).cancel(true);
            }
            f fVar = new f(this, null);
            a.add(fVar);
            fVar.execute(str);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i == 0) {
            a((com.tsf.shell.widget.alarm.d.a) null);
        } else {
            a((com.tsf.shell.widget.alarm.d.a) view.getTag());
        }
    }

    private void a(com.tsf.shell.widget.alarm.d.a aVar) {
        if (aVar == null) {
            u.c("PositionOnChange item null");
            j.a = true;
        } else {
            u.c("PositionOnChange item " + aVar.a + " code:" + aVar.c);
            j.a = false;
            j.c = aVar.a;
            j.d = aVar.c;
            d.a(aVar);
        }
        j.a(this).c();
        finish();
    }
}
