package com.qiuke.principle.inversion;

public class DependecyInversion1 {
    public static void main(String[] args) {

    }
}
class Email {
    public String getInfo() { return "电子邮件信息: hello,world"; }
}
//  完成 Person 接收消息的功能
//  方式 1 分析
//1. 简单，比较容易想到
//2. 如果我们获取的对象是 微信，短信等等，则新增类，同时 Perons 也要增加相应的接收方法
//3. 解决思路:引入一个抽象的接口 IReceiver, 表示接收者, 这样 Person 类与接口 IReceiver 发生依赖
class Person{

}