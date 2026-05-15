package com.tsf.shell.ui;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tsf.shell.R;
import com.tsf.shell.data.repository.LauncherRepository;
import java.util.ArrayList;
import java.util.List;

public class AppDrawerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AppAdapter adapter;
    private EditText searchBox;
    private List<LauncherRepository.LaunchableApp> allApps = new ArrayList<>();
    private LauncherRepository repository;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureSystemBars();
        setContentView(R.layout.activity_app_drawer);
        
        initViews();
        loadApps();
    }

    private void initViews() {
        searchBox = findViewById(R.id.search_box);
        recyclerView = findViewById(R.id.app_list);
        
        adapter = new AppAdapter(new ArrayList<>());
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(adapter);
        
        adapter.setOnAppClickListener(app -> {
            launchApp(app.packageName);
        });
        
        searchBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                filterApps(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
        
        findViewById(R.id.close_button).setOnClickListener(v -> finish());
    }

    private void loadApps() {
        repository = new LauncherRepository(this);
        repository.getAllApps().observe(this, apps -> {
            if (apps != null) {
                allApps = apps;
                adapter.setApps(allApps);
            }
        });
    }

    private void filterApps(String query) {
        if (query.isEmpty()) {
            adapter.setApps(allApps);
            return;
        }
        List<LauncherRepository.LaunchableApp> filtered = new ArrayList<>();
        for (LauncherRepository.LaunchableApp app : allApps) {
            if (app.title.toLowerCase().contains(query.toLowerCase())) {
                filtered.add(app);
            }
        }
        adapter.setApps(filtered);
    }

    private void launchApp(String packageName) {
        Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
        if (intent != null) {
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Cannot launch: " + packageName, Toast.LENGTH_SHORT).show();
        }
    }

    private void configureSystemBars() {
        Window window = getWindow();
        window.setStatusBarColor(getColor(R.color.launcher_background));
        window.setNavigationBarColor(getColor(R.color.launcher_background));

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            WindowInsetsController controller = window.getInsetsController();
            if (controller != null) {
                controller.hide(WindowInsets.Type.statusBars());
                controller.setSystemBarsBehavior(WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE);
            }
        }
    }
}