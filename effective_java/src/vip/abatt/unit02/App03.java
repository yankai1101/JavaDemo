package vip.abatt.unit02;

/**
 * Author:yankai1101
 * Desc:
 * 重叠构造器
 * 建造者模式（Builder）:多个参数，建议使用Build模式
 **/
public class App03 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User(1);
        User u3 = new User(1, 2);
        User u4 = new User(1, 2, 3);

        Teacher teacher = new Teacher.Builder(1).addParam02(2).addParam03(3).build();
    }
}

/**
 * 构造者模式
 */
class Teacher {
    private int param01;
    private int param02;
    private int param03;

    private Teacher(Builder builder) {
    }

    public static class Builder {
        private int param01;
        private int param02;
        private int param03;

        public Builder(int param01) {
            this.param01 = param01;
        }

        public Builder addParam01(int param01) {
            this.param01 = param01;
            return this;
        }

        public Builder addParam02(int param02) {
            this.param02 = param02;
            return this;
        }

        public Builder addParam03(int param03) {
            this.param03 = param03;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }
}

/**
 * 重叠构造器模式：
 */
class User {
    private int param01;
    private int param02;
    private int param03;

    public User() {
    }

    public User(int param01) {
        this.param01 = param01;
    }

    public User(int param01, int param02) {
        this.param01 = param01;
        this.param02 = param02;
    }

    public User(int param01, int param02, int param03) {
        this.param01 = param01;
        this.param02 = param02;
        this.param03 = param03;
    }
}
