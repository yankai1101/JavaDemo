package vip.abatt.unit04;

import java.util.*;

/**
 * Author:yankai1101
 * Desc:
 * 复合优先于继承
 **/
public class App02 {
    public static void main(String[] args) {
        // 创建 子类实例
        Son son = new Son(new HashSet());

        son.addAll(Arrays.asList(4, 5, 6));

        // 统计 addCount
        System.out.println(son.getAddCount()); // 3

        /*
            若子类直接 extends HashSet<E>
            则打印结果为6，因为子类的addAll方法首先给addCount增加3，然后利用 super.addAll来调用HashSet的addAll实现
         */
    }

}

class Son<E> extends Father<E> {
    private int addCount = 0;

    public Son(Set<E> s) {
        super(s);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);// 调用父类的计算方法,此过程叫 转发（forwarding）；转发的方叫 转发方法（forwarding method）
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }
}

class Father<E> implements Set<E> {
    private final Set<E> s; // 复合设计：不拓展现有的类，而是在新的类中增加一个私有域，他引用现有类的一个实例

    public Father(Set<E> s) {
        this.s = s;
    }

    public int size() {
        return s.size();
    }

    public boolean isEmpty() {
        return s.isEmpty();
    }

    public boolean contains(Object o) {
        return s.contains(o);
    }

    public Iterator<E> iterator() {
        return s.iterator();
    }

    public Object[] toArray() {
        return s.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return s.toArray(a);
    }

    public boolean add(E e) {
        return s.add(e);
    }

    public boolean remove(Object o) {
        return s.remove(o);
    }

    public boolean containsAll(Collection<?> c) {
        return s.containsAll(c);
    }

    public boolean addAll(Collection<? extends E> c) {
        return s.addAll(c);
    }

    public boolean retainAll(Collection<?> c) {
        return s.retainAll(c);
    }

    public boolean removeAll(Collection<?> c) {
        return s.removeAll(c);
    }

    public void clear() {
        s.clear();
    }
}
