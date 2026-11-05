package com.cyo.common;

import android.text.format.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.b */
/* loaded from: classes.dex */
public final class C0971b {

    /* renamed from: a */
    public static final Time f2864a;

    /* renamed from: b */
    public static final Date f2865b;

    static {
        Time time = new Time();
        time.set(1, 0, 1);
        f2864a = time;
        f2865b = new GregorianCalendar(0, 0, 1).getTime();
    }

    /* renamed from: a */
    public static Time m2055a(String str) {
        Time time = new Time();
        time.set(1, 0, 1);
        if (str != null) {
            try {
                time.parse3339(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return time;
    }

    /* renamed from: a */
    public static String m2056a(Time time) {
        if (time == null) {
            time = f2864a;
        }
        return time.format3339(false);
    }

    /* renamed from: a */
    public static Time m2054a() {
        Time time = new Time();
        time.setToNow();
        return time;
    }

    /* renamed from: b */
    public static Date m2057b() {
        return Calendar.getInstance().getTime();
    }
}
