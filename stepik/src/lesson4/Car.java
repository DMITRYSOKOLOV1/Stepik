package lesson4;

public class Car {
    String color = "red";
    String engine = "v6";
}
class CarTest{
    public static void main(String[] args) {
        int a;
        Car car1 = new Car();
        Car car2 = car1;
        Car car3;
        car1.color = "black";
        car1.engine = "v8";

        System.out.println(new Car().engine);
        System.out.println("cvet: " + car1.engine);
        System.out.println("motor: " + car1.color);
    }
}