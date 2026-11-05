package android.support.v4.p002c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.f */
/* loaded from: classes.dex */
abstract class AbstractC0100f {

    /* renamed from: b */
    C0102h f343b;

    /* renamed from: c */
    C0103i f344c;

    /* renamed from: d */
    C0105k f345d;

    /* renamed from: a */
    protected abstract int mo260a();

    /* renamed from: a */
    protected abstract int mo261a(Object obj);

    /* renamed from: a */
    protected abstract Object mo262a(int i, int i2);

    /* renamed from: a */
    protected abstract Object mo263a(int i, Object obj);

    /* renamed from: a */
    protected abstract void mo264a(int i);

    /* renamed from: a */
    protected abstract void mo265a(Object obj, Object obj2);

    /* renamed from: b */
    protected abstract int mo266b(Object obj);

    /* renamed from: b */
    protected abstract Map mo267b();

    /* renamed from: c */
    protected abstract void mo268c();

    AbstractC0100f() {
    }

    /* renamed from: a */
    public static boolean m274a(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* renamed from: b */
    public final Object[] m277b(int i) {
        int iMo260a = mo260a();
        Object[] objArr = new Object[iMo260a];
        for (int i2 = 0; i2 < iMo260a; i2++) {
            objArr[i2] = mo262a(i2, i);
        }
        return objArr;
    }

    /* renamed from: a */
    public final Object[] m276a(Object[] objArr, int i) {
        int iMo260a = mo260a();
        Object[] objArr2 = objArr.length < iMo260a ? (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo260a) : objArr;
        for (int i2 = 0; i2 < iMo260a; i2++) {
            objArr2[i2] = mo262a(i2, i);
        }
        if (objArr2.length > iMo260a) {
            objArr2[iMo260a] = null;
        }
        return objArr2;
    }

    /* renamed from: a */
    public static boolean m275a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                if (set.containsAll(set2)) {
                    return true;
                }
            }
            return false;
        } catch (ClassCastException e) {
            return false;
        } catch (NullPointerException e2) {
            return false;
        }
    }
}
