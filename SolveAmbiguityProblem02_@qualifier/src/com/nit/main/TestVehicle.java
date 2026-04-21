package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.Vehicle;

public class TestVehicle {
public static void main(String[] args) {
	try (AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(AppConfig.class)){
	Vehicle vehicle=ctx.getBean("vehicle", Vehicle.class);
	vehicle.startVehicle();
}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
