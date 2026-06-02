package com.tsf.shell.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.tsf.shell.R;
import com.tsf.shell.data.repository.LauncherRepository;
import java.util.List;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.AppViewHolder> {

    private List<LauncherRepository.LaunchableApp> apps;
    private OnAppClickListener listener;

    public AppAdapter(List<LauncherRepository.LaunchableApp> apps) {
        this.apps = apps;
    }

    public void setApps(List<LauncherRepository.LaunchableApp> apps) {
        this.apps = apps;
        notifyDataSetChanged();
    }

    public void setOnAppClickListener(OnAppClickListener listener) {
        this.listener = listener;
    }

    @Override
    public AppViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_app, parent, false);
        return new AppViewHolder(view);
    }

    @Override
    public void onBindViewHolder(AppViewHolder holder, int position) {
        LauncherRepository.LaunchableApp app = apps.get(holder.getAdapterPosition());
        holder.title.setText(app.title);
        holder.icon.setImageDrawable(app.icon);
        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onAppClick(app);
            }
        });
    }

    @Override
    public int getItemCount() {
        return apps != null ? apps.size() : 0;
    }

    public interface OnAppClickListener {
        void onAppClick(LauncherRepository.LaunchableApp app);
    }

    static class AppViewHolder extends RecyclerView.ViewHolder {
        ImageView icon;
        TextView title;

        AppViewHolder(View itemView) {
            super(itemView);
            icon = itemView.findViewById(R.id.app_icon);
            title = itemView.findViewById(R.id.app_title);
        }
    }
}