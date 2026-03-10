package com.nt.sbean;

public interface VehicleFactory {
	Vehicle createVehicle(String type, String engineType);
}
