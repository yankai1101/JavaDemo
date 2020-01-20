package vip.abatt.unit03;

import java.util.Arrays;

/**
 * Author:yankai1101
 * Desc:重写一下方法
 * equals()
 * hashCode()
 * toString()
 * compareTo()
 **/
public class App01 {
    public static void main(String[] args) {
        User u1 = new User("yk", 24);
        User u2 = new User("yk", 24);
        User u3 = new User("ak", 22);
        User u4 = new User("ab", 25);
        User u5 = new User("ak", 28);
        User u6 = new User("yk", 28);
        System.out.println(u1);

        System.out.println(u1.equals(u2)); // true

        // 乱序
        Object[] array = {u1, u4, u3, u6, u5, u2};
        // 排序
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        /*
        [
            {"username":"ak","age":22},
            {"username":"yk","age":24},
            {"username":"yk","age":24},
            {"username":"ab","age":25},
            {"username":"ak","age":28},
            {"username":"yk","age":28}
        ]
         */
    }

}

class User implements Comparable<User> {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof User))
            return false;
        User u = (User) obj;
        return u.username == username && u.age == age;
    }

    @Override
    public int hashCode() {
        // 如果不注重性能，可调用 Objects.hash(Object... values)
        int hashCode = username.hashCode();
        hashCode = 31 * hashCode + Integer.hashCode(age);
        return hashCode;
    }

    @Override
    public String toString() {
        // {"username":"yk","age":24}
        return "{\"username\":\"" + username + "\",\"age\":" + age + "}";
    }

    @Override
    public int compareTo(User o) {
        // 年龄从小到大，若年龄一样，姓名从a到z

        int result = Integer.compare(this.age, o.age);
        if (result == 0) { // 年龄一样
            result = this.username.compareTo(o.username);
        }
        return result;
    }
}

