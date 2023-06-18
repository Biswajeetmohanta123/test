package org.example;

public class Sub {
    public static String sub;

    public Sub() {
        sub = this.sub;
    }

    public static String getSub() {
        return sub;
    }

    public static void setSub(String sub) {
        Sub.sub = sub;
    }
}
