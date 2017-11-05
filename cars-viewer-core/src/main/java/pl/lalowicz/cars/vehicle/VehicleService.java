package pl.lalowicz.cars.vehicle;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
public interface VehicleService {

    Vehicle create();

    Vehicle get(Long id);
}
