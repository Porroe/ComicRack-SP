package twitter4j;

import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.TreeSet;
import twitter4j.MediaEntity;

/* compiled from: DontLook */
/* loaded from: classes.dex */
public class JSONObject {
    public static final Object NULL = new Null();
    private final Map map;

    /* compiled from: DontLook */
    final class Null {
        private Null() {
        }

        protected final Object clone() {
            return this;
        }

        public final boolean equals(Object obj) {
            return obj == null || obj == this;
        }

        public final String toString() {
            return "null";
        }
    }

    public JSONObject() {
        this.map = new HashMap();
    }

    public JSONObject(JSONObject jSONObject, String[] strArr) {
        this();
        for (String str : strArr) {
            try {
                putOnce(str, jSONObject.opt(str));
            } catch (Exception e) {
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:200)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:61)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:281)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public JSONObject(twitter4j.JSONTokener r4) {
        /*
            r3 = this;
            r3.<init>()
            char r0 = r4.nextClean()
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "A JSONObject text must begin with '{' found:"
            r0.<init>(r1)
            char r1 = r4.nextClean()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L23:
            r4.back()
        L26:
            char r0 = r4.nextClean()
            switch(r0) {
                case 0: goto L60;
                case 125: goto L7a;
                default: goto L2d;
            }
        L2d:
            r4.back()
            java.lang.Object r0 = r4.nextValue()
            java.lang.String r0 = r0.toString()
            char r1 = r4.nextClean()
            r2 = 61
            if (r1 != r2) goto L67
            char r1 = r4.next()
            r2 = 62
            if (r1 == r2) goto L4b
            r4.back()
        L4b:
            java.lang.Object r1 = r4.nextValue()
            r3.putOnce(r0, r1)
            char r0 = r4.nextClean()
            switch(r0) {
                case 44: goto L72;
                case 59: goto L72;
                case 125: goto L7a;
                default: goto L59;
            }
        L59:
            java.lang.String r0 = "Expected a ',' or '}'"
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L60:
            java.lang.String r0 = "A JSONObject text must end with '}'"
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L67:
            r2 = 58
            if (r1 == r2) goto L4b
            java.lang.String r0 = "Expected a ':' after a key"
            twitter4j.JSONException r0 = r4.syntaxError(r0)
            throw r0
        L72:
            char r0 = r4.nextClean()
            r1 = 125(0x7d, float:1.75E-43)
            if (r0 != r1) goto L23
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: twitter4j.JSONObject.<init>(twitter4j.JSONTokener):void");
    }

    public JSONObject(Map map) {
        this.map = new HashMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                if (value != null) {
                    this.map.put(entry.getKey(), wrap(value));
                }
            }
        }
    }

    public JSONObject(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this();
        populateMap(obj);
    }

    public JSONObject(Object obj, String[] strArr) {
        this();
        Class<?> cls = obj.getClass();
        for (String str : strArr) {
            try {
                putOpt(str, cls.getField(str).get(obj));
            } catch (Exception e) {
            }
        }
    }

    public JSONObject(String str) {
        this(new JSONTokener(str));
    }

    public JSONObject(String str, Locale locale) throws JSONException {
        this();
        ResourceBundle bundle = ResourceBundle.getBundle(str, locale, Thread.currentThread().getContextClassLoader());
        Enumeration<String> keys = bundle.getKeys();
        while (keys.hasMoreElements()) {
            String strNextElement = keys.nextElement();
            if (strNextElement instanceof String) {
                String[] strArrSplit = strNextElement.split("\\.");
                int length = strArrSplit.length - 1;
                int i = 0;
                JSONObject jSONObject = this;
                while (i < length) {
                    String str2 = strArrSplit[i];
                    Object objOpt = jSONObject.opt(str2);
                    JSONObject jSONObject2 = objOpt instanceof JSONObject ? (JSONObject) objOpt : null;
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put(str2, jSONObject2);
                    }
                    i++;
                    jSONObject = jSONObject2;
                }
                jSONObject.put(strArrSplit[length], bundle.getString(strNextElement));
            }
        }
    }

    public JSONObject append(String str, Object obj) throws JSONException {
        testValidity(obj);
        Object objOpt = opt(str);
        if (objOpt == null) {
            put(str, new JSONArray().put(obj));
        } else if (objOpt instanceof JSONArray) {
            put(str, ((JSONArray) objOpt).put(obj));
        } else {
            throw new JSONException("JSONObject[" + str + "] is not a JSONArray.");
        }
        return this;
    }

    public Object get(String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        Object objOpt = opt(str);
        if (objOpt == null) {
            throw new JSONException("JSONObject[" + quote(str) + "] not found.");
        }
        return objOpt;
    }

    public boolean getBoolean(String str) throws JSONException {
        Object obj = get(str);
        if (obj.equals(Boolean.FALSE) || ((obj instanceof String) && ((String) obj).equalsIgnoreCase("false"))) {
            return false;
        }
        if (obj.equals(Boolean.TRUE) || ((obj instanceof String) && ((String) obj).equalsIgnoreCase("true"))) {
            return true;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a Boolean.");
    }

    public int getInt(String str) throws JSONException {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            return Integer.parseInt((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not an int.");
        }
    }

    public JSONArray getJSONArray(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONArray.");
    }

    public JSONObject getJSONObject(String str) throws JSONException {
        Object obj = get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw new JSONException("JSONObject[" + quote(str) + "] is not a JSONObject.");
    }

    public long getLong(String str) throws JSONException {
        Object obj = get(str);
        try {
            if (obj instanceof Number) {
                return ((Number) obj).longValue();
            }
            return Long.parseLong((String) obj);
        } catch (Exception e) {
            throw new JSONException("JSONObject[" + quote(str) + "] is not a long.");
        }
    }

    public String getString(String str) throws JSONException {
        Object obj = get(str);
        if (obj == NULL) {
            return null;
        }
        return obj.toString();
    }

    public boolean has(String str) {
        return this.map.containsKey(str);
    }

    public boolean isNull(String str) {
        return NULL.equals(opt(str));
    }

    public Iterator keys() {
        return this.map.keySet().iterator();
    }

    public int length() {
        return this.map.size();
    }

    public JSONArray names() {
        JSONArray jSONArray = new JSONArray();
        Iterator itKeys = keys();
        while (itKeys.hasNext()) {
            jSONArray.put(itKeys.next());
        }
        if (jSONArray.length() == 0) {
            return null;
        }
        return jSONArray;
    }

    public static String numberToString(Number number) throws JSONException {
        if (number == null) {
            throw new JSONException("Null pointer");
        }
        testValidity(number);
        String string = number.toString();
        if (string.indexOf(46) > 0 && string.indexOf(MediaEntity.Size.CROP) < 0 && string.indexOf(69) < 0) {
            while (string.endsWith("0")) {
                string = string.substring(0, string.length() - 1);
            }
            if (string.endsWith(".")) {
                return string.substring(0, string.length() - 1);
            }
            return string;
        }
        return string;
    }

    public Object opt(String str) {
        if (str == null) {
            return null;
        }
        return this.map.get(str);
    }

    private void populateMap(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getClassLoader() != null ? cls.getMethods() : cls.getDeclaredMethods();
        for (Method method : methods) {
            try {
                if (Modifier.isPublic(method.getModifiers())) {
                    String name = method.getName();
                    String strSubstring = "";
                    if (name.startsWith("get")) {
                        if (name.equals("getClass") || name.equals("getDeclaringClass")) {
                            strSubstring = "";
                        } else {
                            strSubstring = name.substring(3);
                        }
                    } else if (name.startsWith("is")) {
                        strSubstring = name.substring(2);
                    }
                    if (strSubstring.length() > 0 && Character.isUpperCase(strSubstring.charAt(0)) && method.getParameterTypes().length == 0) {
                        if (strSubstring.length() == 1) {
                            strSubstring = strSubstring.toLowerCase();
                        } else if (!Character.isUpperCase(strSubstring.charAt(1))) {
                            strSubstring = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                        }
                        Object objInvoke = method.invoke(obj, null);
                        if (objInvoke != null) {
                            this.map.put(strSubstring, wrap(objInvoke));
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    public JSONObject put(String str, boolean z) throws JSONException {
        put(str, z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }

    public JSONObject put(String str, Collection collection) throws JSONException {
        put(str, new JSONArray(collection));
        return this;
    }

    public JSONObject put(String str, double d) throws JSONException {
        put(str, new Double(d));
        return this;
    }

    public JSONObject put(String str, int i) throws JSONException {
        put(str, new Integer(i));
        return this;
    }

    public JSONObject put(String str, long j) throws JSONException {
        put(str, new Long(j));
        return this;
    }

    public JSONObject put(String str, Map map) throws JSONException {
        put(str, new JSONObject(map));
        return this;
    }

    public JSONObject put(String str, Object obj) throws JSONException {
        if (str == null) {
            throw new JSONException("Null key.");
        }
        if (obj != null) {
            testValidity(obj);
            this.map.put(str, obj);
        } else {
            remove(str);
        }
        return this;
    }

    public JSONObject putOnce(String str, Object obj) throws JSONException {
        if (str != null && obj != null) {
            if (opt(str) != null) {
                throw new JSONException("Duplicate key \"" + str + "\"");
            }
            put(str, obj);
        }
        return this;
    }

    public JSONObject putOpt(String str, Object obj) throws JSONException {
        if (str != null && obj != null) {
            put(str, obj);
        }
        return this;
    }

    public static String quote(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            return "\"\"";
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 4);
        sb.append('\"');
        char c = 0;
        while (i < length) {
            char cCharAt = str.charAt(i);
            switch (cCharAt) {
                case '\b':
                    sb.append("\\b");
                    break;
                case '\t':
                    sb.append("\\t");
                    break;
                case '\n':
                    sb.append("\\n");
                    break;
                case '\f':
                    sb.append("\\f");
                    break;
                case '\r':
                    sb.append("\\r");
                    break;
                case '\"':
                case '\\':
                    sb.append('\\');
                    sb.append(cCharAt);
                    break;
                case '/':
                    if (c == '<') {
                        sb.append('\\');
                    }
                    sb.append(cCharAt);
                    break;
                default:
                    if (cCharAt < ' ' || ((cCharAt >= 128 && cCharAt < 160) || (cCharAt >= 8192 && cCharAt < 8448))) {
                        sb.append("\\u").append(("000" + Integer.toHexString(cCharAt)).substring(r1.length() - 4));
                        break;
                    } else {
                        sb.append(cCharAt);
                        break;
                    }
                    break;
            }
            i++;
            c = cCharAt;
        }
        sb.append('\"');
        return sb.toString();
    }

    public Object remove(String str) {
        return this.map.remove(str);
    }

    public Iterator sortedKeys() {
        return new TreeSet(this.map.keySet()).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Double] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Integer] */
    public static Object stringToValue(String str) throws NumberFormatException {
        if (!str.equals("")) {
            if (str.equalsIgnoreCase("true")) {
                return Boolean.TRUE;
            }
            if (str.equalsIgnoreCase("false")) {
                return Boolean.FALSE;
            }
            if (str.equalsIgnoreCase("null")) {
                return NULL;
            }
            char cCharAt = str.charAt(0);
            if ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '.' || cCharAt == '-' || cCharAt == '+') {
                if (cCharAt == '0' && str.length() > 2 && (str.charAt(1) == 'x' || str.charAt(1) == 'X')) {
                    try {
                        return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
                    } catch (Exception e) {
                    }
                }
                try {
                    if (str.indexOf(46) >= 0 || str.indexOf(MediaEntity.Size.CROP) >= 0 || str.indexOf(69) >= 0) {
                        return Double.valueOf(str);
                    }
                    long value = Long.parseLong(str);
                    if (value == (int) value) {
                        return Integer.valueOf((int) value);
                    }
                    return Long.valueOf(value);
                } catch (Exception e2) {
                    return str;
                }
            }
            return str;
        }
        return str;
    }

