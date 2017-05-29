/**
 * Created by Elizabeth on 29.05.2017.
 */
public class Flat {
    private int houseNumber;
    private String housingNumber;
    private int buildingNumber;
    private int apartmentNumber;
    private boolean service;

    public Flat(int house, int apartment) {
        this.houseNumber = house;
        this.apartmentNumber = apartment;
        service = false;
    }

    public Flat(int house, String housing, int apartment) {
        this.houseNumber = house;
        this.housingNumber = housing;
        this.apartmentNumber = apartment;
        service = false;
    }

    public Flat(int house, int building, int apartment) {
        this.houseNumber = house;
        this.buildingNumber = building;
        this.apartmentNumber = apartment;
        service = false;
    }

    public Flat(int house, String housing, int building, int apartment) {
        this.houseNumber = house;
        this.housingNumber = housing;
        this.buildingNumber = building;
        this.apartmentNumber = apartment;
        service = false;

    }

    public void print (){
        System.out.println("д."+ housingNumber + " " + "корп." + housingNumber +
                " " + "стр." + buildingNumber + " " + "кв." + apartmentNumber);
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public String getHousingNumber() {
        return housingNumber;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public boolean isService() {
        return service;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setHousingNumber(String housingNumber) {
        this.housingNumber = housingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public void setService(boolean service) {
        this.service = service;
    }
}
