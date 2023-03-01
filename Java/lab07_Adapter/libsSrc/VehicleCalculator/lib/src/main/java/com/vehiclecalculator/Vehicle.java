package com.vehiclecalculator;

public class Vehicle {

    private String model;              // марка автомобіля
    private final int age;             // вік автомобіля в роках
    private final int mileage;         // пробіг автомобіля в милях
    private final float damage;        // ступінь пошкодження автомобіля: 0 - без пошкоджено,
                                       // 1 - максимальне пошкодження, не підлягає ремону

    public Vehicle(int age, String model, float damage, int mileage) {
        this.age = age;
        this.model = model;
        this.damage = damage;
        this.mileage = mileage;
    }

    public int getAge() {
        return age;
    }

    public String getModel() {
        return model;
    }

    public float getDamage() {
        return damage;
    }

    public int getMileage() {
        return mileage;
    }
}
