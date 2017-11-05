package pl.lalowicz.cars.vehicle;

import org.springframework.stereotype.Repository;

/**
 * Created by radoslaw.lalowicz on 2017-11-05.
 */
@Repository("vehicleDao")
public class VehicleDao {

    Vehicle create() {
        return createVehicle();
    }

    Vehicle get(Long id) {
        return createVehicle();
    }

    private Vehicle createVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setId(1L);
        vehicle.setMark("Opel");
        vehicle.setModel("Corsa");
        vehicle.setVinNumber("123564-FV45A");
        return vehicle;
    }

}
