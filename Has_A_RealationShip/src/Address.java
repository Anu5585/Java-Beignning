public class Address {

    private String house;

    private String street;

    private String sector;

    public Address(String house, String street, String sector) {
        this.house = house;
        this.street = street;
        this.sector = sector;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Address{" +
                "house='" + house + '\'' +
                ", street='" + street + '\'' +
                ", sector='" + sector + '\'' +
                '}';
    }
}
