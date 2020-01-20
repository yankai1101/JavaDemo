package vip.abatt.unit02;

import vip.abatt.unit02.singleton.Singleton01;
import vip.abatt.unit02.singleton.Singleton02;
import vip.abatt.unit02.singleton.Singleton03;
import vip.abatt.unit02.singleton.Singleton04;

/**
 * Author:yankai1101
 * Desc: 单例模式测试类
 **/
public class App01 {
    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.INSTANCE;
        s1.method();

        Singleton02 s2 = Singleton02.INSTANCE;
        s2.method();

        Singleton03 s3 = Singleton03.getInstance();
        s3.method();

        Singleton04 s4 = Singleton04.getInstance();
        s4.method();
    }
}
