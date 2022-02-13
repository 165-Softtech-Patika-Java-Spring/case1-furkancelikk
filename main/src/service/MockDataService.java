package service;

import entity.House;
import entity.Room;
import enums.HouseType;
import enums.RoomType;
import resource.HouseResource;

import java.util.ArrayList;
import java.util.List;

public class MockDataService {

    public HouseResource createMockHouses(){
        HouseResource houseResource = new HouseResource();
        List<House> houseList = new ArrayList<>();
        houseList.addAll(createApartment());
        houseList.addAll(createVilla());
        houseList.addAll(createSummery());
        houseResource.setHouseList(houseList);
        return houseResource;
    }


    public List<House> createApartment(){
        List<House> houseList = new ArrayList<>();
        // Apartmen 1
        House apartment = new House();
        apartment.setPrice(250000d);
        apartment.setSquareMeter(105d);
        apartment.setNumberOfFloors(1);
        apartment.setType(HouseType.APARTMENT);
        List<Room> roomList = new ArrayList<>();
        Room room1 = new Room();
        room1.setType(RoomType.BATHROOM);
        roomList.add(room1);
        Room room2 = new Room();
        room2.setType(RoomType.BEDROOM);
        roomList.add(room2);
        Room room3 = new Room();
        room3.setType(RoomType.DININGROOM);
        roomList.add(room3);
        Room room4 = new Room();
        room4.setType(RoomType.KITCHEN);
        roomList.add(room4);
        Room room5 = new Room();
        room5.setType(RoomType.LIVINGROOM);
        roomList.add(room5);
        apartment.setRooms(roomList);

        houseList.add(apartment);

        // Apartmen 2
        House apartment2 = new House();
        apartment2.setPrice(400000d);
        apartment2.setSquareMeter(150d);
        apartment2.setNumberOfFloors(1);
        apartment2.setType(HouseType.APARTMENT);
        List<Room> roomList1 = new ArrayList<>();
        Room room6 = new Room();
        room6.setType(RoomType.BATHROOM);
        roomList1.add(room6);
        Room room7 = new Room();
        room7.setType(RoomType.BEDROOM);
        roomList1.add(room7);
        Room room8 = new Room();
        room8.setType(RoomType.DININGROOM);
        roomList1.add(room8);
        Room room9 = new Room();
        room9.setType(RoomType.KITCHEN);
        roomList1.add(room9);
        Room room10 = new Room();
        room10.setType(RoomType.LIVINGROOM);
        roomList1.add(room10);
        Room room11 = new Room();
        room11.setType(RoomType.BEDROOM);
        roomList1.add(room11);
        Room room12 = new Room();
        room12.setType(RoomType.BATHROOM);
        roomList1.add(room12);
        apartment2.setRooms(roomList1);
        houseList.add(apartment2);

        // Apartmen 3
        House apartment3 = new House();
        apartment3.setPrice(50000d);
        apartment3.setSquareMeter(165d);
        apartment3.setNumberOfFloors(2);
        apartment3.setType(HouseType.APARTMENT);
        List<Room> roomList2 = new ArrayList<>();
        Room room13 = new Room();
        room13.setType(RoomType.BATHROOM);
        roomList1.add(room13);
        Room room14 = new Room();
        room14.setType(RoomType.BEDROOM);
        roomList1.add(room14);
        Room room15 = new Room();
        room15.setType(RoomType.DININGROOM);
        roomList1.add(room15);
        Room room16 = new Room();
        room16.setType(RoomType.KITCHEN);
        roomList1.add(room16);
        Room room17 = new Room();
        room17.setType(RoomType.LIVINGROOM);
        roomList1.add(room17);
        Room room18 = new Room();
        room18.setType(RoomType.BEDROOM);
        roomList1.add(room18);
        Room room19 = new Room();
        room19.setType(RoomType.BATHROOM);
        roomList2.add(room19);
        Room room20 = new Room();
        room20.setType(RoomType.LIVINGROOM);
        roomList2.add(room20);
        apartment3.setRooms(roomList2);
        houseList.add(apartment3);

        return houseList;
    }

