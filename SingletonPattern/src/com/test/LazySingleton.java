package com.test;

/**
 * 描述：懒汉模式
 * </p>
 *
 * @author QinLiNa
 * @data 2020/5/1
 */
public class LazySingleton {
    private static LazySingleton l;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingleton() {
        if (l == null) {
            synchronized (LazySingleton.class) {
                l = new LazySingleton();
            }
        }
        return l;
    }
}
