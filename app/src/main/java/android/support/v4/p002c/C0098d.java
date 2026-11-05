package android.support.v4.p002c;

/* compiled from: DontLook */
/* renamed from: android.support.v4.c.d */
/* loaded from: classes.dex */
public final class C0098d {
    /* renamed from: a */
    public static void m272a(Object obj, StringBuilder sb) {
        int iLastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
