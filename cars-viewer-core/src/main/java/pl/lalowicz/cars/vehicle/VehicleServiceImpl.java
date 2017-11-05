package pl.lalowicz.cars.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
@Service("vehicleService")
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleDao vehicleDao;

    public Vehicle create() {
        return vehicleDao.create();
    }

    public Vehicle get(Long id) {
        return vehicleDao.get(id);
    }

}
