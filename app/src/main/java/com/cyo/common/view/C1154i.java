package com.cyo.common.view;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.widget.TextView;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: DontLook */
/* renamed from: com.cyo.common.view.i */
/* loaded from: classes.dex */
public final class C1154i {
    /* renamed from: a */
    public static void m2422a(TextView textView, Pattern pattern, InterfaceC1158m interfaceC1158m) {
        if (interfaceC1158m != null) {
            try {
                CharSequence text = textView.getText();
                Matcher matcher = pattern.matcher(text);
                int i = 0;
                while (i < text.length() && matcher.find(i)) {
                    int iStart = matcher.start();
                    int iEnd = matcher.end();
                    C1156k c1156k = new C1156k(new C1155j(interfaceC1158m, matcher.group()));
                    if (text instanceof Spannable) {
                        ((Spannable) text).setSpan(c1156k, iStart, iEnd, 33);
                    } else {
                        SpannableString spannableStringValueOf = SpannableString.valueOf(text);
                        spannableStringValueOf.setSpan(c1156k, iStart, iEnd, 33);
                        textView.setText(spannableStringValueOf);
                    }
                    i = iEnd + 1;
                }
                if (i > 0) {
                    MovementMethod movementMethod = textView.getMovementMethod();
                    if (movementMethod == null || !(movementMethod instanceof LinkMovementMethod)) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
