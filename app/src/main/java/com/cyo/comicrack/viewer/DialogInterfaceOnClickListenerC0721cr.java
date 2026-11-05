package com.cyo.comicrack.viewer;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import com.cyo.comicrack.p019a.p020a.C0505b;
import com.cyo.comicrack.p019a.p021b.InterfaceC0606h;

/* compiled from: DontLook */
/* renamed from: com.cyo.comicrack.viewer.cr */
/* loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0721cr implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ ComicRackApplication f2254a;

    /* renamed from: b */
    private final /* synthetic */ RatingBar f2255b;

    /* renamed from: c */
    private final /* synthetic */ EditText f2256c;

    /* renamed from: d */
    private final /* synthetic */ C0505b f2257d;

    /* renamed from: e */
    private final /* synthetic */ InterfaceC0606h f2258e;

    /* renamed from: f */
    private final /* synthetic */ boolean f2259f;

    /* renamed from: g */
    private final /* synthetic */ CheckBox f2260g;

    /* renamed from: h */
    private final /* synthetic */ SharedPreferences f2261h;

    /* renamed from: i */
    private final /* synthetic */ Activity f2262i;

    DialogInterfaceOnClickListenerC0721cr(ComicRackApplication comicRackApplication, RatingBar ratingBar, EditText editText, C0505b c0505b, InterfaceC0606h interfaceC0606h, boolean z, CheckBox checkBox, SharedPreferences sharedPreferences, Activity activity) {
        this.f2254a = comicRackApplication;
        this.f2255b = ratingBar;
        this.f2256c = editText;
        this.f2257d = c0505b;
        this.f2258e = interfaceC0606h;
        this.f2259f = z;
        this.f2260g = checkBox;
        this.f2261h = sharedPreferences;
        this.f2262i = activity;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // android.content.DialogInterface.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            r1 = 0
            android.widget.RatingBar r0 = r6.f2255b
            float r0 = r0.getRating()
            android.widget.EditText r2 = r6.f2256c
            android.text.Editable r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            com.cyo.comicrack.a.a.b r3 = r6.f2257d
            r3.m1122a(r0)
            com.cyo.comicrack.a.a.b r0 = r6.f2257d
            r0.m1132b(r2)
            com.cyo.comicrack.a.b.h r0 = r6.f2258e
            com.cyo.comicrack.p019a.C0628f.m1364b(r0)
            boolean r0 = r6.f2259f
            if (r0 == 0) goto L7c
            android.widget.CheckBox r0 = r6.f2260g
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L7c
            android.content.SharedPreferences r0 = r6.f2261h
            java.lang.String r2 = "tweet_include_thumb"
            r3 = 1
            boolean r0 = r0.getBoolean(r2, r3)
            if (r0 == 0) goto La7
            com.cyo.comicrack.a.b.ab r0 = com.cyo.comicrack.p019a.C0628f.m1362b()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8c
            com.cyo.comicrack.a.b.h r2 = r6.f2258e     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8c
            com.cyo.comicrack.a.a.b r3 = r6.f2257d     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8c
            int r3 = r3.m1180y()     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8c
            android.graphics.Bitmap r3 = r0.m1282a(r2, r3)     // Catch: java.lang.Exception -> L7d java.lang.Throwable -> L8c
            android.graphics.Bitmap r2 = com.cyo.comicrack.p019a.p021b.C0586a.m1259a(r3)     // Catch: java.lang.Throwable -> L9a java.lang.Exception -> L9f
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            r4.<init>()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            r5 = 75
            r2.compress(r0, r5, r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            byte[] r4 = r4.toByteArray()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La3
            if (r2 == 0) goto L65
            r2.recycle()
        L65:
            if (r3 == 0) goto L6a
            r3.recycle()
        L6a:
            com.cyo.comicrack.viewer.ComicRackApplication r1 = com.cyo.comicrack.viewer.ComicRackApplication.f1954i
            com.cyo.common.b.a.f r1 = r1.m1447n()
            android.app.Activity r2 = r6.f2262i
            com.cyo.comicrack.viewer.cs r3 = new com.cyo.comicrack.viewer.cs
            com.cyo.comicrack.a.a.b r4 = r6.f2257d
            r3.<init>(r6, r4)
            r1.m2070a(r2, r3, r0)
        L7c:
            return
        L7d:
            r0 = move-exception
            r0 = r1
            r2 = r1
        L80:
            if (r0 == 0) goto L85
            r0.recycle()
        L85:
            if (r2 == 0) goto La7
            r2.recycle()
            r0 = r1
            goto L6a
        L8c:
            r0 = move-exception
            r2 = r1
            r3 = r1
        L8f:
            if (r2 == 0) goto L94
            r2.recycle()
        L94:
            if (r3 == 0) goto L99
            r3.recycle()
        L99:
            throw r0
        L9a:
            r0 = move-exception
            r2 = r1
            goto L8f
        L9d:
            r0 = move-exception
            goto L8f
        L9f:
            r0 = move-exception
            r0 = r1
            r2 = r3
            goto L80
        La3:
            r0 = move-exception
            r0 = r2
            r2 = r3
            goto L80
        La7:
            r0 = r1
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cyo.comicrack.viewer.DialogInterfaceOnClickListenerC0721cr.onClick(android.content.DialogInterface, int):void");
    }
}
