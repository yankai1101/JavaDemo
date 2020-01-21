package vip.abatt.unit04;

/**
 * Author:yankai1101
 * Desc:
 * 1.尽可能的使每个类或者类成员不被外界访问
 * 2.共有类永远都不应该暴露可变域
 **/
public class App01 {
    /* 私有的 */
    private int a;
    /* 包级私有 default 缺省*/
    int b;
    /* 受保护的 */
    protected int c;
    /* 共有的 */
    public int d;
}
