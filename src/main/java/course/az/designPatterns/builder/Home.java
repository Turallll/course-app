package course.az.designPatterns.builder;

public class Home {

    private String city;
    private String town;
    private String street;

    private int buildYear;
    private int roomCount;
    private int balconyCount;
    private int bathRoomCount;

    private boolean hasPool;
    private boolean hasParking;


    public Home() {
    }

//    public Home(String city, String town, String street, int buildYear,
//                int roomCount, int balconyCount, int bathRoomCount, boolean hasPool, boolean hasParking) {
//        this.city = city;
//        this.town = town;
//        this.street = street;
//        this.buildYear = buildYear;
//        this.roomCount = roomCount;
//        this.balconyCount = balconyCount;
//        this.bathRoomCount = bathRoomCount;
//        this.hasPool = hasPool;
//        this.hasParking = hasParking;
//    }

    @Override
    public String toString() {
        return "Home{" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", street='" + street + '\'' +
                ", buildYear=" + buildYear +
                ", roomCount=" + roomCount +
                ", balconyCount=" + balconyCount +
                ", bathRoomCount=" + bathRoomCount +
                ", hasPool=" + hasPool +
                ", hasParking=" + hasParking +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public int getBathRoomCount() {
        return bathRoomCount;
    }

    public void setBathRoomCount(int bathRoomCount) {
        this.bathRoomCount = bathRoomCount;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean isHasParking() {
        return hasParking;
    }

    public void setHasParking(boolean hasParking) {
        this.hasParking = hasParking;
    }
}
