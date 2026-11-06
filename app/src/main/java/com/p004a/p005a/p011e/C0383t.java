package com.p004a.p005a.p011e;

import android.R;
import android.app.AlertDialog;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p004a.p005a.ActivityC0274b;
import com.p004a.p005a.C0330bs;
import com.p004a.p005a.C0331bt;
import com.p004a.p005a.C0332bu;
import com.p004a.p005a.p007b.C0290e;

/* compiled from: DontLook */
/* renamed from: com.a.a.e.t */
/* loaded from: classes.dex */
public class C0383t extends WebChromeClient {

    /* renamed from: a */
    private final C0332bu f1074a;

    public C0383t(C0332bu c0332bu) {
        this.f1074a = c0332bu;
    }

    @Override // android.webkit.WebChromeClient
    public void onCloseWindow(WebView webView) {
        if (webView instanceof C0290e) {
            ((C0290e) webView).m711e();
        }
    }

    @Override // android.webkit.WebChromeClient
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        switch (C0382s.f1073a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                C0372i.m914b(str);
                break;
            case 2:
                C0372i.m920e(str);
                break;
            case 3:
            case 4:
                C0372i.m916c(str);
                break;
            case 5:
                C0372i.m911a(str);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        C0331bt c0331bt = (C0331bt) ((C0330bs) this.f1074a.f965d.m898a()).f945b.m898a();
        long jLongValue = ((Long) c0331bt.f958l.m899a()).longValue() - j3;
        if (jLongValue <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(Math.min(((Long) c0331bt.f960n.m899a()).longValue(), jLongValue) + j, ((Long) c0331bt.f959m.m899a()).longValue());
            } else if (j2 <= Math.min(((Long) c0331bt.f959m.m899a()).longValue() - j, jLongValue)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > jLongValue || j2 > ((Long) c0331bt.f959m.m899a()).longValue()) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m926a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m926a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m926a(webView, str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m926a(webView, str, str2, str3, null, jsPromptResult, true);
    }

    public void onReachedMaxAppCacheSize(long j, long j2, WebStorage.QuotaUpdater quotaUpdater) {
        C0331bt c0331bt = (C0331bt) ((C0330bs) this.f1074a.f965d.m898a()).f945b.m898a();
        long jLongValue = ((Long) c0331bt.f957k.m899a()).longValue() - j2;
        long jLongValue2 = ((Long) c0331bt.f956j.m899a()).longValue() + j;
        if (jLongValue < jLongValue2) {
            quotaUpdater.updateQuota(0L);
        } else {
            quotaUpdater.updateQuota(jLongValue2);
        }
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }

    /* renamed from: a */
    private static boolean m926a(WebView webView, String str, String str2, String str3, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        ActivityC0274b activityC0274bM714h;
        if ((webView instanceof C0290e) && (activityC0274bM714h = ((C0290e) webView).m714h()) != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activityC0274bM714h);
            builder.setTitle(str);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(activityC0274bM714h);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(activityC0274bM714h);
                textView.setText(str2);
                EditText editText = new EditText(activityC0274bM714h);
                editText.setText(str3);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0389z(jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0388y(jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0387x(jsPromptResult)).create().show();
                return true;
            }
            builder.setMessage(str2).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0386w(jsResult)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0385v(jsResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0384u(jsResult)).create().show();
            return true;
        }
        return false;
    }
}
