package com.qiuke.principle.segregation;

/**
 * 接口隔离原则
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface11{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class BB implements Interface11{
    @Override
    public void operation1() {
        System.out.println("B" + 1);
    }
    @Override
    public void operation2() {
        System.out.println("B" + 2);
    }
    @Override
    public void operation3() {
        System.out.println("B" + 3);
    }
    @Override
    public void operation4() {
        System.out.println("B" + 4);
    }
    @Override
    public void operation5() {
        System.out.println("B" + 5);
    }
}

class DD implements Interface11{
    @Override
    public void operation1() {
        System.out.println("D" + 1);
    }
    @Override
    public void operation2() {
        System.out.println("D" + 2);
    }
    @Override
    public void operation3() {
        System.out.println("D" + 3);
    }
    @Override
    public void operation4() {
        System.out.println("D" + 4);
    }
    @Override
    public void operation5() {
        System.out.println("D" + 5);
    }
}
class AA { // A类通过接口Interface1 依赖(使用)B类 但是只会用到1,2,3方法
    public void depend1(Interface11 i) {
        i.operation1();
    }
    public void depend2(Interface11 i) {
        i.operation2();
    }
    public void depend3(Interface11 i) {
        i.operation3();
    }
}

class CC { // C类通过接口Interface1 依赖(使用)D类 但是只会用到1,4,5方法
    public void depend1(Interface11 i) {
        i.operation1();
    }
    public void depend4(Interface11 i) {
        i.operation4();
    }
    public void depend5(Interface11 i) {
        i.operation5();
    }
}

