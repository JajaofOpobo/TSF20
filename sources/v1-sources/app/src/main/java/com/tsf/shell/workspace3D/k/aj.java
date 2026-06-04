package com.tsf.shell.workspace3D.k;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.provider.ContactsContract;
import com.censivn.C3DEngine.api.element.Number3d;
import com.censivn.C3DEngine.api.element.info.LauncherShortcut3DInfo;
import com.censivn.C3DEngine.api.message.RenderRunnable;
import com.tsf.shell.Home;
import com.tsf.shell.R;
import com.tsf.shell.bm;
import com.tsf.shell.theme.inside.ThemeManager;
import com.tsf.shell.theme.inside.widget.SystemContactTheme;
import com.tsf.shell.workspace3D.bf;
import com.tsf.shell.workspace3D.k.b.ap;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class aj extends p implements com.tsf.shell.a {
    private static ArrayList H;
    private static boolean J = false;
    private static int K;
    private static int O;
    private static int P;
    private static int Q;
    private static int R;
    private static int S;
    private static int T;
    private static int U;
    private static SystemContactTheme V;
    private static int[] W;
    private int I;
    private LauncherShortcut3DInfo a;

    public aj() {
        if (H == null) {
            H = new ArrayList();
        }
    }

    public j getWidget(Context context) {
        return this;
    }

    public static void bW() {
        V = ThemeManager.mix.contact.getTheme();
        K = (int) (r0.frontPlaneX * ap.W);
        O = (int) (V.frontPlaneY * ap.W);
        P = (int) (V.backPlaneX * ap.W);
        Q = (int) (V.backPlaneY * ap.W);
        R = (int) (V.photoPlaneX * ap.W);
        S = (int) (V.photoPlaneY * ap.W);
        T = (int) (V.photoPlaneWidth * ap.W);
        U = (int) (V.photoPlaneHeight * ap.W);
        W = new int[]{T, U};
        if (H != null) {
            Iterator it = H.iterator();
            while (it.hasNext()) {
                aj ajVar = (aj) it.next();
                try {
                    ajVar.aJ();
                    ajVar.aX();
                } catch (Exception e) {
                }
            }
        }
        bf.l().s();
    }

    @Override // com.tsf.shell.workspace3D.k.j
    public final void br() {
        if (!J) {
            J = true;
            V = ThemeManager.mix.contact.getTheme();
            K = (int) (r0.frontPlaneX * ap.W);
            O = (int) (V.frontPlaneY * ap.W);
            P = (int) (V.backPlaneX * ap.W);
            Q = (int) (V.backPlaneY * ap.W);
            R = (int) (V.photoPlaneX * ap.W);
            S = (int) (V.photoPlaneY * ap.W);
            T = (int) (V.photoPlaneWidth * ap.W);
            U = (int) (V.photoPlaneHeight * ap.W);
            W = new int[]{T, U};
        }
        this.a = (LauncherShortcut3DInfo) be();
        if (this.a.folderInfo != null) {
            if (this.a.folderInfo.addItemInfo(this.a)) {
                bL();
            } else {
                bm.b(com.censivn.C3DEngine.a.c(), this.a);
            }
        }
        bu();
        d(this.D);
        bN();
        aJ();
        H.add(this);
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final void aJ() {
        Bitmap icon = this.a.getIcon(true, T, U);
        if (icon != null && (icon.getWidth() != T || icon.getHeight() != U)) {
            icon.recycle();
            icon = null;
        }
        if (icon == null && this.a.intent != null) {
            icon = a(Uri.parse(this.a.intent));
            bf.l();
            com.tsf.shell.workspace3D.k.b.k.a(this.a);
            this.a.onUpdatePhoto(icon);
        }
        b(icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Bitmap bitmap) {
        Bitmap createBitmap;
        if (bitmap == null) {
            createBitmap = null;
        } else {
            createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(rect);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, 8.0f, 8.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect, paint);
            bitmap.recycle();
        }
        if (this.C != null) {
            this.D.z().b();
            com.censivn.C3DEngine.a.f().a(this.C);
        }
        Bitmap backPlaneBitmap = V.getBackPlaneBitmap();
        Bitmap frontPlaneBitmap = V.getFrontPlaneBitmap();
        Bitmap a = com.tsf.shell.setting.a.v.a((this.a.title.equals("") || this.a.title == null) ? com.censivn.C3DEngine.h.a.c(R.string.widget_contact) : this.a.title);
        Bitmap a2 = ap.a();
        Canvas canvas2 = new Canvas(a2);
        canvas2.drawColor(-1, PorterDuff.Mode.CLEAR);
        if (backPlaneBitmap != null) {
            Bitmap c = c(backPlaneBitmap);
            canvas2.drawBitmap(c, P, Q, (Paint) null);
            c.recycle();
        }
        if (createBitmap != null) {
            canvas2.drawBitmap(createBitmap, R, S, (Paint) null);
            createBitmap.recycle();
        }
        if (frontPlaneBitmap != null) {
            Bitmap c2 = c(frontPlaneBitmap);
            canvas2.drawBitmap(c2, K, O, (Paint) null);
            c2.recycle();
        }
        canvas2.drawBitmap(a, (ap.A - a.getWidth()) / 2, ap.E + 3, (Paint) null);
        a.recycle();
        com.tsf.shell.setting.a.g.d();
        this.C = com.censivn.C3DEngine.a.f().a(a2, true);
        this.D.z().c(this.C);
    }

    private static Bitmap c(Bitmap bitmap) {
        Bitmap createScaledBitmap;
        if (ap.W != 1.0f && (createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * ap.W), (int) (bitmap.getHeight() * ap.W), true)) != bitmap) {
            bitmap.recycle();
            return createScaledBitmap;
        }
        return bitmap;
    }

    @Override // com.tsf.shell.workspace3D.k.ab
    public final void bP() {
        super.bP();
        if (this.a.intent != null && !this.a.intent.equals("")) {
            try {
                Number3d c = c(new Number3d());
                float[] a = com.censivn.C3DEngine.h.a.a(c.x, c.y);
                ContactsContract.QuickContact.showQuickContact(com.censivn.C3DEngine.a.c(), (a[0] > ((float) com.censivn.C3DEngine.a.l) || a[0] < 0.0f || a[1] > ((float) com.censivn.C3DEngine.a.m) || a[1] < 0.0f) ? new Rect(com.censivn.C3DEngine.a.n, (com.censivn.C3DEngine.a.o / 2) - 32, com.censivn.C3DEngine.a.n, com.censivn.C3DEngine.a.o + 90) : new Rect((int) a[0], ((int) a[1]) - 32, (int) a[0], ((int) a[1]) + 90), Uri.parse(this.a.intent), 1, (String[]) null);
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        Intent intent = new Intent("android.intent.action.PICK");
        intent.setType("vnd.android.cursor.dir/contact");
        this.I = Home.d().a(intent, this);
    }

    @Override // com.tsf.shell.workspace3D.k.z, com.tsf.shell.workspace3D.k.j
    public final void n() {
        if (H.contains(this)) {
            H.remove(this);
        }
        com.censivn.C3DEngine.a.f().a(this.C);
        this.a = null;
        this.C = null;
        super.n();
    }

    @Override // com.tsf.shell.a
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && i == this.I) {
            Uri data = intent.getData();
            a_(true);
            this.a.intent = data.toString();
            Bitmap a = a(data);
            bf.l();
            com.tsf.shell.workspace3D.k.b.k.a(this.a);
            this.a.onUpdatePhoto(a);
            if (a != null) {
                a.recycle();
            }
            com.censivn.C3DEngine.a.a().a((RenderRunnable) new ak(this, this));
        }
    }

    @Override // com.tsf.shell.workspace3D.k.p
    public final int[] aH() {
        return W;
    }

    private Bitmap a(Uri uri) {
        Bitmap bitmap;
        if (uri == null) {
            return null;
        }
        Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(uri, null, null, null, null);
        if (query.moveToNext()) {
            ((LauncherShortcut3DInfo) be()).title = query.getString(query.getColumnIndex("display_name"));
            String string = query.getString(query.getColumnIndex("photo_id"));
            Bitmap d = string != null ? d(string) : null;
            if (d == null || d.isRecycled()) {
                bitmap = d;
            } else {
                bitmap = Bitmap.createScaledBitmap(d, T, U, true);
                d.recycle();
            }
        } else {
            bitmap = null;
        }
        query.close();
        return bitmap;
    }

    private static Bitmap d(String str) {
        Bitmap bitmap = null;
        Cursor query = com.censivn.C3DEngine.a.c().getContentResolver().query(ContactsContract.Data.CONTENT_URI, new String[]{"data15"}, "ContactsContract.Data._ID = " + str, null, null);
        try {
            if (query != null) {
                query.moveToFirst();
                byte[] blob = query.getBlob(0);
                if (blob == null) {
                    query.close();
                } else {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(blob, 0, blob.length);
                    query.close();
                    bitmap = decodeByteArray;
                }
            } else {
                query.close();
            }
        } catch (Exception e) {
        }
        return bitmap;
    }

    @Override // com.tsf.shell.workspace3D.k.z
    public final ArrayList a(ArrayList arrayList) {
        arrayList.add(3);
        arrayList.add(1);
        if (M().z != 0.0f) {
            arrayList.add(6);
        }
        arrayList.add(7);
        arrayList.add(4);
        return arrayList;
    }
}
