package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.p002c.C0106l;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.l */
/* loaded from: classes.dex */
public class ActivityC0076l extends Activity {

    /* renamed from: a */
    final Handler f273a = new HandlerC0077m(this);

    /* renamed from: b */
    final LayoutInflaterFactoryC0082r f274b = new LayoutInflaterFactoryC0082r();

    /* renamed from: c */
    final InterfaceC0080p f275c = new C0078n(this);

    /* renamed from: d */
    boolean f276d;

    /* renamed from: e */
    boolean f277e;

    /* renamed from: f */
    boolean f278f;

    /* renamed from: g */
    boolean f279g;

    /* renamed from: h */
    boolean f280h;

    /* renamed from: i */
    boolean f281i;

    /* renamed from: j */
    boolean f282j;

    /* renamed from: k */
    boolean f283k;

    /* renamed from: l */
    C0106l f284l;

    /* renamed from: m */
    C0014al f285m;

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.f274b.m236g();
        int i3 = i >> 16;
        if (i3 != 0) {
            int i4 = i3 - 1;
            if (this.f274b.f302f == null || i4 < 0 || i4 >= this.f274b.f302f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i));
                return;
            } else if (((Fragment) this.f274b.f302f.get(i4)) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i));
                return;
            } else {
                Fragment.m7p();
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (!this.f274b.m230c()) {
            if (Build.VERSION.SDK_INT < 21) {
                finish();
            } else {
                finishAfterTransition();
            }
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f274b.m211a(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f274b.m216a(this, this.f275c, (Fragment) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        C0079o c0079o = (C0079o) getLastNonConfigurationInstance();
        if (c0079o != null) {
            this.f284l = c0079o.f292e;
        }
        if (bundle != null) {
            this.f274b.m212a(bundle.getParcelable("android:support:fragments"), c0079o != null ? c0079o.f291d : null);
        }
        this.f274b.m237h();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            boolean zOnCreatePanelMenu = super.onCreatePanelMenu(i, menu) | this.f274b.m221a(menu, getMenuInflater());
            if (Build.VERSION.SDK_INT < 11) {
                return true;
            }
            return zOnCreatePanelMenu;
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        View viewOnCreateView = this.f274b.onCreateView(str, context, attributeSet);
        if (viewOnCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m184a(false);
        this.f274b.m245p();
        if (this.f285m != null) {
            this.f285m.m123h();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        onBackPressed();
        return true;
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.f274b.m246q();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        switch (i) {
            case 0:
                return this.f274b.m222a(menuItem);
            case 6:
                return this.f274b.m228b(menuItem);
            default:
                return false;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        switch (i) {
            case 0:
                this.f274b.m227b(menu);
                break;
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f277e = false;
        if (this.f273a.hasMessages(2)) {
            this.f273a.removeMessages(2);
            this.f274b.m240k();
        }
        this.f274b.m241l();
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.f274b.m236g();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f273a.sendEmptyMessage(2);
        this.f277e = true;
        this.f274b.m232d();
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        this.f273a.removeMessages(2);
        this.f274b.m240k();
        this.f274b.m232d();
    }

    /* renamed from: a */
    protected final void m182a() {
        this.f274b.m240k();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0 || menu == null) {
            return super.onPreparePanel(i, view, menu);
        }
        if (this.f281i) {
            this.f281i = false;
            menu.clear();
            onCreatePanelMenu(i, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.f274b.m220a(menu);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        boolean z;
        if (this.f278f) {
            m184a(true);
        }
        ArrayList arrayListM233e = this.f274b.m233e();
        if (this.f284l != null) {
            int size = this.f284l.size();
            C0014al[] c0014alArr = new C0014al[size];
            for (int i = size - 1; i >= 0; i--) {
                c0014alArr[i] = (C0014al) this.f284l.m286c(i);
            }
            z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C0014al c0014al = c0014alArr[i2];
                if (c0014al.f146g) {
                    z = true;
                } else {
                    c0014al.m123h();
                    this.f284l.remove(c0014al.f143d);
                }
            }
        } else {
            z = false;
        }
        if (arrayListM233e == null && !z) {
            return null;
        }
        C0079o c0079o = new C0079o();
        c0079o.f288a = null;
        c0079o.f289b = null;
        c0079o.f290c = null;
        c0079o.f291d = arrayListM233e;
        c0079o.f292e = this.f284l;
        return c0079o;
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelableM235f = this.f274b.m235f();
        if (parcelableM235f != null) {
            bundle.putParcelable("android:support:fragments", parcelableM235f);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f278f = false;
        this.f279g = false;
        this.f273a.removeMessages(1);
        if (!this.f276d) {
            this.f276d = true;
            this.f274b.m238i();
        }
        this.f274b.m236g();
        this.f274b.m232d();
        if (!this.f283k) {
            this.f283k = true;
            if (this.f285m != null) {
                this.f285m.m117b();
            } else if (!this.f282j) {
                boolean z = this.f283k;
                this.f285m = m185b("(root)");
                if (this.f285m != null && !this.f285m.f145f) {
                    this.f285m.m117b();
                }
            }
            this.f282j = true;
        }
        this.f274b.m239j();
        if (this.f284l != null) {
            int size = this.f284l.size();
            C0014al[] c0014alArr = new C0014al[size];
            for (int i = size - 1; i >= 0; i--) {
                c0014alArr[i] = (C0014al) this.f284l.m286c(i);
            }
            for (int i2 = 0; i2 < size; i2++) {
                C0014al c0014al = c0014alArr[i2];
                c0014al.m120e();
                c0014al.m122g();
            }
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f278f = true;
        this.f273a.sendEmptyMessage(1);
        this.f274b.m242m();
    }

    /* renamed from: b */
    public final void m186b() {
        if (Build.VERSION.SDK_INT >= 11) {
            invalidateOptionsMenu();
        } else {
            this.f281i = true;
        }
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = Build.VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.f276d);
        printWriter.print("mResumed=");
        printWriter.print(this.f277e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f278f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.f279g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.f283k);
        if (this.f285m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.f285m)));
            printWriter.println(":");
            this.f285m.m116a(str + "  ", printWriter);
        }
        this.f274b.m218a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        m180a(str + "  ", printWriter, getWindow().getDecorView());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:40:0x00ed. Please report as an issue. */
    /* renamed from: a */
    private static String m179a(View view) throws Resources.NotFoundException {
        String resourcePackageName;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        sb.append(view.isFocusable() ? 'F' : '.');
        sb.append(view.isEnabled() ? 'E' : '.');
        sb.append(view.willNotDraw() ? '.' : 'D');
        sb.append(view.isHorizontalScrollBarEnabled() ? 'H' : '.');
        sb.append(view.isVerticalScrollBarEnabled() ? 'V' : '.');
        sb.append(view.isClickable() ? 'C' : '.');
        sb.append(view.isLongClickable() ? 'L' : '.');
        sb.append(' ');
        sb.append(view.isFocused() ? 'F' : '.');
        sb.append(view.isSelected() ? 'S' : '.');
        sb.append(view.isPressed() ? 'P' : '.');
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (id != 0 && resources != null) {
                switch ((-16777216) & id) {
                    case 16777216:
                        resourcePackageName = "android";
                        String resourceTypeName = resources.getResourceTypeName(id);
                        String resourceEntryName = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName);
                        sb.append("/");
                        sb.append(resourceEntryName);
                        break;
                    case 2130706432:
                        resourcePackageName = "app";
                        String resourceTypeName2 = resources.getResourceTypeName(id);
                        String resourceEntryName2 = resources.getResourceEntryName(id);
                        sb.append(" ");
                        sb.append(resourcePackageName);
                        sb.append(":");
                        sb.append(resourceTypeName2);
                        sb.append("/");
                        sb.append(resourceEntryName2);
                        break;
                    default:
                        try {
                            resourcePackageName = resources.getResourcePackageName(id);
                            String resourceTypeName22 = resources.getResourceTypeName(id);
                            String resourceEntryName22 = resources.getResourceEntryName(id);
                            sb.append(" ");
                            sb.append(resourcePackageName);
                            sb.append(":");
                            sb.append(resourceTypeName22);
                            sb.append("/");
                            sb.append(resourceEntryName22);
                            break;
                        } catch (Resources.NotFoundException e) {
                            break;
                        }
                }
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private void m180a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(m179a(view));
        if ((view instanceof ViewGroup) && (childCount = (viewGroup = (ViewGroup) view).getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i = 0; i < childCount; i++) {
                m180a(str2, printWriter, viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: a */
    final void m184a(boolean z) {
        if (!this.f279g) {
            this.f279g = true;
            this.f280h = z;
            this.f273a.removeMessages(1);
            if (this.f283k) {
                this.f283k = false;
                if (this.f285m != null) {
                    if (this.f280h) {
                        this.f285m.m119d();
                    } else {
                        this.f285m.m118c();
                    }
                }
            }
            this.f274b.m243n();
        }
    }

    /* renamed from: c */
    public static void m181c() {
    }

    /* renamed from: d */
    public final AbstractC0081q m187d() {
        return this.f274b;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (i != -1 && ((-65536) & i) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, i);
    }

    /* renamed from: a */
    final void m183a(String str) {
        C0014al c0014al;
        if (this.f284l != null && (c0014al = (C0014al) this.f284l.get(str)) != null && !c0014al.f146g) {
            c0014al.m123h();
            this.f284l.remove(str);
        }
    }

    /* renamed from: b */
    final C0014al m185b(String str) {
        if (this.f284l == null) {
            this.f284l = new C0106l();
        }
        C0014al c0014al = (C0014al) this.f284l.get(str);
        if (c0014al != null) {
            c0014al.m115a(this);
        }
        return c0014al;
    }
}
