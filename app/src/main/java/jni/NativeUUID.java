package jni;

public class NativeUUID {

    static {
        System.loadLibrary("jni-main");
    }

    private static NativeUUID instance = null;

    private NativeUUID() {}

    public static NativeUUID getInstance() {
        if (instance == null) {
            instance = new NativeUUID();
        }
        return instance;
    }

    public native String generateUUID();
}
