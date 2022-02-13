package service;

import entity.House;
import entity.Room;
import enums.HouseType;
import enums.RoomType;
import resource.HouseResource;

import java.util.ArrayList;
import java.util.List;

public class HouseService {

    public Double getTotalPriceOfHouses(HouseResource houseResource, HouseType type){
        Double total = 0d;
        List<House> houseList = new ArrayList<>();
        houseList = houseResource.getHouseList();
        for (House house : houseList) {
            if (type == null){
                total += house.getPrice();
            }
            else{
                total += house.getType() == type ? house.getPrice() : 0d;
            }
        }
        return total;
    }

    public Double getAverageSqmOfHouses(HouseResource houseResource, HouseType type){
        Double averageOfSqm = 0d;
        Double totalSeq = 0d;
        Double count = 0d;

        List<House> houseList = new ArrayList<>();
        houseList = houseResource.getHouseList();
        for (House house : houseList) {
            if (type == null){
                totalSeq += house.getSquareMeter();
                count += 1d;
            }
            else{
                totalSeq += house.getType() == type ? house.getSquareMeter() : 0d;
                count += 1d;
            }
        }
        if (count != 0d)
            averageOfSqm = totalSeq / count;
        return averageOfSqm;
    }

    public int getHousesByRooms(HouseResource houseResource, Integer countOfLivingRooms, Integer counfOfRooms){
        List<House> houseList = new ArrayList<>();
        List<Room> roomList = new ArrayList<>();

        List<House> houses = houseResource.getHouseList();

        for (House house : houses) {
            Integer livingRooms = 0;
            Integer rooms = 0;
            roomList = house.getRooms();
            for (Room room : roomList) {
                if (room.getType() == RoomType.LIVINGROOM)
                    livingRooms++;
                else
                    rooms++;
            }
            if (livingRooms == countOfLivingRooms && counfOfRooms == rooms)
                houseList.add(house);
        }

        return houseList.size();
    }
}