    private List<House> createVilla() {
        List<House> villaList = new ArrayList<>();

        // Villa 1
        House villa1 = new House();
        villa1.setPrice(700000d);
        villa1.setSquareMeter(200d);
        villa1.setNumberOfFloors(1);
        villa1.setType(HouseType.VILLA);

        List<Room> roomList1 = new ArrayList<>();
        Room room8 = new Room();
        room8.setType(RoomType.BATHROOM);
        roomList1.add(room8);
        Room room2 = new Room();
        room2.setType(RoomType.BEDROOM);
        roomList1.add(room2);
        Room room3 = new Room();
        room3.setType(RoomType.DININGROOM);
        roomList1.add(room3);
        Room room4 = new Room();
        room4.setType(RoomType.KITCHEN);
        roomList1.add(room4);
        Room room5 = new Room();
        room5.setType(RoomType.LIVINGROOM);
        roomList1.add(room5);
        Room room6 = new Room();
        room6.setType(RoomType.DININGROOM);
        roomList1.add(room6);
        Room room7 = new Room();
        room7.setType(RoomType.LIVINGROOM);
        roomList1.add(room7);

        villa1.setRooms(roomList1);

        villaList.add(villa1);

        // Villa 2
        House villa2 = new House();
        villa2.setPrice(1300000d);
        villa2.setSquareMeter(250d);
        villa2.setNumberOfFloors(2);
        villa2.setType(HouseType.VILLA);

        List<Room> roomList2 = new ArrayList<>();
        Room room1 = new Room();
        room1.setType(RoomType.BATHROOM);
        roomList2.add(room1);
        Room room9 = new Room();
        room9.setType(RoomType.BEDROOM);
        roomList2.add(room9);
        Room room10 = new Room();
        room10.setType(RoomType.DININGROOM);
        roomList2.add(room10);
        Room room11 = new Room();
        room11.setType(RoomType.KITCHEN);
        roomList2.add(room11);
        Room room12 = new Room();
        room12.setType(RoomType.LIVINGROOM);
        roomList2.add(room12);
        Room room13 = new Room();
        room13.setType(RoomType.DININGROOM);
        roomList2.add(room13);
        Room room14 = new Room();
        room14.setType(RoomType.LIVINGROOM);
        roomList2.add(room14);
        Room room15 = new Room();
        room15.setType(RoomType.BATHROOM);
        roomList2.add(room15);
        Room room16 = new Room();
        room16.setType(RoomType.BEDROOM);
        roomList2.add(room16);

        villa2.setRooms(roomList2);

        villaList.add(villa2);


        // Villa 3
        House villa3 = new House();
        villa3.setPrice(2000000d);
        villa3.setSquareMeter(300d);
        villa3.setNumberOfFloors(3);
        villa3.setType(HouseType.VILLA);

        List<Room> roomList3 = new ArrayList<>();
        Room room17 = new Room();
        room17.setType(RoomType.BATHROOM);
        roomList3.add(room17);
        Room room18 = new Room();
        room18.setType(RoomType.BATHROOM);
        roomList3.add(room18);

        Room room19 = new Room();
        room19.setType(RoomType.BEDROOM);
        roomList3.add(room19);
        Room room20 = new Room();
        room20.setType(RoomType.BEDROOM);
        roomList3.add(room20);
        Room room21 = new Room();
        room16.setType(RoomType.BEDROOM);
        roomList3.add(room21);

        Room room22 = new Room();
        room22.setType(RoomType.DININGROOM);
        roomList3.add(room22);
        Room room23 = new Room();
        room23.setType(RoomType.DININGROOM);
        roomList3.add(room23);

        Room room24 = new Room();
        room24.setType(RoomType.KITCHEN);
        roomList3.add(room24);
        Room room25 = new Room();
        room25.setType(RoomType.KITCHEN);
        roomList3.add(room25);

        Room room26 = new Room();
        room26.setType(RoomType.LIVINGROOM);
        roomList3.add(room26);
        Room room27 = new Room();
        room27.setType(RoomType.LIVINGROOM);
        roomList3.add(room27);
        Room room28 = new Room();
        room28.setType(RoomType.LIVINGROOM);
        roomList3.add(room28);



        villa3.setRooms(roomList3);

        villaList.add(villa3);

        return villaList;
    }

    private List<House> createSummery() {
        List<House> summeryList = new ArrayList<>();

        // Summery 1
        House summery1 = new House();
        summery1.setPrice(500000d);
        summery1.setSquareMeter(130d);
        summery1.setNumberOfFloors(1);
        summery1.setType(HouseType.SUMMERY);

        List<Room> roomList1 = new ArrayList<>();

        Room room1 = new Room();
        room1.setType(RoomType.BATHROOM);
        roomList1.add(room1);
        Room room2 = new Room();
        room2.setType(RoomType.BEDROOM);
        roomList1.add(room2);
        Room room3 = new Room();
        room3.setType(RoomType.KITCHEN);
        roomList1.add(room3);
        Room room4 = new Room();
        room4.setType(RoomType.LIVINGROOM);
        roomList1.add(room4);

        summery1.setRooms(roomList1);

        summeryList.add(summery1);

        // Summery 2
        House summery2 = new House();
        summery2.setPrice(900000d);
        summery2.setSquareMeter(180d);
        summery2.setNumberOfFloors(1);
        summery2.setType(HouseType.SUMMERY);


        List<Room> roomList2 = new ArrayList<>();

        Room room5 = new Room();
        room5.setType(RoomType.BATHROOM);
        roomList2.add(room5);
        Room room6 = new Room();
        room6.setType(RoomType.BEDROOM);
        roomList2.add(room6);
        Room room7 = new Room();
        room7.setType(RoomType.KITCHEN);
        roomList2.add(room7);
        Room room8 = new Room();
        room8.setType(RoomType.LIVINGROOM);
        roomList2.add(room8);
        Room room9 = new Room();
        room9.setType(RoomType.BEDROOM);
        roomList2.add(room9);
        Room room10 = new Room();
        room10.setType(RoomType.BATHROOM);
        roomList2.add(room10);

        summery2.setRooms(roomList2);

        summeryList.add(summery2);

        // Summery 3
        House summery3 = new House();
        summery3.setPrice(1600000d);
        summery3.setSquareMeter(285d);
        summery3.setNumberOfFloors(2);
        summery3.setType(HouseType.SUMMERY);

        List<Room> roomList3 = new ArrayList<>();

        Room room11 = new Room();
        room11.setType(RoomType.BATHROOM);
        roomList3.add(room11);
        Room room12 = new Room();
        room12.setType(RoomType.BATHROOM);
        roomList3.add(room12);

        Room room13 = new Room();
        room13.setType(RoomType.BEDROOM);
        roomList3.add(room13);
        Room room14 = new Room();
        room14.setType(RoomType.BEDROOM);
        roomList3.add(room14);

        Room room15 = new Room();
        room15.setType(RoomType.KITCHEN);
        roomList3.add(room15);

        Room room16 = new Room();
        room16.setType(RoomType.DININGROOM);
        roomList3.add(room16);

        Room room17 = new Room();
        room17.setType(RoomType.LIVINGROOM);
        roomList3.add(room17);
        Room room18 = new Room();
        room18.setType(RoomType.LIVINGROOM);
        roomList3.add(room18);



        summery3.setRooms(roomList3);

        summeryList.add(summery3);

        return summeryList;
    }

}
