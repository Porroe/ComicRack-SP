package com.p004a.p005a;

import android.app.Activity;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.p004a.p005a.p011e.C0372i;
import java.lang.ref.WeakReference;
import java.util.Date;

/* compiled from: DontLook */
/* renamed from: com.a.a.av */
/* loaded from: classes.dex */
final class RunnableC0269av implements Runnable {

    /* renamed from: a */
    private final WeakReference f685a;

    /* renamed from: b */
    private final SharedPreferences.Editor f686b;

    public RunnableC0269av(Activity activity) {
        this(activity, (byte) 0);
    }

    private RunnableC0269av(Activity activity, byte b) {
        this.f685a = new WeakReference(activity);
        this.f686b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        try {
            Activity activity = (Activity) this.f685a.get();
            if (activity == null) {
                C0372i.m911a("Activity was null while making a doritos cookie request.");
                return;
            }
            Cursor cursorQuery = activity.getContentResolver().query(C0266as.f681a, C0266as.f682b, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst() && cursorQuery.getColumnNames().length > 0) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex(cursorQuery.getColumnName(0)));
            } else {
                C0372i.m911a("Google+ app not installed, not storing doritos cookie");
                string = null;
            }
            SharedPreferences.Editor editorEdit = this.f686b == null ? PreferenceManager.getDefaultSharedPreferences(activity.getApplicationContext()).edit() : this.f686b;
            if (!TextUtils.isEmpty(string)) {
                editorEdit.putString("drt", string);
                editorEdit.putLong("drt_ts", new Date().getTime());
            } else {
                editorEdit.putString("drt", "");
                editorEdit.putLong("drt_ts", 0L);
            }
            editorEdit.commit();
        } catch (Throwable th) {
            C0372i.m919d("An unknown error occurred while sending a doritos request.", th);
        }
    }
}
