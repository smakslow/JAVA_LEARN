package com.smakslow.designpattern.factory.staticfactory;


/**
 * 静态工厂模式
 */
public class VehicleFactory {
    public enum VehicleType {
        Bike, Car, Trunk;
    }


    public static Vehicle create(VehicleType vehicleType) {
        if (vehicleType.equals(VehicleType.Bike)) {
            return new Bike();
        } else if (vehicleType.equals(VehicleType.Car)) {
            return new Car();
        } else if (vehicleType.equals(VehicleType.Trunk)) {
            return new Trunk();
        }
        return null;
    }
}
