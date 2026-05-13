package com.tsf.shell.widget.alarm.setting;

import android.content.Context;
import android.support.p013v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tsf.shell.p086a.p087a.C2205e;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.AlarmUtils.C4242c;
import com.tsf.shell.widget.alarm.C4314m;
import java.text.SimpleDateFormat;
/* renamed from: com.tsf.shell.widget.alarm.setting.b */
/* loaded from: classes.dex */
public class C4363b extends BaseAdapter {

    /* renamed from: a */
    public C4369c f14121a;

    /* renamed from: b */
    public boolean f14122b;

    /* renamed from: c */
    private Alarm f14123c;

    /* renamed from: d */
    private Context f14124d;

    public C4363b(Context context) {
        this.f14124d = context;
        this.f14121a = new C4369c(this.f14124d);
        this.f14123c = C4242c.m440a(this.f14124d, 1);
        this.f14121a.m123a(this.f14123c.f13666i);
        this.f14122b = this.f14123c.f13664g;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 10;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return i;
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
        switch (i) {
            case 0:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_catalog, (ViewGroup) null);
                }
                view.findViewById(C4314m.C4317c.margin_top).setVisibility(8);
                ((ImageView) view.findViewById(C4314m.C4317c.imageView1)).setImageResource(C4314m.C4316b.ic_list_weather);
                ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.weathersetting);
                return view;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_text, (ViewGroup) null);
                }
                m127g(view);
                return view;
            case 2:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_text, (ViewGroup) null);
                }
                m129f(view);
                return view;
            case 3:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_seekbar, (ViewGroup) null);
                }
                m131e(view);
                return view;
            case 4:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_radio, (ViewGroup) null);
                }
                m125h(view);
                return view;
            case 5:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_catalog, (ViewGroup) null);
                }
                ((ImageView) view.findViewById(C4314m.C4317c.imageView1)).setImageResource(C4314m.C4316b.ic_list_alarm);
                ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.alarmsetting);
                return view;
            case 6:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_text, (ViewGroup) null);
                }
                m135c(view);
                return view;
            case 7:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_radio, (ViewGroup) null);
                }
                m133d(view);
                return view;
            case 8:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_seekbar, (ViewGroup) null);
                }
                m145a(view);
                return view;
            case 9:
                if (view == null) {
                    view = LayoutInflater.from(this.f14124d).inflate(C4314m.C4318d.list_item_seekbar, (ViewGroup) null);
                }
                m139b(view);
                return view;
            default:
                return LayoutInflater.from(SettingActivity.f14091a).inflate(C4314m.C4318d.list_item_text, (ViewGroup) null);
        }
    }

    /* renamed from: a */
    public void m148a() {
        C4242c.m436a(SettingActivity.f14091a, 1, this.f14123c.f13659b, this.f14123c.f13660c, this.f14123c.f13661d, this.f14123c.f13662e, this.f14122b, "", this.f14121a.m122b());
    }

    /* renamed from: a */
    private void m145a(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.snooze_duration_title);
        final TextView textView = (TextView) view.findViewById(C4314m.C4317c.textView2);
        textView.setText(String.format(SettingActivity.f14091a.getString(C4314m.C4320f.minutes), Integer.valueOf(C4371e.f14146j)));
        SeekBar seekBar = (SeekBar) view.findViewById(C4314m.C4317c.seekBar1);
        seekBar.setProgress(m141b(C4371e.f14146j));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                int m130f = C4363b.this.m130f(i);
                textView.setText(String.format(SettingActivity.f14091a.getString(C4314m.C4320f.minutes), Integer.valueOf(m130f)));
                C4371e.f14146j = m130f;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    /* renamed from: b */
    private void m139b(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.widget_duration_title);
        final TextView textView = (TextView) view.findViewById(C4314m.C4317c.textView2);
        textView.setText("" + C4371e.f14147k + "s");
        SeekBar seekBar = (SeekBar) view.findViewById(C4314m.C4317c.seekBar1);
        seekBar.setProgress(m147a(C4371e.f14147k));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                int m132e = C4363b.this.m132e(i);
                textView.setText(m132e + "s");
                C4371e.f14147k = m132e;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    /* renamed from: a */
    public int m147a(int i) {
        return ((i + 0) * 100) / 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public int m132e(int i) {
        return ((i * 30) / 100) + 0;
    }

    /* renamed from: b */
    public int m141b(int i) {
        return ((i - 5) * 100) / 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public int m130f(int i) {
        return ((i * 25) / 100) + 5;
    }

    /* renamed from: c */
    private void m135c(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.alert);
        ((TextView) view.findViewById(C4314m.C4317c.textView2)).setText(this.f14121a.m124a());
    }

    /* renamed from: d */
    private void m133d(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.alarm_vibrate);
        ((TextView) view.findViewById(C4314m.C4317c.textView2)).setVisibility(8);
        m142a(this.f14122b, view);
        final SwitchCompat switchCompat = (SwitchCompat) view.findViewById(C4314m.C4317c.switch1);
        final boolean isChecked = switchCompat.isChecked();
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (C2205e.m6087a(C4363b.this.f14124d)) {
                    C4363b.this.f14122b = z;
                    C4363b.this.m148a();
                    C4363b.this.notifyDataSetChanged();
                    return;
                }
                switchCompat.setChecked(isChecked);
            }
        });
    }

    /* renamed from: e */
    private void m131e(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(C4314m.C4320f.autoupdatetime);
        final TextView textView = (TextView) view.findViewById(C4314m.C4317c.textView2);
        textView.setText(m140b(C4371e.f14141e));
        SeekBar seekBar = (SeekBar) view.findViewById(C4314m.C4317c.seekBar1);
        seekBar.setProgress(m136c(C4371e.f14141e));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                textView.setText(C4363b.m128g(i));
                C4371e.f14141e = C4363b.m126h(i);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    /* renamed from: f */
    private void m129f(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(SettingActivity.f14091a.getString(C4314m.C4320f.lastupdatetime));
        TextView textView = (TextView) view.findViewById(C4314m.C4317c.textView2);
        if (C4371e.f14142f > 0) {
            textView.setText(m146a(C4371e.f14142f));
        } else if (C4371e.f14142f == 0) {
            textView.setText("-- --");
        } else if (C4371e.f14142f == -1) {
            textView.setText("update...");
        }
    }

    /* renamed from: g */
    private void m127g(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(SettingActivity.f14091a.getString(C4314m.C4320f.setmylocation));
        TextView textView = (TextView) view.findViewById(C4314m.C4317c.textView2);
        if (C4371e.f14137a) {
            textView.setText(SettingActivity.f14091a.getString(C4314m.C4320f.autosetmylocation));
        } else {
            textView.setText(C4371e.f14139c);
        }
    }

    /* renamed from: h */
    private void m125h(View view) {
        ((TextView) view.findViewById(C4314m.C4317c.textView1)).setText(SettingActivity.f14091a.getString(C4314m.C4320f.usecelsius));
        ((TextView) view.findViewById(C4314m.C4317c.textView2)).setText(SettingActivity.f14091a.getString(C4314m.C4320f.usecelsius_description));
        m142a(C4371e.f14138b, view);
        ((SwitchCompat) view.findViewById(C4314m.C4317c.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C4371e.f14138b = z;
            }
        });
    }

    /* renamed from: a */
    private static String m146a(long j) {
        return new SimpleDateFormat("MM-dd HH:mm").format(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static String m128g(int i) {
        if (i == 0) {
            return SettingActivity.f14091a.getString(C4314m.C4320f.close);
        }
        return m140b(m126h(i));
    }

    /* renamed from: b */
    private static String m140b(long j) {
        long j2 = j / 1000;
        if (j2 == 0) {
            return SettingActivity.f14091a.getString(C4314m.C4320f.close);
        }
        return ((int) (j2 / 3600)) + SettingActivity.f14091a.getString(C4314m.C4320f.repeathours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static long m126h(int i) {
        return ((int) (i / 4.1666665f)) * 3600 * 1000;
    }

    /* renamed from: c */
    private static int m136c(long j) {
        return (int) (((float) ((j / 3600) / 1000)) * 4.1666665f);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m142a(boolean z, View view) {
        ((SwitchCompat) view.findViewById(C4314m.C4317c.switch1)).setChecked(z);
    }
}
