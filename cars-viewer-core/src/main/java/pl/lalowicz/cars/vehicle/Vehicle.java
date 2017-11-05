package pl.lalowicz.cars.vehicle;

/**
 * Created by radoslaw.lalowicz on 2017-11-04.
 */
public class Vehicle {
    private Long id;
    private String mark;
    private String model;
    private String vinNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    @Override
    public String toString() {
        return "ID: " + id.toString() + " Marka: " + mark + " Model: " + model + " Vin: " + vinNumber;
    }
}
