package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;

public class Fragment {
    public Object C;
    public int G;

    public Fragment() {}

    public FragmentManager k() {
        return null;
    }

    public Activity i() {
        return null;
    }

    public View p() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public void a(Fragment.SavedState savedState) {
    }

    public void d(boolean z) {
    }

    public void e(boolean z) {
    }

    public void a(Activity activity) {
    }

    public void c() {
    }

    public LayoutInflater b(Bundle bundle) {
        return null;
    }

    public void d(Bundle bundle) {
    }

    public void d() {
    }

    public void e(Bundle bundle) {
    }

    public void e() {
    }

    public void f() {
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        SavedState(Parcel in) {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
        }
    }
}