    public static void testValidity(Object obj) throws JSONException {
        if (obj != null) {
            if (obj instanceof Double) {
                if (((Double) obj).isInfinite() || ((Double) obj).isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            } else if (obj instanceof Float) {
                if (((Float) obj).isInfinite() || ((Float) obj).isNaN()) {
                    throw new JSONException("JSON does not allow non-finite numbers.");
                }
            }
        }
    }

    public String toString() {
        try {
            Iterator itKeys = keys();
            StringBuilder sb = new StringBuilder("{");
            while (itKeys.hasNext()) {
                if (sb.length() > 1) {
                    sb.append(',');
                }
                Object next = itKeys.next();
                sb.append(quote(next.toString()));
                sb.append(':');
                sb.append(valueToString(this.map.get(next)));
            }
            sb.append('}');
            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }

    public String toString(int i) {
        return toString(i, 0);
    }

    String toString(int i, int i2) {
        int length = length();
        if (length == 0) {
            return "{}";
        }
        Iterator itSortedKeys = sortedKeys();
        int i3 = i2 + i;
        StringBuilder sb = new StringBuilder("{");
        if (length == 1) {
            Object next = itSortedKeys.next();
            sb.append(quote(next.toString()));
            sb.append(": ");
            sb.append(valueToString(this.map.get(next), i, i2));
        } else {
            while (itSortedKeys.hasNext()) {
                Object next2 = itSortedKeys.next();
                if (sb.length() > 1) {
                    sb.append(",\n");
                } else {
                    sb.append('\n');
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    sb.append(' ');
                }
                sb.append(quote(next2.toString()));
                sb.append(": ");
                sb.append(valueToString(this.map.get(next2), i, i3));
            }
            if (sb.length() > 1) {
                sb.append('\n');
                for (int i5 = 0; i5 < i2; i5++) {
                    sb.append(' ');
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static String valueToString(Object obj) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return numberToString((Number) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof JSONObject) || (obj instanceof JSONArray)) {
            return obj.toString();
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString();
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj).toString();
        }
        if (obj.getClass().isArray()) {
            return new JSONArray(obj).toString();
        }
        return quote(obj.toString());
    }

    static String valueToString(Object obj, int i, int i2) {
        if (obj == null || obj.equals(null)) {
            return "null";
        }
        if (obj instanceof Number) {
            return numberToString((Number) obj);
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).toString(i, i2);
        }
        if (obj instanceof JSONArray) {
            return ((JSONArray) obj).toString(i, i2);
        }
        if (obj instanceof Map) {
            return new JSONObject((Map) obj).toString(i, i2);
        }
        if (obj instanceof Collection) {
            return new JSONArray((Collection) obj).toString(i, i2);
        }
        if (obj.getClass().isArray()) {
            return new JSONArray(obj).toString(i, i2);
        }
        return quote(obj.toString());
    }

    public static Object wrap(Object obj) {
        try {
            if (obj == null) {
                return NULL;
            }
            if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray) && !NULL.equals(obj) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String)) {
                if (obj instanceof Collection) {
                    return new JSONArray((Collection) obj);
                }
                if (obj.getClass().isArray()) {
                    return new JSONArray(obj);
                }
                if (obj instanceof Map) {
                    return new JSONObject((Map) obj);
                }
                Package r0 = obj.getClass().getPackage();
                String name = r0 != null ? r0.getName() : "";
                if (name.startsWith("java.") || name.startsWith("javax.") || obj.getClass().getClassLoader() == null) {
                    return obj.toString();
                }
                return new JSONObject(obj);
            }
            return obj;
        } catch (Exception e) {
            return null;
        }
    }

    public Writer write(Writer writer) throws IOException, JSONException {
        boolean z = false;
        try {
            Iterator itKeys = keys();
            writer.write(123);
            while (itKeys.hasNext()) {
                if (z) {
                    writer.write(44);
                }
                Object next = itKeys.next();
                writer.write(quote(next.toString()));
                writer.write(58);
                Object obj = this.map.get(next);
                if (obj instanceof JSONObject) {
                    ((JSONObject) obj).write(writer);
                } else if (obj instanceof JSONArray) {
                    ((JSONArray) obj).write(writer);
                } else {
                    writer.write(valueToString(obj));
                }
                z = true;
            }
            writer.write(125);
            return writer;
        } catch (IOException e) {
            throw new JSONException(e);
        }
    }
}
