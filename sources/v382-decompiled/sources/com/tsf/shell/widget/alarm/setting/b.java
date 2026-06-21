package com.tsf.shell.widget.alarm.setting;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.tsf.shell.widget.alarm.AlarmUtils.Alarm;
import com.tsf.shell.widget.alarm.ab;
import com.tsf.shell.widget.alarm.ac;
import com.tsf.shell.widget.alarm.ad;
import com.tsf.shell.widget.alarm.af;
import java.text.SimpleDateFormat;

/* loaded from: classes.dex */
public class b extends BaseAdapter {
    public c a;
    public boolean b;
    private Alarm c;
    private Context d;

    public b(Context context) {
        this.d = context;
        this.a = new c(this.d);
        this.c = com.tsf.shell.widget.alarm.AlarmUtils.i.a(this.d, 1);
        this.a.a(this.c.i);
        this.b = this.c.g;
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
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_catalog, (ViewGroup) null);
                }
                view.findViewById(ac.margin_top).setVisibility(8);
                ((ImageView) view.findViewById(ac.imageView1)).setImageResource(ab.ic_list_weather);
                ((TextView) view.findViewById(ac.textView1)).setText(af.weathersetting);
                return view;
            case 1:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_text, (ViewGroup) null);
                }
                g(view);
                return view;
            case 2:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_text, (ViewGroup) null);
                }
                f(view);
                return view;
            case 3:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_seekbar, (ViewGroup) null);
                }
                e(view);
                return view;
            case 4:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_radio, (ViewGroup) null);
                }
                h(view);
                return view;
            case 5:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_catalog, (ViewGroup) null);
                }
                ((ImageView) view.findViewById(ac.imageView1)).setImageResource(ab.ic_list_alarm);
                ((TextView) view.findViewById(ac.textView1)).setText(af.alarmsetting);
                return view;
            case 6:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_text, (ViewGroup) null);
                }
                c(view);
                return view;
            case 7:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_radio, (ViewGroup) null);
                }
                d(view);
                return view;
            case 8:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_seekbar, (ViewGroup) null);
                }
                a(view);
                return view;
            case 9:
                if (view == null) {
                    view = LayoutInflater.from(this.d).inflate(ad.list_item_seekbar, (ViewGroup) null);
                }
                b(view);
                return view;
            default:
                return LayoutInflater.from(SettingActivity.a).inflate(ad.list_item_text, (ViewGroup) null);
        }
    }

    public void a() {
        com.tsf.shell.widget.alarm.AlarmUtils.i.a(SettingActivity.a, 1, this.c.b, this.c.c, this.c.d, this.c.e, this.b, "", this.a.b());
    }

    private void a(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(af.snooze_duration_title);
        final TextView textView = (TextView) view.findViewById(ac.textView2);
        textView.setText(String.format(SettingActivity.a.getString(af.minutes), Integer.valueOf(j.j)));
        SeekBar seekBar = (SeekBar) view.findViewById(ac.seekBar1);
        seekBar.setProgress(b(j.j));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.1
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                int f = b.this.f(i);
                textView.setText(String.format(SettingActivity.a.getString(af.minutes), Integer.valueOf(f)));
                j.j = f;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    private void b(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(af.widget_duration_title);
        final TextView textView = (TextView) view.findViewById(ac.textView2);
        textView.setText(j.k + "s");
        SeekBar seekBar = (SeekBar) view.findViewById(ac.seekBar1);
        seekBar.setProgress(a(j.k));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.2
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                int e = b.this.e(i);
                textView.setText(String.valueOf(e) + "s");
                j.k = e;
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    public int a(int i) {
        return ((i + 0) * 100) / 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int e(int i) {
        return ((i * 30) / 100) + 0;
    }

    public int b(int i) {
        return ((i - 5) * 100) / 25;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int f(int i) {
        return ((i * 25) / 100) + 5;
    }

    private void c(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(af.alert);
        ((TextView) view.findViewById(ac.textView2)).setText(this.a.a());
    }

    private void d(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(af.alarm_vibrate);
        ((TextView) view.findViewById(ac.textView2)).setVisibility(8);
        a(this.b, view);
        ((SwitchCompat) view.findViewById(ac.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                b.this.b = z;
                b.this.a();
                b.this.notifyDataSetChanged();
            }
        });
    }

    private void e(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(af.autoupdatetime);
        final TextView textView = (TextView) view.findViewById(ac.textView2);
        textView.setText(b(j.e));
        SeekBar seekBar = (SeekBar) view.findViewById(ac.seekBar1);
        seekBar.setProgress(c(j.e));
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.4
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar2, int i, boolean z) {
                textView.setText(b.g(i));
                j.e = b.h(i);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar2) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar2) {
            }
        });
    }

    private void f(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(SettingActivity.a.getString(af.lastupdatetime));
        TextView textView = (TextView) view.findViewById(ac.textView2);
        if (j.f > 0) {
            textView.setText(a(j.f));
        } else if (j.f == 0) {
            textView.setText("-- --");
        } else if (j.f == -1) {
            textView.setText("update...");
        }
    }

    private void g(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(SettingActivity.a.getString(af.setmylocation));
        TextView textView = (TextView) view.findViewById(ac.textView2);
        if (j.a) {
            textView.setText(SettingActivity.a.getString(af.autosetmylocation));
        } else {
            textView.setText(j.c);
        }
    }

    private void h(View view) {
        ((TextView) view.findViewById(ac.textView1)).setText(SettingActivity.a.getString(af.usecelsius));
        ((TextView) view.findViewById(ac.textView2)).setText(SettingActivity.a.getString(af.usecelsius_description));
        a(j.b, view);
        ((SwitchCompat) view.findViewById(ac.switch1)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.tsf.shell.widget.alarm.setting.b.5
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                j.b = z;
            }
        });
    }

    private static String a(long j) {
        return new SimpleDateFormat("MM-dd HH:mm").format(Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String g(int i) {
        if (i == 0) {
            return SettingActivity.a.getString(af.close);
        }
        return b(h(i));
    }

    private static String b(long j) {
        long j2 = j / 1000;
        if (j2 == 0) {
            return SettingActivity.a.getString(af.close);
        }
        return String.valueOf((int) (j2 / 3600)) + SettingActivity.a.getString(af.repeathours);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long h(int i) {
        return ((int) (i / 4.1666665f)) * 3600 * 1000;
    }

    private static int c(long j) {
        return (int) (((j / 3600) / 1000) * 4.1666665f);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    static void a(boolean z, View view) {
        ((SwitchCompat) view.findViewById(ac.switch1)).setChecked(z);
    }
}
