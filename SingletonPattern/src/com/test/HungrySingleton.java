package com.test;

/**
 * 描述：饿汉模式
 * </p>
 *
 * @author QinLiNa
 * @data 2020/5/1
 */
public class HungrySingleton {
    private static HungrySingleton h =new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return h;
    }
}
