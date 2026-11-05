package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: DontLook */
/* renamed from: android.support.v4.app.ac */
/* loaded from: classes.dex */
final class C0005ac {
    /* renamed from: a */
    public static Object m105a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    /* renamed from: a */
    public static void m107a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    /* renamed from: a */
    public static void m106a(Object obj, View view) {
        ((Transition) obj).setEpicenterCallback(new C0006ad(m104a(view)));
    }

    /* renamed from: a */
    static Rect m104a(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: a */
    static void m109a(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.isTransitionGroup()) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m109a(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: a */
    public static void m110a(Map map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m110a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m108a(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            transition.removeTarget((View) arrayList.get(i));
        }
    }

    /* renamed from: b */
    public static void m111b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            transition.addTarget((View) arrayList.get(i));
        }
    }
}
