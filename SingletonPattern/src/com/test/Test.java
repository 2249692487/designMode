package com.test;

/**
 * 描述：待描述
 * </p>
 *
 * @author QinLiNa
 * @data 2020/5/1
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
//            System.out.println("HungrySingleton------" + HungrySingleton.getHungrySingleton());
            System.out.println("LazySingleton------" + LazySingleton.getLazySingleton());
        }
    }
}
