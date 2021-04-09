package com.smakslow.designpattern.factory.refletionfactory;

import com.smakslow.designpattern.factory.staticfactory.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class RefletionFactory  {
    private Map<String,Class> registerProducts =  new HashMap<>();

    public  void registerVehicle(String vehicleId,Class vehicleClass){
        registerProducts.put(vehicleId,vehicleClass);
    }

    public Vehicle creteVehicle(String vehicleType) throws IllegalAccessException, InstantiationException {
        Class productClass = registerProducts.get(vehicleType);
        return (Vehicle) productClass.newInstance();
    }
}
