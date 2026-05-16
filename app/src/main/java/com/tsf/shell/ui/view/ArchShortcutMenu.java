package com.tsf.shell.ui.view;

import android.app.AlertDialog;
import android.content.Context;
import com.tsf.shell.data.local.entity.FavoriteItem;

public class ArchShortcutMenu {

    public interface ActionCallback {
        void onEdit(FavoriteItem item);
        void onRemove(FavoriteItem item);
        void onAppInfo(FavoriteItem item);
        void onCreateShortcut(FavoriteItem item);
    }

    public static void show(Context context, FavoriteItem item, ActionCallback callback) {
        String[] items = {"Edit", "Remove", "App Info", "Create Shortcut", "Cancel"};

        new AlertDialog.Builder(context)
                .setTitle(item.title != null ? item.title : "Item")
                .setItems(items, (dialog, which) -> {
                    switch (which) {
                        case 0:
                            if (callback != null) callback.onEdit(item);
                            break;
                        case 1:
                            new AlertDialog.Builder(context)
                                    .setTitle("Remove " + (item.title != null ? item.title : "item") + "?")
                                    .setPositiveButton("Remove", (d, w) -> {
                                        if (callback != null) callback.onRemove(item);
                                    })
                                    .setNegativeButton("Cancel", null)
                                    .show();
                            break;
                        case 2:
                            if (callback != null) callback.onAppInfo(item);
                            break;
                        case 3:
                            if (callback != null) callback.onCreateShortcut(item);
                            break;
                    }
                })
                .show();
    }
}
