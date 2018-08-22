package typeinfo;

import typeinfo.factory.CaseType;

import java.lang.reflect.Method;

public class CaseTypeCaller {
    public static void main(String[] args) {
        CaseType ct = new CaseType();
        try {
            Method m = ct.getClass().getDeclaredMethod("heIsPrivate");
            m.setAccessible(true);
            m.invoke(ct);
            m = ct.getClass().getDeclaredMethod("heIsProtected");
            m.setAccessible(true);
            m.invoke(ct);
            ct.heIsPublic();
        } catch (Exception e) {
            System.out.println("Exc" + e);
        }
        }

}
