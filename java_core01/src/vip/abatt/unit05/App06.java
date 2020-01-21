package vip.abatt.unit05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * @author yankai1101
 * Desc: 利用反射，打印出 Integer 类
 **/
public class App06 {
    public static void main(String[] args) {
        Class clazz = Integer.class;
        Constructor[] constructors = clazz.getDeclaredConstructors();

        // 打印头信息
        printTitle(clazz);

        // 打印构造器：printConstructor
        printConstructors(constructors);

        System.out.println("}");

    }

    private static void printTitle(Class clazz) {
        // 获取 类名，比如 Integer
        String clazzSimpleName = clazz.getSimpleName();

        // 获取 方法修饰符
        int modifier = clazz.getModifiers(); // 返回一个整数，描述类/域/方法的修饰符，比如 1
        String stringModifier = Modifier.toString(modifier); // 通过 Modifier 中的方法描述这个修饰符，比如 public

        // TODO 继承 或实现 信息...

        System.out.println(stringModifier + " " + clazzSimpleName+" {");
    }

    private static void printConstructors(Constructor[] constructors) {
        for (Constructor constructor : constructors) {
            System.out.println(constructor + "{}");
        }
    }
}
