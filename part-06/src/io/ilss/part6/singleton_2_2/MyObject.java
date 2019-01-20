package io.ilss.part6.singleton_2_2;

/**
 * className MyObject
 * description MyObject
 *
 * @author feng
 * @version 1.0
 * @date 2019-01-20 12:28
 */

public class MyObject {

    private static MyObject object;

    public static MyObject getInstance() {
        //其实和synchronized加在方法是一样的，效率低
        synchronized (MyObject.class) {
            if (null == object) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                object = new MyObject();
            }
        }
        return object;
    }
}

