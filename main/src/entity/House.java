package entity;

import enums.HouseType;

import java.util.ArrayList;
import java.util.List;

public class House {

    private Double price = 0d;

    private Double squareMeter = 0d;

    private List<Room> rooms = new ArrayList<>();

    private Integer numberOfFloors = 1;

    private HouseType type;

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(Double squareMeter) {
        this.squareMeter = squareMeter;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public HouseType getType() {
        return type;
    }

    public void setType(HouseType type) {
        this.type = type;
    }
}
