package com.epam.car;

/*
 *  Создать объект класса Автомобиль, используя классы Колесо, Двигатель.
 *  Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.
 */
public class CarRunner {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes Benz", 280, 3.0);
        System.out.println(car1.getModel());
        car1.refueled();

        car1.setWheels(new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_LEFT),
                new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_RIGHT),
                new Wheel(15, WheelType.SUMMER, RimsType.STAMPED, WheelPosition.REAR_LEFT),
                new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.REAR_RIGHT));
        car1.printWheels();

        car1.changeWheel(WheelPosition.REAR_LEFT,
                new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.REAR_LEFT));
        car1.printWheels();

        car1.setWheels(new Wheel(16, WheelType.WINTER, RimsType.ALLOY, WheelPosition.FRONT_RIGHT));
        car1.printWheels();

        car1.drive();
    }
}
