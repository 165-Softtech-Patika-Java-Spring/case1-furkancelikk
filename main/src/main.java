import enums.HouseType;
import resource.HouseResource;
import service.HouseService;
import service.MockDataService;

public class main {
    public static void main(String[] args) {
        MockDataService mockDataService = new MockDataService();
        HouseService houseService = new HouseService();

        HouseResource houseResource = mockDataService.createMockHouses();


        System.out.println("Total price of all houses: " + houseService.getTotalPriceOfHouses(houseResource, null).toString());
        System.out.println("Total price of apartments: " + houseService.getTotalPriceOfHouses(houseResource, HouseType.APARTMENT).toString());
        System.out.println("Total price of villas: " + houseService.getTotalPriceOfHouses(houseResource, HouseType.VILLA).toString());
        System.out.println("Total price of summeries: " + houseService.getTotalPriceOfHouses(houseResource, HouseType.SUMMERY).toString());


        System.out.println("Average of square meter of all houses: " + houseService.getAverageSqmOfHouses(houseResource, null).toString());
        System.out.println("Average of square meter of apartments: " + houseService.getAverageSqmOfHouses(houseResource, HouseType.APARTMENT).toString());
        System.out.println("Average of square meter of villas: " + houseService.getAverageSqmOfHouses(houseResource, HouseType.VILLA).toString());
        System.out.println("Average of square meter of summeries: " + houseService.getAverageSqmOfHouses(houseResource, HouseType.SUMMERY).toString());


        System.out.println("Houses by living rooms and other rooms: " + houseService.getHousesByRooms(houseResource, 1, 5));
    }
}
