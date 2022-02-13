package resource;

import entity.House;

import java.util.ArrayList;
import java.util.List;

public class HouseResource {

    private List<House> houseList = new ArrayList<>();

    public List<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(List<House> houseList) {
        this.houseList = houseList;
    }
}
