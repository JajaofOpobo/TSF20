package com.tsf.shell.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tsf.shell.R;
import java.util.ArrayList;
import java.util.List;

public class WidgetPickerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private WidgetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureSystemBars();
        setContentView(R.layout.activity_widget_picker);
        
        recyclerView = findViewById(R.id.widget_list);
        
        adapter = new WidgetAdapter(this);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(adapter);
        
        loadWidgets();
        
        findViewById(R.id.close_button).setOnClickListener(v -> finish());
    }

    private void loadWidgets() {
        AppWidgetManager manager = AppWidgetManager.getInstance(this);
        List<AppWidgetProviderInfo> widgets = manager.getInstalledProviders();
        List<WidgetItem> items = new ArrayList<>();
        
        PackageManager pm = getPackageManager();
        for (AppWidgetProviderInfo info : widgets) {
            WidgetItem item = new WidgetItem();
            String label = info.label != null ? info.label.toString() : "Widget";
            item.label = label;
            try {
                item.icon = pm.getApplicationIcon(info.provider.getPackageName());
            } catch (Exception e) {
                item.icon = getDrawable(android.R.drawable.sym_def_app_icon);
            }
            items.add(item);
        }
        
        adapter.setWidgets(items, widgets);
    }

    private void configureSystemBars() {
        Window window = getWindow();
        window.setStatusBarColor(getColor(R.color.launcher_background));
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            window.getInsetsController().setSystemBarsAppearance(0, WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS);
        }
    }

    static class WidgetItem {
        String label;
        Drawable icon;
    }

    static class WidgetAdapter extends RecyclerView.Adapter<WidgetAdapter.WidgetViewHolder> {
        private final List<AppWidgetProviderInfo> providers = new ArrayList<>();
        private final List<WidgetItem> widgets = new ArrayList<>();
        private final WidgetPickerActivity activity;

        WidgetAdapter(WidgetPickerActivity activity) {
            this.activity = activity;
        }

        void setWidgets(List<WidgetItem> widgetItems, List<AppWidgetProviderInfo> providerInfos) {
            this.widgets.clear();
            this.widgets.addAll(widgetItems);
            this.providers.clear();
            if (providerInfos != null) {
                this.providers.addAll(providerInfos);
            }
            notifyDataSetChanged();
        }

        @Override
        public WidgetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = android.view.LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.item_widget, parent, false);
            WidgetViewHolder holder = new WidgetViewHolder(view);
            holder.itemView.setOnClickListener(v -> {
                int pos = holder.getAdapterPosition();
                if (pos < 0 || pos >= providers.size()) return;
                AppWidgetProviderInfo info = providers.get(pos);
                Intent result = new Intent();
                result.putExtra("provider", info.provider.flattenToString());
                result.putExtra("label", info.label != null ? info.label.toString() : "Widget");
                result.putExtra("minWidth", info.minWidth);
                result.putExtra("minHeight", info.minHeight);
                activity.setResult(RESULT_OK, result);
                activity.finish();
            });
            return holder;
        }

        @Override
        public void onBindViewHolder(WidgetViewHolder holder, int position) {
            WidgetItem item = widgets.get(position);
            holder.label.setText(item.label);
            holder.icon.setImageDrawable(item.icon);
        }

        @Override
        public int getItemCount() {
            return widgets.size();
        }

        static class WidgetViewHolder extends RecyclerView.ViewHolder {
            ImageView icon;
            TextView label;

            WidgetViewHolder(View itemView) {
                super(itemView);
                icon = itemView.findViewById(R.id.widget_icon);
                label = itemView.findViewById(R.id.widget_label);
            }
        }
    }
}