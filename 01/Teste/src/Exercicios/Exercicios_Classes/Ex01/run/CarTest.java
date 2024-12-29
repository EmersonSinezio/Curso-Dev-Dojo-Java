package Exercicios.Exercicios_Classes.Ex01.run;

import Exercicios.Exercicios_Classes.Ex01.domain.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "Corolla";
        car.model = "Toyota";
        car.age = 2010;

        System.out.println(car.model);
        System.out.println(car.name);
        System.out.println(car.age);
        System.out.println("---------------");

        Car car2 = new Car();
        car2.name = "Civic";
        car2.model = "Honda";
        car2.age = 2024;

        System.out.println("Nome do carro: "+car2.name+" modelo: "+car2.model+" Ano: "+car2.age);
    }
}
