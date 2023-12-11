package course.az.designPatterns.builder;

public class HomeBuilder {

    private String city;
    private String town;
    private String street;

    private int buildYear;
    private int roomCount;
    private int balconyCount;
    private int bathRoomCount;

    private boolean hasPool;
    private boolean hasParking;


    public static HomeBuilder startBuild() {
        return new HomeBuilder();
    }

    public Home build() {
        Home home = new Home();
        home.setCity(city);
        home.setTown(town);
        home.setStreet(street);
        home.setBuildYear(buildYear);
        home.setRoomCount(roomCount);
        home.setBalconyCount(balconyCount);
        home.setBathRoomCount(bathRoomCount);
        home.setHasPool(hasPool);
        home.setHasParking(hasParking);
        return home;
    }

    public HomeBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public HomeBuilder setTown(String town) {
        this.town = town;
        return this;
    }

    public HomeBuilder setStreet(String street) {
        this.street = street;
        return this;
    }

    public HomeBuilder setBuildYear(int buildYear) {
        this.buildYear = buildYear;
        return this;
    }

    public HomeBuilder setRoomCount(int roomCount) {
        this.roomCount = roomCount;
        return this;
    }

    public HomeBuilder setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
        return this;
    }

    public HomeBuilder setBathRoomCount(int bathRoomCount) {
        this.bathRoomCount = bathRoomCount;
        return this;
    }

    public HomeBuilder setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
        return this;
    }

    public HomeBuilder setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
        return this;
    }
}
