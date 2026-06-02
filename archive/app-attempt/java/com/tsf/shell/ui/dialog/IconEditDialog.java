package com.tsf.shell.ui.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.text.InputType;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.tsf.shell.data.local.entity.FavoriteItem;

public class IconEditDialog {

    public interface OnSaveListener {
        void onSave(FavoriteItem item, String newName);
    }

    public static void show(Context context, FavoriteItem item, OnSaveListener listener) {
        LinearLayout layout = new LinearLayout(context);
        layout.setPadding(48, 24, 48, 24);
        layout.setOrientation(LinearLayout.VERTICAL);

        EditText nameInput = new EditText(context);
        nameInput.setInputType(InputType.TYPE_CLASS_TEXT);
        nameInput.setText(item.title != null ? item.title : "");
        nameInput.setHint("App name");
        layout.addView(nameInput);

        new AlertDialog.Builder(context)
                .setTitle("Edit " + (item.title != null ? item.title : "Item"))
                .setView(layout)
                .setPositiveButton("Save", (dialog, which) -> {
                    String newName = nameInput.getText().toString().trim();
                    if (!newName.isEmpty() && !newName.equals(item.title)) {
                        if (listener != null) listener.onSave(item, newName);
                    }
                })
                .setNegativeButton("Cancel", null)
                .show();
    }
}
