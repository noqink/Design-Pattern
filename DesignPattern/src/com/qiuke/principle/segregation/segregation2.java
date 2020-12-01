package com.qiuke.principle.segregation;

/**
 * 接口隔离原则
 */
public class segregation2 {
}
// 接口 1
interface Interface1 {
    void operation1(); }
// 接口 2
interface Interface2 {
    void operation2();
    void operation3(); }
// 接口 3
interface Interface3 {
    void operation4();
    void operation5();
}
class B implements Interface1, Interface2 {
    public void operation1() { System.out.println("B 1");}
    public void operation2() { System.out.println("B 1");}
    public void operation3() { System.out.println("B 3");}
}
class D implements Interface1, Interface3 {
    public void operation1() { System.out.println("D 1");}
    public void operation4() { System.out.println("D 4");}
    public void operation5() { System.out.println("D 5");}
}
class A { // A 类通过接口 Interface1,Interface2 依赖(使用) B 类，但是只会用到 1,2,3 方法 public void depend1(Interface1 i) {
    public void depend1(Interface1 i) { i.operation1(); }
    public void depend2(Interface2 i) { i.operation2(); }
    public void depend3(Interface2 i) { i.operation3(); }
}

class C { // C 类通过接口 Interface1,Interface3 依赖(使用) D 类，但是只会用到 1,4,5 方法 public void depend1(Interface1 i) {
    public void depend1(Interface1 i) { i.operation1(); }
    public void depend4(Interface3 i) { i.operation4(); }
    public void depend5(Interface3 i) { i.operation5(); }
}