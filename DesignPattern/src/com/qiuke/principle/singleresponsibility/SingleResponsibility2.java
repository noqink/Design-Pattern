package com.qiuke.principle.singleresponsibility;

/**
 * 单一原则
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}

// 陆地交通工具
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行"); }
}
// 空中飞行工具
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}
// 水上游行工具
class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行"); }
}